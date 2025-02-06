package com.tigana.EduManage.Controller;

import com.tigana.EduManage.DTO.ApiResponse;
import com.tigana.EduManage.DTO.DelDto;
import com.tigana.EduManage.DTO.PaginationAndSortingParams;
import com.tigana.EduManage.DTO.SchoolDto;
import com.tigana.EduManage.Enum.ApiMessage;
import com.tigana.EduManage.Models.School;
import com.tigana.EduManage.Service.GovService;
import com.tigana.EduManage.Service.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/schools")
@AllArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;


    @GetMapping()
    public ApiResponse<List<SchoolDto>> getAllSchools() {
        int govId = 84;


        List<SchoolDto> schools = schoolService.getAllSchools(govId);

        HttpHeaders headers = new HttpHeaders();

        return ApiResponse.<List<SchoolDto>>builder()
                .message(ApiMessage.success)
                .data(schools)
                .build();
    }

    @GetMapping("/pageable")
    public ResponseEntity<List<SchoolDto>> getPageableSchools( @ModelAttribute PaginationAndSortingParams paginationParams) {
        int govId = 84;

        Pageable pageable = paginationParams.toPageable();

        List<SchoolDto> schools = schoolService.getPageableSchools(govId, pageable);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Total-Count", String.valueOf(schools.size()));
        return ResponseEntity.ok()
                .headers(headers)
                .body(schools);
    }

    @GetMapping("/{schoolId}")
    public ResponseEntity<SchoolDto> getSchoolById(@PathVariable int schoolId) {
        int govId = 84;

        SchoolDto school= schoolService.getSchoolById(schoolId);
        return ResponseEntity.ok(school);

    }



}

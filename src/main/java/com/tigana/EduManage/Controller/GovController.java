package com.tigana.EduManage.Controller;


import com.tigana.EduManage.Models.Del;
import com.tigana.EduManage.Models.School;
import com.tigana.EduManage.Service.GovService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/")
public class GovController {

    private final GovService govService ;

    public GovController(GovService govService) {
        this.govService = govService;
    }


}


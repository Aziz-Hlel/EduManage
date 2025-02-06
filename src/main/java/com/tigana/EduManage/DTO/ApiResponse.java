package com.tigana.EduManage.DTO;

import com.tigana.EduManage.Enum.ApiMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {

    private ApiMessage message;
    private T data;

}

package com.example.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 사용
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {

    private String name;

    private int age;
}

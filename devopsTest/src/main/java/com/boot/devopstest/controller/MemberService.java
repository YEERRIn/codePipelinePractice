package com.boot.devopstest.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class MemberService {

    @GetMapping("/member")
    @Operation(summary = "회원조회") //API 메서드의 설명, 태그, 요청/응답 등을 정의하는 어노테이션
    public void get() {}

    @PostMapping("/member")
    @Operation (summary = "회원 가입")//API 메서드의 설명, 태그, 요청/응답 등을 정의하는 어노테이션
    public void register() {}

    @DeleteMapping("/member")
    @Operation(summary = "회원 삭제 ")
    public void delete() {}
}

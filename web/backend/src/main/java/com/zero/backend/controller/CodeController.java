package com.zero.backend.controller;

import com.zero.backend.entity.param.CodeParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/backend")
public class CodeController {

    @GetMapping("/code")
    public String getCodeDetail() {
        return "null";
    }

    @PostMapping("code")
    public String addCode(@RequestBody CodeParam codeParam) {
        return null;
    }

}

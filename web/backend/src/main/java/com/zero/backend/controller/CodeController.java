package com.zero.backend.controller;

import com.zero.backend.model.param.AddCodeParam;
import com.zero.backend.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @PostMapping("/code")
    public Integer addCode(AddCodeParam addCodeParam) {
        Integer result = codeService.addCode(addCodeParam);
        return result;
    }

}

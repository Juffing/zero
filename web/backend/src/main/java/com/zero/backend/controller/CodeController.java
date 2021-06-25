package com.zero.backend.controller;

import com.zero.backend.model.param.AddCodeParam;
import com.zero.backend.service.CodeService;
import com.zero.backend.utils.StringsUtils;
import com.zero.result.ZeroResult;
import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
@CrossOrigin
public class CodeController {

    @Autowired
    private CodeService codeService;

    @PostMapping("/code")
    public ZeroResult addCode(AddCodeParam addCodeParam) {
        if (StringsUtils.isEmpty(addCodeParam.getCode()) || StringsUtils.isEmpty(addCodeParam.getName())) {
            return ZeroResult.fail("参数错误");
        }
        Integer result = codeService.addCode(addCodeParam);
        return ZeroResult.success(result);
    }

}

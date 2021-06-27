package com.zero.backend.controller;

import com.zero.backend.model.param.AddCodeParam;
import com.zero.backend.service.CodeService;
import com.zero.backend.utils.StringsUtils;
import com.zero.result.ZeroResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/backend")
@CrossOrigin
public class CodeController {

    @Autowired
    private CodeService codeService;

    @PostMapping("/code")
    public ZeroResult addCode(@RequestBody AddCodeParam addCodeParam) {
        if (StringsUtils.isEmpty(addCodeParam.getCode()) || StringsUtils.isEmpty(addCodeParam.getName())) {
            return ZeroResult.fail("参数错误");
        }
        Integer result = codeService.addCode(addCodeParam);
        if (result == null) {
            return ZeroResult.fail("番号重复");
        }
        return ZeroResult.success(result);
    }

}

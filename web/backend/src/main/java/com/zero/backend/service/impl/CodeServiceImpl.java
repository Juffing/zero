package com.zero.backend.service.impl;

import com.zero.backend.entity.Code;
import com.zero.backend.mapper.CodeMapper;
import com.zero.backend.model.data.CodeData;
import com.zero.backend.model.param.AddCodeParam;
import com.zero.backend.model.param.UpdateCodeParam;
import com.zero.backend.service.CodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper codeMapper;

    /**
     * 添加番号
     * @param addCodeParam
     * @return
     */
    @Override
    public Integer addCode(AddCodeParam addCodeParam) {
        Code code = new Code();
        BeanUtils.copyProperties(addCodeParam, code);
        Integer result = codeMapper.addCode(code);
        return result;
    }

    /**
     * 修改番号
     * @param updateCodeParam
     * @return
     */
    @Override
    public Integer updateCode(UpdateCodeParam updateCodeParam) {
        Code code = new Code();
        BeanUtils.copyProperties(updateCodeParam, code);
        Integer result = codeMapper.updateCode(code);
        return result;
    }

    /**
     * 删除番号，逻辑删除
     * @param id
     * @return
     */
    @Override
    public Integer deleteCode(Integer id) {
        Integer result = codeMapper.deleteCode(id);
        return result;
    }

    /**
     * 查询番号详情
     * @param id
     * @return
     */
    @Override
    public Code selectCodeDetail(Integer id) {
        Code code = codeMapper.selectCodeDetail(id);
        return code;
    }

    /**
     * 查看番号列表
     * @param codeData
     * @return
     */
    @Override
    public List<Code> selectCodeList(CodeData codeData) {
        List<Code> codes = codeMapper.selectCodeList(codeData);
        return codes;
    }

}

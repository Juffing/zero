package com.zero.backend.service;

import com.zero.backend.entity.Code;
import com.zero.backend.model.data.CodeData;
import com.zero.backend.model.param.AddCodeParam;
import com.zero.backend.model.param.UpdateCodeParam;

import java.util.List;

public interface CodeService {

    /**
     * 添加番号
     * @param addCodeParam
     * @return
     */
    Integer addCode(AddCodeParam addCodeParam);

    /**
     * 修改番号
     * @param updateCodeParam
     * @return
     */
    Integer updateCode(UpdateCodeParam updateCodeParam);

    /**
     * 删除番号，逻辑删除
     * @param id
     * @return
     */
    Integer deleteCode(Integer id);

    /**
     * 查询番号详情
     * @param id
     * @return
     */
    Code selectCodeDetail(Integer id);

    /**
     * 查看番号列表
     * @param codeData
     * @return
     */
    List<Code> selectCodeList(CodeData codeData);

}

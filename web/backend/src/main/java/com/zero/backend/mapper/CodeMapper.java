package com.zero.backend.mapper;

import com.zero.backend.entity.Code;
import com.zero.backend.model.data.CodeData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CodeMapper {

    /**
     * 添加番号
     * @param code
     * @return
     */
    Integer addCode(Code code);

    /**
     * 修改番号
     * @param code
     * @return
     */
    Integer updateCode(Code code);

    /**
     * 删除番号
     * @param id
     * @return
     */
    Integer deleteCode(@Param("id") Integer id);

    /**
     * 查看番号细节
     * @param id
     * @return
     */
    Code selectCodeDetail(@Param("id") Integer id);

    /**
     * 查看番号列表
     * @param codeData
     * @return
     */
    List<Code> selectCodeList(CodeData codeData);

}

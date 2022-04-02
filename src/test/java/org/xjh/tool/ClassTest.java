package org.xjh.tool;

import org.xjh.tool.dto.ResultDTO;

public class ClassTest {

    public static void main(String[] args) {
        ResultDTO<String> resultDTO = ResultDTO.getSuccessResult("test");
        if (resultDTO.isSuccess()) {
            System.out.println(resultDTO);
        }
    }
}

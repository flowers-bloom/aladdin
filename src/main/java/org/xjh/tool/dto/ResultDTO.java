package org.xjh.tool.dto;

import org.xjh.tool.common.ErrorCode;

public class ResultDTO<T> extends BaseDTO {
    private String code;
    private Boolean success;
    private String errMsg;
    private T data;

    /**
     * 获取成功的返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultDTO<T> getSuccessResult(T data) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        resultDTO.success = true;
        resultDTO.code = ErrorCode.E_OK;
        resultDTO.data = data;
        return resultDTO;
    }

    /**
     * 获取失败的返回结果
     * @param code
     * @param errMsg
     * @return
     */
    public static ResultDTO getFailureResult(String code, String errMsg) {
        ResultDTO resultDTO = new ResultDTO<>();
        resultDTO.success = false;
        resultDTO.code = code;
        resultDTO.errMsg = errMsg;
        return resultDTO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

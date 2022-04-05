package org.xjh.tool.dto;

public class ResultDTO<T> extends BaseDTO {
    private Boolean success;
    private String errMsg;
    private T result;

    /**
     * 获取成功的返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultDTO<T> getSuccessResult(T data) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        resultDTO.success = true;
        resultDTO.result = data;
        return resultDTO;
    }

    /**
     * 获取失败的返回结果
     * @param errMsg
     * @return
     */
    public static ResultDTO getFailureResult(String errMsg) {
        ResultDTO resultDTO = new ResultDTO<>();
        resultDTO.success = false;
        resultDTO.errMsg = errMsg;
        return resultDTO;
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

package org.xjh.tool.vo;


import org.xjh.tool.common.ErrorCode;

public class AjaxResultVO<T> extends BaseVO {
    private String code;
    private Boolean success;
    private String errMsg;
    private T result;

    /**
     * 获取成功的返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AjaxResultVO<T> getSuccessResult(T data) {
        AjaxResultVO<T> resultVO = new AjaxResultVO<>();
        resultVO.success = true;
        resultVO.code = ErrorCode.E_OK;
        resultVO.result = data;
        return resultVO;
    }

    /**
     * 获取失败的返回结果
     * @param code
     * @param errMsg
     * @return
     */
    public static AjaxResultVO getFailureResult(String code, String errMsg) {
        AjaxResultVO resultVO = new AjaxResultVO<>();
        resultVO.success = false;
        resultVO.code = code;
        resultVO.errMsg = errMsg;
        return resultVO;
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

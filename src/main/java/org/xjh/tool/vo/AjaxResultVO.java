package org.xjh.tool.vo;


public class AjaxResultVO<T> extends BaseVO {
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
        resultVO.result = data;
        return resultVO;
    }

    /**
     * 获取失败的返回结果
     * @param errMsg
     * @return
     */
    public static AjaxResultVO getFailureResult(String errMsg) {
        AjaxResultVO resultVO = new AjaxResultVO<>();
        resultVO.success = false;
        resultVO.errMsg = errMsg;
        return resultVO;
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

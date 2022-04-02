package org.xjh.tool.vo;

import org.xjh.tool.code.ErrorCode;

import java.util.List;

public class AjaxPageResultVO<T> extends PageVO {
    private String code;
    private Boolean success;
    private String errMsg;
    private Integer total;
    private List<T> pageResult;

    /**
     * 获取成功的分页结果
     * @param pageResult
     * @param <T>
     * @return
     */
    public static <T> AjaxPageResultVO<T> getSuccessPageResult(List<T> pageResult) {
        AjaxPageResultVO<T> pageResultVO = new AjaxPageResultVO<>();
        pageResultVO.success = true;
        pageResultVO.code = ErrorCode.E_OK;
        pageResultVO.pageResult = pageResult;
        return pageResultVO;
    }

    /**
     * 获取失败的分页结果
     * @param code
     * @param errMsg
     * @return
     */
    public static AjaxPageResultVO getFailurePageResult(String code, String errMsg) {
        AjaxPageResultVO pageResultVO = new AjaxPageResultVO<>();
        pageResultVO.success = false;
        pageResultVO.code = code;
        pageResultVO.errMsg = errMsg;
        return pageResultVO;
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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getPageResult() {
        return pageResult;
    }

    public void setPageResult(List<T> pageResult) {
        this.pageResult = pageResult;
    }
}

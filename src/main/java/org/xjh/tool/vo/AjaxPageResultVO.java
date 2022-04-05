package org.xjh.tool.vo;

import java.util.List;

public class AjaxPageResultVO<T> extends PageVO {
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
        pageResultVO.pageResult = pageResult;
        return pageResultVO;
    }

    /**
     * 获取失败的分页结果
     * @param errMsg
     * @return
     */
    public static AjaxPageResultVO getFailurePageResult(String errMsg) {
        AjaxPageResultVO pageResultVO = new AjaxPageResultVO<>();
        pageResultVO.success = false;
        pageResultVO.errMsg = errMsg;
        return pageResultVO;
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

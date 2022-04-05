package org.xjh.tool.dto;

import java.util.List;

public class PageResultDTO<T> extends PageDTO {
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
    public static <T> PageResultDTO<T> getSuccessPageResult(List<T> pageResult) {
        PageResultDTO<T> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.success = true;
        pageResultDTO.pageResult = pageResult;
        return pageResultDTO;
    }

    /**
     * 获取失败的分页结果
     * @param errMsg
     * @return
     */
    public static PageResultDTO getFailurePageResult(String errMsg) {
        PageResultDTO pageResultDTO = new PageResultDTO<>();
        pageResultDTO.success = false;
        pageResultDTO.errMsg = errMsg;
        return pageResultDTO;
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

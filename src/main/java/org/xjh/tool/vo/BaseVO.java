package org.xjh.tool.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BaseVO {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

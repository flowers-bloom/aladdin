package org.xjh.tool.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BaseDTO {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

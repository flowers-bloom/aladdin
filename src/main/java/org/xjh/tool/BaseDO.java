package org.xjh.tool;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class BaseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

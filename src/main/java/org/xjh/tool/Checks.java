package org.xjh.tool;

import java.util.Collection;
import java.util.Map;

/**
 * 参数校验工具
 * 空的定义：对象为 null | 空字符串 | 空 Collection | 空 Map
 * 注意，Collection 不包括基础类型集合，比如 int[], String[] 等，
 * 即只要基础类型集合不为 null，就不认为是空
 */
public class Checks {

    /**
     * 判断多个对象是否为空
     * @param objList
     * @return
     */
    public static Boolean isAnyEmpty(Object... objList) {
        for (Object obj : objList) {
            if (Checks.isEmpty(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断对象是否为空
     * @param obj
     * @return
     */
    public static Boolean isEmpty(Object obj) {
        if (obj instanceof String) {
            return isEmpty((String)obj);
        }else if (obj instanceof Collection) {
            return isEmpty((Collection) obj);
        }else if (obj instanceof Map) {
            return isEmpty((Map) obj);
        }else {
            return obj == null;
        }
    }

    private static Boolean isEmpty(String obj) {
        return obj == null || "".equals(obj);
    }

    private static Boolean isEmpty(Collection obj) {
        return obj == null || obj.isEmpty();
    }

    private static Boolean isEmpty(Map obj) {
        return obj == null || obj.isEmpty();
    }
}

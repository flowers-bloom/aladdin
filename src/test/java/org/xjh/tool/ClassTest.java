package org.xjh.tool;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ClassTest {

    @Test
    public void testChecks() {
        //obj
        assertEquals(Checks.isEmpty(null), true);
        assertEquals(Checks.isEmpty(new Object()), false);

        //string
        assertEquals(Checks.isEmpty("12"), false);
        assertEquals(Checks.isEmpty(""), true);

        //collection
        List<Integer> o1 = new ArrayList<>();
        Set<Integer> o2 = new HashSet<>();
        assertEquals(Checks.isEmpty(o1), true);
        assertEquals(Checks.isEmpty(o2), true);
        o1.add(1);
        o2.add(2);
        assertEquals(Checks.isAnyEmpty(o1, o2), false);

        //map
        Map<Integer, Integer> o3 = new HashMap<>();
        assertEquals(Checks.isEmpty(o3), true);
        o3.put(1, 1);
        assertEquals(Checks.isEmpty(o3), false);

        //others
        assertEquals(Checks.isAnyEmpty(1, 'c', 1.2, 0.0, new int[0], new String[0]), false);
    }
}

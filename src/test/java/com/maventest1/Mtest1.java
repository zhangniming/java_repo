package com.maventest1;

import com.maventest.M;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Mtest1 {
    @Test
    public void testAdd() {
        M m = new M();
        assertEquals(5,m.addNum(2, 3));
    }
}

package com.grayen.encryption.cesar.keyword.hack.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HackUtilsTest {

    @Test
    public void shouldGetKeyByValue() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("g", "c");

        Assert.assertEquals("a", HackUtils.getKeyByValue(map, "b"));
    }
}
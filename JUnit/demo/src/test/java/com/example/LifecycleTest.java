package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LifecycleTest {

    private List<String> testList;

    @Before
    public void setUp() {
        System.out.println("Running @Before setup...");
        testList = new ArrayList<>();
        testList.add("Base Item");
    }

    @After
    public void tearDown() {
        System.out.println("Running @After teardown...");
        testList.clear();
        testList = null; 
    }

    @Test
    public void testAddItem() {
        String newItem = "Second Item";
        int expectedSize = 2;
        testList.add(newItem);
        assertEquals(expectedSize, testList.size());
        assertTrue(testList.contains(newItem));
    }

    @Test
    public void testRemoveItem() {
        String itemToRemove = "Base Item";
        int expectedSize = 0;
        testList.remove(itemToRemove);
        assertEquals(expectedSize, testList.size());
    }
}
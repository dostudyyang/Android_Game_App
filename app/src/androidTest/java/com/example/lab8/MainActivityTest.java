package com.example.lab8;

import junit.framework.TestCase;

public class MainActivityTest extends TestCase {

    public void testOnCreate() {
        MainActivity main = new MainActivity();
        main.onCreate(null);
    }

    public void testOnDone() {
        MainActivity main = new MainActivity();
        main.onDone(null);
    }
}
package com.example.lab8;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;


public class GameTest extends TestCase {

    @Test
    public void testQa() {
        Game game = new Game();
        game.qa();
    }

    @Test
    public void testQaOutput(){
        Game game = new Game();
        assertNotNull(game.qa());

    }

    @Test
    public void testQaDiffence(){
        Game game = new Game();
        String a = game.qa();
        String b = game.qa();
        assertNotSame("should be not same",a,b);
    }
}
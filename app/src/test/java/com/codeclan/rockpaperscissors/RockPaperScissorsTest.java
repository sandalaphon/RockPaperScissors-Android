package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RockPaperScissorsTest {

   RockPaperScissors myGame;

    @Before
    public void before(){
        myGame = new RockPaperScissors();
    }

    @Test
    public void testRockPaper(){
        assertEquals("It's a draw", myGame.winOrLose(EnumThing.SCISSORS));
    }





}
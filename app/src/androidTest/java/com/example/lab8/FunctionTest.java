package com.example.lab8;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void Correct_Score_increment(){
      MainActivity main = new MainActivity();
      main.onDone(null);
    }

    @Test
    public void Wrong_Score_Stay(){

    }
}

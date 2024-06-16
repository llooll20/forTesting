package com.example;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.App.IAdder;
import com.example.App.IFlipper;
import com.example.App.ISubtractor;
import com.example.App.Subtractor;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static ISubtractor subtractor;
    @BeforeAll
    public static void setUp(){
        IAdder adder = Mockito.mock(IAdder.class);
        IFlipper flipper = Mockito.mock(IFlipper.class);

        Mockito.when(flipper.flip(5)).thenReturn(-5);
        Mockito.when(adder.add(3, -5)).thenReturn(-2);
        subtractor = new Subtractor(adder, flipper);

    }
    @Test
    public void SubtractTest()
    {
        Assertions.fail();
        Assertions.assertEquals(-2, subtractor.subtract(3,5));
    }
}

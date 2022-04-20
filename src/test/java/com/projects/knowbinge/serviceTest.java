package com.projects.knowbinge;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.projects.knowbinge.Exceptions.MyException;
import com.projects.knowbinge.Services.bingeFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class serviceTest {

    //Binge Factory
    private bingeFactory factory;

    //Set up before each test
    @BeforeEach
    void setUp()
    {
        factory = new bingeFactory();
    } 

    //Test for invalid names
    @Test
    @DisplayName("Test for invalid name")
    void testInvalidName()
    {
        String name = null;
        assertThrows(MyException.class, 
                      () -> {factory.isValidName(name); } );
    }
    //Test for inValid Response
    @Test
    @DisplayName("Test for invalid Response")
    void testInvalidResponse()
    {
        String response = "NotNull";
        assertThrows(MyException.class, 
                      () -> {factory.isValidResponse(response); } );               
    }
    
}

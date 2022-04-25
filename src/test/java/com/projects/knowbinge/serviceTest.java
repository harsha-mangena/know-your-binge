package com.projects.knowbinge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.projects.knowbinge.Exceptions.MyException;
import com.projects.knowbinge.Services.bingeFactory;
import com.projects.knowbinge.Services.getBingeService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class serviceTest {

    //Factory
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

    //Test for the bingeFactory
    @Test
    @DisplayName("Test for BingeFactory")
    void testBingeFactory() throws JsonParseException, JsonMappingException, Exception
    {
        //creating mock for factory
        bingeFactory factoryMock = mock(bingeFactory.class);
        factoryMock.getService();
        //verifying if the getService method was called or not
        verify(factoryMock, times(1)).getService();
    }
    
}

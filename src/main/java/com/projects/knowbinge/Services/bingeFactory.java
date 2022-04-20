package com.projects.knowbinge.Services;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class bingeFactory extends getBingeService{
    public bingeFactory(String name)
    {
        super(name);
    }
    public String getService() throws JsonParseException, JsonMappingException, Exception
    {
        return getDetails();
    }
}
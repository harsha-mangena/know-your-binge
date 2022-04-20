package com.projects.knowbinge.Services;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface IgetBingeService {
    //Checking if the response is Valid or Not
    public boolean isValidResponse(String response) throws Exception;
    //For Serialization & De-Serialization of JSON -> Java , vice versa
    public String getDetails() throws JsonParseException, JsonMappingException, IOException, Exception;

}
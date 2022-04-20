package com.projects.knowbinge.Services;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projects.knowbinge.DTO.Details;
import com.projects.knowbinge.Exceptions.MyException;
import com.projects.knowbinge.enums.commonEnum;

import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class getBingeService implements IgetBingeService{
    //Class Variables
    protected final String id = "e2690d41"; 
    protected String name;
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;

    //Constructor
    public getBingeService(String name)
    {
        this.name = name;
    } 
    //Rest Mapper
    private RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
    //Object Mapper
    private ObjectMapper getObjectMapper()
    {
        return new ObjectMapper();
    }
    //Creating URL with the name
    private String getUrl()
    {
        return "https://www.omdbapi.com/?apikey="+id+"&t="+name;
    }

    //Checking the length of String
    public boolean isValidName(String name) throws Exception
    {
        if(name == null || name.length() == 0)
        {
            throw new MyException("Error : Name can't be empty!");
        }
        return name.length() >= 1;
    }
    //Parsing into Java Objects
    @Override
    public String getDetails() throws JsonParseException, JsonMappingException, Exception {
        //validating String 
        isValidName(name);
        //JSON - Java Object Parsing
        //URL   
        String url = getUrl();

        //Rest Object 
        restTemplate = getRestTemplate();

        //Object Mapper 
        objectMapper = getObjectMapper();

        //Parsing to String initially 
        String result = restTemplate.getForObject(url, String.class);

        //Parsing the resulted String to POJO Class
        Details currentBinge = objectMapper.readValue(result,Details.class);
        
        //Validating Response after parsing
        String response = currentBinge.getResponse();
        if(! isValidResponse(response))
        {
            throw new MyException("No result found, Please check your Binge Name");
        }

        //Checking Type i.e Movies or Series
        String type = currentBinge.getType();
        if(commonEnum.valueOf(type) == commonEnum.movie)
        {
            return currentBinge.getMovie();
        }
        else if(commonEnum.valueOf(type) == commonEnum.series)
        {
            return currentBinge.getSeries();
        }

        return " ";

    }
    @Override
    public boolean isValidResponse(String response) throws Exception {
        if(response.equals("True"))
        {
            return true; 
        }
        else if(response.equals("False"))
        {
            return false;
        }
        throw new MyException("The response is invalid, Please check your Binge name");
    }
    
}
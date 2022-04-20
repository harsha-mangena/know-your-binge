package com.projects.knowbinge;
import com.projects.knowbinge.Exceptions.MyException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class inputParser {
    List<String> movies_list = new ArrayList<>();
    protected String file;
    public inputParser(String file)
    {
        this.file = file;
    }
    public List<String> inputFile() throws MyException, IOException
    {
        //Buffered Reader for reading file
        BufferedReader reader = null;
        try{
            String movie = null;
            reader = new BufferedReader(new FileReader(file));
            while ((movie = reader.readLine())!=null)
            {
                movies_list.add(movie);
            }
        }catch(Exception e)
        {
            throw new MyException("File Not Found");
        }
        reader.close();
        return movies_list;
    }
    
}
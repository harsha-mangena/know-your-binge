package com.projects.knowbinge;

import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.projects.knowbinge.Exceptions.MyException;
import com.projects.knowbinge.Services.bingeFactory;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//Scanner getter 
	public static Scanner getScanner()
	{
		return new Scanner(System.in);
	}


	public static void main(String[] args) throws JsonParseException, JsonMappingException, Exception {
		//SpringApplication.run(Application.class, args);
		//List of movies through Input
		inputParser readInput = new inputParser("src/main/resources/input.txt");
		List<String> movies_input = readInput.inputFile();

		//Itearting through the Input file movie names
		for(String movie : movies_input)
		{
			try
			{
				
				bingeFactory factory = new bingeFactory(movie);
				System.out.println(factory.getDetails());
			}
			catch(Exception e)
			{
				throw new MyException("Error : Please check the Input File");
			}
		}

	}

}

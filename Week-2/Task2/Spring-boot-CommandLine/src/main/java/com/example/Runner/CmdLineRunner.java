package com.example.Runner;

//import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Commad Line Runner");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
		System.out.println("End of Command Line Runner");
	}
	
}

package com.getset.demo;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyRunnerOne implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyRunnerOne starts..");
		System.out.println("nonoptionargs====="+args.getNonOptionArgs());
		System.out.println("option names="+args.getOptionNames());
		System.out.println("value of name="+args.getOptionValues("name"));
		System.out.println("sourceargs="+Arrays.asList(args.getSourceArgs()));
		System.out.println("contains sirname="+args.containsOption("sirname"));

	}

}

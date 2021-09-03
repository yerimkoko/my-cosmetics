package com.example.mycosmetics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyCosmeticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCosmeticsApplication.class, args);

		List<String> a = new ArrayList<>();
		a.add("AA9");
		int transNum = Integer.parseInt("AA9", 10);
		System.out.println(transNum);

	}


}

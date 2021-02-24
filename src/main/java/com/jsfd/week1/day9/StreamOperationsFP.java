package com.jsfd.week1.day9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsFP {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println("Number List:");
		numbers.stream()
			.distinct() 
			.sorted() 
			.forEach(System.out::println); 
        

		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number) 
				.collect(Collectors.toList()); 
        System.out.println("\nSquared Numbers:\n"+squaredNumbers);

		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x % 2 == 0) 
				.collect(Collectors.toList());
        System.out.println("\nEven Numbers:\n"+evenNumbersOnly);

		// long sum = numbers.stream()
		// 		.reduce(0, (x,y) -> x*x + y*y); 
        // System.out.println("\nSum of the List:\n"+sum);

		int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
        System.out.println("\nGreatest No.:\n"+greatest);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        System.out.println("\nCourse List:\n"+courses);
		List<String> coursesSorted = courses.stream()
				.sorted(Comparator.comparing(str -> str.length()))
				.collect(Collectors.toList());
        System.out.println("\nCourse Sorted List:\n"+coursesSorted);
	}
}

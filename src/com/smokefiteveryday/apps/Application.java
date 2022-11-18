package SmokeFitEveryday.src.com.smokefiteveryday.apps;

import java.util.Scanner;

import SmokeFitEveryday.src.com.smokefiteveryday.apps.entity.User;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		String name = scan.next();
		String surname = scan.next();
		int sex = scan.nextInt();
		float weight = scan.nextFloat();
		float height = scan.nextFloat();
		
		User user = new User(id,name,surname,sex,weight,height);
		
	
		System.out.println("ID: " + user.getId() + " NAME: " + user.getName());
		
		
		

	}

}

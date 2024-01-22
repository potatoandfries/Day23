package Day23.Day23workshop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Day23.Day23workshop.repo.OrderRepo;

@SpringBootApplication
public class Day23WorkshopApplication implements CommandLineRunner{

	@Autowired
	OrderRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Day23WorkshopApplication.class, args);
	}

	@Override
	public void run(String...args){
		System.out.println("hello");
		System.out.println(repo.getOrderByID(1));
	}
}

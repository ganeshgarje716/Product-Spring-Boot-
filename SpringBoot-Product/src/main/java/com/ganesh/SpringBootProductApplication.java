package com.ganesh;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ganesh.entity.Product;
import com.ganesh.repository.ProductRepository;

@SpringBootApplication
public class SpringBootProductApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductApplication.class, args);
	}
	
	
	@Autowired
	ProductRepository PR;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		
		//1
		
//		Product p=new Product("Laptop", "Dell", 20, 70000.00, true);
//		
//		PR.save(p);
		
		
		
		//2
		
//		List<Product> products = List.of(
//
//			    new Product("Pen", "Cello", 100, 10.0, true),
//			    new Product("Pencil", "Natraj", 120, 5.0, true),
//			    new Product("Eraser", "Apsara", 80, 3.0, true),
//			    new Product("Sharpener", "Camlin", 60, 5.0, true),
//			    new Product("Notebook", "Classmate", 50, 40.0, true),
//
//			    new Product("Bag", "Skybags", 25, 1200.0, true),
//			    new Product("Bottle", "Milton", 40, 300.0, true),
//			    new Product("LunchBox", "Milton", 35, 500.0, true),
//			    new Product("Scale", "Camlin", 70, 15.0, true),
//			    new Product("Marker", "Luxor", 45, 30.0, true),
//
//			    new Product("Chair", "Nilkamal", 20, 1500.0, true),
//			    new Product("Table", "Nilkamal", 15, 3500.0, true),
//			    new Product("Fan", "Bajaj", 18, 2200.0, true),
//			    new Product("Cooler", "Symphony", 10, 8000.0, true),
//			    new Product("AC", "LG", 8, 35000.0, true),
//
//			    new Product("TV", "Sony", 12, 45000.0, true),
//			    new Product("Fridge", "Samsung", 10, 30000.0, true),
//			    new Product("WashingMachine", "IFB", 8, 25000.0, true),
//			    new Product("Mixer", "Prestige", 20, 3000.0, true),
//			    new Product("Oven", "LG", 7, 12000.0, true),
//
//			    new Product("Mobile", "Samsung", 25, 20000.0, true),
//			    new Product("Tablet", "Apple", 10, 50000.0, true),
//			    new Product("Watch", "Noise", 30, 2500.0, true),
//			    new Product("Earbuds", "Boat", 40, 1500.0, true),
//
//			    new Product("Speaker", "JBL", 18, 4000.0, true),
//			    new Product("Keyboard", "Logitech", 22, 1200.0, true),
//			    new Product("Mouse", "HP", 25, 700.0, true),
//			    new Product("Monitor", "LG", 12, 14000.0, true),
//			    new Product("Printer", "Canon", 8, 9000.0, true),
//
//			    new Product("Camera", "Nikon", 5, 55000.0, true),
//			    new Product("Router", "TP-Link", 14, 2500.0, true),
//			    new Product("SSD", "Kingston", 20, 4500.0, true),
//			    new Product("HDD", "Seagate", 18, 4000.0, true),
//			    new Product("Pendrive", "SanDisk", 50, 600.0, true),
//
//			    new Product("Projector", "BenQ", 4, 40000.0, true),
//			    new Product("Scanner", "Epson", 6, 7000.0, true),
//			    new Product("Mic", "Sony", 15, 2500.0, true),
//			    new Product("Tripod", "Digitek", 12, 1800.0, true),
//			    new Product("Drone", "DJI", 3, 80000.0, true),
//
//			    new Product("Helmet", "Studds", 20, 1200.0, true),
//			    new Product("Shoes", "Puma", 30, 2500.0, true),
//			    new Product("Tshirt", "Nike", 40, 1000.0, true),
//			    new Product("Jeans", "Levis", 25, 2000.0, true),
//			    new Product("Jacket", "Woodland", 15, 3500.0, true),
//
//			    new Product("Sofa", "HomeTown", 5, 25000.0, true),
//			    new Product("Bed", "Wakefit", 6, 18000.0, true),
//			    new Product("Cupboard", "Godrej", 4, 22000.0, true),
//			    new Product("Mirror", "Local", 10, 1500.0, true),
//			    new Product("Clock", "Ajanta", 20, 500.0, true)
//			);
//
//			PR.saveAll(products);
			
			
			
			//3
			
//			System.out.println(PR.count());
		
		
		
		//4
		
//		System.err.println(PR.findById(60).get());
		
		
		
		//5
		
//		PR.findAllById(Arrays.asList(27,30,40,50,60,70,54)).forEach(i->System.err.println(i));
		
		
		
		//6
		
//		PR.findAll().forEach(i->System.err.println(i));
		
		
		
		
		//7
		
//		System.err.println(PR.existsById(30));
		
		
		
		//8
		
//        Product p = PR.findById(1).get();
//
//		p.setType("HP");
//		p.setPrice(80000.00);
//
//		PR.save(p);
		
		
		
		
		//9
		
//		PR.deleteById(61);
		
		
		
		//10
		
//		PR.deleteAllById(Arrays.asList(30,45,55,53));
		
		
		
		
		//11
		
//		PR.deleteAll();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

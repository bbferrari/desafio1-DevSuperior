package com.desafio1.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio1.desafio.Entities.Order;
import com.desafio1.desafio.Services.OrderService;


@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
	
    @Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		double valor, desconto;
		System.out.println("codigo do pedido: ");
		codigo = sc.nextInt();
		System.out.println("valor do pedido: ");
		valor = sc.nextDouble();
		System.out.println("desconto do pedido: ");
		desconto = sc.nextDouble();
		
		Order order = new Order(codigo, valor, desconto);
		
		System.out.println("Codigo: " + order.getCode() + " Valor Total: "  + orderService.total(order));
		
	}
}
		
		


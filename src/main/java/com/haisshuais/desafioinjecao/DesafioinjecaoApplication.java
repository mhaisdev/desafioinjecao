package com.haisshuais.desafioinjecao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.haisshuais.desafioinjecao.entities.Order;
import com.haisshuais.desafioinjecao.services.OrderService;

@SpringBootApplication
public class DesafioinjecaoApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioinjecaoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order1));
		System.out.println();
		
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order2));
		System.out.println();
		
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order3));
		System.out.println();
	}

}

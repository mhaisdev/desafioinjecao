package com.haisshuais.desafioinjecao.services;

import org.springframework.stereotype.Service;

import com.haisshuais.desafioinjecao.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		double shipping;
		
		if (order.getBasic() < 100) 
			shipping = 20.0;
		else if (order.getBasic() >= 100 && order.getBasic() <= 200)
			shipping = 12.0;
		else
			shipping = 0.0;
		
		return shipping;
	}
}

package com.desafio1.desafio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio1.desafio.Entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		Double total = ( order.getBasic()- ( order.getBasic() * (order.getDiscount()/100) ) + (shippingService.shipment(order)));	
		return total;
	}

}

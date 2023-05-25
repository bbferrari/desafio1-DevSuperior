package com.desafio1.desafio.Services;

import org.springframework.stereotype.Service;

import com.desafio1.desafio.Entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() >= 100.0 & order.getBasic() < 200.0) {
            return 12.0;
        }
        return 0.0;
    }
	

}

package org.restaurant.order.repository;

import org.restaurant.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order , Integer> {
}

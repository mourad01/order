package org.restaurant.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.restaurant.order.dto.OrderDTO;
import org.restaurant.order.entity.Order;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}

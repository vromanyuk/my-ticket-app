package ticket.mapper.impl;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import ticket.dto.response.OrderResponseDto;
import ticket.mapper.ResponseDtoMapper;
import ticket.model.Order;
import ticket.model.Ticket;

@Component
public class OrderMapper implements ResponseDtoMapper<OrderResponseDto, Order> {
    @Override
    public OrderResponseDto mapToDto(Order order) {
        OrderResponseDto responseDto = new OrderResponseDto();
        responseDto.setId(order.getId());
        responseDto.setUserId(order.getUser().getId());
        responseDto.setOrderTime(order.getOrderTime());
        responseDto.setTicketIds(order.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}

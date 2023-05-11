package ticket.mapper.impl;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import ticket.dto.response.ShoppingCartResponseDto;
import ticket.mapper.ResponseDtoMapper;
import ticket.model.ShoppingCart;
import ticket.model.Ticket;

@Component
public class ShoppingCartMapper implements
        ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart> {

    @Override
    public ShoppingCartResponseDto mapToDto(ShoppingCart shoppingCart) {
        ShoppingCartResponseDto responseDto = new ShoppingCartResponseDto();
        responseDto.setUserId(shoppingCart.getUser().getId());
        responseDto.setTicketIds(shoppingCart.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}

package ticket.service;

import java.util.List;
import ticket.model.Order;
import ticket.model.ShoppingCart;
import ticket.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

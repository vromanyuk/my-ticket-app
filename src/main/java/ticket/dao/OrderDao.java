package ticket.dao;

import java.util.List;
import ticket.model.Order;
import ticket.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}

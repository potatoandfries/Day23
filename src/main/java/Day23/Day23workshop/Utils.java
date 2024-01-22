package Day23.Day23workshop;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import Day23.Day23workshop.model.Order;

public class Utils {
    
    public static Order toOrder(SqlRowSet rs){

        Order o = new Order();
        o.setOrder_id(rs.getInt("order_id"));
        o.setOrder_date(rs.getDate("order_date"));
        o.setCustomer_Id(rs.getInt("customer_id"));
        o.setOrderTotal(rs.getFloat("order_total"));
        o.setOrderCost(rs.getFloat("total_cost"));
        return o;
    }
}

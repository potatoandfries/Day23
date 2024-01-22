package Day23.Day23workshop.repo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import Day23.Day23workshop.Utils;
import Day23.Day23workshop.model.Order;

@Repository
public class OrderRepo {

    @Autowired
    private JdbcTemplate template; 

    public Order getOrderByID(int orderId){

        SqlRowSet rs = template.queryForRowSet(Queries.SQL_GET_ORDER_BY_ID,orderId);
        while (rs.next()){
            return Utils.toOrder(rs);
        }
        return null;// if return null if no match is found.
    }
}   

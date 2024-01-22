package Day23.Day23workshop.repo;

public class Queries {
    //This is the corrected one*
    public static final String SQL_GET_ORDER_BY_ID = """
        SELECT DISTINCT
            order_id,
            order_date,  
            customer_id,  
            SUM(product_total) OVER (PARTITION BY order_id) AS order_total, 
            SUM(cost) OVER (PARTITION BY order_id) AS total_cost  
        FROM (
            SELECT
                o.order_id,  
                o.order_date,
                o.customer_id,
                d.quantity * d.unit_price * (1 - d.discount) AS product_total,
                d.quantity * p.standard_cost AS cost
            FROM 
                orders o
                JOIN order_details d ON o.order_id = d.order_id 
                JOIN products p ON d.order_id = p.order_id
        ) AS t
        WHERE order_id = ?;

    """;
    

}

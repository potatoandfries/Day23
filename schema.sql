DROP SCHEMA IF EXISTS mart;
CREATE SCHEMA IF NOT EXISTS mart;
USE mart;

CREATE TABLE IF NOT EXISTS orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    order_date DATE DEFAULT (current_date),
    customer_Id INT,
    ship_address VARCHAR(128) NOT NULL
);

CREATE TABLE IF NOT EXISTS order_details (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    product_name VARCHAR(64) NOT NULL,
    quantity INT NOT NULL,
    unit_price FLOAT NOT NULL,
    standard_cost float not null,
    discount DECIMAL(3,2) DEFAULT 0.00,
    CONSTRAINT fk_o_id FOREIGN KEY (order_id) REFERENCES orders(order_id)
);

CREATE TABLE IF NOT EXISTs products(
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    quantity int not null,
    standard_cost float not null,
    CONSTRAINT fk_p_id FOREIGN KEY (order_id) REFERENCES orders(order_id)

);

GRANT ALL PRIVILEGES ON mart.* TO 'fred'@'%';
FLUSH PRIVILEGES;
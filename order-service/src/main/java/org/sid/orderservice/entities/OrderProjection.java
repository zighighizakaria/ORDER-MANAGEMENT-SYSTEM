package org.sid.orderservice.entities;
import org.sid.orderservice.enums.OrderStatus;
import org.springframework.data.rest.core.config.Projection;
import java.util.Date;
@Projection(name="fullOrder",types = Order.class)
public interface OrderProjection {
    public Long getId();
    public Date getCreatedAT();
    public Long getCustomerId();
    public OrderStatus getStatus();
}
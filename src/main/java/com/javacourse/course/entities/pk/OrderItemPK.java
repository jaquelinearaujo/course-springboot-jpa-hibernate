package com.javacourse.course.entities.pk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.javacourse.course.entities.Order;
import com.javacourse.course.entities.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class OrderItemPK implements Serializable {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

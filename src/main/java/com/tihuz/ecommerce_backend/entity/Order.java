package com.tihuz.ecommerce_backend.entity;

import com.tihuz.ecommerce_backend.base.BaseEntity;
import com.tihuz.ecommerce_backend.enums.OrderStatus;
import com.tihuz.ecommerce_backend.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String userId;

    String recipientName;
    String recipientPhone;
    String shippingAddress;

    @Enumerated(EnumType.STRING)
    PaymentMethod paymentMethod;

    BigDecimal totalPrice;

    @Enumerated( EnumType.STRING)
    OrderStatus status;

    @OneToMany(mappedBy = "order",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    List<OrderItem> items= new ArrayList<>();
}

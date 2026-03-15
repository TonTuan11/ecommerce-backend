package com.tihuz.ecommerce_backend.dto.response;

import com.tihuz.ecommerce_backend.enums.PaymentMethod;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponse {

     Long id;
     String userId;
    String recipientName;
    String recipientPhone;
    String shippingAddress;
    String paymentMethod;
    BigDecimal totalPrice;
     String status;
     List<OrderItemResponse> items;
}
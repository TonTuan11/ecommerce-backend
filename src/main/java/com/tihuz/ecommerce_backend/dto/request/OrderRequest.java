package com.tihuz.ecommerce_backend.dto.request;

import com.tihuz.ecommerce_backend.enums.PaymentMethod;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {

    String recipientName;
    String recipientPhone;
    String shippingAddress;
    PaymentMethod  paymentMethod;

}

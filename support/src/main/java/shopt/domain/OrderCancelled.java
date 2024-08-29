package shopt.domain;

import java.util.*;
import lombok.*;
import shopt.domain.*;
import shopt.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private Long productId;
    private Integer qty;
    private String address;
}

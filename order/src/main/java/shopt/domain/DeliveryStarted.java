package shopt.domain;

import java.util.*;
import lombok.*;
import shopt.domain.*;
import shopt.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Long productId;
    private Integer qty;
}

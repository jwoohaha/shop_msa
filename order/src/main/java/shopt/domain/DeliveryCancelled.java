package shopt.domain;

import java.util.*;
import lombok.*;
import shopt.domain.*;
import shopt.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Long productId;
    private Integer qty;
}

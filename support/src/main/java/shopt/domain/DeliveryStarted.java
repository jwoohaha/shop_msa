package shopt.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopt.domain.*;
import shopt.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Long productId;
    private Integer qty;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event

package shopt.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopt.domain.*;
import shopt.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;

    public InventoryIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreased() {
        super();
    }
}
//>>> DDD / Domain Event

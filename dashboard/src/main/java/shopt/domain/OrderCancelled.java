package shopt.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopt.infra.AbstractEvent;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private Long productId;
    private Integer qty;
    private String address;
}

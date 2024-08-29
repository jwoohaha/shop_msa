package shopt.domain;

import java.util.*;
import lombok.*;
import shopt.domain.*;
import shopt.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;
}

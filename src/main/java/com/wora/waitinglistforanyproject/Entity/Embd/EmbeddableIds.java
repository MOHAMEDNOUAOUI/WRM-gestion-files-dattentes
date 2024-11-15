package com.wora.waitinglistforanyproject.Entity.Embd;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class EmbeddableIds implements Serializable {
    @Column(name = "visitor_id")
    private Long visitorId;

    @Column(name = "waiting_list_id")
    private Long waitingListId;
}

package com.wora.waitinglistforanyproject.Entity.Embd;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class EmbedableIds {
    @Column(name = "visitor_id")
    private Long visitor_id;

    @Column(name = "waitinglist_id")
    private Long waitinglist_id;
}

package com.ecommerce.common.persistence.dtos;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class AuditDTO extends BaseDTO {
    private Instant created;
    private String createdBy;
    private Instant updated;
    private String updatedBy;
}

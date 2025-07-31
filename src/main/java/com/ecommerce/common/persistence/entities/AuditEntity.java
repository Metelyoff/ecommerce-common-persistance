package com.ecommerce.common.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Getter
@Setter
@ToString(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class AuditEntity extends BaseEntity {

    @CreatedDate
    @Column(name = "created", nullable = false, updatable = false)
    private Instant created;

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @LastModifiedDate
    @Column(name = "updated")
    private Instant updated;

    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedBy;

}

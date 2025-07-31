package com.ecommerce.common.persistence.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.RoundingMode;
import java.util.UUID;

@ToString
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    public static final int MONEY_SCALE = 2;
    public static final RoundingMode MONEY_ROUNDING_MODE = RoundingMode.HALF_UP;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Version
    @Column(name = "version")
    private Integer version;

}

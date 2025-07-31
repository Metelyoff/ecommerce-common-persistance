package com.ecommerce.common.persistence.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@ToString
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDTO implements Serializable {
    private UUID id;
}

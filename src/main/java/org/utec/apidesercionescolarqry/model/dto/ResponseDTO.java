package org.utec.apidesercionescolarqry.model.dto;

import java.math.BigDecimal;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ResponseDTO {
    
    public String ok = "Todo bien";
    public BigDecimal probabilidad;

}

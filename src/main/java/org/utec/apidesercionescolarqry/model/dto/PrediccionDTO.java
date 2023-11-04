package org.utec.apidesercionescolarqry.model.dto;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.math.BigDecimal;

@RegisterRestClient
public class PrediccionDTO {
    public BigDecimal probability = BigDecimal.ZERO;
}

package com.github.gustajz.requestreplay.server;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalculationResponse {

	private CalculationRequest request;

	private Integer result;

}

package com.torkirion.eroam.microservice.accommodation.endpoint.yalago.rcdata;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
public class EstablishmentImage implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonProperty("ImageId")
	private String imageId;

	@JsonProperty("EstablishmentId")
	private Integer establishmentId;

	@JsonProperty("Url")
	private String url;
}


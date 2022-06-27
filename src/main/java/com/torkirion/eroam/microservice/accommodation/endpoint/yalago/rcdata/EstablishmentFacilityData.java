package com.torkirion.eroam.microservice.accommodation.endpoint.yalago.rcdata;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "yalago_EstablishmentFacility", indexes = {@Index(name = "yalago_EstablishmentFacility_idx_establishmentId",  columnList="establishmentId", unique = false)})
@Data
@ToString
public class EstablishmentFacilityData implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 50)
	private String establishmentId_facilityId;

	@Column
	private Integer facilityId;

	@Column
	private Integer establishmentId;

	@Column(length = 255)
	private String description;
}


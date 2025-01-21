package com.vivek.flightcheckin.integration.dto;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

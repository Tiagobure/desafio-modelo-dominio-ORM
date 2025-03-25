package com.estudotiago.desafiodev.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant startTime;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant endTime;
	
	
	                      
	public Bloco() {
		
	}
	public Bloco(Integer id, Instant start, Instant end) {

		this.id = id;
		this.startTime = start;
		this.endTime = end;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Instant getStart() {
		return startTime;
	}
	public void setStart(Instant start) {
		this.startTime = start;
	}
	public Instant getEnd() {
		return endTime;
	}
	public void setEnd(Instant end) {
		this.endTime = end;
	}
	
	
	
}

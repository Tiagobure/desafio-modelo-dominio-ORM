package com.estudotiago.desafiodev.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id", nullable = false) 
	private Activity activity;
	                      
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
	public Instant getStartTime() {
		return startTime;
	}
	public void setStartTime(Instant start) {
		this.startTime = start;
	}
	public Instant getEndTime() {
		return endTime;
	}
	public void setEndTime(Instant end) {
		this.endTime = end;
	}
	public Activity getActivity() {
		return activity;
	}
	
	
	
}

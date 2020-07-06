package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.NormalWeightMaleDto;

public class ResponseModel {

	private int day;
	List<NormalWeightMaleDto> workout;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, List<NormalWeightMaleDto> workout) {
		super();
		this.day = day;
		this.workout = workout;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public List<NormalWeightMaleDto> getWorkout() {
		return workout;
	}

	public void setWorkout(List<NormalWeightMaleDto> workout) {
		this.workout = workout;
	}

}

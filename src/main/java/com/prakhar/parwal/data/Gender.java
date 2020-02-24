package com.prakhar.parwal.data;

public enum Gender {

	NOT_SPECIFIED(0),
	MALE(1),
	FEMAL(2);
	
	private int value;
	
	private Gender(int value) {
		this.value = value;
	}
	
	public int getValue(Gender gender) {
		return gender.value;
	}
	
	public Gender getGender(int value) {
		
		Gender gender = null;
		
		for(Gender gen: Gender.values()) {
			if(gen.value == value) {
				gender = gen;
			}
		}
		
		return gender;
	}
}

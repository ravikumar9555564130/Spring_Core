package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("SBIBank")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SBIBank implements Bank {

	private static final String NAME = "SBI";
	private static final String IFSCCODE = "SBI01";

	private float intrestRate;

	public SBIBank() {
		System.out.println("SBIBank Created");
	}

	public float getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(float intrestRate) {
		this.intrestRate = intrestRate;
	}

	@Override
	public void getDetail() {
		System.out.println("name :: " + NAME + ",  ifsccode :: " + IFSCCODE + " ,intrestRate ::" + intrestRate);

	}
	


	@Override
	public float getLoanIntrest() {
		// TODO Auto-generated method stub
		return 10;
	}

}

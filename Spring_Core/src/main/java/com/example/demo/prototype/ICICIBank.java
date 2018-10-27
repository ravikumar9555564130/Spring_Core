package com.example.demo.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.Bank;

@Component("ICICIBank")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ICICIBank implements Bank {

	private static final String NAME = "ICICI";
	private static final String IFSCCODE = "ICICI01";

	private float intrestRate;

	public ICICIBank() {
		System.out.println("ICICIBank Created");
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
		return 5;
	}

}

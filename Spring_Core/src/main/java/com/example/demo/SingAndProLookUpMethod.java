package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingAndProLookUpMethod {

	@Autowired
	@Qualifier("ICICIBank")
	private Bank iciciBank;

	@Autowired
	@Qualifier("SBIBank")
	private Bank sbiBank;

	public SingAndProLookUpMethod() {
		System.out.println("TestApp is created");
	}

	// Second approach-- by @lookUp Method injection

	@Lookup
	public ICICIBank getIciciBank() {
		return null;
	}

	@Lookup
	public SBIBank getSbiBank() {
		return null;
	}

	public void getIcicBankDetails() {

		iciciBank.getDetail();
		iciciBank.getLoanIntrest();
	}

	public void getSbiBankDetails() {
		sbiBank.getDetail();
		sbiBank.getLoanIntrest();
	}

	public void setIciciBank(Bank iciciBank) {
		this.iciciBank = iciciBank;
	}

	public void setSbiBank(Bank sbiBank) {
		this.sbiBank = sbiBank;
	}

}

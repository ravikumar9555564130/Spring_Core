package com.example.demo.singlton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.Bank;
import com.example.demo.prototype.ICICIBank;
import com.example.demo.prototype.SBIBank;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingAndProApplicationContext {

	@Autowired
	@Qualifier("ICICIBank")
	private Bank iciciBank;

	@Autowired
	@Qualifier("SBIBank")
	private Bank sbiBank;

	public SingAndProApplicationContext() {
		System.out.println("TestApp is created");
	}

	// First approach-- by injecting ApplicationContext

	@Autowired
	ApplicationContext aaplicationContext;

	public Bank getIciciBank() {
		return aaplicationContext.getBean(ICICIBank.class);
	}

	public Bank getSbiBank() {
		return aaplicationContext.getBean(SBIBank.class);
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

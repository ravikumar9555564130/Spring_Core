package com.example.demo.singlton;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.Bank;
import com.example.demo.prototype.ICICIBank;
import com.example.demo.prototype.SBIBank;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingAndProProvider {

	@Autowired
	@Qualifier("ICICIBank")
	private Bank iciciBank;

	@Autowired
	@Qualifier("SBIBank")
	private Bank sbiBank;

	public SingAndProProvider() {
		System.out.println("TestApp is created");
	}

	// Third approach :- by using Provider Interface

/*	<dependency>
		<groupId>javax.inject</groupId>
		<artifactId>javax.inject</artifactId>
		<version>1</version>
   </dependency>*/


	@Autowired
	private Provider<ICICIBank> ICICIBankBeanProvider;

	// Using JSR 330 Provider<T> injection by Spring

	@Autowired
	private Provider<SBIBank> SbiBankBeanProvider;

	public Bank getIciciBank() {
		return ICICIBankBeanProvider.get();
	}

	public Bank getSbiBank() {
		return SbiBankBeanProvider.get();
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

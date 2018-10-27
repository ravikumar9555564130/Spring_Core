package com.example.demo.singlton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.example.demo.Bank;
import com.example.demo.prototype.ICICIBank;
import com.example.demo.prototype.SBIBank;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingAndProScopeProxy {

	@Autowired
	@Qualifier("ICICIBank")
	private Bank iciciBank;

	@Autowired
	@Qualifier("SBIBank")
	private Bank sbiBank;

	public SingAndProScopeProxy() {
		System.out.println("TestApp is created");
	}

	// Fourth approach-- Using Scoped Proxy

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Bank getIciciBank() {
		return new ICICIBank();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Bank getSbiBank() {
		return new SBIBank();
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

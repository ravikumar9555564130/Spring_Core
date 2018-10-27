package com.example.demo.singlton;

import org.springframework.beans.factory.ObjectFactory;
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
public class SingAndProObjectFactory {

	@Autowired
	@Qualifier("ICICIBank")
	private Bank iciciBank;

	@Autowired
	@Qualifier("SBIBank")
	private Bank sbiBank;

	public SingAndProObjectFactory() {
		System.out.println("TestApp is created");
	}

	// Fifth approach-- Spring provides the ObjectFactory<T> interface to produce on
	// demand objects of the given type:

	@Autowired
	private ObjectFactory<ICICIBank> ICICIBankBeanObjectFactory;

	@Autowired
	private ObjectFactory<SBIBank> SBIBankBeanObjectFactory;

	public Bank getIciciBank() {
		return ICICIBankBeanObjectFactory.getObject();
	}

	public Bank getSbiBank() {
		return SBIBankBeanObjectFactory.getObject();
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

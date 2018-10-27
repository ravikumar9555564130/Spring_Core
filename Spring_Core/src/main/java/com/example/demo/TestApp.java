package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestApp {


	@Autowired
	@Qualifier("ICICIBank")
	private Bank iciciBank;

	@Autowired
	@Qualifier("SBIBank")
	private Bank sbiBank;

	public TestApp() {
		System.out.println("TestApp is created");
	}

	/*
	 
	  //First approach-- by injecting ApplicationContext
	
	@Autowired
	ApplicationContext aaplicationContext;
	W
	public Bank getIciciBank() {
		return aaplicationContext.getBean(ICICIBank.class);
	}

	public Bank getSbiBank() {
		return aaplicationContext.getBean(SBIBank.class);
	}

	public void setIciciBank(Bank iciciBank) {
		this.iciciBank = iciciBank;
	}*/

	
	/*
	 
	 //second approach-- by @lookUp Method injection
	
	@Lookup
	public ICICIBank getIciciBank() {
		return null;
	}

	@Lookup
	public SBIBank getSbiBank() {
		return null;
	}*/
	
	
	
/*	
 
 //Third approach--
 
 <dependency>
	<groupId>javax.inject</groupId>
	<artifactId>javax.inject</artifactId>
	<version>1</version>
</dependency>*/

/*	@Autowired
    private Provider<ICICIBank> ICICIBankBeanProvider;
	
	
	//Using JSR 330 Provider<T> injection by Spring
	
	@Autowired
    private Provider<SBIBank> SbiBankBeanProvider;

	public Bank getIciciBank() {
		return ICICIBankBeanProvider.get();
	}



	public Bank getSbiBank() {
		return SbiBankBeanProvider.get();
	}
	
	public void setSbiBank(Bank sbiBank) {
		this.sbiBank = sbiBank;
	}*/


	/*
	 
	 //Fourth approach-- Using Scoped Proxy.
	
	@Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
                        proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Bank getIciciBank() {
		return new ICICIBank();
	}
	
	@Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
                        proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Bank getSbiBank() {
		return new SBIBank();
	}

	public void setIciciBank(Bank iciciBank) {
		this.iciciBank = iciciBank;
	}*/


	/*
	 
	 
	 //Fifth  approach--  Spring provides the ObjectFactory<T> interface to produce on demand objects of the given type:
	
	@Autowired
	private ObjectFactory<ICICIBank> ICICIBankBeanObjectFactory;
	
	@Autowired
	private ObjectFactory<SBIBank> SBIBankBeanObjectFactory;
	
	public Bank getIciciBank() {
		return ICICIBankBeanObjectFactory.getObject();
	}
	
	public Bank getSbiBank() {
		return SBIBankBeanObjectFactory.getObject();
	}*/

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

	public Bank getSbiBank() {
		return sbiBank;
	}
	
	public Bank getIciciBank() {
		return iciciBank;
	}

	public void setSbiBank(Bank sbiBank) {
		this.sbiBank = sbiBank;
	}
	
	
}

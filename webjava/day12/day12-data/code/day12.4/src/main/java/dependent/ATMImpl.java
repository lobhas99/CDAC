package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.Transport;

//singleton n eager
@Component("my_atm")
public class ATMImpl implements ATM {
	@Autowired//(required = false) //=> autowire=byType (using field level D.I)
	@Qualifier("httpTransport123") //=> autowire=byName(using field level D.I)
	private Transport myTransport;

	public ATMImpl() {
		System.out.println("in cnstr of " + getClass().getName() + " " + myTransport);// not null
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);// depnt obj using depcy

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
	}

	// init method
	@PostConstruct
	public void myInit() {
		System.out.println("in init " + myTransport);
	}

	// destroy method
	@PreDestroy
	public void myDestroy() {
		System.out.println("in destroy " + myTransport);
	}

}

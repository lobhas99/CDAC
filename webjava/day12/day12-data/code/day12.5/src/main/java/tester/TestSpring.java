package tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import dependent.ATMImpl;

public class TestSpring {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx 
				= new AnnotationConfigApplicationContext
				(AppConfig.class)) {
			System.out.println("SC up n running...");
			// get readymade spring bean (atm) from SC
			ATMImpl atm1 = ctx.getBean("my_atm", ATMImpl.class);
			// deposit 1000
			atm1.deposit(1000);
			ATMImpl atm2 = ctx.getBean("my_atm", ATMImpl.class);
			System.out.println(atm1 == atm2);// t

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}

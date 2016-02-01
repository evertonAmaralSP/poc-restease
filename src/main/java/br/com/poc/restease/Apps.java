package br.com.poc.restease;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.poc.restease.conf.CorreiosServicesConfiguration;
import br.com.poc.restease.domain.EnderecoCEP;
import br.com.poc.restease.services.SearchCorreirosServices;

public class Apps {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(CorreiosServicesConfiguration.class);
		 SearchCorreirosServices scs = ctx.getBean(SearchCorreirosServices.class);
		 
		 EnderecoCEP search = scs.search("04194260");
		 System.out.println(search.toString());
	}

}

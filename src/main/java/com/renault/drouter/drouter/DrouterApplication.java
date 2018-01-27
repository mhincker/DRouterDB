package com.renault.drouter.drouter;

import com.renault.drouter.drouter.model.Party;
import com.renault.drouter.drouter.repository.PartyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DrouterApplication {

    private static final Logger log = LoggerFactory.getLogger(DrouterApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(DrouterApplication.class, args);
	}/*
	@Bean
	public CommandLineRunner demo (PartyRepository repository){
		return (args) -> {
			// save a couple of Clients
			repository.save(new Party("d0001", "d0003", "d0002", "Dealer Name","",""));
			repository.save(new Party("d0002", "d0003", "d0003", "Dealer Name","",""));
			repository.save(new Party("d0003", "d0003", "", "Dealer Name","",""));

			// fetch all Clients
			log.info("Dealers found with findAll():");
			log.info("-------------------------------");
			for (Party Party : repository.findAll()) {
				log.info(Party.toString());
			}
			log.info("");

			// fetch an individual Party by ID
			Party Party = repository.findOne(1L);
			log.info("Party found with findOne(1L):");
			log.info("--------------------------------");
			log.info(Party.toString());
			log.info("");

			// fetch Clients by last name
			log.info("Party found with findByLastName('Dealer3'):");
			log.info("--------------------------------------------");
			for (Party party3 : repository.findByUid("d0003")) {
				log.info(party3.toString());
			}
			log.info("");
		};
	}*/

}

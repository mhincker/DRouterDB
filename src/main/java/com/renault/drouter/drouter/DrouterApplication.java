package com.renault.drouter.drouter;

import com.renault.drouter.drouter.model.Party;
import com.renault.drouter.drouter.model.Route;
import com.renault.drouter.drouter.repository.PartyRepository;
import com.renault.drouter.drouter.repository.RouteRepository;
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
	}
	@Bean
	public CommandLineRunner demo (PartyRepository partyRepository, RouteRepository routeRepository){
		return (args) -> {

            partyRepository.save(new Party("d0001", null, null, "Dealer Name","",""));
            partyRepository.save(new Party("d0002", null, null, "Dealer Name","",""));
            partyRepository.save(new Party("d0003", null, null, "Dealer Name","",""));
            Party dms = partyRepository.findByUid("d0001");
            Party recipient = partyRepository.findByUid("d0002");
            Party recipientSpe = partyRepository.findByUid("d0003");

            routeRepository.save(new Route(dms,recipient,"SBOL","Calendar",recipientSpe));
			// fetch all Clients
			log.info("Dealers found with findAll():");
			log.info("-------------------------------");
			for (Party Party : partyRepository.findAll()) {
				log.info(Party.toString());
			}
			log.info("");

			// fetch an individual Party by ID
			Party party = partyRepository.findOne(1L);
            Route route = routeRepository.findOne(1L);
			log.info("Party found with findOne(1L):");
			log.info("--------------------------------");
			log.info(party.toString());
            log.info(route.toString());
			log.info("");

			// fetch Clients by last name
			party = partyRepository.findByUid("d0003");
			log.info("Party found with findByUid('d0003'):");
			log.info("--------------------------------------------");
			log.info(party.toString());
		};
	}

}

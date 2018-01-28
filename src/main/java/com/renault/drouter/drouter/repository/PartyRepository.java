package com.renault.drouter.drouter.repository;

import com.renault.drouter.drouter.model.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "party", path = "party")
public interface PartyRepository extends CrudRepository<Party, Long> {

    Party findByUid(String uId);

}

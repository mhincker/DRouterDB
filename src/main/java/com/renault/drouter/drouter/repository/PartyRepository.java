package com.renault.drouter.drouter.repository;

import com.renault.drouter.drouter.model.Party;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "party", path = "party")
public interface PartyRepository extends PagingAndSortingRepository<Party, Long> {

    Party findByUid(@Param("uid") String uId);

}

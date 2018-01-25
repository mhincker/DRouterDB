package com.renault.drouter.drouter.repository;

import com.renault.drouter.drouter.model.Dealer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "dealer", path = "dealer")
public interface DealerRepository extends PagingAndSortingRepository<Dealer, Long> {

    List<Dealer> findByUid(String uid);

}

package com.renault.drouter.drouter.repository;


import com.renault.drouter.drouter.model.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "service", path = "service")
public interface ServiceRepository extends PagingAndSortingRepository<Service, Long> {

    List<Service> findByName(String name);

}

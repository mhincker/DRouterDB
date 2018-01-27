package com.renault.drouter.drouter.repository;


import com.renault.drouter.drouter.model.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "route", path = "route")
public interface RouteRepository extends CrudRepository<Route, Long> {

   // List<Route> findByService(String service);

}

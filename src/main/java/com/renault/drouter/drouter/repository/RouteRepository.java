package com.renault.drouter.drouter.repository;

import com.renault.drouter.drouter.model.Party;
import com.renault.drouter.drouter.model.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "route", path = "route")
public interface RouteRepository extends CrudRepository<Route, Long> {

   List<Route> findByService(@Param("service") String service);
   List<Route> findByApplication(@Param("application") String application);
   List<Route> findByDms(@Param("dms") Party dms);

}

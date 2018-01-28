package com.renault.drouter.drouter.repository;

import com.renault.drouter.drouter.model.ListOfValue;
import com.renault.drouter.drouter.model.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "lov", path = "lov")
public interface ListOfValueRepository extends CrudRepository<ListOfValue, Long> {

    List<ListOfValue> findByKey(String key);

}


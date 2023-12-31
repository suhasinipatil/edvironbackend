package com.example.edvironnew.repostories;

import com.example.edvironnew.entities.SchoolEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SchoolEntityRepository extends MongoRepository<SchoolEntity, String> {

    Optional<SchoolEntity> findSchoolEntityByNameEquals(String name);
}

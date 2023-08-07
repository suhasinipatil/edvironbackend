package com.example.edvironnew.repostories;

import com.example.edvironnew.entities.SectionEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SectionEntityRepository extends MongoRepository<SectionEntity, String> {

    @Query("{ 'school_id': { $eq: ?0 } }")
    List<SectionEntity> findSectionEntityBySchool_idIs(ObjectId id);
}

package com.example.edvironnew.repostories;

import com.example.edvironnew.entities.StudentEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentEntityRepository extends MongoRepository<StudentEntity, String> {
    @Query("{ '_id': { $eq: ?0 } }")
    Optional<StudentEntity> findStudentById(ObjectId id);

    @Query("{ 'school_id': { $eq: ?0 } }")
    Optional<List<StudentEntity>> findStudentBySchoolIdIs(ObjectId id);
}

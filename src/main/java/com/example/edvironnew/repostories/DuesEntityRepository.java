package com.example.edvironnew.repostories;

import com.example.edvironnew.entities.DuesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface DuesEntityRepository extends MongoRepository<DuesEntity, String> {


    @Query("{ 'due_date': { $gt: ?0 } }")
    List<DuesEntity> findByDueDateGreaterThan(Date date);

    @Override
    List<DuesEntity> findAll();
}

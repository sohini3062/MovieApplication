package com.company.Movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}

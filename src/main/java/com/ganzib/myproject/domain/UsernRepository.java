package com.ganzib.myproject.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by GanZiB on 16/11/30.
 */
public interface UsernRepository extends MongoRepository<User,Long> {
    Usern findByName(String usernName);
}

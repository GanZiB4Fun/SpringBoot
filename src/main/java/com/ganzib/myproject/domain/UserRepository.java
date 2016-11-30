package com.ganzib.myproject.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by GanZiB on 16/11/30.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByName(String name);

    User findByNameAndAge(String name,Integer age);

    @Query("FROM User u WHERE u.name=:name")
    User findUser(@Param("name") String name);

}

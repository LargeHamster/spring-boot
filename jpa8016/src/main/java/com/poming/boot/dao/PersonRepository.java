package com.poming.boot.dao;

import com.poming.boot.dto.NameOnly;
import com.poming.boot.entity.pojo.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/7/11
 **/
public interface PersonRepository extends Repository<Person,Long> {

    Collection<Person> findByLastname(String lastname);

    @Query("select firstname as firstname,lastname as lastname from Person where lastname=:lastname")
    List<NameOnly> findbyLastname(String lastname);

}
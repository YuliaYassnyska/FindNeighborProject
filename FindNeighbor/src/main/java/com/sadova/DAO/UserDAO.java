package com.sadova.DAO;

import com.sadova.domain.Address;
import com.sadova.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    @Query(value = "SELECT country, city, area FROM address where id = :id")
    Address setForAddress(@Param("id") int id);
}

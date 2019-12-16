package com.sadova.DAO;

import com.sadova.domain.Address;
import com.sadova.domain.User;
import org.hibernate.annotations.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDAO extends JpaRepository<Address, Integer> {
//        @Query(value = "SELECT email, first_name, last_name, login, password FROM user where id = :id")
//        User setForAddress(@Param(value = "id") int id);

}

package com.sadova.DAO;

import com.sadova.domain.AdditionalInfo;
import com.sadova.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalInfoDAO extends JpaRepository<AdditionalInfo, Integer> {

}

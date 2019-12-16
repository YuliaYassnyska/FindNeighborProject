package com.sadova.service;

import com.sadova.DAO.AddressDAO;
import com.sadova.DAO.UserDAO;
import com.sadova.domain.Address;
import com.sadova.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    public AddressDAO addressDAO;

    public List<Address> findAllAddress() {
        List<Address> addresses = new LinkedList<>(addressDAO.findAll());
        if (addresses.isEmpty()) {
            return null;
        }
        return addresses;
    }

    public Address findById(Integer id) throws Exception {
        if (addressDAO.findById(id).isPresent()) {
            return addressDAO.findById(id).get();
        }
        return null;
    }
    @Transactional
    public void create(Address entity) throws Exception {
        if (entity != null) {
         //   entity.setUser(addressDAO.setForAddress(entity.getId()));
            addressDAO.save(entity);

        }

    }



}

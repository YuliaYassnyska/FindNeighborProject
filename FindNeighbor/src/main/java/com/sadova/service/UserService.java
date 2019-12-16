package com.sadova.service;

import com.sadova.DAO.UserDAO;
import com.sadova.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserDAO userRepository;

    public List<User> findAllUsers() {
        List<User> users = new LinkedList<>(userRepository.findAll());
        if (users.isEmpty()) {
            return null;
        }
        return users;
    }

    public User findById(Integer id) throws Exception {
        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(User entity) throws Exception {
        if (entity != null) {
            entity.setAddress(userRepository.setForAddress(1));
            userRepository.save(entity);
        }
    }

    @Transactional
    public void update(User entity) throws Exception {
        userRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setFirstName(entity.getFirstName());
                    oldEntity.setLastName(entity.getLastName());
                    oldEntity.setEmail(entity.getEmail());
                    return userRepository.save(oldEntity);
                })
                .orElseGet(() -> userRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
        }
    }

    @Transactional
    public void updateUser(int id){

    }

}

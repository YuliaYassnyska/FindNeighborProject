package com.sadova.service;

import com.sadova.DAO.AdditionalInfoDAO;
import com.sadova.domain.AdditionalInfo;
import com.sadova.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class AdditionalInfoService {
    @Autowired
    public AdditionalInfoDAO additionalInfoDAO;

    public List<AdditionalInfo> findAllAdditionalInfo() {
        List<AdditionalInfo> additionalInfos = new LinkedList<>(additionalInfoDAO.findAll());
        if (additionalInfos.isEmpty()) {
            return null;
        }
        return additionalInfos;
    }

    public AdditionalInfo findById(Integer id) throws Exception {
        if (additionalInfoDAO.findById(id).isPresent()) {
            return additionalInfoDAO.findById(id).get();
        }
        return null;
    }
    @Transactional
    public void create(AdditionalInfo entity) throws Exception {
        if (entity != null) {
            additionalInfoDAO.save(entity);
        }
    }
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StoringData;
import com.example.demo.repository.*;

import java.util.List;
import java.util.Optional;

@Service
public class StoringDataService {

    private final StoringDataRepo storingRepo;

    @Autowired
    public StoringDataService(StoringDataRepo supportRepository) {
        this.storingRepo = supportRepository;
    }

    public List<StoringData> getAllProducts() {
        return storingRepo.findAll();
    }

    public StoringData getProductById(Long id) {
        Optional<StoringData> productOptional = storingRepo.findById(id);
        return productOptional.orElse(null);
    }

    public StoringData createProduct(StoringData product) {
        return storingRepo.save(product);
    }

  
}

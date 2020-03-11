package com.example.MongoDBConnect.repository;

import com.example.MongoDBConnect.document.Mascota;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Edinson Ayui
 */
public interface MascotaRepository extends MongoRepository<Mascota, Integer> {
    
}

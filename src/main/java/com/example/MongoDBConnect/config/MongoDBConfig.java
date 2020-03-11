package com.example.MongoDBConnect.config;


import com.example.MongoDBConnect.document.Mascota;
import com.example.MongoDBConnect.repository.MascotaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/**
 *
 * @author Edinson Ayui
 */
@EnableMongoRepositories(basePackageClasses = MascotaRepository.class)
@Configuration
public class MongoDBConfig {
    @Bean
    CommandLineRunner commandLineRunner(MascotaRepository mascotaRepository) {
        return strings -> {
            mascotaRepository.save(new Mascota(1, "Junior", "Canina", "Runita :3"));
            mascotaRepository.save(new Mascota(2, "Luna", "Gatuna", "Siames"));
        };
    }
}

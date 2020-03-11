package com.example.MongoDBConnect.resource;

import com.example.MongoDBConnect.document.Mascota;
import com.example.MongoDBConnect.repository.MascotaRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Edinson Ayui
 */
@RestController
@RequestMapping("/rest/mascotas")
public class MascotaResource {

    private MascotaRepository mascotaRepository;

    public MascotaResource(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping("/all")
    public List<Mascota> getAll() {
        return this.mascotaRepository.findAll();
    }

}

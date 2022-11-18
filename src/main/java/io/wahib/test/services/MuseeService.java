package io.wahib.test.services;

import io.wahib.test.models.Musee;
import io.wahib.test.repositories.MuseeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MuseeService {
    @Autowired private MuseeRepository museeRepository;

    public Musee ajouterMuseeEtZones(Musee m) {
        return museeRepository.save(m);
    }
}

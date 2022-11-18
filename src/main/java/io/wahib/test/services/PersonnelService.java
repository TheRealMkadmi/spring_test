package io.wahib.test.services;

import io.wahib.test.models.Personnel;
import io.wahib.test.models.Zone;
import io.wahib.test.models.enums.TypePersonnel;
import io.wahib.test.repositories.PersonnelRepository;
import io.wahib.test.repositories.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;

    @Autowired
    private ZoneRepository zoneRepository;

    public Personnel ajouterPersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    public String affecterPersonnelAUneZone(Long idPersonnel, Long idZone) {
        var zone = zoneRepository.findById(idZone).get();
        var personnel = personnelRepository.findById(idPersonnel).get();

        if (personnel.getTypePersonnel() == TypePersonnel.DIRECTEUR) {
            if (zone.getDirecteur() != null) {
                zone.setDirecteur(personnel);
                return "Directeur affecté";
            } else {
                return "Directeur non affecté";
            }
        } else if (personnel.getTypePersonnel() == TypePersonnel.GARDIEN) {
            if (zone.getGardiens().size() <= getMaxNbGarde(zone)) {
                zone.getGardiens().add(personnel);
                return "Gardien affecté";
            } else {
                return "La zone contient assez de gardiens";
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private int getMaxNbGarde(Zone zone) {
        var nbOeuvres = zone.getOeuvresArts().size();
        return Math.round(nbOeuvres / 2.0f);
    }
}

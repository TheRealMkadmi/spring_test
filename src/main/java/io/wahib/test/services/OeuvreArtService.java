package io.wahib.test.services;

import io.wahib.test.models.OeuvreArt;
import io.wahib.test.models.Zone;
import io.wahib.test.models.enums.Direction;
import io.wahib.test.repositories.MuseeRepository;
import io.wahib.test.repositories.OeuvreArtRepository;
import io.wahib.test.repositories.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OeuvreArtService {
    @Autowired
    private OeuvreArtRepository oeuvreArtRepository;

    @Autowired
    private MuseeRepository museeRepository;
    @Autowired
    private ZoneRepository zoneRepository;

    public void ajouterOeuvreArtEtAffecteerAZone(OeuvreArt o, Long idZone) {
        o.setZone(zoneRepository.findById(idZone).get());
        oeuvreArtRepository.save(o);
    }

    public List<String> titreTableauParMuseeEtDirection(Long idMusee, Direction d) {
        var musee = museeRepository.findById(idMusee).get();
        return musee.getZones()
                .stream()
                .filter(z -> z.getDirection() == d)
                .map(Zone::getOeuvresArts)
                .flatMap(List::stream)
                .map(o -> o.getTitreTableau())
                .toList();
    }
}

package io.wahib.test.controllers;

import io.swagger.annotations.Api;
import io.wahib.test.models.Musee;
import io.wahib.test.models.OeuvreArt;
import io.wahib.test.models.Personnel;
import io.wahib.test.models.enums.Direction;
import io.wahib.test.services.MuseeService;
import io.wahib.test.services.OeuvreArtService;
import io.wahib.test.services.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api
@RequestMapping("/api/personnel")
public class PublicController {

    @Autowired
    private PersonnelService personnelService;
    @Autowired
    private MuseeService museeService;
    @Autowired
    private OeuvreArtService oeuvreArtService;

    @PostMapping("/ajouter")
    public Personnel ajouterPersonnel(@RequestBody Personnel p) {
        return personnelService.ajouterPersonnel(p);
    }

    @PostMapping("/ajouterMuseeEtZones")
    public Musee ajouterMuseeEtZones(@RequestBody Musee m) {
        return museeService.ajouterMuseeEtZones(m);
    }

    @PostMapping("/ajouterOeuvreArtEtAffecteerAZone/{idZone}")
    public void ajouterOeuvreArtEtAffecteerAZone(@RequestBody OeuvreArt o, @PathVariable("idZone") Long idZone) {
        oeuvreArtService.ajouterOeuvreArtEtAffecteerAZone(o, idZone);
    }

    @GetMapping("/affecterPersonnelAZone/{idPersonnel}/{idZone}")
    public String affecterPersonnelAZone(@PathVariable("idPersonnel") Long idPersonnel, @PathVariable("idZone") Long idZone) {
        return personnelService.affecterPersonnelAUneZone(idPersonnel, idZone);
    }

    @GetMapping("titreTableauParMuseeEtDirection/{idMusee}/{direction}")
    public List<String> titreTableauParMuseeEtDirection(@PathVariable("idMusee") Long idMusee, @PathVariable("direction") Direction d){
        return oeuvreArtService.titreTableauParMuseeEtDirection(idMusee, d);
    }

}

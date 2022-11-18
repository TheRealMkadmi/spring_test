package io.wahib.test.repositories;

import io.wahib.test.models.OeuvreArt;
import io.wahib.test.models.Zone;
import io.wahib.test.models.enums.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OeuvreArtRepository extends JpaRepository<OeuvreArt, Long>, JpaSpecificationExecutor<OeuvreArt> {
    List<OeuvreArt> findAllByZoneIn(List<Zone> zones);
}
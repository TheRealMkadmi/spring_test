package io.wahib.test.repositories;

import io.wahib.test.models.Musee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MuseeRepository extends JpaRepository<Musee, Long>, JpaSpecificationExecutor<Musee> {
}
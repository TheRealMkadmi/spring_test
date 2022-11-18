package io.wahib.test.repositories;

import io.wahib.test.models.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Long>, JpaSpecificationExecutor<Personnel> {
}
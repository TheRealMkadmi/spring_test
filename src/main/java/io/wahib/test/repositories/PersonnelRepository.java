package io.wahib.test.repositories;

public interface PersonnelRepository extends org.springframework.data.jpa.repository.JpaRepository<io.wahib.test.models.Personnel, java.lang.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<io.wahib.test.models.Personnel> {
}
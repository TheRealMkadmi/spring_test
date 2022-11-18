package io.wahib.test.repositories;

public interface MuseeRepository extends org.springframework.data.jpa.repository.JpaRepository<io.wahib.test.models.Musee, java.lang.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<io.wahib.test.models.Musee> {
}
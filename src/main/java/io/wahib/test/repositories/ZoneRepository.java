package io.wahib.test.repositories;

public interface ZoneRepository extends org.springframework.data.jpa.repository.JpaRepository<io.wahib.test.models.Zone, java.lang.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<io.wahib.test.models.Zone> {
}
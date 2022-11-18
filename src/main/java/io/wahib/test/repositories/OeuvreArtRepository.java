package io.wahib.test.repositories;

public interface OeuvreArtRepository extends org.springframework.data.jpa.repository.JpaRepository<io.wahib.test.models.OeuvreArt, java.lang.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<io.wahib.test.models.OeuvreArt> {
}
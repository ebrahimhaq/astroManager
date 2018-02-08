package io.ebrahimhaq.astronomymanager.application.repository;

import io.ebrahimhaq.astronomymanager.application.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

package kr.co.farmstoryapi.repository;

import kr.co.farmstoryapi.entity.Terms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermsRepository extends JpaRepository<Terms, Integer> {
}

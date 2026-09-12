package com.eakhtar.eligibility.repository;

import com.eakhtar.eligibility.entity.EligibilityRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EligibilityRepository extends JpaRepository<EligibilityRecord, Long> {
    Optional<EligibilityRecord> findByMemberId(String memberId);
}

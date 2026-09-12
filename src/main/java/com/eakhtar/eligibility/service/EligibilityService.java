package com.eakhtar.eligibility.service;

import com.eakhtar.eligibility.model.EligibilityResponse;
import com.eakhtar.eligibility.repository.EligibilityRepository;
import org.springframework.stereotype.Service;

@Service
public class EligibilityService {

    private final EligibilityRepository repository;

    public EligibilityService(EligibilityRepository repository) {
        this.repository = repository;
    }

    public EligibilityResponse getEligibility(String memberId) {
        return repository.findByMemberId(memberId)
                .map(r -> new EligibilityResponse(r.getMemberId(), r.getPlanTier(), r.isActive()))
                .orElseGet(() -> new EligibilityResponse(memberId, "GOLD", true));
    }
}

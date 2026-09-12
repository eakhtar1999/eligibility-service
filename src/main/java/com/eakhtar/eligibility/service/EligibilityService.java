package com.eakhtar.eligibility.service;

import com.eakhtar.eligibility.model.EligibilityResponse;
import org.springframework.stereotype.Service;

@Service
public class EligibilityService {
    public EligibilityResponse getEligibility(String memberId) {
        return new EligibilityResponse(memberId, "GOLD", true);
    }
}

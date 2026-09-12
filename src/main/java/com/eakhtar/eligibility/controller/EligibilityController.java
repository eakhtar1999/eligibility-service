package com.eakhtar.eligibility.controller;

import com.eakhtar.eligibility.model.EligibilityResponse;
import com.eakhtar.eligibility.service.EligibilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eligibility")
@CrossOrigin(origins = "http://localhost:5173")
public class EligibilityController {

    private final EligibilityService eligibilityService;

    public EligibilityController(EligibilityService eligibilityService) {
        this.eligibilityService = eligibilityService;
    }

    @GetMapping("/{memberId}")
    public EligibilityResponse getEligibility(@PathVariable String memberId) {
        return eligibilityService.getEligibility(memberId);
    }
}

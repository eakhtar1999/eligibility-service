package com.eakhtar.eligibility.model;

public record EligibilityResponse(
    String memberId,
    String planTier,
    boolean active
) {}

package com.eakhtar.eligibility.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "eligibility_records")
public class EligibilityRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberId;
    private String planTier;
    private boolean active;

    public Long getId() { return id; }
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }
    public String getPlanTier() { return planTier; }
    public void setPlanTier(String planTier) { this.planTier = planTier; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}

package com.eakhtar.eligibility.repository;

import com.eakhtar.eligibility.entity.EligibilityRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EligibilityRepositoryTest {

    @Autowired
    private EligibilityRepository repository;

    @Test
    void savesAndFindsByMemberId() {
        EligibilityRecord record = new EligibilityRecord();
        record.setMemberId("M99999");
        record.setPlanTier("PLATINUM");
        record.setActive(true);
        repository.save(record);

        Optional<EligibilityRecord> found = repository.findByMemberId("M99999");

        assertThat(found).isPresent();
        assertThat(found.get().getPlanTier()).isEqualTo("PLATINUM");
    }
}

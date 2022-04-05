package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Developer here.
        // Developers always have read access 
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        boolean isCertified = LocalDate.now().minusMonths(6).minusDays(1).isBefore(this.employmentDate);
            return isCertified;
        
    }
}

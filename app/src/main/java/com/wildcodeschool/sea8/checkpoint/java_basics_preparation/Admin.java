package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Admin always have Read access so no check needed)
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here. 
        // (write access only if they are certified i.e. the lastCertified dates is less than one year ago)
        /*if (lastCertified == LocalDate.now().minusYears(1).minusDays(1)){
            return true;
        }
        else {
            return false;
        }
        */
        boolean isCertified = LocalDate.now().minusYears(1).minusDays(1).isBefore(this.lastCertified);
            return isCertified;
    }
}

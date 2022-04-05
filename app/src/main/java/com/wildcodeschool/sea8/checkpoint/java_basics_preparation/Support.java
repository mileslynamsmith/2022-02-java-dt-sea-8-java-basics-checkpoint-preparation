package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        if (level >= 1)
            return true;
        else
            return false;
    }

    @Override
    public boolean hasWriteAccess() {
        if (level >= 2)
        return true;
            else 
                return false;
    }
}

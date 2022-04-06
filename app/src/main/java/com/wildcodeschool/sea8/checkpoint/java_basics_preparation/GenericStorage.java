package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a ITPerson storage on Object base, ie. without Generics.
 */
public class GenericStorage <T> {

    List<T> itcrowd = new ArrayList<>();

    public boolean storePerson(T person) {
        return itcrowd.add(person);
    }

    public T getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    public T getFirstStoredPerson() {
        return itcrowd.get(0);
    }

}

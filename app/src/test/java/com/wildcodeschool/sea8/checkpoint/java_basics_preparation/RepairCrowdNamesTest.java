package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepairCrowdNamesTest {

    @Test
    public void repairCrowdNamesTest() {
        // Arrange (Create a list of wrongly imported ITPersons)
        ITPerson person1 = new Admin("Super_Admin", LocalDate.now().minusMonths(3));
        ITPerson person2 = new Developer("Best_Developer", LocalDate.now().minusYears(2));
        ITPerson person3 = new Support("Mega_Support", 2);

        List<ITPerson> itCrowd = new ArrayList<>();
        itCrowd.add(person1);
        itCrowd.add(person2);
        itCrowd.add(person3);

        // Act
        for (ITPerson itPerson : itCrowd) {
            itPerson.setName(ITPersonRepair.repairName(itPerson));
        }

        // Assert
        assertEquals("Super Admin", person1.getName());
        assertEquals("Best Developer", person2.getName());
        assertEquals("Mega Support", person3.getName());
    }
}

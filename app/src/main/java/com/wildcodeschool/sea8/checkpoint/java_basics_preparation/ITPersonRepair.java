package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        // Get the name of the ITPerson, repair it and return the new name
        // EG: person.getName() -> "Super_Admin" -> return "Super Admin"
        // get name 
        // what do i know?  I know that getName in ITPerson can be used for other classes.  I know that the ITPerson is a class, and person is another parametre
        // i need to create a String // then make that string do all the work 
        String name = person.getName().replace("_", " ");
        return name;
    }
}

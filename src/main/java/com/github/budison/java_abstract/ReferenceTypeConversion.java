package com.github.budison.java_abstract;

import javax.print.attribute.standard.NumberOfInterveningJobs;

/**
 * @author Kevin Nowak
 */
class ReferenceTypeConversion {
    public static void main(String[] args) {

        Object o = "string";
        String s = (String) o;

        // Widening conversion from array to Object
        Object obj = new int[]{1, 2, 3};

        // Narrowing conversion back to array type
        int[] array = (int[]) obj;
    }
}

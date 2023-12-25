package com.common;

import java.util.Arrays;
import java.util.List;

public class StringToList {
    
    public List<String> convertStringToList(String inputString) {
        // Define the delimiter (e.g., comma)
        String delimiter = ",";

        // Use split() method to split the string into an array of strings
        String[] stringArray = inputString.replace("[", "").replace("]", "").replace(" ", "").split(delimiter);

        // Convert the array to a List
        List<String> stringList = Arrays.asList(stringArray);

        return stringList;
    }
}

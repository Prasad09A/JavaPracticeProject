package CoreJava.String;

public class StringAllMethods {
    public static void main(String[] args) {
        String str = "java";

        System.out.println("Length of the string is: " + str.length());

        System.out.println("Character at index 0 particular index is: " + str.charAt(0));

        char[] ch = str.toCharArray();
        System.out.println("After converting string to char array: " + ch);

        String name1 = "prasad";
        String name2 = "akash";
        System.out.println("Content of both Strings are: " + name1.equals(name2));
        System.out.println("Equals ignore case: " + name1.equalsIgnoreCase(name2));
        System.out.println("Comparing both strings: " + name1.compareTo(name2));
        System.out.println("Complaining and ignoring case of both Strings: " + name1.compareToIgnoreCase(name2));

        System.out.println("Checks if String contains in it or not: " + name1.contains("ja"));

        System.out.println("Index of particular character j is: " + name1.indexOf("j"));

        System.out.println("Checks if string starts with j prefix: " + name1.startsWith("j"));

        System.out.println("Checks if string ends with a suffix: " + name1.endsWith("a"));

        System.out.println("Convert string into uppercase: " + name1.toUpperCase());

        System.out.println("Convert string into lowercase: " + name1.toLowerCase());

        String people = " s un day ";
        System.out.println("Removes trailing and leading space: " + people.trim());

        System.out.println("Removes spaces from the string: " + people.strip());

        String blank = "";
        System.out.println("check if string is empty or not: " + blank.isEmpty());

        System.out.println("Check if string is  whitespaces or not: " + blank.isBlank());


    }
}

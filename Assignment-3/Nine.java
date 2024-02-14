/*
Write java codes to implement the followings –
Basic string handling concepts- Concept of mutable and immutable string, Methods of String
class-charAt(), compareTo(), equals(), equalsIgnoreCase(), indexOf(), length() , substring().;
toCharArray(), toLowerCase(), toString(), toUpperCase() , trim() , valueOf() methods, 
*/


public class Nine {
    public static void main(String[] args) {
        String immutableString = "Hello";
        
        // Mutable string using StringBuilder
        StringBuilder mutableString = new StringBuilder("World");
        
        // charAt() method
        char charAtIndex = immutableString.charAt(1);
        System.out.println("charAt(1) of immutableString: " + charAtIndex);
        
        // compareTo() method
        int compareToResult = immutableString.compareTo("Hello");
        System.out.println("compareToResult: " + compareToResult);
        
        // equals() method
        boolean isEqual = immutableString.equals("Hello");
        System.out.println("isEqual: " + isEqual);
        
        // equalsIgnoreCase() method
        boolean isEqualIgnoreCase = immutableString.equalsIgnoreCase("HELLO");
        System.out.println("isEqualIgnoreCase: " + isEqualIgnoreCase);
        
        // indexOf() method
        int indexOfSubstring = immutableString.indexOf("l");
        System.out.println("indexOfSubstring: " + indexOfSubstring);
        
        // length() method
        int stringLength = immutableString.length();
        System.out.println("stringLength: " + stringLength);
        
        // substring() method
        String substring = immutableString.substring(1, 3);
        System.out.println("substring: " + substring);
        
        // toCharArray() method
        char[] charArray = immutableString.toCharArray();
        System.out.println("charArray: " + java.util.Arrays.toString(charArray));
        
        // toLowerCase() method
        String lowerCaseString = immutableString.toLowerCase();
        System.out.println("lowerCaseString: " + lowerCaseString);
        
        // toString() method (implicitly called when concatenating with string)
        String toStringResult = mutableString.toString();
        System.out.println("toStringResult: " + toStringResult);
        
        // toUpperCase() method
        String upperCaseString = immutableString.toUpperCase();
        System.out.println("upperCaseString: " + upperCaseString);
        
        // trim() method
        String stringWithSpaces = "   Trim me   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("trimmedString: " + trimmedString);
        
        // valueOf() method
        String valueOfString = String.valueOf(123);
        System.out.println("valueOfString: " + valueOfString);
    }
}

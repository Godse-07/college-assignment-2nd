/*
 Write java codes to implement the followings –
Methods of Stringbuffer class: append(), capacity(), charAt(), delete(), deleteCharAt().;
ensureCapacity(), getChars(), indexOf(), insert(), length(), setCharAt(), setLength(), substring(),
toString().
*/

public class Ten {
    public static void main(String[] args) {
        // Initialize a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // append() method
        stringBuffer.append(" World");
        System.out.println("append() method result: " + stringBuffer);

        // capacity() method
        int capacity = stringBuffer.capacity();
        System.out.println("capacity() method result: " + capacity);

        // charAt() method
        char charAtIndex = stringBuffer.charAt(1);
        System.out.println("charAt() method result: " + charAtIndex);

        // delete() method
        stringBuffer.delete(5, 11);
        System.out.println("delete() method result: " + stringBuffer);

        // deleteCharAt() method
        stringBuffer.deleteCharAt(4);
        System.out.println("deleteCharAt() method result: " + stringBuffer);

        // ensureCapacity() method
        stringBuffer.ensureCapacity(30);

        // getChars() method
        char[] charArray = new char[10];
        stringBuffer.getChars(0, 5, charArray, 0);
        System.out.print("getChars() method result: ");
        System.out.println(charArray);

        // indexOf() method
        int indexOfSubstring = stringBuffer.indexOf("o");
        System.out.println("indexOf() method result: " + indexOfSubstring);

        // insert() method
        stringBuffer.insert(5, " ");
        System.out.println("insert() method result: " + stringBuffer);

        // length() method
        int length = stringBuffer.length();
        System.out.println("length() method result: " + length);

        // setCharAt() method
        stringBuffer.setCharAt(0, 'h');
        System.out.println("setCharAt() method result: " + stringBuffer);

        // setLength() method
        stringBuffer.setLength(3);
        System.out.println("setLength() method result: " + stringBuffer);

        // substring() method
        String substring = stringBuffer.substring(1);
        System.out.println("substring() method result: " + substring);

        // toString() method (implicitly called when concatenating with string)
        String toStringResult = stringBuffer.toString();
        System.out.println("toString() method result: " + toStringResult);
    }
}

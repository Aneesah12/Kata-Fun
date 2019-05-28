package palindrome;

public class Palindrome {
    public static boolean stringIsAPalindrome(String word) {


        if (!isNullOrEmpty(word)) {
            String clean = word.replaceAll("\\s+", "");
            StringBuilder firstWord = new StringBuilder(clean);
            StringBuilder reverse = firstWord.reverse();
            return (reverse.toString().equalsIgnoreCase(clean));
        }
           return false;
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}

//        word = word.trim();
//        StringBuilder firstWord = new StringBuilder(word);
//        StringBuilder reverseWord = firstWord.reverse();
//        return (reverseWord.toString().equalsIgnoreCase(word));


//    String clean = word.replaceAll("\\s+", "");
//    String reverse = "";
//            for (int i = clean.length() - 1; i >= 0; i--) {
//                    reverse += clean.charAt(i);
//                    }
//
//                    if (reverse.equalsIgnoreCase(clean)) {
//                    System.out.println("word is a palindrome");
//                    return true;
//                    }
//                    }
//                    return false;

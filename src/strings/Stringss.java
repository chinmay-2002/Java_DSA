package strings;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Stringss {
    public static void main(String[] args) {

        /**
         *

        String str = "Chinmay";
        String str2 = "Chinmay";
        String str3 = "Madhura";
        String obj1 = new String("Chinmay");

        if(str==str2){
            System.out.println("Equall");
        }
        if(str==obj1){
            System.out.println("equals"); // not executes
        }
        if(str.equals(str2)){
            System.out.println("Equals equals"); // executes
        }
        if(str.equalsIgnoreCase(str2)){
            System.out.println("Ignore case"); // runs
        }



        String s = "c";
//        System.out.println(s.getBytes(StandardCharsets.UTF_8));  // gives bytes
//        System.out.println(s.getBytes());

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

//        System.out.println(str.chars()); //java.util.stream.IntPipeline$Head@5594a1b5
//        System.out.println(str.codePointAt(2)); // address pointer 105
//        System.out.println(str.codePointBefore(2)); // 104



        System.out.println(str.compareTo(str2)); // gives 32 // lexicographically small big
        if(str3.compareTo(obj1) > 0){
            System.out.println("s is big");
        }
         */
        /**
         * Jya object ne point kel tyachyavar thart
         * op jar negatice asel tr object is chota
         * or object is bada
         */
/*
        str2 = "chinmay the one man army";

        System.out.println("----------------------");
        System.out.println(str2.indexOf("the")); //8

        System.out.println(str2.replace("the", ""));

        String str4 = str2.substring(0,8);
        System.out.println(str4);
        str4 = str4.replace(str4, "");
        System.out.println(str4);
        System.out.println("----------------------");
        str3 = "cy";
        System.out.println(s.compareToIgnoreCase(str2)); // gives -6


        System.out.println(str2.concat(s)); // combination concatination

        System.out.println(str2.contains(" one  ") + "Salag havi ka"); // check character contains



        if(str.contentEquals(obj1)){   // need to pass object gives true or false and both should be object
            System.out.println("Kskai");
        }
        if(obj1.equals(str)){
            System.out.println("Yesssssssss");
        }
        if(obj1.contentEquals("Chinmay")){
            System.out.println("Khamosshhh");
        }
        if(str.contains("hi")){ // string pn chalte
            System.out.println("Pakadl");
        }
        System.out.println(str.contains("hi")); // true or false

        System.out.println(str.indexOf("Chi"));

        String strr = "            Chinmay the one man army";

        System.out.println(strr.toLowerCase());
        System.out.println(strr.toUpperCase());

        System.out.println(strr.indexOf('o'));
        System.out.println(strr.indexOf(" "));

        System.out.println(strr.endsWith("army") + " j oker"); // true or false
        System.out.println(strr.lastIndexOf(" "));

        System.out.println(strr.replace("Chinmay", "") + "Zal ");


        System.out.println(strr.replace(" ", "PP"));

        System.out.println(strr.substring(2,6));
//        System.out.println(strr.lines());
        System.out.println(strr.substring(3));
        System.out.println(strr.stripTrailing());


        String brrr = "             joker                ";
        System.out.println(brrr.stripTrailing() + " BRRR");


        System.out.println(strr.stripLeading());
        if(str.equals(obj1)){
            System.out.println("equals");
        }

        System.out.println(strr.repeat(2)); // puna puna 2 times ek string meand repeat like str + str
        strr = "  Hi ia ia o ah ";
        System.out.println(strr.strip()); // donhi kadun strip kart hee
        System.out.println(strr.replace("ia", "")); // delete
        System.out.println(strr.trim() + "zal trim"); */

/**
 *
 *         String btr = "";
 *         String btrr = "       ";
 *         if(btr.isBlank())
 *             System.out.println("Btr is blank");
 *
 *         if(btr.isEmpty())
 *             System.out.println("Btr is empty");
 *
 *         if(btrr.isBlank())
 *             System.out.println("Btr is blank");
 *
 *         if(btrr.isEmpty())
 *             System.out.println("Btr is empty"); // he fakt run nahi hot
 */

        String str = "        Hi hi hi hi hi hi           ";

        System.out.println(str.replace("i", "ello"));
// Eka sarkhch kam
        System.out.println(str.replaceAll("h", "p"));

        // see regular expression


        // Trim method eliminates leading and trailing spaces

        System.out.println(str.trim()); // combination of stripleading and strip trailing

        String [] arr = str.split("\\s", 0);  // split vegvegl kart words na

        for (String a :
                arr) {
            System.out.println(a);
        }

        String bre = String.join(" kutta ", "hi", "bye");


        System.out.println(bre);


        System.out.println(String.format("Hii %d", 52));
        System.out.println(String.format("Hii %f", 52.9098776554445));  // up to 6 only
        System.out.println(String.format("Hii %.19f", 52.9098776554445)); // extras with 0 up to 19
        System.out.println(String.format("Hii %.5f", 52.9098776554445));

        char bb [] = new char[10];
        str.getChars(6,16,bb,0);

        for (char b :
                bb) {
            System.out.println(b);
        }

        /**
         *
         * public class InternExample2 {
         *     public static void main(String[] args) {
         *         String s1 = "Javatpoint";
         *         String s2 = s1.intern();
         *         String s3 = new String("Javatpoint");
         *         String s4 = s3.intern();
         *         System.out.println(s1==s2); // True
         *         System.out.println(s1==s3); // False
         *         System.out.println(s1==s4); // True
         *         System.out.println(s2==s3); // False
         *         System.out.println(s2==s4); // True
         *         System.out.println(s3==s4); // False
         *     }
         *
         *
         *
         *     String s = "d".intern();
         *     String p = "d"; // compiler treats it as String p = "d".intern();
         *     System.out.println(s == p); // prints true
         */
    }
}

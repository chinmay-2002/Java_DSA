package strings;

public class BuilderStrings {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Chinmay the one man army");
        StringBuffer bf = new StringBuffer("Jio dhan dhaana dhan");
//        String builder is more optimal than string buffer read theory and both have same kind of functions
        str.append("koka");

        str.delete(4,9);

        str.deleteCharAt(1); // h deleted

        str.reverse(); // reverse
        str.delete(6,7);
        System.out.println(str.capacity());
        System.out.println(str);
        str.replace(0,1, "Chin");
//        str.trimToSize();
        System.out.println(str.subSequence(1,3));

        System.out.println(str);
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 16));
        System.out.println(str.subSequence(5,16));
        str.setCharAt(0, 'K');
        System.out.println(str);
    }
}

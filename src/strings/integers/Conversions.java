package strings.integers;

public class Conversions {
    public static void main(String[] args) {
        String str = "-90";
//        int n = (int) str;   // illegal

        int b = Integer.parseInt(str);
        int c = Integer.valueOf(str);
        String h = String.valueOf(b);
        String l = Integer.toString(b);
        System.out.println(b+c+h);//-180-90
        System.out.println(h+b+c);//-90-90-90

        int j = 98;
        int i=200;
        String s=String.format("%d",i);
        System.out.println(s);

        /**
         * Long.parseLong()
         * String.valueOf()
         * Long.toString()
         *
         */
//        String h =

    }
}

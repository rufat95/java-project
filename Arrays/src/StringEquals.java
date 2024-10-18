public class StringEquals {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");

        System.out.println(a==b); // true
        System.out.println(a==c); // false
        System.out.println(c==d); // false
        System.out.println(a.equals(b)); // ture
        System.out.println(a.equals(c)); // ture
        System.out.println(c.equals(d)); // ture

    }
}

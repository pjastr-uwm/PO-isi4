public class H7 {

    public static void main(String[] args) {
        System.out.println(foo(null));
        System.out.println(foo(""));
        System.out.println(foo("a"));
        System.out.println(foo("ww"));
        System.out.println(foo("rgfdhfgg44"));
    }

    public static boolean foo(String napis)
    {
        if (napis == null || napis.length() <2)
            return false;
        return napis.charAt(0) == napis.charAt(napis.length()-1);
     }
}

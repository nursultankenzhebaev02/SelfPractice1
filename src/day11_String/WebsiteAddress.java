package day11_String;

public class WebsiteAddress {

    public static void main(String[] args) {

        String url = "www.nurikken.com";

        boolean r1 = url.startsWith("www.");

        System.out.println(r1);

        boolean r2 = url.endsWith(".edu");

        System.out.println(r2);

    }

}

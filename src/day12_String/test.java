package day12_String;

import java.util.Scanner;

public class test {

        public static void main(String[] args) {

            emailDomain();


        }

        public static void emailDomain() {

            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            String emailDomain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
            System.out.println("domain: " + emailDomain);
        }


    }

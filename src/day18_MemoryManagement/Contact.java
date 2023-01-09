package day18_MemoryManagement;

public class Contact {

    public static void main(String[] args) {

        Contact con = new Contact();

        con.setInfo("Mark", "mark@gmail.com", 2131414123);

        con.call();
        con.sendEmail();
        con.sendMessage();

    }


        public String name;

        public int phoneNumber;

        public String email;

        public void setInfo (String name, String email,int phoneNumber){

            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;

        }

        public void call () {

            System.out.println("Calling " + name + " now");

        }

        public void sendMessage () {

            System.out.println("Sending message to " + phoneNumber + " now");

        }

        public void sendEmail () {

            System.out.println("Sending email to " + email + " now");

        }


}
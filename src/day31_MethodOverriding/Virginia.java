package day31_MethodOverriding;

public class Virginia extends State{

   public Virginia(){

       super("Virginia", "VIA", "IDK", "Me", "Him", 200000, 20);



   }

    public static void main(String[] args) {

       Virginia virginia = new Virginia();

        System.out.println(virginia);

    }

}

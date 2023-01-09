package day31_MethodOverriding;

public class California extends State{

    public California(){

        super("California","CA","Democrat Party","Gavin Newsom","Dianne Feinstein",39000000,7.25);


    }

    public static void main(String[] args) {

        California california = new California();

        System.out.println(california);

    }

}

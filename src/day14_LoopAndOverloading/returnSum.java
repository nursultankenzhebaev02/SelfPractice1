package day14_LoopAndOverloading;

public class returnSum {

    public static void main(String[] args) {

    sumOf("A1B2C3D4F5G6");
}

    public static int sumOf(String sentence) {
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
                sum += (sentence.charAt(i) - 48);
            }
        }System.out.println("Sum = " + sum);
        return sum;
    }

}

package day18_MemoryManagement;

public class Carpet {

    public static void main(String[] args) {

        Carpet carpet = new Carpet();

        carpet.setInfo(3, 5, 4, true);

        System.out.println(carpet);

        Carpet carpet1 = new Carpet();

        carpet1.setInfo(3, 5, 4, false);

        System.out.println(carpet);

        System.out.println(carpet1);

    }

    public int width;
    public int length;
    public int unitPrice;
    public boolean isPersian;

    public void setInfo(int width, int length, int unitPrice, boolean isPersian){

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public double calCost(){

        double totalCost = (width * length) * unitPrice;
        if (isPersian == true) {
            totalCost += 200 + unitPrice;
        }

        return totalCost;

    }

    public String toString(){

        return "Carpet: " + "\n\tWidth: " + width + "\n\tlength: " + length + "\n\tUnit Price: " + unitPrice + "\n\tIs Persian: " + isPersian + "\n\tTotal cost: " + calCost();

    }

}

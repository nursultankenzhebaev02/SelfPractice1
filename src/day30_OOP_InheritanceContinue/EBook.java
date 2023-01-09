package day30_OOP_InheritanceContinue;

public class EBook extends Book{

    private int size, page;

    public EBook(String title, String type, String author, double price, int size, int page) {
        super(title, type, author, price);
        setPage(page);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage(){

        return page;

    }

    public void setPage(int page) {

        if (page < 0){

            System.err.println("Pages can not be set to zero or negative");
            System.exit(1);
        }
        this.page = page;
    }

    public void readBook(){

        System.out.println(getTitle() + " is a great book");

    }

    @Override
    public String toString() {
        return "EBook{" +
                "size=" + size +
                ", page=" + page +
                '}';
    }

    public static void main(String[] args) {

        EBook eBook = new EBook("Harry Potter", "Lol", "Loranc", 2000, 20, 200);

        System.out.println(eBook);

    }

}

package pl.bookstore.zad14;

class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("Pan Tadeusz", "Adam Mickiewicz",
                2000, "Znak", 300);
        b1.showInformation();
        b1.setAuthor("dfgf");
        b1.showInformation();
    }
}

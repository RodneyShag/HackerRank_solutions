//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

class MyBook extends Book {
    int price;
    
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

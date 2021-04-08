import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgramBook[] book = new ProgramBook[10];
        book[0] = new ProgramBook("book1",17,"C");
        book[1] = new ProgramBook("book2",15,"C++");
        book[2] = new ProgramBook("book3",16,"C#");
        book[3] = new ProgramBook("book4",18,"java");
        book[4] = new ProgramBook("book5",30,"Python");
        book[5] = new ProgramBook("book6",45,"java");
        book[6] = new ProgramBook("book7",15,"PHP");
        book[7] = new ProgramBook("book8",19,"java");
        book[8] = new ProgramBook("book9",26,"java");
        book[9] = new ProgramBook("book10",23,".Net");
        int total = 0;
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            total += book[i].getPrice();
        }
        System.out.println("total prine = " + total);
        for (int i = 0; i < book.length; i++) {
            if (book[i].getLanguage() == "java"){
                System.out.println("language of book is " + book[i].getName());
                count++;
            }
        }
        System.out.println("Enter your money");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        for (int i = 0; i < book.length; i++) {
            if(book[i].getPrice() < money){
                System.out.println("Price book lower than your money is " + book[i].getName());
            }
        }
    }
}

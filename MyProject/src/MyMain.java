import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        mList obj=new mList();
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to DBC's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.print("Press 5 to exi program:-    ");
        int s=sc.nextInt();
        sc.nextLine();
        while (s!=5){
            switch (s){
                case 1:
}

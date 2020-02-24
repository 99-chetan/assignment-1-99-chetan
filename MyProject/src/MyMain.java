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
                    System.out.println("You have chosen to add a new contact:");
                    System.out.println("Please enter the name of the Person");
                    System.out.print("First Name: ");
                    String fname=sc.nextLine();
                    System.out.print("Last Name: ");
                    String lname=sc.nextLine();
                    Person person=new Person(fname,lname);
                    System.out.print("Contact Number: ");
                    String con=sc.nextLine();
                    person.setConNumber(con);
}

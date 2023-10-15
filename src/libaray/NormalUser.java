package libaray;

import java.util.Scanner;

public class NormalUser extends user
{

    public NormalUser(String name) { // empty constructor inherited from superclass user
        super(name);
        this.operations = new IOOperation[]{
                new viewBooks(),
                new Search(),
                new placeOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()

        };
    }

    public NormalUser(String name, String email, String phoneNumber) {

        super(name, email, phoneNumber);
        this.operations = new IOOperation[]{
                new viewBooks(),
                new Search(),
                new placeOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }


    @Override
    public void menue(Database database, user user)
    {
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. place order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        this.operations[n-1].oper(database,user);// this.operation = refers to the array of operations
        //[n] access specific operation at index n, depends on the choice the user will enter from the menue
        // in a nutshell, the above lines means that " perform the operations at index n in the array of operation
        // The specific action that the operation performs depends on how the oper() method is implemented in the class of the operation object at index n

        s.close(); // close the s Obj from Scanner class when done.



    }
}

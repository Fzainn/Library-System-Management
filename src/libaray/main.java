package libaray;

import java.util.Scanner;

public class main
{
    static Scanner s;
    static Database database;

    public static void main(String[] args)
    {
        database = new Database();
        System.out.println("Welcome to the Library!");

        int num;
//        do{
//            System.out.println("0.Exit\n"
//                    +"1.Login: \n 2.New User:");
//            s = new Scanner(System.in);
//            num = s.nextInt(); // define variable int n and store it in s Obj from type Scanner
//
//            switch (num){
//                case 1 : login();
//                //break;
//                case 2 : newuser();
//                //break;
//            }
//
//        }while (num!=0);



    }
    public static void login()
    {
        System.out.println("Enter your email :");
        String email = s.next();
        System.out.println("Enter your phoneNumber:");
        String phoneNumber = s.next();
        int n = database.login(phoneNumber, email); // calling login method on an int Obj referred to database Obj defined above(we took it from Database class)
                                                  // passing phoneNumber,email as an Arg

        if (n!=-1){// If the login is successful n will be a non-negative value (typically an index or user ID)
            user user = database.getUser(n);
            user.menue(database,  user);
        }else{
            System.out.println("User Does not Exist!");
        }

    }


    public static void newuser()
    {
        System.out.println("Enter your Name:");
        String name = s.next(); // every input user will enter, it’ll be stored in Obj s(from class Scanner) we defined above
        System.out.println("Enter your email:");
        String email = s.next();
        System.out.println("Enter phoneNumber:");
        String phoneNumber = s.next();
        System.out.println("1.Admin:\n 2.Normal User:");
        int n2 = s.nextInt();
        user user = null;

        if (n2==1)
        {
            user Admin = new Admin(name, email, phoneNumber); // create an Obj from user class that refers/points for Admin class
        }else
        {
            user = new NormalUser(name, email, phoneNumber); // create an Obj from user class that refers/points for user class
        }
        database.AddUser(user);
        user.menue(database, user);

    }
}

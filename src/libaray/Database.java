package libaray;

import sun.security.tools.keytool.Main;

import java.io.File;
import java.util.ArrayList;

public class Database
{
    private ArrayList<user> users = new ArrayList<user>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> booknames = new ArrayList<String>();



   private File usersfile = new File(Main.class.getClassLoader().getResource("users").getFile());
   private File Booksfile = new File(Main.class.getClassLoader().getResource("Books").getFile());



   public Database()
   {
       if (!usersfile.exists()){
           usersfile.mkdir();
       }
       if (!Booksfile.exists()){
           Booksfile.mkdir();
       }

   }




    public void AddUser(user s)
    {
        users.add(s);
        usernames.add(s.getName());


    }

    public int login(String phoneNumber, String email)
    {
        int n = -1;
        for (user s : users ){ // for-each loop for looping through users Arraylist to check, if email and phoneNumber matching
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)){
                n = users.indexOf(n); // if they match, get the index of n(index of the user) from the users Arraylist.
                break;
            }
        }
        return n;

    }

    public user getUser(int n) // method to retrieve the user Obj from Arraylist
    {
        return users.get(n);

    }


    public void AddBook(Book book){
        books.add(book);
        booknames.add(book.getName());

    }


}

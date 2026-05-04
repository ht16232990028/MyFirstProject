package service;
import model.User;
import model.Email;
import java.util.ArrayList;

public class EmailService {
    ArrayList<Email> inbox=new ArrayList<>();

    public boolean login(User user){
        return user.getEmail().equals("admin@gmail.com")
                && user.getPassword().equals("1234");
    }
    public void sendEmail(String from,String to,String message){
        inbox.add(new Email(from, to, message));
    }
    public ArrayList<Email> getInbox() {
        return inbox;
    }
}

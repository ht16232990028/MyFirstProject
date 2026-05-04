package model;

public class User {
    private String email;
    private  String Password;

    public User(String email, String password) {
        this.email = email;
        this.Password = password;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return Password;
    }
}
//In Java, String is not limited to only letters.
//A String can store:
//Letters → a–z, A–Z
//Numbers → 0–9
//Special characters → @, ., _, -
//Any combination of them
//👉 Email is a combination of characters, not a number used for calculations.
//So String is the correct and safest data type.

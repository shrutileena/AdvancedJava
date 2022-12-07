package Programs.com.example.Contact;

public class Main {
    
    public static void main(String[] args) {
        
        Contact contactOne = new Contact("Shruti Agarwal", 
        new PhoneNumber("9178573837"), "shrutileena@gmail.com");

        Contact contactTwo = new Contact("Abhay Malhotra", new PhoneNumber("919158197645"));

        Contact contactThree = new Contact("Abhi Sharma", "abhiSharma@gmail.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
    }
}

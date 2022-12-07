package Programs.com.example.Contact;

public class PhoneNumber {
    
    private String phoneNumber;
    private int countryCode;

    public PhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 10) {
            this.countryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length()-10));
            this.phoneNumber = phoneNumber.substring(phoneNumber.length() - 10);
        } else {
            this.countryCode = 0;
            this.phoneNumber = phoneNumber;
        }
    }

    public PhoneNumber(String phoneNumber, int countryCode) {
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "PhoneNumber [phoneNumber=" + phoneNumber + ", countryCode=" + countryCode + "]";
    }

    
}

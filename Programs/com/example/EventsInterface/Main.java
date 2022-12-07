package Programs.com.example.EventsInterface;

public class Main {
    
    public static void main(String[] args) {
        
        PasswordChangeEvent eventOne = new PasswordChangeEvent("3737982172");
        AccountTransferEvent eventTwo = new AccountTransferEvent("1639826914");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("3269174212");

        Event[] events = {eventOne, eventTwo, eventThree};

        for(Event e : events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}

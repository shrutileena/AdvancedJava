package Programs.com.example.EventsInterfaceAndAbstraction;

//import java.sql.Timestamp;

public class MissedPaymentEvent extends EventAbstractClass {

    public MissedPaymentEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment. " + 
         "Sending the bill to the customer.");
    }
    
}

// public class MissedPaymentEvent implements Event {
    
//     private final long createdTimeStamp;
//     private final String id;

//     public MissedPaymentEvent(String id) {
//         this.id = id;
//         this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
//     }

//     @Override
//     public Long getTimeStamp() {
//         return this.createdTimeStamp;
//     }

//     @Override
//     public void process() {
//         System.out.println("Customer " + id + " missed their payment. " + 
//         "Sending the bill to the customer.");
//     }

// }

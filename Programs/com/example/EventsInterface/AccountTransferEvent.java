package Programs.com.example.EventsInterface;

import java.sql.Timestamp;

public class AccountTransferEvent implements Event {
    
    private final long createdTimeStamp;
    private final String id;

    public AccountTransferEvent(String id) {
        this.id = id;
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }
    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer their service. " + 
        "Reaching out to CTE to remove service from old device and add service to new device.");
    }


}

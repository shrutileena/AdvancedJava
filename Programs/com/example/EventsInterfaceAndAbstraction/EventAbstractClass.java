package Programs.com.example.EventsInterfaceAndAbstraction;

import java.sql.Timestamp;

public abstract class EventAbstractClass implements Event {
    
    protected long createdTimeStamp;
    protected String id;

    public EventAbstractClass(String id) {
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }

    public abstract void process();
}

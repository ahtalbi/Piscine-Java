import java.util.List;
import java.util.ArrayList;

public class DecimalBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public DecimalBaseObserver() {
        events = new ArrayList<>();
    }

    public void updateState(int state) {
        events.add("" + state);
    }
    
    public List<String> getEvents() {
        return events;
    }
}
import java.util.List;
import java.util.ArrayList;

public class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public BinaryBaseObserver() {
        events = new ArrayList<>();
    }

    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }

    public List<String> getEvents() {
        return events;
    } 
}
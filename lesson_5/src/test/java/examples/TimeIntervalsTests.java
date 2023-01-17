package examples;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TimeIntervalsTests {
    

    @Test
    public void shouldSelectOnlyIntervalsFullyWithin() {
        fail();
    }

    @Test
    public void shouldReturnEmptyIfAllIntervalOutside() {
        float[] intervals = new float[] {5.0f, 6.0f};
        List<Float> newList = TimeIntervals.getIntervalsBetween(intervals, 0, 0.1f);
        assertEquals(0, newList.size());
    }

    public void shouldThrowOnInvalidIntervals() {
        fail();
    }

    public void shouldThrowOnEndBeforeStart() {
        fail();
    }

    public void shouldThrowOnNegativeFloats() {

    }

    public void shouldTHrowOnNaNInterval() {

    }

    public void shouldThrowOnInfinity() {

    }

    public void shouldWorkOnUnclosedEndInterval() {

    }

    


}

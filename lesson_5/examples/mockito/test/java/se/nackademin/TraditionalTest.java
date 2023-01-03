package se.nackademin;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TraditionalTest {
  
    @Test
    public void shouldSetNumberToTen() {
        Traditional traditional = new Traditional();
        assertEquals(10, traditional.getNumber());
    }

    @Test
    public void shouldWorkIfWorkerIsSet() throws Exception {
        Worker workerMock = mock(Slow.class);
        Traditional traditional = new Traditional();
        traditional.setWorker(workerMock);
        assertEquals(10, traditional.doWork());
    }

    @Test
    public void shouldAddWorkerResultToNumber() {
        Worker workerMock = mock(Slow.class);
        when(workerMock.work()).thenReturn(5);

        Traditional traditional = new Traditional();
        traditional.setWorker(workerMock);
        assertEquals(15, traditional.doWork());
    }

    @Test
    public void shouldFailIfWorkerIsMissing() {
        Traditional traditional = new Traditional();
        assertThrows(NullPointerException.class, () -> {
            traditional.doWork();
        });
    }    

}

package se.nackademin;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SlowTest {

    @Test
    public void shouldSumTenAndWorkResult() throws Exception {
        Slow spy = spy(Slow.class);
        // Comment out the following line and run mvn test
        doReturn(1).when(spy).work();
        doReturn(1).when(spy).conditionalReturn(1);
       
        assertEquals(12, spy.moreWork(1));
        verify(spy, times(1)).work();
        verify(spy, times(1)).moreWork(1);
        verify(spy, times(1)).conditionalReturn(1);
    }

    @Test
    public void shouldReturnZeroOnConditionalAboveTen() throws Exception {
        Slow spy = spy(Slow.class);
        // This removes the 9s sleep
        doReturn(1).when(spy).work();

        assertEquals(0, spy.moreWork(10));
        verify(spy, times(1)).work();
        verify(spy, times(1)).conditionalReturn(10);
    }

    @Test
    public void shouldReturnSumWithZeroOnWorkFailure() {
        Slow spy = spy(Slow.class);
        // Comment out the following line and run mvn test
        doReturn(0).when(spy).work();
       
        assertEquals(11, spy.moreWork(1));
        verify(spy, times(1)).work();
        verify(spy, times(1)).moreWork(1);
    }

    @Test
    public void shouldThrowIfConditionalValueIsTen(){
        Exception ex = assertThrows(Exception.class, ()->{
            Slow slow = new Slow();
            slow.conditionalReturn(10);
        });
        assertEquals("Value greater or equal to 10 is not allowed", ex.getMessage());
    }

}

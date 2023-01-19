package examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PathSplitterTests {

    @Test
    public void shouldSplitNormalPath() {
        // Arrange
        String p = "/files/myfile.txt";
        String[] exp = new String[] {"/files", "myfile", "txt"};
        // Act
        String[] out = PathSplitter.splitPath(p);
        // Assert
        assertArrayEquals(exp, out);
    }

    @Test
    public void shouldSplitWindowsPath() {
        // Arrange
        String p = "c:\\\\files\\myfile.txt";
        String[] exp = new String[] {"c:\\\\files", "myfile", "txt"};
        // Act
        String[] out = PathSplitter.splitPath(p);
        // Assert
        assertArrayEquals(exp, out);
    }
}

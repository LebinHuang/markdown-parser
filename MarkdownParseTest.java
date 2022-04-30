import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        test.add("https://something.com");
        test.add("some.html");
        assertEquals(test, links);
    }

    @Test
    public void getLinks2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        test.add("https://something.com");
        test.add("some-page.html");
        System.out.println("Test2: "+links);
        assertEquals(test, links);
    }

    
}
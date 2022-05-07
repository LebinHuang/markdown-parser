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
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        test.add("https://something.com");
        test.add("some-thing.html");
        assertEquals(test, links);
    }

    @Test
    public void getLinks2() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        test.add("https://something.com");
        test.add("some-page.html");
        System.out.println("Test2: "+links);
        assertEquals(test, links);
    }

    @Test
    public void getLinks3() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        System.out.println("Test3: "+links);
        assertEquals(test, links);
        
    }
    
    @Test
    public void getLinks4() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();;
        System.out.println("Test4: "+links);
        assertEquals(test, links);
    }

    @Test
    public void getLinks5() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        test.add("page.com");
        System.out.println("Test5: "+links);
        assertEquals(test, links);
    }
    @Test

    public void getLinks6() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        System.out.println("Test6: "+links);
        assertEquals(test, links);
    }

    @Test
    public void getLinks7() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        System.out.println("Test7: "+links);
        assertEquals(test, links);
    }

    

    @Test
    public void getLinks9() throws IOException{
        Path fileName = Path.of("/Users/huanglebin/Documents/GitHub/markdown-parser/test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> test = new ArrayList<>();
        System.out.println("Test8: "+links);
        assertEquals(test, links);
    }
}
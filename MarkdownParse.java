//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            int open = markdown.indexOf("<", currentIndex);
            int close = markdown.indexOf(">", open);
            int test = markdown.indexOf("!",currentIndex);
            int test1 = markdown.indexOf("`", currentIndex);
            
            if (openBracket != -1 && openParen != -1 && test != openBracket -1 && test1 > openBracket ) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;
            }
            
            
            else if (open != -1){
                toReturn.add(markdown.substring(open + 1, close));
                currentIndex = close + 1;
            }
            else{
                currentIndex = markdown.length();
            }
            
        }
        
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Graph graph = new Graph(reader.txtFiles, reader.root);
        graph.getAnswer();
    }
}
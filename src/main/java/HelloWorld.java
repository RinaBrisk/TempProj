
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class HelloWorld {

    private String report;
    private static Map<String, String> coverage;

    public static void main(String[] argv) {
        System.out.println("Hello world");
        System.out.println(sum(2, 5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
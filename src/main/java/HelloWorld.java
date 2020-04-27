
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class HelloWorld {

    private String report;
    private static Map<String, String> coverage;

    private static final String TEST_COVERAGE = "TestCoverage";
    private static final String JENKINS_URL = "http://localhost:8081/jenkins";
    private static final String COVERAGE_REPORT_PATH = "C:/Users/Rina/.jenkins/workspace/TestCoverage/target/site/cobertura/frame-sourcefiles.html";
    private static final String COVERAGE_REPORT_URL = JENKINS_URL + "/job/" + TEST_COVERAGE + "/lastSuccessfulBuild/artifact/target/site/cobertura/index.html";

    public static void main(String[] argv) throws IOException {
        System.out.println("Hello world");
        System.out.println(sum(2, 5));
    }

    public static int sum(int a, int b) throws IOException {
        return a + b;
    }

}
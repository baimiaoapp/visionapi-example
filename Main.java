import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String args[]) throws IOException {
        Path path = Paths.get("./example.png");
        byte[] fileContent = Files.readAllBytes(path);
        byte[] first10Bytes = Arrays.copyOfRange(fileContent, 0, 10);
        String first10BytesB64 = Base64.getEncoder().encodeToString(first10Bytes);
        byte[] last10Bytes = Arrays.copyOfRange(fileContent, fileContent.length - 10, fileContent.length);
        String last10BytesB64 = Base64.getEncoder().encodeToString(last10Bytes);

        String input = first10BytesB64 + fileContent.length + last10BytesB64;
        System.out.println(input);
        // iVBORw0KGgoAAA==5331209AABJRU5ErkJggg==
    }
}
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Scanner;


public class Main {
    public static PrintStream cout = System.out;
    public static InputStream cin = System.in;
    public static PrintStream cerr = System.err;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(cin);
        while (true) {
            cout.println("Enter a URL:");
            String data = urlToString(scanner.nextLine());
            cout.println(data);
            cout.println("-----");
            cout.print(data.trim().split("\\s+").length);
            cout.println(" words.");
            int instances = 0;
            for (String word : data.trim().split("\\s+")) {
                if (word.trim().toLowerCase().startsWith("prince")) {
                    instances++;
                }
            }
            cout.print(instances);
            cout.println(" instances of the dead prince.");
        }
    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
                    } catch (IOException e) {
                    return "";
                    }
                    String contents = urlScanner.useDelimiter("\\A").next();
                    urlScanner.close();
                    return contents;
                    }
                    }

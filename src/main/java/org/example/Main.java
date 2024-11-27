import java.io.*;


public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <file>");
            System.exit(1);
        }

        String filePath = args[0];

        try {
            Reader reader = new FileReader(filePath);

            Lexer lexer = new Lexer(reader);
            parser p = new parser(lexer);

            p.parse();

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

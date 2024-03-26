package stringuri;

public class Application {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("d".matches("[^abc]"));
        System.out.println("s".matches("[a-z]"));
        System.out.println("D".matches("[a-zA-Z]"));
        System.out.println("aB".matches("[a-z][A-Z]"));
        System.out.println("abbbbac".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abcab".matches("[abc]{5}"));
        System.out.println("abcabcabcabc".matches("[abc]{5,}"));
        System.out.println("abcabc".matches("[abc]{5,10}"));

        String str = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println("Lungimea string-ului este: " + str.length());
        System.out.println("Are doar litere mari si mici: " + str.matches("[a-zA-Z]+"));


        var cuvinte = str.trim().split(" ");
        System.out.println(cuvinte[cuvinte.length / 2 - 1] + " " + cuvinte[cuvinte.length / 2 ]);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str);
        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}

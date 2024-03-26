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
    }
}

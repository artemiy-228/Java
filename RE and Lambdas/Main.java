import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*regular expressions

         */
        System.out.println(ReComparator.Email("artemsm174@gmail.com"));
        System.out.println(ReComparator.Email("artemsm..174@gmail.com"));
        System.out.println(ReComparator.Replacer("function is good"));
        Map<String, Integer> words = ReComparator.Splitter("My, crew, is, on, fired, up, I, loveu, u, Ich, Liebe, Dich");
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        /*
         lambdas
         */
        checkNumber checker = (number) -> number % 13 == 0;
        longerString compare = (a, b) -> a.length() > b.length() ? a : b;
        IFunction discriminant = (a, b, c) -> b * b - 4 * a * c;
        IFunction function1 = (a, b, c) -> a * Math.pow(b, c);

        System.out.println(checker.check(13));
        System.out.println(compare.biggerString("123", "12345"));
        System.out.println(discriminant.calculate(1, -4, 4));
        System.out.println(function1.calculate(2, 2, 2));

    }
}
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println("words: " + words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        System.out.println("---------------------------------------------");

        ArrayList<String> words2 = new ArrayList<String>();
        words2.add("to");
        words2.add("too");
        words2.add("stool");
        words2.add("tools");
        System.out.println("words2: " + words2);
        WordChecker y = new WordChecker(words2);
        System.out.println(y.isWordChain());
        System.out.println("---------------------------------------------");

        ArrayList<String> words3 = new ArrayList<String>();
        words3.add("catch");
        words3.add("bobcat");
        words3.add("catchacat");
        words3.add("cat");
        words3.add("at");
        System.out.println("words3: " + words3);
        WordChecker z = new WordChecker(words3);
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));
    }
}

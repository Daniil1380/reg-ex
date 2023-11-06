import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "123 456 66433 56640";
        String regEx = "[0-9]+";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);


        //System.out.println(matcher.matches()); //валидация
        //System.out.println(matcher.find()); // поиск информацию по строке

        //System.out.println(matcher.group());

        //System.out.println(matcher.find());

        //System.out.println(matcher.group());

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
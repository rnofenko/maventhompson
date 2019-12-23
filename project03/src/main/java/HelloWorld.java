import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        String text = "hello world";
        System.out.println(text);
        System.out.println(StringUtils.capitalize(text));
    }
}
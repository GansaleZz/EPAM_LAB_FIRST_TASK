import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }

    public static void main(String[] args) {
        Utils.isAllPositiveNumbers("12", "79");
    }
}

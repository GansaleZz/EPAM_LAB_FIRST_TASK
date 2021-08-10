import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str){
        if(NumberUtils.isCreatable(str)){
            return !str.contains("-");
        }else{
            return false;
        }
    }
}

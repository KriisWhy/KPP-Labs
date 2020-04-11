package sample;

import java.util.regex.Pattern;

public class Exceptions {



    public static boolean getCartesian(String s) {

        if (s.contains("e^")) return false;
        else return true;
    }

    public static boolean getExponencial(String s) {
        if (s.contains("e^")) return true;
        else return false;
    }

    public static String containsComplexString(String s) {
        s = s.trim();
        if(getCartesian(s)) return "CARTESIAN";
        else return "EXPONENCIAL";
    }
}
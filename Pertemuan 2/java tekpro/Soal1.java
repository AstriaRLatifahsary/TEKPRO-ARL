
import java.util.ArrayList;
import java.util.List;

public class Soal1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(System.console().readLine());
            System.out.println(findFittingDatatypes(n));
        }
    }

    public static String findFittingDatatypes(long n) {
        List<String> fittingDatatypes = new ArrayList<>();
        if (Byte.MIN_VALUE <= n && n <= Byte.MAX_VALUE) {
            fittingDatatypes.add("byte");
        }
        if (Short.MIN_VALUE <= n && n <= Short.MAX_VALUE) {
            fittingDatatypes.add("short");
        }
        if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
            fittingDatatypes.add("int");
        }
        if (Long.MIN_VALUE <= n && n <= Long.MAX_VALUE) {
            fittingDatatypes.add("long");
        }
        if (fittingDatatypes.isEmpty()) {
            return "N can't be fitted anywhere";
        }
        return "N can be fitted in:\n* " + String.join("\n* ", fittingDatatypes);
    }
}


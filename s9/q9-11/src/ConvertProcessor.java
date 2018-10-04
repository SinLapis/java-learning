import java.util.Arrays;

class Convert {
    String convert(String origin) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < origin.length() - 1; i += 2) {
            result.append(origin.charAt(i + 1));
            result.append(origin.charAt(i));

        }
        if (origin.length() % 2 == 1) {
            result.append(origin.charAt(origin.length() - 1));
        }
        return result.toString();
    }
}

class ConvertAdapter implements Processor {
    Convert c = new Convert();

    @Override
    public String name() {
        return "Convert";
    }

    @Override
    public String process(Object input) {
        return c.convert((String) input);
    }
}

public class ConvertProcessor {
    public static void main(String[] args) {
        String s = "test for convert";
        Apply.process(new ConvertAdapter(), s);
    }
}

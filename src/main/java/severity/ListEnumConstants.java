package severity;

public class ListEnumConstants {


    public static void main(String[] args) {
        for(Severity s : Severity.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            System.out.println(name + "(" + ordinal + ")");
        }

        Severity s1 = Severity.LOW;
        Severity s2 = Severity.HIGH;
        // s1.compareTo(s2) returns s1.ordinal() - s2.ordinal()
        int diff = s1.compareTo(s2);
        if (diff > 0) {
            System.out.println(s1 + " occurs after " + s2);
        }
        else {
            System.out.println(s1 + " occurs before " + s2);
        }

    }

    /**
     * LOW(0)
     * MEDIUM(1)
     * HIGH(2)
     * URGENT(3)
     *
     * LOW occurs before HIGH
     *
     */



}

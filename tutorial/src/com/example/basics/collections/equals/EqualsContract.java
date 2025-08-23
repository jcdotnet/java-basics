package com.example.basics.collections.equals;

public class EqualsContract {

    public static void main(String[] args) {
        String x = "contract";
        String y = "contract";
        String z = "contract";

        // 1. Reflexive
        System.out.println(x.equals(x) == true);

        // 2. Symmetric
        System.out.println(x.equals(y) && y.equals(x));

        // 3. Transitive
        System.out.println(x.equals(y) && y.equals(z) && x.equals(z));

        // 4. Consistent
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));

        //5. Non-nullity
        System.out.println(x.equals(null)); // false
    }
}

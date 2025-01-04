package JAVA_Programs;

public class Compress_Programs {
    public static void main(String[] args) {

        //FIrst Program- Encoder Program
        /*
        Expalination:
         */
/*

        String input = "a3b2x2";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if next character is a digit
            if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                int repeat = Character.getNumericValue(input.charAt(i + 1));
                // Append currentChar 'repeat' times
                for (int j = 0; j < repeat; j++) {
                    output.append(currentChar);
                }
                i++;  // Skip the digit
            } else {
                output.append(currentChar);
            }
        }

        System.out.println(output.toString());
    }
}
*/
        /*
        Second Program-Decoder Program
        Input--String given=aabbbccc
        Output-a2b2c3
         */

        String a = "aaabbcccd";
        StringBuilder sb = new StringBuilder();

        // Establish invariant for k == 0.
        int runLen = 1;
        char runChar = a.charAt(0);

        // Advance k, re-establishing invariant for each step.
        for (int k = 1; k < a.length(); k++) {
            if (a.charAt(k) == runChar) {
                ++runLen;
            } else {
                sb.append(runChar).append(runLen);
                runLen = 1;
                runChar = a.charAt(k);
            }
        }
        // Output the final run to get from invariant to required answer.
        sb.append(runChar).append(runLen);
        System.out.println(sb.toString());
    }
}



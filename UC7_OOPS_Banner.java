import java.util.HashMap;
import java.util.Map;

public class UC7_OOPS_Banner {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Centralized Map
    private static Map<Character, CharacterPattern> characterMap = new HashMap<>();

    // Initialize patterns
    static {
        characterMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        characterMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        characterMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";

        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = characterMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
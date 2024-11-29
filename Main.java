public class Main {

    // Завдання 1: Перевірка паліндрома
    public static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("\\s+", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Завдання 2: Кількість голосних у рядку
    public static int countVowels(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Завдання 3: Реверс рядка
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Завдання 4: Перевірка порожнього рядка
    public static boolean isEmptyOrWhitespace(String s) {
        return s == null || s.trim().isEmpty();
    }

    // Завдання 5: Підрахунок літер у рядку
    public static int countLetters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    // Завдання 6: Повторення рядка
    public static String repeatString(String s, int n) {
        return s.repeat(n);
    }

    // Завдання 7: Перевірка початку і кінця
    public static boolean checkStartAndEnd(String s, char start, char end) {
        return s.charAt(0) == start && s.charAt(s.length() - 1) == end;
    }

    // Завдання 8: Видалення пробілів
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s+", "");
    }

    // Завдання 9: Дублювання кожного символу
    public static String duplicateCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    // Завдання 10: Заміна цифр на зірочки
    public static String replaceDigitsWithAsterisks(String s) {
        return s.replaceAll("\\d", "*");
    }

    // Завдання 11: Перевірка анаграми
    public static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }

    // Завдання 12: Стиснення рядка
    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1)).append(count);
        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    // Завдання 13: Знайти найдовший спільний підрядок
    public static String longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int length = 0;
        int end = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > length) {
                        length = dp[i][j];
                        end = i;
                    }
                }
            }
        }
        return s1.substring(end - length, end);
    }

    // Демонстрація роботи
    public static void main(String[] args) {
        System.out.println("Завдання 1: Перевірка паліндрома");
        System.out.println(isPalindrome("А роза упала на лапу Азора")); // true

        System.out.println("\nЗавдання 2: Кількість голосних у рядку");
        System.out.println(countVowels("hello world")); // 3

        System.out.println("\nЗавдання 3: Реверс рядка");
        System.out.println(reverseString("hello")); // "olleh"

        System.out.println("\nЗавдання 4: Перевірка порожнього рядка");
        System.out.println(isEmptyOrWhitespace("   ")); // true

        System.out.println("\nЗавдання 5: Підрахунок літер у рядку");
        System.out.println(countLetters("Hello123!")); // 5

        System.out.println("\nЗавдання 6: Повторення рядка");
        System.out.println(repeatString("Hi", 3)); // "HiHiHi"

        System.out.println("\nЗавдання 7: Перевірка початку і кінця");
        System.out.println(checkStartAndEnd("hello", 'h', 'o')); // true

        System.out.println("\nЗавдання 8: Видалення пробілів");
        System.out.println(removeSpaces("Hello World!")); // "HelloWorld!"

        System.out.println("\nЗавдання 9: Дублювання кожного символу");
        System.out.println(duplicateCharacters("abc")); // "aabbcc"

        System.out.println("\nЗавдання 10: Заміна цифр на зірочки");
        System.out.println(replaceDigitsWithAsterisks("Hello123")); // "Hello***"

        System.out.println("\nЗавдання 11: Перевірка анаграми");
        System.out.println(isAnagram("listen", "silent")); // true

        System.out.println("\nЗавдання 12: Стиснення рядка");
        System.out.println(compressString("aabcccccaaa")); // "a2b1c5a3"

        System.out.println("\nЗавдання 13: Знайти найдовший спільний підрядок");
        System.out.println(longestCommonSubstring("abcdef", "zbcdf")); // "bcd"
    }
}

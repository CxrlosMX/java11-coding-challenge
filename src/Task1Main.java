import taskone.StringUtils;

public class Task1Main {

    public static void main(String[] args) throws Exception {

        StringUtils utils = new StringUtils();

        System.out.println("doesStringContainVisibleCharacters:");
        System.out.println(utils.doesStringContainVisibleCharacters("   "));
        System.out.println(utils.doesStringContainVisibleCharacters("abc"));

        System.out.println("\nsplitToLines:");
        System.out.println(utils.splitToLines("line1\nline2\nline3"));

        System.out.println("\ntrimUnicodeString:");
        System.out.println(utils.trimUnicodeString("   hello   "));

        System.out.println("\nrepeatStringFiveTimes:");
        System.out.println(utils.repeatStringFiveTimes("ab"));

        System.out.println("\nfilterOutEmptyStrings:");
        System.out.println(utils.filterOutEmptyStrings(
                java.util.List.of("a", "", " ", "b", "c")
        ));

        System.out.println("\nFile test:");
        utils.saveStringInFile("Hola mundo", "test.txt");
        System.out.println(utils.readFileContents("test.txt"));
    }
}
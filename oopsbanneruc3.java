public class oopsbanneruc3 {
    public static void main(String[] args) {
        printLine(
            "  OOO  ",
            "  OOO  ",
            "  PPPP  ",
            "  SSSSS "
        );
        printLine(
            " O   O ",
            " O   O ",
            "  P   P ",
            "  S     "
        );
        printLine(
            " O   O ",
            " O   O ",
            "  PPPP  ",
            "  SSSSS "
        );
        printLine(
            " O   O ",
            " O   O ",
            "  P     ",
            "      S "
        );
        printLine(
            "  OOO  ",
            "  OOO  ",
            "  P     ",
            "  SSSSS "
        );
    }
    public static void printLine(String... parts) {
        System.out.println(String.join("   ", parts));
    }
}
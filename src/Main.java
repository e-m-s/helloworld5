//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {  // konvence GitHub Copilot

    /**
     * Metoda main je vstupní bod programu - tady se začne spouštět váš kód.
     * @param args pole argumentů příkazové řádky
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Právě jsem napsal svůj vlastní kód!"); // sout
        System.out.println("Právě jsem napsal svůj vlastní kód!"); // sout

        // odsazování

        printNumbers1To5();
        /* Delší víceřádkový komentář
         * Může pokračovat na více řádcích...
         * ...
         */
        double a = 3.5;
        double b = 4.5;
        System.out.println("Úhlopříčka trojúhelníku je: "+calculateDiagonal(a, b));

        double c;
        c = calculateDiagonal(5, 6);
        System.out.println("Úhlopříčka obdélníku je: "+c);

    }


    private static void printNumbers1To5() {
        for (int i = 1; i <= 5; i++) {  // zopakuj 5x kód v těle cyklu
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    private static double calculateDiagonal(double a, double b) {
        return Math.sqrt(a * a + b * b);  // výpočet délky úhlopříčky obdélníku
    }
}
public class PracticeProblem {

    public static void main(String[] args) {
    
    }

    public static void bubbleSortString(String[] strings) {
        if (strings == null || strings.length < 2) return;

        boolean swapped;
        for (int pass = 0; pass < strings.length - 1; pass++) {
            swapped = false;
            for (int i = 0; i < strings.length - 1 - pass; i++) {
                if (strings[i].compareToIgnoreCase(strings[i + 1]) > 0) {
                    String tmp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

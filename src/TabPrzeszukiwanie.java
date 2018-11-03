public class TabPrzeszukiwanie {
    public static void main(String[] args) {

        // wyszukiwanie pozycji, na której element znajduje sie w tablicy
        int[] tablica = {1, 4, 78, 3};
        int element = 1;
        for (int i = 0; i <= tablica.length - 1; i++) {
            if (tablica[i] == element) {
                System.out.println(i);
            }
            // System.out.println();
        }
        int element2 = 2;
        int znaleziona = -1;

        for (int i = 0; i <= tablica.length - 1; i++)
            if (tablica[i] == element2) {
                System.out.println(i);

            } else {
                System.out.println(znaleziona);
                break;

            }


        // zwiększanie i sortowanie tablicy
        int[] tablica2 = {1, 4, 7, 13};
        int elem2 = 8;
        int[] tablica3;

        for (int i = 0; i <= tablica2.length - 1; i++) {
            for (int j = 0; j <= tablica2.length - 1; j++) {
                if (j < elem2) {

                }

            }
        }



    }
}

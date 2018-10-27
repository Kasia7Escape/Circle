package dziedziczenie;

public class GenericBox<T extends Animal> {
    private T content;

    private static Integer[] test = {1, 2, 3};
    private static String[] test2 = {"Ala", "Ola", "Ela"};

    public static void main(String[] args) {

        System.out.println(findGeneric(test, 4));
        System.out.println(findGeneric(test2, "Ela"));
    }

    public static int pick(int[] array, int index) {
        return array[index];
    }

    public static <T> T pickGeneric(T[] array, int index) {
        return array[index];
    }

    public static <T> int findGeneric(T[] array, T element) {
        for(int i = 0; i< array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
    //eneric (T[]) array /*, element */ {
    /***
     * element typu Object (.equals())
     *
     *
     *wyszukaj elem w tablicy i zwróc jego index
     * else
     * zwróć -1
     *
     * findGeneric(tablicaObiektów, element tablicy)
     * wynik
     * index
     *
     */
return  -1;

}

            //


            }

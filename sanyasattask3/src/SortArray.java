/*
 Выбрать один из алгоритмов сортировки массивов (Метод сортировки пузырьком)
  и реализовать его (выбор обсудить с ментором)
 */
public class SortArray {
    public static void main(String[] args) {
        int[] element = {5, 8, 10, 3, 6, 2, 1, 4, 7, 9};
        boolean j = true;
        while (j) {
            j = false;
            for (int i = 0; i < element.length - 1; i++) {
                if (element[i] > element[i + 1]) {
                    int el = element[i];

                    element[i] = element[i + 1];
                    element[i + 1] = el;
                    j = true;
                }
            }

            for (int sortelements : element) {
                System.out.println(sortelements);
            }
        }
    }
}







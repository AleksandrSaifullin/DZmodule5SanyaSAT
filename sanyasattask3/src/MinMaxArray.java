/*
 Создать класс, который осуществляет поиск максимального и минимального
 элемента в массиве из целых чисел (int[]).
 */
public class MinMaxArray {
    public static void main(String[] args){
        int[] element = {5,8,10,3,6,2,1,4,7,9};
        int max = element[0];
        int min = element[0];

        for (int i = 0; i != element.length; i++){
            if (element[i] > max) {
                max = element[i];
            }
            if (element[i] < min) {
                min = element[i];
            }
        }
            System.out.println("наименьший элемент " + min );
            System.out.println("наибольший элемент " + max);

        }


    }


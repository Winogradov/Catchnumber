import java.util.Scanner;

public class CatchNumber {

    public static void main(String[] args) {
        demoArray();
        nextArray();
    }

    public static void demoArray() {

        System.out.println("Вам дан массив 4х4. ");
        int[][] array = new int[4][4];

        //Выводим массив размером 4х4 в консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j]);

            }
            System.out.println();
        }


        System.out.println();

        //Выводим пример массива с указанием местоположения единицы

        int q = (int) (Math.random() * 4);
        int u = (int) (Math.random() * 4);
        System.out.println("Вам нужно указать строку и столбец, в которых находится единица. Вот пример: строка " + q + " и столбец " + u);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);

                array[q][u] = 1;



            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nextArray() {
        //Создаем массив с случайным местоположением единицы в нем
        int[][] array = new int[4][4];


        int k = (int) (Math.random() * 4);
        int p = (int) (Math.random() * 4);


       /* System.out.println("Случайная строка " + k);
        System.out.println("Случайный столбец " + p);*/ // тестовое выведение строки и столбца

        array[k][p] = 1;

        System.out.println("Теперь попробуйте и Вы указать в какой строке и в каком столбце находится единица");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

        //создаем условия для нахождения числа в массиве

        if (true) {

            Scanner sc = new Scanner(System.in);
            if (true) {
                System.out.println("Укажите строку!");
                int km = sc.nextInt();
                if (km == 0 && km == k) {
                    System.out.println("Вы правы! Нулевая строка");
                } else if (km == 1 && km == k) {
                    System.out.println("Верно! Первая строка");
                } else if (km == 2 && km == k) {
                    System.out.println("Так точно! вторая строка");
                } else if (km == 3 && km == k) {
                    System.out.println("Отлично! Это третья строка");
                } else if (km >= 4 || km != k) {
                    System.out.println("Начните заново");
                    System.exit(0);
                }
            }


            System.out.println("Укажите столбец!");
            int pm = sc.nextInt();
            if (pm == 0 && pm == p) {
                System.out.println("Точно. Это нулевой столбец");
            } else if (pm == 1 && pm == p) {
                System.out.println("Правильно! Первый столбец");
            } else if (pm == 2 && pm == p) {
                System.out.println("Да. Второй столбец");
            } else if (pm == 3 && pm == p) {
                System.out.println("Именно! Это третий столбец");
            } else {
                System.out.println("Попробуйте еще раз");
                System.exit(0);
            }
            System.out.println("Вы верно выполнили задание! Это строка " + k + " и столбец " + p);
        }
    }
}
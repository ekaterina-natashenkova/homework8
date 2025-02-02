import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы. Часть 2");

        System.out.println("\nзадача 1");
        //посчитать сумму всех выплат за месяц.
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        int[] paymentPerMonth = {100, 200, 150, 250, 300};
        int sum = 0;
        for (int element : paymentPerMonth) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("\nзадача 2");
        //найти минимальную и максимальную траты за неделю.
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //результат: «Минимальная сумма трат за неделю составила … рублей. Максимальная сумма трат за неделю составила … рублей».
        int[] paymentPerWeek = {50, 70, 40, 80, 60};
        sum = 0;
        for (int element : paymentPerWeek) {
            sum += element;
        }
        int minPayWeek = sum;
        int maxPayWeek = -1;
        for (final int current : paymentPerWeek) {
            if (current < minPayWeek) {
                minPayWeek = current;
            }
            if (current > maxPayWeek) {
                maxPayWeek = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayWeek + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayWeek + " рублей");


        System.out.println("\nзадача 3");
        //какую в среднем сумму компания тратила еженедельно.
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество недель),
        //и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        int[] paymentPerWeekMedium = {257, 328, 133, 521, 470};
        sum = 0;
        for (int element : paymentPerWeekMedium) {
            sum += element;
        }
        double mediumMonth = (double) sum / 5;
        //System.out.println(sum);
        System.out.println("Средняя сумма трат за месяц составила " + mediumMonth + " рублей");


        System.out.println("\nзадача 4");
        //фамилии и имена сотрудников начали отображаться в обратную сторону.
        // Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов char[ ]
        //развернет содержимое массива, а затем распечатает его содержимое. В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //Необходимо корректно пройти по массиву циклом и поменять его содержимое, чтобы установить правильный порядок.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // System.out.println(Arrays.toString(reverseFullName));
        //for (int i = reverseFullName.length - 1; i >= 0; i--) {
        //   System.out.print(reverseFullName[i] + " ");  // печать в обратном порядке, а нужен "разворот" массивав
        // }
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println();
    }
}
//generateRandomArray() - можно использовать для генерации массива для каждого отдельного задания
//это обязательно? в условиях задачи нигде про случайную генерацию не сказано - для этого нужно что-то подключать7
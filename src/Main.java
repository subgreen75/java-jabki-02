import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        /*
         **********************   ВОРКШОП   **********************
         */

        /*
         * примитивы
         */

        int age = 12;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        /*
         * ссылочные типы
         */
        String name = "Alice";
        System.out.println(name.length());

        /*
         * операторы арифметические
         */
        int a = 10;
        int b = 3;
        System.out.println(a + b); //13
        System.out.println(a - b); //7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3 целочисленное деление
        System.out.println(a % b); // 1 остаток от деления

        // операторы сравнения
        System.out.println("************операторы сравнения************");
        System.out.println(a == b); //false
        System.out.println(a != b); //true
        System.out.println(a > b); // true
        System.out.println(a <= b); // false

        //логические
        System.out.println("************логические************");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y); //false
        System.out.println(x || y); // true
        System.out.println(!x); // false

        System.out.println(2 == 2 && 3 != 2); //true
        System.out.println(2 == 2 && 3 != 3); //false
        System.out.println(!((2 + 2) == 4)); //false
        System.out.println(!((2 + 2) == 4) || true); //true

        /**
         * вывод в консоль
         */
        System.out.println("************вывод в консоль************");
        System.out.println("Привет, мир!");
        System.out.print("а это ");
        System.out.print("будет на одной строке");
        System.out.println();
        System.out.println("А еще " + "можно так " + x);
        System.out.printf("Привет, меня зовут %s и я люблю %s\n", name, "маму");

        int oldNumber = 5;
        System.out.printf("Число четное? %s\n", oldNumber % 2 == 0);

        System.out.println("* * *");
        System.out.println("*   *");
        System.out.println("* * *");

        /**
         * Комментарии
         */

        // однострочный комментарий
        // вторая строка

        /*
        многострочный
        комментарий
         */

        /**
         * складывает два числа
         *
         * @param a первое число
         * @param b второе число
         * @return сумму чисел a и b
         */

        /**
         * условные операторы
         * if-else
         */
        System.out.println("************условные операторы************");
        boolean isRain = true;
        System.out.println("************вариант 1************");
        if (isRain) {
            System.out.println("надеть куртку");
            System.out.println("надеть обувь");
            System.out.println("взять зонт");
        } else {
            System.out.println("надеть куртку");
            System.out.println("надеть обувь");
        }

        System.out.println("************вариант 2************");
        System.out.println("надеть куртку");
        System.out.println("надеть обувь");
        if (isRain) {
            System.out.println("взять зонт");
        }

        System.out.println("************elsif************");
        String animal = "fish";
        if (animal.equals("cat")) {
            System.out.println("Мяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Буль");
        }

        int floor = 1;
        double price = 3000;
        if (floor == 1 && price < 5000) {
            System.out.println("Подходит для аренды");
        }

        a = 0;
        String result = a > 0 ? "а положительное число" : (a == 0 ? "равно 0" : "a отрицательное число");
        System.out.println(result);

        System.out.println("************switch************");
        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль");
                break;
            case "bear":
                System.out.println("Рр");
                break;
            default:
                System.out.println("Привет");
        }

        /**
         * циклы
         */
        System.out.println("************for************");
        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //while
        System.out.println("************while************");
        int z = 0;
        while (z < 10) {
            System.out.println(z);
            z++;
        }

        System.out.println("************for break************");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // выход из цикла
            }
            System.out.println(i);
        }

        System.out.println("************for continue************");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // пропуск
            }
            System.out.println(i);
        }






        /*
         **********************   домашка   **********************
         */



        /**
         * 1. Напишите функциональность, которая вычисляет площадь круга
         */
        double r = 10; // радиус
        System.out.println("Площадь круга = " + Math.PI * Math.pow(r, 2));

        /**
         * Переведите температуру в градусах Цельсия в Фаренгейты
         */

        double tC = 232.778;
        System.out.println("Температура в Фаренгейтах = " + (tC * (1.8) + 32));

        /**
         * Проверьте, является ли длина сроки "Hello" равной длине другой строки
         */
        String mainString = "Hello";
        String otherString = "Другая строка";
        if (mainString.length() == otherString.length()) {
            System.out.println("Длины строк равны");
        } else {
            System.out.println("Длины строк не равны");
        }

        /**
         * Напишите функциональность, которая определяет, является ли год високосным
         */
        int year = 2024;
        LocalDate startDate = LocalDate.of(year, 1, 1);
        LocalDate endDate = LocalDate.of(year + 1, 1, 1);

        // Рассчитываем разницу в днях в  year году
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        if (daysBetween == 365) {
            System.out.println("год не високосный");
        } else {
            System.out.println("год високосный");
        }

        double growth = 1.75; // рост в метрах
        double weight = 79.5; // вес в кг
        System.out.println("ИМТ = " + (weight / (growth * growth)));

        /**
         * Выведите в консоль таблицу истинности для операторов && и ||
         */
        System.out.println("оператор &&");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " && " + j + " = " + (i == 1 && j == 1));
            }
        }

        System.out.println("оператор ||");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " || " + j + " = " + (i == 1 || j == 1));
            }
        }

        /**
         * Выведите в консоль квадрат
         */
        System.out.println("\u25A0");

        /**
         * Выведите в консоль полый квадрат
         */
        System.out.println("\u25A1");

        /**
         * Выведите в консоль ромб
         */
        System.out.println("\u25C6");

        /**
         * Выведите в консоль смайлик
         */
        System.out.println(":-)");

        /**
         * if-else
         * Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
         */

        int myNumber = 5;
        if (myNumber % 2 == 0) {
            System.out.println("число " + myNumber + " четное");
        } else {
            System.out.println("число " + myNumber + " не четное");
        }

        /**
         * Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
         */
        double firstNumber = -3.0;
        double secondNumber = -6.1;
        if (firstNumber == secondNumber) {
            System.out.println("Равны");
        } else if (firstNumber < secondNumber) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Первое больше");
        }

        /**
         * Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
         */

        double extNumber = 3.0;
        if (extNumber == 0) {
            System.out.println("Равно нулю");
        } else if (extNumber < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }

        /**
         * Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен
         */
        int extAge = 21;
        if (extAge >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        /**
         * Придумать задачу самим
         * даны три цвета - красный, желтый, зеленый
         * если текущий цвет = зеленый, то выводим "Идем"
         * если текущий цвет = красный, то выводим "Стоим"
         * если текущий цвет = желтый, то выводим "Готовимся"
         */
        String greenColor = "Зеленый";
        String redColor = "Красный";
        String yellowColor = "Желтый";
        String currentColor = "Красный";
        if (currentColor == greenColor) {
            System.out.println("Идем");
        } else if (currentColor == redColor) {
            System.out.println("Стоим");
        } else if (currentColor == yellowColor) {
            System.out.println("Готовимся");
        } else {
            System.out.println("Светофор сломался");
        }

        /**
         * Тернарный оператор
         * 1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
         */
        a = 1;
        result = a > 0 ? "а положительное число" : (a == 0 ? "равно 0" : "a отрицательное число");
        System.out.println(result);

        /**
         * 2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
         */

        int extNum = 15;
        result = (extNum % 3 == 0) && (extNum % 5 == 0)  ? "Кратно" : "Не кратно";
        System.out.println(result);

        /**
         * 3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор
         */

        a = 2;
        result = a % 2 == 0 ? "Четное" : "Нечетное";
        System.out.println(result);

        /**
         * switch
         * 1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
         */

        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }

        /**
         * switch
         * 2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
         */

        int schoolGrade = 3;
        switch (schoolGrade) {
            case 1:
                System.out.println("Хорошо. Ты старался. Давай подумаем еще");
                break;
            case 2:
                System.out.println("Хорошо. Отличная идея. Но давай подумаем над другим решением");
                break;
            case 3:
                System.out.println("Супер. Но может есть еще решения?");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Хорошая попытка. Давай подумаем из какой ты страны?");
        }

        /**
         * for
         * 1. Дан список чисел. Посчитайте сумму всех четных элементов
         */
        int lSum = 0;
        int[] lNumbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        for (int i = 0; i < lNumbers.length; i++) {
            if (i % 2 == 0) {
                lSum = lSum + lNumbers[i];
            }
        }
        System.out.println(lSum);

        /**
         * for
         * 2. Дан список чисел. Найдите максимальное значение
         */
        int lMax = 0;
        int[] lNumbers2 = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        for (int i = 0; i < lNumbers2.length; i++) {
            if (i > lMax) {
                lMax = lNumbers2[i];
            }
        }
        System.out.println(lMax);

        /**
         * for
         * 3. Дано число n. Выведите таблицу умножения для n от 1 до 10
         */
        int n = 9;
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + n + " = " + n * i);
        }

        /**
         * for
         * 4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке
         */
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        /**
         * for
         * 5. Найдите количество четных чисел в диапазоне от 1 до 50
         */
        int lCount = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                lCount = lCount + 1;
            }
        }
        System.out.println("количество четных чисел в диапазоне от 1 до 50 = " + lCount);

        /**
         * while
         * 1. Найдите наименьшее число больше 100, которое делится на 7 без остатка
         */
        boolean flag = true;
        z = 101;
        while (flag) {
            if (z % 7 == 0) {
                System.out.println(z);
                flag = false;
            }
            z++;
        }


        /**
         * while
         * 2. Дано число n. Вычислите его факториал через цикл while
         */
        n = 5;
        int lFact = 1;
        z = 1;

        while (z <= n) {
            lFact = lFact * z;
            z++;
        }
        System.out.println("Факториал = " + lFact);

        /**
         * while
         * 3. Дано число. Определите, является ли оно простым
         */
        n = 17;
        lCount = 0;
        z = 2;
        while (z <= n) {
            if (n % z == 0) {
                lCount = lCount + 1;
            }
            z++;
        }
        if (lCount == 1)  {
            System.out.println("Число " + n + " простое");
        }

        /**
         * while
         * 4. Придумать задачу самим
         * посчитать сумму чисел от 1 до n
         */
        n = 17;
        lSum = 0;
        z = 1;
        while (z <= n) {
            lSum = lSum + z;
            z++;
        }
        System.out.println("Сумма =  " + lSum);

        /**
         * break & continue
         * 1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3
         */

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; // пропуск
            }
            System.out.println(i);
        }

        /**
         * 2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число
         */
        int[] lNumbers3 = {5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5};
        lSum = 0;
        for (int i = 0; i < lNumbers3.length; i++) {
            if (lNumbers3[i] < 0) {
                break;
            }
            lSum = lSum + lNumbers3[i];
        }
        System.out.println("Сумма =  " + lSum);

        /**
         * 3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100
         */

        int[] lNumbers4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120};
        lSum = 0;
        for (int i = 0; i < lNumbers4.length; i++) {
            if (lSum + lNumbers4[i] > 100) {
                break;
            }
            System.out.println(lNumbers4[i]);
            lSum = lSum + lNumbers4[i];
        }
        System.out.println("Сумма =  " + lSum);
    }
}
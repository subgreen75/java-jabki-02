public class Main {
    public static void main(String[] args) {
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
        System.out.println(a+b); //13
        System.out.println(a-b); //7
        System.out.println(a*b); // 30
        System.out.println(a/b); // 3 целочисленное деление
        System.out.println(a%b); // 1 остаток от деления

        // операторы сравнения
        System.out.println("************операторы сравнения************");
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a>b); // true
        System.out.println(a<=b); // false

        //логические
        System.out.println("************логические************");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y); //false
        System.out.println(x || y); // true
        System.out.println(!x); // false

        System.out.println(2 == 2 && 3!= 2); //true
        System.out.println(2 == 2 && 3!= 3); //false
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
        System.out.println("А еще " + "можно так " + x );
        System.out.printf("Привет, меня зовут %s и я люблю %s\n", name, "маму" );

        int oldNumber = 4;
        System.out.printf("Число четное? %s\n",oldNumber % 2 == 0);

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

        a = 1;
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
        for (int i=0; i < 10; i++) {
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






    }
}
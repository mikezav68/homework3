public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.0f;
        double f = 6.0;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a1 = 27.12f;
        long b1 = 987678965549L;
        double c1 = 2.786;
        short d1 = 569;
        short e1 = -159;
        int f1 = 27897;
        byte g1 = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short paper = 480;
        int paperForOne = 0;
        paperForOne = 480 / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottles = 16;
        int time = 2;
        int perf = 0;
        perf = bottles / time;
        time = 20;
        bottles = perf * time;
        System.out.println("За 20 минут машина произвела " + bottles + " бутылок.");
        time = 24 * 60;
        bottles = perf * time;
        System.out.println("За сутки машина произвела " + bottles + " бутылок.");
        time = time * 3;
        bottles = perf * time;
        System.out.println("За 3 дня машина произвела " + bottles + " бутылок.");
        time = time * 10;
        bottles = perf * time;
        System.out.println("За месяц машина произвела " + bottles + " бутылок.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int allPots = 120;
        int white = 2;
        int brown = 4;
        int classes = 0;
        classes = 120 / (white + brown);
        white = classes * white;
        brown = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        float weight = 0.0f;
        weight = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println("Масса завтрака составляет " + weight + " г");
        weight = weight / 1000;
        System.out.println("Масса завтрака составляет " + weight + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int difference = 7000;
        double days = 0;
        int min = 250;
        int max = 500;
        days = difference / min;
        System.out.println("На похудение по 250 г в день уйдёт " + days + " дней");
        days = difference / max;
        System.out.println("На похудение по 500 г в день уйдёт " + days + " дней");
        days = difference * 2 / (min + max);
        System.out.println("На похудение в среднем уйдёт " + days + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        double masha = 67750;
        double masha2 = 0;
        double denis = 83690;
        double denis2 = 0;
        double cristina = 76230;
        double cristina2 = 0;
        double incomeDif = 0;
        masha2 = masha * 1.1;
        incomeDif = masha2 * 12 - masha * 12;
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + incomeDif + " рублей");
        denis2 = denis * 1.1;
        incomeDif = denis2 * 12 - denis * 12;
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + incomeDif + " рублей");
        cristina2 = cristina * 1.1;
        incomeDif = cristina2 * 12 - cristina * 12;
        System.out.println("Кристина теперь получает " + cristina2 + " рублей. Годовой доход вырос на " + incomeDif + " рублей");
    }
}
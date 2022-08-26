public class Main {
    public static void main(String[] args) {
        // Задание 1
        int apple = 9;
        byte bird = 1;
        short trees = 678;
        long flowers = 500;
        float sugar = 5.6f;
        double water = 70.56;
        System.out.println(apple);
        System.out.println(bird);
        System.out.println(trees);
        System.out.println(flowers);
        System.out.println(sugar);
        System.out.println(water);

        // Задание 2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = 2 > 5;
        System.out.println(d);
        short e = 569;
        int f = -159;
        short g = 27897;
        byte k = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(k);

        // Задание 3
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int allPaper = 480;
        int allStudents = lP + aS + eA;
        int paperOneStudents = allPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperOneStudents + " листов бумаги.");

        // Задача 4
        int machineTwoMinutes = 16;
        int machineOneMinutes = machineTwoMinutes / 2;
        int machineTwentyMinutes = machineOneMinutes * 20;
        System.out.println("За 20 минут машина произвела бутылок " + machineTwentyMinutes + " штук");
        int oneDay = 24;
        int oneHour = 60;
        int oneDayMinutes = oneDay * oneHour;
        int machineOneDay = machineOneMinutes * oneDayMinutes;
        System.out.println("За сутки машина произвела бутылок " + machineOneDay + " штук");
        int threeDayMinytes = oneDayMinutes * 3;
        int machineThreeDay = machineOneMinutes * threeDayMinytes;
        System.out.println("За три дня машина произвела бутылок " + machineThreeDay + " штук");
        int month = 30;
        int threeMonth = month * 3 * machineOneMinutes * oneDayMinutes;
        System.out.println("За три месяца машина произвела бутылок " + threeMonth + " штук");

        // Задача 5
        int totalPaint = 120;
        int oneClassWhite = 2;
        int oneClassBrown = 4;
        int allPaintOneClass = oneClassWhite + oneClassBrown;
        int allClass = totalPaint / allPaintOneClass;
        int allWhitePaintOnClass = allClass * oneClassWhite;
        int allBrownPaintOnClass = allClass * oneClassBrown;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhitePaintOnClass + " банок белой краски и " + allBrownPaintOnClass + " банок коричневой краски.");

        // Задача 6
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggsWeight = 70;
        int breakfastWeightInGrams = (bananaWeight * 5) + (milkWeight * 2) + (iceCreamWeight * 2) + (eggsWeight * 4);
        System.out.println("Вес завтрака составляет " + breakfastWeightInGrams + " г.");
        int oneKg = 1000;
        float breakfastWeightInKg = breakfastWeightInGrams / (float) oneKg;
        System.out.println("Вес завтрака составляет " + breakfastWeightInKg + " кг.");

        // Задача 7
        int loseWeightKg = 7;
        int loseWeightGr = loseWeightKg * oneKg;
        int dietOne = 250;
        int dietTwo = 500;
        int daysDietOne = loseWeightGr / dietOne;
        int daysDietTwo = loseWeightGr / dietTwo;
        System.out.println(daysDietOne + " дней уйдет на похудение, если худеть на 250 гр. в день.");
        System.out.println(daysDietTwo + " дней уйдет на похудение, если худеть на 500 гр. в день.");
        dietOne = 1;
        dietTwo = 1;
        int allDiet = dietOne + dietTwo;
        int averageDays = (daysDietOne + daysDietTwo) / allDiet;
        System.out.println("Среднее количество дней для достижения результата - " + averageDays + ".");

        // Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = (salaryMasha * 10 / 100) + salaryMasha;
        int newSalaryDenis = (salaryDenis * 10 / 100) + salaryDenis;
        int newSalaryKristina = (salaryKristina * 10 / 100) + salaryKristina;
        System.out.println("Доход у Маши будет " + newSalaryMasha + " руб.," + " у Дениса " + newSalaryDenis + " руб.," + " у Кристины " + newSalaryKristina + " руб.");
        int allSalaryMasha = salaryMasha * 12;
        int allSalaryDenis = salaryDenis * 12;
        int allSalaryKristina = salaryKristina * 12;
        System.out.println("Годовой доход Маши " + allSalaryMasha + " руб.," + " Дениса " + allSalaryDenis + " руб.," + " Кристины " + allSalaryKristina + " руб.");
        int newAllSalaryMasha = newSalaryMasha * 12;
        int newAllSalaryDenis = newSalaryDenis * 12;
        int newAllSalaryKristina = newSalaryKristina * 12;
        System.out.println("Годовой доход вырос у Маши на " + newAllSalaryMasha + " руб.," + "у Дениса на " + newAllSalaryDenis + " руб.," + " у Кристины на " + newAllSalaryKristina + " руб.");
        int differenceSalaryMasha = newAllSalaryMasha - allSalaryMasha;
        int differenceSalaryDenis = newAllSalaryDenis - allSalaryDenis;
        int differenceSalaryKristina = newAllSalaryKristina - allSalaryKristina;
        System.out.println("Разница между годовыми доходами составляет: Маша - " + differenceSalaryMasha + " руб.," + " Денис - " + differenceSalaryDenis + " руб.," + " Кристина - " + differenceSalaryKristina + " руб.");

    }

}
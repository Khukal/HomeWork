//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("привет мир !"));

    for (int i = 1; i <= 1; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);


        int intValue = 100;
        byte byteValue = 10;
        short shortValue = 1000;
        long longValue = 100000L;
        float floatValue = 10.5f;
        double doubleValue = 20.75;

        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
        System.out.println("Значение переменной longValue с типом long равно " + longValue);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);

        float aa = 27.12f;
        long bb = 987678965549L;
        float cc = 2.786f;
        short dd = 569;
        short ee = -159;
        short ff = 27897;
        byte gg = 67;

        byte EA = 30;
        byte AS = 27;
        byte LP = 23;
        int summa = EA + AS + LP;
        int list = 480 / summa;
        System.out.println("На каждого ученика рассчитано  " + list + "  листов бумаги");

        byte min = 16;
        int minutes = min * 10;
        int day = min * 720;
        int threeDay = day * 3;
        int month = day * 30;

        System.out.println("производит за 20 минут : " + minutes + " производит в день: " + day + " бутылок " + " производит за три дня: " + threeDay +
                "  производит в месяц: " + month);

        byte paint = 120;
        int classes = paint / 6;
        int whitePaint = classes * 2;
        int brownPaint = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        byte banan = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int banans = banan * 5;
        int milk2 = milk * 2;
        int iceCreams = iceCream * 2;
        int eggs = egg * 4;
        int gr = banans + milk2 + iceCreams + eggs;
        float kg = gr / 1000f;
        System.out.println("граммы: " + gr + " килограммы: " + kg);

        short massa = 7000;
        int days = massa / 250;
        int days2 = massa / 500;
        System.out.println("количество дней если худеть по 250 гр в день : " + days + ".  количество дней если худеть по 500 гр в день : " + days2);

        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        System.out.println("Маша теперь получает " + mashaSalary * 1.1
                + " рублей. Годовой доход вырос на "
                + (mashaSalary * 1.1 - mashaSalary) * 12 + " рублей.");

        System.out.println("Денис теперь получает " + denisSalary * 1.1
                + " рублей. Годовой доход вырос на "
                + (denisSalary * 1.1 - denisSalary) * 12 + " рублей.");

        System.out.println("Кристина теперь получает " + kristinaSalary * 1.1
                + " рублей. Годовой доход вырос на "
                + (kristinaSalary * 1.1 - kristinaSalary) * 12 + " рублей.");
    }
}
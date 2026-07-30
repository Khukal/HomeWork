//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//task 1
    System.out.println("задача 1");
    int firstFriday = 7;

    for (int i = 1; i <= 31; i = i + 1) {
        if (i % 7 == 0) {
            System.out.println("Сегодня пятница," + i + " -е число. Необходимо подготовить отчет");
        }
    }

    //task 2
    System.out.println("задача 2");
     int distance = 0;
    do {
       distance += 500;
       if (42195-distance>0)
        System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
     }
     while (distance < 42195);


    for (int d = 500; d < 42500; d += 500) {
        System.out.println("Держитесь! Осталось " + (42195 - d) + " метров");
    }
    //task3
    System.out.println("задача 3");

    int budget = 1000;
    int day = 0;
    while (budget >= 100) {

     day = day + 1;
    if (day % 5 == 0) {
       continue;}
    budget = budget - 100;
    if (budget == 0) {
        break;
     }}
     System.out.println("автомобиль можно оставить на " + day + " дней");
    budget =1000;
    int days=0;
    for (int d = 1; budget >= 100 || d % 5 == 0;
         d++) {
        days++;
        if (d% 5 == 0) {
            continue;
        }
        budget = budget - 100;
        if (budget == 0) {
            break;
        }
    }
    System.out.println("автомобиль можно оставить на " + (day) + " дней");

    //task 4
    System.out.println("задание 4");
    int month = 0;
    int total = 0;
    int target = 12000000;
    int monthDeposit = 15000;
    while (true) {
        month++;
        total += monthDeposit;
        if (month % 6 == 0) {
            total += total * 7 / 100;
        }
        System.out.println("месяц " + month + ":" + total + "рублей");
        if (total > target) {
            break;
        }
    }
    System.out.println("цель достигнута за :" + month + "месяцев");

//task 5
    System.out.println("задание 5");
    int charge = 20;
    int minute = 0;
    int overheats = 0;

    while (charge < 100 && overheats < 3) {
        minute++;
        charge += 2;

        // Каждые 10 минут перегрев
        if (minute % 10 == 0) {
            overheats++;
            if (overheats >= 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                break;
            }

            minute += 2;
        }

        if (charge >= 100) {
            charge = 100;
            System.out.println("Зарядка завершена. Текущий заряд: 100%");
            break;
        }
    }

    System.out.println("Общее время: " + minute + " минут");
}
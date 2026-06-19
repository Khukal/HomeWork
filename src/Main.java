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

        int client = 1;
        int age = 2014;
        if (client == 0 && age < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client == 0 && age >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client == 1 && age < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (client == 1 && age >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int year = 2021;
        if (year > 1584) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка не производится");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//task 1
    System.out.println("задача 1");
    int os = 0;
    if (os == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (os == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("неверное значение!");
    }
//task 2
    System.out.println("задача 2");
    os = 8;
    int clientDeviceYear = 2015;
    if (os == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (os == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите обычную версию приложения для ios по ссылке");
    } else if (os == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для android по ссылке");
    } else {
        System.out.println("Установите обычную версию приложения для android по ссылке");
    }
//task 3
    System.out.println("задача 3");
    int year = 2021;
    if (year > 1584 && ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0)) {
        System.out.println(year + "год является високосным");
    } else {
        System.out.println("год не является високосным");
    }
    //task 4
    System.out.println("задача 4");
    int deliveryDistance = 95;
    if (deliveryDistance <= 20) {
        System.out.println("потребуется дней: " + 1);
    } else if (20 < deliveryDistance && deliveryDistance <= 60) {
        System.out.println("потребуется дней: " + 2);
    } else if (60 < deliveryDistance && deliveryDistance <= 100) {
        System.out.println("потребуется дней: " + 3);
    } else {
        System.out.println("доставки нет");
    }
    //task5
    System.out.println("задача 5");
   int monthNumber = 15;
   switch(monthNumber) {
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
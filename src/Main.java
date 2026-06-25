//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//task 1
    System.out.println("задача 1");
  for (int i=1;i<=10; i=i+1){
      System.out.println(i);}
    //task 2
    System.out.println("задача 2");
  for (int j=10;0<j; j=j-1){
      System.out.println(j);}
    //task 3
    System.out.println("задача 3");
  for (int z=0; z<17; z=z+2) {
      System.out.println(z);}
    //task 4
    System.out.println("задача 4");
  for (int l=10; l>=-10; l=l-1){
      System.out.println(l);}
    //task 5
    System.out.println("задача 5");
  for (int year=1904; year<=2096; year=year+4) {
      System.out.println(year+" год является високосным");}
    //task 6
    System.out.println("задача 6");
  for (int x=7; x<=98; x=x+7){
        System.out.println(x);}
    //task 7
    System.out.println("задача 7");
  for (int y=1;y<=512;y=y*2){
      System.out.println(y);}
    //task 8
    System.out.println("задача 8");
  int summa=0;
  for (int mounth=1;mounth<=12;mounth=mounth+1){ summa=summa+29000;
        System.out.println("Месяц "+mounth+" сумма накоплений равна "+summa+" рублей");}
    //task 9
    System.out.println("задача 9");
    int salary = 29000;
    int total = 0;
    for (int i = 0; i < 12; i++) {
        total = total + total/100;
        total = total + salary;
        System.out.println("Месяц " + i + " Сумма накоплений  " + total+(" рублей "));
    }
    System.out.println(total);
    //task 10
    System.out.println("задача 10");
int itog=0;
    for (int w=1;w<=10;w=w+1) {
        itog=w*2;
        System.out.println(w+"*2= "+itog);}
}
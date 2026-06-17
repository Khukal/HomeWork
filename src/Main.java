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


        int age = 18;
        if (age >= 18) {
            System.out.println("человек достиг совершеннолетия");
        } else {
            System.out.println("человек не достиг совершеннолетия");
        }

        int t = 6;
        if (t >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");

        }


        int speed = 6;
        if (speed > 60) {
            System.out.println("Скорость превышена");
        } else {
            System.out.println("Превышения скорости нет");

        }
        int rang = 25;
        if (rang >= 2 && rang <= 6) {
            System.out.println("человеку надо ходить в детский сад");
        }
        if (rang >= 7 && rang <= 17) {
            System.out.println("человеку надо ходить в школу");
        }
        if (rang >= 18 && rang <= 24) {
            System.out.println("человеку надо ходить в институт");
        } if(rang>24) {
            System.out.println("человеку надо ходить на работу");

        }

int chaild=10;
        if (chaild<5) {System.out.println("ребенку нельзя кататься на атракционе");}
if(chaild>5 && chaild<=14)
{System.out.println("ребенок может кататься на атракционе в сопровождении взрослого");}
if(chaild>14)
{System.out.println("ребенок может кататься на атракционе без сопровождения взрослого");}

int passenger=140;
if(passenger>0 && passenger<=60){System.out.println("место сидячее");}
else if (passenger>60 && passenger<=102)    {System.out.println("место стоячее");}
else {System.out.println("вагон заполнен");}


        int one=1;
        int two=1;
        int three=1;

        if (one>two && one>three) {System.out.println(one+"большее число");}
            else if (two>one && two>three){System.out.println(two+"большее число");}
                else if(three>one && three>two) {System.out.println(three+" большее число");}
                else {System.out.println("числа равны");}
    }
}
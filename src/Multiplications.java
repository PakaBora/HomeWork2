//Задача 4,5,6,7,8
public class Multiplications {
    public static void main(String[] args) {
        //Задание 4
        var friend = 19;
        System.out.println(friend);

        friend +=2;
        System.out.println(friend);

        friend /=7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
       //Задание 6
        var a_boxerWeight = 78.1;
        var b_boxerWeight = 82.7;
        var totalWeight = a_boxerWeight + b_boxerWeight;
        System.out.println(totalWeight);
       //Задание 7
        var differenceWeight = b_boxerWeight - a_boxerWeight;
        System.out.println(differenceWeight);

        var differencesWeight = b_boxerWeight % a_boxerWeight;
        System.out.println(differencesWeight);
      //Задание 8
        var workingHours = 640;
        var workingDay = 8;
        var workers = workingHours / workingDay;
        System.out.println("Всего работников в компании - " + workers + " человек ");

        workers +=94;
        workingHours = workers * workingDay;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workingHours + " часов работы может быть поделено между сотрудниками ");

    }
}

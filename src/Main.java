public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее Задание");
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        System.out.println("\nЗадача 2");
        dog = dog + 4;
        System.out.println("dog = " + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);

        System.out.println("\nЗадача 3");
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        cat  = cat - 1.6;
        System.out.println("cat = " + cat);
        paper  = paper - 7639;
        System.out.println("paper = " + paper);

        System.out.println("\nЗадача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        System.out.println("\nЗадача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        System.out.println("\nЗадача 6");
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var totalWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общая масса двух бойцов = " + totalWeight);
        var weightDiff = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница между массами бойцов = " + weightDiff);

        System.out.println("\nЗадача 7");
        var weightDiff1 = boxerTwoWeight - boxerOneWeight;
        System.out.println("Первый способ = " + weightDiff1);
        var weightDiff2 = boxerTwoWeight % boxerOneWeight;
        System.out.println("Второй способ = " + weightDiff2);

        System.out.println("\nЗадача 8");
        System.out.println("\t1.");
        var totalWorkHours = 640;
        var workHoursPerEmployee = 8;
        var totalNumOfEmployees = totalWorkHours / workHoursPerEmployee;
        System.out.println("\tВсего работников в компании — " + totalNumOfEmployees + " человек.");
        System.out.println("\t2.");
        totalNumOfEmployees = totalNumOfEmployees + 94;
        totalWorkHours = totalNumOfEmployees * 8;
        System.out.println("\tЕсли в компании работает " + totalNumOfEmployees + " человека, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками");
    }
}
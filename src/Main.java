public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//Задача №1
        var dog = 8.0;
        System.out.println("dog = " + dog);

        var cat = 3.6;
        System.out.println("cat = " + cat);

        var paper = 763789;
        System.out.println("paper = " + paper);
//Задача №2
        var result1 = dog + 4;
        System.out.println("dog + 4 = " + result1);

        var result2 = cat + 4;
        System.out.println("cat + 4 = " + result2);

        var result3 = paper + 4;
        System.out.println("paper + 4 = " + result3);
//Задача №3
        var dogResult1 = (dog + 4) - 3.5;
        System.out.println("(dog + 4) - 3.5 = " + dogResult1);
        var catResult2 = (cat + 4) - 1.6;
        System.out.println("(cat + 4) - 1.6 = " + catResult2);
        var paperResult3 = (paper + 4) - 7639;
        System.out.println("(paper + 4) - 7639 = " + paperResult3);
//Задача№4
        var friend = 19;
        System.out.println("friend = " + friend);
        var friendResult = friend + 2;
        System.out.println("friend + 2 = " + friendResult);
        var friendResult1 = (friend + 2) / 7;
        System.out.println("(friend + 2) / 7 = " + friendResult1);
//Задача№5
        var frog = 3.5;
        System.out.println(("frog = ") + frog);
        var frogResult = frog * 10;
        System.out.println("frog * 10 = " + frogResult);
        var frogResult1 = (frog * 10) / 3.5;
        System.out.println("(frog * 10) / 3.5 = " + frogResult1);
        var frogResult2 = ((frog * 10) / 3.5) + 4;
        System.out.println("(frog * 10) / 3.5 + 4 = " + frogResult2);
//Задача№6
        var boxerWeight = 78.2;
        System.out.println("Масса первого боксера = " + boxerWeight + " кг ");
        var boxerWeight2 = 82.7;
        System.out.println("Масса второго боксера = " + boxerWeight2 + " кг ");
        var boxersWeight = boxerWeight + boxerWeight2;
        System.out.println("Общая масса двух боксеров = " + boxersWeight + " кг ");
        var boxersVariance = boxerWeight - boxerWeight2;
        System.out.println("Разница между двумя боксерами = " + -boxersVariance + " кг ");
//Задача№7
        var boxersRemains = (boxerWeight + boxerWeight2) % boxersVariance;
        System.out.println("Остаток между двумя бойцами = " + boxersRemains);
//Задача№8 *1
        var allHours = 640;
        var workers = 8;
        var allWorkers = allHours / workers;
        System.out.println(("Всего работников в компании - ") + allWorkers + " человек");
//Задача№8 *2
        var moreWorkers = 94;
        var allWorkers1 = moreWorkers + allWorkers;
        System.out.println("В компании работает " + allWorkers1);
        var allHours1 = allWorkers1 * workers;
        System.out.println("Если в компании работает " + allWorkers1 + " человек " + " то всего " + allHours1 + " часа работы может быть поделено между сотрудниками");
    }
}
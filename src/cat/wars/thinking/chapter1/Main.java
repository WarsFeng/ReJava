package cat.wars.thinking.chapter1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wars
 * \* Date: 18-8-22
 * \* Time: ÏÂÎç9:24
 * \* Description:
 * \
 */

public class Main {

    public static void main(String[] args) {
        /*
         * Int and char the initial value
         * Int the initial value is 0
         * Char the initial value is " "(entry character),convert to int to 0
         */
        format("One:");
        Exercise1 one = new Exercise1();
        System.out.println("int:"+one.getI());
        System.out.println("char:"+one.getC());
        System.out.println("charToInt:"+(int)one.getC());

        /*
        Tow
         */
        format("Two:");
        Exercise2.main(args);

        /*
        There
         */
        format("There:");
        Exercise3 there = new Exercise3();

        /*
        Four
         */
        format("Four:");
        Exercise4 four = new Exercise4();

        /*
        Five
         */
        format("Five:");
        four.i = 96;
        four.d = 96.0;
        four.b = true;
        System.out.println(four);

        /*
        Sex
         */
        format("Sex:");
        Exericse6 sex = new Exericse6();
        System.out.println("Wars size: "+sex.storage("Wars"));

        /*
        Seven
         */
        format("Seven:");
        Exericse7.increment();
        System.out.println(StaticTest.i);

        /*
        Eight
         */
        format("Eight");
        Exericse8 eight = new Exericse8();
        eight.i++;
        Exericse8 eight2 = new Exericse8();
        System.out.println(eight2.i);

        /*
        Nine
         */
        format("Nine:");
        Exercise9 nine = new Exercise9();
        nine.start();

        /*
        Ten
         */
        format("Ten:");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);



    }

    private static void format(String info){
        System.out.println("---------------------------------------------------------------"+"\n"+info);
    }

}

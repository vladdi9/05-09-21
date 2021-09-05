package org.itstep;

public class log {
    public static void main(String[] args) {
        /*
Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
1. Первые два числа равны между собой и не равны третьему;
2. Второе или третье число больше первого;
3. Первое не меньше второго, а второе не больше третьего;
4. Все числа разные;
5. Первое - четное, второе - нечетное, третье - отрицательное;
 */
        // 1
        {int a= 3;
        int b= 3;
        int c = 5;
        if ((a==b)&&(a!=c))
            System.out.println("true");
        else
            System.out.println("false");}
        //2
        {int a=1;
        int b=3;
        int c=5;
        if ((b>a)||(c>a))
            System.out.println("true");
        else
            System.out.println("false");}
            //3
        {int a=1;
        int b=3;
        int c=5;
        if ((a>b)||(c>b))
            System.out.println("true");
        else
            System.out.println("false");}
        //4
        { int a=1;
            int b=3;
            int c=5;
            if ((a!=b)&&(a!=c))
                System.out.println("true");
            else
                System.out.println("false");}
        //5
        {int a=1;
        int b=3;
        int c=5;
        if ((a%2==0)&&(b%2!=0)&&(c<0))
            System.out.println("true");
        else
            System.out.println("false");}
            /*
Две клетки на шахматной доске определены своими координатами (x1,y1) и (x2,y2).
1. Может ли конь переместиться с первой на вторую клетку?
2. Может ли слон переместиться с первой на вторую клетку?
3. Может ли ладья переместиться с первой на вторую клетку?
4. Может ли король переместиться с первой на вторую клетку?
 */
        // 1
        {int x1=2;
        int y1=3;
        int x2=1;
        int y2=1;
        if (((Math.abs(x1-x2)==1)&&(Math.abs(y1-y2)==2))||((Math.abs(x1-x2)==2)&&(Math.abs(y1-y2)==1)))
            System.out.println("true");
        else
            System.out.println("false");}

            //2
        {int x1=2;
        int y1=3;
        int x2=3;
        int y2=2;
        if ((Math.abs(x2-x1))==(Math.abs(y2-y1)))
            System.out.println("true");
        else
            System.out.println("false");}

            //3
        {int x1=2;
        int y1=3;
        int x2=4;
        int y2=3;
        if ((x1==x2)||(y1==y2))
            System.out.println("true");
        else
            System.out.println("false");}

            //4
        {int x1=2;
        int y1=3;
        int x2=2;
        int y2=4;
        if (((Math.abs(x1-x2))==1)||((Math.abs(y1-y2))==1))
            System.out.println("true");
        else
            System.out.println("false");}
    }
}

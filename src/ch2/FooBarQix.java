package ch2;

public class FooBarQix {
    public static String compute(int number) {
        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append(number);

        if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || myStringBuilder.indexOf("3") != -1 ||
                myStringBuilder.indexOf("5") != -1 || myStringBuilder.indexOf("7") != -1) {
            myStringBuilder.setLength(0);
        }

        if (number % 3 == 0) {
            myStringBuilder.append("Foo");
        }

        if (number % 5 == 0) {
            myStringBuilder.append("Bar");
        }

        if (number % 7 == 0) {
            myStringBuilder.append("Qix");
        }

        char[] charList = String.valueOf(number).toCharArray();

        for (int i = 0; i < charList.length; i++) {
            if (charList[i] == '3') {
                myStringBuilder.append("Foo");
            }
            if (charList[i] == '5') {
                myStringBuilder.append("Bar");
            }
            if (charList[i] == '7') {
                myStringBuilder.append("Qix");
            }
        }

        return myStringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(compute(303));

        int y = 0;

        for (; ;) {
            if (y >= 10) {
                break;
            }
            y += ++y;
        }

        System.out.println(y);
        int i = 1;
        switch(i) {
            case 1:
                System.out.println("da1");
            case 2:
                System.out.println("da2");
                break;
            default:
                System.out.println("bla");
        }

        i = 1;
        y = 5;
        if (i == 2)
            if (i == 1)
                y = 50;
        else
            y = 500;



        System.out.println(y);

        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println("");

        for (i = 1; i <=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (i = 1; i <=10; ++i) {
            System.out.print(i + " ");
        }

        i = 1;
        do {
            System.out.print(i++);
        }
        while (i != 5);

    }
}

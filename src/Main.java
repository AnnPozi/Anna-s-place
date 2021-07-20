import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int max = 100;
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " JAVA HOME");
        }


        Man man = new Man();
        Woman woman = new Woman();
        woman.husband("bob");
        man.wife("lola");

        System.out.println(min(2, 90));

        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(1));

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(" ");
        }


        Apple apple = new Apple();
        Apple apple2 = new Apple();
        apple.addPrice(50);
        apple2.addPrice(100);

        System.out.println("Стоимость яблок " + Apple.applesPrice1);

        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);

        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);


        Human2 human2 = new Human2();
        human2.setAge(27);
        human2.setName("Alla");
        human2.setStrength(2);
        human2.setWeight(57);
        System.out.println("human weight " + human2.weight);
        System.out.println("human age " + human2.age);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = "The max is ";
        System.out.println("Input two numbers");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a>b) {max = a; }
        else { max = b; }

        System.out.println(text + max);

        int count = 0;
        int evens = 0;
        int odds = 0;
        int digit = 0;
        int number = Integer.parseInt(reader.readLine());
        int temp = number;
        while (number >0){
            number = number / 10;
            count++;
        }
        while (temp > 0)
        { digit = temp%10;
            int aa = digit%2;
            if ( aa == 0) {
                evens++; }
            else {
                odds++; }

            temp = temp /10;
            count--;


        }
        System.out.println("Even: " + evens + " Odd: " + odds);


        int[] array = initializeArray();
        int max1 = max1(array);
        System.out.println(max1);
        System.out.println("hello");

    }



    public static class Man {
        private String man = "";

        public static void wife(String woman) {

            System.out.println(woman);
        }
    }

    public static class Woman {
        String man = "";

        public static void husband(String man) {

            System.out.println(man);
        }
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else return b;

    }

    public static int convertToSeconds(int hour) {
        int sec = hour * 60 * 60;

        return sec;
    }

    public static String multiplicationTable(int number) {

        String res = "";
        for (int i = 1; i >= 10; i++) {
            Integer number1 = number * i;
            res = res + " " + number1;

        }
        return res;
    }

    public static class Apple {
        public static int applesPrice1 = 0;

        public static void addPrice(int applesPrice) {
            applesPrice1 = applesPrice1 + applesPrice;

        }

    }

    public static class Human {
        private String name = "человек";

        public void setName(String name) {
            this.name = name;

        }


    }

    public static void checkSeason(int month) {
        if (month == 1) {
            System.out.println("Winter");
        } else if (month == 2) {
            System.out.println("Winter");
        } else if (month == 12) {
            System.out.println("Winter");
        } else if (month == 11) {
            System.out.println("Autumn");
        } else if (month == 10) {
            System.out.println("Autumn");
        } else if (month == 9) {
            System.out.println("Autumn");
        } else if (month == 3) {
            System.out.println("Spring");
        } else if (month == 4) {
            System.out.println("Spring");
        } else if (month == 5) {
            System.out.println("Spring");
        } else if (month == 6) {
            System.out.println("Summer");
        } else if (month == 7) {
            System.out.println("Summer");
        } else if (month == 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Wrong number");
        }


    }

    public static class Human2 {
        private String name = "человек";
        private int age = 0;
        private int weight = 0;
        private int strength = 0;


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }


    }

    public static class Dog {
        private String nick = "собака";
        private int age = 0;

        public void setNick(String nick) {
            this.nick = nick;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNick() { return nick;}
        public int getAge() { return age;}

}

   // public static int[] getArray() throws IOException {
        // создай и заполни массив
//4return initializeArray();}

    public static int[] initializeArray() throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }


    public static int max1(int[] array) {
        int max1 = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max1) {
                max1 = array[i];
            }
        }
     return max1;
    }







}

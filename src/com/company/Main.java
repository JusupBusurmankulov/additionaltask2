package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(goWalk(generateRandomAge(),6));
        System.out.println(goWalk(generateRandomAge(),23));
        System.out.println(goWalk(generateRandomAge(),12));
        System.out.println(goWalk(generateRandomAge(),-21));
        System.out.println(goWalk(generateRandomAge(),-40));

    }
    public static String goWalk(int ageHuman, int outdoorTemperature) {
        {

            if (generateRandomAge() >= 20 && generateRandomAge() <= 45 && outdoorTemperature >= -20 && outdoorTemperature <= 30)

                return "Можно идти гулять";

            else if (generateRandomAge() < 20 && outdoorTemperature >= 0 && outdoorTemperature <= 28)

                return "Можно идти гулять";

            else if (generateRandomAge() > 45 && outdoorTemperature >= -10 && outdoorTemperature <= 25)

                return "Можно идти гулять";

            else
                return "Отсавайтесь дома";


        }


    }
    public static int generateRandomAge(){
        int a = 0;
        int b = 100;
        int ageHuman = a + (int) (Math.random() * b);
return ageHuman;


    }



}

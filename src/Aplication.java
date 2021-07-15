import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) throws Exseption {

        System.out.println("ВВедіть будь ласка слово");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();
        System.out.println(word);

        if (word.length() < 5) {
            throw new Exseption("Слово менше пяти букв");
        } else {

            System.out.println("Слово складається з пяти букв і більше");

        }

        System.out.println("Введіть будь ласка слово");
        Scanner scan1 = new Scanner(System.in);
        String word1 = scan.nextLine();

        System.out.println("Всі голосні букви буде змінено на тире");

        word1 = word1.toLowerCase().replace('а', '-');
        word1 = word1.toLowerCase().replace('е', '-');
        word1 = word1.toLowerCase().replace('и', '-');
        word1 = word1.toLowerCase().replace('і', '-');
        word1 = word1.toLowerCase().replace('о', '-');
        word1 = word1.toLowerCase().replace('у', '-');

        System.out.println(word1);

        System.out.println("Введіть будь ласка слово");
        Scanner scan2 = new Scanner(System.in);
        String word2 = scan.nextLine();

        String[] strings = word2.split(" ");

        int count = 0;


        for (int i = 0; i < strings.length; i++) {

            count = strings.length;
        }

        System.out.println("Кількість слів в речені - " + count);


    }

}

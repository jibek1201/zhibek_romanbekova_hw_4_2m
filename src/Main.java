import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> a1 = new ArrayList<>();
        List<String> a2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 names for a1 list: ");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            a1.add(name);

        }
        System.out.println("List A" + a1);

        System.out.println("Enter 5 names for a2 list: ");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            a2.add(name);

        }

        System.out.println("List B:" + a2);

        List<String> ListC = new ArrayList<>();
        int indexA = 0;
        int indexB = 4;

        for (int i = 0; i < 5; i++) {
            ListC.add(a1.get(indexA));
            ListC.add(a2.get(indexB));

            indexA++;
            indexB--;



        }

        System.out.println("List C : " +  ListC);
        Collections.sort(ListC, Comparator.comparingInt(String::length));
        System.out.println("List C after sort : " + ListC);


    }
}
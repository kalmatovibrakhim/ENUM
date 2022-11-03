import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kun = sc.nextLine();
        Days[] day = Days.values();
        for (Days d : day) {
            if(kun.equals(d.toString())){
                switch (d) {
                    case Monday -> System.out.println("Дуйшомбу куну жава окуйм");
                    case Tuesday -> System.out.println("Шейшемби куну практика жана англис тили");
                    case Wednesday -> System.out.println("Шаршемби куну жава техникалык сабак");
                    case Thursday -> System.out.println("Бейшемби куну жава практикалык сабак жана софт-скилл сабагы");
                    case Friday -> System.out.println("Жума куну жава техникалык сабак");
                    case Saturday -> System.out.println("Ишемби куну жава практикалык сабак");
                    case Sunday -> System.out.println("Жекшемби куну эс алуу");
                }
            }
            else {
                System.out.println("Кундун атын баш тамга менен англисче туура жазыныз");
                break;
            }

        }
    }

    enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday,
    }
}
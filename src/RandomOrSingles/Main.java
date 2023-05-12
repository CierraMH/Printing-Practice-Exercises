package RandomOrSingles;

import java.awt.event.HierarchyBoundsAdapter;

public class Main {
        public static void main(String[] args) throws Exception {
       MyNameIs.name();
        Vacation.vac();
        HiFriend.friend();
        }
    class MyNameIs {
            public static void name() {
                System.out.println("My name is");
                System.out.println("Cierra");
                System.out.println("Minor-Hampton");
            }
    }
    class Vacation {
            public static void vac() {
                System.out.println("I'd like to visit");
                System.out.println("Tokyo");
                System.out.println("Japan");
        }
    }
    class HiFriend {
        public static void friend() {
            String friend = "Hi " + "Carly Ping!";
            System.out.println(friend);
        }
    }
    }

import Fuck.GITcheck;
import MyCollection.Collection;

public class Main {

    public static void main(String[] args) {

        Collection humans = new Collection();

        humans.add("Igor");
        humans.add("Viktor");
        humans.add("Gena");
        humans.add("Loh");
        humans.add("Vitalya");
        humans.add("Maks");
        humans.add("Vano");
        humans.add("Luda");
        humans.add("Katya");
        humans.add("Kiruha");
        humans.add("PisMaker");

//        humans.erase(0);

//        humans.eraseString("Viktor");

        for (int i = 0; i < humans.getSize();i++) {
            System.out.println(humans.getName(i));
        }

        System.out.println(humans.getSize());
        System.out.println(humans.getLength());
    }

}

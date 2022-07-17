package Program.Animals;

public class Hamster extends Pets {

    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
        this("Безымянный хомяк");
    }

    @Override
    public void hearCall(String words) {
        // хомяк никогда никак не реагирует, так как хомяк
    }
}

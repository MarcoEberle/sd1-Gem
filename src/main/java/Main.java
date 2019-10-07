public class Main {
    public static void main(String[] args) {
        GemBox box = new GemBox();
        box.add(Gem.Diamond,1);
        box.add(Gem.Ruby,2);
        box.add(Gem.Emerald,3);
        box.print();
    }
}

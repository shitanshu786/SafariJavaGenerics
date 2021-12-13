package shopping;

public class UseAPair {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "Pair");
        String l = pair.getLeft();
        pair.setRight("Generic Pair");
        System.out.println(pair);
    }
}

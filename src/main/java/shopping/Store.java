package shopping;

public class Store {
    public static void main(String[] args) {
        ClothingPair<Shoe> pShoe = new ClothingPair<>(
                new Shoe(9, "Brown"),
                new Shoe(10, "Brown"));
        //can we do Something to make sure that both Show in a Pair are of same size??

        System.out.println("left: "+pShoe.getLeft());

        System.out.println("matched?: "+pShoe.matches());

        ClothingPair<Shoe> secondPair = new ClothingPair<>(
                new Shoe(9, "Brown"),
                new Shoe(9, "Black"));

        System.out.println("matched?: "+secondPair.matches());
    }
}

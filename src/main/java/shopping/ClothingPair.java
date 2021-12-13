package shopping;

public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public boolean matches(){
        return left.getSize()== right.getSize()
                && left.getColor()==right.getColor();
    }
}

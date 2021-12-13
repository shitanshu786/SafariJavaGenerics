package functor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AFunctor {
    //A bucket of Data with a map operation that
    //created a new bucket o'data containing the
    //results of the map operation is (kinda-sorta)
    //called a functor
    public static<A, R> List<R> map(List<A> data, Function<? super A, ? extends R> op){
        List<R> res = new ArrayList<>();
        for(A a: data){
            R r = op.apply(a);
            res.add(r);
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> ls = List.of("Shittu", "Verma");
        Function<CharSequence, Integer> lenFunc = s -> s.length();
        List<Number> lengths = map(ls, lenFunc);

        List<StringBuilder> lsb = List.of(new StringBuilder("Shittu2"), new StringBuilder("Verma2"));
        System.out.println(lengths);

        List<Number> lengths2 = map(lsb, lenFunc);
        System.out.println(lengths2);
    }
}

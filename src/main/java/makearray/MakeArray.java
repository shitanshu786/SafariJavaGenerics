package makearray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MakeArray {
    public static <F, E extends F> F[] asArray(List<E> input, Class<F> cl){
        F[] res = (F[]) Array.newInstance(cl, input.size());
        int idx=0;
        for(E e: input){
            res[idx++]=e;
        }
        return res;
    }
    public static void main(String[] args) {
        List<String> names = List.of("Shittu", "Verma");

        CharSequence[] nameArray = asArray(names, CharSequence.class);
        nameArray[0] = new StringBuilder("Shittta");
        System.out.println(Arrays.toString(nameArray));
    }
}

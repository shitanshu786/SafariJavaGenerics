package taxation;

import java.util.ArrayList;
import java.util.List;

public class TaxPreparers {
    public static void prepareTaxes(Taxable t){}

    //public static <E extends Taxable> void prepareBulkTaxes(List<E> lt){
    public static void prepareBulkTaxes(List<? extends Taxable> lt){
        for(int i=0; i<lt.size(); i++){
            Taxable t = lt.get(i);
            prepareTaxes(t);
        }
    }

    public static void collectIndividualClients(List<? super Individual> li){
        li.add(new Individual());
        Object o = li.get(0);
    }

    public static void prepareBulkTaxes(Taxable[] lt) {
        lt[0] = new Corporation();// Might fail at runtime
    }

    public static void main(String[] args) {
        List<Taxable> clients = new ArrayList<>();
        clients.add(new Corporation());
        clients.add(new Individual());

        prepareBulkTaxes(clients);
        collectIndividualClients(clients);
        //Liskov substitution principle breaks the code here.
        List<Individual> joesClients = new ArrayList<>();
        joesClients.add(new Individual());
        joesClients.add(new Individual());

        prepareBulkTaxes(joesClients); // it fails as the method has Taxable and list is not type safe like arrays.
                                        // as the method takes Taxable and in method we can add let's say
        //                                  a corporation object to list
        //We can tell specifically that we are only going to assignit to Taxable object in method.
        // then above should work.
        // will be done



        Individual[] indis = null;
        prepareBulkTaxes(indis);// NO error when array
    }
}

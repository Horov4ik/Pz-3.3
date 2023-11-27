import java.util.Comparator;

public class AnimalByAgeComparator implements Comparator<PatAnimal> {
    public Order order;

    public AnimalByAgeComparator(Order order) {
        this.order = order;
    }


    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {
        if(order == Order.ASCENDING){
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        else if(order == Order.DESCENDING){
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return 0;
    }
}

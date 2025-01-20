import java.util.ArrayList;
import java.util.Iterator;
class Demo29{
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Luna");
        arrayList.add("kai");
        arrayList.add("toshiki");
        arrayList.add("lily");
        arrayList.add("isha");
        arrayList.add("bloom");
        arrayList.add("stella");
        arrayList.add("musa");
        arrayList.add("flora");
        arrayList.add("techna");
        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("Iterating through the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
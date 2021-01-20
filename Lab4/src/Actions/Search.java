package Actions;
import Classes.Present;


public class Search {

    public void toSearch(Present obj, int begin, int end) {
        for (int i = 0; i < obj.getArr().size(); i++) {
           int sugar = obj.getArr().get(i).getSugar();
           if(begin <= sugar && end >= sugar){
               System.out.println(obj.getArr().get(i));
           }
        }
    }
}

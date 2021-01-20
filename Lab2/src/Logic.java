import java.util.ArrayList;

public class Logic {
    public void fillArr(ArrayList<Book> arr, int size){
        for(int i = 0; i < size; i++){
            arr.add(Book_Factory.createRandomBook());
        }
    }

    public void findbyAuthor(ArrayList<Book> arr, int size, String input){
        for(int i=0; i<size; i++){
            if (arr.get(i).getAuthor().equals(input)){
                displayTitle(arr,i);
            }
        }
    }
    public void findbyPublish(ArrayList<Book> arr, int size, String input) {
        for (int i = 0; i < size; i++) {
            if (arr.get(i).getPublish().equals(input)) {
                displayTitle(arr,i);
            }
        }
    }

    public void findfromYear(ArrayList<Book> arr, int size, int input) {
        for(int i=0; i<size; i++){
            if (arr.get(i).getYear()>input){
                displayTitle(arr,i);
            }
        }
    }

    public void displayTitle(ArrayList<Book> arr, int addr){
        System.out.printf("\n "+arr.get(addr).getTitle()+"\n ");
    }
}

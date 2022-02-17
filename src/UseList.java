import java.util.ArrayList;
import java.util.List;

public class UseList extends User{

    public static void main(String[] args){
        List <String> users = new ArrayList<>();
        users.add("Ivan");
        users.add("Oleg");
        users.add("Ira");
        users.add("Max");
        users.add("Andriy");
        users.add("Olesia");
        users.add("Vi");

        for (int i = 0; i < users.size(); i++){
            System.out.println(users.get(i));
        }
        for (int i = 6; i < users.size(); i--){

            System.out.println(users.get(i));
        }
    }
}

import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        HashSet<String> giochi = creaHashSet();
        System.out.println("la grandezza dell'hashset è: " + giochi.size());
        System.out.println(giochi);

    }
    public static HashSet<String> creaHashSet(){
        HashSet<String> giochi = new HashSet<>();
        giochi.add("Dark Souls");
        giochi.add("Elden Ring");
        giochi.add("Bloodborne");
        giochi.add("Lies Of P");
        giochi.add("Sekiro");
        return giochi;
    }
}

public class Main {
    public static void main(String[] args){
        var list = new GeneralList<String>();
        list.add("a");
        list.add("b");
        for (var item : list)
            System.out.println(item);
    }
}

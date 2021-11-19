public class Main {
    public static void main(String[] args) {
        ArrayOrdinabile<String> arrayOrdinabile = new ArrayOrdinabile<>();
        arrayOrdinabile.addModulo(new SortableListImpl());
        arrayOrdinabile.add("2");
        arrayOrdinabile.add("3");
        arrayOrdinabile.add("1");
        arrayOrdinabile.print();
    }
}

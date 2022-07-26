package by.lesson2;

public class Main {
    private int i;
    private float b;
    private char c;
    private boolean d;
    private String str;
    private byte e;
    private short f;
    private  long g;
    private double h;

    //Классы
    private Long l;
    private Integer in;
    private Float fl;
    private Character cr;
    private Boolean bl;
    private Byte by;
    private Short sh;
    private Double db;

    /**
     * Метод для запуска
     * @param args
     */
    public static void main(String[] args) {
        int i1;
        String string;
        Boolean bool;
        Integer integer;

        Service service = new Service();
        service.setStr("Bye");
        System.out.println(service.getStr());

            String str = "bla bla";
            int s;

            s = (Integer) str;
            System.out.println(s);
        System.out.println("Cast String to int" + stringToInt(s));
        }
private static int stringToInt(String s){
        int b = Integer.valueOf(s);
        return b;

        private static int singToInt(String s){
        int b = Integer.valueOf(s);
        return b;

}
    public static void Map(String[] args) {}


}

    public static void Map(String[] args) {
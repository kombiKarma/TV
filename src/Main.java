public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        // Ctrl + R - замена текста Volume -> Channel
        System.out.println(tv.setChannel(0));
        System.out.println(tv.setChannel(200)); // Ctrl + D - дублирование строки
        System.out.println(tv.setChannel(-9));
    }
}

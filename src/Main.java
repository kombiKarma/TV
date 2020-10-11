public class Main {
    public static void main(String[] args) {
        // только если много параметров, тогда можно в несколько строк
        // constructor - средство принуждение
        TV tv = new TV(
                100,
                0,
                10,
                0,
                1,
                50
        );
        // Ctrl + R - замена текста Volume -> Channel
//        System.out.println(tv.setChannel(0));
//        System.out.println(tv.setChannel(200)); // Ctrl + D - дублирование строки
//        System.out.println(tv.setChannel(-9));

        Plan plan = new Plan(100_00);
        // Конструкторы: специальные "методы", предназначенные для инициализации объектов
        // 1. Нет возвращаемого типа
        // 2. Называются также как класс
        // 3. Если мы не пишем конструктор, Java создаёт его сама (default)
        // 4. return не нужен, автоматически (т.е. за вас) возвращается созданный объект
        // 5. Если ты объявляешь свой конструктор, то Java default уже не создаёт
    }
}

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.getCurrentChannel());
//        tv.currentVolume = -100; не работает
//        System.out.println(tv.currentChannel); не работает
//        System.out.println(tv.currentVolume); не работает
//        int currentVolume = 0;
//        currentVolume = currentVolume + 1;
//        tv.increaseVolume();
//        System.out.println(tv.getCurrentVolume());
//        tv.increaseVolume();
//        System.out.println(tv.getCurrentVolume());
        System.out.println(tv.increaseVolume());
        System.out.println(tv.increaseVolume());
        System.out.println(tv.setChannel(100));
    }
}

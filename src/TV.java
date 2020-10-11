// 1. Все поля private
// 2. Методы, к которым нужен публичный (используются снаружи) - public
public class TV {
    // access modifiers (модификаторы):
    // public - доступно всем (ото всюду)
    // private - то, что доступно только внутри фигурных скобок класса
    // поля объекта - приватные
    private int currentChannel;
    private int currentVolume;

    // getter'ы
    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // методы публичные
    public int increaseVolume() {
        currentVolume = currentVolume + 1;
        return currentVolume;
    }

    public int decreaseVolume() {
        currentVolume = currentVolume - 1;
        return currentVolume;
    }

    // Ctrl + Shift + Alt + левая кнопка мыши (multi-cursors)
    // Escape - выход из режима multi-cursor
    public int increaseChannel() {
        currentChannel = currentChannel + 1;
        return currentChannel;
    }

    public int decreaseChannel() {
        currentChannel = currentChannel - 1;
        return currentChannel;
    }

    public int setChannel(int channel) {
//        currentChannel = channel - expression, значение которого равно тому, что мы присвоили
//        return currentChannel = channel;
        currentChannel = channel;
        return currentChannel;
    }
}

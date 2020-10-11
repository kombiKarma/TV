// 1. Все поля private
// 2. Методы, к которым нужен публичный (используются снаружи) - public
public class TV {
    // *Настройки по умолчанию*
    // 1. Если не указать значения инициализации, то будут нулевые 0, 0.0, false, null
    // 2. Если указать - то у каждого объекта они будут свои, но те, которые указали
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxChannel = 10;
    private int minChannel = 1;
    // access modifiers (модификаторы):
    // public - доступно всем (ото всюду)
    // private - то, что доступно только внутри фигурных скобок класса
    // поля объекта - приватные
    private int currentChannel = 1;
    private int currentVolume = 5;

    // getter'ы
    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // методы публичные
    public int increaseVolume() {
        // ctrl + alt + f - создание поля
        if (currentVolume == maxVolume) { // договорились на 10 вместо 100, чтобы не усложнять
            return currentVolume;
        }

        currentVolume = currentVolume + 1;
        return currentVolume;
    }

    public int decreaseVolume() {
        // early exit
        if (currentVolume == minVolume) {
            return currentVolume;
        }

        currentVolume = currentVolume - 1;
        return currentVolume;
    }

    // Ctrl + Shift + Alt + левая кнопка мыши (multi-cursors)
    // Escape - выход из режима multi-cursor
    public int increaseChannel() {
        if (currentChannel == maxChannel) { // договорились, что будет всего 10 каналов
            currentChannel = minChannel;
            return currentChannel;
        }

        currentChannel = currentChannel + 1;
        return currentChannel;
    }

    public int decreaseChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
            return currentChannel;
        }

        currentChannel = currentChannel - 1;
        return currentChannel;
    }

    public int setChannel(int channel) {
        // арифметические операторы: +, -, /, *
        // операторы сравнения: >, <, ==, !=, >=, <=
        // логические операторы:
        //
        // && (И) - true && true = true (только в этом случае)
        // || (ИЛИ) - false || false = false (только в этом случае)
        // ! (НЕ) - !true -> false, !false -> true (отрицание)
        // лучше писать так, как ниже (а не так, как здесь)
//        if (channel < 0 || channel > 10) {
//            return currentChannel;
//        }
//        if (channel >= 0 && channel <= 10) {
//            currentChannel = channel;
//            return currentChannel;
//        }
        if (channel < minChannel) {
            return currentChannel;
        }

        // channel >= 0
        if (channel > maxChannel) {
            return currentChannel;
        }

        // проверка на заблокировано (просто добавится вниз)
//        if (isBlocked()) {
//            return currentChannel;
//        }

        currentChannel = channel;
        return currentChannel;
    }

//    так точно не нужно!
//    public int setBadChannel(int channel) {
//        if (channel >= 0) {
//            if (channel <= 10) {
//                if (isBlocked) {
//                    currentChannel = channel;
//                }
//            } else {
//                // do nothing
//            }
//        } else {
//            // do nothing
//        }
//
//        return currentChannel;
//    }
}

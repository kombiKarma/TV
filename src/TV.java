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
        if (currentVolume == 10) { // договорились на 10 вместо 100, чтобы не усложнять
            return currentVolume;
        }

        currentVolume = currentVolume + 1;
        return currentVolume;
    }

    public int decreaseVolume() {
        // early exit
        if (currentVolume == 0) {
            return currentVolume;
        }

        currentVolume = currentVolume - 1;
        return currentVolume;
    }

    // Ctrl + Shift + Alt + левая кнопка мыши (multi-cursors)
    // Escape - выход из режима multi-cursor
    public int increaseChannel() {
        if (currentChannel == 10) { // договорились, что будет всего 10 каналов
            currentChannel = 0;
            return currentChannel;
        }

        currentChannel = currentChannel + 1;
        return currentChannel;
    }

    public int decreaseChannel() {
        if (currentChannel == 0) {
            currentChannel = 10;
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
        if (channel < 0) {
            return currentChannel;
        }

        // channel >= 0
        if (channel > 10) {
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

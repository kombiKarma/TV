public class Plan {
    // хочу, чтобы сразу был баланс
    private int balance;
    // при создании объекта хочу, сразу инициализировался нужной суммой

    // объявляем свой конструктор
    // через конструктор пройдёт каждый объект и в нём заполнится поле balance
//    public Plan(int initialBalance) {
//        this.balance = initialBalance; // Одно и то же
//        balance = initialBalance; // Одно и то же
//        // this - специальное слово
//    }

//    public Plan(int balance) { // параметр (имеет приоритет над полем)
//        // внутри фигурных скобок balance - это параметр
//        // shadowing (сокрытие имён)
//        this.balance = balance;
//    }

    // Alt + Insert (сгенерировать) - Constructor
    public Plan(int balance) {
        this.balance = balance;
    }
}

// Динамическая диспетчеризация методов
class SuperClass5 {
    void callme(){
        System.out.println("В методе  callme() из класса SuperClass5");
    }
}

// Создаём первый подкласс
class PodClass5B extends SuperClass5{
    void callme(){
        System.out.println("В методе callme() из класса PodClass5B");
    }
}

// Создаём второй подкласс
class PodClass5C extends SuperClass5{
    void callme(){
        System.out.println("В методе callme() из класса PodClass5C");
    }
}

// Создаём исполняемый класс
class Dispatch {
    public static void main(String[] args) {
        SuperClass5 a = new SuperClass5();  //создаём объект класса SuperClass5
        PodClass5B b = new PodClass5B();    //Создаём объект класса PodClass5B
        PodClass5C c = new PodClass5C();    //Создаём объект класса PodClass5B

        SuperClass5 r;                      //Создаём ссылку на объект типа SuperClass5

        r = a;       // переменная "r" ссылается на объект типа SuperClass5
        r.callme();  // вызываем метод callme() из SuperClass5

        r = b;       // переменная "r" ссылается на объект типа PodClass5B
        r.callme();  // вызываем метод callme() из PodClass5B

        r = c;       // переменная "r" ссылается на объект типа PodClass5C
        r.callme();  // выозываем метод callme() из PodClass5C
    }
}
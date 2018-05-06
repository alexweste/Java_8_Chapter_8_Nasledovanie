/* Вызов конструкторов суперкласса с помощью ключевого слова super
Вызов метода super() всегда должен быть первым оператором, выполняемым
в конструкторе подкласса.

В примере ниже в классе BoxWeight2 ключевое слово super используется
для инициализации собственных свойств объекта типа Box
 */
class Box2 {
    private double width;     //создаём закрытые переменные
    private double height;    //width, height и depth
    private double depth;

    // Конструируем клон объекта
    Box2(Box2 ob) { // передаём объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Создаём конструктор, применяемый при указании всех розмеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Создаём конструктор, применяемый в отсутствии розмеров
    Box2() {
        width = -1; // Значение -1 служит для обозначения
        height = -1;// неинициализированного параллелепипеда
        depth = -1;
    }

    // Создаём конструктор, применяемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // расчитываем и возвращаем объём параллелепипеда
    double volume() {
        return width * height * depth;

    }
}
class BoxWeight2 extends Box2{
    double weight; // переменная веса параллелепипеда

    // инициализируем поля width, height, depth
    // с помощью метода super()

    // сконструировать клон объекта
    BoxWeight2(BoxWeight2 ob){ // передаём объект конструктору
                               // переменную из суперкласса Box2,
                               // в данном случае "ob" можно
                               // использовать для ссылки на объект
                               // BoxWeoght2, который унаследован
                               // от суперкласса Box2
        super(ob); // вызываем конструктор суперкласса
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); // вызываем конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight2() {
        super(); // вызываем конструктор суперкласса
        weight = -1;
    }

    // конструктор, применяемый при созданнии куба
    BoxWeight2(double len, double m) {
        super(len); // вызываем конструктор суперкласса
        weight = m;
    }
}

class DemoBoxWeight2{
    public static void main(String[] args){
        BoxWeight2 mybox1 = new BoxWeight2(10, 25, 30,4.4);
        BoxWeight2 mybox2 = new BoxWeight2(7, 6, 5, 9.0028);
        BoxWeight2 mybox3 = new BoxWeight2(); //параллелепипед по умолчанию
        BoxWeight2 mycube = new BoxWeight2(3, 2); //параметры куба
        BoxWeight2 myclone = new BoxWeight2(mybox1); //создаём клон mybox1
        double vol;


        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объём mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объём myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объём mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();

    }
}
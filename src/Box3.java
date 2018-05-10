class Box3 {
    private double width;     //создаём закрытые переменные
    private double height;    //width, height и depth
    private double depth;

    // Конструируем клон объекта
    Box3(Box3 ob) { // передаём объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Создаём конструктор, применяемый при указании всех розмеров
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Создаём конструктор, применяемый в отсутствии розмеров
    Box3() {
        width = -1; // Значение -1 служит для обозначения
        height = -1;// неинициализированного параллелепипеда
        depth = -1;
    }

    // Создаём конструктор, применяемый при создании куба
    Box3(double len) {
        width = height = depth = len;
    }

    // расчитываем и возвращаем объём параллелепипеда
    double volume() {
        return width * height * depth;

    }
}
class BoxWeight3 extends Box3{
    double weight; // переменная веса параллелепипеда

    // инициализируем поля width, height, depth
    // с помощью метода super()

    // сконструировать клон объекта
    BoxWeight3(BoxWeight3 ob){ // передаём объект конструктору
        // переменную из суперкласса Box3,
        // в данном случае "ob" можно
        // использовать для ссылки на объект
        // BoxWeoght3, который унаследован
        // от суперкласса Box3
        super(ob); // вызываем конструктор суперкласса
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d); // вызываем конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight3() {
        super(); // вызываем конструктор суперкласса
        weight = -1;
    }

    // конструктор, применяемый при созданнии куба
    BoxWeight3(double len, double m) {
        super(len); // вызываем конструктор суперкласса
        weight = m;
    }
}

// добавляем поле стоимости доставки
class Shipment extends BoxWeight3 {
    double cost;

    // конструируем клон объекта
    Shipment(Shipment ob) { //создаём и передаём объект конструктору
        super(ob);
        cost = ob.cost;
    }

    //создаём конструктор, который будет использоваться при указании
    //всех параметров
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m); //вызываем конструктор суперкласса
        cost = c;
    }

    //создаём конструктор, который будет использоваться если параметры
    //не будут указаны
    Shipment(){
        super();
        cost = -1;
    }

    //создаём конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
/*
// Расширяем класс Shipment, включая в него свойство цвета (Color)
class ColorBox extends Shipment{
    char color; // вводим переменную, отвечающую за цвет параллелепипеда
    // конструируем клон объекта
    ColorBox(ColorBox ob2) { //создаём и передаём объект конструктору
        super(ob2);
        color = ob2.color;
    }
    //создаём конструктор, который будет использоваться при указании
    //всех параметров
    ColorBox(double w, double h, double d, double m, double c, char cl) {
        super(w, h, d, m, c); //вызываем конструктор суперкласса
        color = cl;
    }
    //создаём конструктор, который будет использоваться если параметры
    //не будут указаны
    ColorBox() {
        super();
        color = 'notcolor';
    }

    //создаём конструктор, применяемый при создании куба
    ColorBox(double len, double m, double c, char cl) {
        super(len, m, c);
        color = cl;
    }*/


// создаём исполняющий класс
class DemoShipment{
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(20, 34, 15, 22, 4.54);
        Shipment shipment2 = new Shipment();
        Shipment shipment3 = new Shipment(123, 4, 5);
        Shipment shipment4 = shipment2;

        /*ColorBox color1 = new ColorBox(20,34,15,22,4.54, 'grin');
        ColorBox color2 = new ColorBox();
        ColorBox color3 = new ColorBox(123,4,5, 'blue');
        ColorBox color4 = color1;*/

        double vol;
        vol = shipment1.volume();
        System.out.println("Объём shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $ " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объём shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $ " + shipment2.cost);
        System.out.println();

        vol = shipment3.volume();
        System.out.println("Объём shipment3 равен " + vol);
        System.out.println("Вес shipment3 равен " + shipment3.weight);
        System.out.println("Стоимость доставки: $ " + shipment3.cost);
        System.out.println();

        vol = shipment4.volume() + 2;
        System.out.println("Объём shipment4 равен " + vol);
        System.out.println("Вес shipment4 равен " + shipment4.weight);
        System.out.println("Стоимость доставки: $ " + shipment4.cost);
        System.out.println();
    }


        /*System.out.println("Объём shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $ " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объём shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $ " + shipment2.cost);
        System.out.println();

        vol = shipment3.volume();
        System.out.println("Объём shipment3 равен " + vol);
        System.out.println("Вес shipment3 равен " + shipment3.weight);
        System.out.println("Стоимость доставки: $ " + shipment3.cost);
        System.out.println();

        vol = shipment4.volume() + 2;
        System.out.println("Объём shipment4 равен " + vol);
        System.out.println("Вес shipment4 равен " + shipment4.weight);
        System.out.println("Стоимость доставки: $ " + shipment4.cost);
        System.out.println();    }*/
}
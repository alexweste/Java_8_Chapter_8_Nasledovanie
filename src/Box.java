// Применим наследование для расширения класса Box
class Box {
    double width;
    double height;
    double depth;

    // Конструируем клон объекта
    Box(Box ob) { // передаём объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Создаём конструктор, применяемый при указании всех розмеров
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Создаём конструктор, применяемый в отсутствии розмеров
    Box(){
        width = -1; // Значение -1 служит для обозначения
        height = -1;// неинициализированного параллелепипеда
        depth = -1;
    }
    // Создаём конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // расчитываем и возвращаем объём параллелепипеда
    double volume(){
        return width * height * depth;
    }
}

// расширяем в него класс Box, включив в него поле веса
class BoxWeight extends Box {
    double weight; // добавляем переменную, отвечающую за вес параллелепипеда

    // создаём конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

// Расширяем класс Box, включая в него свойство цвета
class ColorBox extends Box{
    char color; // вводим переменную, отвечающую за цвет параллелепипеда

    // создаём конструктор ColorBox
    ColorBox(double w, double h, double d, char c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
class DemoBoxWeight{
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10, 25, 30,4.4);
        BoxWeight mybox2 = new BoxWeight(7, 6, 5,9.0028);

        ColorBox mybox3 = new ColorBox(15, 23, 35, 'g');
        ColorBox mybox4 = new ColorBox(17, 65, 16,'b');
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
        System.out.println("Цвет mybox3 равен " + mybox3.color);
        System.out.println();

        vol = mybox4.volume();
        System.out.println("Объём mybox4 равен " + vol);
        System.out.println("Цвет mybox4 равен " + mybox4.color);
        System.out. println();
    }
}
/*Переопределение метода в иерархии классов
Рассмотрим пример, в котором с помощью переопределения методов
(в данном случае это метод area)вычисляется площадь треугольника
 и четырёхугольника (подклассы), которые явлются производными от
многоугольника(суперкласс).
 */
// Создаём суперкласс Figure (многоугольник)
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    // подсчитываем и выводим площадь многоугольника
     double area(){
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}

// Создаём наследственный подкласс треугольник Triangle
class Triangle extends Figure {
     Triangle (double a, double b){
         super (a, b);
     }

     // подсчитываем и выводим площадь треугольника
    double area(){
         System.out.println("Площадь треугольника равна:");
         return dim1 * dim2 / 2;
    }

}

// Создаём наследственный подкласс четырёхугольник Rectangle
class Rectangle extends Figure{
    Rectangle (double a, double b){
        super (a, b);
    }

    // подсчитываем и выводим площадь четырёхугольника
    double area(){
        System.out.println("Площадь четырёхугольника равна:");
        return dim1 * dim2;
    }
}

// Создаём исполняемый класс
class FindAreas {
    public static void main(String[] args){
        Figure f = new Figure(10, 11);
        Triangle t = new Triangle(5, 6);
        Rectangle r = new Rectangle(7, 8);
        Figure figref;

        figref = f;
        System.out.println(figref.area());

        figref = r;
        System.out.println(figref.area());

        figref = t;
        System.out.println(figref.area());
    }
}

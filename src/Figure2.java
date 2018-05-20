/* Второй пример применения абстрактных классов.
Несмотря на то что абстрактные классы не позволяют экземпляры объектов,
их всё же можно применять для создания ссыок на объекты, поскольку в Java
полиморфизм во время выполнения реализован с помощью ссылок на суперкласс.
 В примере ниже объявление объектоа типа Figure для абстрактного класса не
 допустимо
 */
abstract class Figure2 {
    double dim1;
    double dim2;
    Figure2(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    // в данном случае метод area() объявляем абстрактным
    abstract double area();
}

// создаём подкласс четырёхугольник
class Rectangle2 extends Figure2{
    Rectangle2(double a, double b){
        super(a, b);
    }

    // переопределяем метод area() для четырёхугольника
    double area(){
        System.out.println("Для четырёхугольника.");
        return dim1 * dim2;
    }
}

// создаём подкласс треугольник
class Triangle2 extends Figure2{
    Triangle2(double a, double b){
        super(a, b);
    }

    // переопределяем метод area() для треугольника
    double area(){
        System.out.println("Для треугольника.");
        return dim1 * dim2 / 2;
    }
}

// исполняемый класс
class AbstractAreas2{
    public static void main(String[] args){
        //Figure2 f = new Figure2(10, 11);  //теперь не допустимо
        Triangle2 t = new Triangle2(5, 6);
        Rectangle2 r = new Rectangle2(7, 8);
        Figure2 figref; // верно, но объект не создаётся
        /* В данном случае переменная figref является ссылкой на класс
        Figure2, что позволяет её использовать для ссылки на объект
        любого класса, производного от суперкласса Figure
         */


       /* figref = f;
        System.out.println("Площадь равна" + figref.area());
*/

        figref = r;
        System.out.println("Площадь равна" + figref.area());

        figref = t;
        System.out.println("Площадь равна" + figref.area());
    }
}
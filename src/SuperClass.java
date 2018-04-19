/* Основы наследования
    Чтобы наследовать класс, достаточно ввести определение одного
   класса в другой, используя ключевое слово extends.
   В приведённой ниже программе создаются суперкласс SuperClass и
  подкласс PodClass
 */
// Создаём суперкласс
class SuperClass {
    int i, j;

    void showij(){
        System.out.println("i и j: " + i + " и " + j);
    }
}

// Создаём подкласс путём расширения SuperClass
class PodClass extends SuperClass{
    int k;

    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

// Создаём рабочий класс с методом main()
class SimpleInheritance {
    public static void main(String[] args){
        SuperClass superOb = new SuperClass();
        PodClass subOb = new PodClass();

        // Суперкласс может использоваться самомтоятельно
        superOb.i = 10;
        superOb.j = 30;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        /* Подкласс имеет доступ как к своим членам, так и ко
        всем открытым членам своего суперкласса
         */
        subOb.i = 8;
        subOb.j = 20;
        subOb.k = 16;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        // Вычислим и выведем сумму всех членов
        System.out.println();
        System.out.println("Сумма i, j, k в объекте subOb: ");
        subOb.sum();
    }
}
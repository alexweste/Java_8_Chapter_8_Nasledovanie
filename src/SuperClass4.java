/* Порядок вызова конструкторов при работе с иерархиями нескольких
подклассов
 */
// Продемонстрируем порядок вызова конструкторов на примере.
// Создадим суперкласс, подкласс, который наследует суперкласс, а также
// подкласс, который наследует первый подкласс.
class SuperClass4 {
    SuperClass4() {
        int i = 1;
        System.out.println("Конструктор SuperClass4, i=" + i);
    }
}
class PodClass4 extends SuperClass4{
    int i;
    PodClass4() {

        System.out.println("Конструктор PodClass4, i=" + i);
    }
}
class PodPodClass extends PodClass4{
    int i;
    PodPodClass(int a, int b) {
        super.i = a;
        i = b;
        System.out.println("Конструктор PodPodClass, i=" + i);
    }
}

// Создаём исполняемый класс
class CallingCons{
    public static void main(String[] args){
        PodPodClass ob = new PodPodClass(2,3);
    }
}

/* Переменная суперкласса может ссылаться на объект подкласса
  Ссылочной переменной из суперкласса может быть присвоена ссылка
на любой подкласс, производный от этого суперкласса.
 */
class RefDemo {
    public static void main(String[] args){
        BoxWeight weightbox = new BoxWeight(4, 9, 10, 17.8);
        Box plainbox = new Box();
        double vol;
// посчитаем и выведем объём куба weightbox
        vol = weightbox.volume();
        System.out.println("Объём weightbox равен " + vol);
        System.out.println("Вес weghtbox равен " + weightbox.weight);
        System.out.println();

        // присвоить ссылке на объект BoxWeight ссылки на объект Box
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, так как метод volume() определён в классе Box
        System.out.println("Объём plainbox равен " + vol);

    }
}

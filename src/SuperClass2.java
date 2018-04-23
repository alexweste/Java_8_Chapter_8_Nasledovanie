/* Несмотря на то, что подкласс включает в себя все члены своего
суперкласса, он не может иметь доступ к тем членам суперкласса,
которые объявлены как privat.
  В приведённой ниже программе в иерархии классов закрытыми
 остаются в пределах своего класса.
  Эта программа содержит ошибку, и поэтому
  скомпилировать её не удастся.
 */
// Создаём суперкласс
class SuperClass2 {
    int i;                  // этот член открыт по умолчанию
    private int j;          // этот член закрыт в классе SuperClass2

    void setij(int x, int y){
        i = x;
        j = y;
    }


    int setreturnj(){
        return j;
    }
}

// Член j класса SuperClass2 в подклассе PodClass2 будет недоступен
class PodClass2 extends SuperClass2{
    int total;

    void sum(){
        total = i + setreturnj(); // ОШИБКА: член j в этом классе недоступен
    }
}

class Accses {
    public static void main(String[] args){
        PodClass2 subOb = new PodClass2();

        subOb.setij(10,13);
        subOb.sum();
        System.out.println("Сумма равнв " + subOb.total);
    }
}

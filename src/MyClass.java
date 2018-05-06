class MyClass1 {
    int i ;

     void MyMetod(int i){
            this.i = i;
            System.out.println("i1 = " + i);
        }
    void MyMetod2(int i){
       i = i;
        System.out.println("i2 = " + i);
    }
}

class MyClass{
    public static void main(String[] args){
        MyClass1 th = new MyClass1();

        th.MyMetod(5);
        th.MyMetod2(6);

    }
}
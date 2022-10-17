package polimorfizm;

public class Main {

    public static void main(String[] args ){
        I iA = new A();
        I iB = new B();
        I iC = new C();
        for(int i=0; i<20; i++){
            iA.print();
            iC.print();
            iB.print();
        }
    }
}

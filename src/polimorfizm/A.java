package polimorfizm;

public class A extends B implements I{

    @Override
    public String naming() {
        return "����";
    }

    @Override
    public void print(){
        super.print();
    }

}

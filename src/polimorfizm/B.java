package polimorfizm;

public class B implements I{

    public String naming() {
        return "���B";
    }

    public void print() {
        System.out.println(this.naming());
    }
}

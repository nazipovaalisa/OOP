package taxOffice;

public class TaxOffice {
    private Sitizen[] sit;

    TaxOffice(Sitizen[] sit){
        this.sit = sit;
    }
    static int NDFL(Sitizen s){
        int j=0;
        for(int i=0; i < s.getCount(); i++){
            if(s.getChildren(i).getAge()<18)
                j++;
        }
        if(j>2)
            return 6;
        else
            return 13;
    }
    public static void main(String[] args){
        try {
            Sitizen s1 = new Sitizen("������ ���� ��������", 30);
            Sitizen s2 = new Sitizen("�������� ���� ��������", 25);
            Sitizen s3 = new Sitizen("������ ����� ��������", 36);
            s1.AddChildren(new Sitizen("������� ������� ��������", 1));
            s2.AddChildren(new Sitizen("������� ������ ���������", 5));
            s2.AddChildren(new Sitizen("�������� ����� ���������", 7));
            s2.AddChildren(new Sitizen("�������� ��������� ���������", 1));
            s3.AddChildren(new Sitizen("������ ���� ����������", 18));
            s3.AddChildren(new Sitizen("����� ������ ����������", 12));
            s3.AddChildren(new Sitizen("������ ����� ����������", 9));
            Sitizen[] sitizens = {s1,s2,s3};
            for(int i = 0; i<sitizens.length; i++){
                System.out.println("��� ����������: "+sitizens[i].getFio() + " | ������: "+ TaxOffice.NDFL(sitizens[i])+"%");
                System.out.println("����:");
                for (int j = 0; j < sitizens[i].getCount(); j++)
                    System.out.println("    "+sitizens[i].getChildren(j).getFio() +" �������: "+ sitizens[i].getChildren(j).getAge());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

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
            Sitizen s1 = new Sitizen("Иванов Иван Иванович", 30);
            Sitizen s2 = new Sitizen("Сидорова Анна Петровна", 25);
            Sitizen s3 = new Sitizen("Бузова Ольга Игоревна", 36);
            s1.AddChildren(new Sitizen("Иванова Людмила Ивановна", 1));
            s2.AddChildren(new Sitizen("Сидоров Матвей Андреевич", 5));
            s2.AddChildren(new Sitizen("Сидорова Ольга Андреевна", 7));
            s2.AddChildren(new Sitizen("Сидорова Маргарита Андреевна", 1));
            s3.AddChildren(new Sitizen("Бузова Анна Дмитриевна", 18));
            s3.AddChildren(new Sitizen("Бузов Максим Дмитриевич", 12));
            s3.AddChildren(new Sitizen("Бузова Диана Дмитриевна", 9));
            Sitizen[] sitizens = {s1,s2,s3};
            for(int i = 0; i<sitizens.length; i++){
                System.out.println("ФИО гражданина: "+sitizens[i].getFio() + " | ставка: "+ TaxOffice.NDFL(sitizens[i])+"%");
                System.out.println("Дети:");
                for (int j = 0; j < sitizens[i].getCount(); j++)
                    System.out.println("    "+sitizens[i].getChildren(j).getFio() +" возраст: "+ sitizens[i].getChildren(j).getAge());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

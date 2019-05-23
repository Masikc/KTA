import java.util.Scanner;
 
public class Console {
 
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        System.out.print("Марка материала: ");
        String mat=in.nextLine();
        double Kom=0;
        switch (mat) {
            case "ВЖ36-12":
            case "АНВ-300":
            case "ЖС6-К":
            case "ЖС3-ДК":
            case "ХН67ВМТЮЛ": Kom=0.02;
                     break;
            case "ХН62МКВЮ":
            case "ХН60МТВЮ":
            case "ХН82ТЮМВ": Kom=0.03;
                     break;
            case "ХН56МТЮ":
            case "ХН70ВМТЮ":
            case "ВХ4-Л": Kom=0.04;
                     break;
            case "95Х18":
            case "ХН35ВТЮ": Kom=0.05;
                     break;
            case "43Х3СНМВФА": Kom=0.06;
                     break;
            case "38Н5МСФА": Kom=0.065;
                     break;
            case "42Ч2ГСНМ": Kom=0.068;
                     break;
            case "30НХТЮ":
            case "ХН38ВТ":
            case "ХН38ТЮР": Kom=0.07;
                     break;
            case "28Х3СНВЧ":
            case "30Х2ГСН2ВМ": Kom=0.085;
                     break;
            case "10Х11Н23Т3МР":
            case "15Х18Н21С4ТЮР": Kom=0.09;
                     break;
            case "ВТ3": Kom=0.12;         
                     break;
            case "08Х15Н24В4ТР":
            case "ВТ14":
            case "ВТ22":
            case "ВТ15": Kom=0.13;
                     break;
            case "ВТ6": Kom=0.135;
                     break;
            case "20Х13":
            case "30Х13":
            case "12Х25Н16Т7АР": Kom=0.15;
                     break;
            case "33Х3СНМВФА":
            case "38Х3СНМВФА": Kom=0.17;
                     break;
            case "45Х14Н14В2М":
            case "ВТ4":
            case "ВТ5": Kom=0.19;
                     break;
            case "20Х23Н18":
            case "12Х21Н5Т":
            case "09Х15Н9Ю": Kom=0.21;
                     break;
            case "20Х3МВФ":
            case "40Х13":
            case "МХ17Н2":
            case "20Х17Н2":
            case "12Х18Н10Т":
            case "07Х16Н6":
            case "ВТ1":
            case "Н18К9М5Т": Kom=0.24;
                     break;
            case "09Х16Н46": Kom=0.26;
                     break;
            case "10Х23Н18": Kom=0.29;
                     break;
            case "11Х11Н2ВМФ":
            case "1Х12Н2ВМФ": Kom=0.3;
                     break;
            case "12Х13": Kom=0.35;
                     break;
            case "15ХМ5":
            case "15Х6СЮ":
            case "25Х13Н2": Kom=0.5;
                     break;
            case "34ХН3М":
            case "34ХНМ3Ф": Kom=0.56;
                     break;
            default: System.out.printf("Материал детали отсутствует в базе");
                     break;
        }
        
        System.out.print("Количество поверхностей детали, обрабатываемых резанием:");
        int Krez=in.nextInt();
        double A1=0;
        if (Krez>20) A1=0.2;
        double Kk=1-A1;
        
        System.out.print("Количество повышенных требований по точностям формы и взаимного расположения поверхностей:");
        int Ktreb=in.nextInt();
        double A2=0;
        if (Ktreb>0 && Ktreb<=2) A2=0.2;
        if (Ktreb>2) A2=0.4;
        double Kp=1-A2;
        
        System.out.print("Количество видов механической обработки:");
        int Kmeh=in.nextInt();
        double A3=0;
        if (Kmeh>2) A3=0.1;
        double Kv=1-A3;
        
        System.out.print("На детали есть поверхности, обрабатываемые резанием не грубее 10-го квалитета?:");
        String Kv10=in.nextLine();
        double Kc=1;
        if (Kv10=="да")
        {
        	System.out.print("Количество поверхностей, отстающих от оптимальной зоны на одну зону:");
            int N1=in.nextInt();
            System.out.print("Количество поверхностей, отстающих от оптимальной зоны на две зоны:");
            int N2=in.nextInt();
            System.out.print("Количество поверхностей, отстающих от оптимальной зоны на три зоны:");
            int N3=in.nextInt();
            System.out.print("Количество поверхностей, отстающих от оптимальной зоны на четыре зоны:");
            int N4=in.nextInt();
            double A4=0.1*(N1+N2*2+N3*3+N4*4);
            if (A4>1)
            {
            	A4=1;
            }
            Kc=1-A4;
        }
        
        double Ksl=0.25*(Kk+Kp+Kv+Kc);
        
        System.out.print("Введите Кпов:");
        double Kpov=in.nextDouble();
        
        System.out.print("Общее количество конструктивных элементов в детали:");
        int Ne=in.nextInt();
        System.out.print("Количество унифицированных конструктивных элементов детали:");
        int Nue=in.nextInt();
        System.out.print("Количество нетехнологичных элементов детали:");
        int n=in.nextInt();
        double Kue=Nue/Ne-0.1*n;
        
        System.out.print("Объем заготовки детали:");
        double Vz=in.nextDouble();
        System.out.print("Объем обработанной детали (без покрытий):");
        double Vd=in.nextDouble();
        double Kim=Vd/Vz;
        
        double Kt=(Kom*0.8+Ksl*0.7+Kpov*0.6+Kue*0.7+Kim)/(0.8+0.7+0.6+0.7+1);
        
        System.out.printf("Kom= %f ", Kom);
        System.out.printf("Kpov= %f ", Kpov);
        System.out.printf("Ksl= %f ", Ksl);
        System.out.printf("Kue= %f ", Kue);
        System.out.printf("Kim= %f ", Kim);
        System.out.printf("Kt= %f", Kt);
        in.close();
    }   
}

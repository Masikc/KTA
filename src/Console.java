import java.util.Scanner;
 
public class Console {
 
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        System.out.print("����� ���������: ");
        String mat=in.nextLine();
        double Kom=0;
        switch (mat) {
            case "��36-12":
            case "���-300":
            case "��6-�":
            case "��3-��":
            case "��67�����": Kom=0.02;
                     break;
            case "��62����":
            case "��60����":
            case "��82����": Kom=0.03;
                     break;
            case "��56���":
            case "��70����":
            case "��4-�": Kom=0.04;
                     break;
            case "95�18":
            case "��35���": Kom=0.05;
                     break;
            case "43�3������": Kom=0.06;
                     break;
            case "38�5����": Kom=0.065;
                     break;
            case "42�2����": Kom=0.068;
                     break;
            case "30����":
            case "��38��":
            case "��38���": Kom=0.07;
                     break;
            case "28�3����":
            case "30�2���2��": Kom=0.085;
                     break;
            case "10�11�23�3��":
            case "15�18�21�4���": Kom=0.09;
                     break;
            case "��3": Kom=0.12;         
                     break;
            case "08�15�24�4��":
            case "��14":
            case "��22":
            case "��15": Kom=0.13;
                     break;
            case "��6": Kom=0.135;
                     break;
            case "20�13":
            case "30�13":
            case "12�25�16�7��": Kom=0.15;
                     break;
            case "33�3������":
            case "38�3������": Kom=0.17;
                     break;
            case "45�14�14�2�":
            case "��4":
            case "��5": Kom=0.19;
                     break;
            case "20�23�18":
            case "12�21�5�":
            case "09�15�9�": Kom=0.21;
                     break;
            case "20�3���":
            case "40�13":
            case "��17�2":
            case "20�17�2":
            case "12�18�10�":
            case "07�16�6":
            case "��1":
            case "�18�9�5�": Kom=0.24;
                     break;
            case "09�16�46": Kom=0.26;
                     break;
            case "10�23�18": Kom=0.29;
                     break;
            case "11�11�2���":
            case "1�12�2���": Kom=0.3;
                     break;
            case "12�13": Kom=0.35;
                     break;
            case "15��5":
            case "15�6��":
            case "25�13�2": Kom=0.5;
                     break;
            case "34��3�":
            case "34���3�": Kom=0.56;
                     break;
            default: System.out.printf("�������� ������ ����������� � ����");
                     break;
        }
        
        System.out.print("���������� ������������ ������, �������������� ��������:");
        int Krez=in.nextInt();
        double A1=0;
        if (Krez>20) A1=0.2;
        double Kk=1-A1;
        
        System.out.print("���������� ���������� ���������� �� ��������� ����� � ��������� ������������ ������������:");
        int Ktreb=in.nextInt();
        double A2=0;
        if (Ktreb>0 && Ktreb<=2) A2=0.2;
        if (Ktreb>2) A2=0.4;
        double Kp=1-A2;
        
        System.out.print("���������� ����� ������������ ���������:");
        int Kmeh=in.nextInt();
        double A3=0;
        if (Kmeh>2) A3=0.1;
        double Kv=1-A3;
        
        System.out.print("�� ������ ���� �����������, �������������� �������� �� ������ 10-�� ���������?:");
        String Kv10=in.nextLine();
        double Kc=1;
        if (Kv10=="��")
        {
        	System.out.print("���������� ������������, ��������� �� ����������� ���� �� ���� ����:");
            int N1=in.nextInt();
            System.out.print("���������� ������������, ��������� �� ����������� ���� �� ��� ����:");
            int N2=in.nextInt();
            System.out.print("���������� ������������, ��������� �� ����������� ���� �� ��� ����:");
            int N3=in.nextInt();
            System.out.print("���������� ������������, ��������� �� ����������� ���� �� ������ ����:");
            int N4=in.nextInt();
            double A4=0.1*(N1+N2*2+N3*3+N4*4);
            if (A4>1)
            {
            	A4=1;
            }
            Kc=1-A4;
        }
        
        double Ksl=0.25*(Kk+Kp+Kv+Kc);
        
        System.out.print("������� ����:");
        double Kpov=in.nextDouble();
        
        System.out.print("����� ���������� �������������� ��������� � ������:");
        int Ne=in.nextInt();
        System.out.print("���������� ��������������� �������������� ��������� ������:");
        int Nue=in.nextInt();
        System.out.print("���������� ��������������� ��������� ������:");
        int n=in.nextInt();
        double Kue=Nue/Ne-0.1*n;
        
        System.out.print("����� ��������� ������:");
        double Vz=in.nextDouble();
        System.out.print("����� ������������ ������ (��� ��������):");
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

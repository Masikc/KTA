import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.html.HTML;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	
	String mat,Kv10otv;
	double Kom,Kk,Kp,Kv,Kc,Ksl,Kue,Vz,Kim,Kt,Kpov;
	int Ne,Nue;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("��������������-��������������� ������ ������");
		frame.setBounds(100, 100, 705, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelMarka = new JLabel("\u041C\u0430\u0440\u043A\u0430 \u043C\u0430\u0442\u0435\u0440\u0438\u0430\u043B\u0430:");
		labelMarka.setBounds(10, 11, 115, 14);
		frame.getContentPane().add(labelMarka);
		
		String[] marki = {
				"",
			    "��36-12",
			    "���-300",
			    "��6-�",
			    "��3-��",
			    "��67�����",
			    "��62����",
			    "��60����",
			    "��82����",
			    "��56���",
			    "��70����",
			    "��4-�",
			    "95�18",
			    "��35���",
			    "43�3������",
			    "38�5����",
			    "42�2����",
			    "30����",
			    "��38��",
			    "��38���",
			    "28�3����",
			    "30�2���2��",
			    "10�11�23�3��",
			    "15�18�21�4���",
			    "��3",
			    "08�15�24�4��",
			    "��14",
			    "��22",
			    "��15",
			    "��6",
			    "20�13",
			    "30�13",
			    "12�25�16�7��",
			    "33�3������",
			    "38�3������",
			    "45�14�14�2�",
			    "��4",
			    "��5",
			    "20�23�18",
			    "12�21�5�",
			    "09�15�9�",
			    "20�3���",
			    "40�13",
			    "��17�2",
			    "20�17�2",
			    "12�18�10�",
			    "07�16�6",
			    "��1",
			    "�18�9�5�",
			    "09�16�46",
			    "10�23�18",
			    "11�11�2���",
			    "1�12�2���",
			    "12�13",
			    "15��5",
			    "15�6��",
			    "25�13�2",
			    "34��3�",
			    "34���3�"
			};
		JComboBox<String> comboBoxMarka = new JComboBox(marki);
		comboBoxMarka.setBounds(135, 8, 143, 20);
		frame.getContentPane().add(comboBoxMarka);
		comboBoxMarka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat = (String) comboBoxMarka.getSelectedItem();
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
		                 }
				}
			});
		
		JLabel labelKrez = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439 \u0434\u0435\u0442\u0430\u043B\u0438, \u043E\u0431\u0440\u0430\u0431\u0430\u0442\u044B\u0432\u0430\u0435\u043C\u044B\u0445 \u0440\u0435\u0437\u0430\u043D\u0438\u0435\u043C:");
		labelKrez.setBounds(10, 36, 608, 14);
		frame.getContentPane().add(labelKrez);
		
		Integer value = new Integer(0);
		Integer min = new Integer(0);
		Integer max = new Integer(1000);
		Integer step = new Integer(1);
		SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, step);
		JSpinner spinnerKrez = new JSpinner(model);
		spinnerKrez.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Krez = (Integer)spinnerKrez.getValue();
  	 			double A1=0;
  	 			if (Krez>20) A1=0.2;
  	 	        Kk=1-A1;
  	 			}
  	 		});
		spinnerKrez.setBounds(628, 33, 51, 20);
		frame.getContentPane().add(spinnerKrez);
		
		JLabel labelKtreb = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u044B\u0448\u0435\u043D\u043D\u044B\u0445 \u0442\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u0439 \u043F\u043E \u0442\u043E\u0447\u043D\u043E\u0441\u0442\u044F\u043C \u0444\u043E\u0440\u043C\u044B \u0438 \u0432\u0437\u0430\u0438\u043C\u043D\u043E\u0433\u043E \u0440\u0430\u0441\u043F\u043E\u043B\u043E\u0436\u0435\u043D\u0438\u044F \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439:");
		labelKtreb.setBounds(10, 61, 608, 14);
		frame.getContentPane().add(labelKtreb);
		
		JSpinner spinnerKtreb = new JSpinner(model);
		spinnerKtreb.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Ktreb = (Integer)spinnerKtreb.getValue();
  	 			double A2=0;
  	 	        if (Ktreb>0 && Ktreb<=2) A2=0.2;
  	 	        if (Ktreb>2) A2=0.4;
  	 	        Kp=1-A2;
  	 			}
  	 		});
		spinnerKtreb.setBounds(628, 58, 51, 20);
		frame.getContentPane().add(spinnerKtreb);
		
		JLabel labelKmeh = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0432\u0438\u0434\u043E\u0432 \u043C\u0435\u0445\u0430\u043D\u0438\u0447\u0435\u0441\u043A\u043E\u0439 \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438:");
		labelKmeh.setBounds(10, 86, 608, 14);
		frame.getContentPane().add(labelKmeh);
		
		JSpinner spinnerKmeh = new JSpinner(model);
		spinnerKmeh.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Kmeh = (Integer)spinnerKmeh.getValue();
  	 			double A3=0;
  	 	        if (Kmeh>2) A3=0.1;
  	 	        Kv=1-A3;
  	 			}
  	 		});
		spinnerKmeh.setBounds(628, 83, 51, 20);
		frame.getContentPane().add(spinnerKmeh);
		
		JLabel labelKv10 = new JLabel("\u041D\u0430 \u0434\u0435\u0442\u0430\u043B\u0438 \u0435\u0441\u0442\u044C \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438, \u043E\u0431\u0440\u0430\u0431\u0430\u0442\u044B\u0432\u0430\u0435\u043C\u044B\u0435 \u0440\u0435\u0437\u0430\u043D\u0438\u0435\u043C \u043D\u0435 \u0433\u0440\u0443\u0431\u0435\u0435 10-\u0433\u043E \u043A\u0432\u0430\u043B\u0438\u0442\u0435\u0442\u0430?:");
		labelKv10.setBounds(10, 111, 608, 14);
		frame.getContentPane().add(labelKv10);
		
		String[] Kv10 = {
			    "���",
			    "��"
			};

		JComboBox<String> comboBoxKv10 = new JComboBox(Kv10);
		comboBoxKv10.setBounds(629, 108, 50, 20);
		frame.getContentPane().add(comboBoxKv10);
		comboBoxKv10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kv10otv = (String) comboBoxKv10.getSelectedItem();
				Kc=1;
				if (Kv10otv=="��")
				{
					DialogKv10 dialog = new DialogKv10();
					dialog.setVisible(true);
					double A4=0.1*(DialogKv10.N1+DialogKv10.N2+DialogKv10.N3+DialogKv10.N4);
					if (A4>1)
		            {
		            	A4=1;
		            }
		            Kc=1-A4;
				}
				}
			});	
		
		JLabel labelKpov = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043A\u043E\u044D\u0444\u0444\u0438\u0446\u0438\u0435\u043D\u0442 \u0442\u043E\u0447\u043D\u043E\u0441\u0442\u0438 \u0438 \u0448\u0435\u0440\u043E\u0445\u043E\u0432\u0430\u0442\u043E\u0441\u0442\u0438 \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439 \u0434\u0435\u0442\u0430\u043B\u0438 (\u041A\u043F\u043E\u0432):");
		labelKpov.setBounds(10, 136, 608, 14);
		frame.getContentPane().add(labelKpov);
		
		Double znach = new Double(0);
		Double minim = new Double(-1000);
		Double maxim = new Double(1000);
		Double st = new Double(0.1);
		SpinnerNumberModel model2 = new SpinnerNumberModel(znach, minim, maxim, st);
		JSpinner spinnerKpov = new JSpinner(model2);
		spinnerKpov.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Kpov = (Double)spinnerKpov.getValue();
  	 			}
  	 		});
		spinnerKpov.setBounds(628, 133, 51, 20);
		frame.getContentPane().add(spinnerKpov);
		
		JLabel labelNe = new JLabel("\u041E\u0431\u0449\u0435\u0435 \u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u0438\u0432\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelNe.setBounds(10, 161, 608, 14);
		frame.getContentPane().add(labelNe);
		
		JSpinner spinnerNe = new JSpinner(model);
		spinnerNe.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Ne = (Integer)spinnerNe.getValue();
  	 			}
  	 		});
		spinnerNe.setBounds(628, 158, 51, 20);
		frame.getContentPane().add(spinnerNe);
		
		JLabel labelNue = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0443\u043D\u0438\u0444\u0438\u0446\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u044B\u0445 \u043A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u0438\u0432\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelNue.setBounds(10, 186, 608, 14);
		frame.getContentPane().add(labelNue);
		
		JSpinner spinnerNue = new JSpinner(model);
		spinnerNue.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Nue = (Integer)spinnerNue.getValue();
  	 			}
  	 		});
		spinnerNue.setBounds(628, 183, 51, 20);
		frame.getContentPane().add(spinnerNue);
		
		JLabel labeln = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043D\u0435\u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0447\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labeln.setBounds(10, 211, 608, 14);
		frame.getContentPane().add(labeln);
		
		JSpinner spinnern = new JSpinner(model);
		spinnern.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int n = (Integer)spinnern.getValue();
  	 			Kue=Nue/Ne-0.1*n;
  	 			}
  	 		});
		spinnern.setBounds(628, 208, 51, 20);
		frame.getContentPane().add(spinnern);
		
		JLabel labelVz = new JLabel("\u041E\u0431\u044A\u0435\u043C \u0437\u0430\u0433\u043E\u0442\u043E\u0432\u043A\u0438 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelVz.setBounds(10, 236, 608, 14);
		frame.getContentPane().add(labelVz);
		
		Double znachenie = new Double(0);
		Double minimum = new Double(0);
		Double maximum = new Double(1000);
		Double shag = new Double(0.1);
		SpinnerNumberModel model3 = new SpinnerNumberModel(znachenie, minimum, maximum, shag);
		JSpinner spinnerVz = new JSpinner(model3);
		spinnerVz.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Vz = (Double)spinnerVz.getValue();
  	 			}
  	 		});
		spinnerVz.setBounds(628, 233, 51, 20);
		frame.getContentPane().add(spinnerVz);
		
		JLabel labelVd = new JLabel("\u041E\u0431\u044A\u0435\u043C \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u0430\u043D\u043D\u043E\u0439 \u0434\u0435\u0442\u0430\u043B\u0438 (\u0431\u0435\u0437 \u043F\u043E\u043A\u0440\u044B\u0442\u0438\u0439):");
		labelVd.setBounds(10, 261, 608, 14);
		frame.getContentPane().add(labelVd);
		
		JSpinner spinnerVd = new JSpinner(model3);
		spinnerVd.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {
  	 			Double Vd = (Double)spinnerVd.getValue();
  	 			Kim=Vd/Vz;
  	 			}
  	 		});
		spinnerVd.setBounds(628, 258, 51, 20);
		frame.getContentPane().add(spinnerVd);
		
		JTextArea textAreaKt = new JTextArea();
		textAreaKt.setBounds(10, 320, 544, 16);
		frame.getContentPane().add(textAreaKt);
			
		JButton buttonKt = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		buttonKt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ksl=0.25*(Kk+Kp+Kv+Kc);
				Kt=(Kom*0.8+Ksl*0.7+Kpov*0.6+Kue*0.7+Kim)/(0.8+0.7+0.6+0.7+1);
				textAreaKt.setText("����������� ���������� ���������������: "+Kt);
				}
		});
		buttonKt.setBounds(10, 286, 115, 23);
		frame.getContentPane().add(buttonKt);
		
		JTextArea textAreaDetail = new JTextArea();
		textAreaDetail.setVisible(false);
		textAreaDetail.setBounds(10, 347, 669, 83);
		frame.getContentPane().add(textAreaDetail);
		
		JButton buttonDetail = new JButton("\u041F\u043E\u0434\u0440\u043E\u0431\u043D\u0435\u0435");
		buttonDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 705, 480);
				textAreaDetail.setVisible(true);
				textAreaDetail.setText("����������� ���������������� ���������: "+Kom+"\n"
				+"����������� ��������� ����������� ������: "+Ksl+"\n"
				+"����������� �������� � ������������� ������������: "+Kpov+"\n"
				+"����������� ���������� �������������� ���������: "+Kue+"\n"
				+"����������� ������������� ���������: "+Kim);
				}
		});
		buttonDetail.setBounds(564, 316, 115, 23);
		frame.getContentPane().add(buttonDetail);
	}
}
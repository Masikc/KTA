import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestGUI {
	
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
					TestGUI window = new TestGUI();
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
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelMarka = new JLabel("\u041C\u0430\u0440\u043A\u0430 \u043C\u0430\u0442\u0435\u0440\u0438\u0430\u043B\u0430:");
		labelMarka.setBounds(10, 11, 115, 14);
		frame.getContentPane().add(labelMarka);
		
		String[] marki = {
			    "ÂÆ36-12",
			    "ÀÍÂ-300",
			    "ÆÑ6-Ê",
			    "ÆÑ3-ÄÊ",
			    "ÕÍ67ÂÌÒÞË",
			    "ÕÍ62ÌÊÂÞ",
			    "ÕÍ60ÌÒÂÞ",
			    "ÕÍ82ÒÞÌÂ",
			    "ÕÍ56ÌÒÞ",
			    "ÕÍ70ÂÌÒÞ",
			    "ÂÕ4-Ë",
			    "95Õ18",
			    "ÕÍ35ÂÒÞ",
			    "43Õ3ÑÍÌÂÔÀ",
			    "38Í5ÌÑÔÀ",
			    "42×2ÃÑÍÌ",
			    "30ÍÕÒÞ",
			    "ÕÍ38ÂÒ",
			    "ÕÍ38ÒÞÐ",
			    "28Õ3ÑÍÂ×",
			    "30Õ2ÃÑÍ2ÂÌ",
			    "10Õ11Í23Ò3ÌÐ",
			    "15Õ18Í21Ñ4ÒÞÐ",
			    "ÂÒ3",
			    "08Õ15Í24Â4ÒÐ",
			    "ÂÒ14",
			    "ÂÒ22",
			    "ÂÒ15",
			    "ÂÒ6",
			    "20Õ13",
			    "30Õ13",
			    "12Õ25Í16Ò7ÀÐ",
			    "33Õ3ÑÍÌÂÔÀ",
			    "38Õ3ÑÍÌÂÔÀ",
			    "45Õ14Í14Â2Ì",
			    "ÂÒ4",
			    "ÂÒ5",
			    "20Õ23Í18",
			    "12Õ21Í5Ò",
			    "09Õ15Í9Þ",
			    "20Õ3ÌÂÔ",
			    "40Õ13",
			    "ÌÕ17Í2",
			    "20Õ17Í2",
			    "12Õ18Í10Ò",
			    "07Õ16Í6",
			    "ÂÒ1",
			    "Í18Ê9Ì5Ò",
			    "09Õ16Í46",
			    "10Õ23Í18",
			    "11Õ11Í2ÂÌÔ",
			    "1Õ12Í2ÂÌÔ",
			    "12Õ13",
			    "15ÕÌ5",
			    "15Õ6ÑÞ",
			    "25Õ13Í2",
			    "34ÕÍ3Ì",
			    "34ÕÍÌ3Ô"
			};
		JComboBox<String> comboBoxMarka = new JComboBox(marki);
		comboBoxMarka.setBounds(135, 8, 143, 20);
		frame.getContentPane().add(comboBoxMarka);
		comboBoxMarka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat = (String) comboBoxMarka.getSelectedItem();
				switch (mat) {
		        case "ÂÆ36-12":
		        case "ÀÍÂ-300":
		        case "ÆÑ6-Ê":
		        case "ÆÑ3-ÄÊ":
		        case "ÕÍ67ÂÌÒÞË": Kom=0.02;
		                 break;
		        case "ÕÍ62ÌÊÂÞ":
		        case "ÕÍ60ÌÒÂÞ":
		        case "ÕÍ82ÒÞÌÂ": Kom=0.03;
		                 break;
		        case "ÕÍ56ÌÒÞ":
		        case "ÕÍ70ÂÌÒÞ":
		        case "ÂÕ4-Ë": Kom=0.04;
		                 break;
		        case "95Õ18":
		        case "ÕÍ35ÂÒÞ": Kom=0.05;
		                 break;
		        case "43Õ3ÑÍÌÂÔÀ": Kom=0.06;
		                 break;
		        case "38Í5ÌÑÔÀ": Kom=0.065;
		                 break;
		        case "42×2ÃÑÍÌ": Kom=0.068;
		                 break;
		        case "30ÍÕÒÞ":
		        case "ÕÍ38ÂÒ":
		        case "ÕÍ38ÒÞÐ": Kom=0.07;
		                 break;
		        case "28Õ3ÑÍÂ×":
		        case "30Õ2ÃÑÍ2ÂÌ": Kom=0.085;
		                 break;
		        case "10Õ11Í23Ò3ÌÐ":
		        case "15Õ18Í21Ñ4ÒÞÐ": Kom=0.09;
		                 break;
		        case "ÂÒ3": Kom=0.12;         
		                 break;
		        case "08Õ15Í24Â4ÒÐ":
		        case "ÂÒ14":
		        case "ÂÒ22":
		        case "ÂÒ15": Kom=0.13;
		                 break;
		        case "ÂÒ6": Kom=0.135;
		                 break;
		        case "20Õ13":
		        case "30Õ13":
		        case "12Õ25Í16Ò7ÀÐ": Kom=0.15;
		                 break;
		        case "33Õ3ÑÍÌÂÔÀ":
		        case "38Õ3ÑÍÌÂÔÀ": Kom=0.17;
		                 break;
		        case "45Õ14Í14Â2Ì":
		        case "ÂÒ4":
		        case "ÂÒ5": Kom=0.19;
		                 break;
		        case "20Õ23Í18":
		        case "12Õ21Í5Ò":
		        case "09Õ15Í9Þ": Kom=0.21;
		                 break;
		        case "20Õ3ÌÂÔ":
		        case "40Õ13":
		        case "ÌÕ17Í2":
		        case "20Õ17Í2":
		        case "12Õ18Í10Ò":
		        case "07Õ16Í6":
		        case "ÂÒ1":
		        case "Í18Ê9Ì5Ò": Kom=0.24;
		                 break;
		        case "09Õ16Í46": Kom=0.26;
		                 break;
		        case "10Õ23Í18": Kom=0.29;
		                 break;
		        case "11Õ11Í2ÂÌÔ":
		        case "1Õ12Í2ÂÌÔ": Kom=0.3;
		                 break;
		        case "12Õ13": Kom=0.35;
		                 break;
		        case "15ÕÌ5":
		        case "15Õ6ÑÞ":
		        case "25Õ13Í2": Kom=0.5;
		                 break;
		        case "34ÕÍ3Ì":
		        case "34ÕÍÌ3Ô": Kom=0.56;
		                 break;
		                 }
				}
			});
		
		JLabel labelKrez = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439 \u0434\u0435\u0442\u0430\u043B\u0438, \u043E\u0431\u0440\u0430\u0431\u0430\u0442\u044B\u0432\u0430\u0435\u043C\u044B\u0445 \u0440\u0435\u0437\u0430\u043D\u0438\u0435\u043C:");
		labelKrez.setBounds(10, 36, 381, 14);
		frame.getContentPane().add(labelKrez);
		
		JSpinner spinnerKrez = new JSpinner();
		spinnerKrez.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Krez = (Integer)spinnerKrez.getValue();
  	 			double A1=0;
  	 			if (Krez>20) A1=0.2;
  	 	        Kk=1-A1;
  	 			}
  	 		});
		spinnerKrez.setBounds(401, 33, 29, 20);
		frame.getContentPane().add(spinnerKrez);
		
		JLabel labelKtreb = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u044B\u0448\u0435\u043D\u043D\u044B\u0445 \u0442\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u0439 \u043F\u043E \u0442\u043E\u0447\u043D\u043E\u0441\u0442\u044F\u043C \u0444\u043E\u0440\u043C\u044B \u0438 \u0432\u0437\u0430\u0438\u043C\u043D\u043E\u0433\u043E \u0440\u0430\u0441\u043F\u043E\u043B\u043E\u0436\u0435\u043D\u0438\u044F \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439:");
		labelKtreb.setBounds(10, 61, 381, 14);
		frame.getContentPane().add(labelKtreb);
		
		JSpinner spinnerKtreb = new JSpinner();
		spinnerKtreb.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Ktreb = (Integer)spinnerKtreb.getValue();
  	 			double A2=0;
  	 	        if (Ktreb>0 && Ktreb<=2) A2=0.2;
  	 	        if (Ktreb>2) A2=0.4;
  	 	        Kp=1-A2;
  	 			}
  	 		});
		spinnerKtreb.setBounds(401, 58, 29, 20);
		frame.getContentPane().add(spinnerKtreb);
		
		JLabel labelKmeh = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0432\u0438\u0434\u043E\u0432 \u043C\u0435\u0445\u0430\u043D\u0438\u0447\u0435\u0441\u043A\u043E\u0439 \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438:");
		labelKmeh.setBounds(10, 86, 381, 14);
		frame.getContentPane().add(labelKmeh);
		
		JSpinner spinnerKmeh = new JSpinner();
		spinnerKmeh.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Kmeh = (Integer)spinnerKmeh.getValue();
  	 			double A3=0;
  	 	        if (Kmeh>2) A3=0.1;
  	 	        Kv=1-A3;
  	 			}
  	 		});
		spinnerKmeh.setBounds(401, 83, 29, 20);
		frame.getContentPane().add(spinnerKmeh);
		
		JLabel labelKv10 = new JLabel("\u041D\u0430 \u0434\u0435\u0442\u0430\u043B\u0438 \u0435\u0441\u0442\u044C \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438, \u043E\u0431\u0440\u0430\u0431\u0430\u0442\u044B\u0432\u0430\u0435\u043C\u044B\u0435 \u0440\u0435\u0437\u0430\u043D\u0438\u0435\u043C \u043D\u0435 \u0433\u0440\u0443\u0431\u0435\u0435 10-\u0433\u043E \u043A\u0432\u0430\u043B\u0438\u0442\u0435\u0442\u0430?:");
		labelKv10.setBounds(10, 111, 381, 14);
		frame.getContentPane().add(labelKv10);
		
		String[] Kv10 = {
			    "íåò",
			    "äà"
			};

		JComboBox<String> comboBoxKv10 = new JComboBox(Kv10);
		comboBoxKv10.setBounds(401, 108, 28, 20);
		frame.getContentPane().add(comboBoxKv10);
		comboBoxKv10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kv10otv = (String) comboBoxKv10.getSelectedItem();
				Kc=1;
				if (Kv10otv=="äà")
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
		
		JLabel labelKpov = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u041A\u043F\u043E\u0432:");
		labelKpov.setBounds(10, 136, 381, 14);
		frame.getContentPane().add(labelKpov);
		
		JSpinner spinnerKpov = new JSpinner();
		spinnerKpov.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Kpov = (Double)spinnerKpov.getValue();
  	 			}
  	 		});
		spinnerKpov.setBounds(401, 133, 29, 20);
		frame.getContentPane().add(spinnerKpov);
		
		JLabel labelNe = new JLabel("\u041E\u0431\u0449\u0435\u0435 \u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u0438\u0432\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelNe.setBounds(10, 161, 381, 14);
		frame.getContentPane().add(labelNe);
		
		JSpinner spinnerNe = new JSpinner();
		spinnerNe.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Ne = (Integer)spinnerNe.getValue();
  	 			}
  	 		});
		spinnerNe.setBounds(401, 158, 29, 20);
		frame.getContentPane().add(spinnerNe);
		
		JLabel labelNue = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0443\u043D\u0438\u0444\u0438\u0446\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u044B\u0445 \u043A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u0438\u0432\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelNue.setBounds(10, 186, 381, 14);
		frame.getContentPane().add(labelNue);
		
		JSpinner spinnerNue = new JSpinner();
		spinnerNue.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Nue = (Integer)spinnerNue.getValue();
  	 			}
  	 		});
		spinnerNue.setBounds(401, 183, 29, 20);
		frame.getContentPane().add(spinnerNue);
		
		JLabel labeln = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043D\u0435\u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0447\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labeln.setBounds(10, 211, 381, 14);
		frame.getContentPane().add(labeln);
		
		JSpinner spinnern = new JSpinner();
		spinnern.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int n = (Integer)spinnern.getValue();
  	 			Kue=Nue/Ne-0.1*n;
  	 			}
  	 		});
		spinnern.setBounds(401, 208, 29, 20);
		frame.getContentPane().add(spinnern);
		
		JLabel labelVz = new JLabel("\u041E\u0431\u044A\u0435\u043C \u0437\u0430\u0433\u043E\u0442\u043E\u0432\u043A\u0438 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelVz.setBounds(10, 236, 381, 14);
		frame.getContentPane().add(labelVz);
		
		JSpinner spinnerVz = new JSpinner();
		spinnerVz.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			Vz = (Integer)spinnerVz.getValue();
  	 			}
  	 		});
		spinnerVz.setBounds(401, 233, 29, 20);
		frame.getContentPane().add(spinnerVz);
		
		JLabel labelVd = new JLabel("\u041E\u0431\u044A\u0435\u043C \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u0430\u043D\u043D\u043E\u0439 \u0434\u0435\u0442\u0430\u043B\u0438 (\u0431\u0435\u0437 \u043F\u043E\u043A\u0440\u044B\u0442\u0438\u0439):");
		labelVd.setBounds(10, 261, 381, 14);
		frame.getContentPane().add(labelVd);
		
		JSpinner spinnerVd = new JSpinner();
		spinnerVd.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {
  	 			int Vd = (Integer)spinnerVd.getValue();
  	 			Kim=Vd/Vz;
  	 			}
  	 		});
		spinnerVd.setBounds(401, 258, 29, 20);
		frame.getContentPane().add(spinnerVd);
		
		JTextArea textAreaKt = new JTextArea();
		textAreaKt.setBounds(10, 320, 420, 30);
		frame.getContentPane().add(textAreaKt);
			
		JButton buttonKt = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		buttonKt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ksl=0.25*(Kk+Kp+Kv+Kc);
				Kt=(Kom*0.8+Ksl*0.7+Kpov*0.6+Kue*0.7+Kim)/(0.8+0.7+0.6+0.7+1);
				textAreaKt.setText(""+Kom+" "+Kk+" "+Kp+" "+Kv+" "+Kc+" "+" "+Kpov+" "+Ksl+" "+Kue+" "+Kim+" "+Kt);
				}
		});
		buttonKt.setBounds(10, 286, 115, 23);
		frame.getContentPane().add(buttonKt);
	}
}
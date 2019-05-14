import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextField;

public class TestGUI {

	private JFrame frame;
	private JTextField textFieldKpov;

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
		frame.setBounds(100, 100, 460, 325);
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
		
		JComboBox comboBoxMarka = new JComboBox(marki);
		comboBoxMarka.setBounds(135, 8, 143, 20);
		frame.getContentPane().add(comboBoxMarka);
		
		JLabel labelKrez = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439 \u0434\u0435\u0442\u0430\u043B\u0438, \u043E\u0431\u0440\u0430\u0431\u0430\u0442\u044B\u0432\u0430\u0435\u043C\u044B\u0445 \u0440\u0435\u0437\u0430\u043D\u0438\u0435\u043C:");
		labelKrez.setBounds(10, 36, 381, 14);
		frame.getContentPane().add(labelKrez);
		
		JSpinner spinnerKrez = new JSpinner();
		spinnerKrez.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Krez = (Integer)spinnerKrez.getValue();
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
  	 			int Ktmeh = (Integer)spinnerKmeh.getValue();
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
		
		JComboBox comboBoxKv10 = new JComboBox(Kv10);
		comboBoxKv10.setBounds(401, 108, 28, 20);
		frame.getContentPane().add(comboBoxKv10);
		
		JLabel labelKpov = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u041A\u043F\u043E\u0432:");
		labelKpov.setBounds(10, 136, 381, 14);
		frame.getContentPane().add(labelKpov);
		
		textFieldKpov = new JTextField();
		textFieldKpov.setBounds(401, 133, 29, 20);
		frame.getContentPane().add(textFieldKpov);
		textFieldKpov.setColumns(10);
		String Kpov = textFieldKpov.getText();
		
		JLabel labelNe = new JLabel("\u041E\u0431\u0449\u0435\u0435 \u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u0438\u0432\u043D\u044B\u0445 \u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 \u0434\u0435\u0442\u0430\u043B\u0438:");
		labelNe.setBounds(10, 161, 381, 14);
		frame.getContentPane().add(labelNe);
		
		JSpinner spinnerNe = new JSpinner();
		spinnerNe.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			int Ne = (Integer)spinnerNe.getValue();
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
  	 			int Nue = (Integer)spinnerNue.getValue();
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
  	 			int Vz = (Integer)spinnerVz.getValue();
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
  	 			}
  	 		});
		spinnerVd.setBounds(401, 258, 29, 20);
		frame.getContentPane().add(spinnerVd);
	}
}

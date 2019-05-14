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
			    "���",
			    "��"
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

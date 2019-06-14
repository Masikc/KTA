import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;


public class DialogKv10 extends JDialog {
	
	static double N1=0,N2=0,N3=0,N4=0,Kc=1;

	public DialogKv10() {
        setVisible(false);
        setSize(555, 180);
        setTitle("Коэффициент соответствия оптимальным величинам");
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JLabel labelN1 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u043E\u0434\u043D\u0443 \u0437\u043E\u043D\u0443:");
        labelN1.setBounds(10, 11, 460, 14);
        getContentPane().add(labelN1);
        
        Integer value6 = new Integer(0);
		Integer min6 = new Integer(0);
		Integer max6 = new Integer(1000);
		Integer step6 = new Integer(1);
		SpinnerNumberModel model6 = new SpinnerNumberModel(value6, min6, max6, step6);
        JSpinner spinnerN1 = new JSpinner(model6);
        spinnerN1.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N1 = (Integer)spinnerN1.getValue();
  	 			}
  	 		});
        spinnerN1.setBounds(480, 8, 51, 20);
        getContentPane().add(spinnerN1);
        
        JLabel labelN2 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u0434\u0432\u0435 \u0437\u043E\u043D\u044B:");
        labelN2.setBounds(10, 36, 460, 14);
        getContentPane().add(labelN2);
        
        Integer value7 = new Integer(0);
		Integer min7 = new Integer(0);
		Integer max7 = new Integer(1000);
		Integer step7 = new Integer(1);
		SpinnerNumberModel model7 = new SpinnerNumberModel(value7, min7, max7, step7);
        JSpinner spinnerN2 = new JSpinner(model7);
        spinnerN2.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N2 = (Integer)spinnerN2.getValue();
  	 			}
  	 		});
        spinnerN2.setBounds(480, 33, 51, 20);
        getContentPane().add(spinnerN2);
        
        JLabel labelN3 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u0442\u0440\u0438 \u0437\u043E\u043D\u044B:");
        labelN3.setBounds(10, 61, 460, 14);
        getContentPane().add(labelN3);
        
        Integer value8 = new Integer(0);
		Integer min8 = new Integer(0);
		Integer max8 = new Integer(1000);
		Integer step8 = new Integer(1);
		SpinnerNumberModel model8 = new SpinnerNumberModel(value8, min8, max8, step8);
        JSpinner spinnerN3 = new JSpinner(model8);
        spinnerN3.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N3 = (Integer)spinnerN3.getValue();
  	 			}
  	 		});
        spinnerN3.setBounds(480, 58, 51, 20);
        getContentPane().add(spinnerN3);
        
        JLabel labelN4 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u0447\u0435\u0442\u044B\u0440\u0435 \u0437\u043E\u043D\u044B:");
        labelN4.setBounds(10, 86, 460, 14);
        getContentPane().add(labelN4);
        
        Integer value9 = new Integer(0);
		Integer min9 = new Integer(0);
		Integer max9 = new Integer(1000);
		Integer step9 = new Integer(1);
		SpinnerNumberModel model9 = new SpinnerNumberModel(value9, min9, max9, step9);
        JSpinner spinnerN4 = new JSpinner(model9);
        spinnerN4.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N4 = (Integer)spinnerN4.getValue();
  	 			}
  	 		});
        spinnerN4.setBounds(480, 83, 51, 20);
        getContentPane().add(spinnerN4);
        
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A4=0.1*(N1+2*N2+3*N3+4*N4);
				if (A4>1)
		        {
					A4=1;
		        }
				Kc=1-A4;
				setVisible(false);
				}
		});
        btnOk.setBounds(10, 111, 89, 23);
        getContentPane().add(btnOk);
    }
}
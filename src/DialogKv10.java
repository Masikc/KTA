import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;


public class DialogKv10 extends JDialog {
	
	static int N1,N2,N3,N4;

	public DialogKv10() {
        setVisible(false);
        setSize(460, 250);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JLabel labelN1 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u043E\u0434\u043D\u0443 \u0437\u043E\u043D\u0443:");
        labelN1.setBounds(10, 11, 385, 14);
        getContentPane().add(labelN1);
        
        JSpinner spinnerN1 = new JSpinner();
        spinnerN1.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N1 = (Integer)spinnerN1.getValue();
  	 			}
  	 		});
        spinnerN1.setBounds(405, 8, 29, 20);
        getContentPane().add(spinnerN1);
        
        JLabel labelN2 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u0434\u0432\u0435 \u0437\u043E\u043D\u044B:");
        labelN2.setBounds(10, 36, 385, 14);
        getContentPane().add(labelN2);
        
        JSpinner spinnerN2 = new JSpinner();
        spinnerN2.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N2 = (Integer)spinnerN2.getValue();
  	 			}
  	 		});
        spinnerN2.setBounds(405, 33, 29, 20);
        getContentPane().add(spinnerN2);
        
        JLabel labelN3 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u0442\u0440\u0438 \u0437\u043E\u043D\u044B:");
        labelN3.setBounds(10, 61, 385, 14);
        getContentPane().add(labelN3);
        
        JSpinner spinnerN3 = new JSpinner();
        spinnerN3.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N3 = (Integer)spinnerN3.getValue();
  	 			}
  	 		});
        spinnerN3.setBounds(405, 58, 29, 20);
        getContentPane().add(spinnerN3);
        
        JLabel labelN4 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0435\u0439, \u043E\u0442\u0441\u0442\u0430\u044E\u0449\u0438\u0445 \u043E\u0442 \u043E\u043F\u0442\u0438\u043C\u0430\u043B\u044C\u043D\u043E\u0439 \u0437\u043E\u043D\u044B \u043D\u0430 \u0447\u0435\u0442\u044B\u0440\u0435 \u0437\u043E\u043D\u044B:");
        labelN4.setBounds(10, 86, 385, 14);
        getContentPane().add(labelN4);
        
        JSpinner spinnerN4 = new JSpinner();
        spinnerN4.addChangeListener(new ChangeListener() {  	 	 	  	 	 	 	 	 	
  	 		public void stateChanged(ChangeEvent e) {  	 	 	 	  	 	 	 	
  	 			N4 = (Integer)spinnerN4.getValue();
  	 			}
  	 		});
        spinnerN4.setBounds(405, 83, 29, 20);
        getContentPane().add(spinnerN4);
        
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				}
		});
        btnOk.setBounds(10, 111, 89, 23);
        getContentPane().add(btnOk);
    }
}
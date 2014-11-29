import java.awt.*;
import javax.swing.*;

public class Calculator {
	int x = 100;


	JFrame frame = new JFrame("����");
		JLabel label = new JLabel("A Label");
			JPanel jpnorth = new JPanel();
			JPanel jpcenter = new JPanel();
			JPanel jpsouth = new JPanel();
				JTextField jtfield = new JTextField();
					JButton backspace = null;
					JButton cancel = null;
					JButton[] buttons = null;
						JMenu menu1, menu2, menu3;
						JMenuItem  m1,m2,m3,m4,m5,m6,m7;

public Calculator() {
 initDisplay();
}

public void initDisplay() {
 
	JMenuBar mb = new JMenuBar(); 
	frame.setJMenuBar(mb); 
			menu1 = new JMenu("����");  
			m1 = new JMenuItem("�Ϲݿ�");
			m2 = new JMenuItem("���п�");
			m3 = new JMenuItem("�ڸ��� ���� ����");
				menu2 = new JMenu("����");  
				m4 = new JMenuItem("����");
				m5 = new JMenuItem("�ٿ��ֱ�");
					menu3 = new JMenu("����");  
					m6 = new JMenuItem("���� �׸�");
					m7 = new JMenuItem("��������");
					
			mb.add(menu1);
			menu1.add(m1);
			menu1.add(m2);
				mb.add(menu2);
				menu2.add(m3);
				menu2.add(m4);
				menu2.addSeparator();
					menu2.add(m5);
					mb.add(menu3);
					menu3.add(m6);
					menu3.addSeparator();
					menu3.add(m7);



	jtfield = new JTextField("0");
	jtfield.setEditable(false);
	jtfield.setBackground(new Color(255,255,255));
	jtfield.setHorizontalAlignment(JTextField.RIGHT);
 
 
	jpnorth = new JPanel();
	jpnorth.setLayout(new BorderLayout()); 
		jpcenter = new JPanel();
		jpcenter.setLayout(new GridLayout(1,2,4,4));
			jpsouth = new JPanel();
			jpsouth.setLayout(new GridLayout(4,4,4,4));
 
			backspace = new JButton();
			backspace.setText("����");
			backspace.setBackground(new Color(255,255,255));
			backspace.setFont(new Font("����", Font.BOLD,13));
			backspace.setForeground(new Color(0,61,255));
 
			cancel = new JButton();
			cancel.setText("C");
			cancel.setBackground(new Color(255,255,255));
			cancel.setFont(new Font("����", Font.BOLD,13));
			cancel.setForeground(new Color(0,61,255));

 buttons = new JButton[16];
 String strbutton[] = {
     "7","8","9","/",
     "4","5","6","*",
     "1","2","3","+",
     "0",".","=","-"
     };
 
 	for(int i=0; i<buttons.length; i++){

 			buttons[i] = new JButton();
 			buttons[i].setText(strbutton[i]);
 			buttons[i].setBackground(new Color(255,255,255));
 			buttons[i].setForeground(new Color(0,61,255));
 			buttons[i].setFont(new Font("����", Font.BOLD,13));
 			jpsouth.add(buttons[i]);
  
 	}

 	jpnorth.add("North",jtfield);
 	jpcenter.add("Center",backspace);
 	jpcenter.add("Center",cancel);
 
 		frame.add("South",jpsouth);
 		frame.add("Center",jpcenter);
 		frame.add("North",jpnorth);

 			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 			frame.setSize(300, 240);
 			frame.setVisible(true);
 			frame.add(label);

 
 label.setText("better");
	}
}


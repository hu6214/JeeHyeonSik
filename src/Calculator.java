import java.awt.*;
import javax.swing.*;

public class Calculator {
	int x = 100;


	JFrame frame = new JFrame("계산기");
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
			menu1 = new JMenu("보기");  
			m1 = new JMenuItem("일반용");
			m2 = new JMenuItem("공학용");
			m3 = new JMenuItem("자릿수 구분 단위");
				menu2 = new JMenu("폅집");  
				m4 = new JMenuItem("복자");
				m5 = new JMenuItem("붙여넣기");
					menu3 = new JMenu("도움말");  
					m6 = new JMenuItem("도움말 항목");
					m7 = new JMenuItem("계산기정보");
					
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
			backspace.setText("수정");
			backspace.setBackground(new Color(255,255,255));
			backspace.setFont(new Font("바탕", Font.BOLD,13));
			backspace.setForeground(new Color(0,61,255));
 
			cancel = new JButton();
			cancel.setText("C");
			cancel.setBackground(new Color(255,255,255));
			cancel.setFont(new Font("바탕", Font.BOLD,13));
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
 			buttons[i].setFont(new Font("바탕", Font.BOLD,13));
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


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event extends Calculator implements ActionListener {
	 boolean isFirst = false;
	 boolean dotFirst = false;
	 int dotNumber = 0;
	 String x = "";
	 String operand = ""; 
	 String operator = "";
	 String dupl = "";
	 double op = 0;
	 double ex = 0;
	 double answer = 0;
	 String ifdot = null;
	 
	 Event() {
		 	m1.addActionListener(this);
		 	m2.addActionListener(this);

		 	backspace.addActionListener(this);
		 	cancel.addActionListener(this);
	  for (int i = 0; i < buttons.length; i++) {
	   buttons[i].addActionListener(this);
	  
	  }

	}

	 public void actionPerformed(ActionEvent e) {
		 	String take_label = e.getActionCommand();
		 	System.out.println("클릭한 버튼은 " + take_label);

	 
	 		operand = jtfield.getText();

	  for (int i = 0; i < 10; i++) {
		  	x = String.valueOf(i);
	  
	   if (x.equals(take_label)) {

		   if (!isFirst) {
			   	jtfield.setText("");
		   }
		   		jtfield.setText(jtfield.getText() + x);
		   		isFirst = true;

	   }
	 
	 }

	 
	  if ("+".equals(take_label) || "-".equals(take_label)
		|| "*".equals(take_label) || "/".equals(take_label)) {

		  	dotFirst = false;
		  	operand = jtfield.getText();
		  	op = Double.parseDouble(operand);
	   
	   if (operator == "") {
		   	ex = op;
	   }

	   else {
		   char charop = operator.charAt(0);
		   System.out.println(operator);
		
		switch (charop) {
	    
		case '+':
	    	ex = ex + Double.parseDouble(operand);
	     
	    	
	    if (ex % 1 == 0) {
	     
	    		jtfield.setText("" + (int) ex);
	    } else {
	      jtfield.setText("" + ex);
	     }
	     break;
	    
			case '-':
				ex = ex - Double.parseDouble(operand);
	     if (ex % 1 == 0) {
	    	 jtfield.setText("" + (int) ex);
	    } else {
	    	 jtfield.setText("" + ex);
	     }
	     break;
	    
		case '*':
			ex = ex * Double.parseDouble(operand);
	     
			
		if (ex % 1 == 0) {
			jtfield.setText("" + (int) ex);
	   } else {
		   	jtfield.setText("" + ex);
	     }
	     break;
	    
		case '/':
			ex = ex / Double.parseDouble(operand);
	     
			
		if (ex % 1 == 0) {
			jtfield.setText("" + (int) ex);
	   } else {
		   	jtfield.setText("" + ex);
	     }
	     break;
	    }
	  }
	   
	   
	   if (ex % 1 == 0) {
		   jtfield.setText("" + (int) ex);
	 } else {
		   jtfield.setText("" + ex);    
	   }

	   			operator = take_label;
	   			System.out.println(ex);
	   			isFirst = false;

	  }

	   if ("C".equals(take_label)) {

		   dotFirst = false;
		   jtfield.setText("0");
		   isFirst = false;
		   dotNumber = 0;
		   operand = ""; 
		   operator = "";
		   op = 0;
		   ex = 0;

	  }
	   
	   
	  if ("backspace".equals(take_label)) {
		  	String operand = jtfield.getText();
	   
      
		  	
      if (1 == operand.length()) {
    	  jtfield.setText("0");
    	  isFirst = false;
	   } 
	  else {
	    
	    ifdot = operand.substring(operand.length()-1, operand.length()); 
	    System.out.println("마지막 자릿수는" +ifdot+"이다");
	   
	  if(ifdot.equals("."))
	    {String leng = operand.substring(0, operand.length() - 1);
	    	jtfield.setText(leng);
	    	dotFirst = false;}
	  else
	    {String leng = operand.substring(0, operand.length() - 1);
	    	jtfield.setText(leng);}
	  	
	  	}
	  }

	  bbb: if (".".equals(take_label)) { 
	   operand = jtfield.getText();
	   op = Double.parseDouble(operand);
	   
	   
	if (!dotFirst && op % 1 == 0) {

	    dotNumber = Integer.parseInt(operand);
	    jtfield.setText(dotNumber + ".");
	    isFirst = true;
	    dotFirst = true;
	   } 
	   else {
	    break bbb;
	   }
	  }

	  aaa: if ("=".equals(take_label)) { 
	   dotFirst = false;
	   char charop = operator.charAt(0);
	   
	   
	   if((operator == "")){
	    break aaa;
	   }
	   else if (operator != "") {
	  
		   System.out.println(operator);
	    
	switch (charop) {
	    case '+':
	     answer = ex + Double.parseDouble(operand);
	     
	if (answer % 1 == 0) {
	      	jtfield.setText("" + (int) answer);
  } else {
	      	jtfield.setText("" + answer);
	     }
	break;
	    
	    
	    case '-':
	     answer = ex - Double.parseDouble(operand);
	     
	     
	 if (answer % 1 == 0) {
	      	jtfield.setText("" + (int) answer);
   } else {
	      	jtfield.setText("" + answer);
	     }
     break;
	    
	    
	    case '*':
	     answer = (ex * Double.parseDouble(operand));
	     
	     
	 if (answer % 1 == 0) {
		 jtfield.setText("" + (int) answer);
   } else {
	      	jtfield.setText("" + answer);
	     }
	 break;
	 
	    case '/':
	     answer = (ex / Double.parseDouble(operand));
	     
	 if (answer % 1 == 0) {
	      	jtfield.setText("" + (int) answer);
	} else {
	      	jtfield.setText("" + answer);
	     }
     break;
	    default:
	    	jtfield.setText(jtfield.getText());
	     break aaa;
	    }
	   }
	 
	   operand = jtfield.getText();
	   answer = Double.parseDouble(operand);
	   operator = "";
	   isFirst = false;
	  }

	 
	  if ("복사".equals(take_label)) {
	   dupl = jtfield.getText();
	   System.out.println(dupl);
	  }
	  if ("붙여넣기".equals(take_label)) {
	   jtfield.setText("" + dupl);
	  }

	 }
	public static void main(String[] args) {
		new Event();

	}

}

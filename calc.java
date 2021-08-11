import java.awt.*;
import java.awt.event.*;
class MyCalc extends Frame implements ActionListener {
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bequal,bclr;
	Label t,t1,t2,t3,t4;
	MyCalc(){
	super("Calculator");
	//setSize(240,500);
	setSize(280,300);
	setVisible(true);
	setLocationRelativeTo(null);
	setLayout(null);
	setBackground(Color.yellow);
	setForeground(Color.blue);
	//1st numerator
	Font font = new Font("Berlin Sans FB",java.awt.Font.PLAIN,20);
	t = new Label();
	add(t);
	t.setBounds(40,40,40,40);
	t.setBackground(Color.yellow);
	t.setFont(font);
    t1= new Label();
	add(t1);
	t1.setBounds(80,40,40,40);
	t1.setBackground(Color.yellow);
	t1.setFont(font);
	t2= new Label();
	add(t2);
	t2.setBounds(120,40,40,40);
	t2.setBackground(Color.yellow);
    t2.setFont(font);
	t3= new Label();
	add(t3);
	t3.setBounds(160,40,40,40);
	t3.setBackground(Color.yellow);
	t4= new Label();
	add(t4);
	t4.setBounds(200,40,70,40);
	t4.setBackground(Color.yellow);
	 t4.setFont(font);
    //1	
	b1 = new Button("1");
    add(b1);
	b1.setBounds(40,80,50,50);
	b1.addActionListener(this);
	b2 = new Button("2");
	add(b2);
	b2.setBounds(90,80,50,50);
	b2.addActionListener(this);
	//3
	b3 = new Button("3");
	add(b3);
	b3.setBounds(140,80,50,50);
    b3.addActionListener(this);
	//4
	b4 = new Button("4");
	add(b4);
	b4.setBounds(40,130,50,50);
	b4.addActionListener(this);
	//5
	b5 = new Button("5");
	add(b5);
	b5.setBounds(90,130,50,50);
	b5.addActionListener(this);
	//6
	b6 = new Button("6");
	add(b6);
	b6.setBounds(140,130,50,50);
	b6.addActionListener(this);
	//7
	b7 = new Button("7");
	add(b7);
	b7.setBounds(40,180,50,50);
    b7.addActionListener(this);
	//8
	b8 = new Button("8");
	add(b8);
	b8.setBounds(90,180,50,50);
	b8.addActionListener(this);
	//9
	b9 = new Button("9");
	add(b9);
	b9.setBounds(140,180,50,50);
	b9.addActionListener(this);
	//0
	b0 = new Button("0");
	add(b0);
	b0.setBounds(40,230,50,50);
	b0.addActionListener(this);
	//additon
	badd = new Button("+");
	add(badd);
	badd.setBounds(90,230,50,50); 
	badd.addActionListener(this);
	//subtraction
	bsub = new Button("-");
	add(bsub);
	bsub.setBounds(140,230,50,50);
	bsub.addActionListener(this);
	//multiply
	bmul = new Button("*");
	add(bmul);
	bmul.addActionListener(this);
	bmul.setBounds(190,80,50,50);
	//division
	bdiv = new Button("/");
	add(bdiv);
	bdiv.setBounds(190,130,50,50);
	bdiv.addActionListener(this);
	//equalto
	bequal = new Button("=");
	add(bequal);
	bequal.setBounds(190,180,50,50);
	bequal.addActionListener(this);
	//clrscr
	bclr = new Button("C");
	add(bclr); 
	bclr.setBounds(190,230,50,50);
	bclr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){

	 if(e.getSource() == b1){
	 if(t1.getText()==("")){
	 t.setText("1");
     String h=t.getText();
	 if((t1.getText()==("")) & (t.getText()!=(""))){
     t.setText(h+"1");
	 }
	 }
	 else
	 {
     t2.setText("1");}
	 //String a=t.getText();
	 //storage(a);
	 }
	 else if(e.getSource() == b2){
     if(t.getText()==("")){
	 t.setText("2");
	 }
	 else
	 {
     t2.setText("2");}
	 String b =t.getText();
	 //storage(b);
	 }
	 else if(e.getSource() == b3){
	 if(t.getText()==("")){
	 t.setText("3");
	 }
	 else
	 {
     t2.setText("3");}
	 
	 //storage(c);
	 }
	 else if(e.getSource() == b4){
	if(t.getText()==("")){
	 t.setText("4");
	 }
	 else
	 {
     t2.setText("4");}
	 }
	 else if(e.getSource() == b5){
	 if(t.getText()==("")){
	 t.setText("5");
	 }
	 else
	 {
     t2.setText("5");}
	 //String e1=t.getText();
	 //calc(e1);
	 }
	 else if(e.getSource() == b6){
	 if(t.getText()==("")){
	 t.setText("6");
	 }
	 else
	 {
     t2.setText("6");}
	 
	 }
	 else if(e.getSource() == b7){
	if(t.getText()==("")){
	 t.setText("7");
	 }
	 else
	 {
     t2.setText("7");}
	 
	 
	 }
	 else if(e.getSource() == b8){
	 if(t.getText()==("")){
	 t.setText("8");
	 }
	 else
	 {
     t2.setText("8");}
	 }
	 else if(e.getSource() == b9){
	 if(t.getText()==("")){
	 t.setText("9");
	 }
	 else
	 {
     t2.setText("9");}
	 }
	 else if(e.getSource() == b0){
	 if(t.getText()==("")){
	 t.setText("0");
	 }
	 else
	 {
     t2.setText("0");}
	 }
	 else if(e.getSource() == badd)
	 t1.setText("+");
	 else if(e.getSource() == bsub)
	 t1.setText("-");
	 else if(e.getSource() == bmul)
	 t1.setText("x");
	 else if(e.getSource() == bdiv)
	 t1.setText("/");
	 else if(e.getSource() == bclr)
	 {t2.setText("");
	 t1.setText("");
	 t.setText("");
	 t3.setText("");
	 t4.setText("");
	}
	 else if(e.getSource() == bequal)
	 {t3.setText("=");
	 String i=t.getText();
	 String j=t2.getText();
	 String k=t1.getText();
	 yo(i,j,k);
	 }
	 else
	 t.setText("");
	
}
void yo(String c,String d,String e){
float a,b,s;
a=Float.parseFloat(c);
b=Float.parseFloat(d);
if(e=="+"){
s=a+b;}
else if(e=="-"){
s=a-b;}
else if(e=="x"){
s=a*b;}
else {
s=a/b;
}
String v=Float.toString(s);
t4.setText(v);
}
public static void main(String arr[]){
	MyCalc c = new MyCalc();
}
}

package graph;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import logic.Operations;

public class MainWindow extends JFrame implements ActionListener{

	private JTextField txt_resistor;
	private JTextField txt_capacitor;
	private JLabel lbl_resistor;
	private JLabel lbl_capacitor;
	private JButton btn_calculate;
	private JLabel lbl_time;
	private JLabel lbl_frequency;
	private Operations o;
	public MainWindow(String title){
		this.setTitle(title);
		initComponents();
		o = new Operations();
	}
	
	public void initComponents(){
		
		this.setLayout(null);
		this.setSize(240, 230);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		lbl_resistor = new JLabel("Resistencia(Ω):");
		lbl_capacitor = new JLabel("Capacitor(F)");
		txt_capacitor = new JTextField();
		txt_resistor = new JTextField();
		lbl_time = new JLabel("Tiempo: ");
		lbl_frequency = new JLabel("Frecuencia: ");
		btn_calculate = new JButton("Calcular");
		
		lbl_resistor.setBounds(20, 20, 100, 25);
		lbl_capacitor.setBounds(20, 50, 100, 25);
		txt_resistor.setBounds(120, 20, 100, 25);
		txt_capacitor.setBounds(120, 50, 100, 25);
		lbl_time.setBounds(20, 130, 240, 25);
		lbl_frequency.setBounds(20, 150, 240, 25);
		btn_calculate.setBounds(20, 85, 200, 20);
		btn_calculate.addActionListener(this);
		
		
		this.add(lbl_resistor);
		this.add(lbl_capacitor);
		this.add(txt_capacitor);
		this.add(txt_resistor);
		this.add(lbl_time);
		this.add(lbl_frequency);
		this.add(btn_calculate);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_calculate){
			double resistor = Double.parseDouble(txt_resistor.getText());
			double capacitor = Double.parseDouble(txt_capacitor.getText());
			
			double time = o.time(resistor, capacitor);
			double frequency = o.frecuency(time);
			
			lbl_time.setText("Tiempo: "+time);
			lbl_frequency.setText("Frecuencia: "+frequency);
			
		}
	}

}

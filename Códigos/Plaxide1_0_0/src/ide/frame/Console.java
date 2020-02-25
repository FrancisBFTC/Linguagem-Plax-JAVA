package ide.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Console extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JEditorPane console;
	public Console() {
		this.setBounds(400, 200, 700, 500);
		this.setTitle("Output Console");
		this.setMaximumSize(new Dimension(300, 200));
		JPanel painel;
		this.add(painel = new JPanel());
		URL url = this.getClass().getResource("/image/icone_plax.jpg");  
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
		this.setIconImage(iconeTitulo);
	
		
		// Window ambient area
		JLabel consoleLabel = new JLabel();
		consoleLabel.setText("<html><div bgcolor='lightgray' width='1073' height='1095'></div></html>");
		consoleLabel.setBounds(0, 2, 300, 200);
		
		// Window Color area
		painel.add(consoleLabel);
		painel.setBackground(Color.lightGray);
		
		
	
		// Text editor plax
		console = new JEditorPane();
		console.setCaretColor(Color.white);
		console.setEditable(false);
		console.getAccessibleContext();
		console.setForeground(Color.black);
		console.setContentType("text/html");
		
	
		console.setFont(new Font("Arial", 1, 20));
		this.add(console);
		
		JScrollPane scrollEditor = new JScrollPane(console);
		scrollEditor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollEditor.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollEditor.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		scrollEditor.setBounds(5, 30, 870, 440);
		
		this.add(scrollEditor);
	}

}

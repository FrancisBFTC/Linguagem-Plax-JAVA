package ide.frame;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileFilter;



@SuppressWarnings("serial")
public class FrameIde extends JFrame{
	
	
	public JTextPane plaxEditor;
	public JTextField path;
	public String memory = "";
	public JLabel[] listFilesPlax;
	public int numberList = 0;
	public int num = 0;
	public String getPath = "";
	
	public FrameIde() throws IOException {
		
		int largPad = 1366;
		@SuppressWarnings("unused")
		int altPad = 768;
		
		// Definicoes da Janela
		JPanel painel;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension sizeFrame = kit.getScreenSize();
	
		int largAt = sizeFrame.width;
		int altAt = sizeFrame.height;
	
		this.setTitle("Plaxide 1.0.0");
		this.add(painel = new JPanel());
		this.setSize(largAt, altAt);
		
		
		// Janela do plaxide 1.0.0
		JLabel frameLabel = new JLabel();
		frameLabel.setText("<html><div bgcolor='black' width='1350' height='1395'></div></html>");
		frameLabel.setBounds(0, 2, 1280, 855);
		frameLabel.setBackground(Color.blue);
		JLabel imageDis = new JLabel();
		imageDis.setText(null);
		
		if(largAt <= 1024){
			imageDis.setBounds(180, 10, 150, 20);
			}else
				if(largAt >= 1100){
					imageDis.setBounds(10, 10, 150, 20);
				}
		imageDis.setForeground(Color.green);
		imageDis.setVisible(false);
		frameLabel.add(imageDis);
	
	
		
		// Cor da janela do plaxide 1.0.0
		painel.add(frameLabel);
		painel.setBackground(Color.lightGray);
		
		
		String pathStr = new File("").getAbsolutePath();
		
		path = new JTextField();
		
		if(largAt >= largPad){
			path.setBounds(950, 30, 250, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				path.setBounds(900, 30, 250, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				path.setBounds(850, 30, 250, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				path.setBounds(800, 30, 250, 20);
			}
			
		frameLabel.add(path);
		
		
		
		
		
		//Ler o arquivo path do plax
		String filePath = pathStr+"\\Plax\\config"+"\\path.txt";
		File fileCa = new File(filePath);
		FileReader caminho = new FileReader(fileCa);
		BufferedReader lerCaminho = new BufferedReader(caminho);
	    String texto = lerCaminho.readLine();
	 
	    lerCaminho.close();
	    path.setText(texto);
	    
	    JPanel bar = new JPanel();
		bar.setBounds(305, 38, 150, 24);
		bar.setLayout(null);
		bar.setBackground(Color.black);
		frameLabel.add(bar);
		
		String subPath = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);

		
		JLabel labelBar = new JLabel();
		labelBar.setBounds(5, 0, 100, 20);
		labelBar.setForeground(Color.white);
		labelBar.setText(subPath);
		bar.add(labelBar);
		
		JLabel x = new JLabel();
		x.setBounds(140, -4, 90, 20);
		x.setForeground(Color.red);
		x.setText("X");
		bar.add(x);
		
		x.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				x.setForeground(Color.red);
				bar.setVisible(false);
				plaxEditor.setText("");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				x.setForeground(Color.CYAN);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				x.setForeground(Color.red);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				x.setForeground(Color.white);
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
	    
		// Editor de texto Plax
		plaxEditor = new JTextPane();
		plaxEditor.setBackground(Color.black);
		plaxEditor.setForeground(Color.green);
		plaxEditor.setCaretColor(Color.white);
		plaxEditor.setFont(new Font("Lucida Console", 5, 15));
		plaxEditor.setBorder(new NumberedBorder());
		
		frameLabel.add(plaxEditor);
		
		
		plaxEditor.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent event) {

				if(event.getKeyCode() == KeyEvent.VK_S){
					
					if(event.isControlDown()){
						imageDis.setForeground(Color.blue);
						imageDis.setText("Salvo com sucesso!");
						imageDis.setVisible(true);
						String subPath = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax"));
						
						FileWriter writeEditor;
						try {
							
							writeEditor = new FileWriter(pathStr+"\\Plax\\"+subPath+".plax");
							writeEditor.write(plaxEditor.getText());
							writeEditor.close();
						} catch (IOException e2) {
							noExistDir();
							
						}
						
						String subPaths = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
						labelBar.setText(subPaths);
						bar.setVisible(true);
						
					}
					
					
				}
				if(!event.isControlDown()){
					imageDis.setForeground(Color.red);
					imageDis.setText("Ainda não salvo!");
					imageDis.setVisible(true);
				}
				
			}
		});
		
		
		//Debugger do plax
		JEditorPane debugger = new JEditorPane();
		debugger.setBackground(Color.white);
		debugger.setForeground(Color.black);
		debugger.setBounds(305, 400, 900, 440);
		debugger.setEditable(true);
		frameLabel.add(debugger);
		
		//Painel lateral do plax
		JEditorPane latPainel = new JEditorPane();
		latPainel.setBackground(Color.white);
		latPainel.setForeground(Color.black);
		latPainel.setBounds(305, 400, 900, 440);
		latPainel.setContentType("text/html");
		latPainel.setEditable(true);
		frameLabel.add(latPainel);
		
	
		File dir = new File(pathStr+"\\Plax");
		File aDir[] = dir.listFiles();
		int i = 0;
		numberList = aDir.length;
		listFilesPlax = new JLabel[numberList+1];
		for(int j = aDir.length; i < j; i++){
			File arquivos = aDir[i];
			String ars = arquivos.getName();
			if(ars.endsWith(".plax")){
				listFilesPlax[i] = new JLabel();
				listFilesPlax[i].setText("<html><img src='file:"+pathStr+"/Plax/images/icon.jpg' width='15' height='20'><font color='black'>"+ars+"</font></html>");
				listFilesPlax[i].setName(ars);
				listFilesPlax[i].setBounds(20, 25*i, 200, 30);
				latPainel.setText("****Lista de arquivos****"+"<br><br>");
			
				latPainel.add(listFilesPlax[i]);
				num = i;
				listFilesPlax[i].addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						
						listFilesPlax[num].setBackground(Color.green);
						
						path.setText(pathStr+"\\Plax\\"+ars);
						
						FileWriter fileWriter;
						try {
							fileWriter = new FileWriter(pathStr+"\\Plax\\config\\path.txt");
							fileWriter.write(path.getText());
							fileWriter.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
						
						String subPaths = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
						labelBar.setText(subPaths);
						bar.setVisible(true);
						FileReader filePlax;
						try {
							filePlax = new FileReader(pathStr+"\\Plax\\"+ars);
							BufferedReader brPlax = new BufferedReader(filePlax);
							String linePlax = brPlax.readLine();
							String memoryPlax = "";
							
							while(linePlax != null){
								memoryPlax += linePlax + "\n";
								linePlax = brPlax.readLine();
							}
							
							plaxEditor.setText(memoryPlax);
							
							memoryPlax = "";
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						listFilesPlax[num].setBackground(Color.white);
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						listFilesPlax[num].setBackground(Color.green);
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						
					}
				});
				
			}
		}
		memory = "";
		
		FileReader filePlax = new FileReader(path.getText());
		BufferedReader brPlax = new BufferedReader(filePlax);
		String linePlax = brPlax.readLine();
		String memoryPlax = "";
		
		while(linePlax != null){
			memoryPlax += linePlax + "\n";
			linePlax = brPlax.readLine();
		}
		
		plaxEditor.setText(memoryPlax);
		
		memoryPlax = "";
		// Barra de Rolagem do plaxide 1.0.0
		@SuppressWarnings("unused")
		int position;
		
		JScrollPane scrollEditor = new JScrollPane(plaxEditor);
		position = scrollEditor.getVerticalScrollBarPolicy();
		scrollEditor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollEditor.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollEditor.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		//alinhamento a cada monitor: Editor do plax
		if(largAt >= largPad){
			scrollEditor.setBounds(305, 60, 900, 440);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				scrollEditor.setBounds(305, 60, 850, 440);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				scrollEditor.setBounds(305, 60, 800, 440);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				scrollEditor.setBounds(305, 60, 750, 440);
			}
		
		frameLabel.add(scrollEditor);
		
		// Barra de Rolagem do debugger
		@SuppressWarnings("unused")
		int positionDe;
		
		JScrollPane scrollDebug = new JScrollPane(debugger);
		positionDe = scrollDebug.getVerticalScrollBarPolicy();
		scrollDebug.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollDebug.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollDebug.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		//alinhamento a cada monitor: debugger
		if(largAt >= largPad){
			scrollDebug.setBounds(305, 500, 900, 150);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				scrollDebug.setBounds(305, 500, 850, 150);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				scrollDebug.setBounds(305, 500, 800, 150);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				scrollDebug.setBounds(305, 500, 750, 150);
			}
		
		frameLabel.add(scrollDebug);
		
		// Barra de Rolagem do Painel lateral
		@SuppressWarnings("unused")
		int positionLat;
				
		JScrollPane scrollLat = new JScrollPane(latPainel);
		positionLat = scrollLat.getVerticalScrollBarPolicy();
		scrollLat.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollLat.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollLat.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		//alinhamento a cada monitor: barra lateral
		if(largAt >= largPad){
			scrollLat.setBounds(0, 60, 290, 600);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				scrollLat.setBounds(45, 60, 220, 600);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				scrollLat.setBounds(90, 60, 170, 600);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				scrollLat.setBounds(180, 60, 130, 600);
			}
		
			
			
		
		frameLabel.add(scrollLat);
		
		
		
		
		
		
		
		JFrame frameSave = new JFrame();
		frameSave.setBounds(300, 200, 400, 300);
		frameSave.setVisible(false);
		
		JPanel panelSave = new JPanel();
		panelSave.setBounds(0, 0, 400, 300);
		panelSave.setLayout(null);
		frameSave.add(panelSave);
		
		JLabel labelSave = new JLabel();
		labelSave.setText("Nome do arquivo:");
		labelSave.setBounds(100, 100, 100, 20);
		panelSave.add(labelSave);
		
		JTextField textSave = new JTextField();
		textSave.setBounds(200, 100, 80, 20);
		panelSave.add(textSave);
		
		JLabel labelExt = new JLabel();
		labelExt.setText("<html><b>.plax</b></html>");
		labelExt.setBounds(300, 100, 50, 20);
		panelSave.add(labelExt);
		
		JButton save = new JButton();
		save.setBounds(200, 200, 100, 20);
		save.setText("Finish");
		panelSave.add(save);
		
		JFrame frameDel = new JFrame();
		frameDel.setBounds(300, 200, 400, 300);
		frameDel.setVisible(false);
		
		JPanel panelDel = new JPanel();
		panelDel.setBounds(0, 0, 400, 300);
		panelDel.setLayout(null);
		frameDel.add(panelDel);
		
		JLabel labelDel = new JLabel();
		labelDel.setText("Nome do arquivo:");
		labelDel.setBounds(100, 100, 100, 20);
		panelDel.add(labelDel);
		
		JTextField textDel = new JTextField();
		textDel.setBounds(200, 100, 80, 20);
		panelDel.add(textDel);
		
		JLabel labelExtDel = new JLabel();
		labelExtDel.setText("<html><b>.plax</b></html>");
		labelExtDel.setBounds(300, 100, 50, 20);
		panelDel.add(labelDel);
		
		JButton del = new JButton();
		del.setBounds(200, 200, 100, 20);
		del.setText("Delete");
		panelDel.add(del);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(textSave.getText().contains(".plax")){
					noExtension();
				}else{
				
				FileWriter writeEditor;
				try {
					//Salvar o código plax no arquivo
					writeEditor = new FileWriter(pathStr+"\\Plax"+"\\"+textSave.getText()+".plax");
					writeEditor.write(plaxEditor.getText());
					writeEditor.close();
					path.setText(pathStr+"\\Plax"+"\\"+textSave.getText()+".plax");
				} catch (IOException e2) {
					noExistDir();
					
				}
				
				// salvar o caminho do código no path.txt
				FileWriter fileWriter;
				try {
					fileWriter = new FileWriter(pathStr+"\\Plax\\config"+"\\path.txt");
					fileWriter.write(path.getText());
					fileWriter.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				
				frameSave.setVisible(false);
				String subPath = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
				labelBar.setText(subPath);
				bar.setVisible(true);
				plaxEditor.setText("");
				
	
				
				
				
				latPainel.setText("");
				
				File dir = new File(pathStr+"\\Plax");
				File aDir[] = dir.listFiles();
				int i = 0;
				numberList = aDir.length;
				listFilesPlax = new JLabel[numberList+1];
				for(int j = aDir.length; i < j; i++){
					File arquivos = aDir[i];
					String ars = arquivos.getName();
					if(ars.endsWith(".plax")){
						listFilesPlax[i] = new JLabel();
						listFilesPlax[i].setText("<html><img src='file:"+pathStr+"/Plax/images/icon.jpg' width='15' height='20'><font color='black'>"+ars+"</font></html>");
						listFilesPlax[i].setName(ars);
						listFilesPlax[i].setBounds(20, 25*i, 200, 30);
						latPainel.setText("****Lista de arquivos****"+"<br><br>");
						
						latPainel.add(listFilesPlax[i]);
						num = i;
						
						listFilesPlax[i].addMouseListener(new MouseListener() {
							
							@Override
							public void mouseReleased(MouseEvent e) {
								
								
							}
							
							@Override
							public void mousePressed(MouseEvent e) {
								
								listFilesPlax[num].setBackground(Color.green);
								
								path.setText(pathStr+"\\Plax\\"+ars);
								
								String subPaths = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
								labelBar.setText(subPaths);
								bar.setVisible(true);
								FileReader filePlax;
								try {
									filePlax = new FileReader(pathStr+"\\Plax\\"+ars);
									BufferedReader brPlax = new BufferedReader(filePlax);
									String linePlax = brPlax.readLine();
									String memoryPlax = "";
									
									while(linePlax != null){
										memoryPlax += linePlax + "\n";
										linePlax = brPlax.readLine();
									}
									
									plaxEditor.setText(memoryPlax);
									
									memoryPlax = "";
									
								} catch (FileNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								
								
								
							}
							
							@Override
							public void mouseExited(MouseEvent e) {
								listFilesPlax[num].setBackground(Color.white);
								
							}
							
							@Override
							public void mouseEntered(MouseEvent e) {
								listFilesPlax[num].setBackground(Color.green);
								
							}
							
							@Override
							public void mouseClicked(MouseEvent e) {
								
								
							}
						});
						
					}
			
				}
				memory = "";
				
				//Colorir as palavras
				
			}
		}
	});
		
		del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textDel.getText().contains(".plax")){
					noExtension();
				}else{
					
					path.setText(pathStr);
					
					try {
						Runtime.getRuntime().exec("CMD /c del "+pathStr+"\\Plax"+"\\"+textDel.getText()+".plax");
					} catch (IOException e2) {
				
						e2.printStackTrace();
					}
					
					FileWriter fileWriter;
					try {
						fileWriter = new FileWriter(pathStr+"\\Plax\\config"+"\\path.txt");
						fileWriter.write(path.getText());
						fileWriter.close();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					frameDel.setVisible(false);
					labelBar.setText("");
					bar.setVisible(false);
					plaxEditor.setText("");
				
					
					 if(JOptionPane.showConfirmDialog(del, "O arquivo "+textDel.getText()+".plax foi excluido com sucesso! \n Deseja atualizar a lista de arquivos?")==JOptionPane.YES_OPTION){
					
						
						
						latPainel.setText("");
						
						
						File dir = new File(pathStr+"\\Plax");
						File aDir[] = dir.listFiles();
						int i = 0;
						numberList = aDir.length;
						listFilesPlax = new JLabel[numberList+1];
						for(int j = aDir.length; i < j; i++){
							File arquivos = aDir[i];
							String ars = arquivos.getName();
							if(ars.endsWith(".plax")){
								listFilesPlax[i] = new JLabel();
								listFilesPlax[i].setText("<html><img src='file:"+pathStr+"/Plax/images/icon.jpg' width='15' height='20'><font color='black'>"+ars+"</font></html>");
								listFilesPlax[i].setName(ars);
								listFilesPlax[i].setBounds(20, 25*i, 200, 30);
								latPainel.setText("****Lista de arquivos****"+"<br><br>");
								
								latPainel.add(listFilesPlax[i]);
								num = i;
								
								listFilesPlax[i].addMouseListener(new MouseListener() {
									
									@Override
									public void mouseReleased(MouseEvent e) {
										
										
									}
									
									@Override
									public void mousePressed(MouseEvent e) {
										
										listFilesPlax[num].setBackground(Color.green);
										
										path.setText(pathStr+"\\Plax\\"+ars);
										
										String subPaths = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
										labelBar.setText(subPaths);
										bar.setVisible(true);
										FileReader filePlax;
										try {
											filePlax = new FileReader(pathStr+"\\Plax\\"+ars);
											BufferedReader brPlax = new BufferedReader(filePlax);
											String linePlax = brPlax.readLine();
											String memoryPlax = "";
											
											while(linePlax != null){
												memoryPlax += linePlax + "\n";
												linePlax = brPlax.readLine();
											}
											
											plaxEditor.setText(memoryPlax);
											
											memoryPlax = "";
											
										} catch (FileNotFoundException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										
										
										
									}
									
									@Override
									public void mouseExited(MouseEvent e) {
										listFilesPlax[num].setBackground(Color.white);
										
									}
									
									@Override
									public void mouseEntered(MouseEvent e) {
										listFilesPlax[num].setBackground(Color.green);
										
									}
									
									@Override
									public void mouseClicked(MouseEvent e) {
										
										
									}
								});
							}
							
						}
						memory = "";
					 }
				
					
				}
				
			}
		});
		
		
		//Botao novo arquivo
		JButton newFile = new JButton();
		newFile.setText("New File");
		
		//alinhamento a cada monitor
		if(largAt >= largPad){
			newFile.setBounds(1210, 150, 100, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				newFile.setBounds(1160, 150, 100, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				newFile.setBounds(1110, 150, 100, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				newFile.setBounds(1060, 150, 100, 20);
			}
		frameLabel.add(newFile);
		
		//Botao deletar arquivo
		JButton delete = new JButton();
		delete.setText("delete");
		
		//alinhamento a cada monitor
		if(largAt >= largPad){
			delete.setBounds(1210, 180, 100, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				delete.setBounds(1160, 180, 100, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				delete.setBounds(1110, 180, 100, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				delete.setBounds(1060, 180, 100, 20);
			}
		frameLabel.add(delete);
		
		//Botao compilar
		JButton button = new JButton();
		button.setText("Compile");
		
		//alinhamento a cada monitor
		if(largAt >= largPad){
			button.setBounds(1210, 60, 100, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				button.setBounds(1160, 60, 100, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				button.setBounds(1110, 60, 100, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				button.setBounds(1060, 60, 100, 20);
			}
		frameLabel.add(button);
		
		
		//Palavra path
		JLabel labelPath = new JLabel();
		labelPath.setText("Path:");
		
		//alinhamento a cada monitor
		if(largAt >= largPad){
			labelPath.setBounds(910, 20, 50, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				labelPath.setBounds(860, 20, 50, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				labelPath.setBounds(810, 20, 50, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				labelPath.setBounds(760, 20, 50, 20);
			}
		frameLabel.add(labelPath);
		
		
	  
		//Botão importar
		JButton importing = new JButton();
		importing.setText("Import");
	
		//alinhamento a cada monitor
		if(largAt >= largPad){
			importing.setBounds(1210, 90, 100, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				path.setBounds(1160, 30, 250, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				path.setBounds(1110, 30, 250, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				importing.setBounds(1060, 90, 100, 20);
			}
		frameLabel.add(importing);
		
		//Botao Finalizar processos javaw.exe
		JButton task = new JButton();
		task.setText("taskkill");
	
		//alinhamento a cada monitor
		if(largAt >= largPad){
			task.setBounds(1210, 120, 100, 20);
		}else
			if((largAt >= 1220) & (largAt <= 1310)){
				task.setBounds(1160, 120, 100, 20);
			}
			if((largAt >= 1120) & (largAt <= 1210)){
				task.setBounds(1110, 120, 100, 20);
			}
			if((largAt >= 1020) & (largAt <= 1110)){
				task.setBounds(1060, 120, 100, 20);
			}
		frameLabel.add(task);
		
		
			
		
		    
			
		
		newFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frameSave.setVisible(true);
				
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frameDel.setVisible(true);
				
			}
		});
		
		task.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ao exportar retirar '\\Plax'
				String taskkill = pathStr+"\\Plax\\config"+"\\taskkill.lnk";
				
				try {
					Runtime.getRuntime().exec("CMD /c start "+taskkill);
				} catch (IOException e1) {
					
					noExistDir();
				}
				
			}
		});
		
		
		importing.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File Files = new File(path.getText());
				 JFileChooser chooser = new JFileChooser(Files);
				 
				 chooser.setFileFilter(new FileFilter() {
					
					@Override
					public String getDescription() {
						return "*.plax";
					}
					
					@Override
					public boolean accept(File f) {
						return (f.getName().endsWith(".plax") || f.isDirectory());
					}
				});
				 
					int returnVal = chooser.showOpenDialog(null); //replace null with your swing container
					File file;
					
					if(returnVal == JFileChooser.APPROVE_OPTION){     
					  file = chooser.getSelectedFile(); 
					//Leitura de importação na IDE
					  	

						String Fil = file.toString();
						path.setText(Fil);
						
						getPath = path.getText().substring(path.getText().indexOf("C:"), path.getText().indexOf("Plax")+4);
						
						FileWriter fileWriter;
						try {
							fileWriter = new FileWriter(pathStr+"\\Plax\\config\\path.txt");
							fileWriter.write(path.getText());
							fileWriter.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
						
						FileReader filePlax;
						try {
							filePlax = new FileReader(path.getText());
							BufferedReader brPlax = new BufferedReader(filePlax);
							String linePlax = brPlax.readLine();
							String memoryPlax = "";

							
							
							while(linePlax != null){
								memoryPlax += linePlax + "\n";
								linePlax = brPlax.readLine();
							}
			
							plaxEditor.setText(memoryPlax);
			
							memoryPlax = "";
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						
						String subPath = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
						labelBar.setText(subPath);
						bar.setVisible(true);
					
					}
				
				
			}
		});
		//Final botão importar
		
		
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(plaxEditor.getText().isEmpty()){
					emptyEditor();
				}else{
					try {
						Runtime.getRuntime().exec("CMD /c InterPlax "+path.getText()+"");
					} catch (IOException e1) {
						
						noExistDir();
						
					}
						
				}
				
			} // Final do método actionPerformed
		}); // Final da ActionListener
		
		
		
		
		
	}// Final do construtor FrameIde
	
	
	//Editor vazio
	public void emptyEditor(){
		
		JOptionPane.showMessageDialog(this, "<html><font color='red'>Erro! O editor está vazio! :(</font></html>");
		
	}
	
	//Sintaxe incorreta
	public void incorretSintax(){
		JOptionPane.showMessageDialog(this, "<html><font color='red'>Erro! A sintaxe do código está incorreto! :(</font></html>");
		
	}
	
	//Sem extensão
	public void noExtension(){
		JOptionPane.showMessageDialog(this, "<html><font color='red'>Por favor! não coloque o tipo de extensão :(</font></html>");
			
	}
	
	//Não existe arquivo
	public void noExistFile(){
		JOptionPane.showMessageDialog(this, "<html><font color='red'>Desculpe! o arquivo '"+path.getText()+"' não existe! :(</font></html>");
	}
	
	//Não existe diretório
	public void noExistDir(){
		JOptionPane.showMessageDialog(this, "<html><font color='red'>Desculpe! o diretório '"+path.getText()+"' não existe! :(</font></html>");
	}
	
	
}//Final da classe FrameIde

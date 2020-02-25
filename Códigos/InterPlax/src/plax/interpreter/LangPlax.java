package plax.interpreter;

import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.util.Map;
import java.util.HashMap;


public class LangPlax{
	/**
	 * 
	 */
	
	public static String bin = "";
	public static String output = "";
	public static String plaxFile = "";
	public static Consol console;
	public static Consol initConsole;
	public static Escope initEscope;
	public static String sisCommand, varCommand;
	public static String memory1 = "";
	public static String memory2 = "";
	public static String memory3 = "";
	public static String memory4 = "";
	public static String memoryChar = "";
	public static String memory = "";
	public static String otherMemory = "";
	public static String memoriaPath = "";
	public static String memoriaBase = "";
	public static String memoriaBases = "";
	public static String memoria = "";
	public static String memoriaVar = "";
	public static String sis, var, paths, getPlaxSis, memoriaSis;
	public static String valOp;
	public static String variable;
	public static String vars;
	public static String linha;
	public static String textSis1;
	public static String textSis2;
	public static String sisVar;
	public static String val;
	public static String val1;
	public static String val2;
	public static String a0;
	public static String a1;
	public static String a2;
	public static String a3;
	public static String a4;
	public static String a5;
	public static String a6;
	public static String a7;
	public static String a8;
	public static String a9;
	public static String b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	public static String c0, c1, c2, c3, c4, c5, c6, c7, c8, c9;
	public static String d0, d1, d2, d3, d4, d5, d6, d7, d8, d9;
	public static String e0, e1, e2, e3, e4, e5, e6, e7, e8, e9;
	public static String f0, f1, f2, f3, f4, f5, f6, f7, f8, f9;
	public static String g0, g1, g2, g3, g4, g5, g6, g7, g8, g9;
	public static String h0, h1, h2, h3, h4, h5, h6, h7, h8, h9;
	public static String i0, i1, i2, i3, i4, i5, i6, i7, i8, i9;
	public static String j0, j1, j2, j3, j4, j5, j6, j7, j8, j9;
	public static String k0, k1, k2, k3, k4, k5, k6, k7, k8, k9;
	public static String l0, l1, l2, l3, l4, l5, l6, l7, l8, l9;
	public static String m0, m1, m2, m3, m4, m5, m6, m7, m8, m9;
	public static String n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
	public static String o0, o1, o2, o3, o4, o5, o6, o7, o8, o9;
	public static String p0, p1, p2, p3, p4, p5, p6, p7, p8, p9;
	public static String q0, q1, q2, q3, q4, q5, q6, q7, q8, q9;
	public static String r0, r1, r2, r3, r4, r5, r6, r7, r8, r9;
	public static String s0, s1, s2, s3, s4, s5, s6, s7, s8, s9;
	public static String t0, t1, t2, t3, t4, t5, t6, t7, t8, t9;
	public static String u0, u1, u2, u3, u4, u5, u6, u7, u8, u9;
	public static String v0, v1, v2, v3, v4, v5, v6, v7, v8, v9;
	public static String w0, w1, w2, w3, w4, w5, w6, w7, w8, w9;
	public static String x0, x1, x2, x3, x4, x5, x6, x7, x8, x9;
	public static String y0, y1, y2, y3, y4, y5, y6, y7, y8, y9;
	public static String z0, z1, z2, z3, z4, z5, z6, z7, z8, z9;
	public static int Ia0, Ia1, Ia2, Ia3, Ia4, Ia5, Ia6, Ia7, Ia8, Ia9;
	public static int Ib0, Ib1, Ib2, Ib3, Ib4, Ib5, Ib6, Ib7, Ib8, Ib9;
	public static int Ic0, Ic1, Ic2, Ic3, Ic4, Ic5, Ic6, Ic7, Ic8, Ic9;
	public static int Id0, Id1, Id2, Id3, Id4, Id5, Id6, Id7, Id8, Id9;
	public static int Ie0, Ie1, Ie2, Ie3, Ie4, Ie5, Ie6, Ie7, Ie8, Ie9;
	public static int If0, If1, If2, If3, If4, If5, If6, If7, If8, If9;
	public static int Ig0, Ig1, Ig2, Ig3, Ig4, Ig5, Ig6, Ig7, Ig8, Ig9;
	public static int Ih0, Ih1, Ih2, Ih3, Ih4, Ih5, Ih6, Ih7, Ih8, Ih9;
	public static int Ii0, Ii1, Ii2, Ii3, Ii4, Ii5, Ii6, Ii7, Ii8, Ii9;
	public static int Ij0, Ij1, Ij2, Ij3, Ij4, Ij5, Ij6, Ij7, Ij8, Ij9;
	public static int Ik0, Ik1, Ik2, Ik3, Ik4, Ik5, Ik6, Ik7, Ik8, Ik9;
	public static int Il0, Il1, Il2, Il3, Il4, Il5, Il6, Il7, Il8, Il9;
	public static int Im0, Im1, Im2, Im3, Im4, Im5, Im6, Im7, Im8, Im9;
	public static int In0, In1, In2, In3, In4, In5, In6, In7, In8, In9;
	public static int Io0, Io1, Io2, Io3, Io4, Io5, Io6, Io7, Io8, Io9;
	public static int Ip0, Ip1, Ip2, Ip3, Ip4, Ip5, Ip6, Ip7, Ip8, Ip9;
	public static int Iq0, Iq1, Iq2, Iq3, Iq4, Iq5, Iq6, Iq7, Iq8, Iq9;
	public static int Ir0, Ir1, Ir2, Ir3, Ir4, Ir5, Ir6, Ir7, Ir8, Ir9;
	public static int Is0, Is1, Is2, Is3, Is4, Is5, Is6, Is7, Is8, Is9;
	public static int It0, It1, It2, It3, It4, It5, It6, It7, It8, It9;
	public static int Iu0, Iu1, Iu2, Iu3, Iu4, Iu5, Iu6, Iu7, Iu8, Iu9;
	public static int Iv0, Iv1, Iv2, Iv3, Iv4, Iv5, Iv6, Iv7, Iv8, Iv9;
	public static int Iw0, Iw1, Iw2, Iw3, Iw4, Iw5, Iw6, Iw7, Iw8, Iw9;
	public static int Ix0, Ix1, Ix2, Ix3, Ix4, Ix5, Ix6, Ix7, Ix8, Ix9;
	public static int Iy0, Iy1, Iy2, Iy3, Iy4, Iy5, Iy6, Iy7, Iy8, Iy9;
	public static int Iz0, Iz1, Iz2, Iz3, Iz4, Iz5, Iz6, Iz7, Iz8, Iz9;
	public static int integerOperation;
	public static int codeLine = 1;
	public static boolean comparation, comparation1, format;
	public static String if0, if1, if2, ol1, ol2, if3, if4, ifVar1, ifVar2, condition = "", condition1 = "";
	public static JFrame frame;
	public static String linePlax = "", memoriaBase1 = "";
	public static String call = "";
	public static String input = "";
	public static String inputVar = "";
	public static JTextField textField;
	public static String inputField = "";
	public static Scanner scan, scan1;
	public static FileReader arq = null;
	public static boolean tecEnter = false;
	public static int getX, getY;
	public static BufferedReader lerArq;
	public static String signal = "";
	public static String whil = "";
	public static boolean EndVar = false;
	public static String argFunc = "";
	public static String subLine = "";
	public static String argLine = "";
	public static String func = "", saveFunc = "";
	public static boolean condWhile = false;
	public static String situation = "";
	public static String funcFile = "";
	public static String getPath = "";
	public static boolean identFunc = false;
	public static String armazenFunctions = "";
	public static String reg = "";
	public static String[] vetor;
	public static String typ = "";
	public static String acres = "";
	public static String fix = "";
	public static String linkage = "";
	public static JFrame window = null;
	
	public static JTextField[] InputText = new JTextField[100];
	public static String IdInputText = "";
	public static int numInputText = 0;
	public static String varsGet = "";
	public static String Inputwidth1 = "0";
	public static String Inputheight1 = "0";
	public static String InputalignX1 = "0";
	public static String InputalignY1 = "0";
	public static String Inputid1 = "";
	public static String Inputcolor1 = "";
	public static String Inputbackcolor1 = "";
	
	public static JLabel label = null;
	public static JButton[] button = new JButton[100];
	public static String IdButton = "";
	public static int numButton = 0;
	public static String butwidth1 = "0";
	public static String butheight1 = "0";
	public static String butalignX1 = "0";
	public static String butalignY1 = "0";
	public static String butid1 = "";
	public static String[] arrayButton = null;
	public static String logicButton = "";
	public static boolean logicButton1 = false;
	public static String[] atualCondBut = new String[50];
	public static int numCond = 0;
	public static String butLogic = "0";
	public static String buttoncolor1 = "";
	public static String buttonbackcolor1 = "";
	
	public static JLabel[] labelImage = new JLabel[100];
	public static ImageIcon imageIcon = null;
	public static int numImage = 0;
	public static String imagewidth1 = "0";
	public static String imageheight1 = "0";
	public static String imagealignX1 = "0";
	public static String imagealignY1 = "0";
	public static String imageid1 = "";
	public static String imagepath1 = "";
	public static String IdImage = "";
	
	public static boolean commandElse = false;
	public static boolean elses = false;
	public static String StringIdentIf = "";
	public static int IntIdentIf = 0;
	public static int IntIdentIf1 = 0;
	public static String[] linkages = new String[100];
	
	public static int escopeTime = 0;
	public static boolean escopeBoolean = false;
	public static boolean escopeBoolean1 = false;
	public static String memoryEscope = "";
	public static String escopeNull = null;
	public static String[] arrayVars = new String[100];
	public static int numVars = 0;
	public static String dynPath = "";
	public static boolean dynBoolean = false;
	public static JFrame dynFrame = null;
	public static JLabel dynLabelFrame = null;
	public static JLabel dynLabelImage = null;
	public static ImageIcon dynImage = null;
	public static int atualX = 0;
	public static int atualY = 0;
	public static int atualW = 0;
	public static int atualH = 0;
	public static int gotoX = 0;
	public static int gotoY = 0;
	public static int X = 0;
	public static int Y = 0;
	public static int X1 = 0;
	public static int Y1 = 0;
	public static int movTime = 0;
	public static boolean booleanTime = false;
	public static JLabel[] labelPaint = null;
	public static String funcPaint = "";
	public static String colorPaint = "";
	public static String sizePaint = "";
	public static String effect = "";
	public static boolean booleanEffect = false;
	public static boolean booleanEffect1 = false;
	public static boolean loopDynamic = false;
	public static int numLabelPaint1 = 0;
	public static int numLabelPaint2 = 0;
	public static int widthDynImage = 0;
	public static int heightDynImage = 0;
	public static String effectCapture = "";
	public static boolean booleanCapture = false;
	public static String loop = "";
	public static boolean loopBoolean = false;
	public static boolean whenBoolean = false;
	public static boolean firstValue = false;
	public static boolean secondValue = false;
	
	
	//Metodo parse conversor de Strings para inteiros
			public static int integers(String string){
				int numbers = 0;
	
				if((!string.contains("'")) && (!string.contains("a") && !string.contains("A") && !string.contains("b") && !string.contains("B")
						 && !string.contains("c") && !string.contains("C") && !string.contains("d") && !string.contains("D") && !string.contains("e") && !string.contains("E")
					  && !string.contains("f") && !string.contains("F") && !string.contains("g") && !string.contains("G") && !string.contains("h") && !string.contains("H")
					   && !string.contains("i") && !string.contains("I") && !string.contains("j") && !string.contains("J") && !string.contains("k") && !string.contains("K")
					    && !string.contains("l") && !string.contains("L") && !string.contains("m") && !string.contains("M") && !string.contains("n") && !string.contains("N")
						 && !string.contains("o") && !string.contains("O") && !string.contains("p") && !string.contains("P") && !string.contains("q") && !string.contains("Q")
						  && !string.contains("r") && !string.contains("R") && !string.contains("s") && !string.contains("S") && !string.contains("t") && !string.contains("T")
						   && !string.contains("u") && !string.contains("U") && !string.contains("v") && !string.contains("V") && !string.contains("w") && !string.contains("W")
						    && !string.contains("x") && !string.contains("X") && !string.contains("y") && !string.contains("Y") && !string.contains("z") && !string.contains("Z")))
				
				{
					
					String[] strings1 = new String[string.length()];
					char[] char1 = string.toCharArray();
					for(int i=0;i<string.length();i++){
						strings1[i] = new String(""+char1[i]);
					}
					for(int i=0;i<string.length();i++){
						for(int j=0;j<9;j++){
							if(strings1[i].equals(""+j)){
								numbers *= 10;
								numbers += j;
							}
						}
					}
						
				}else{
					typeError(codeLine+1, "Uma string nao pode ser um inteiro!");
					initConsole.setVisible(false);
				}
				
					return numbers;
				
				
					
			}
			/* Todos os metodos para operacoes 
			*  relacionais no plax que 
			construirao um valor logico */ 
			
			//Metodo para operacao relacional de valores "menor que"
			public static void lessOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("<")).trim();
				val2 = valOp.substring(valOp.indexOf("<")+1, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				if(integers(val1) < integers(val2)){
					comparation = true;
					if(linha.contains("if")){comparation1 = true;}
				}else{
					comparation = false;
					if(linha.contains("if")){comparation1 = false;}
				}
				
				if(comparation){
					booleanVars("true");
				}else{
					booleanVars("false");
				}
			}
			
			//Metodo para operacao relacional de valores "maior que"
			public static void moreOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf(">")).trim();
				val2 = valOp.substring(valOp.indexOf(">")+1, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				if(integers(val1) > integers(val2)){
					comparation = true;
					if(linha.contains("if")){comparation1 = true;}
				}else{
					comparation = false;
					if(linha.contains("if")){comparation1 = false;}
				}
				
				if(comparation){
					booleanVars("true");
				}else{
					booleanVars("false");
				}
			}
			
			//Metodo para operacao relacional de valores "Comparado com"
			public static void compareOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("==")).trim();
				val2 = valOp.substring(valOp.indexOf("==")+2, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				if(integers(val1) == integers(val2)){
					comparation = true;
					if(linha.contains("if")){comparation1 = true;}
				}else{
					comparation = false;
					if(linha.contains("if")){comparation1 = false;}
				}
				
				if(comparation){
					booleanVars("true");
				}else{
					booleanVars("false");
				}
			}
			
			//Metodo para operacao relacional de valores "Diferente de"
			public static void differentOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("!=")).trim();
				val2 = valOp.substring(valOp.indexOf("!=")+2, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				if(integers(val1) != integers(val2)){
					comparation = true;
					if(linha.contains("if")){comparation1 = true;}
				}else{
					comparation = false;
					if(linha.contains("if")){comparation1 = false;}
				}
				
				if(comparation){
					booleanVars("true");
				}else{
					booleanVars("false");
				}
			}
			
			/*Todos os Metodos para desenvolvimento
			*De variaveis plax
			*/
			
			//Metodo para entrega de valor booleano 
			//a alguma variavel Plax
			public static void booleanVars(String bool){
				
				if(variable.contains("@")){
						
						memoriaVar += variable+"{"+bool+"}"+variable+"\n";
					}
					
				
				
				typ += variable+"{"+"Boolean"+"}"+variable+"\n";
			}
			
			//Metodo para armazenar um valor de uma variavel Plax
			//dentro de uma variavel auxiliar java
			public static void armazenVars(){
				
					if(val.contains("@")){
						
						int lenVal = val.length()+1;
						vars = memoriaVar.substring(memoriaVar.indexOf(val+"{")+lenVal, memoriaVar.lastIndexOf("}"+val));
					}
					
				
			}
			
			//Metodo para identificar uma variavel Plax como 
			//valor FIXO de outra variavel Plax
			public static void fixValue(){
				
					if(fix.contains("@")){
							
							int lenVar = fix.length()+1;
							fix = memoriaVar.substring(memoriaVar.indexOf(fix+"{")+lenVar, memoriaVar.lastIndexOf("}"+fix));
					}
				
				
			}
			
			//Metodo para identificar variaveis Plax como
			//valor de outra variavel Plax
			public static void valueWithVars(){
				
				//Entrega de valores SEM concatenacao
				if(acres.equals("no")){
				
					if(variable.contains("@")){
						
						armazenVars();
						int lenVar = variable.length()+1;
						memoriaVar += variable+"{"+vars+"}"+variable+"\n";
					}
					
				
				}else{
					//Entrega de valores COM concatenacao
					if(acres.equals("yes")){
					
						if(variable.contains("@")){
						
							armazenVars();
							int lenVar = variable.length()+1;
							memoriaVar += variable+"{"+vars+"}"+variable+"\n";
						}
					}
				
				}
			}
			
			//Metodo para armazenamento de variaveis
			//Strings COM ou SEM formatacao
			public static void stringVars(){
				String mem = "";
			
				
				//Analise para formatacao de Strings "Cor e Tamanho"
				long startTime = System.nanoTime();
					if(val.contains("color:blue")){
					mem = val.replace("color:blue{", "<font color='blue'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:red")){
					mem = val.replace("color:red{", "<font color='red'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:green")){
					mem = val.replace("color:green{", "<font color='green'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:yellow")){
					mem = val.replace("color:yellow{", "<font color='yellow'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:white")){
					mem = val.replace("color:white{", "<font color='white'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:black")){
					mem = val.replace("color:black{", "<font color='black'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:purple")){
					mem = val.replace("color:purple{", "<font color='purple'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:gray")){
					mem = val.replace("color:gray{", "<font color='gray'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("color:orange")){
					mem = val.replace("color:orange{", "<font color='orange'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:one")){
					mem = val.replace("size:one{", "<font size='1'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:two")){
					mem = val.replace("size:two{", "<font size='2'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:three")){
					mem = val.replace("size:three{", "<font size='3'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:four")){
					mem = val.replace("size:four{", "<font size='4'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:five")){
					mem = val.replace("size:five{", "<font size='5'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:six")){
					mem = val.replace("size:six{", "<font size='6'>").replace("}", "</font>");
					format = true;
				}else{
				if(val.contains("size:seven")){
					mem = val.replace("size:seven{", "<font size='7'>").replace("}", "</font>");
					format = true;
				}else{
					format = false;
				}}}}}}}}}}}}}}}}
			
				
					if(variable.contains("@")){
						int lenVar = variable.length()+1;
						memoriaVar = (format) ? memoriaVar.replace(variable+"{"+mem+"}"+variable+"\n", variable+"{"+mem+"}"+variable+"\n") : memoriaVar.replace(variable+"{"+val+"}"+variable+"\n", variable+"{"+val+"}"+variable+"\n");
					
					}
				
				
				
				long endTime = System.nanoTime();
				long finalTime = endTime - startTime;
				
				
						if(escopeBoolean){ memoryEscope += "the Static Variable '"+variable+"' receive String value '"+val+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
					
				
				
			}
			//Metodo para armazenamento auxiliar de
			//Inteiros Plax em Inteiros Java
			public static void integersVars(){
				long startTime = System.nanoTime();
				
					if(variable.contains("@")){
						
						if(memoriaVar.contains(variable+"{"+integers(val)+"}"+variable)){
							memoriaVar = memoriaVar.replace(variable+"{"+integers(val)+"}"+variable+"\n", variable+"{"+integers(val)+"}"+variable+"\n");
						}else{
							memoriaVar += variable+"{"+integers(val)+"}"+variable+"\n";
						}
						
					}
				
				
				long endTime = System.nanoTime();
				long finalTime = endTime - startTime;
				
					if(escopeBoolean){ memoryEscope += "the Dynamic Variable '"+variable+"' receive the Int value '"+integers(val)+"'<br>"; initEscope.escopePane.setText(memoryEscope);}

			}
			
			//Metodo para identificar uma PRIMEIRA variavel
			//para manipulacao em alguma funcao Plax
			public static void firstValueVar(){
				
						if(val1.contains("@")){
							int lenVar = val1.length()+1;
							val1 = memoriaVar.substring(memoriaVar.indexOf(val1+"{")+lenVar, memoriaVar.lastIndexOf("}"+val1));
						}
						
					
			}
			
			//Metodo para identificar uma SEGUNDA variavel
			//para manipulacao em alguma funcao Plax
			public static void secondValueVar(){

						if(val2.contains("@")){
							int lenVar = val2.length()+1;
							val2 = memoriaVar.substring(memoriaVar.indexOf(val2+"{")+lenVar, memoriaVar.lastIndexOf("}"+val2));
						}
						
					
				
			}
			
			/*Metodos de operacoes aritmeticas
			*em variaveis
			*/
			
			//Metodo para armazenar resultados de ADICAO
			//entre dois valores em alguma variavel Plax
			public static void addictionVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("+")).trim();
				val2 = valOp.substring(valOp.indexOf("+")+1, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				
						if(variable.contains("@")){
					
							int lenVar = val1.length()+1;
							int adic = integers(val1)+integers(val2);
							memoriaVar += variable+"{"+adic+"}"+variable+"\n";
						}
						
					
					
					
						if(escopeBoolean){ memoryEscope += "the Static Variable '"+variable+"' receive the adiction of int '"+val1+"' + int '"+val2+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
					
					
				
			}
			
			//Metodo para armazenar resultados de SUBTRACAO
			//entre dois valores em uma variavel Plax
			public static void subtractionVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("-")).trim();
				val2 = valOp.substring(valOp.indexOf("-")+1, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				
						if(variable.contains("@")){
							
							int lenVar = val1.length()+1;
							int sub = integers(val1)-integers(val2);
							memoriaVar += variable+"{"+sub+"}"+variable+"\n";
						}
						
					
					
						if(escopeBoolean){ memoryEscope += "the Static Variable '"+variable+"' receive the subtraction of int '"+val1+"' - int '"+val2+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
					
			}
			
			//Metodo para armazenar resultados de MULTIPLICAO
			//entre dois valores em variaveis Plax
			public static void multiVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("*")).trim();
				val2 = valOp.substring(valOp.indexOf("*")+1, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
				
						if(variable.contains("@")){
						
							int lenVar = val1.length()+1;
							int multi = integers(val1)*integers(val2);
							memoriaVar += variable+"{"+multi+"}"+variable+"\n";
						}
					
						if(escopeBoolean){ memoryEscope += "the Static Variable '"+variable+"' receive the multiplication of int '"+val1+"' * int '"+val2+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
					
			}
			
			//Metodo para armazenar resultados de DIVISOES
			//entre dois valores em variaveis Plax
			public static void divisionVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("/")).trim();
				val2 = valOp.substring(valOp.indexOf("/")+1, valOp.lastIndexOf("]")).trim();
				
				firstValueVar();
				secondValueVar();
				
						if(variable.contains("@")){
							
							int lenVar = val1.length()+1;
							int div = integers(val1)/integers(val2);
							memoriaVar += variable+"{"+div+"}"+variable+"\n";
						}
					
						if(escopeBoolean){ memoryEscope += "the Static Variable '"+variable+"' receive the division of int '"+val1+"' / int '"+val2+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
					
			}
			
			//Metodo para guardar numa memoria
			//um conjunto de variaveis Plax
			//para exibicao de Strings
			public static void sisVariables(){
				//Variaveis @a0 - @a9
				
				String varSis = "";
				int lenVar = 0;
				
					if(linha.contains("@")){
						
						varSis = linha.substring(linha.indexOf("(")+1, linha.lastIndexOf(")"));
					
						lenVar = varSis.length()+1;
						
						memoria += memoriaVar.substring(memoriaVar.indexOf(varSis+'{'), memoriaVar.lastIndexOf('}'+varSis)).trim();
					}
					
				
				
				
				String br = (textSis1.equals("") && textSis2.equals("")) ? "<br>" : " ";	
				
					if(escopeBoolean){
					varSis = linha.substring(linha.indexOf("(")+1, linha.lastIndexOf(")"));
					lenVar = varSis.length()+1;
					String valueMemoryVar = memoriaVar.substring(memoriaVar.indexOf(varSis+"{")+lenVar, memoriaVar.lastIndexOf("}"+varSis));
					memoryEscope += "value '"+valueMemoryVar+"' of Dynamic Variable '"+varSis+"'"+"<br>";
					}
				
			}
			
			//Metodo para guardar um valor de entrada
			//em alguma variavel Plax
			public static void inputVar(){
				
				
					if(input.contains("@")){
				
						memoriaVar += input+"{"+textField.getText()+"}"+input+"\n";
					}
					
				
				
			
					if(escopeBoolean){ memoryEscope += "the Dynamic Variable '"+input+"' in input receive String value '"+textField.getText()+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
				
			}
			
			//Metodo para Concatenar Operacoes aritmeticas/relacionais
			//com Strings em funcao de Exibicao
			public static void stringWithOp(String operation){
				
				
				if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("<") || operation.equals(">") || operation.equals("==") || operation.equals("!=")){
					firstValueVar();
					secondValueVar();
					
					if(linha.substring(linha.indexOf("[")+1).equals("[") && linha.substring(linha.lastIndexOf("].")).equals("]")){
						textSis1 = "";
						textSis2 = "";
					}
					
					if(!linha.substring(linha.indexOf("[")+1).equals("[") & linha.substring(linha.lastIndexOf("].")+1).equals("]")){
						textSis1 = linha.substring(linha.indexOf("[")+1, linha.lastIndexOf("["));
						textSis2 = "";
					}
					if(!linha.substring(linha.lastIndexOf("].")+1).equals("]") & linha.substring(linha.indexOf("[")+1).equals("[")){
						textSis2 = linha.substring(linha.indexOf("]")+1, linha.lastIndexOf("]."));
						textSis1 = "";
					}
					
					if(!linha.substring(linha.lastIndexOf("].")+1).equals("]") & !linha.substring(linha.indexOf("[")+1).equals("[")){
						textSis1 = linha.substring(linha.indexOf("[")+1, linha.lastIndexOf("["));
						textSis2 = linha.substring(linha.indexOf("]")+1, linha.lastIndexOf("]."));
				
					}
				}else{
					textSis1 = "";
					textSis2 = "";
					if(linha.contains("@")){
						if(linha.substring(linha.indexOf("[")+1).equals("(") && linha.substring(linha.lastIndexOf("].")).equals(")")){
							textSis1 = "";
							textSis2 = "";
						}
						
						if(!linha.substring(linha.indexOf("[")+1).equals("(") & linha.substring(linha.lastIndexOf("].")+1).equals(")")){
							textSis1 = linha.substring(linha.indexOf("[")+1, linha.lastIndexOf("("));
							textSis2 = "";
						}
						if(!linha.substring(linha.lastIndexOf("].")+1).equals(")") & linha.substring(linha.indexOf("[")+1).equals("(")){
							textSis2 = linha.substring(linha.indexOf(")")+1, linha.lastIndexOf("]."));
							textSis1 = "";
						}
						
						if(!linha.substring(linha.lastIndexOf("].")+1).equals(")") & !linha.substring(linha.indexOf("[")+1).equals("(")){
							textSis1 = linha.substring(linha.indexOf("[")+1, linha.lastIndexOf("("));
							textSis2 = linha.substring(linha.indexOf(")")+1, linha.lastIndexOf("]."));
					
						}
						
						
						
					}
					
					
				}
				
				if(operation.equals("sisVariables")){
					if(!textSis1.equals("") & textSis2.equals("")){
						if(escopeBoolean){ memoryEscope += "Print String '"+textSis1+"' with the ";}
									
						memoria += textSis1;
						sisVariables();
						
					}
					if(!textSis2.equals("") & textSis1.equals("")){
						if(escopeBoolean){ memoryEscope += "Print the "; }
						sisVariables();
						memoria += textSis2;
						if(escopeBoolean){ memoryEscope += "with the String '"+textSis2+"'<br>"; }
					}
					if(!textSis1.equals("") & !textSis2.equals("")){
						if(escopeBoolean){ memoryEscope += "Print String '"+textSis1+"' with the ";}
						memoria += textSis1;
						sisVariables();
						memoria += textSis2;
						if(escopeBoolean){ memoryEscope += "with the String '"+textSis2+"'<br>"; }
					}
					if(textSis1.equals("") & textSis2.equals("")){
						if(escopeBoolean){ memoryEscope += "Print the "; }
						sisVariables();
					}
				}
				
				
				if(operation.equals("+")){
					if(!textSis1.equals("") & textSis2.equals("")){
						if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the addiction of int '"+integers(val1)+"' + int '"+integers(val2)+"'<br>"; }
						memoria += textSis1;
						
						integerOperation = integers(val1)+integers(val2);
						memoria += integerOperation;
						integerOperation = 0;
						
					}
					
					if(!textSis2.equals("") & textSis1.equals("")){
						integerOperation = integers(val1)+integers(val2);
						memoria += integerOperation;
						integerOperation = 0;
						
						memoria += textSis2;
						if(escopeBoolean){ memoryEscope += "Print the addiction of int '"+integers(val1)+"' + int '"+integers(val2)+"' with the String '"+textSis2+"'<br>"; }
					}
					
					if(!textSis1.equals("") & !textSis2.equals("")){
						memoria += textSis1;
						
						integerOperation = integers(val1)+integers(val2);
						memoria += integerOperation;
						integerOperation = 0;
						
						memoria += textSis2;
						if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the addiction of int '"+integers(val1)+"' + int '"+integers(val2)+"' with the String '"+textSis2+"'<br>"; }
						
					}
					
					if(textSis1.equals("") & textSis2.equals("")){
					
						integerOperation = integers(val1)+integers(val2);
						memoria += integerOperation;
						integerOperation = 0;
						
						if(escopeBoolean){ memoryEscope += "Print the addiction of int '"+integers(val1)+"' + int '"+integers(val2)+"'<br>"; }
						
					}
				}else
					if(operation.equals("-")){
						if(!textSis1.equals("") & textSis2.equals("")){
							
							memoria += textSis1;
							
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
							if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the subtraction of int '"+integers(val1)+"' - int '"+integers(val2)+"'<br>"; }
						}
						
						if(!textSis2.equals("") & textSis1.equals("")){
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
							memoria += textSis2;
							
							if(escopeBoolean){ memoryEscope += "Print the subtraction of int '"+integers(val1)+"' - int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
						}
						
						if(!textSis1.equals("") & !textSis2.equals("")){
							memoria += textSis1;
							
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
							memoria += textSis2;
							
							if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the subtraction of int '"+integers(val1)+"' - int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
						}
						
						if(textSis1.equals("") & textSis2.equals("")){
							
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
							if(escopeBoolean){ memoryEscope += "Print the subtraction of int '"+integers(val1)+"' - int '"+integers(val2)+"'<br>"; }
						}
					}else
						if(operation.equals("*")){
							if(!textSis1.equals("") & textSis2.equals("")){
								
								memoria += textSis1;
								
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
								if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the multiplication of int '"+integers(val1)+"' * int '"+integers(val2)+"'<br>"; }
								
							}
							
							if(!textSis2.equals("") & textSis1.equals("")){
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
								memoria += textSis2;
								
								if(escopeBoolean){ memoryEscope += "Print the multiplication of int '"+integers(val1)+"' * int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
							}
							
							if(!textSis1.equals("") & !textSis2.equals("")){
								memoria += textSis1;
								
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
								memoria += textSis2;
								
								if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the multiplication of int '"+integers(val1)+"' * int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
								
							}
							
							if(textSis1.equals("") & textSis2.equals("")){
								
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
								if(escopeBoolean){ memoryEscope += "Print the multiplication of int '"+integers(val1)+"' * int '"+integers(val2)+"'<br>"; }
							}
						}else
							if(operation.equals("/")){
								if(!textSis1.equals("") & textSis2.equals("")){
									
									memoria += textSis1;
									
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
									if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the division of int '"+integers(val1)+"' / int '"+integers(val2)+"'<br>"; }
									
								}
								
								if(!textSis2.equals("") & textSis1.equals("")){
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
									memoria += textSis2;
									
									if(escopeBoolean){ memoryEscope += "Print the division of int '"+integers(val1)+"' / int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
								}
								
								if(!textSis1.equals("") & !textSis2.equals("")){
									memoria += textSis1;
									
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
									memoria += textSis2;
									
									if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the division of int '"+integers(val1)+"' / int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
									
								}
								
								if(textSis1.equals("") & textSis2.equals("")){
									
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
									if(escopeBoolean){ memoryEscope += "Print the division of int '"+integers(val1)+"' / int '"+integers(val2)+"'<br>"; }
								}
							}else
								if(operation.equals("<")){
									
									if(!textSis1.equals("") & textSis2.equals("")){
										
										memoria += textSis1;
										
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
										if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the Logic operation of int '"+integers(val1)+"' < int '"+integers(val2)+"'<br>"; }
									}
									
									if(!textSis2.equals("") & textSis1.equals("")){
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
										memoria += textSis2;
										if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' < int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
									}
									
									if(!textSis1.equals("") & !textSis2.equals("")){
										memoria += textSis1;
										
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
										memoria += textSis2;
										
										if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the logic operation of int '"+integers(val1)+"' < int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
										
									}
									
									if(textSis1.equals("") & textSis2.equals("")){
										
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
										if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' < int '"+integers(val2)+"'<br>"; }
									}
									
									
									
								}else
									if(operation.equals(">")){
										if(!textSis1.equals("") & textSis2.equals("")){
											
											memoria += textSis1;
											
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
											if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with the logic operation of int '"+integers(val1)+"' > int '"+integers(val2)+"'<br>"; }
											
										}
										
										if(!textSis2.equals("") & textSis1.equals("")){
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
											memoria += textSis2;
											if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' > int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
										}
										
										if(!textSis1.equals("") & !textSis2.equals("")){
											memoria += textSis1;
											
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
											memoria += textSis2;
											
											if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with logic operation of int '"+integers(val1)+"' > int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
											
										}
										
										if(textSis1.equals("") & textSis2.equals("")){
											
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
											if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' > int '"+integers(val2)+"'<br>"; }
											
										}
									}else
										if(operation.equals("==")){
											if(!textSis1.equals("") & textSis2.equals("")){
												
												memoria += textSis1;
												
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with logic operation of int '"+integers(val1)+"' == int '"+integers(val2)+"'<br>"; }
												
											}
											
											if(!textSis2.equals("") & textSis1.equals("")){
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
												memoria += textSis2;
												if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' == int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
											}
											
											if(!textSis1.equals("") & !textSis2.equals("")){
												memoria += textSis1;
												
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
												memoria += textSis2;
												
												if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with logic operation of int '"+integers(val1)+"' == int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
												
											}
											
											if(textSis1.equals("") & textSis2.equals("")){
												
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
												if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' == int '"+integers(val2)+"'<br>"; }
												
											}
										}else
											if(operation.equals("!=")){
												if(!textSis1.equals("") & textSis2.equals("")){
													
													memoria += textSis1;
													
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
													if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with logic operation of int '"+integers(val1)+"' != int '"+integers(val2)+"'<br>"; }
												}
												
												if(!textSis2.equals("") & textSis1.equals("")){
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
													memoria += textSis2;
													if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' != int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
												}
												
												if(!textSis1.equals("") & !textSis2.equals("")){
													memoria += textSis1;
													
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
													memoria += textSis2;
													if(escopeBoolean){ memoryEscope += "Print the String '"+textSis1+"' with logic operation of int '"+integers(val1)+"' != int '"+integers(val2)+"'"+" with the String '"+textSis2+"'<br>"; }
													
												}
												
												if(textSis1.equals("") & textSis2.equals("")){
													
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
													if(escopeBoolean){ memoryEscope += "Print the logic operation of int '"+integers(val1)+"' != int '"+integers(val2)+"'<br>"; }
													
												}
											}
				
			}
			
			//Metodo que analisa a PRIMEIRA variavel na condicao IF
			public static void firstIfVar(){
				
					if(if1.contains("@")){
						int lenCond = if1.length()+1;
						System.out.println(if1);
						if1 = memoriaVar.substring(memoriaVar.indexOf(if1+"{"), memoriaVar.lastIndexOf("}"+if1));
						System.out.println(if1);
					}
				
			}
			
			//Metodo que analisa a SEGUNDA variavel na condicao IF
			public static void secondIfVar(){
				
					if(if2.contains("@")){
						int lenCond = if2.length()+1;
						if2 = memoriaVar.substring(memoriaVar.indexOf(if2+"{")+lenCond, memoriaVar.lastIndexOf("}"+if2));
					}
				
			
			}
			
			//Metodo que analisa a TERCEIRA variavel na condicao IF
			public static void thirtyIfVar(){
				
					if(if3.contains("@")){
						int lenCond = if3.length()+1;
						if3 = memoriaVar.substring(memoriaVar.indexOf(if3+"{")+lenCond, memoriaVar.lastIndexOf("}"+if3));
					}
				
			
			}
			
			//Metodo que analisa a QUARTA variavel na condicao IF
			public static void fourtyIfVar(){
				
				
					if(if4.contains("@")){
						int lenCond = if4.length()+1;
						if4 = memoriaVar.substring(memoriaVar.indexOf(if4+"{")+lenCond, memoriaVar.lastIndexOf("}"+if4));
					}
				
		
			}
			
			//Metodo para armazenar argumentos de SUBROTINAS em variaveis Plax
			public static void argFuncVars(){
				
					if(variable.contains("@")){
						
						memoriaVar += variable+"{"+argLine+"}"+variable+"\n";
					}
				
					if(escopeBoolean){ memoryEscope += "the Dynamic Variable '"+variable+"' as argument of function receive String value '"+argLine+"'<br>"; initEscope.escopePane.setText(memoryEscope);}
				
			}	
			
			//Construtor da Classe LangPlax
	public LangPlax() throws IOException{}
	
	//Metodo de Leitura das linhas e Interpretacao da Linguagem Plax
	public static void langPlax(String lang) throws IOException{
	
		frame = new JFrame();
	
		try {
			
			scanFilePlax(paths);
			    
		if ((linha.contains("#output") || linha.contains("#escope") || linha.contains("#compile")) & memoriaBase.contains("#output") & memoriaBase.contains("*Var") & memoriaBase.contains("$EndVar") & memoriaBase.contains("Start") & memoriaBase.contains("Final") & memoriaBase.contains("%")){//verifica se come?pela Palavra e n?
			
			//Parametro de configuracao #Escope para criar um Escopo
			//Do algoritmo Plax com um tempo definido
			if(linha.contains("#escope")){
				String escope = linha.substring(linha.indexOf(":")+1, linha.lastIndexOf(".")).trim();
				String escope1 = escope.substring(escope.indexOf("[")+1, escope.lastIndexOf("]")).trim();
				
				if(escope1.equals("null")){
					escopeNull = null;
				}else{
					escopeNull = "";
					escopeTime = integers(escope1);
				}
				
				escopeBoolean = true;
				linha = lerArq.readLine();
				
				initEscope = new Escope();
				initEscope.setVisible(true);
				
				memoryEscope += "<font color='green'>";
				
			}
				
			consoleVisibility(lang);
			boolean Switch = false;
			boolean Case = true;
			//Iteracao de leitura Linha Por Linha
			while (linha != null) {
				
				if(whenBoolean == false){
				
				if(linha.contains("switch[") || Switch == true || Switch == false){
					String switchs = "";
					if(!Switch){
						if(linha.contains("switch[")){
							switchs = linha.substring(linha.indexOf("switch[")+7, linha.lastIndexOf("]")).trim();
							if1 = switchs;
							firstIfVar();
						}
						
						if(linha.contains("case[")){
							String cases = linha.substring(linha.indexOf("case[")+5, linha.lastIndexOf("] =>")).trim();
							if(cases.equals(if1)){
								Switch = true;
								Case = true;
							}else{
								Switch = false;
								linha = lerArq.readLine();
								while(!linha.contains("case[")){
									linha = lerArq.readLine();
								}
								Case = false;
							}
						}
					}else{
						if(linha.contains("case[")){
							while(!linha.contains("endSwitch")){
								linha = lerArq.readLine();
							}
							if(linha.contains("endSwitch")){
								Switch = false;
								Case = true;
							}
						}
					}
					
				}
			
				
				//Execucao da estrutura WHEN em Plax
				if(linha.contains("when[")){
					String when = linha.substring(linha.indexOf("when[")+4, linha.lastIndexOf("]")+1);
					
							
					if(when.contains("<")){
						val1 = when.substring(when.indexOf("[")+1, when.lastIndexOf("<")).trim();
						val2 = when.substring(when.indexOf("<")+1, when.lastIndexOf("]")).trim();
						
						firstValueVar();
						secondValueVar();
						
								if(val1.contains("getTime[") && !val1.contains("getTime[]")){
									String paramTime = val1.substring(val1.indexOf("getTime[")+8, val1.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val1 = addTime+"";
									firstValue = true;
								}else{
										if(val1.contains("getTime[]")){
											val1 = System.currentTimeMillis()+"";
											firstValue = false;
										}
								}
								
								if(val2.contains("getTime[") && !val2.contains("getTime[]")){
									String paramTime = val2.substring(val2.indexOf("getTime[")+8, val2.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val2 = addTime+"";
									secondValue = true;
								}else{
										if(val2.contains("getTime[]")){
											val2 = System.currentTimeMillis()+"";
											secondValue = false;
										}
								}
								
								if(integers(val1) < integers(val2)){
											whenBoolean = true;
										}else{
											whenBoolean = false;
											while(!linha.contains("endWhen")){
												try {
													linha = lerArq.readLine();
												} catch (IOException e3) {
													// TODO Auto-generated catch block
													e3.printStackTrace();
												}
												
											}
										}
								
								
								new Thread(new Runnable(){
									@Override
									public void run(){
										
										while(!whenBoolean){
											if(firstValue){val1 = System.currentTimeMillis()+"";}
											if(secondValue){val2 = System.currentTimeMillis()+"";}
											if(integers(val1) < integers(val2)){whenBoolean = true;}
											
										}
										Scanner scans;
										try {
											scans = new Scanner(new File(paths));
											linha = scans.nextLine();
											while(!linha.contains("when[")){
												linha = scans.nextLine();
											
											}
											while(!linha.contains("endWhen")){
												try {
													LineAnalysis();
												} catch (IOException e2) {
										
													e2.printStackTrace();
												}
											
												linha = scans.nextLine();
											}
										
											whenBoolean = false;
										} catch (FileNotFoundException e) {
										
											e.printStackTrace();
										}
										
									}
								}).start();
							
	
					}
					
					if(when.contains(">")){
						val1 = when.substring(when.indexOf("[")+1, when.lastIndexOf(">")).trim();
						val2 = when.substring(when.indexOf(">")+1, when.lastIndexOf("]")).trim();
						
						firstValueVar();
						secondValueVar();
					
								if(val1.contains("getTime[") && !val1.contains("getTime[]")){
									String paramTime = val1.substring(val1.indexOf("getTime[")+8, val1.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val1 = addTime+"";
									firstValue = true;
								}else{
										if(val1.contains("getTime[]")){
											val1 = System.currentTimeMillis()+"";
											firstValue = false;
										}
								}
								
								if(val2.contains("getTime[") && !val2.contains("getTime[]")){
									String paramTime = val2.substring(val2.indexOf("getTime[")+8, val2.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val2 = addTime+"";
									secondValue = true;
								}else{
										if(val2.contains("getTime[]")){
											val2 = System.currentTimeMillis()+"";
											secondValue = false;
										}
								}
								
								if(integers(val1) > integers(val2)){
											whenBoolean = true;
										}else{
											whenBoolean = false;
											while(!linha.contains("endWhen")){
												try {
													linha = lerArq.readLine();
												} catch (IOException e3) {
													// TODO Auto-generated catch block
													e3.printStackTrace();
												}
												
											}
										}
								
								
								new Thread(new Runnable(){
									@Override
									public void run(){
										
										while(!whenBoolean){
											if(firstValue){val1 = System.currentTimeMillis()+"";}
											if(secondValue){val2 = System.currentTimeMillis()+"";}
											if(integers(val1) > integers(val2)){whenBoolean = true;}
											
										}
										Scanner scans;
										try {
											scans = new Scanner(new File(paths));
											linha = scans.nextLine();
											while(!linha.contains("when[")){
												linha = scans.nextLine();
											
											}
											while(!linha.contains("endWhen")){
												try {
													LineAnalysis();
												} catch (IOException e2) {
										
													e2.printStackTrace();
												}
											
												linha = scans.nextLine();
											}
										
											whenBoolean = false;
										} catch (FileNotFoundException e) {
										
											e.printStackTrace();
										}
										
									}
								}).start();
							
					}
					if(when.contains("<=")){
						val1 = when.substring(when.indexOf("[")+1, when.lastIndexOf("<=")).trim();
						val2 = when.substring(when.indexOf("<=")+2, when.lastIndexOf("]")).trim();
						
						firstValueVar();
						secondValueVar();
						
								if(val1.contains("getTime[") && !val1.contains("getTime[]")){
									String paramTime = val1.substring(val1.indexOf("getTime[")+8, val1.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val1 = addTime+"";
									firstValue = true;
								}else{
										if(val1.contains("getTime[]")){
											val1 = System.currentTimeMillis()+"";
											firstValue = false;
										}
								}
								
								if(val2.contains("getTime[") && !val2.contains("getTime[]")){
									String paramTime = val2.substring(val2.indexOf("getTime[")+8, val2.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val2 = addTime+"";
									secondValue = true;
								}else{
										if(val2.contains("getTime[]")){
											val2 = System.currentTimeMillis()+"";
											secondValue = false;
										}
								}
								
								if(integers(val1) <= integers(val2)){
											whenBoolean = true;
										}else{
											whenBoolean = false;
											while(!linha.contains("endWhen")){
												try {
													linha = lerArq.readLine();
												} catch (IOException e3) {
													// TODO Auto-generated catch block
													e3.printStackTrace();
												}
												
											}
										}
								
								
								new Thread(new Runnable(){
									@Override
									public void run(){
										
										while(!whenBoolean){
											if(firstValue){val1 = System.currentTimeMillis()+"";}
											if(secondValue){val2 = System.currentTimeMillis()+"";}
											if(integers(val1) <= integers(val2)){whenBoolean = true;}
											
										}
										Scanner scans;
										try {
											scans = new Scanner(new File(paths));
											linha = scans.nextLine();
											while(!linha.contains("when[")){
												linha = scans.nextLine();
											
											}
											while(!linha.contains("endWhen")){
												try {
													LineAnalysis();
												} catch (IOException e2) {
										
													e2.printStackTrace();
												}
											
												linha = scans.nextLine();
											}
										
											whenBoolean = false;
										} catch (FileNotFoundException e) {
										
											e.printStackTrace();
										}
										
									}
								}).start();
							
					}
					if(when.contains(">=")){
						val1 = when.substring(when.indexOf("[")+1, when.lastIndexOf(">=")).trim();
						val2 = when.substring(when.indexOf(">=")+2, when.lastIndexOf("]")).trim();
						
						firstValueVar();
						secondValueVar();
						
								if(val1.contains("getTime[") && !val1.contains("getTime[]")){
									String paramTime = val1.substring(val1.indexOf("getTime[")+8, val1.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val1 = addTime+"";
									firstValue = true;
								}else{
										if(val1.contains("getTime[]")){
											val1 = System.currentTimeMillis()+"";
											firstValue = false;
										}
								}
								
								if(val2.contains("getTime[") && !val2.contains("getTime[]")){
									String paramTime = val2.substring(val2.indexOf("getTime[")+8, val2.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val2 = addTime+"";
									secondValue = true;
								}else{
										if(val2.contains("getTime[]")){
											val2 = System.currentTimeMillis()+"";
											secondValue = false;
										}
								}
								
								if(integers(val1) >= integers(val2)){
											whenBoolean = true;
										}else{
											whenBoolean = false;
											while(!linha.contains("endWhen")){
												try {
													linha = lerArq.readLine();
												} catch (IOException e3) {
													// TODO Auto-generated catch block
													e3.printStackTrace();
												}
												
											}
										}
								
								
								new Thread(new Runnable(){
									@Override
									public void run(){
										
										while(!whenBoolean){
											if(firstValue){val1 = System.currentTimeMillis()+"";}
											if(secondValue){val2 = System.currentTimeMillis()+"";}
											if(integers(val1) >= integers(val2)){whenBoolean = true;}
											
										}
										Scanner scans;
										try {
											scans = new Scanner(new File(paths));
											linha = scans.nextLine();
											while(!linha.contains("when[")){
												linha = scans.nextLine();
											
											}
											while(!linha.contains("endWhen")){
												try {
													LineAnalysis();
												} catch (IOException e2) {
										
													e2.printStackTrace();
												}
											
												linha = scans.nextLine();
											}
										
											whenBoolean = false;
										} catch (FileNotFoundException e) {
										
											e.printStackTrace();
										}
										
									}
								}).start();
							
					}
					if(when.contains("==")){
						val1 = when.substring(when.indexOf("[")+1, when.lastIndexOf("==")).trim();
						val2 = when.substring(when.indexOf("==")+2, when.lastIndexOf("]")).trim();
						
						firstValueVar();
						secondValueVar();
						
								if(val1.contains("getTime[") && !val1.contains("getTime[]")){
									String paramTime = val1.substring(val1.indexOf("getTime[")+8, val1.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val1 = addTime+"";
									firstValue = true;
								}else{
										if(val1.contains("getTime[]")){
											val1 = System.currentTimeMillis()+"";
											firstValue = false;
										}
								}
								
								if(val2.contains("getTime[") && !val2.contains("getTime[]")){
									String paramTime = val2.substring(val2.indexOf("getTime[")+8, val2.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val2 = addTime+"";
									secondValue = true;
								}else{
										if(val2.contains("getTime[]")){
											val2 = System.currentTimeMillis()+"";
											secondValue = false;
										}
								}
								
								if(integers(val1) == integers(val2)){
											whenBoolean = true;
										}else{
											whenBoolean = false;
											while(!linha.contains("endWhen")){
												try {
													linha = lerArq.readLine();
												} catch (IOException e3) {
													// TODO Auto-generated catch block
													e3.printStackTrace();
												}
												
											}
										}
								
								
								new Thread(new Runnable(){
									@Override
									public void run(){
										
										while(!whenBoolean){
											if(firstValue){val1 = System.currentTimeMillis()+"";}
											if(secondValue){val2 = System.currentTimeMillis()+"";}
											if(integers(val1) == integers(val2)){whenBoolean = true;}
											
										}
										Scanner scans;
										try {
											scans = new Scanner(new File(paths));
											linha = scans.nextLine();
											while(!linha.contains("when[")){
												linha = scans.nextLine();
											
											}
											while(!linha.contains("endWhen")){
												try {
													LineAnalysis();
												} catch (IOException e2) {
										
													e2.printStackTrace();
												}
											
												linha = scans.nextLine();
											}
										
											whenBoolean = false;
										} catch (FileNotFoundException e) {
										
											e.printStackTrace();
										}
										
									}
								}).start();
								
					}
					if(when.contains("!=")){
						val1 = when.substring(when.indexOf("[")+1, when.lastIndexOf("!=")).trim();
						val2 = when.substring(when.indexOf("!=")+2, when.lastIndexOf("]")).trim();
						
						firstValueVar();
						secondValueVar();
						
								if(val1.contains("getTime[") && !val1.contains("getTime[]")){
									String paramTime = val1.substring(val1.indexOf("getTime[")+8, val1.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val1 = addTime+"";
									firstValue = true;
								}else{
										if(val1.contains("getTime[]")){
											val1 = System.currentTimeMillis()+"";
											firstValue = false;
										}
								}
								
								if(val2.contains("getTime[") && !val2.contains("getTime[]")){
									String paramTime = val2.substring(val2.indexOf("getTime[")+8, val2.lastIndexOf("]")).trim();
									long addTime = System.currentTimeMillis()+integers(paramTime);
									val2 = addTime+"";
									secondValue = true;
								}else{
										if(val2.contains("getTime[]")){
											val2 = System.currentTimeMillis()+"";
											secondValue = false;
										}
								}
								
								if(integers(val1) != integers(val2)){
											whenBoolean = true;
										}else{
											whenBoolean = false;
											while(!linha.contains("endWhen")){
												try {
													linha = lerArq.readLine();
												} catch (IOException e3) {
													// TODO Auto-generated catch block
													e3.printStackTrace();
												}
												
											}
										}
								
								
								new Thread(new Runnable(){
									@Override
									public void run(){
										
										while(!whenBoolean){
											if(firstValue){val1 = System.currentTimeMillis()+"";}
											if(secondValue){val2 = System.currentTimeMillis()+"";}
											if(integers(val1) != integers(val2)){whenBoolean = true;}
											
										}
										Scanner scans;
										try {
											scans = new Scanner(new File(paths));
											linha = scans.nextLine();
											while(!linha.contains("when[")){
												linha = scans.nextLine();
											
											}
											while(!linha.contains("endWhen")){
												try {
													LineAnalysis();
												} catch (IOException e2) {
										
													e2.printStackTrace();
												}
											
												linha = scans.nextLine();
											}
										
											whenBoolean = false;
										} catch (FileNotFoundException e) {
										
											e.printStackTrace();
										}
										
									}
								}).start();
							
					}
		
				}
				
				//Analise do Parametro de configuracao #Dynamic
				if(linha.contains("#dynamic")){
					dynBoolean = true;
					String dynPath1 = linha.substring(linha.indexOf(":"), linha.lastIndexOf(".")).trim();
					String paramDynamic = dynPath1.substring(dynPath1.indexOf(":")+1, dynPath1.lastIndexOf("=>")).trim();
					String dynPath2 = dynPath1.substring(dynPath1.indexOf("'")+1, dynPath1.lastIndexOf("'"));
					dynPath += "$"+paramDynamic+"{"+dynPath2+"}"+"$"+paramDynamic+"\n";
				}
				
				//Execucao da estrutura DYNAMIC em Plax
				if(dynBoolean){
					if(linha.contains("dynamic[")){
						String dynamic = linha.substring(linha.indexOf("dynamic[")+7, linha.lastIndexOf("].")+1).trim();
						String getDynPath = "";
						String extensionCapture = "";
						if(dynamic.contains("effect")){
							 widthDynImage = 0;
							 heightDynImage = 0;
							effect = dynamic.substring(dynamic.indexOf(":")+1, dynamic.lastIndexOf("]")+1).trim();
							//Efeito de Pintura
							if(effect.contains("paint[")){
								String subParamDyn = "$"+dynamic.substring(dynamic.indexOf("[")+1, dynamic.lastIndexOf("=>")).trim();
								int lenParamDyn = subParamDyn.length() + 1;
								getDynPath = dynPath.substring(dynPath.indexOf(subParamDyn+"{")+lenParamDyn, dynPath.lastIndexOf("}"+subParamDyn));
								booleanEffect = true;
								labelPaint = new JLabel[20000];
								funcPaint = effect.substring(effect.indexOf("paint[")+6, effect.lastIndexOf("]")+1).trim();
								colorPaint = funcPaint.substring(funcPaint.indexOf("'")+1, funcPaint.lastIndexOf("'"));
								sizePaint = funcPaint.substring(funcPaint.indexOf(",")+1, funcPaint.lastIndexOf("]")).trim();
								
							}else
								//Efeito de captura de imagens
							if(effect.contains("capture[")){
								String subParamDyn = "$"+dynamic.substring(dynamic.indexOf("[")+1, dynamic.lastIndexOf("=>")).trim();
								int lenParamDyn = subParamDyn.length() + 1;
								getDynPath = dynPath.substring(dynPath.indexOf(subParamDyn+"{")+lenParamDyn, dynPath.lastIndexOf("}"+subParamDyn));
								booleanCapture = true;
								String effectCapture1 = effect.substring(effect.indexOf("capture[")+8, effect.lastIndexOf("]")).trim();
								extensionCapture = effectCapture1.substring(effectCapture1.indexOf(",")+1, effectCapture1.lastIndexOf("]")).trim();
								effectCapture = effectCapture1.substring(effectCapture1.indexOf("'")+1, effectCapture1.lastIndexOf("'"));
							}
							
						}
						
						
						if(!booleanCapture) {
							dynImage = new ImageIcon(dynPath);
						}
						else{
							dynImage = new ImageIcon(getDynPath+effectCapture+"."+extensionCapture);
						}
						
					
						dynLabelFrame = new JLabel();
						dynFrame = new JFrame();
						JPanel dynPanel = new JPanel();
						dynFrame.setVisible(true);
						dynFrame.setResizable(false);
						dynFrame.setEnabled(false);
						if(!booleanCapture){
							dynFrame.setBounds(0, 0, 400, 400);
							dynPanel.setBounds(0, 0, 400, 400);
						}else{
							
							widthDynImage = dynImage.getImage().getWidth(null);
							heightDynImage = dynImage.getImage().getHeight(null);
							System.out.println("largura : "+widthDynImage);
							System.out.println("altura : "+heightDynImage);
							dynFrame.setBounds(0, 0, widthDynImage, heightDynImage);
							dynPanel.setBounds(0, 0, widthDynImage, heightDynImage);
							
						}
						
						dynFrame.add(dynPanel);
						dynPanel.add(dynLabelFrame);
						if(!booleanCapture){
							dynLabelFrame.setBounds(0, 0, 400, 400);
							dynLabelFrame.setText("<html><div style='width:"+400+"; height:"+400+";background:black;'></div></html>");
						}else{
							dynLabelFrame.setBounds(0, 0, widthDynImage, heightDynImage);
							dynLabelFrame.setText("<html><div style='width:"+widthDynImage+"; height:"+heightDynImage+";background:black;'></div></html>");
						}
		
						
						dynLabelImage = new JLabel();
						dynLabelFrame.add(dynLabelImage);
						dynLabelImage.setIcon(dynImage);
						if(!booleanCapture){
							dynLabelImage.setBounds(0, 0, 50, 50);
						}else{
							dynLabelImage.setBounds(0, 0, widthDynImage, heightDynImage);
						}
						
						booleanCapture = false;
						while(!linha.contains("endDynamic")){
							linha = lerArq.readLine();
							
							//algoritmo do goto
							if(linha.contains("goto[")){
								String gotos = linha.substring(linha.indexOf("goto[")+4, linha.lastIndexOf("].")+1);
								atualX = X;
								atualY = Y;
								
								
								atualW = dynLabelImage.getWidth();
								atualH = dynLabelImage.getHeight();
								gotoX = integers(gotos.substring(gotos.indexOf("[")+1, gotos.lastIndexOf(",")).trim());
								gotoY = integers(gotos.substring(gotos.indexOf(",")+1, gotos.lastIndexOf("]")).trim());
								movTime = 0;
								booleanTime = false;
								if(gotos.contains("=>")){
									gotoY = integers(gotos.substring(gotos.indexOf(",")+1, gotos.lastIndexOf("=>")).trim());
									movTime = integers(gotos.substring(gotos.indexOf("=>")+2, gotos.lastIndexOf("]")).trim());
									booleanTime = true;
								}
								
										X1 = 0;
										Y1 = 0;
										loopDynamic = false;
										while(loopDynamic != true){
											
											if(X1 == 0){
												new Thread(new Runnable(){
													@Override
													public void run(){
														if(gotoX > atualX){
															for(X = atualX; X <= gotoX; X++){
															numLabelPaint1 = numLabelPaint2 + 1;
															if(booleanEffect){
																labelPaint[numLabelPaint1] = new JLabel();
																dynLabelFrame.add(labelPaint[numLabelPaint1]);
																labelPaint[numLabelPaint1].setText("<html><div style='width:5;height:"+sizePaint+";background:"+colorPaint+";'></div></html>");
																labelPaint[numLabelPaint1].setBounds(X, atualY, 6, integers(sizePaint));
															}
															dynLabelImage.setBounds(X, atualY, atualW, atualH);
															atualX = X;
															if(booleanTime == true){
																try {
																Thread.sleep(movTime);
																} catch (InterruptedException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
															}
															
															}
														}else{
															if(gotoX < atualX){
																for(X = atualX; X >= gotoX; X--){
																numLabelPaint1 = numLabelPaint2 + 1;
																if(booleanEffect){
																	labelPaint[numLabelPaint1] = new JLabel();
																	dynLabelFrame.add(labelPaint[numLabelPaint1]);
																	labelPaint[numLabelPaint1].setText("<html><div style='width:5;height:"+sizePaint+";background:"+colorPaint+";'></div></html>");
																	labelPaint[numLabelPaint1].setBounds(X, atualY, 6, integers(sizePaint));
																}
																dynLabelImage.setBounds(X, atualY, atualW, atualH);
																atualX = X;
																if(booleanTime == true){
																	try {
																		Thread.sleep(movTime);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																}
															
																}
															}
														}
														
													}
												}).start();
											}
											if(Y1 == 0){
												new Thread(new Runnable(){
													@Override
													public void run(){
														if(gotoY > atualY){
																for(Y = atualY; Y <= gotoY; Y++){
																numLabelPaint2 = numLabelPaint1 + 1;
																if(booleanEffect){
																	labelPaint[numLabelPaint2] = new JLabel();
																	dynLabelFrame.add(labelPaint[numLabelPaint2]);
																	labelPaint[numLabelPaint2].setText("<html><div style='width:5;height:"+sizePaint+";background:"+colorPaint+";'></div></html>");
																	labelPaint[numLabelPaint2].setBounds(atualX, Y, 6, integers(sizePaint));
																}
																dynLabelImage.setBounds(atualX, Y, atualW, atualH);
																atualY = Y;
																if(booleanTime == true){
																	try {
																	Thread.sleep(movTime);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																}
																
																
															}
															
														}else{
															if(gotoY < atualY){
																for(Y = atualY; Y >= gotoY; Y--){
																numLabelPaint2 = numLabelPaint1 + 1;
																if(booleanEffect){
																	labelPaint[numLabelPaint2] = new JLabel();
																	dynLabelFrame.add(labelPaint[numLabelPaint2]);
																	labelPaint[numLabelPaint2].setText("<html><div style='width:"+sizePaint+";height:1;background:"+colorPaint+";'></div></html>");
																	labelPaint[numLabelPaint2].setBounds(atualX, Y, 6, integers(sizePaint));
																}
																dynLabelImage.setBounds(atualX, Y, atualW, atualH);
																atualY = Y;
																if(booleanTime == true){
																	try {
																	Thread.sleep(movTime);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																}
															
															
																}
															}
														}
														
													}
												}).start();
											}
											
											if((atualX == gotoX) && (atualY == gotoY)){loopDynamic = true;}
											X1 = X1 + 1;
											Y1 = Y1 + 1;
										}
								
								
										
								
								
								
							}
							//fim algoritmo do goto
							
							//definir cor para pintura
							if(linha.contains("paint[")){
								funcPaint = linha.substring(linha.indexOf("paint[")+6, linha.lastIndexOf("].")+1).trim();
								colorPaint = funcPaint.substring(funcPaint.indexOf("'")+1, funcPaint.lastIndexOf("'"));
								sizePaint = funcPaint.substring(funcPaint.indexOf(",")+1, funcPaint.lastIndexOf("]")).trim();
							}
							
							//salvar imagem
							if(linha.contains("pic[")){
								String pic1 = linha.substring(linha.indexOf("pic[")+4, linha.lastIndexOf("].")).trim();
								String pic = pic1.substring(pic1.indexOf("'")+1, pic1.lastIndexOf("'"));
								
								try{
									Robot robot = new Robot();
									BufferedImage bufferImg = robot.createScreenCapture(new Rectangle(8, 36, dynLabelFrame.getWidth()-20, dynLabelFrame.getHeight()-44));
									
									try{
										ImageIO.write(bufferImg, "JPEG", new File(pic));
									}catch(IOException iex){}
								}catch(AWTException e){}
								
							}
							
							if(linha.contains("loop[")){
								loop = linha.substring(linha.indexOf("loop[")+5, linha.lastIndexOf("].")).trim();
								loopBoolean = true;
							}
							//Skipar a imagem
							if(linha.contains("skip[")){
								String skip = linha.substring(linha.indexOf("skip[")+4, linha.lastIndexOf("].")+1);
								int skip1 = integers(skip.substring(skip.indexOf("[")+1, skip.lastIndexOf(",")).trim());
								int skip2 = 0;
								int skipTime = 0;
								if(skip.contains("=>")){
									skip2 = integers(skip.substring(skip.indexOf(",")+1, skip.lastIndexOf("=>")).trim());
									skipTime = integers(skip.substring(skip.indexOf("=>")+2, skip.lastIndexOf("]")).trim());
								}else{
									skip2 = integers(skip.substring(skip.indexOf(",")+1, skip.lastIndexOf("]")).trim());
								}
								
								if(skip1 < skip2){
									if(loopBoolean){
									int iloop = 0;
									while(iloop <= integers(loop)){
										skip1 = integers(skip.substring(skip.indexOf("[")+1, skip.lastIndexOf(",")).trim());
										while(skip1 <= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 + 1;
									
										}
								
										iloop = iloop+1;
									}
									
									loopBoolean = false;
								}else{
									while(skip1 <= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 + 1;
									
										}
								}
								}else{
									if(loopBoolean){
									int iloop = 0;
									while(iloop <= integers(loop)){
										skip1 = integers(skip.substring(skip.indexOf("[")+1, skip.lastIndexOf(",")).trim());
										while(skip1 >= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 - 1;
									
										}
								
										iloop = iloop+1;
									}
									
									loopBoolean = false;
								}else{
									while(skip1 >= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 - 1;
									
										}
								}
								}
								
								
								
							}
							
							//Fim da estrutura
							if(linha.contains("endDynamic")){
								dynFrame = null;
								dynLabelFrame = null;
								dynLabelImage = null;
								dynImage = null;
								atualX = 0;
								atualY = 0;
								atualW = 0;
								atualH = 0;
								gotoX = 0;
								gotoY = 0;
								X = 0;
								Y = 0;
								X1 = 0;
								Y1 = 0;
								movTime = 0;
								booleanTime = false;
								labelPaint = null;
								funcPaint = "";
								colorPaint = "";
								effect = "";
								booleanEffect = false;
								numLabelPaint1 = 0;
								numLabelPaint2 = 0;
								
							}
							
						}
					}
				}
				
				//Execucao do tempo da leitura do Escopo
				if(escopeBoolean == true){
					if(escopeNull != null){
						try {
							Thread.sleep(escopeTime);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						
				}
				
				if(linha.contains("$EndVar")){
					if(escopeBoolean){memoryEscope += "End of definitions of variables/functions<br>"; initEscope.escopePane.setText(memoryEscope);}
				}
				
				if(linha.contains("Start")){
					if(escopeBoolean){memoryEscope += "Begin of module of executions of instructions<br>"; initEscope.escopePane.setText(memoryEscope);}
				}
				
				/*
				Analise Hipotetica para ignorar algoritmos
				Pela Segunda leitura caso algum Botao de 
				Interface seja acionado
				*/
				if(logicButton.equals("true")){
					
					while(!linha.contains(atualCondBut[numCond])){
						linha = lerArq.readLine();
						
					}
					
				}
				
				
				/*
				Analise de parametro de configuracao #Link
				para Lincagem de arquivos de Interfaces
				*/
				if(linha.contains("#link")){
					linkage = linha.substring(linha.indexOf(":")+1, linha.lastIndexOf("=>")).trim();
					String interf = linha.substring(linha.indexOf("=>")+2, linha.lastIndexOf(".")).trim();
					linkages[integers(linkage)] = interf;
				}
				
				//Execucao da funcao MODULE
				//Chamativa de Modulos de Interfaces Graficas
				if(linha.contains("module[")){
					String getPath = new File("").getAbsolutePath();
					String module = linha.substring(linha.indexOf("module[")+7, linha.lastIndexOf("]."));
					String numberInterf = linha.substring(linha.indexOf(",")+1, linha.lastIndexOf("]")).trim();
					if(module.contains("all")){
						Scanner interScan = new Scanner(new File("C:\\Users\\Casa-Pc\\Desktop"+"\\Plax\\"+linkages[integers(numberInterf)]+".x"));
						String lineInter = interScan.nextLine();
						
						while(interScan.hasNextLine()){
						
							lineInter = interScan.nextLine();
						}
					}else{
						String nameModul = module.substring(module.indexOf("'")+1, module.lastIndexOf("'"));
						Scanner interScan = new Scanner(new File("C:\\Users\\Casa-Pc\\Desktop"+"\\Plax\\"+linkages[integers(numberInterf)]+".x"));
						String lineInter = interScan.nextLine();
						while(!lineInter.contains("module '"+nameModul+"'")){
							lineInter = interScan.nextLine();
						}
					
						while(!lineInter.contains("endModule => '"+nameModul+"'")){
							
							//componente janela plax
							if(lineInter.contains("[window")){
								
								
								if(lineInter.contains("[window]")){
									label = new JLabel();
									window = new JFrame();
									
									URL urlIcon = window.getClass().getResource("/plax/image/icone_plax.jpg");  
									Image iconUrl = Toolkit.getDefaultToolkit().getImage(urlIcon);  
									window.setIconImage(iconUrl);
										
									window.setVisible(true);
								}else
									if(lineInter.contains("[window")){
										label = new JLabel();
										window = new JFrame();
										JPanel panelWin = new JPanel();
										URL urlIcon = window.getClass().getResource("/plax/image/icone_plax.jpg");  
										Image iconUrl = Toolkit.getDefaultToolkit().getImage(urlIcon);  
										window.setIconImage(iconUrl);
		
										window.setVisible(true);
										
										String win = lineInter.substring(lineInter.indexOf("window")+7, lineInter.lastIndexOf("]"));
										String width1 = "0";
										String height1 = "0";
										String alignX1 = "0";
										String alignY1 = "0";
										String title1 = "Windows Plax Language";
										String id1 = "";
										String backcolor1 = "lightgray";
										String winicon1 = "";
										if(win.contains("width{")){
											String width = win.substring(win.indexOf("width{")+6, win.lastIndexOf("}width"));
											width1 = width.substring(width.indexOf("'")+1, width.lastIndexOf("'"));
											
										}
					
										if(win.contains("height{")){
											String height = win.substring(win.indexOf("height{")+7, win.lastIndexOf("}height"));
											height1 = height.substring(height.indexOf("'")+1, height.lastIndexOf("'"));
											
										}
										
										if(win.contains("alignX{")){
											String alignX = win.substring(win.indexOf("alignX{")+7, win.lastIndexOf("}alignX"));
											alignX1 = alignX.substring(alignX.indexOf("'")+1, alignX.lastIndexOf("'"));
										
										}
										
										if(win.contains("alignY{")){
											String alignY = win.substring(win.indexOf("alignY{")+7, win.lastIndexOf("}alignY"));
											alignY1 = alignY.substring(alignY.indexOf("'")+1, alignY.lastIndexOf("'"));
											
										}
										
										if(win.contains("title{")){
											String title = win.substring(win.indexOf("title{")+6, win.lastIndexOf("}title"));
											title1 = title.substring(title.indexOf("'")+1, title.lastIndexOf("'"));
											
										}
										
										if(win.contains("id{")){
											String id = win.substring(win.indexOf("id{")+3, win.lastIndexOf("}id"));
											id1 = id.substring(id.indexOf("'")+1, id.lastIndexOf("'"));
											
										}
										
										if(win.contains("back{")){
											String backcolor = win.substring(win.indexOf("back{")+5, win.lastIndexOf("}back"));
											backcolor1 = backcolor.substring(backcolor.indexOf("'")+1, backcolor.lastIndexOf("'"));
											
										}
										
										if(win.contains("icon{")){
											String winicon = win.substring(win.indexOf("icon{")+5, win.lastIndexOf("}icon"));
											winicon1 = winicon.substring(winicon.indexOf("'")+1, winicon.lastIndexOf("'"));
											
											 
											
										}
										
								
											
										
										
										window.setBounds(integers(alignX1), integers(alignY1), integers(width1), integers(height1));
										panelWin.setBounds(0, 0, integers(width1), integers(height1));
										window.setTitle(title1);
										window.setName(id1);
										ImageIcon iconWin = new ImageIcon(winicon1);  
										window.setIconImage(iconWin.getImage());
										window.add(panelWin);
										panelWin.add(label);
									
										label.setBounds(0, 0, integers(width1), integers(height1));
										label.setText("<html><div style='width:"+width1+";height:"+height1+";background-color:"+backcolor1+";'></div></html>");
										
										while(!lineInter.contains("[/window]")){
											lineInter = interScan.nextLine();
											
											//componente campo de texto plax
											if(lineInter.contains("[InputText")){
												numInputText = numInputText + 1;
												InputText[numInputText] = new JTextField();
												label.add(InputText[numInputText]);
												
												
												if(lineInter.contains("[/InputText]")){
													String ValueInput = lineInter.substring(lineInter.indexOf("]")+1, lineInter.lastIndexOf("[/InputText]"));
													InputText[numInputText].setText(ValueInput);
													
													
													String Input = lineInter.substring(lineInter.indexOf("InputText")+10, lineInter.lastIndexOf("]"));
													
													if(Input.contains("width{")){
														String Inputwidth = Input.substring(Input.indexOf("width{")+6, Input.lastIndexOf("}width"));
														Inputwidth1 = Inputwidth.substring(Inputwidth.indexOf("'")+1, Inputwidth.lastIndexOf("'"));
														
													}
					
													if(Input.contains("height{")){
														String Inputheight = Input.substring(Input.indexOf("height{")+7, Input.lastIndexOf("}height"));
														Inputheight1 = Inputheight.substring(Inputheight.indexOf("'")+1, Inputheight.lastIndexOf("'"));
												
													}
										
													if(Input.contains("alignX{")){
														String InputalignX = Input.substring(Input.indexOf("alignX{")+7, Input.lastIndexOf("}alignX"));
														InputalignX1 = InputalignX.substring(InputalignX.indexOf("'")+1, InputalignX.lastIndexOf("'"));
														
													}
										
													if(Input.contains("alignY{")){
														String InputalignY = Input.substring(Input.indexOf("alignY{")+7, Input.lastIndexOf("}alignY"));
														InputalignY1 = InputalignY.substring(InputalignY.indexOf("'")+1, InputalignY.lastIndexOf("'"));
														
													}
										
													if(Input.contains("id{")){
														String Inputid = Input.substring(Input.indexOf("id{")+3, Input.lastIndexOf("}id"));
														Inputid1 = Inputid.substring(Inputid.indexOf("'")+1, Inputid.lastIndexOf("'"));
													
													}
													
													if(Input.contains("color{")){
														String Inputcolor = Input.substring(Input.indexOf("color{")+6, Input.lastIndexOf("}color"));
														Inputcolor1 = Inputcolor.substring(Inputcolor.indexOf("'")+1, Inputcolor.lastIndexOf("'"));
													
														if(Inputcolor1.equals("black")){InputText[numInputText].setForeground(Color.black);}
														if(Inputcolor1.equals("blue")){InputText[numInputText].setForeground(Color.blue);}
														if(Inputcolor1.equals("cyan")){InputText[numInputText].setForeground(Color.cyan);}
														if(Inputcolor1.equals("red")){InputText[numInputText].setForeground(Color.red);}
														if(Inputcolor1.equals("yellow")){InputText[numInputText].setForeground(Color.yellow);}
														if(Inputcolor1.equals("green")){InputText[numInputText].setForeground(Color.green);}
														if(Inputcolor1.equals("white")){InputText[numInputText].setForeground(Color.white);}
														if(Inputcolor1.equals("gray")){InputText[numInputText].setForeground(Color.GRAY);}
														if(Inputcolor1.equals("darkgray")){InputText[numInputText].setForeground(Color.DARK_GRAY);}
														if(Inputcolor1.equals("lightgray")){InputText[numInputText].setForeground(Color.DARK_GRAY);}
														if(Inputcolor1.equals("orange")){InputText[numInputText].setForeground(Color.orange);}
														if(Inputcolor1.equals("magenta")){InputText[numInputText].setForeground(Color.magenta);}
														if(Inputcolor1.equals("pink")){InputText[numInputText].setForeground(Color.PINK);}
														
													}
													
													if(Input.contains("back{")){
														String Inputbackcolor = Input.substring(Input.indexOf("back{")+5, Input.lastIndexOf("}back"));
														Inputbackcolor1 = Inputbackcolor.substring(Inputbackcolor.indexOf("'")+1, Inputbackcolor.lastIndexOf("'"));
														
														if(Inputbackcolor1.equals("black")){InputText[numInputText].setBackground(Color.black);}
														if(Inputbackcolor1.equals("blue")){InputText[numInputText].setBackground(Color.blue);}
														if(Inputbackcolor1.equals("cyan")){InputText[numInputText].setBackground(Color.cyan);}
														if(Inputbackcolor1.equals("red")){InputText[numInputText].setBackground(Color.red);}
														if(Inputbackcolor1.equals("yellow")){InputText[numInputText].setBackground(Color.yellow);}
														if(Inputbackcolor1.equals("green")){InputText[numInputText].setBackground(Color.green);}
														if(Inputbackcolor1.equals("white")){InputText[numInputText].setBackground(Color.white);}
														if(Inputbackcolor1.equals("gray")){InputText[numInputText].setBackground(Color.GRAY);}
														if(Inputbackcolor1.equals("darkgray")){InputText[numInputText].setBackground(Color.DARK_GRAY);}
														if(Inputbackcolor1.equals("lightgray")){InputText[numInputText].setBackground(Color.DARK_GRAY);}
														if(Inputbackcolor1.equals("orange")){InputText[numInputText].setBackground(Color.orange);}
														if(Inputbackcolor1.equals("magenta")){InputText[numInputText].setBackground(Color.magenta);}
														if(Inputbackcolor1.equals("pink")){InputText[numInputText].setBackground(Color.PINK);}
														
													}
													
													InputText[numInputText].setBounds(integers(InputalignX1), integers(InputalignY1), integers(Inputwidth1), integers(Inputheight1));
													InputText[numInputText].setName(Inputid1);
													IdInputText += Inputid1+"{"+numInputText+"}"+Inputid1+"\n";
													
													
													
												}
												
												
												
											}
											
											
											//componente botao plax
											if(lineInter.contains("[button")){
												numButton = numButton + 1;
												button[numButton] = new JButton();
												label.add(button[numButton]);
												
												
												if(lineInter.contains("[/button]")){
													String Valuebutton = lineInter.substring(lineInter.indexOf("]")+1, lineInter.lastIndexOf("[/button]"));
													button[numButton].setText(Valuebutton); 
													
													String but = lineInter.substring(lineInter.indexOf("button")+7, lineInter.lastIndexOf("]"));
													
													if(but.contains("width{")){
														String butwidth = but.substring(but.indexOf("width{")+6, but.lastIndexOf("}width"));
														butwidth1 = butwidth.substring(butwidth.indexOf("'")+1, butwidth.lastIndexOf("'"));
														
													}
					
													if(but.contains("height{")){
														String butheight = but.substring(but.indexOf("height{")+7, but.lastIndexOf("}height"));
														butheight1 = butheight.substring(butheight.indexOf("'")+1, butheight.lastIndexOf("'"));
													
													}
										
													if(but.contains("alignX{")){
														String butalignX = but.substring(but.indexOf("alignX{")+7, but.lastIndexOf("}alignX"));
														butalignX1 = butalignX.substring(butalignX.indexOf("'")+1, butalignX.lastIndexOf("'"));
														
													}
										
													if(but.contains("alignY{")){
														String butalignY = but.substring(but.indexOf("alignY{")+7, but.lastIndexOf("}alignY"));
														butalignY1 = butalignY.substring(butalignY.indexOf("'")+1, butalignY.lastIndexOf("'"));
														
													}
										
													if(but.contains("id{")){
														String butid = but.substring(but.indexOf("id{")+3, but.lastIndexOf("}id"));
														butid1 = butid.substring(butid.indexOf("'")+1, butid.lastIndexOf("'"));
														
													}
													
													if(but.contains("color{")){
														String buttoncolor = but.substring(but.indexOf("color{")+6, but.lastIndexOf("}color"));
														buttoncolor1 = buttoncolor.substring(buttoncolor.indexOf("'")+1, buttoncolor.lastIndexOf("'"));
														
														if(buttoncolor1.equals("black")){button[numButton].setForeground(Color.black);}
														if(buttoncolor1.equals("blue")){button[numButton].setForeground(Color.blue);}
														if(buttoncolor1.equals("cyan")){button[numButton].setForeground(Color.cyan);}
														if(buttoncolor1.equals("red")){button[numButton].setForeground(Color.red);}
														if(buttoncolor1.equals("yellow")){button[numButton].setForeground(Color.yellow);}
														if(buttoncolor1.equals("green")){button[numButton].setForeground(Color.green);}
														if(buttoncolor1.equals("white")){button[numButton].setForeground(Color.white);}
														if(buttoncolor1.equals("gray")){button[numButton].setForeground(Color.GRAY);}
														if(buttoncolor1.equals("darkgray")){button[numButton].setForeground(Color.DARK_GRAY);}
														if(buttoncolor1.equals("lightgray")){button[numButton].setForeground(Color.DARK_GRAY);}
														if(buttoncolor1.equals("orange")){button[numButton].setForeground(Color.orange);}
														if(buttoncolor1.equals("magenta")){button[numButton].setForeground(Color.magenta);}
														if(buttoncolor1.equals("pink")){button[numButton].setForeground(Color.PINK);}
														
													}
													
													if(but.contains("back")){
														String buttonbackcolor = but.substring(but.indexOf("back{")+5, but.lastIndexOf("}back"));
														buttonbackcolor1 = buttonbackcolor.substring(buttonbackcolor.indexOf("'")+1, buttonbackcolor.lastIndexOf("'"));
														
														if(buttonbackcolor1.equals("black")){button[numButton].setBackground(Color.black);}
														if(buttonbackcolor1.equals("blue")){button[numButton].setBackground(Color.blue);}
														if(buttonbackcolor1.equals("cyan")){button[numButton].setBackground(Color.cyan);}
														if(buttonbackcolor1.equals("red")){button[numButton].setBackground(Color.red);}
														if(buttonbackcolor1.equals("yellow")){button[numButton].setBackground(Color.yellow);}
														if(buttonbackcolor1.equals("green")){button[numButton].setBackground(Color.green);}
														if(buttonbackcolor1.equals("white")){button[numButton].setBackground(Color.white);}
														if(buttonbackcolor1.equals("gray")){button[numButton].setBackground(Color.GRAY);}
														if(buttonbackcolor1.equals("darkgray")){button[numButton].setBackground(Color.DARK_GRAY);}
														if(buttonbackcolor1.equals("lightgray")){button[numButton].setBackground(Color.DARK_GRAY);}
														if(buttonbackcolor1.equals("orange")){button[numButton].setBackground(Color.orange);}
														if(buttonbackcolor1.equals("magenta")){button[numButton].setBackground(Color.magenta);}
														if(buttonbackcolor1.equals("pink")){button[numButton].setBackground(Color.PINK);}
														
													}
													
													button[numButton].setBounds(integers(butalignX1), integers(butalignY1), integers(butwidth1), integers(butheight1));
													button[numButton].setName(butid1);
													IdButton += butid1+"{"+numButton+":"+"false"+"}"+butid1+"\n";
												
													
						
												}
												
												
												
											}
											
											
											//componente de imagem da interface plax
											if(lineInter.contains("[image")){
												numImage = numImage + 1;
												labelImage[numImage] = new JLabel();
												label.add(labelImage[numImage]);
												
													
													String img = lineInter.substring(lineInter.indexOf("image")+5, lineInter.lastIndexOf("]"));
													
													if(img.contains("path{")){
														String imagepath = img.substring(img.indexOf("path{")+5, img.lastIndexOf("}path"));
														imagepath1 = imagepath.substring(imagepath.indexOf("'")+1, imagepath.lastIndexOf("'"));
														
													}
													
													if(img.contains("width{")){
														String imagewidth = img.substring(img.indexOf("width{")+6, img.lastIndexOf("}width"));
														imagewidth1 = imagewidth.substring(imagewidth.indexOf("'")+1, imagewidth.lastIndexOf("'"));
														
													}
					
													if(img.contains("height{")){
														String imageheight = img.substring(img.indexOf("height{")+7, img.lastIndexOf("}height"));
														imageheight1 = imageheight.substring(imageheight.indexOf("'")+1, imageheight.lastIndexOf("'"));
													
													}
										
													if(img.contains("alignX{")){
														String imagealignX = img.substring(img.indexOf("alignX{")+7, img.lastIndexOf("}alignX"));
														imagealignX1 = imagealignX.substring(imagealignX.indexOf("'")+1, imagealignX.lastIndexOf("'"));
														
													}
										
													if(img.contains("alignY{")){
														String imagealignY = img.substring(img.indexOf("alignY{")+7, img.lastIndexOf("}alignY"));
														imagealignY1 = imagealignY.substring(imagealignY.indexOf("'")+1, imagealignY.lastIndexOf("'"));
														
													}
											
													
													if(img.contains("id{")){
														String imageid = img.substring(img.indexOf("id{")+3, img.lastIndexOf("}id"));
														imageid1 = imageid.substring(imageid.indexOf("'")+1, imageid.lastIndexOf("'"));
														
													}
													
													
														imageIcon = new ImageIcon(imagepath1);
														labelImage[numImage].setIcon(imageIcon);
														
													labelImage[numImage].setBounds(integers(imagealignX1), integers(imagealignY1), integers(imagewidth1), integers(imageheight1));
													labelImage[numImage].setName(imageid1);
													IdImage += imageid1+"{"+numImage+"}"+imageid1+"\n";
												
												
											}
											
											
											
											
											
										}
										
									}
								
								
							}
							
							lineInter = interScan.nextLine();
						}
					}
					
				}
				
				
				
				positionRegister();
				functionInput();
				if(lang.equals("read")){
					
					
					while(!linha.contains("call["+call+"]].")){
						
						linha = lerArq.readLine();
						
						
					}
					
					lang = "normal";
					if(linha.contains("call["+call+"]].")){
						linha = lerArq.readLine();


					
					}
				}
				functionWhile();
				functionIfElse();
				debugLines();
				functionGUIS();
				
				paramConsole();
				
				//Execucao da funcao CALL (Funcao de Interligacao)
				//chamadas de algoritmos Plax em outros arquivos
				String getCaminho = new File("").getAbsolutePath();
				if(linha.contains("call[")){
						call  = linha.substring(linha.indexOf("call[")+5, linha.lastIndexOf("]"));
						try {
							
							langPlax1(getCaminho+"\\Plax\\"+call);
						} catch (IOException e) {}
						
				}
				
				//Execucao da funcao PROMPT
				//Execucao de tarefas do Sistema operacional (CMD/TERMINAL)
				if(linha.contains("prompt[")){
					String prompt = linha.substring(linha.indexOf("prompt[")+7, linha.lastIndexOf("]"));
					Runtime.getRuntime().exec("CMD /c "+prompt);
					
				}
				
				defineVariables();
				//infoProgram();
				//Preparacao Inicial da funcao DEBUG
				if(linha.contains("debug[]")){
					System.err.println("****"+memoriaVar+"****");
				}
				if(linha.trim().equals("Final")){
					memoria += "<font size='5'><b>"
							+ "<br><br>*********************************</b></font>";
					
				}
				functionPrinter();
				
				//Descartando Subrotinas Plax na leitura e armazenando-as
				if(linha.contains("func") && linha.contains("_") && !linha.contains("/")){
					func = linha.substring(linha.indexOf("func")+4, linha.lastIndexOf("]")+1);
					
					saveFunc += func + ".";
					
					
					while(!linha.contains("endFunc")){
						
						linha = lerArq.readLine();
						
					}
					
				}
					
					//Identificao e Execucao de SUBROTINAS declaradas anteriormente 
					if(!linha.contains("/") && linha.contains("[") && linha.contains("].") && linha.contains("_") && !linha.contains("[[")){
						subLine = linha.substring(linha.indexOf("_"), linha.lastIndexOf("[")+1);
						
					}
					if(!linha.contains("/") && linha.contains("[") && linha.contains("].") && linha.contains("_") && linha.contains("[[")){
						subLine = linha.substring(linha.indexOf("_"), linha.lastIndexOf("["));
						
					}
					
					if(!linha.contains("/") && saveFunc.trim().contains(subLine) && linha.contains("[") && linha.contains("].") && linha.contains("_")){
						situation = "selfPath";
						String function = linha.trim();
						int sizeSubLine = subLine.length();
						argLine = linha.substring(linha.indexOf(subLine)+sizeSubLine, linha.lastIndexOf("]."));
						
						
						scan = new Scanner(new File(paths));
						linha = scan.nextLine();
						while(!linha.contains("func "+subLine)){
							linha = scan.nextLine();
							
							if(linha.contains("func "+subLine)){
								
								variable = linha.substring(linha.indexOf(subLine)+sizeSubLine, linha.lastIndexOf("]."));
								if(argLine.contains("[") && argLine.contains("]")){
									
									valOp = argLine.substring(argLine.indexOf("["), argLine.lastIndexOf("]")+1);
									if(argLine.contains("+")){
										addictionVars();
									}else
									if(argLine.contains("-")){
										subtractionVars();
									}else
									if(argLine.contains("*")){
										multiVars();
									}else
									if(argLine.contains("/")){
										divisionVars();
									}
									if(argLine.contains("<")){
										lessOp();
									}
									if(argLine.contains(">")){
										moreOp();
									}
									if(argLine.contains("==")){
										compareOp();
									}
									if(argLine.contains("!=")){
										differentOp();
									}
									
								}else{
									
									variable = linha.substring(linha.indexOf(subLine)+sizeSubLine, linha.lastIndexOf("]."));
									
									argFuncVars();
								}
							}
						}
						
						while(!linha.contains("endFunc")){
							linha = scan.nextLine();
							LineAnalysis();
							
							
							
						}
						
					}
					
					
					if(linha.contains("/") && linha.trim().contains("_") && linha.contains("[") && linha.contains("].") && linha.contains("_")){
						situation = "otherPath";
						funcFile = linha.substring(linha.indexOf("/")+1, linha.lastIndexOf("/"));
						String function = linha.substring(linha.indexOf("/_")+1, linha.lastIndexOf("[")+1).trim();
						getPath = new File("").getAbsolutePath();
						
						int sizeSubLine = function.length();
						argLine = linha.substring(linha.indexOf(function)+sizeSubLine, linha.lastIndexOf("]."));
						
						//alterar no desenvolvimento getPath ou "C:\\Users\\Computador-Pc\\Desktop"
						scan = new Scanner(new File(getPath+"\\Plax\\"+funcFile+".plax"));
						linha = scan.nextLine();
						while(!linha.contains("func "+function)){
							linha = scan.nextLine();
							
							if(linha.contains("func") && linha.contains("_") && !linha.contains("/")){
								func = linha.substring(linha.indexOf("func")+4, linha.lastIndexOf("]")+1);
								
								saveFunc += func + ".";
								
							}
							
							if(linha.contains("func "+function)){
								
								variable = linha.substring(linha.indexOf(function)+sizeSubLine, linha.lastIndexOf("]."));
								if(argLine.contains("[") && argLine.contains("]")){
									
									valOp = argLine.substring(argLine.indexOf("["), argLine.lastIndexOf("]")+1);
									
									if(argLine.contains("+")){
										addictionVars();
									}else
									if(argLine.contains("-")){
										subtractionVars();
									}else
									if(argLine.contains("*")){
										multiVars();
									}else
									if(argLine.contains("/")){
										divisionVars();
									}
									if(argLine.contains("<")){
										lessOp();
									}
									if(argLine.contains(">")){
										moreOp();
									}
									if(argLine.contains("==")){
										compareOp();
									}
									if(argLine.contains("!=")){
										differentOp();
									}
								}else{
									variable = linha.substring(linha.indexOf(function)+sizeSubLine, linha.lastIndexOf("]."));
									argFuncVars();
								}
							}
						}
						
						while(!linha.contains("endFunc")){
							linha = scan.nextLine();
							LineAnalysis();
							
						}
						
					}
					
				//Execucao da funcao EXTRACT
				//para Extracao de informacoes para outros componentes
				if(linha.contains("extract[")){
					String from = "";
					String dir = "";
					String to = "";
					String extract = "";
					String action = "";
					extract = linha.substring(linha.indexOf("extract[")+8, linha.lastIndexOf("]."));

					if(extract.contains("from{")){
						from = extract.substring(extract.indexOf("from{")+5, extract.lastIndexOf("}from"));
					}
					if(extract.contains("to{")){
						to = extract.substring(extract.indexOf("to{")+3, extract.lastIndexOf("}to"));
					}
					if(extract.contains("dir{")){
						dir = extract.substring(extract.indexOf("dir{")+4, extract.lastIndexOf("}dir"));
						
					}
					if(extract.contains("action[")){
						action = extract.substring(extract.indexOf("action[")+7, extract.lastIndexOf("]"));
						
						if(action.equals("html")){
							if(from.equals("console") && to.equals("file")){
								File fw = new File(dir);
								PrintWriter pw = new PrintWriter(fw);
								pw.print(initConsole.console.getText());
								pw.print("<b>Pagina html gerada pelo arquivo plax: '"+paths+"'</b>");
								pw.close();
							}
							if(from.equals("file") && to.equals("console")){
								File fir = new File(dir);
								FileReader fr = new FileReader(fir);
								BufferedReader br = new BufferedReader(fr);
								String htmlFile = br.readLine();
								while(!htmlFile.contains("<body")){
									htmlFile = br.readLine();
								}
								while(!htmlFile.contains("</body>")){
									htmlFile = br.readLine();
									memoria += htmlFile;
								}
								br.close();
							}
							
						}
						if(action.equals("text")){
							
							
						}
						
						
					}
					
				}
				
				
				if(linha.contains("bl")){memoria += "<br>";}
				if(linha.contains("stop")){initConsole.console.setText("<font size='5'>"+memoria+"<br><br>Execu? finalizada.<br>*********************************</font>");condWhile = false;break;}
				
			
				if(linha.contains("Final")){
					
							initConsole.console.setText("<font size='5'>"+memoria+"</font>");
							if(escopeBoolean){memoryEscope += "End of module of executions of instructions<br></font>"; initEscope.escopePane.setText(memoryEscope);}
					
					break;
					
				}
				
				
				
				if(linha.contains("%")){EndVar = false;}
				
				
				if(Case){linha = lerArq.readLine();}
				
				codeLine = codeLine + 1;
			
			}
		}
			errorDeclarationVariables();
			
		}else{
			incorretSintax();
			
		}
		arq.close();
		//Finalize scanFilePlax
		
		} catch (IOException e) {
			noExistFile();
		}
		
	}
	
	
	
public static void langPlax1(String caminho) throws IOException{
		
	try {
			
			
			
			//Defini? do arquivo para 1?leitura
			FileReader file = new FileReader(caminho);
		    BufferedReader read = new BufferedReader(file);
		    String text = read.readLine();
		      
		    //Defini? do arquivo para 2?leitura
		    FileReader arq = new FileReader(caminho);
		    BufferedReader lerArq = new BufferedReader(arq);
		    linha = lerArq.readLine();
		      memoriaBase1 = "";
		      //Primeira leitura do arquivo
		      while(text != null){
		    		 memoriaBase1 += text += "\n";
		    		 text = read.readLine();
		    		
		      }
		     file.close();
		     //Final primeira leitura
		 
		       
		 //Segunda leitura do arquivo
		if (linha.contains("#output") & memoriaBase1.contains("#output") & memoriaBase1.contains("*Var") & memoriaBase1.contains("$EndVar") & memoriaBase1.contains("Start") & memoriaBase1.contains("Final") & memoriaBase1.contains("%")){//verifica se come?pela Palavra e n?
			
			String output = "";
			if(linha.contains("#output")){
				output = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
			}
			
			
			while (linha != null) {
				
				if(linha.contains("input[")){
					
					
					
					input = linha.substring(linha.indexOf("input[")+6, linha.lastIndexOf("]."));
					inputField = "true";
					memoria += "<br>"+">>";
					initConsole.console.setText("<font size='5'>"+memoria+"</font>");
					
					
					
					
					
					
					textField = new JTextField();
					textField.setText("");
					textField.setEditable(true);
					textField.setBackground(Color.white);
					textField.setForeground(Color.blue);
					textField.setBorder(null);
					initConsole.console.add(textField);
					
					
					
					new Thread(new Runnable(){
						@Override
						public void run(){
							initConsole.console.addMouseListener(new MouseListener() {
								
								@Override
								public void mouseReleased(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent e) {
									
											Point posit = initConsole.console.getMousePosition();
											getX = (int) posit.getX();
											getY = (int) posit.getY();
											textField.setBounds(getX-5, getY-10, 600, 20);
										
									
								}
								
								@Override
								public void mouseExited(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseEntered(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}
							});
						}
					}).start();
					
					
					
					
			
					
					tecEnter = false;
					
					new Thread(new Runnable(){
						@Override
						public void run(){
							textField.addKeyListener(new KeyListener() {
								
								@Override
								public void keyTyped(KeyEvent e) {
									
									
								}
								
								@Override
								public void keyReleased(KeyEvent e) {
									
									
								}
								
								@Override
								public void keyPressed(KeyEvent e) {
									
									if(e.getKeyCode() == KeyEvent.VK_ENTER){
										inputVar();
									
										textField.setEditable(false);
										tecEnter = true;
									}
									
								}
							});
						}
					}).start();
					
					
					while(tecEnter==false){}
					tecEnter = false;
					
					linha = lerArq.readLine();
					textField = new JTextField();
				}

				if(output.contains("gui")){
					
					if(linha.contains("create[")){
						String create = linha.substring(linha.indexOf("create[")+7, linha.lastIndexOf("]."));
						String object = create.substring(create.indexOf("object:")+7, create.lastIndexOf("_obj,"));
						
						JFrame window = null;
						JButton button = null;
						
						

						
						
						if(object.contains("WIN")){
							window = new JFrame();
							URL urls = window.getClass().getResource("/image/icone_plax.jpg");  
							Image icon = Toolkit.getDefaultToolkit().getImage(urls);  
							window.setIconImage(icon);
							
							if(create.contains("title:")){
								String title = create.substring(create.indexOf("title:")+6, create.lastIndexOf("_tit,"));
								window.setTitle(title);
								
							}
							
							if(create.contains("alignsize:")){
								String alignsize = create.substring(create.indexOf("alignsize:")+9, create.lastIndexOf(",")+1);
								String getX = alignsize.substring(alignsize.indexOf(":")+1, alignsize.lastIndexOf("&"));
								String getY = alignsize.substring(alignsize.indexOf("&")+1, alignsize.lastIndexOf("-"));
								
								String width = alignsize.substring(alignsize.indexOf("-")+1, alignsize.lastIndexOf("x"));
								String height = alignsize.substring(alignsize.indexOf("x")+1, alignsize.lastIndexOf("_als,"));
								
								window.setBounds(integers(getX), integers(getY), integers(width), integers(height));
							}
							
							if(create.contains("visibility:")){
								String visibility = create.substring(create.indexOf("visibility:")+11, create.lastIndexOf("_visib,"));
								
								if(visibility.contains("true")){
									window.setVisible(true);
								}
								if(visibility.contains("false")){
									window.setVisible(false);
								}
							}
							
						
							
							
							
						}
						
						
						
						
						
						
						
						
						
						
					}
					
				}
				
				if(linha.contains("if[")){
					if0 = linha.substring(linha.indexOf("if")+2, linha.indexOf("].")+1);
					if(!if0.contains("and") && !if0.contains("or")){
					if(if0.contains("<")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("<"));
						if2 = if0.substring(if0.indexOf("<")+1, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(integers(if1) < integers(if2)){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
					if(if0.contains(">")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf(">"));
						if2 = if0.substring(if0.indexOf(">")+1, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(integers(if1) > integers(if2)){
							condition = "true";
						}else{
							condition = "false";
						}
					}
					if(if0.contains("==")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("=="));
						if2 = if0.substring(if0.indexOf("==")+2, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(integers(if1) == integers(if2)){
							condition = "true";
						}else{
							condition = "false";
						}
					}
					if(if0.contains("!=")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("!="));
						if2 = if0.substring(if0.indexOf("!=")+2, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(integers(if1) != integers(if2)){
							condition = "true";
						}else{
							condition = "false";
						}
						
					}
					if(if0.contains("<=")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("<="));
						if2 = if0.substring(if0.indexOf("<=")+2, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(integers(if1) <= integers(if2)){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
					if(if0.contains(">=")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf(">="));
						if2 = if0.substring(if0.indexOf(">=")+2, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(integers(if1) >= integers(if2)){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
					if(if0.contains("-is-")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-is-"));
						if2 = if0.substring(if0.indexOf("-is-")+4, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(if1.trim().equals(if2.trim())){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
					if(if0.contains("-not-")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-not-"));
						if2 = if0.substring(if0.indexOf("-not-")+5, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(!if1.trim().equals(if2.trim())){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
					if(if0.contains("-has-")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-has-"));
						if2 = if0.substring(if0.indexOf("-has-")+5, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(if1.trim().contains(if2.trim())){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
					if(if0.contains("-hasnt-")){
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-hasnt-"));
						if2 = if0.substring(if0.indexOf("-hasnt-")+7, if0.lastIndexOf("]"));
						
						firstIfVar();
						secondIfVar();
						
						if(!if1.trim().contains(if2.trim())){
							condition = "true";
						}else{
							condition = "false"; 
						}
					}
				}
					
					if(if0.contains("and")){
						ol1 = if0.substring(if0.indexOf("[[")+1, if0.lastIndexOf("and"));
						ol2 = if0.substring(if0.indexOf("and")+3, if0.lastIndexOf("]]")+1);
						
						if(ol1.contains("<")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<"));
							if2 = ol1.substring(ol1.indexOf("<")+1, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						
						
						if(ol1.contains(">")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">"));
							if2 = ol1.substring(ol1.indexOf(">")+1, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains("<=")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<="));
							if2 = ol1.substring(ol1.indexOf("<=")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						if(ol1.contains(">=")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">="));
							if2 = ol1.substring(ol1.indexOf(">=")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains("==")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("=="));
							if2 = ol1.substring(ol1.indexOf("==")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains("!=")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("!="));
							if2 = ol1.substring(ol1.indexOf("!=")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						if(ol1.contains("-is-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-is-"));
							if2 = ol1.substring(ol1.indexOf("-is-")+4, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						if(ol1.contains("-not-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-not-"));
							if2 = ol1.substring(ol1.indexOf("-not-")+5, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						if(ol1.contains("-has-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-has-"));
							if2 = ol1.substring(ol1.indexOf("-has-")+5, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						if(ol1.contains("-hasnt-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-hasnt-"));
							if2 = ol1.substring(ol1.indexOf("-hasnt-")+7, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						
					}
					
					if(if0.contains("or")){
						ol1 = if0.substring(if0.indexOf("[[")+1, if0.lastIndexOf("or"));
						ol2 = if0.substring(if0.indexOf("or")+2, if0.lastIndexOf("]]")+1);
						
						if(ol1.contains("<")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<"));
							if2 = ol1.substring(ol1.indexOf("<")+1, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) < integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains(">")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">"));
							if2 = ol1.substring(ol1.indexOf(">")+1, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) > integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains("<=")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<="));
							if2 = ol1.substring(ol1.indexOf("<=")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) <= integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						if(ol1.contains(">=")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">="));
							if2 = ol1.substring(ol1.indexOf(">=")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) >= integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains("==")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("=="));
							if2 = ol1.substring(ol1.indexOf("==")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) == integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						
						
						if(ol1.contains("!=")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("!="));
							if2 = ol1.substring(ol1.indexOf("!=")+2, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(integers(if1) != integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
						}
						if(ol1.contains("-is-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-is-"));
							if2 = ol1.substring(ol1.indexOf("-is-")+4, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.equals(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						if(ol1.contains("-not-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-not-"));
							if2 = ol1.substring(ol1.indexOf("-not-")+5, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.equals(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						if(ol1.contains("-has-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-has-"));
							if2 = ol1.substring(ol1.indexOf("-has-")+5, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(if1.contains(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						if(ol1.contains("-hasnt-")){
							if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-hasnt-"));
							if2 = ol1.substring(ol1.indexOf("-hasnt-")+7, ol1.lastIndexOf("]"));
							
							firstIfVar();
							secondIfVar();
							
							if(ol2.contains("<")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
								if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
								if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("==")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
								if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("!=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
								if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains("<=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
								if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							
							if(ol2.contains(">=")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
								if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-is-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
								if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-not-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
								if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-has-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
								if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
							if(ol2.contains("-hasnt-")){
								if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
								if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
								thirtyIfVar();
								fourtyIfVar();
								if(!if1.contains(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
							}
						}
						
					}
				}
				
				if(condition.equals("true") || condition1.equals("true")){
					
					if(linha.contains("else")){
					
						
						while(!linha.contains("endElse")){
							linha = lerArq.readLine();
						}
						
						condition = "";
						condition1 = "";
					}
					
				}else{
					if(condition.equals("false") || condition1.equals("false")){
						
						while(!linha.contains("else")){
							
							linha = lerArq.readLine();
							
						}
						
						if(linha.contains("else")){
							linha = lerArq.readLine();
						}
						
						condition = "";
						condition1 = "";
					}
				}
					
				String consoleBackground = "";
				if(linha.contains("#background")){
					consoleBackground = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
					
					if(consoleBackground.contains("blue")){
						initConsole.console.setBackground(Color.blue);
					}else{
						if(consoleBackground.contains("red")){
							initConsole.console.setBackground(Color.red);
						}else{
							if(consoleBackground.contains("gray")){
								initConsole.console.setBackground(Color.gray);
							}else{
								if(consoleBackground.contains("black")){
									initConsole.console.setBackground(Color.black);
								}else{
									if(consoleBackground.contains("yellow")){
										initConsole.console.setBackground(Color.yellow);
									}else{
										if(consoleBackground.contains("darkgray")){
											initConsole.console.setBackground(Color.DARK_GRAY);
										}else{
											if(consoleBackground.contains("cyan")){
												initConsole.console.setBackground(Color.CYAN);
											}else{
												if(consoleBackground.contains("green")){
													initConsole.console.setBackground(Color.green);
												}else{
													if(consoleBackground.contains("magenta")){
														initConsole.console.setBackground(Color.magenta);
													}else{
														if(consoleBackground.contains("orange")){
															initConsole.console.setBackground(Color.orange);
														}else{
															if(consoleBackground.contains("pink")){
																initConsole.console.setBackground(Color.pink);
															}else{
																if(consoleBackground.contains("white")){
																	initConsole.console.setBackground(Color.white);
																}
															}}}}}}}}}}}
				}
				
				String consoleForeground = "";
				if(linha.contains("#foreground")){
					consoleForeground = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
					
					if(consoleForeground.contains("blue")){
						memoria += "<font color='blue'>";
					}else{
						if(consoleForeground.contains("red")){
							memoria += "<font color='red'>";
						}else{
							if(consoleForeground.contains("black")){
								memoria += "<font color='black'>";
							}else{
									if(consoleForeground.contains("gray")){
										memoria += "<font color='gray'>";
									}else{
										if(consoleForeground.contains("yellow")){
											memoria += "<font color='yellow'>";
										}else{
											if(consoleForeground.contains("darkgray")){
												memoria += "<font color='darkgray'>";
											}else{
												if(consoleForeground.contains("cyan")){
													memoria += "<font color='cyan'>";
												}else{
													if(consoleForeground.contains("green")){
														memoria += "<font color='green'>";
													}else{
														if(consoleForeground.contains("magenta")){
															memoria += "<font color='magenta'>";
														}else{
															if(consoleForeground.contains("orange")){
																memoria += "<font color='orange'>";
															}else{
																if(consoleForeground.contains("pink")){
																	memoria += "<font color='pink'>";
																}else{
																	if(consoleForeground.contains("white")){
																		memoria += "<font color='white'>";
																	}
																}}}}}}}}}}}
				}
				
				
				
				//Lexer do armazenamento de variaveis
				if(linha.contains("@") & linha.contains(":")){
					variable = linha.substring(linha.indexOf("@"), linha.indexOf(":")-1);
					val = linha.substring(linha.indexOf(":")+2, linha.indexOf("."));
					memoriaVar += variable+" : "+val+"."+"\n";
					Map<String, String> vars = new HashMap<String, String>();
					vars.put(variable, val);
					String value = vars.get(variable);
					
					if(val.contains("[") && val.contains("]")){
						valOp = val.substring(val.indexOf("["), val.lastIndexOf("]")+1);
						if(val.contains("+")){
							addictionVars();
						}else
						if(val.contains("-")){
							subtractionVars();
						}else
						if(val.contains("*")){
							multiVars();
						}else
						if(val.contains("/")){
							divisionVars();
						}
						if(val.contains("<")){
							lessOp();
						}
						if(val.contains(">")){
							moreOp();
						}
						if(val.contains("==")){
							compareOp();
						}
						if(val.contains("!=")){
							differentOp();
						}
					}else{
						
						if(!val.contains("@")){
							
							if(val.contains("0") || val.contains("1") || val.contains("2") || val.contains("3") || val.contains("4") || val.contains("5") || val.contains("6") || val.contains("7") || val.contains("8") || val.contains("9")){
								
								if(!val.contains("a") || !val.contains("b") || !val.contains("c") || !val.contains("d") || !val.contains("e") || !val.contains("f") || !val.contains("g") || !val.contains("h") || !val.contains("i") || !val.contains("j") || !val.contains("k") || !val.contains("l") || !val.contains("m") || !val.contains("n") || !val.contains("o") || !val.contains("p") || !val.contains("q") || !val.contains("r") || !val.contains("s") || !val.contains("t") || !val.contains("u") || !val.contains("v") || !val.contains("w") || !val.contains("x") || !val.contains("y") || !val.contains("z") || !val.contains("A") || !val.contains("B") || !val.contains("C") || !val.contains("D") || !val.contains("E") || !val.contains("F") || !val.contains("G") || !val.contains("H") || !val.contains("I") || !val.contains("J") || !val.contains("K") || !val.contains("L") || !val.contains("M") || !val.contains("N") || !val.contains("O") || !val.contains("P") || !val.contains("Q") || !val.contains("R") || !val.contains("S") || !val.contains("T") || !val.contains("U") || !val.contains("V") || !val.contains("W") || !val.contains("X") || !val.contains("Y") || !val.contains("Z")){
									integersVars();
								}else{
									stringVars();
									
									
								} //else alfab?co
								
							}else{
								
								stringVars();
								
								
							} //else n??ico
							
						}else{
							valueWithVars();
						}    //else @
						
					}   //else []
					
					
					
				}
				
				//Final lexer do armazenamento de variaveis	
				
				
				
				/*String subPath = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
				//Lexer de informa?s do programa
			if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & !memoriaBase.contains("color")){ 
				memoria += "<font size='5'><b>@program: sis[] & vars.<br>"
						+ "___@Lang: Plax.<br>"
						+ "___@File: "+subPath+"<br>"
						+ "___@Finally: Exibition of Variables.<br>"
						+ "*********************************</b></font><br>";
			
			}
			
			
			if(linha.equals("Start") & !memoriaBase.contains("sis[") & memoriaBase.contains("@") & !memoriaBase.contains("color")){ 
				memoria += "<font size='5'><b>@program: vars.<br>"
						+ "___@Lang: Plax.<br>"
						+ "___@File: "+subPath+"<br>"
						+ "___@Finally: Definitions of Variables.<br>"
						+ "*********************************</b></font><br>";
			
			}
			
			if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color")){ 
				memoria += "<font size='5'><b>@program: sis[].<br>"
						+ "___@Lang: Plax.<br>"
						+ "___@File: "+subPath+"<br>"
						+ "___@Finally: Exibitions.<br>"
						+ "*********************************</b></font><br>";
			
			}
			
			if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & memoriaBase.contains("Var") & memoriaBase.contains("EndVar") & memoriaBase.contains("Start") & memoriaBase.contains("Final")){ 
				memoria += "<font size='5'><b>@program: Others.<br>"
						+ "___@Lang: Plax.<br>"
						+ "___@File: "+subPath+"<br>"
						+ "___@Finally: Others types.<br>"
						+ "*********************************</b></font><br>";
			
			}
			
			if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & memoriaBase.contains("color")){ 
				memoria += "<font size='5'><b>@program: sis[], vars & formats.<br>"
						+ "___@Lang: Plax.<br>"
						+ "___@File: "+subPath+"<br>"
						+ "___@Finally: Texts formatings.<br>"
						+ "*********************************</b></font><br>";
			
			}
			
			if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & memoriaBase.contains("color")){ 
				memoria += "<font size='5'><b>@program: sis[] & formats.<br>"
						+ "___@Lang: Plax.<br>"
						+ "___@File: "+subPath+"<br>"
						+ "___@Finally: Texts formatings.<br>"
						+ "*********************************</b></font><br>";
			
			}
			*/
			
			
			
			
			
			//Final lexer de informa?s do programa
			
				//Lexer da exibi? de variaveis
				if(linha.contains("sis[") & linha.contains("@")){
					sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
					textSis1 = "";
					textSis2 = "";
						if(sis.contains("[") && sis.contains("]")){
							
							sisCommand = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("]"));
							if(sisCommand.contains("+")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("+"));
								val2 = sis.substring(sis.indexOf("+")+1, sis.lastIndexOf("]"));
								
								stringWithOp("+");
								
								
							}else
							if(sisCommand.contains("-")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("-"));
								val2 = sis.substring(sis.indexOf("-")+1, sis.lastIndexOf("]"));
								
								stringWithOp("-");
							}else
							
							if(sisCommand.contains("*")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("*"));
								val2 = sis.substring(sis.indexOf("*")+1, sis.lastIndexOf("]"));
								
								stringWithOp("*");
							}else
							if(sisCommand.contains("/")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("/"));
								val2 = sis.substring(sis.indexOf("/")+1, sis.lastIndexOf("]"));
								
								stringWithOp("/");
							}else
							if(sisCommand.contains("<")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("<"));
								val2 = sis.substring(sis.indexOf("<")+1, sis.lastIndexOf("]"));
								
								stringWithOp("<");
								
							}else
							if(sisCommand.contains(">")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf(">"));
								val2 = sis.substring(sis.indexOf(">")+1, sis.lastIndexOf("]"));
								
								stringWithOp(">");
								
							}else
							if(sisCommand.contains("==")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("=="));
								val2 = sis.substring(sis.indexOf("==")+2, sis.lastIndexOf("]"));
								
								stringWithOp("==");
								
							}else
							if(sisCommand.contains("!=")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("!="));
								val2 = sis.substring(sis.indexOf("!=")+2, sis.lastIndexOf("]"));
								
								stringWithOp("!=");
								
							}
							
						}else{
							stringWithOp("sisVariables");
						
						}
						initConsole.console.setText(memoria);
				}
				//Final lexer de exibi? das variaveis
				
				//Lexer de exibi? de strings
				if(linha.contains("sis[") & !linha.contains("@")){
					sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
					
					//Lexer de formata? de textos
					if(sis.contains("color:blue")){
						String mem = sis.replace("color:blue{", "<font color='blue'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:red")){
						String mem = sis.replace("color:red{", "<font color='red'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:green")){
						String mem = sis.replace("color:green{", "<font color='green'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:yellow")){
						String mem = sis.replace("color:yellow{", "<font color='yellow'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:white")){
						String mem = sis.replace("color:white{", "<font color='white'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:black")){
						String mem = sis.replace("color:black{", "<font color='black'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:purple")){
						String mem = sis.replace("color:purple{", "<font color='purple'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:gray")){
						String mem = sis.replace("color:gray{", "<font color='gray'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:brown")){
						String mem = sis.replace("color:brown{", "<font color='brown'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("color:orange")){
						String mem = sis.replace("color:orange{", "<font color='orange'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:one")){
						String mem = sis.replace("size:one{", "<font size='1'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:two")){
						String mem = sis.replace("size:two{", "<font size='2'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:three")){
						String mem = sis.replace("size:three{", "<font size='3'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:four")){
						String mem = sis.replace("size:four{", "<font size='4'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:five")){
						String mem = sis.replace("size:five{", "<font size='5'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:six")){
						String mem = sis.replace("size:six{", "<font size='6'>").replace("}", "</font>");
						memoria += mem;
					}else
					if(sis.contains("size:seven")){
						String mem = sis.replace("size:seven{", "<font size='7'>").replace("}", "</font>");
						memoria += mem;
					}else{
					
					
						
						if(sis.contains("[") && sis.contains("]")){
							
							if(sis.contains("+")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("+"));
								val2 = sis.substring(sis.indexOf("+")+1, sis.lastIndexOf("]"));
								
								stringWithOp("+");
								
							}else
							if(sis.contains("-")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("-"));
								val2 = sis.substring(sis.indexOf("-")+1, sis.lastIndexOf("]"));
					
								stringWithOp("-");
							}else
							
							if(sis.contains("*")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("*"));
								val2 = sis.substring(sis.indexOf("*")+1, sis.lastIndexOf("]"));
								
								stringWithOp("*");
							}else
							if(sis.contains("/")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("/"));
								val2 = sis.substring(sis.indexOf("/")+1, sis.lastIndexOf("]"));
								
								stringWithOp("/");
							}
							if(sis.contains("<")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("<"));
								val2 = sis.substring(sis.indexOf("<")+1, sis.lastIndexOf("]"));
						
								stringWithOp("<");
								
							}
							if(sis.contains(">")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf(">"));
								val2 = sis.substring(sis.indexOf(">")+1, sis.lastIndexOf("]"));
						
								stringWithOp(">");
								
							}
							if(sis.contains("==")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("=="));
								val2 = sis.substring(sis.indexOf("==")+2, sis.lastIndexOf("]"));
							
								stringWithOp("==");
								
							}
							if(sis.contains("!=")){
								val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("!="));
								val2 = sis.substring(sis.indexOf("!=")+2, sis.lastIndexOf("]"));
						
								stringWithOp("!=");
								
							}
							
						}else{
							memoria += sis;
						}
					}
					//Final lexer de formata?
					
					initConsole.console.setText(memoria);
				}
				//Final lexer de exibi? de strings
				
				
				//Lexer de simples comandos
				if(linha.contains("bl")){memoria += "<br>";}
				if(linha.contains("stop")){initConsole.console.setText("<font size='5'>"+memoria+"<br><br>Execu? finalizada.<br>*********************************</font>");break;}
				//Final de lexer de simples comandos
			
				
				if(linha.contains("Final")){initConsole.console.setText("<font size='5'>"+memoria+"</font>");}
				
				if(linha.contains("Final")){
					langPlax("read");
					
				}
				
				
				linha = lerArq.readLine();
			}
			
			memoria = ""; 
			memoriaBase = "";
			
		}else{
			incorretSintax();
			
		}
		arq.close();
		//Final segunda leitura
		
		} catch (IOException e) {
			noExistDir();
			
		       
		}
		
		
		
		
	}

	public static void main(String[] args) throws IOException{
		
		try{
			//paths = args[0].toString();
			//paths = "C:\\Users\\BFTC\\Desktop\\Plax\\condic.plax";
			//initConsole = new Consol();
			
			//langPlax("normal");
			
			Map<String, String> vars = new HashMap<String, String>();
			vars.put("@file", "Arquivo.plax");
			vars.put("@name", "Wenderson");
			String value = vars.get("@file");
			
			
		}catch(ArrayIndexOutOfBoundsException ai1){
			String getP = new File("").getAbsolutePath();
			Runtime.getRuntime().exec("CMD /c start "+getP+"\\Plax\\Info\\info.bat");
		}
			
	}
	//Editor vazio
	public static void emptyEditor(){
		
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro! O editor est?azio! :(</font></html>", "Error message plax", JOptionPane.ERROR_MESSAGE);
		
	}
	
	//Sintaxe incorreta
	public static void incorretSintax(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro! A sintaxe do c??o est?ncorreto! :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
		
	}
	
	//Sem extens?
	public static void noExtension(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Por favor! n?coloque o tipo de extens?:(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
			
	}
	
	//N?existe arquivo
	public static void noExistFile(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Desculpe! o arquivo '"+paths+"' n?existe! :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	//N?existe diret??
	public static void noExistDir(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Desculpe! o diret?? '"+paths+"' n?existe! :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	//erro de c??o
	public static void errorCode(int codeline){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro de c??o na linha '"+codeline+"'; </font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	//erro de tipo
	public static void typeError(int codeline, String msg){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro de c??o na linha '"+codeline+"'; <br> "+msg+"</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	public static void LineAnalysis() throws IOException{
		//c
		
		positionRegister();
				
				//dynamic no lineAnalysis
				if(linha.contains("#dynamic")){
					dynBoolean = true;
					String dynPath1 = linha.substring(linha.indexOf(":"), linha.lastIndexOf(".")).trim();
					String paramDynamic = dynPath1.substring(dynPath1.indexOf(":")+1, dynPath1.lastIndexOf("=>")).trim();
					String dynPath2 = dynPath1.substring(dynPath1.indexOf("'")+1, dynPath1.lastIndexOf("'"));
					dynPath += "$"+paramDynamic+"{"+dynPath2+"}"+"$"+paramDynamic+"\n";
				}
				
				if(dynBoolean){
					if(linha.contains("dynamic[")){
						String dynamic = linha.substring(linha.indexOf("dynamic[")+7, linha.lastIndexOf("].")+1).trim();
						String getDynPath = "";
						String extensionCapture = "";
						if(dynamic.contains("effect")){
							 widthDynImage = 0;
							 heightDynImage = 0;
							effect = dynamic.substring(dynamic.indexOf(":")+1, dynamic.lastIndexOf("]")+1).trim();
							if(effect.contains("paint[")){
								String subParamDyn = "$"+dynamic.substring(dynamic.indexOf("[")+1, dynamic.lastIndexOf("=>")).trim();
								int lenParamDyn = subParamDyn.length() + 1;
								getDynPath = dynPath.substring(dynPath.indexOf(subParamDyn+"{")+lenParamDyn, dynPath.lastIndexOf("}"+subParamDyn));
								booleanEffect = true;
								labelPaint = new JLabel[20000];
								funcPaint = effect.substring(effect.indexOf("paint[")+6, effect.lastIndexOf("]")+1).trim();
								colorPaint = funcPaint.substring(funcPaint.indexOf("'")+1, funcPaint.lastIndexOf("'"));
								sizePaint = funcPaint.substring(funcPaint.indexOf(",")+1, funcPaint.lastIndexOf("]")).trim();
								
							}else
							if(effect.contains("capture[")){
								String subParamDyn = "$"+dynamic.substring(dynamic.indexOf("[")+1, dynamic.lastIndexOf("=>")).trim();
								int lenParamDyn = subParamDyn.length() + 1;
								getDynPath = dynPath.substring(dynPath.indexOf(subParamDyn+"{")+lenParamDyn, dynPath.lastIndexOf("}"+subParamDyn));
								booleanCapture = true;
								String effectCapture1 = effect.substring(effect.indexOf("capture[")+8, effect.lastIndexOf("]")).trim();
								extensionCapture = effectCapture1.substring(effectCapture1.indexOf(",")+1, effectCapture1.lastIndexOf("]")).trim();
								effectCapture = effectCapture1.substring(effectCapture1.indexOf("'")+1, effectCapture1.lastIndexOf("'"));
							}
							
						}
						
						
						if(!booleanCapture) {
							dynImage = new ImageIcon(dynPath);
						}
						else{
							dynImage = new ImageIcon(getDynPath+effectCapture+"."+extensionCapture);
						}
						
					
						dynLabelFrame = new JLabel();
						dynFrame = new JFrame();
						JPanel dynPanel = new JPanel();
						dynFrame.setVisible(true);
						dynFrame.setResizable(false);
						dynFrame.setEnabled(false);
						if(!booleanCapture){
							dynFrame.setBounds(0, 0, 400, 400);
							dynPanel.setBounds(0, 0, 400, 400);
						}else{
							
							widthDynImage = dynImage.getImage().getWidth(null);
							heightDynImage = dynImage.getImage().getHeight(null);
							System.out.println("largura : "+widthDynImage);
							System.out.println("altura : "+heightDynImage);
							dynFrame.setBounds(0, 0, widthDynImage, heightDynImage);
							dynPanel.setBounds(0, 0, widthDynImage, heightDynImage);
							
						}
						
						dynFrame.add(dynPanel);
						dynPanel.add(dynLabelFrame);
						if(!booleanCapture){
							dynLabelFrame.setBounds(0, 0, 400, 400);
							dynLabelFrame.setText("<html><div style='width:"+400+"; height:"+400+";background:black;'></div></html>");
						}else{
							dynLabelFrame.setBounds(0, 0, widthDynImage, heightDynImage);
							dynLabelFrame.setText("<html><div style='width:"+widthDynImage+"; height:"+heightDynImage+";background:black;'></div></html>");
						}
		
						
						dynLabelImage = new JLabel();
						dynLabelFrame.add(dynLabelImage);
						dynLabelImage.setIcon(dynImage);
						if(!booleanCapture){
							dynLabelImage.setBounds(0, 0, 50, 50);
						}else{
							dynLabelImage.setBounds(0, 0, widthDynImage, heightDynImage);
						}
						
						booleanCapture = false;
						while(!linha.contains("endDynamic")){
							linha = lerArq.readLine();
							
							//algoritmo do goto
							if(linha.contains("goto[")){
								String gotos = linha.substring(linha.indexOf("goto[")+4, linha.lastIndexOf("].")+1);
								atualX = X;
								atualY = Y;
								
								
								atualW = dynLabelImage.getWidth();
								atualH = dynLabelImage.getHeight();
								gotoX = integers(gotos.substring(gotos.indexOf("[")+1, gotos.lastIndexOf(",")).trim());
								gotoY = integers(gotos.substring(gotos.indexOf(",")+1, gotos.lastIndexOf("]")).trim());
								movTime = 0;
								booleanTime = false;
								if(gotos.contains("=>")){
									gotoY = integers(gotos.substring(gotos.indexOf(",")+1, gotos.lastIndexOf("=>")).trim());
									movTime = integers(gotos.substring(gotos.indexOf("=>")+2, gotos.lastIndexOf("]")).trim());
									booleanTime = true;
								}
								
										X1 = 0;
										Y1 = 0;
										loopDynamic = false;
										while(loopDynamic != true){
											
											if(X1 == 0){
												new Thread(new Runnable(){
													@Override
													public void run(){
														if(gotoX > atualX){
															for(X = atualX; X <= gotoX; X++){
															numLabelPaint1 = numLabelPaint2 + 1;
															if(booleanEffect){
																labelPaint[numLabelPaint1] = new JLabel();
																dynLabelFrame.add(labelPaint[numLabelPaint1]);
																labelPaint[numLabelPaint1].setText("<html><div style='width:5;height:"+sizePaint+";background:"+colorPaint+";'></div></html>");
																labelPaint[numLabelPaint1].setBounds(X, atualY, 6, integers(sizePaint));
															}
															dynLabelImage.setBounds(X, atualY, atualW, atualH);
															atualX = X;
															if(booleanTime == true){
																try {
																Thread.sleep(movTime);
																} catch (InterruptedException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
															}
															
															}
														}else{
															if(gotoX < atualX){
																for(X = atualX; X >= gotoX; X--){
																numLabelPaint1 = numLabelPaint2 + 1;
																if(booleanEffect){
																	labelPaint[numLabelPaint1] = new JLabel();
																	dynLabelFrame.add(labelPaint[numLabelPaint1]);
																	labelPaint[numLabelPaint1].setText("<html><div style='width:5;height:"+sizePaint+";background:"+colorPaint+";'></div></html>");
																	labelPaint[numLabelPaint1].setBounds(X, atualY, 6, integers(sizePaint));
																}
																dynLabelImage.setBounds(X, atualY, atualW, atualH);
																atualX = X;
																if(booleanTime == true){
																	try {
																		Thread.sleep(movTime);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																}
															
																}
															}
														}
														
													}
												}).start();
											}
											if(Y1 == 0){
												new Thread(new Runnable(){
													@Override
													public void run(){
														if(gotoY > atualY){
																for(Y = atualY; Y <= gotoY; Y++){
																numLabelPaint2 = numLabelPaint1 + 1;
																if(booleanEffect){
																	labelPaint[numLabelPaint2] = new JLabel();
																	dynLabelFrame.add(labelPaint[numLabelPaint2]);
																	labelPaint[numLabelPaint2].setText("<html><div style='width:5;height:"+sizePaint+";background:"+colorPaint+";'></div></html>");
																	labelPaint[numLabelPaint2].setBounds(atualX, Y, 6, integers(sizePaint));
																}
																dynLabelImage.setBounds(atualX, Y, atualW, atualH);
																atualY = Y;
																if(booleanTime == true){
																	try {
																	Thread.sleep(movTime);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																}
																
																
															}
															
														}else{
															if(gotoY < atualY){
																for(Y = atualY; Y >= gotoY; Y--){
																numLabelPaint2 = numLabelPaint1 + 1;
																if(booleanEffect){
																	labelPaint[numLabelPaint2] = new JLabel();
																	dynLabelFrame.add(labelPaint[numLabelPaint2]);
																	labelPaint[numLabelPaint2].setText("<html><div style='width:"+sizePaint+";height:1;background:"+colorPaint+";'></div></html>");
																	labelPaint[numLabelPaint2].setBounds(atualX, Y, 6, integers(sizePaint));
																}
																dynLabelImage.setBounds(atualX, Y, atualW, atualH);
																atualY = Y;
																if(booleanTime == true){
																	try {
																	Thread.sleep(movTime);
																	} catch (InterruptedException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																}
															
															
																}
															}
														}
														
													}
												}).start();
											}
											
											if((atualX == gotoX) && (atualY == gotoY)){loopDynamic = true;}
											X1 = X1 + 1;
											Y1 = Y1 + 1;
										}
								
								
										
								
								
								
							}
							//fim algoritmo do goto
							
							//definir cor para pintura
							if(linha.contains("paint[")){
								funcPaint = linha.substring(linha.indexOf("paint[")+6, linha.lastIndexOf("].")+1).trim();
								colorPaint = funcPaint.substring(funcPaint.indexOf("'")+1, funcPaint.lastIndexOf("'"));
								sizePaint = funcPaint.substring(funcPaint.indexOf(",")+1, funcPaint.lastIndexOf("]")).trim();
							}
							
							//salvar imagem
							if(linha.contains("pic[")){
								String pic1 = linha.substring(linha.indexOf("pic[")+4, linha.lastIndexOf("].")).trim();
								String pic = pic1.substring(pic1.indexOf("'")+1, pic1.lastIndexOf("'"));
								
								try{
									Robot robot = new Robot();
									BufferedImage bufferImg = robot.createScreenCapture(new Rectangle(8, 36, dynLabelFrame.getWidth()-20, dynLabelFrame.getHeight()-44));
									
									try{
										ImageIO.write(bufferImg, "JPEG", new File(pic));
									}catch(IOException iex){}
								}catch(AWTException e){}
								
							}
							
							if(linha.contains("loop[")){
								loop = linha.substring(linha.indexOf("loop[")+5, linha.lastIndexOf("].")).trim();
								loopBoolean = true;
							}
							//alterar imagem
							if(linha.contains("skip[")){
								String skip = linha.substring(linha.indexOf("skip[")+4, linha.lastIndexOf("].")+1);
								int skip1 = integers(skip.substring(skip.indexOf("[")+1, skip.lastIndexOf(",")).trim());
								int skip2 = 0;
								int skipTime = 0;
								if(skip.contains("=>")){
									skip2 = integers(skip.substring(skip.indexOf(",")+1, skip.lastIndexOf("=>")).trim());
									skipTime = integers(skip.substring(skip.indexOf("=>")+2, skip.lastIndexOf("]")).trim());
								}else{
									skip2 = integers(skip.substring(skip.indexOf(",")+1, skip.lastIndexOf("]")).trim());
								}
								
								if(skip1 < skip2){
									if(loopBoolean){
									int iloop = 0;
									while(iloop <= integers(loop)){
										skip1 = integers(skip.substring(skip.indexOf("[")+1, skip.lastIndexOf(",")).trim());
										while(skip1 <= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 + 1;
									
										}
								
										iloop = iloop+1;
									}
									
									loopBoolean = false;
								}else{
									while(skip1 <= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 + 1;
									
										}
								}
								}else{
									if(loopBoolean){
									int iloop = 0;
									while(iloop <= integers(loop)){
										skip1 = integers(skip.substring(skip.indexOf("[")+1, skip.lastIndexOf(",")).trim());
										while(skip1 >= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 - 1;
									
										}
								
										iloop = iloop+1;
									}
									
									loopBoolean = false;
								}else{
									while(skip1 >= skip2){
											dynImage = new ImageIcon(getDynPath+effectCapture+skip1+"."+extensionCapture);
											dynLabelImage.setIcon(dynImage);
									
											if(skipTime != 0){
												try{
													Thread.sleep(skipTime);
												}catch(InterruptedException e){
											
												}
											}
										skip1 = skip1 - 1;
									
										}
								}
								}
								
								
								
							}
							
							if(linha.contains("endDynamic")){
								dynFrame = null;
								dynLabelFrame = null;
								dynLabelImage = null;
								dynImage = null;
								atualX = 0;
								atualY = 0;
								atualW = 0;
								atualH = 0;
								gotoX = 0;
								gotoY = 0;
								X = 0;
								Y = 0;
								X1 = 0;
								Y1 = 0;
								movTime = 0;
								booleanTime = false;
								labelPaint = null;
								funcPaint = "";
								colorPaint = "";
								effect = "";
								booleanEffect = false;
								numLabelPaint1 = 0;
								numLabelPaint2 = 0;
								
							}
							
						}
					}
				}
				//Fim Dynamica no lineAnalysis
				
				//Interface no LineAnalysis
				if(output.contains("gui") || output.contains("gui/console")){
				
				if(linha.contains("#link")){
					linkage = linha.substring(linha.indexOf(":")+1, linha.lastIndexOf("=>")).trim();
					String interf = linha.substring(linha.indexOf("=>")+2, linha.lastIndexOf(".")).trim();
					linkages[integers(linkage)] = interf;
				}
				
				if(linha.contains("module[")){
					String getPath = new File("").getAbsolutePath();
					String module = linha.substring(linha.indexOf("module[")+7, linha.lastIndexOf("]."));
					String numberInterf = linha.substring(linha.indexOf(",")+1, linha.lastIndexOf("]")).trim();
					if(module.contains("all")){
						Scanner interScan = new Scanner(new File("C:\\Users\\Casa-Pc\\Desktop"+"\\Plax\\"+linkages[integers(numberInterf)]+".x"));
						String lineInter = interScan.nextLine();
						
						while(interScan.hasNextLine()){
						
							lineInter = interScan.nextLine();
						}
					}else{
						String nameModul = module.substring(module.indexOf("'")+1, module.lastIndexOf("'"));
						Scanner interScan = new Scanner(new File("C:\\Users\\Casa-Pc\\Desktop"+"\\Plax\\"+linkages[integers(numberInterf)]+".x"));
						String lineInter = interScan.nextLine();
						while(!lineInter.contains("module '"+nameModul+"'")){
							lineInter = interScan.nextLine();
						}
					
						while(!lineInter.contains("endModule => '"+nameModul+"'")){
							
							//componente janela plax
							if(lineInter.contains("[window")){
								
								
								if(lineInter.contains("[window]")){
									label = new JLabel();
									window = new JFrame();
									
									URL urlIcon = window.getClass().getResource("/plax/image/icone_plax.jpg");  
									Image iconUrl = Toolkit.getDefaultToolkit().getImage(urlIcon);  
									window.setIconImage(iconUrl);
										
									window.setVisible(true);
								}else
									if(lineInter.contains("[window")){
										label = new JLabel();
										window = new JFrame();
										JPanel panelWin = new JPanel();
										URL urlIcon = window.getClass().getResource("/plax/image/icone_plax.jpg");  
										Image iconUrl = Toolkit.getDefaultToolkit().getImage(urlIcon);  
										window.setIconImage(iconUrl);
		
										window.setVisible(true);
										
										String win = lineInter.substring(lineInter.indexOf("window")+7, lineInter.lastIndexOf("]"));
										String width1 = "0";
										String height1 = "0";
										String alignX1 = "0";
										String alignY1 = "0";
										String title1 = "Windows Plax Language";
										String id1 = "";
										String backcolor1 = "lightgray";
										String winicon1 = "";
										if(win.contains("width{")){
											String width = win.substring(win.indexOf("width{")+6, win.lastIndexOf("}width"));
											width1 = width.substring(width.indexOf("'")+1, width.lastIndexOf("'"));
											
										}
					
										if(win.contains("height{")){
											String height = win.substring(win.indexOf("height{")+7, win.lastIndexOf("}height"));
											height1 = height.substring(height.indexOf("'")+1, height.lastIndexOf("'"));
											
										}
										
										if(win.contains("alignX{")){
											String alignX = win.substring(win.indexOf("alignX{")+7, win.lastIndexOf("}alignX"));
											alignX1 = alignX.substring(alignX.indexOf("'")+1, alignX.lastIndexOf("'"));
										
										}
										
										if(win.contains("alignY{")){
											String alignY = win.substring(win.indexOf("alignY{")+7, win.lastIndexOf("}alignY"));
											alignY1 = alignY.substring(alignY.indexOf("'")+1, alignY.lastIndexOf("'"));
											
										}
										
										if(win.contains("title{")){
											String title = win.substring(win.indexOf("title{")+6, win.lastIndexOf("}title"));
											title1 = title.substring(title.indexOf("'")+1, title.lastIndexOf("'"));
											
										}
										
										if(win.contains("id{")){
											String id = win.substring(win.indexOf("id{")+3, win.lastIndexOf("}id"));
											id1 = id.substring(id.indexOf("'")+1, id.lastIndexOf("'"));
											
										}
										
										if(win.contains("back{")){
											String backcolor = win.substring(win.indexOf("back{")+5, win.lastIndexOf("}back"));
											backcolor1 = backcolor.substring(backcolor.indexOf("'")+1, backcolor.lastIndexOf("'"));
											
										}
										
										if(win.contains("icon{")){
											String winicon = win.substring(win.indexOf("icon{")+5, win.lastIndexOf("}icon"));
											winicon1 = winicon.substring(winicon.indexOf("'")+1, winicon.lastIndexOf("'"));
											
											 
											
										}
										
								
											
										
										
										window.setBounds(integers(alignX1), integers(alignY1), integers(width1), integers(height1));
										panelWin.setBounds(0, 0, integers(width1), integers(height1));
										window.setTitle(title1);
										window.setName(id1);
										ImageIcon iconWin = new ImageIcon(winicon1);  
										window.setIconImage(iconWin.getImage());
										window.add(panelWin);
										panelWin.add(label);
									
										label.setBounds(0, 0, integers(width1), integers(height1));
										label.setText("<html><div style='width:"+width1+";height:"+height1+";background-color:"+backcolor1+";'></div></html>");
										
										while(!lineInter.contains("[/window]")){
											lineInter = interScan.nextLine();
											
											//componente campo de texto plax
											if(lineInter.contains("[InputText")){
												numInputText = numInputText + 1;
												InputText[numInputText] = new JTextField();
												label.add(InputText[numInputText]);
												
												
												if(lineInter.contains("[/InputText]")){
													String ValueInput = lineInter.substring(lineInter.indexOf("]")+1, lineInter.lastIndexOf("[/InputText]"));
													InputText[numInputText].setText(ValueInput);
													
													
													String Input = lineInter.substring(lineInter.indexOf("InputText")+10, lineInter.lastIndexOf("]"));
													
													if(Input.contains("width{")){
														String Inputwidth = Input.substring(Input.indexOf("width{")+6, Input.lastIndexOf("}width"));
														Inputwidth1 = Inputwidth.substring(Inputwidth.indexOf("'")+1, Inputwidth.lastIndexOf("'"));
														
													}
					
													if(Input.contains("height{")){
														String Inputheight = Input.substring(Input.indexOf("height{")+7, Input.lastIndexOf("}height"));
														Inputheight1 = Inputheight.substring(Inputheight.indexOf("'")+1, Inputheight.lastIndexOf("'"));
												
													}
										
													if(Input.contains("alignX{")){
														String InputalignX = Input.substring(Input.indexOf("alignX{")+7, Input.lastIndexOf("}alignX"));
														InputalignX1 = InputalignX.substring(InputalignX.indexOf("'")+1, InputalignX.lastIndexOf("'"));
														
													}
										
													if(Input.contains("alignY{")){
														String InputalignY = Input.substring(Input.indexOf("alignY{")+7, Input.lastIndexOf("}alignY"));
														InputalignY1 = InputalignY.substring(InputalignY.indexOf("'")+1, InputalignY.lastIndexOf("'"));
														
													}
										
													if(Input.contains("id{")){
														String Inputid = Input.substring(Input.indexOf("id{")+3, Input.lastIndexOf("}id"));
														Inputid1 = Inputid.substring(Inputid.indexOf("'")+1, Inputid.lastIndexOf("'"));
													
													}
													
													if(Input.contains("color{")){
														String Inputcolor = Input.substring(Input.indexOf("color{")+6, Input.lastIndexOf("}color"));
														Inputcolor1 = Inputcolor.substring(Inputcolor.indexOf("'")+1, Inputcolor.lastIndexOf("'"));
													
														if(Inputcolor1.equals("black")){InputText[numInputText].setForeground(Color.black);}
														if(Inputcolor1.equals("blue")){InputText[numInputText].setForeground(Color.blue);}
														if(Inputcolor1.equals("cyan")){InputText[numInputText].setForeground(Color.cyan);}
														if(Inputcolor1.equals("red")){InputText[numInputText].setForeground(Color.red);}
														if(Inputcolor1.equals("yellow")){InputText[numInputText].setForeground(Color.yellow);}
														if(Inputcolor1.equals("green")){InputText[numInputText].setForeground(Color.green);}
														if(Inputcolor1.equals("white")){InputText[numInputText].setForeground(Color.white);}
														if(Inputcolor1.equals("gray")){InputText[numInputText].setForeground(Color.GRAY);}
														if(Inputcolor1.equals("darkgray")){InputText[numInputText].setForeground(Color.DARK_GRAY);}
														if(Inputcolor1.equals("lightgray")){InputText[numInputText].setForeground(Color.DARK_GRAY);}
														if(Inputcolor1.equals("orange")){InputText[numInputText].setForeground(Color.orange);}
														if(Inputcolor1.equals("magenta")){InputText[numInputText].setForeground(Color.magenta);}
														if(Inputcolor1.equals("pink")){InputText[numInputText].setForeground(Color.PINK);}
														
													}
													
													if(Input.contains("back{")){
														String Inputbackcolor = Input.substring(Input.indexOf("back{")+5, Input.lastIndexOf("}back"));
														Inputbackcolor1 = Inputbackcolor.substring(Inputbackcolor.indexOf("'")+1, Inputbackcolor.lastIndexOf("'"));
														
														if(Inputbackcolor1.equals("black")){InputText[numInputText].setBackground(Color.black);}
														if(Inputbackcolor1.equals("blue")){InputText[numInputText].setBackground(Color.blue);}
														if(Inputbackcolor1.equals("cyan")){InputText[numInputText].setBackground(Color.cyan);}
														if(Inputbackcolor1.equals("red")){InputText[numInputText].setBackground(Color.red);}
														if(Inputbackcolor1.equals("yellow")){InputText[numInputText].setBackground(Color.yellow);}
														if(Inputbackcolor1.equals("green")){InputText[numInputText].setBackground(Color.green);}
														if(Inputbackcolor1.equals("white")){InputText[numInputText].setBackground(Color.white);}
														if(Inputbackcolor1.equals("gray")){InputText[numInputText].setBackground(Color.GRAY);}
														if(Inputbackcolor1.equals("darkgray")){InputText[numInputText].setBackground(Color.DARK_GRAY);}
														if(Inputbackcolor1.equals("lightgray")){InputText[numInputText].setBackground(Color.DARK_GRAY);}
														if(Inputbackcolor1.equals("orange")){InputText[numInputText].setBackground(Color.orange);}
														if(Inputbackcolor1.equals("magenta")){InputText[numInputText].setBackground(Color.magenta);}
														if(Inputbackcolor1.equals("pink")){InputText[numInputText].setBackground(Color.PINK);}
														
													}
													
													InputText[numInputText].setBounds(integers(InputalignX1), integers(InputalignY1), integers(Inputwidth1), integers(Inputheight1));
													InputText[numInputText].setName(Inputid1);
													IdInputText += Inputid1+"{"+numInputText+"}"+Inputid1+"\n";
													
													
													
												}
												
												
												
											}
											
											
											//componente botao plax
											if(lineInter.contains("[button")){
												numButton = numButton + 1;
												button[numButton] = new JButton();
												label.add(button[numButton]);
												
												
												if(lineInter.contains("[/button]")){
													String Valuebutton = lineInter.substring(lineInter.indexOf("]")+1, lineInter.lastIndexOf("[/button]"));
													button[numButton].setText(Valuebutton); 
													
													String but = lineInter.substring(lineInter.indexOf("button")+7, lineInter.lastIndexOf("]"));
													
													if(but.contains("width{")){
														String butwidth = but.substring(but.indexOf("width{")+6, but.lastIndexOf("}width"));
														butwidth1 = butwidth.substring(butwidth.indexOf("'")+1, butwidth.lastIndexOf("'"));
														
													}
					
													if(but.contains("height{")){
														String butheight = but.substring(but.indexOf("height{")+7, but.lastIndexOf("}height"));
														butheight1 = butheight.substring(butheight.indexOf("'")+1, butheight.lastIndexOf("'"));
													
													}
										
													if(but.contains("alignX{")){
														String butalignX = but.substring(but.indexOf("alignX{")+7, but.lastIndexOf("}alignX"));
														butalignX1 = butalignX.substring(butalignX.indexOf("'")+1, butalignX.lastIndexOf("'"));
														
													}
										
													if(but.contains("alignY{")){
														String butalignY = but.substring(but.indexOf("alignY{")+7, but.lastIndexOf("}alignY"));
														butalignY1 = butalignY.substring(butalignY.indexOf("'")+1, butalignY.lastIndexOf("'"));
														
													}
										
													if(but.contains("id{")){
														String butid = but.substring(but.indexOf("id{")+3, but.lastIndexOf("}id"));
														butid1 = butid.substring(butid.indexOf("'")+1, butid.lastIndexOf("'"));
														
													}
													
													if(but.contains("color{")){
														String buttoncolor = but.substring(but.indexOf("color{")+6, but.lastIndexOf("}color"));
														buttoncolor1 = buttoncolor.substring(buttoncolor.indexOf("'")+1, buttoncolor.lastIndexOf("'"));
														
														if(buttoncolor1.equals("black")){button[numButton].setForeground(Color.black);}
														if(buttoncolor1.equals("blue")){button[numButton].setForeground(Color.blue);}
														if(buttoncolor1.equals("cyan")){button[numButton].setForeground(Color.cyan);}
														if(buttoncolor1.equals("red")){button[numButton].setForeground(Color.red);}
														if(buttoncolor1.equals("yellow")){button[numButton].setForeground(Color.yellow);}
														if(buttoncolor1.equals("green")){button[numButton].setForeground(Color.green);}
														if(buttoncolor1.equals("white")){button[numButton].setForeground(Color.white);}
														if(buttoncolor1.equals("gray")){button[numButton].setForeground(Color.GRAY);}
														if(buttoncolor1.equals("darkgray")){button[numButton].setForeground(Color.DARK_GRAY);}
														if(buttoncolor1.equals("lightgray")){button[numButton].setForeground(Color.DARK_GRAY);}
														if(buttoncolor1.equals("orange")){button[numButton].setForeground(Color.orange);}
														if(buttoncolor1.equals("magenta")){button[numButton].setForeground(Color.magenta);}
														if(buttoncolor1.equals("pink")){button[numButton].setForeground(Color.PINK);}
														
													}
													
													if(but.contains("back")){
														String buttonbackcolor = but.substring(but.indexOf("back{")+5, but.lastIndexOf("}back"));
														buttonbackcolor1 = buttonbackcolor.substring(buttonbackcolor.indexOf("'")+1, buttonbackcolor.lastIndexOf("'"));
														
														if(buttonbackcolor1.equals("black")){button[numButton].setBackground(Color.black);}
														if(buttonbackcolor1.equals("blue")){button[numButton].setBackground(Color.blue);}
														if(buttonbackcolor1.equals("cyan")){button[numButton].setBackground(Color.cyan);}
														if(buttonbackcolor1.equals("red")){button[numButton].setBackground(Color.red);}
														if(buttonbackcolor1.equals("yellow")){button[numButton].setBackground(Color.yellow);}
														if(buttonbackcolor1.equals("green")){button[numButton].setBackground(Color.green);}
														if(buttonbackcolor1.equals("white")){button[numButton].setBackground(Color.white);}
														if(buttonbackcolor1.equals("gray")){button[numButton].setBackground(Color.GRAY);}
														if(buttonbackcolor1.equals("darkgray")){button[numButton].setBackground(Color.DARK_GRAY);}
														if(buttonbackcolor1.equals("lightgray")){button[numButton].setBackground(Color.DARK_GRAY);}
														if(buttonbackcolor1.equals("orange")){button[numButton].setBackground(Color.orange);}
														if(buttonbackcolor1.equals("magenta")){button[numButton].setBackground(Color.magenta);}
														if(buttonbackcolor1.equals("pink")){button[numButton].setBackground(Color.PINK);}
														
													}
													
													button[numButton].setBounds(integers(butalignX1), integers(butalignY1), integers(butwidth1), integers(butheight1));
													button[numButton].setName(butid1);
													IdButton += butid1+"{"+numButton+":"+"false"+"}"+butid1+"\n";
												
													
						
												}
												
												
												
											}
											
											
											//component image da interface plax
											if(lineInter.contains("[image")){
												numImage = numImage + 1;
												labelImage[numImage] = new JLabel();
												label.add(labelImage[numImage]);
												
													
													String img = lineInter.substring(lineInter.indexOf("image")+5, lineInter.lastIndexOf("]"));
													
													if(img.contains("path{")){
														String imagepath = img.substring(img.indexOf("path{")+5, img.lastIndexOf("}path"));
														imagepath1 = imagepath.substring(imagepath.indexOf("'")+1, imagepath.lastIndexOf("'"));
														
													}
													
													if(img.contains("width{")){
														String imagewidth = img.substring(img.indexOf("width{")+6, img.lastIndexOf("}width"));
														imagewidth1 = imagewidth.substring(imagewidth.indexOf("'")+1, imagewidth.lastIndexOf("'"));
														
													}
					
													if(img.contains("height{")){
														String imageheight = img.substring(img.indexOf("height{")+7, img.lastIndexOf("}height"));
														imageheight1 = imageheight.substring(imageheight.indexOf("'")+1, imageheight.lastIndexOf("'"));
													
													}
										
													if(img.contains("alignX{")){
														String imagealignX = img.substring(img.indexOf("alignX{")+7, img.lastIndexOf("}alignX"));
														imagealignX1 = imagealignX.substring(imagealignX.indexOf("'")+1, imagealignX.lastIndexOf("'"));
														
													}
										
													if(img.contains("alignY{")){
														String imagealignY = img.substring(img.indexOf("alignY{")+7, img.lastIndexOf("}alignY"));
														imagealignY1 = imagealignY.substring(imagealignY.indexOf("'")+1, imagealignY.lastIndexOf("'"));
														
													}
											
													//asef
													if(img.contains("id{")){
														String imageid = img.substring(img.indexOf("id{")+3, img.lastIndexOf("}id"));
														imageid1 = imageid.substring(imageid.indexOf("'")+1, imageid.lastIndexOf("'"));
														
													}
													
													
														imageIcon = new ImageIcon(imagepath1);
														labelImage[numImage].setIcon(imageIcon);
														
													labelImage[numImage].setBounds(integers(imagealignX1), integers(imagealignY1), integers(imagewidth1), integers(imageheight1));
													labelImage[numImage].setName(imageid1);
													IdImage += imageid1+"{"+numImage+"}"+imageid1+"\n";
												
												
											}
											
											
											
											
											
										}
										
									}
								
								
							}
							
							lineInter = interScan.nextLine();
						}
					}
					
				}
				
			
		}
		//Fim Interface no lineAnalysis
		
		//Função de entrada no lineAnalysis
		if(linha.contains("input[")){
			
			
			
			input = linha.substring(linha.indexOf("input[")+6, linha.lastIndexOf("]."));
			inputField = "true";
			memoria += "<br>"+">>";
			initConsole.console.setText("<font size='5'>"+memoria+"</font>");
			
			
			
			
			
			
			textField = new JTextField();
			textField.setText("");
			textField.setEditable(true);
			textField.setBackground(Color.white);
			textField.setForeground(Color.blue);
			textField.setBorder(null);
			initConsole.console.add(textField);
			
			
			
			new Thread(new Runnable(){
				@Override
				public void run(){
					initConsole.console.addMouseListener(new MouseListener() {
						
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent e) {
							
									Point posit = initConsole.console.getMousePosition();
									getX = (int) posit.getX();
									getY = (int) posit.getY();
									textField.setBounds(getX-5, getY-10, 600, 20);
								
							
						}
						
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
				}
			}).start();
			
			
			
			
	
			
			tecEnter = false;
			
			new Thread(new Runnable(){
				@Override
				public void run(){
					textField.addKeyListener(new KeyListener() {
						
						@Override
						public void keyTyped(KeyEvent e) {
							
							
						}
						
						@Override
						public void keyReleased(KeyEvent e) {
							
							
						}
						
						@Override
						public void keyPressed(KeyEvent e) {
							
							if(e.getKeyCode() == KeyEvent.VK_ENTER){
								inputVar();
							
								textField.setEditable(false);
								tecEnter = true;
							}
							
						}
					});
				}
			}).start();
			
			
			while(tecEnter==false){}
			tecEnter = false;
			
			linha = scan.nextLine();
			textField = new JTextField();
		}
		//Fim função de entrada no lineAnalysis

		
		/*if(lang.equals("read")){
			
			
			while(!linha.contains("exec[call["+call+"]].")){
				
				linha = lerArq.readLine();
				
				
			}
			
			lang = "normal";
			if(linha.contains("exec[call["+call+"]].")){
				linha = lerArq.readLine();
				
			
			}
		
	}*/
		//Estrutura de repetição
		if(linha.contains("while[")){
			
			whil = linha.substring(linha.indexOf("while[")+5, linha.lastIndexOf("]")+1);
			
			if(whil.contains("<")){
				signal = "<";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<")).trim();
				if2 = whil.substring(whil.indexOf("<")+1, whil.lastIndexOf("]")).trim();
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)<integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains(">")){
				signal = ">";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">"));
				if2 = whil.substring(whil.indexOf(">")+1, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)>integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains("==")){
				signal = "==";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("=="));
				if2 = whil.substring(whil.indexOf("==")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)==integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains("<=")){
				signal = "<=";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<="));
				if2 = whil.substring(whil.indexOf("<=")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)<=integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains(">=")){
				signal = ">=";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">="));
				if2 = whil.substring(whil.indexOf(">=")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)>=integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains("!=")){
				signal = "!=";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("!="));
				if2 = whil.substring(whil.indexOf("!=")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)!=integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-is-")){
				signal = "-is-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-is-"));
				if2 = whil.substring(whil.indexOf("-is-")+4, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(if1.equals(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-not-")){
				signal = "-not-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-not-"));
				if2 = whil.substring(whil.indexOf("-not-")+5, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(!if1.equals(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-has-")){
				signal = "-has-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-has-"));
				if2 = whil.substring(whil.indexOf("-has-")+5, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(if1.contains(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-hasnt-")){
				signal = "-hasnt-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-hasnt-"));
				if2 = whil.substring(whil.indexOf("-hasnt-")+7, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(!if1.contains(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(situation.equals("selfPath")){
				scan = new Scanner(new File(paths));
			}else{
				if(situation.equals("otherPath")){
					//alterar getPath no desenvolvimento "C:\\Users\\Casa-Pc\\Desktop"
					scan = new Scanner(new File(getPath+"\\Plax\\"+funcFile+".plax"));
				}
			}
			if(condWhile==true){
				while(condWhile==true){
					
					if(situation.equals("selfPath")){
						scan = new Scanner(new File(paths));
					}else{
						if(situation.equals("otherPath")){
							//alterar getPath no desenvolvimento "C:\\Users\\Casa-Pc\\Desktop"
							scan = new Scanner(new File(getPath+"\\Plax\\"+funcFile+".plax"));
						}
					}
					
					linha = scan.nextLine();
					
					if(condWhile==true){
					
					
					
					while(!linha.contains("while["+ifVar1+signal+ifVar2)){
						
						linha = scan.nextLine();
						
						if(linha.contains("while[")){
							whil = linha.substring(linha.indexOf("while[")+5, linha.lastIndexOf("]")+1);
							
							if(whil.contains("<")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<"));
								if2 = whil.substring(whil.indexOf("<")+1, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)<integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains(">")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">"));
								if2 = whil.substring(whil.indexOf(">")+1, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)>integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains("==")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("=="));
								if2 = whil.substring(whil.indexOf("==")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)==integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains("<=")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<="));
								if2 = whil.substring(whil.indexOf("<=")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)<=integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains(">=")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">="));
								if2 = whil.substring(whil.indexOf(">=")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)>=integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains("!=")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("!="));
								if2 = whil.substring(whil.indexOf("!=")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)!=integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-is-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-is-"));
								if2 = whil.substring(whil.indexOf("-is-")+4, whil.lastIndexOf("]"));
								ifVar1 = if1;
								ifVar2 = if2;
								if(if1.equals(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-not-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-not-"));
								if2 = whil.substring(whil.indexOf("-not-")+5, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(!if1.equals(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-has-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-has-"));
								if2 = whil.substring(whil.indexOf("-has-")+5, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(if1.contains(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-hasnt-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-hasnt-"));
								if2 = whil.substring(whil.indexOf("-hasnt-")+7, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(!if1.contains(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
						}
						
					}//Segundo while whilePlax
					
					if(condWhile==true){
						while(!linha.contains("endWhile")){
							
							linha = scan.nextLine();
							
							LineAnalysis();
						}
						
					}
					else{
						while(!linha.contains("endWhile")){
							linha = scan.nextLine();
							
						}
						
					}
					
					}//if condWhile true
					
				}//primeiro while whilePlax
			
			}//if condWhile true
			else{
				while(!linha.contains("endWhile")){
					linha = lerArq.readLine();
				}
				
			}
			
		}
		//Fim Estrutura de repetição
		
		//Leitura de sub-rotinas no lineAnalysis
		if(!linha.contains("/") && linha.contains("[") && linha.contains("].") && linha.contains("_") && !linha.contains("[[")){
			subLine = linha.substring(linha.indexOf("_"), linha.lastIndexOf("[")+1);
			
		}
		if(!linha.contains("/") && linha.contains("[") && linha.contains("].") && linha.contains("_") && linha.contains("[[")){
			subLine = linha.substring(linha.indexOf("_"), linha.lastIndexOf("["));
			
		}
		
		if(!linha.contains("/") && saveFunc.trim().contains(subLine) && linha.contains("[") && linha.contains("].") && linha.contains("_")){
		
			armazenFunctions = linha;
			identFunc = true;
			String function = linha.trim();
			int sizeSubLine = subLine.length();
			argLine = linha.substring(linha.indexOf(subLine)+sizeSubLine, linha.lastIndexOf("]."));
			
			
			if(situation.equals("selfPath")){
				scan = new Scanner(new File(paths));
			}else{
				if(situation.equals("otherPath")){
					//alterar getPath no desenvolvimento "C:\\Users\\Casa-Pc\\Desktop"
					scan = new Scanner(new File(getPath+"\\Plax\\"+funcFile+".plax"));
				}
			}
			linha = scan.nextLine();
			while(!linha.contains("func "+subLine)){
				linha = scan.nextLine();
				
				if(linha.contains("func "+subLine)){
					
					variable = linha.substring(linha.indexOf(subLine)+sizeSubLine, linha.lastIndexOf("]."));
					if(argLine.contains("[") && argLine.contains("]")){
					
						valOp = argLine.substring(argLine.indexOf("["), argLine.lastIndexOf("]")+1);
						if(argLine.contains("+")){
							addictionVars();
						}else
						if(argLine.contains("-")){
							subtractionVars();
						}else
						if(argLine.contains("*")){
							multiVars();
						}else
						if(argLine.contains("/")){
							divisionVars();
						}
						if(argLine.contains("<")){
							lessOp();
						}
						if(argLine.contains(">")){
							moreOp();
						}
						if(argLine.contains("==")){
							compareOp();
						}
						if(argLine.contains("!=")){
							differentOp();
						}
						
					}else{
						
						variable = linha.substring(linha.indexOf(subLine)+sizeSubLine, linha.lastIndexOf("]."));
						
						argFuncVars();
					}
				}
			}
			
			while(!linha.contains("endFunc")){
				linha = scan.nextLine();
				LineAnalysis();
				
				if(linha.contains("$endFunc")){
					identFunc = false;
				}
				if(linha.contains("endFunc")){
					if(identFunc==true){
						while(!linha.contains(armazenFunctions)){
							linha = scan.nextLine();
							
						}
					}
				}
				
			}
			
		}
		
		
		if(linha.contains("/") && linha.trim().contains("_") && linha.contains("[") && linha.contains("].") && linha.contains("_")){
			
			funcFile = linha.substring(linha.indexOf("/")+1, linha.lastIndexOf("/"));
			String function = linha.substring(linha.indexOf("/_")+1, linha.lastIndexOf("[")).trim();
			getPath = new File("").getAbsolutePath();
			
			int sizeSubLine = function.length();
			argLine = linha.substring(linha.indexOf(function)+sizeSubLine, linha.lastIndexOf("]."));
			
			//Alterar caminho
			if(situation.equals("selfPath")){
				scan = new Scanner(new File(paths));
			}else{
				if(situation.equals("otherPath")){
					//alterar getPath no desenvolvimento "C:\\Users\\Casa-Pc\\Desktop"
					scan = new Scanner(new File(getPath+"\\Plax\\"+funcFile+".plax"));
				}
			}
			linha = scan.nextLine();
			while(!linha.contains("func "+function)){
				linha = scan.nextLine();
				
				if(linha.contains("func "+function)){
					
					variable = linha.substring(linha.indexOf(function)+sizeSubLine, linha.lastIndexOf("]."));
					if(argLine.contains("[") && argLine.contains("]")){
						
						valOp = argLine.substring(argLine.indexOf("["), argLine.lastIndexOf("]")+1);
						
						if(argLine.contains("+")){
							addictionVars();
						}else
						if(argLine.contains("-")){
							subtractionVars();
						}else
						if(argLine.contains("*")){
							multiVars();
						}else
						if(argLine.contains("/")){
							divisionVars();
						}
						if(argLine.contains("<")){
							lessOp();
						}
						if(argLine.contains(">")){
							moreOp();
						}
						if(argLine.contains("==")){
							compareOp();
						}
						if(argLine.contains("!=")){
							differentOp();
						}
					}else{
						variable = linha.substring(linha.indexOf(function)+sizeSubLine, linha.lastIndexOf("]."));
						argFuncVars();
					}
				}
			}
			
			while(!linha.contains("endFunc")){
				linha = scan.nextLine();
				LineAnalysis();
				
			}
			
		}
		//Fim leitura de sub-rotinas no lineAnalysis
		
		//Estruturas de condição em LineAnalysis
		if(linha.contains("if[")){
			if0 = linha.substring(linha.indexOf("if")+2, linha.indexOf("].")+1);
			if(!if0.contains("and") && !if0.contains("or")){
			if(if0.contains("<")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("<"));
				if2 = if0.substring(if0.indexOf("<")+1, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(integers(if1) < integers(if2)){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
			if(if0.contains(">")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf(">"));
				if2 = if0.substring(if0.indexOf(">")+1, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(integers(if1) > integers(if2)){
					condition = "true";
				}else{
					condition = "false";
				}
			}
			if(if0.contains("==")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("=="));
				if2 = if0.substring(if0.indexOf("==")+2, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(integers(if1) == integers(if2)){
					condition = "true";
				}else{
					condition = "false";
				}
			}
			if(if0.contains("!=")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("!="));
				if2 = if0.substring(if0.indexOf("!=")+2, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(integers(if1) != integers(if2)){
					condition = "true";
				}else{
					condition = "false";
				}
				
			}
			if(if0.contains("<=")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("<="));
				if2 = if0.substring(if0.indexOf("<=")+2, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(integers(if1) <= integers(if2)){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
			if(if0.contains(">=")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf(">="));
				if2 = if0.substring(if0.indexOf(">=")+2, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(integers(if1) >= integers(if2)){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
			if(if0.contains("-is-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-is-"));
				if2 = if0.substring(if0.indexOf("-is-")+4, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(if1.trim().equals(if2.trim())){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
			if(if0.contains("-not-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-not-"));
				if2 = if0.substring(if0.indexOf("-not-")+5, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(!if1.trim().equals(if2.trim())){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
			if(if0.contains("-has-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-has-"));
				if2 = if0.substring(if0.indexOf("-has-")+5, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(if1.trim().contains(if2.trim())){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
			if(if0.contains("-hasnt-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-hasnt-"));
				if2 = if0.substring(if0.indexOf("-hasnt-")+7, if0.lastIndexOf("]"));
				
				firstIfVar();
				secondIfVar();
				
				if(!if1.trim().contains(if2.trim())){
					condition = "true";
				}else{
					condition = "false"; 
				}
			}
		}
			
			if(if0.contains("and")){
				ol1 = if0.substring(if0.indexOf("[[")+1, if0.lastIndexOf("and"));
				ol2 = if0.substring(if0.indexOf("and")+3, if0.lastIndexOf("]]")+1);
				
				if(ol1.contains("<")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<"));
					if2 = ol1.substring(ol1.indexOf("<")+1, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				
				
				if(ol1.contains(">")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">"));
					if2 = ol1.substring(ol1.indexOf(">")+1, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("<=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<="));
					if2 = ol1.substring(ol1.indexOf("<=")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				if(ol1.contains(">=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">="));
					if2 = ol1.substring(ol1.indexOf(">=")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("==")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("=="));
					if2 = ol1.substring(ol1.indexOf("==")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("!=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("!="));
					if2 = ol1.substring(ol1.indexOf("!=")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				if(ol1.contains("-is-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-is-"));
					if2 = ol1.substring(ol1.indexOf("-is-")+4, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-not-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-not-"));
					if2 = ol1.substring(ol1.indexOf("-not-")+5, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-has-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-has-"));
					if2 = ol1.substring(ol1.indexOf("-has-")+5, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-hasnt-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-hasnt-"));
					if2 = ol1.substring(ol1.indexOf("-hasnt-")+7, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				
			}
			
			if(if0.contains("or")){
				ol1 = if0.substring(if0.indexOf("[[")+1, if0.lastIndexOf("or"));
				ol2 = if0.substring(if0.indexOf("or")+2, if0.lastIndexOf("]]")+1);
				
				if(ol1.contains("<")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<"));
					if2 = ol1.substring(ol1.indexOf("<")+1, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains(">")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">"));
					if2 = ol1.substring(ol1.indexOf(">")+1, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("<=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<="));
					if2 = ol1.substring(ol1.indexOf("<=")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				if(ol1.contains(">=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">="));
					if2 = ol1.substring(ol1.indexOf(">=")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("==")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("=="));
					if2 = ol1.substring(ol1.indexOf("==")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("!=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("!="));
					if2 = ol1.substring(ol1.indexOf("!=")+2, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				if(ol1.contains("-is-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-is-"));
					if2 = ol1.substring(ol1.indexOf("-is-")+4, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-not-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-not-"));
					if2 = ol1.substring(ol1.indexOf("-not-")+5, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-has-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-has-"));
					if2 = ol1.substring(ol1.indexOf("-has-")+5, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-hasnt-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-hasnt-"));
					if2 = ol1.substring(ol1.indexOf("-hasnt-")+7, ol1.lastIndexOf("]"));
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<"));
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">"));
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("=="));
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!="));
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<="));
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">="));
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-"));
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-"));
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-"));
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-"));
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]"));
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				
			}
		}
		
		if(condition.equals("true") || condition1.equals("true")){
			
			if(linha.contains("else")){
			
				
				while(!linha.contains("endElse")){
					linha = scan.nextLine();
				}
				
				condition = "";
				condition1 = "";
			}
			
		}else{
			if(condition.equals("false") || condition1.equals("false")){
				
				while(!linha.contains("else")){
					
					linha = scan.nextLine();
					
				}
				
				if(linha.contains("else")){
					linha = scan.nextLine();
				}
				
				condition = "";
				condition1 = "";
			}
		}
		//Fim Estruturas de condição lineAnalysis
		
		//Debugador printer no lineAnalysis
		if(linha.contains("sis")){
	
				if(!linha.contains(".")){
					new Thread(new Runnable(){
						@Override
						public void run(){
							errorCode(codeLine+1);
							initConsole.console.setText("");
							initConsole.setVisible(false);
						}
					}).start();
				
					
				
				}
			
			
		}
		
		if(linha.contains("sis")){
			if(!linha.contains("[") || !linha.contains("]")){
				new Thread(new Runnable(){
					@Override
					public void run(){
						errorCode(codeLine+1);
						initConsole.console.setText("");
						initConsole.setVisible(false);
					}
				}).start();
			
				
				
			}
			
		}
		//fim Debugador printer no lineAnalysis
		
		
		//Função de extração no lineAnalysis
		if(linha.contains("extract[")){
					String from = "";
					String dir = "";
					String to = "";
					String extract = "";
					String action = "";
					extract = linha.substring(linha.indexOf("extract[")+8, linha.lastIndexOf("]."));

					if(extract.contains("from{")){
						from = extract.substring(extract.indexOf("from{")+5, extract.lastIndexOf("}from"));
					}
					if(extract.contains("to{")){
						to = extract.substring(extract.indexOf("to{")+3, extract.lastIndexOf("}to"));
					}
					if(extract.contains("dir{")){
						dir = extract.substring(extract.indexOf("dir{")+4, extract.lastIndexOf("}dir"));
						
					}
					if(extract.contains("action[")){
						action = extract.substring(extract.indexOf("action[")+7, extract.lastIndexOf("]"));
						
						if(action.equals("html")){
							if(from.equals("console") && to.equals("file")){
								File fw = new File(dir);
								PrintWriter pw = new PrintWriter(fw);
								pw.print(initConsole.console.getText());
								pw.print("<b>Pagina html gerada pelo arquivo plax: '"+paths+"'</b>");
								pw.close();
							}
							if(from.equals("file") && to.equals("console")){
								File fir = new File(dir);
								FileReader fr = new FileReader(fir);
								BufferedReader br = new BufferedReader(fr);
								String htmlFile = br.readLine();
								while(!htmlFile.contains("<body")){
									htmlFile = br.readLine();
								}
								while(!htmlFile.contains("</body>")){
									htmlFile = br.readLine();
									memoria += htmlFile;
								}
								br.close();
							}
							
						}
						if(action.equals("text")){
							
							
						}
						
						
					}
					
				}
				//fim função de extração no lineAnalysis
		
		//Layout do console
		String consoleBackground = "";
		if(linha.contains("#background")){
			consoleBackground = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
			
			if(consoleBackground.contains("blue")){
				initConsole.console.setBackground(Color.blue);
				
			}else{
				if(consoleBackground.contains("red")){
					initConsole.console.setBackground(Color.red);
				
				}else{
					if(consoleBackground.contains("gray")){
						initConsole.console.setBackground(Color.gray);
						
					}else{
						if(consoleBackground.contains("black")){
							initConsole.console.setBackground(Color.black);
							
						}else{
							if(consoleBackground.contains("yellow")){
								initConsole.console.setBackground(Color.yellow);
								
							}else{
								if(consoleBackground.contains("darkgray")){
									initConsole.console.setBackground(Color.DARK_GRAY);
									
								}else{
									if(consoleBackground.contains("cyan")){
										initConsole.console.setBackground(Color.CYAN);
										
									}else{
										if(consoleBackground.contains("green")){
											initConsole.console.setBackground(Color.green);
											
										}else{
											if(consoleBackground.contains("magenta")){
												initConsole.console.setBackground(Color.magenta);
												
											}else{
												if(consoleBackground.contains("orange")){
													initConsole.console.setBackground(Color.orange);
													
												}else{
													if(consoleBackground.contains("pink")){
														initConsole.console.setBackground(Color.pink);
														
													}else{
														if(consoleBackground.contains("white")){
															initConsole.console.setBackground(Color.white);
															
														}
													}}}}}}}}}}}
		}
		
		String consoleForeground = "";
		if(linha.contains("#foreground")){
			consoleForeground = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
			
			if(consoleForeground.contains("blue")){
				memoria += "<font color='blue'>";
			}else{
				if(consoleForeground.contains("red")){
					memoria += "<font color='red'>";
				}else{
					if(consoleForeground.contains("black")){
						memoria += "<font color='black'>";
					}else{
							if(consoleForeground.contains("gray")){
								memoria += "<font color='gray'>";
							}else{
								if(consoleForeground.contains("yellow")){
									memoria += "<font color='yellow'>";
								}else{
									if(consoleForeground.contains("darkgray")){
										memoria += "<font color='darkgray'>";
									}else{
										if(consoleForeground.contains("cyan")){
											memoria += "<font color='cyan'>";
										}else{
											if(consoleForeground.contains("green")){
												memoria += "<font color='green'>";
											}else{
												if(consoleForeground.contains("magenta")){
													memoria += "<font color='magenta'>";
												}else{
													if(consoleForeground.contains("orange")){
														memoria += "<font color='orange'>";
													}else{
														if(consoleForeground.contains("pink")){
															memoria += "<font color='pink'>";
														}else{
															if(consoleForeground.contains("white")){
																memoria += "<font color='white'>";
															}
														}}}}}}}}}}}
		}
		//Fim layout do console
		
		//Função de chamada de algoritmo 'call'
			String getCaminho = new File("").getAbsolutePath();
				if(linha.contains("call[")){
						call  = linha.substring(linha.indexOf("call[")+5, linha.lastIndexOf("]"));
						try {
							
							langPlax1(getCaminho+"\\Plax\\"+call);
						} catch (IOException e) {}
						
				}
		
		//Função de execução cmd 'prompt'
		if(linha.contains("prompt[")){
			String prompt = linha.substring(linha.indexOf("prompt[")+7, linha.lastIndexOf("]"));
			Runtime.getRuntime().exec("CMD /c "+prompt);
			
		}
		
		
		//Lexer do armazenamento de variaveis
		if(linha.contains("@") & linha.contains(":")){
			if(linha.contains("::")){
				variable = linha.substring(linha.indexOf("@"), linha.indexOf("::")-1);
				val = linha.substring(linha.indexOf("::")+3, linha.indexOf("."));
				acres = "yes";
			}else{
				if(linha.contains(":")){
					variable = linha.substring(linha.indexOf("@"), linha.indexOf(":")-1);
					val = linha.substring(linha.indexOf(":")+2, linha.indexOf("."));
					acres = "no";
				}
			}
			
			if(val.contains("type[")){
				String typeOf = linha.substring(linha.indexOf("type[")+5, linha.lastIndexOf("]."));
					
				if(typeOf.contains("@")){
					String endTyp = "}"+typeOf;
					String typ1 = typ.substring(typ.indexOf(typeOf+"{")+4, typ.lastIndexOf(endTyp));
					val = typ1;	
					
				}
			}
			
			
			if(val.contains("getDir[]")){
				String file = new File("").getAbsolutePath();
				val = file;
			}
			if(val.contains("getFile[]")){
				val = paths.substring(paths.indexOf("\\Plax\\")+6, paths.lastIndexOf(".plax")+5);
			}
			
			if(val.contains("getTime[")){
				if(linha.contains("getTime[]")){
					val = System.currentTimeMillis()+"";
				}else
					if(!linha.substring(linha.indexOf("getTime[")+8).contains("]")){
						String paramTime = linha.substring(linha.indexOf("getTime[")+8, linha.lastIndexOf("]."));
						long addTime = System.currentTimeMillis()+integers(paramTime);
						val = addTime+"";
					}
				
			}
			
			if(val.contains("fix[") && !val.contains("cap")){
				fix = val.substring(val.indexOf("fix[")+4, val.lastIndexOf("]"));
				
				fixValue();
				PrintWriter printFix = new PrintWriter(getPath+"\\Plax\\config\\"+variable+".pfv");
				printFix.println(variable+"["+fix+"]");
				printFix.close();
			}
			
			if(val.contains("capFix[")){
				String capFix = val.substring(val.indexOf("capFix[")+7, val.lastIndexOf("]"));
				FileReader readFix = new FileReader(getPath+"\\Plax\\config\\"+capFix+".pfv");
				BufferedReader bufFix = new BufferedReader(readFix);
				String lineFix = bufFix.readLine();
			
				String subFix = lineFix.substring(lineFix.indexOf(capFix+"[")+4, lineFix.lastIndexOf("]"));
				val = subFix;
				readFix.close();
				
			}
			
			if(val.contains("reg[")){
				String position = linha.substring(linha.indexOf("reg[")+4, linha.lastIndexOf("].")).trim();
				
				if(position.contains("@")){
					if(position.contains("@a0")){position = a0;}
					if(position.contains("@a1")){position = a1;}
					if(position.contains("@a2")){position = a2;}
					if(position.contains("@a3")){position = a3;}
					if(position.contains("@a4")){position = a4;}
					if(position.contains("@a5")){position = a5;}
					if(position.contains("@a6")){position = a6;}
					if(position.contains("@a7")){position = a7;}
					if(position.contains("@a8")){position = a8;}
					if(position.contains("@a9")){position = a9;}
					
					if(position.contains("@b0")){position = b0;}
					if(position.contains("@b1")){position = b1;}
					if(position.contains("@b2")){position = b2;}
					if(position.contains("@b3")){position = b3;}
					if(position.contains("@b4")){position = b4;}
					if(position.contains("@b5")){position = b5;}
					if(position.contains("@b6")){position = b6;}
					if(position.contains("@b7")){position = b7;}
					if(position.contains("@b8")){position = b8;}
					if(position.contains("@b9")){position = b9;}
					
					if(position.contains("@c0")){position = c0;}
					if(position.contains("@c1")){position = c1;}
					if(position.contains("@c2")){position = c2;}
					if(position.contains("@c3")){position = c3;}
					if(position.contains("@c4")){position = c4;}
					if(position.contains("@c5")){position = c5;}
					if(position.contains("@c6")){position = c6;}
					if(position.contains("@c7")){position = c7;}
					if(position.contains("@c8")){position = c8;}
					if(position.contains("@c9")){position = c9;}
					
					if(position.contains("@d0")){position = d0;}
					if(position.contains("@d1")){position = d1;}
					if(position.contains("@d2")){position = d2;}
					if(position.contains("@d3")){position = d3;}
					if(position.contains("@d4")){position = d4;}
					if(position.contains("@d5")){position = d5;}
					if(position.contains("@d6")){position = d6;}
					if(position.contains("@d7")){position = d7;}
					if(position.contains("@d8")){position = d8;}
					if(position.contains("@d9")){position = d9;}
					
					if(position.contains("@e0")){position = e0;}
					if(position.contains("@e1")){position = e1;}
					if(position.contains("@e2")){position = e2;}
					if(position.contains("@e3")){position = e3;}
					if(position.contains("@e4")){position = e4;}
					if(position.contains("@e5")){position = e5;}
					if(position.contains("@e6")){position = e6;}
					if(position.contains("@e7")){position = e7;}
					if(position.contains("@e8")){position = e8;}
					if(position.contains("@e9")){position = e9;}
					
					if(position.contains("@f0")){position = f0;}
					if(position.contains("@f1")){position = f1;}
					if(position.contains("@f2")){position = f2;}
					if(position.contains("@f3")){position = f3;}
					if(position.contains("@f4")){position = f4;}
					if(position.contains("@f5")){position = f5;}
					if(position.contains("@f6")){position = f6;}
					if(position.contains("@f7")){position = f7;}
					if(position.contains("@f8")){position = f8;}
					if(position.contains("@f9")){position = f9;}
					
					if(position.contains("@g0")){position = g0;}
					if(position.contains("@g1")){position = g1;}
					if(position.contains("@g2")){position = g2;}
					if(position.contains("@g3")){position = g3;}
					if(position.contains("@g4")){position = g4;}
					if(position.contains("@g5")){position = g5;}
					if(position.contains("@g6")){position = g6;}
					if(position.contains("@g7")){position = g7;}
					if(position.contains("@g8")){position = g8;}
					if(position.contains("@g9")){position = g9;}
					
					if(position.contains("@h0")){position = h0;}
					if(position.contains("@h1")){position = h1;}
					if(position.contains("@h2")){position = h2;}
					if(position.contains("@h3")){position = h3;}
					if(position.contains("@h4")){position = h4;}
					if(position.contains("@h5")){position = h5;}
					if(position.contains("@h6")){position = h6;}
					if(position.contains("@h7")){position = h7;}
					if(position.contains("@h8")){position = h8;}
					if(position.contains("@h9")){position = h9;}
					
					if(position.contains("@i0")){position = i0;}
					if(position.contains("@i1")){position = i1;}
					if(position.contains("@i2")){position = i2;}
					if(position.contains("@i3")){position = i3;}
					if(position.contains("@i4")){position = i4;}
					if(position.contains("@i5")){position = i5;}
					if(position.contains("@i6")){position = i6;}
					if(position.contains("@i7")){position = i7;}
					if(position.contains("@i8")){position = i8;}
					if(position.contains("@i9")){position = i9;}
					
					if(position.contains("@j0")){position = j0;}
					if(position.contains("@j1")){position = j1;}
					if(position.contains("@j2")){position = j2;}
					if(position.contains("@j3")){position = j3;}
					if(position.contains("@j4")){position = j4;}
					if(position.contains("@j5")){position = j5;}
					if(position.contains("@j6")){position = j6;}
					if(position.contains("@j7")){position = j7;}
					if(position.contains("@j8")){position = j8;}
					if(position.contains("@j9")){position = j9;}
					
					if(position.contains("@k0")){position = k0;}
					if(position.contains("@k1")){position = k1;}
					if(position.contains("@k2")){position = k2;}
					if(position.contains("@k3")){position = k3;}
					if(position.contains("@k4")){position = k4;}
					if(position.contains("@k5")){position = k5;}
					if(position.contains("@k6")){position = k6;}
					if(position.contains("@k7")){position = k7;}
					if(position.contains("@k8")){position = k8;}
					if(position.contains("@k9")){position = k9;}
					
					if(position.contains("@l0")){position = l0;}
					if(position.contains("@l1")){position = l1;}
					if(position.contains("@l2")){position = l2;}
					if(position.contains("@l3")){position = l3;}
					if(position.contains("@l4")){position = l4;}
					if(position.contains("@l5")){position = l5;}
					if(position.contains("@l6")){position = l6;}
					if(position.contains("@l7")){position = l7;}
					if(position.contains("@l8")){position = l8;}
					if(position.contains("@l9")){position = l9;}
					
					if(position.contains("@m0")){position = m0;}
					if(position.contains("@m1")){position = m1;}
					if(position.contains("@m2")){position = m2;}
					if(position.contains("@m3")){position = m3;}
					if(position.contains("@m4")){position = m4;}
					if(position.contains("@m5")){position = m5;}
					if(position.contains("@m6")){position = m6;}
					if(position.contains("@m7")){position = m7;}
					if(position.contains("@m8")){position = m8;}
					if(position.contains("@m9")){position = m9;}
					
					if(position.contains("@n0")){position = n0;}
					if(position.contains("@n1")){position = n1;}
					if(position.contains("@n2")){position = n2;}
					if(position.contains("@n3")){position = n3;}
					if(position.contains("@n4")){position = n4;}
					if(position.contains("@n5")){position = n5;}
					if(position.contains("@n6")){position = n6;}
					if(position.contains("@n7")){position = n7;}
					if(position.contains("@n8")){position = n8;}
					if(position.contains("@n9")){position = n9;}
					
					if(position.contains("@o0")){position = o0;}
					if(position.contains("@o1")){position = o1;}
					if(position.contains("@o2")){position = o2;}
					if(position.contains("@o3")){position = o3;}
					if(position.contains("@o4")){position = o4;}
					if(position.contains("@o5")){position = o5;}
					if(position.contains("@o6")){position = o6;}
					if(position.contains("@o7")){position = o7;}
					if(position.contains("@o8")){position = o8;}
					if(position.contains("@o9")){position = o9;}
					
					if(position.contains("@p0")){position = p0;}
					if(position.contains("@p1")){position = p1;}
					if(position.contains("@p2")){position = p2;}
					if(position.contains("@p3")){position = p3;}
					if(position.contains("@p4")){position = p4;}
					if(position.contains("@p5")){position = p5;}
					if(position.contains("@p6")){position = p6;}
					if(position.contains("@p7")){position = p7;}
					if(position.contains("@p8")){position = p8;}
					if(position.contains("@p9")){position = p9;}
					
					if(position.contains("@q0")){position = q0;}
					if(position.contains("@q1")){position = q1;}
					if(position.contains("@q2")){position = q2;}
					if(position.contains("@q3")){position = q3;}
					if(position.contains("@q4")){position = q4;}
					if(position.contains("@q5")){position = q5;}
					if(position.contains("@q6")){position = q6;}
					if(position.contains("@q7")){position = q7;}
					if(position.contains("@q8")){position = q8;}
					if(position.contains("@q9")){position = q9;}
					
					if(position.contains("@r0")){position = r0;}
					if(position.contains("@r1")){position = r1;}
					if(position.contains("@r2")){position = r2;}
					if(position.contains("@r3")){position = r3;}
					if(position.contains("@r4")){position = r4;}
					if(position.contains("@r5")){position = r5;}
					if(position.contains("@r6")){position = r6;}
					if(position.contains("@r7")){position = r7;}
					if(position.contains("@r8")){position = r8;}
					if(position.contains("@r9")){position = r9;}
					
					if(position.contains("@s0")){position = s0;}
					if(position.contains("@s1")){position = s1;}
					if(position.contains("@s2")){position = s2;}
					if(position.contains("@s3")){position = s3;}
					if(position.contains("@s4")){position = s4;}
					if(position.contains("@s5")){position = s5;}
					if(position.contains("@s6")){position = s6;}
					if(position.contains("@s7")){position = s7;}
					if(position.contains("@s8")){position = s8;}
					if(position.contains("@s9")){position = s9;}
					
					if(position.contains("@t0")){position = t0;}
					if(position.contains("@t1")){position = t1;}
					if(position.contains("@t2")){position = t2;}
					if(position.contains("@t3")){position = t3;}
					if(position.contains("@t4")){position = t4;}
					if(position.contains("@t5")){position = t5;}
					if(position.contains("@t6")){position = t6;}
					if(position.contains("@t7")){position = t7;}
					if(position.contains("@t8")){position = t8;}
					if(position.contains("@t9")){position = t9;}
					
					if(position.contains("@u0")){position = u0;}
					if(position.contains("@u1")){position = u1;}
					if(position.contains("@u2")){position = u2;}
					if(position.contains("@u3")){position = u3;}
					if(position.contains("@u4")){position = u4;}
					if(position.contains("@u5")){position = u5;}
					if(position.contains("@u6")){position = u6;}
					if(position.contains("@u7")){position = u7;}
					if(position.contains("@u8")){position = u8;}
					if(position.contains("@u9")){position = u9;}
					
					if(position.contains("@v0")){position = v0;}
					if(position.contains("@v1")){position = v1;}
					if(position.contains("@v2")){position = v2;}
					if(position.contains("@v3")){position = v3;}
					if(position.contains("@v4")){position = v4;}
					if(position.contains("@v5")){position = v5;}
					if(position.contains("@v6")){position = v6;}
					if(position.contains("@v7")){position = v7;}
					if(position.contains("@v8")){position = v8;}
					if(position.contains("@v9")){position = v9;}
					
					if(position.contains("@w0")){position = w0;}
					if(position.contains("@w1")){position = w1;}
					if(position.contains("@w2")){position = w2;}
					if(position.contains("@w3")){position = w3;}
					if(position.contains("@w4")){position = w4;}
					if(position.contains("@w5")){position = w5;}
					if(position.contains("@w6")){position = w6;}
					if(position.contains("@w7")){position = w7;}
					if(position.contains("@w8")){position = w8;}
					if(position.contains("@w9")){position = w9;}
					
					if(position.contains("@x0")){position = x0;}
					if(position.contains("@x1")){position = x1;}
					if(position.contains("@x2")){position = x2;}
					if(position.contains("@x3")){position = x3;}
					if(position.contains("@x4")){position = x4;}
					if(position.contains("@x5")){position = x5;}
					if(position.contains("@x6")){position = x6;}
					if(position.contains("@x7")){position = x7;}
					if(position.contains("@x8")){position = x8;}
					if(position.contains("@x9")){position = x9;}
					
					if(position.contains("@y0")){position = y0;}
					if(position.contains("@y1")){position = y1;}
					if(position.contains("@y2")){position = y2;}
					if(position.contains("@y3")){position = y3;}
					if(position.contains("@y4")){position = y4;}
					if(position.contains("@y5")){position = y5;}
					if(position.contains("@y6")){position = y6;}
					if(position.contains("@y7")){position = y7;}
					if(position.contains("@y8")){position = y8;}
					if(position.contains("@y9")){position = y9;}
					
					if(position.contains("@z0")){position = z0;}
					if(position.contains("@z1")){position = z1;}
					if(position.contains("@z2")){position = z2;}
					if(position.contains("@z3")){position = z3;}
					if(position.contains("@z4")){position = z4;}
					if(position.contains("@z5")){position = z5;}
					if(position.contains("@z6")){position = z6;}
					if(position.contains("@z7")){position = z7;}
					if(position.contains("@z8")){position = z8;}
					if(position.contains("@z9")){position = z9;}
				}
				
				val = vetor[integers(position)];
				
			}
			
			if(val.contains("[") && val.contains("]") && !val.contains("getFile[]") && !val.contains("reg[")){
				valOp = val.substring(val.indexOf("["), val.lastIndexOf("]")+1);
				if(val.contains("+")){
					addictionVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}else
				if(val.contains("-")){
					subtractionVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}else
				if(val.contains("*")){
					multiVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}else
				if(val.contains("/")){
					divisionVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}
				if(val.contains("<")){
					lessOp();
					
				}
				if(val.contains(">")){
					moreOp();
					
				}
				if(val.contains("==")){
					compareOp();
					
				}
				if(val.contains("!=")){
					differentOp();
					
				}
			}else{
				
				if(!val.contains("@")){
					bin = "";
					int valLen = val.length();
					if(valLen >= 8){
						if(val.contains("0") && val.contains("1") && !val.contains("2") && !val.contains("3")  && !val.contains("4")  && !val.contains("5")  && !val.contains("6")  && !val.contains("7")  && !val.contains("8")  && !val.contains("9")){
							bin = "true";
						}else{
							bin = "false";
						}
					}else{
				
							bin = "false";
						
					}
					
					
					if(val.contains("0") || val.contains("1") || val.contains("2") || val.contains("3") || val.contains("4") || val.contains("5") || val.contains("6") || val.contains("7") || val.contains("8") || val.contains("9")){
						
						
						if(!val.contains("a") && !val.contains("b") && !val.contains("c") && !val.contains("d") && !val.contains("e") && !val.contains("f") && !val.contains("g") && !val.contains("h") && !val.contains("i") && !val.contains("j") && !val.contains("k") && !val.contains("l") && !val.contains("m") && !val.contains("n") && !val.contains("o") && !val.contains("p") && !val.contains("q") && !val.contains("r") && !val.contains("s") && !val.contains("t") && !val.contains("u") && !val.contains("v") && !val.contains("w") && !val.contains("x") && !val.contains("y") && !val.contains("z") && !val.contains("A") && !val.contains("B") && !val.contains("C") && !val.contains("D") && !val.contains("E") && !val.contains("F") && !val.contains("G") && !val.contains("H") && !val.contains("I") && !val.contains("J") && !val.contains("K") && !val.contains("L") && !val.contains("M") && !val.contains("N") && !val.contains("O") && !val.contains("P") && !val.contains("Q") && !val.contains("R") && !val.contains("S") && !val.contains("T") && !val.contains("U") && !val.contains("V") && !val.contains("W") && !val.contains("X") && !val.contains("Y") && !val.contains("Z")){
							integersVars();
							if(bin.equals("false")){
								typ += variable+"{"+"Integer"+"}"+variable+"\n";
							}else{
								typ += variable+"{"+"Binary"+"}"+variable+"\n";
							}
							
						}else{
							stringVars();
							
							
							if(!val.contains("true") && !val.contains("false")){
								typ += variable+"{"+"String"+"}"+variable+"\n";
							}
						} //else alfab?co
						
					}else{
						
						stringVars();
						if(val.contains("true") || val.contains("false")){
							typ += variable+"{"+"Boolean"+"}"+variable+"\n";
						
						}else{
							typ += variable+"{"+"String"+"}"+variable+"\n";
						}
						
						
					} //else n??ico
					
				}else{
					if(!linha.contains("reg[@")){
						valueWithVars();
						
						if(vars.contains("0") || vars.contains("1") || vars.contains("2") || vars.contains("3") || vars.contains("4") || vars.contains("5") || vars.contains("6") || vars.contains("7") || vars.contains("8") || vars.contains("9")){
						
							if(!vars.contains("a") || !vars.contains("b") || !vars.contains("c") || !vars.contains("d") || !vars.contains("e") || !vars.contains("f") || !vars.contains("g") || !vars.contains("h") || !vars.contains("i") || !vars.contains("j") || !vars.contains("k") || !vars.contains("l") || !vars.contains("m") || !vars.contains("n") || !vars.contains("o") || !vars.contains("p") || !vars.contains("q") || !vars.contains("r") || !vars.contains("s") || !vars.contains("t") || !vars.contains("u") || !vars.contains("v") || !vars.contains("w") || !vars.contains("x") || !vars.contains("y") || !vars.contains("z") || !vars.contains("A") || !vars.contains("B") || !vars.contains("C") || !vars.contains("D") || !vars.contains("E") || !vars.contains("F") || !vars.contains("G") || !vars.contains("H") || !vars.contains("I") || !vars.contains("J") || !vars.contains("K") || !vars.contains("L") || !vars.contains("M") || !vars.contains("N") || !vars.contains("O") || !vars.contains("P") || !vars.contains("Q") || !vars.contains("R") || !vars.contains("S") || !vars.contains("T") || !vars.contains("U") || !vars.contains("V") || !vars.contains("W") || !vars.contains("X") || !vars.contains("Y") || !vars.contains("Z")){
							if(bin.equals("false")){
								typ += variable+"{"+"Integer"+"}"+variable+"\n";
							}else{
								typ += variable+"{"+"Binary"+"}"+variable+"\n";
							}
							}else{
								typ += variable+"{"+"String"+"}"+variable+"\n";
							} //else alfab?co
						
						}else{
							typ += variable+"{"+"String"+"}"+variable+"\n";
						}
						
					}
				}    //else @
				
			}   //else []
			
			
			
		}
		
		//Final lexer do armazenamento de variaveis	
		
		
		
		/*String subPath = paths.substring(paths.indexOf("Plax\\")+5, paths.lastIndexOf(".plax")+5);
		//Lexer de informa?s do programa
	if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[] & vars.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Exibition of Variables.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[], conditions & Inclusions.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Conditionals Exibitions or Inclusions.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: vars.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Definitions of Variables.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[].<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Exibitions.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & memoriaBase.contains("Var") & memoriaBase.contains("EndVar") & memoriaBase.contains("Start") & memoriaBase.contains("Final") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Others.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Others types.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("#if") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Condiditions if & else.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Conditions Tests.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[], vars & formats.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Texts formatings.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: conditionals & Inclusions.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Call File and test.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: conditionals, Inclusions & Others.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Undefined(very things).<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Inclusion Exec.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Only Inclusion Files.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Inclusion Exec & sis.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Inclusion Files & Exibitions.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[] & formats.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Texts formatings.<br>"
				+ "*********************************</b></font><br>";
	
	}*/
	
	
	if(linha.trim().equals("Final")){
		/*if(inputField.equals("true")){
			new Thread(new Runnable(){
				@Override
				public void run(){
					initConsole.console.setText(memoria);
				}
			}).start();
		}*/
		memoria += "<font size='5'><b>"
				+ "<br><br>*********************************</b></font>";
	}
	
	
	
	
	//Final lexer de informa?s do programa
	
		//Lexer da exibi? de variaveis
		if(linha.contains("sis[") & linha.contains("@")){
			sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
			textSis1 = "";
			textSis2 = "";
				if(sis.contains("[") && sis.contains("]")){
					
					sisCommand = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("]"));
					if(sisCommand.contains("+")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("+"));
						val2 = sis.substring(sis.indexOf("+")+1, sis.lastIndexOf("]"));
						
						stringWithOp("+");
						
						
					}else
					if(sisCommand.contains("-")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("-"));
						val2 = sis.substring(sis.indexOf("-")+1, sis.lastIndexOf("]"));
						
						stringWithOp("-");
					}else
					
					if(sisCommand.contains("*")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("*"));
						val2 = sis.substring(sis.indexOf("*")+1, sis.lastIndexOf("]"));
						
						stringWithOp("*");
					}else
					if(sisCommand.contains("/")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("/"));
						val2 = sis.substring(sis.indexOf("/")+1, sis.lastIndexOf("]"));
						
						stringWithOp("/");
					}else
					if(sisCommand.contains("<")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("<"));
						val2 = sis.substring(sis.indexOf("<")+1, sis.lastIndexOf("]"));
						
						stringWithOp("<");
						
					}else
					if(sisCommand.contains(">")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf(">"));
						val2 = sis.substring(sis.indexOf(">")+1, sis.lastIndexOf("]"));
						
						stringWithOp(">");
						
					}else
					if(sisCommand.contains("==")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("=="));
						val2 = sis.substring(sis.indexOf("==")+1, sis.lastIndexOf("]"));
						
						stringWithOp("==");
						
					}else
					if(sisCommand.contains("!=")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("!="));
						val2 = sis.substring(sis.indexOf("!=")+1, sis.lastIndexOf("]"));
						
						stringWithOp("!=");
						
					}
					
				}else{
					stringWithOp("sisVariables");
				
				}
				initConsole.console.setText("<font size='5'>"+memoria+"</font>");
		}
		//Final lexer de exibi? das variaveis
		
		//Lexer de exibi? de strings
		if(linha.contains("sis[") & !linha.contains("@")){
			sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
			
			//Lexer de formata? de textos
			if(sis.contains("color:blue")){
				String mem = sis.replace("color:blue{", "<font color='blue'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:red")){
				String mem = sis.replace("color:red{", "<font color='red'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:green")){
				String mem = sis.replace("color:green{", "<font color='green'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:yellow")){
				String mem = sis.replace("color:yellow{", "<font color='yellow'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:white")){
				String mem = sis.replace("color:white{", "<font color='white'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:black")){
				String mem = sis.replace("color:black{", "<font color='black'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:purple")){
				String mem = sis.replace("color:purple{", "<font color='purple'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:gray")){
				String mem = sis.replace("color:gray{", "<font color='gray'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:brown")){
				String mem = sis.replace("color:brown{", "<font color='brown'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:orange")){
				String mem = sis.replace("color:orange{", "<font color='orange'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:one")){
				String mem = sis.replace("size:one{", "<font size='1'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:two")){
				String mem = sis.replace("size:two{", "<font size='2'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:three")){
				String mem = sis.replace("size:three{", "<font size='3'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:four")){
				String mem = sis.replace("size:four{", "<font size='4'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:five")){
				String mem = sis.replace("size:five{", "<font size='5'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:six")){
				String mem = sis.replace("size:six{", "<font size='6'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:seven")){
				String mem = sis.replace("size:seven{", "<font size='7'>").replace("}", "</font>");
				memoria += mem;
			}else{
			
			
				
				if(sis.contains("[") && sis.contains("]")){
					
					if(sis.contains("+")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("+"));
						val2 = sis.substring(sis.indexOf("+")+1, sis.lastIndexOf("]"));
						
						stringWithOp("+");
						
					}else
					if(sis.contains("-")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("-"));
						val2 = sis.substring(sis.indexOf("-")+1, sis.lastIndexOf("]"));
			
						stringWithOp("-");
					}else
					
					if(sis.contains("*")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("*"));
						val2 = sis.substring(sis.indexOf("*")+1, sis.lastIndexOf("]"));
						
						stringWithOp("*");
					}else
					if(sis.contains("/")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("/"));
						val2 = sis.substring(sis.indexOf("/")+1, sis.lastIndexOf("]"));
						
						stringWithOp("/");
					}
					if(sis.contains("<")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("<"));
						val2 = sis.substring(sis.indexOf("<")+1, sis.lastIndexOf("]"));
				
						stringWithOp("<");
						
					}
					if(sis.contains(">")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf(">"));
						val2 = sis.substring(sis.indexOf(">")+1, sis.lastIndexOf("]"));
				
						stringWithOp(">");
						
					}
					if(sis.contains("==")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("=="));
						val2 = sis.substring(sis.indexOf("==")+1, sis.lastIndexOf("]"));
					
						stringWithOp("==");
						
					}
					if(sis.contains("!=")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("!="));
						val2 = sis.substring(sis.indexOf("!=")+1, sis.lastIndexOf("]"));
				
						stringWithOp("!=");
						
					}
					
				}else{
					memoria += sis;
				}
			}
			//Final lexer de formata?
			
			initConsole.console.setText("<font size='5'>"+memoria+"</font>");
		}
		//Final lexer de exibi? de strings
		
		
		//Lexer de simples comandos
		if(linha.contains("bl")){memoria += "<br>";}
		if(linha.contains("stop")){initConsole.console.setText("<font size='5'>"+memoria+"<br><br>Execu? finalizada.<br>*********************************</font>");}
		//Final de lexer de simples comandos
	
		
		if(linha.contains("Final")){initConsole.console.setText("<font size='5'>"+memoria+"</font>");}
	}
	
	//Metodo Scaneador para leitura dos arquivos Plax
	public static void scanFilePlax(String p) throws IOException{

		FileReader file = new FileReader(p);
	    BufferedReader read = new BufferedReader(file);
	    String text = read.readLine();
	      
	      while(text != null){
	    		 memoriaBase += text += "\n";
	    		 text = read.readLine();
	    		
	      }
	      file.close();
	    
	 
	     if(memoriaBase.contains("call[")){
	    	 linePlax = "call[";
	     }else{
	    	 linePlax = "";
	     }
	  
	   arq = new FileReader(p);
	   lerArq = new BufferedReader(arq);
	   linha = lerArq.readLine();
	   
	}
	
	/*
	Metodo de Execucao das estruturas 
	condicionais IF e Else em Plax
	*/
	public static void functionIfElse() throws IOException{
		if(linha.contains("if[")){
			//stringIdentIf = linha.trim()+"{"+intIdentIf+"}"+linha.trim()+"\n";
			//IntIdentIf = IntIdentIf + 1;
			//int IntIdentIf1 = IntIdentIf-1;
			//vetorIdentIf[IntIdentIf1] = 1;
			
			if(escopeBoolean){memoryEscope += "structure 'if' would be true if ";}
			
			if0 = linha.substring(linha.indexOf("if")+2, linha.indexOf("].")+1);
	
			if(!if0.contains("-and-") && !if0.contains("-or-")){
			if(if0.contains("<")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("<")).trim();
				if2 = if0.substring(if0.indexOf("<")+1, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is minor that '"+if2+"' = ";}
				if(integers(if1) < integers(if2)){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false"; 
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains(">")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf(">")).trim();
				if2 = if0.substring(if0.indexOf(">")+1, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is major that '"+if2+"' = ";}
				if(integers(if1) > integers(if2)){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false";
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains("==")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("==")).trim();
				if2 = if0.substring(if0.indexOf("==")+2, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is equal that '"+if2+"' = ";}
				if(integers(if1) == integers(if2)){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font></font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false";
					if(escopeBoolean){memoryEscope += "</font></font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains("!=")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("!=")).trim();
				if2 = if0.substring(if0.indexOf("!=")+2, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is different that '"+if2+"' = ";}
				if(integers(if1) != integers(if2)){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false";
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
				
			}
			if(if0.contains("<=")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("<=")).trim();
				if2 = if0.substring(if0.indexOf("<=")+2, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is minor or equal that '"+if2+"' = ";}
				if(integers(if1) <= integers(if2)){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false"; 
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains(">=")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf(">=")).trim();
				if2 = if0.substring(if0.indexOf(">=")+2, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is major or equal that '"+if2+"' = ";}
				if(integers(if1) >= integers(if2)){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false"; 
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains("-is-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-is-")).trim();
				if2 = if0.substring(if0.indexOf("-is-")+4, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(if1.contains("button[")){
					
					String getBut1 = if1.substring(if1.indexOf("button[")+7, if1.lastIndexOf("]")).trim();
					String getBut = getBut1.substring(getBut1.indexOf("'")+1, getBut1.lastIndexOf("'"));
					int lenGetBut = getBut.length();
					String getValueBut = IdButton.substring(IdButton.indexOf(getBut+"{")+lenGetBut, IdButton.lastIndexOf("}"+getBut)+1);
					String getPosition = getValueBut.substring(getValueBut.indexOf("{")+1, getValueBut.lastIndexOf(":"));
					String getBoolean = getValueBut.substring(getValueBut.indexOf(":")+1, getValueBut.lastIndexOf("}"));
					String getNameBut = button[integers(getPosition)].getName();
					atualCondBut[integers(getPosition)] = linha;
					
					button[integers(getPosition)].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							IdButton = IdButton.replace(getBut+"{"+getPosition+":"+"false"+"}"+getBut+"\n", getBut+"{"+getPosition+":"+"true"+"}"+getBut+"\n");	
						
								
							logicButton = "true";
							logicButton1 = true;
							numCond = integers(getPosition);
							try {
								langPlax("normal");
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							
						}
					});
					
					
					arrayButton = new String[100];
					arrayButton[integers(getPosition)] = getBoolean;
					if1 = arrayButton[integers(getPosition)];
					
					if(escopeBoolean){memoryEscope += "'"+if1+"' is equal that '"+if2+"' = ";}
					if(if1.trim().equals(if2.trim())){
						condition = "true";
						if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
						
					}else{
						condition = "false"; 
						if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
					}
				
				}else{
					
					if(escopeBoolean){memoryEscope += "'"+if1+"' is equal that '"+if2+"' = ";}
					if(if1.trim().equals(if2.trim())){
						condition = "true";
						if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
					}else{
						condition = "false"; 
						if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
					}
				}
			}
			if(if0.contains("-not-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-not-")).trim();
				if2 = if0.substring(if0.indexOf("-not-")+5, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' is not equal that '"+if2+"' = ";}
				if(!if1.trim().equals(if2.trim())){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false"; 
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains("-has-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-has-")).trim();
				if2 = if0.substring(if0.indexOf("-has-")+5, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' has '"+if2+"' = ";}
				if(if1.trim().contains(if2.trim())){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false"; 
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
			if(if0.contains("-hasnt-")){
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-hasnt-")).trim();
				if2 = if0.substring(if0.indexOf("-hasnt-")+7, if0.lastIndexOf("]")).trim();
				
				firstIfVar();
				secondIfVar();
				
				if(escopeBoolean){memoryEscope += "'"+if1+"' has not '"+if2+"' = ";}
				if(!if1.trim().contains(if2.trim())){
					condition = "true";
					if(escopeBoolean){memoryEscope += "</font><font color='blue'>true condition</font><br><font color='green'>";}
				}else{
					condition = "false";
					if(escopeBoolean){memoryEscope += "</font><font color='red'>false condition</font><br><font color='green'>";}
				}
			}
		}
			
			if(if0.contains("-and-")){
				ol1 = if0.substring(if0.indexOf("[[")+1, if0.lastIndexOf("-and-"));
				ol2 = if0.substring(if0.indexOf("-and-")+5, if0.lastIndexOf("]]")+1);
				
				if(ol1.contains("<")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<")).trim();
					if2 = ol1.substring(ol1.indexOf("<")+1, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				
				
				if(ol1.contains(">")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">")).trim();
					if2 = ol1.substring(ol1.indexOf(">")+1, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("<=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<=")).trim();
					if2 = ol1.substring(ol1.indexOf("<=")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				if(ol1.contains(">=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">=")).trim();
					if2 = ol1.substring(ol1.indexOf(">=")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("==")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("==")).trim();
					if2 = ol1.substring(ol1.indexOf("==")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("!=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("!=")).trim();
					if2 = ol1.substring(ol1.indexOf("!=")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				if(ol1.contains("-is-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-is-")).trim();
					if2 = ol1.substring(ol1.indexOf("-is-")+4, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-not-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-not-")).trim();
					if2 = ol1.substring(ol1.indexOf("-not-")+5, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-has-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-has-")).trim();
					if2 = ol1.substring(ol1.indexOf("-has-")+5, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-hasnt-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-hasnt-")).trim();
					if2 = ol1.substring(ol1.indexOf("-hasnt-")+7, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) && !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				
			}
			
			if(if0.contains("-or-")){
				ol1 = if0.substring(if0.indexOf("[[")+1, if0.lastIndexOf("-or-")).trim();
				ol2 = if0.substring(if0.indexOf("-or-")+4, if0.lastIndexOf("]]")+1).trim();
				
				if(ol1.contains("<")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<")).trim();
					if2 = ol1.substring(ol1.indexOf("<")+1, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) < integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains(">")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">")).trim();
					if2 = ol1.substring(ol1.indexOf(">")+1, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) > integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("<=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("<=")).trim();
					if2 = ol1.substring(ol1.indexOf("<=")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) <= integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				if(ol1.contains(">=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf(">=")).trim();
					if2 = ol1.substring(ol1.indexOf(">=")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) >= integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("==")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("==")).trim();
					if2 = ol1.substring(ol1.indexOf("==")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) == integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				
				
				if(ol1.contains("!=")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("!=")).trim();
					if2 = ol1.substring(ol1.indexOf("!=")+2, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(integers(if1) != integers(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
				}
				if(ol1.contains("-is-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-is-")).trim();
					if2 = ol1.substring(ol1.indexOf("-is-")+4, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.equals(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-not-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-not-")).trim();
					if2 = ol1.substring(ol1.indexOf("-not-")+5, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.equals(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-has-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-has-")).trim();
					if2 = ol1.substring(ol1.indexOf("-has-")+5, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(if1.contains(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				if(ol1.contains("-hasnt-")){
					if1 = ol1.substring(ol1.indexOf("[")+1, ol1.lastIndexOf("-hasnt-")).trim();
					if2 = ol1.substring(ol1.indexOf("-hasnt-")+7, ol1.lastIndexOf("]")).trim();
					
					firstIfVar();
					secondIfVar();
					
					if(ol2.contains("<")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<")).trim();
						if4 = ol2.substring(ol2.indexOf("<")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) < integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">")).trim();
						if4 = ol2.substring(ol2.indexOf(">")+1, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) > integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("==")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("==")).trim();
						if4 = ol2.substring(ol2.indexOf("==")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) == integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("!=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("!=")).trim();
						if4 = ol2.substring(ol2.indexOf("!=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) != integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains("<=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("<=")).trim();
						if4 = ol2.substring(ol2.indexOf("<=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) <= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					
					if(ol2.contains(">=")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf(">=")).trim();
						if4 = ol2.substring(ol2.indexOf(">=")+2, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || integers(if3) >= integers(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-is-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-is-")).trim();
						if4 = ol2.substring(ol2.indexOf("-is-")+4, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-not-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-not-")).trim();
						if4 = ol2.substring(ol2.indexOf("-not-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || !if3.equals(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-has-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-has-")).trim();
						if4 = ol2.substring(ol2.indexOf("-has-")+5, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
					if(ol2.contains("-hasnt-")){
						if3 = ol2.substring(ol2.indexOf("[")+1, ol2.lastIndexOf("-hasnt-")).trim();
						if4 = ol2.substring(ol2.indexOf("-hasnt-")+7, ol2.lastIndexOf("]")).trim();
						thirtyIfVar();
						fourtyIfVar();
						if(!if1.contains(if2) || !if3.contains(if4)){condition1 = "true";}else{condition1 = "false"; }
					}
				}
				
			}
		}
		
		if(condition.equals("true") || condition1.equals("true")){
			logicButton = "false";
			
			if(linha.contains("else")){
			
				//ident
				while(!linha.contains("endElse")){
					linha = lerArq.readLine();
				}
				if(linha.contains("endElse")){
					linha = lerArq.readLine();
				}
				condition = "";
				condition1 = "";
				
				if(logicButton1 == true){
					
					while(!linha.contains("if[")){
						linha = lerArq.readLine();
						if(linha == null){
							break;
						}
					}
					
					if(linha.contains("if[")){
						functionIfElse();
					}
					
				}
			}
			
		}else{
			if(condition.equals("false") || condition1.equals("false")){
				
				logicButton = "false";
				if(commandElse != true){
					String IntIdentIf1 = "";
					boolean boolIdentIf = false;
					String boolIdent = linha.trim();
					String boolIdent1 = linha.trim();
					IntIdentIf = 0;
					IntIdentIf1 = "id"+IntIdentIf;
					StringIdentIf += IntIdentIf1+"{"+boolIdent+"}"+IntIdentIf1+"\n";
					
					while(boolIdentIf == false){
						linha = lerArq.readLine();
						if(linha.contains("if[")){
							boolIdent = linha.trim();
							IntIdentIf = IntIdentIf + 1;
							IntIdentIf1 = "id"+IntIdentIf;
							
							if(StringIdentIf.contains(IntIdentIf1+"{"+boolIdent+"}"+IntIdentIf1+"\n")){
								StringIdentIf = StringIdentIf.replace(IntIdentIf1+"{"+boolIdent+"}"+IntIdentIf1+"\n", IntIdentIf1+"{"+boolIdent+"}"+IntIdentIf1+"\n");
							}else{
								StringIdentIf += IntIdentIf1+"{"+boolIdent+"}"+IntIdentIf1+"\n";
							}
							
						}
						
						if(linha.contains("endIf")){
							int lenIdent = IntIdentIf1.length()+1;
							System.out.println("#############################");
							System.out.println();
							
							System.out.println("Status do loop = '"+boolIdentIf+"'");
							System.out.println("Condi? Principal = '"+boolIdent1+"'");
							System.out.println("Condi? Tempor?a = '"+boolIdent+"'");
							System.out.println("Numero de Identifi? da Condi? = '"+IntIdentIf+"'");
							System.out.println("Identifica? da condi? = '"+IntIdentIf1+"'");
							System.out.println("Armazenamento das Condi?s Identificadas = '"+StringIdentIf+"'");
							System.out.println("tamanho das identifica?s = '"+lenIdent+"'");
							if(logicButton1){System.out.println("Status do Bot?= 'clicado'");}else
								{System.out.println("Status do Bot?= 'n?clicado'");}
							
							
							System.out.println();
							System.out.println("#############################");
							String endIfs = StringIdentIf.substring(StringIdentIf.indexOf(IntIdentIf1+"{")+lenIdent, StringIdentIf.lastIndexOf("}"+IntIdentIf1));
							
							if(endIfs.equals(boolIdent1)){
								boolIdentIf = true;
							}else{
								boolIdentIf = false;
							}
							if(IntIdentIf > 0){
								IntIdentIf = IntIdentIf - 1;
							}
							
							IntIdentIf1 = "id"+IntIdentIf;
							
						}
					}
				}
				commandElse = true;
				if(linha.contains("endIf")){
					linha = lerArq.readLine();
					
					if(linha.contains("else")){
						elses = true;
					}else{
						elses = false;
					}
					
				}
				
				if(elses == true){
	
					if(linha.contains("if[")){
						elses = false;
						functionIfElse();
					}
					if(linha.contains("endElse")){
					
					StringIdentIf = "";
					condition = "";
					condition1 = "";
					commandElse = false;
					if(logicButton1 == true){
						
						while(!linha.contains("if[")){
							linha = lerArq.readLine();
						
							if(linha == null){
								break;
							}
						}
					
						if(linha.contains("if[")){
							functionIfElse();
						}
					}
					
				}
				}else{

					if(linha.contains("if[")){
						elses = false;
						functionIfElse();
					}
					StringIdentIf = "";
					condition = "";
					condition1 = "";
					commandElse = false;
					if(logicButton1 == true){
						
						while(!linha.contains("if[")){
							linha = lerArq.readLine();
						
							if(linha == null){
								break;
							}
						}
					
						if(linha.contains("if[")){
							functionIfElse();
						}
					}
				}
				
				
				
			}
			
		}
		
		
	}//function if e else
	
	//Metodo de Execucao da funcao INPUT
	public static void functionInput() throws IOException{
		if(linha.contains("input[")){
			
			
			
			input = linha.substring(linha.indexOf("input[")+6, linha.lastIndexOf("]."));
			inputField = "true";
			memoria += "<br>"+">>";
			initConsole.console.setText("<font size='5'>"+memoria+"</font>");
			
			
			
			
			
			
			textField = new JTextField();
			textField.setText("");
			textField.setEditable(true);
			textField.setBackground(Color.white);
			textField.setForeground(Color.blue);
			textField.setBorder(null);
			initConsole.console.add(textField);
			
			
			
			new Thread(new Runnable(){
				@Override
				public void run(){
					initConsole.console.addMouseListener(new MouseListener() {
						
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent e) {
							
									Point posit = initConsole.console.getMousePosition();
									getX = (int) posit.getX();
									getY = (int) posit.getY();
									textField.setBounds(getX-5, getY-10, 600, 20);
								
							
						}
						
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
				}
			}).start();
			
			
			
			
	
			
			tecEnter = false;
			
			new Thread(new Runnable(){
				@Override
				public void run(){
					textField.addKeyListener(new KeyListener() {
						
						@Override
						public void keyTyped(KeyEvent e) {
							
							
						}
						
						@Override
						public void keyReleased(KeyEvent e) {
							
							
						}
						
						@Override
						public void keyPressed(KeyEvent e) {
							
							if(e.getKeyCode() == KeyEvent.VK_ENTER){
								inputVar();
							
								textField.setEditable(false);
								tecEnter = true;
							}
							
						}
					});
				}
			}).start();
			
			
			while(tecEnter==false){}
			tecEnter = false;
			
			linha = lerArq.readLine();
			textField = new JTextField();
		}
	}//function input
	
	/*
	Metodo de execucao da estrutura 
	de repeticao WHILE em Plax
	*/
	public static void functionWhile() throws IOException{
		if(linha.contains("while[")){
			
			whil = linha.substring(linha.indexOf("while[")+5, linha.lastIndexOf("]")+1).trim();
			
			if(whil.contains("<")){
				signal = "<";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<")).trim();
				if2 = whil.substring(whil.indexOf("<")+1, whil.lastIndexOf("]")).trim();
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)<integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains(">")){
				signal = ">";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">"));
				if2 = whil.substring(whil.indexOf(">")+1, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)>integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains("==")){
				signal = "==";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("=="));
				if2 = whil.substring(whil.indexOf("==")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)==integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains("<=")){
				signal = "<=";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<="));
				if2 = whil.substring(whil.indexOf("<=")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)<=integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains(">=")){
				signal = ">=";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">="));
				if2 = whil.substring(whil.indexOf(">=")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)>=integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			
			if(whil.contains("!=")){
				signal = "!=";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("!="));
				if2 = whil.substring(whil.indexOf("!=")+2, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(integers(if1)!=integers(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-is-")){
				signal = "-is-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-is-"));
				if2 = whil.substring(whil.indexOf("-is-")+4, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(if1.equals(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-not-")){
				signal = "-not-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-not-"));
				if2 = whil.substring(whil.indexOf("-not-")+5, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(!if1.equals(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-has-")){
				signal = "-has-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-has-"));
				if2 = whil.substring(whil.indexOf("-has-")+5, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(if1.contains(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			if(whil.contains("-hasnt-")){
				signal = "-hasnt-";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-hasnt-"));
				if2 = whil.substring(whil.indexOf("-hasnt-")+7, whil.lastIndexOf("]"));
				ifVar1 = if1;
				ifVar2 = if2;
				firstIfVar();
				secondIfVar();
				if(!if1.contains(if2)){condWhile = true;}else{condWhile = false;}
				
			}
			scan = new Scanner(new File(paths));
			
			if(condWhile==true){
				while(condWhile==true){
					
					scan = new Scanner(new File(paths));
					linha = scan.nextLine();
					
					if(condWhile==true){
					
					
					
					while(!linha.contains("while["+ifVar1+signal+ifVar2)){
						
						linha = scan.nextLine();
						if(linha.contains("while[")){
							whil = linha.substring(linha.indexOf("while[")+5, linha.lastIndexOf("]")+1);
							
							if(whil.contains("<")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<"));
								if2 = whil.substring(whil.indexOf("<")+1, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)<integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains(">")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">"));
								if2 = whil.substring(whil.indexOf(">")+1, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)>integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains("==")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("=="));
								if2 = whil.substring(whil.indexOf("==")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)==integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains("<=")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<="));
								if2 = whil.substring(whil.indexOf("<=")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)<=integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains(">=")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf(">="));
								if2 = whil.substring(whil.indexOf(">=")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)>=integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
							if(whil.contains("!=")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("!="));
								if2 = whil.substring(whil.indexOf("!=")+2, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(integers(if1)!=integers(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-is-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-is-"));
								if2 = whil.substring(whil.indexOf("-is-")+4, whil.lastIndexOf("]"));
								ifVar1 = if1;
								ifVar2 = if2;
								if(if1.equals(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-not-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-not-"));
								if2 = whil.substring(whil.indexOf("-not-")+5, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(!if1.equals(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-has-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-has-"));
								if2 = whil.substring(whil.indexOf("-has-")+5, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(if1.contains(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							if(whil.contains("-hasnt-")){
								if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("-hasnt-"));
								if2 = whil.substring(whil.indexOf("-hasnt-")+7, whil.lastIndexOf("]"));
								firstIfVar();
								secondIfVar();
								if(!if1.contains(if2)){condWhile = true;}else{condWhile = false;}
								
							}
							
						}
						
					}//Segundo while whilePlax
					
					if(condWhile==true){
						while(!linha.contains("endWhile")){
							
							linha = scan.nextLine();
							LineAnalysis();
							
						}
						
					}
					else{
						while(!linha.contains("endWhile")){
							linha = lerArq.readLine();
							
						}
						
					}
					
					}//if condWhile true
					
					
				}//primeiro while whilePlax
			
			}//if condWhile true
			else{
				while(!linha.contains("endWhile")){
					linha = lerArq.readLine();
				}
				
			}
			
			
		}
	}//function while
	
	/*
	Metodo Debugador de linhas do 
	Interpretador
	*/
	public static void debugLines(){
			if(linha.contains("sis")){
			
				if(!linha.contains(".")){
					new Thread(new Runnable(){
						@Override
						public void run(){
							errorCode(codeLine+1);
							initConsole.console.setText("");
							initConsole.setVisible(false);
						}
					}).start();
			
					while(true){break;}
					
				}
		
			}
	
			if(linha.contains("sis")){
				if(!linha.contains("[") || !linha.contains("]")){
					new Thread(new Runnable(){
						@Override
						public void run(){
							errorCode(codeLine+1);
							initConsole.console.setText("");
							initConsole.setVisible(false);
						}
					}).start();
		
					while(true){break;}
					
				}
		
			}
	}//debugLines
	
	/*
	Metodo manipulador de Interfaces em Plax
	*/
	public static void functionGUIS(){
		if(output.contains("gui")){
			
			if(linha.contains("create[")){
				String create = linha.substring(linha.indexOf("create[")+7, linha.lastIndexOf("]."));
				String object = create.substring(create.indexOf("obj{")+4, create.lastIndexOf("}obj,"));
				
				JFrame window = null;
				JButton button = null;
				
				

				
				
				if(object.contains("WIN")){
					window = new JFrame();
					URL urls = window.getClass().getResource("/image/icone_plax.jpg");  
					Image icon = Toolkit.getDefaultToolkit().getImage(urls);  
					window.setIconImage(icon);
					
					if(create.contains("tit{")){
						String title = create.substring(create.indexOf("tit{")+4, create.lastIndexOf("}tit,"));
						window.setTitle(title);
						
					}
					
					if(create.contains("als{")){
						String alignsize = create.substring(create.indexOf("als{"), create.lastIndexOf("}als,")+5);
						String getX = alignsize.substring(alignsize.indexOf("als{")+4, alignsize.lastIndexOf("&"));
						String getY = alignsize.substring(alignsize.indexOf("&")+1, alignsize.lastIndexOf("-"));
						
						String width = alignsize.substring(alignsize.indexOf("-")+1, alignsize.lastIndexOf("x"));
						String height = alignsize.substring(alignsize.indexOf("x")+1, alignsize.lastIndexOf("}als,"));
						
						window.setBounds(integers(getX), integers(getY), integers(width), integers(height));
					}
					
					if(create.contains("visib{")){
						String visibility = create.substring(create.indexOf("visib{")+6, create.lastIndexOf("}visib,"));
						
						if(visibility.contains("true")){
							window.setVisible(true);
						}
						if(visibility.contains("false")){
							window.setVisible(false);
						}
					}
					
				
				}
				
				
			}
			
		}
	}//functionGUIS
	
	/*
	Metodo de parametros de configuracao
	para o console do Plax
	*/
	public static void paramConsole(){
		String consoleBackground = "";
		if(linha.contains("#background")){
			consoleBackground = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
			
			if(consoleBackground.contains("blue")){
				initConsole.console.setBackground(Color.blue);
				
			}else{
				if(consoleBackground.contains("red")){
					initConsole.console.setBackground(Color.red);
				
				}else{
					if(consoleBackground.contains("gray")){
						initConsole.console.setBackground(Color.gray);
						
					}else{
						if(consoleBackground.contains("black")){
							initConsole.console.setBackground(Color.black);
							
						}else{
							if(consoleBackground.contains("yellow")){
								initConsole.console.setBackground(Color.yellow);
								
							}else{
								if(consoleBackground.contains("darkgray")){
									initConsole.console.setBackground(Color.DARK_GRAY);
									
								}else{
									if(consoleBackground.contains("cyan")){
										initConsole.console.setBackground(Color.CYAN);
										
									}else{
										if(consoleBackground.contains("green")){
											initConsole.console.setBackground(Color.green);
											
										}else{
											if(consoleBackground.contains("magenta")){
												initConsole.console.setBackground(Color.magenta);
												
											}else{
												if(consoleBackground.contains("orange")){
													initConsole.console.setBackground(Color.orange);
													
												}else{
													if(consoleBackground.contains("pink")){
														initConsole.console.setBackground(Color.pink);
														
													}else{
														if(consoleBackground.contains("white")){
															initConsole.console.setBackground(Color.white);
															
														}
													}}}}}}}}}}}
		}
		
		String consoleForeground = "";
		if(linha.contains("#foreground")){
			consoleForeground = linha.substring(linha.indexOf(":")+2, linha.lastIndexOf("."));
			
			if(consoleForeground.contains("blue")){
				memoria += "<font color='blue'>";
			}else{
				if(consoleForeground.contains("red")){
					memoria += "<font color='red'>";
				}else{
					if(consoleForeground.contains("black")){
						memoria += "<font color='black'>";
					}else{
							if(consoleForeground.contains("gray")){
								memoria += "<font color='gray'>";
							}else{
								if(consoleForeground.contains("yellow")){
									memoria += "<font color='yellow'>";
								}else{
									if(consoleForeground.contains("darkgray")){
										memoria += "<font color='darkgray'>";
									}else{
										if(consoleForeground.contains("cyan")){
											memoria += "<font color='cyan'>";
										}else{
											if(consoleForeground.contains("green")){
												memoria += "<font color='green'>";
											}else{
												if(consoleForeground.contains("magenta")){
													memoria += "<font color='magenta'>";
												}else{
													if(consoleForeground.contains("orange")){
														memoria += "<font color='orange'>";
													}else{
														if(consoleForeground.contains("pink")){
															memoria += "<font color='pink'>";
														}else{
															if(consoleForeground.contains("white")){
																memoria += "<font color='white'>";
															}
														}}}}}}}}}}}
		}
	}//paramConsole
	
	/*
	Metodo de Informacoes completas 
	do Programa Plax
	*/
	public static void infoProgram(){
		String subPath = paths.substring(paths.indexOf("Plax\\")+5, paths.lastIndexOf(".plax")+5);
		//Lexer de informa?s do programa
	if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[] & vars.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Exibition of Variables.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[], conditions & Inclusions.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Conditionals Exibitions or Inclusions.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: vars.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Definitions of Variables.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[].<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Exibitions.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & memoriaBase.contains("Var") & memoriaBase.contains("EndVar") & memoriaBase.contains("Start") & memoriaBase.contains("Final") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Others.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Others types.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("#if") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Condiditions if & else.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Conditions Tests.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[], vars & formats.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Texts formatings.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: conditionals & Inclusions.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Call File and test.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & memoriaBase.contains("@") & memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: conditionals, Inclusions & Others.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Undefined(very things).<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & !memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Inclusion Exec.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Only Inclusion Files.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & !memoriaBase.contains("color") & !memoriaBase.contains("#if") & memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: Inclusion Exec & sis.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Inclusion Files & Exibitions.<br>"
				+ "*********************************</b></font><br>";
	
	}
	
	
	if(linha.equals("Start") & memoriaBase.contains("sis[") & !memoriaBase.contains("@") & memoriaBase.contains("color") & !memoriaBase.contains("#if") & !memoriaBase.contains("exec[")){ 
		memoria += "<font size='5'><b>@program: sis[] & formats.<br>"
				+ "___@Lang: Plax.<br>"
				+ "___@File: "+subPath+"<br>"
				+ "___@Finally: Texts formatings.<br>"
				+ "*********************************</b></font><br>";
	
	}
	}//infoProgram
	
	/*
		Metodo Definidor de variaveis incluindo
		Usando Operacoes aritmeticas, relacionais, armazenamento
		de variaveis, Tipos de variaveis, funcoes retornaveis,etc...
	*/
	public static void defineVariables() throws IOException{
		if(linha.contains("*Var")){if(escopeBoolean){ memoryEscope += "Begin of module 'Var' of variables/functions<br>"; initEscope.escopePane.setText(memoryEscope);}}
		//Lexer do armazenamento de variaveis
		if(linha.contains("@") & linha.contains(":")){
			String regs = "";
			String regs1 = "";
			if(linha.contains("reg[") && (linha.contains("] :") || linha.contains("]:") ) ){
				regs = linha.substring(linha.indexOf("reg[")+4, linha.lastIndexOf("]"));
			}
			if(linha.contains("reg[") && (linha.contains(":reg[") || linha.contains(": reg[") ) ){
				regs1 = linha.substring(linha.indexOf("reg[")+4, linha.lastIndexOf("]"));
			}
			
			if(linha.contains("::")){
				if(!linha.contains("reg["+regs+"] :") && !linha.contains("reg["+regs+"]:")){
					variable = linha.substring(linha.indexOf("@"), linha.indexOf("::"));
					variable = variable.trim();
					val = linha.substring(linha.indexOf("::")+2, linha.indexOf(".")).trim();
					if((!val.contains("[") && !val.contains("]") && !val.contains("@")) && (val.contains("a") || val.contains("A") || val.contains("b") || val.contains("B")
						 || val.contains("c") || val.contains("C") || val.contains("d") || val.contains("D") || val.contains("e") || val.contains("E")
					  || val.contains("f") || val.contains("F") || val.contains("g") || val.contains("G") || val.contains("h") || val.contains("H")
					   || val.contains("i") || val.contains("I") || val.contains("j") || val.contains("J") || val.contains("k") || val.contains("K")
					    || val.contains("l") || val.contains("L") || val.contains("m") || val.contains("M") || val.contains("n") || val.contains("N")
						 || val.contains("o") || val.contains("O") || val.contains("p") || val.contains("P") || val.contains("q") || val.contains("Q")
						  || val.contains("r") || val.contains("R") || val.contains("s") || val.contains("S") || val.contains("t") || val.contains("T")
						   || val.contains("u") || val.contains("U") || val.contains("v") || val.contains("V") || val.contains("w") || val.contains("W")
						    || val.contains("x") || val.contains("X") || val.contains("y") || val.contains("Y") || val.contains("z") || val.contains("Z"))){
								if(val.contains("'")){
									val = val.substring(val.indexOf("'")+1, val.lastIndexOf("'"));
								
								}else{
									typeError(codeLine+1, "String sem parÃ¢metro identificador!");
									initConsole.setVisible(false);
								}
					}
				}
				acres = "yes";
			}else{
				if(linha.contains(":")){
					if(!linha.contains("reg["+regs+"] :") && !linha.contains("reg["+regs+"]:")){
						variable = linha.substring(linha.indexOf("@"), linha.indexOf(":"));
						variable = variable.trim();
						val = linha.substring(linha.indexOf(":")+1, linha.indexOf(".")).trim();
						if((!val.contains("[") && !val.contains("]") && !val.contains("@")) && (val.contains("a") || val.contains("A") || val.contains("b") || val.contains("B")
								 || val.contains("c") || val.contains("C") || val.contains("d") || val.contains("D") || val.contains("e") || val.contains("E")
							  || val.contains("f") || val.contains("F") || val.contains("g") || val.contains("G") || val.contains("h") || val.contains("H")
							   || val.contains("i") || val.contains("I") || val.contains("j") || val.contains("J") || val.contains("k") || val.contains("K")
							    || val.contains("l") || val.contains("L") || val.contains("m") || val.contains("M") || val.contains("n") || val.contains("N")
								 || val.contains("o") || val.contains("O") || val.contains("p") || val.contains("P") || val.contains("q") || val.contains("Q")
								  || val.contains("r") || val.contains("R") || val.contains("s") || val.contains("S") || val.contains("t") || val.contains("T")
								   || val.contains("u") || val.contains("U") || val.contains("v") || val.contains("V") || val.contains("w") || val.contains("W")
								    || val.contains("x") || val.contains("X") || val.contains("y") || val.contains("Y") || val.contains("z") || val.contains("Z"))){
								if(val.contains("'")){
									val = val.substring(val.indexOf("'")+1, val.lastIndexOf("'"));
									
								}else{
									typeError(codeLine+1, "String sem parÃ¢metro identificador!");
									initConsole.setVisible(false);
								}
									
							}
						
					}
					acres = "no";
				}
			}
			
			getPath = new File("").getAbsolutePath();
			
			if(!linha.contains("reg["+regs+"] :") && !linha.contains("reg["+regs+"]:") && !linha.contains(":reg["+regs1+"]") && !linha.contains(": reg["+regs1+"]") && !linha.contains("[") && !linha.contains("]")){
				memoriaVar += variable+"{"+val+"}"+variable+"\n";
				System.out.println("****"+variable+"{"+val+"}"+variable+"\n"+"****");
			}
				
		
			
			if(val.contains("get[")){
				String get = linha.substring(linha.indexOf("get[")+4, linha.lastIndexOf("].")).trim();
				varsGet += variable+"{"+val+"}"+variable+"\n";
				
				if(get.contains("InputText[")){
					String getInputText = get.substring(get.indexOf("InputText[")+10, get.lastIndexOf("]")).trim();
					String getInputText1 = getInputText.substring(getInputText.indexOf("'")+1, getInputText.lastIndexOf("'"));
					int lenGetInput = getInputText1.length()+1;
					String getIdInput = IdInputText.substring(IdInputText.indexOf(getInputText1+"{")+lenGetInput, IdInputText.lastIndexOf("}"+getInputText1));
					
					val = InputText[integers(getIdInput)].getText();
					if(escopeBoolean){memoryEscope += "saving in variable '"+variable+"' the captured text in InputText of interface with identification '"+getInputText1+"', captured value = '"+val+"' <br>";}
				}
				
				if(get.contains("button[")){
					String getButton = get.substring(get.indexOf("button[")+7, get.lastIndexOf("]")).trim();
					String getButton1 = getButton.substring(getButton.indexOf("'")+1, getButton.lastIndexOf("'"));
					int lenGetButton = getButton1.length();
					String getIdButton = IdButton.substring(IdButton.indexOf(getButton1+"{")+lenGetButton, IdButton.lastIndexOf("}"+getButton1)+1).trim();
					String getIdButton1 = getIdButton.substring(getIdButton.indexOf("{")+1, getIdButton.lastIndexOf(":")).trim();
					System.out.println("numero do botao "+integers(getIdButton1));
					val = button[integers(getIdButton1)].getText();
					if(escopeBoolean){memoryEscope += "saving in variable '"+variable+"' the captured text in button of interface with identification '"+getButton1+"', captured value = '"+val+"' <br>";}
				}
				
				if(escopeBoolean){initEscope.escopePane.setText(memoryEscope);}
				
			}
			
			if(val.contains("type[")){
				String typeOf = linha.substring(linha.indexOf("type[")+5, linha.lastIndexOf("].")).trim();
					
				if(typeOf.contains("@")){
					String endTyp = "}"+typeOf;
					int lenType = typeOf.length()+1;
					String typ1 = typ.substring(typ.indexOf(typeOf+"{")+lenType, typ.lastIndexOf(endTyp));
					val = typ1;	
					
					if(escopeBoolean){memoryEscope += "capturing the type '"+val+"' of variable '"+typeOf+"' and saving in variable '"+variable+"' <br>";}
				}
			if(escopeBoolean){initEscope.escopePane.setText(memoryEscope);}
			}
			
			
			if(val.contains("getDir[]")){
				String file = new File("").getAbsolutePath();
				val = file;
				if(escopeBoolean){memoryEscope += "saving the directory '"+file+"' in variable '"+variable+"' <br>";initEscope.escopePane.setText(memoryEscope);}
			}
			if(val.contains("getFile[]")){
				val = paths.substring(paths.indexOf("\\Plax\\")+6, paths.lastIndexOf(".plax")+5);
				if(escopeBoolean){memoryEscope += "saving the file name '"+val+"' in variable '"+variable+"' <br>";initEscope.escopePane.setText(memoryEscope);}
			}
			
			if(val.contains("getTime[")){
				if(linha.contains("getTime[]")){
					val = System.currentTimeMillis()+"";
				}else
					if(!linha.substring(linha.indexOf("getTime[")+8).contains("]")){
						String paramTime = linha.substring(linha.indexOf("getTime[")+8, linha.lastIndexOf("].")).trim();
						long addTime = System.currentTimeMillis()+integers(paramTime);
						val = addTime+"";
					}
				if(escopeBoolean){memoryEscope += "saving the atual time '"+val+"' in variable '"+variable+"' <br>";initEscope.escopePane.setText(memoryEscope);}
			}
			
			if(val.contains("fix[") && !val.contains("cap")){
				fix = val.substring(val.indexOf("fix[")+4, val.lastIndexOf("]")).trim();
				fixValue();
		
				PrintWriter printFix = new PrintWriter(getPath+"\\Plax\\config\\"+variable+".pfv");
				printFix.println(variable+"["+fix+"]");
				printFix.close();
				if(escopeBoolean){memoryEscope += "saving the Static fix value '"+fix+"' in variable '"+variable+"' <br>";initEscope.escopePane.setText(memoryEscope);}
			}
			
			if(val.contains("capFix[")){
				String capFix = val.substring(val.indexOf("capFix[")+7, val.lastIndexOf("]")).trim();
				FileReader readFix = new FileReader(getPath+"\\Plax\\config\\"+capFix+".pfv");
				BufferedReader bufFix = new BufferedReader(readFix);
				String lineFix = bufFix.readLine();
			
				String subFix = lineFix.substring(lineFix.indexOf(capFix+"[")+4, lineFix.lastIndexOf("]"));
				val = subFix;
				readFix.close();
				if(escopeBoolean){memoryEscope += "capturing the Static fix value of variable '"+capFix+"' and saving in variable '"+variable+"', captured value = '"+val+"' <br>";initEscope.escopePane.setText(memoryEscope);}
				
			}
			
			if(val.contains("reg[")){
				String position = linha.substring(linha.indexOf("reg[")+4, linha.lastIndexOf("].")).trim();
				
				if(position.contains("@")){
					if(position.contains("@a0")){position = a0;}else
					if(position.contains("@a1")){position = a1;}else
					if(position.contains("@a2")){position = a2;}else
					if(position.contains("@a3")){position = a3;}else
					if(position.contains("@a4")){position = a4;}else
					if(position.contains("@a5")){position = a5;}else
					if(position.contains("@a6")){position = a6;}else
					if(position.contains("@a7")){position = a7;}else
					if(position.contains("@a8")){position = a8;}else
					if(position.contains("@a9")){position = a9;}else
					
					if(position.contains("@b0")){position = b0;}else
					if(position.contains("@b1")){position = b1;}else
					if(position.contains("@b2")){position = b2;}else
					if(position.contains("@b3")){position = b3;}else
					if(position.contains("@b4")){position = b4;}else
					if(position.contains("@b5")){position = b5;}else
					if(position.contains("@b6")){position = b6;}else
					if(position.contains("@b7")){position = b7;}else
					if(position.contains("@b8")){position = b8;}else
					if(position.contains("@b9")){position = b9;}else
					
					if(position.contains("@c0")){position = c0;}else
					if(position.contains("@c1")){position = c1;}else
					if(position.contains("@c2")){position = c2;}else
					if(position.contains("@c3")){position = c3;}else
					if(position.contains("@c4")){position = c4;}else
					if(position.contains("@c5")){position = c5;}else
					if(position.contains("@c6")){position = c6;}else
					if(position.contains("@c7")){position = c7;}else
					if(position.contains("@c8")){position = c8;}else
					if(position.contains("@c9")){position = c9;}else
					
					if(position.contains("@d0")){position = d0;}else
					if(position.contains("@d1")){position = d1;}else
					if(position.contains("@d2")){position = d2;}else
					if(position.contains("@d3")){position = d3;}else
					if(position.contains("@d4")){position = d4;}else
					if(position.contains("@d5")){position = d5;}else
					if(position.contains("@d6")){position = d6;}else
					if(position.contains("@d7")){position = d7;}else
					if(position.contains("@d8")){position = d8;}else
					if(position.contains("@d9")){position = d9;}else
					
					if(position.contains("@e0")){position = e0;}else
					if(position.contains("@e1")){position = e1;}else
					if(position.contains("@e2")){position = e2;}else
					if(position.contains("@e3")){position = e3;}else
					if(position.contains("@e4")){position = e4;}else
					if(position.contains("@e5")){position = e5;}else
					if(position.contains("@e6")){position = e6;}else
					if(position.contains("@e7")){position = e7;}else
					if(position.contains("@e8")){position = e8;}else
					if(position.contains("@e9")){position = e9;}else
					
					if(position.contains("@f0")){position = f0;}else
					if(position.contains("@f1")){position = f1;}else
					if(position.contains("@f2")){position = f2;}else
					if(position.contains("@f3")){position = f3;}else
					if(position.contains("@f4")){position = f4;}else
					if(position.contains("@f5")){position = f5;}else
					if(position.contains("@f6")){position = f6;}else
					if(position.contains("@f7")){position = f7;}else
					if(position.contains("@f8")){position = f8;}else
					if(position.contains("@f9")){position = f9;}else
					
					if(position.contains("@g0")){position = g0;}else
					if(position.contains("@g1")){position = g1;}else
					if(position.contains("@g2")){position = g2;}else
					if(position.contains("@g3")){position = g3;}else
					if(position.contains("@g4")){position = g4;}else
					if(position.contains("@g5")){position = g5;}else
					if(position.contains("@g6")){position = g6;}else
					if(position.contains("@g7")){position = g7;}else
					if(position.contains("@g8")){position = g8;}else
					if(position.contains("@g9")){position = g9;}else
					
					if(position.contains("@h0")){position = h0;}else
					if(position.contains("@h1")){position = h1;}else
					if(position.contains("@h2")){position = h2;}else
					if(position.contains("@h3")){position = h3;}else
					if(position.contains("@h4")){position = h4;}else
					if(position.contains("@h5")){position = h5;}else
					if(position.contains("@h6")){position = h6;}else
					if(position.contains("@h7")){position = h7;}else
					if(position.contains("@h8")){position = h8;}else
					if(position.contains("@h9")){position = h9;}else
					
					if(position.contains("@i0")){position = i0;}else
					if(position.contains("@i1")){position = i1;}else
					if(position.contains("@i2")){position = i2;}else
					if(position.contains("@i3")){position = i3;}else
					if(position.contains("@i4")){position = i4;}else
					if(position.contains("@i5")){position = i5;}else
					if(position.contains("@i6")){position = i6;}else
					if(position.contains("@i7")){position = i7;}else
					if(position.contains("@i8")){position = i8;}else
					if(position.contains("@i9")){position = i9;}else
					
					if(position.contains("@j0")){position = j0;}else
					if(position.contains("@j1")){position = j1;}else
					if(position.contains("@j2")){position = j2;}else
					if(position.contains("@j3")){position = j3;}else
					if(position.contains("@j4")){position = j4;}else
					if(position.contains("@j5")){position = j5;}else
					if(position.contains("@j6")){position = j6;}else
					if(position.contains("@j7")){position = j7;}else
					if(position.contains("@j8")){position = j8;}else
					if(position.contains("@j9")){position = j9;}else
					
					if(position.contains("@k0")){position = k0;}else
					if(position.contains("@k1")){position = k1;}else
					if(position.contains("@k2")){position = k2;}else
					if(position.contains("@k3")){position = k3;}else
					if(position.contains("@k4")){position = k4;}else
					if(position.contains("@k5")){position = k5;}else
					if(position.contains("@k6")){position = k6;}else
					if(position.contains("@k7")){position = k7;}else
					if(position.contains("@k8")){position = k8;}else
					if(position.contains("@k9")){position = k9;}else
					
					if(position.contains("@l0")){position = l0;}else
					if(position.contains("@l1")){position = l1;}else
					if(position.contains("@l2")){position = l2;}else
					if(position.contains("@l3")){position = l3;}else
					if(position.contains("@l4")){position = l4;}else
					if(position.contains("@l5")){position = l5;}else
					if(position.contains("@l6")){position = l6;}else
					if(position.contains("@l7")){position = l7;}else
					if(position.contains("@l8")){position = l8;}else
					if(position.contains("@l9")){position = l9;}else
					
					if(position.contains("@m0")){position = m0;}else
					if(position.contains("@m1")){position = m1;}else
					if(position.contains("@m2")){position = m2;}else
					if(position.contains("@m3")){position = m3;}else
					if(position.contains("@m4")){position = m4;}else
					if(position.contains("@m5")){position = m5;}else
					if(position.contains("@m6")){position = m6;}else
					if(position.contains("@m7")){position = m7;}else
					if(position.contains("@m8")){position = m8;}else
					if(position.contains("@m9")){position = m9;}else
					
					if(position.contains("@n0")){position = n0;}else
					if(position.contains("@n1")){position = n1;}else
					if(position.contains("@n2")){position = n2;}else
					if(position.contains("@n3")){position = n3;}else
					if(position.contains("@n4")){position = n4;}else
					if(position.contains("@n5")){position = n5;}else
					if(position.contains("@n6")){position = n6;}else
					if(position.contains("@n7")){position = n7;}else
					if(position.contains("@n8")){position = n8;}else
					if(position.contains("@n9")){position = n9;}else
					
					if(position.contains("@o0")){position = o0;}else
					if(position.contains("@o1")){position = o1;}else
					if(position.contains("@o2")){position = o2;}else
					if(position.contains("@o3")){position = o3;}else
					if(position.contains("@o4")){position = o4;}else
					if(position.contains("@o5")){position = o5;}else
					if(position.contains("@o6")){position = o6;}else
					if(position.contains("@o7")){position = o7;}else
					if(position.contains("@o8")){position = o8;}else
					if(position.contains("@o9")){position = o9;}else
					
					if(position.contains("@p0")){position = p0;}else
					if(position.contains("@p1")){position = p1;}else
					if(position.contains("@p2")){position = p2;}else
					if(position.contains("@p3")){position = p3;}else
					if(position.contains("@p4")){position = p4;}else
					if(position.contains("@p5")){position = p5;}else
					if(position.contains("@p6")){position = p6;}else
					if(position.contains("@p7")){position = p7;}else
					if(position.contains("@p8")){position = p8;}else
					if(position.contains("@p9")){position = p9;}else
					
					if(position.contains("@q0")){position = q0;}else
					if(position.contains("@q1")){position = q1;}else
					if(position.contains("@q2")){position = q2;}else
					if(position.contains("@q3")){position = q3;}else
					if(position.contains("@q4")){position = q4;}else
					if(position.contains("@q5")){position = q5;}else
					if(position.contains("@q6")){position = q6;}else
					if(position.contains("@q7")){position = q7;}else
					if(position.contains("@q8")){position = q8;}else
					if(position.contains("@q9")){position = q9;}else
					
					if(position.contains("@r0")){position = r0;}else
					if(position.contains("@r1")){position = r1;}else
					if(position.contains("@r2")){position = r2;}else
					if(position.contains("@r3")){position = r3;}else
					if(position.contains("@r4")){position = r4;}else
					if(position.contains("@r5")){position = r5;}else
					if(position.contains("@r6")){position = r6;}else
					if(position.contains("@r7")){position = r7;}else
					if(position.contains("@r8")){position = r8;}else
					if(position.contains("@r9")){position = r9;}else
					
					if(position.contains("@s0")){position = s0;}else
					if(position.contains("@s1")){position = s1;}else
					if(position.contains("@s2")){position = s2;}else
					if(position.contains("@s3")){position = s3;}else
					if(position.contains("@s4")){position = s4;}else
					if(position.contains("@s5")){position = s5;}else
					if(position.contains("@s6")){position = s6;}else
					if(position.contains("@s7")){position = s7;}else
					if(position.contains("@s8")){position = s8;}else
					if(position.contains("@s9")){position = s9;}else
					
					if(position.contains("@t0")){position = t0;}else
					if(position.contains("@t1")){position = t1;}else
					if(position.contains("@t2")){position = t2;}else
					if(position.contains("@t3")){position = t3;}else
					if(position.contains("@t4")){position = t4;}else
					if(position.contains("@t5")){position = t5;}else
					if(position.contains("@t6")){position = t6;}else
					if(position.contains("@t7")){position = t7;}else
					if(position.contains("@t8")){position = t8;}else
					if(position.contains("@t9")){position = t9;}else
					
					if(position.contains("@u0")){position = u0;}else
					if(position.contains("@u1")){position = u1;}else
					if(position.contains("@u2")){position = u2;}else
					if(position.contains("@u3")){position = u3;}else
					if(position.contains("@u4")){position = u4;}else
					if(position.contains("@u5")){position = u5;}else
					if(position.contains("@u6")){position = u6;}else
					if(position.contains("@u7")){position = u7;}else
					if(position.contains("@u8")){position = u8;}else
					if(position.contains("@u9")){position = u9;}else
					
					if(position.contains("@v0")){position = v0;}else
					if(position.contains("@v1")){position = v1;}else
					if(position.contains("@v2")){position = v2;}else
					if(position.contains("@v3")){position = v3;}else
					if(position.contains("@v4")){position = v4;}else
					if(position.contains("@v5")){position = v5;}else
					if(position.contains("@v6")){position = v6;}else
					if(position.contains("@v7")){position = v7;}else
					if(position.contains("@v8")){position = v8;}else
					if(position.contains("@v9")){position = v9;}else
					
					if(position.contains("@w0")){position = w0;}else
					if(position.contains("@w1")){position = w1;}else
					if(position.contains("@w2")){position = w2;}else
					if(position.contains("@w3")){position = w3;}else
					if(position.contains("@w4")){position = w4;}else
					if(position.contains("@w5")){position = w5;}else
					if(position.contains("@w6")){position = w6;}else
					if(position.contains("@w7")){position = w7;}else
					if(position.contains("@w8")){position = w8;}else
					if(position.contains("@w9")){position = w9;}else
					
					if(position.contains("@x0")){position = x0;}else
					if(position.contains("@x1")){position = x1;}else
					if(position.contains("@x2")){position = x2;}else
					if(position.contains("@x3")){position = x3;}else
					if(position.contains("@x4")){position = x4;}else
					if(position.contains("@x5")){position = x5;}else
					if(position.contains("@x6")){position = x6;}else
					if(position.contains("@x7")){position = x7;}else
					if(position.contains("@x8")){position = x8;}else
					if(position.contains("@x9")){position = x9;}else
					
					if(position.contains("@y0")){position = y0;}else
					if(position.contains("@y1")){position = y1;}else
					if(position.contains("@y2")){position = y2;}else
					if(position.contains("@y3")){position = y3;}else
					if(position.contains("@y4")){position = y4;}else
					if(position.contains("@y5")){position = y5;}else
					if(position.contains("@y6")){position = y6;}else
					if(position.contains("@y7")){position = y7;}else
					if(position.contains("@y8")){position = y8;}else
					if(position.contains("@y9")){position = y9;}else
					
					if(position.contains("@z0")){position = z0;}else
					if(position.contains("@z1")){position = z1;}else
					if(position.contains("@z2")){position = z2;}else
					if(position.contains("@z3")){position = z3;}else
					if(position.contains("@z4")){position = z4;}else
					if(position.contains("@z5")){position = z5;}else
					if(position.contains("@z6")){position = z6;}else
					if(position.contains("@z7")){position = z7;}else
					if(position.contains("@z8")){position = z8;}else
					if(position.contains("@z9")){position = z9;}
					else
						{
							if(position.contains("@")){
								int lenVars = position.length()+1;
								position = memoriaVar.substring(memoriaVar.indexOf(position+"{")+lenVars, memoriaVar.lastIndexOf("}"+position));
								
							}
							
						}
						
						
				}
				
				
				val = vetor[integers(position)];
				if(escopeBoolean){memoryEscope += "saving in variable '"+variable+"' the captured register in address '"+position+"', captured value = "+val+"<br>";initEscope.escopePane.setText(memoryEscope);}
				
			}
			
			if(val.contains("[") && val.contains("]") && !val.contains("getFile[]")){
				valOp = val.substring(val.indexOf("["), val.lastIndexOf("]")+1);
				if(val.contains("+")){
					addictionVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}else
				if(val.contains("-")){
					subtractionVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}else
				if(val.contains("*")){
					multiVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}else
				if(val.contains("/")){
					divisionVars();
					typ += variable+"{"+"Integer"+"}"+variable+"\n";
				}
				if(val.contains("<")){
					lessOp();
					
				}
				if(val.contains(">")){
					moreOp();
					
				}
				if(val.contains("==")){
					compareOp();
					
				}
				if(val.contains("!=")){
					differentOp();
					
				}
			}else{
				
				if(!val.contains("@")){
					bin = "";
					int valLen = val.length();
					if(valLen >= 8){
						if(val.contains("0") && val.contains("1") && !val.contains("2") && !val.contains("3")  && !val.contains("4")  && !val.contains("5")  && !val.contains("6")  && !val.contains("7")  && !val.contains("8")  && !val.contains("9")){
							bin = "true";
						}else{
							bin = "false";
						}
					}else{
				
							bin = "false";
						
					}
					
					
					if(val.contains("0") || val.contains("1") || val.contains("2") || val.contains("3") || val.contains("4") || val.contains("5") || val.contains("6") || val.contains("7") || val.contains("8") || val.contains("9")){
						
						
						if(!val.contains("a") && !val.contains("b") && !val.contains("c") && !val.contains("d") && !val.contains("e") && !val.contains("f") && !val.contains("g") && !val.contains("h") && !val.contains("i") && !val.contains("j") && !val.contains("k") && !val.contains("l") && !val.contains("m") && !val.contains("n") && !val.contains("o") && !val.contains("p") && !val.contains("q") && !val.contains("r") && !val.contains("s") && !val.contains("t") && !val.contains("u") && !val.contains("v") && !val.contains("w") && !val.contains("x") && !val.contains("y") && !val.contains("z") && !val.contains("A") && !val.contains("B") && !val.contains("C") && !val.contains("D") && !val.contains("E") && !val.contains("F") && !val.contains("G") && !val.contains("H") && !val.contains("I") && !val.contains("J") && !val.contains("K") && !val.contains("L") && !val.contains("M") && !val.contains("N") && !val.contains("O") && !val.contains("P") && !val.contains("Q") && !val.contains("R") && !val.contains("S") && !val.contains("T") && !val.contains("U") && !val.contains("V") && !val.contains("W") && !val.contains("X") && !val.contains("Y") && !val.contains("Z")){
							integersVars();
							if(bin.equals("false")){
								typ += variable+"{"+"Integer"+"}"+variable+"\n";
							}else{
								typ += variable+"{"+"Binary"+"}"+variable+"\n";
							}
							
						}else{
							stringVars();
							
							
							if(!val.contains("true") && !val.contains("false")){
								typ += variable+"{"+"String"+"}"+variable+"\n";
							}
						} //else alfab?co
						
					}else{
						
						stringVars();
						if(val.contains("true") || val.contains("false")){
							typ += variable+"{"+"Boolean"+"}"+variable+"\n";
						
						}else{
							typ += variable+"{"+"String"+"}"+variable+"\n";
						}
						
						
					} //else n??ico
					
				}else{
					if(!linha.contains("reg[@")){
						valueWithVars();
						
						if(vars.contains("0") || vars.contains("1") || vars.contains("2") || vars.contains("3") || vars.contains("4") || vars.contains("5") || vars.contains("6") || vars.contains("7") || vars.contains("8") || vars.contains("9")){
						
							if(!vars.contains("a") || !vars.contains("b") || !vars.contains("c") || !vars.contains("d") || !vars.contains("e") || !vars.contains("f") || !vars.contains("g") || !vars.contains("h") || !vars.contains("i") || !vars.contains("j") || !vars.contains("k") || !vars.contains("l") || !vars.contains("m") || !vars.contains("n") || !vars.contains("o") || !vars.contains("p") || !vars.contains("q") || !vars.contains("r") || !vars.contains("s") || !vars.contains("t") || !vars.contains("u") || !vars.contains("v") || !vars.contains("w") || !vars.contains("x") || !vars.contains("y") || !vars.contains("z") || !vars.contains("A") || !vars.contains("B") || !vars.contains("C") || !vars.contains("D") || !vars.contains("E") || !vars.contains("F") || !vars.contains("G") || !vars.contains("H") || !vars.contains("I") || !vars.contains("J") || !vars.contains("K") || !vars.contains("L") || !vars.contains("M") || !vars.contains("N") || !vars.contains("O") || !vars.contains("P") || !vars.contains("Q") || !vars.contains("R") || !vars.contains("S") || !vars.contains("T") || !vars.contains("U") || !vars.contains("V") || !vars.contains("W") || !vars.contains("X") || !vars.contains("Y") || !vars.contains("Z")){
							if(bin.equals("false")){
								typ += variable+"{"+"Integer"+"}"+variable+"\n";
							}else{
								typ += variable+"{"+"Binary"+"}"+variable+"\n";
							}
							}else{
								typ += variable+"{"+"String"+"}"+variable+"\n";
							} //else alfab?co
						
						}else{
							typ += variable+"{"+"String"+"}"+variable+"\n";
						}
						
					}
				}    //else @
				
			}   //else []
			
			
			
		}
		
		//Final lexer do armazenamento de variaveis	
	}//defineVariables
	
	/*
	Metodo para manipular arquivos externos pelo Plax
	*/
	public static void manipulateFiles(String lan) throws IOException{
		
	}//manipulateFiles
	
	/*
		Metodo de Impressao/Exibicao de Strings ou Inteiros
	*/
	public static void functionPrinter(){
		//Lexer da exibi? de variaveis
		if(linha.contains("sis[") & linha.contains("@")){
			sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
			textSis1 = "";
			textSis2 = "";
				if(sis.contains("[") && sis.contains("]")){
					
					sisCommand = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("]"));
					if(sisCommand.contains("+")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("+")).trim();
						val2 = sis.substring(sis.indexOf("+")+1, sis.lastIndexOf("]")).trim();
						
						stringWithOp("+");
						
						
					}else
					if(sisCommand.contains("-")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("-")).trim();
						val2 = sis.substring(sis.indexOf("-")+1, sis.lastIndexOf("]")).trim();
						
						stringWithOp("-");
					}else
					
					if(sisCommand.contains("*")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("*")).trim();
						val2 = sis.substring(sis.indexOf("*")+1, sis.lastIndexOf("]")).trim();
						
						stringWithOp("*");
					}else
					if(sisCommand.contains("/")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("/")).trim();
						val2 = sis.substring(sis.indexOf("/")+1, sis.lastIndexOf("]")).trim();
						
						stringWithOp("/");
					}else
					if(sisCommand.contains("<")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("<")).trim();
						val2 = sis.substring(sis.indexOf("<")+1, sis.lastIndexOf("]")).trim();
						
						stringWithOp("<");
						
					}else
					if(sisCommand.contains(">")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf(">")).trim();
						val2 = sis.substring(sis.indexOf(">")+1, sis.lastIndexOf("]")).trim();
						
						stringWithOp(">");
						
					}else
					if(sisCommand.contains("==")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("==")).trim();
						val2 = sis.substring(sis.indexOf("==")+2, sis.lastIndexOf("]")).trim();
						
						stringWithOp("==");
						
					}else
					if(sisCommand.contains("!=")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("!=")).trim();
						val2 = sis.substring(sis.indexOf("!=")+2, sis.lastIndexOf("]")).trim();
						
						stringWithOp("!=");
						
					}
					
				}else{
					stringWithOp("sisVariables");
				
				}
				initConsole.console.setText("<font size='5'>"+memoria+"</font>");
				if(escopeBoolean){initEscope.escopePane.setText(memoryEscope);}
				
		}
		//Final lexer de exibi? das variaveis
		
		//Lexer de exibi? de strings
		if(linha.contains("sis[") & !linha.contains("@")){
			sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
			
			//Lexer de formata? de textos
			if(sis.contains("color:blue")){
				String mem = sis.replace("color:blue{", "<font color='blue'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:red")){
				String mem = sis.replace("color:red{", "<font color='red'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:green")){
				String mem = sis.replace("color:green{", "<font color='green'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:yellow")){
				String mem = sis.replace("color:yellow{", "<font color='yellow'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:white")){
				String mem = sis.replace("color:white{", "<font color='white'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:black")){
				String mem = sis.replace("color:black{", "<font color='black'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:purple")){
				String mem = sis.replace("color:purple{", "<font color='purple'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:gray")){
				String mem = sis.replace("color:gray{", "<font color='gray'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:brown")){
				String mem = sis.replace("color:brown{", "<font color='brown'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("color:orange")){
				String mem = sis.replace("color:orange{", "<font color='orange'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:one")){
				String mem = sis.replace("size:one{", "<font size='1'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:two")){
				String mem = sis.replace("size:two{", "<font size='2'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:three")){
				String mem = sis.replace("size:three{", "<font size='3'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:four")){
				String mem = sis.replace("size:four{", "<font size='4'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:five")){
				String mem = sis.replace("size:five{", "<font size='5'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:six")){
				String mem = sis.replace("size:six{", "<font size='6'>").replace("}", "</font>");
				memoria += mem;
			}else
			if(sis.contains("size:seven")){
				String mem = sis.replace("size:seven{", "<font size='7'>").replace("}", "</font>");
				memoria += mem;
			}else{
			
			
				
				if(sis.contains("[") && sis.contains("]")){
					
					if(sis.contains("+")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("+"));
						val2 = sis.substring(sis.indexOf("+")+1, sis.lastIndexOf("]"));
						
						stringWithOp("+");
						
					}else
					if(sis.contains("-")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("-"));
						val2 = sis.substring(sis.indexOf("-")+1, sis.lastIndexOf("]"));
			
						stringWithOp("-");
					}else
					
					if(sis.contains("*")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("*"));
						val2 = sis.substring(sis.indexOf("*")+1, sis.lastIndexOf("]"));
						
						stringWithOp("*");
					}else
					if(sis.contains("/")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("/"));
						val2 = sis.substring(sis.indexOf("/")+1, sis.lastIndexOf("]"));
						
						stringWithOp("/");
					}
					if(sis.contains("<")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("<"));
						val2 = sis.substring(sis.indexOf("<")+1, sis.lastIndexOf("]"));
				
						stringWithOp("<");
						
					}
					if(sis.contains(">")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf(">"));
						val2 = sis.substring(sis.indexOf(">")+1, sis.lastIndexOf("]"));
				
						stringWithOp(">");
						
					}
					if(sis.contains("==")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("=="));
						val2 = sis.substring(sis.indexOf("==")+2, sis.lastIndexOf("]"));
					
						stringWithOp("==");
						
					}
					if(sis.contains("!=")){
						val1 = sis.substring(sis.indexOf("[")+1, sis.lastIndexOf("!="));
						val2 = sis.substring(sis.indexOf("!=")+2, sis.lastIndexOf("]"));
				
						stringWithOp("!=");
						
					}
					
				}else{
					memoria += sis;
				}
			}
			//Final lexer de formata?
			
			
			initConsole.console.setText("<font size='5'>"+memoria+"</font>");
			if(escopeBoolean){ initEscope.escopePane.setText(memoryEscope);}
		}
	}//functionPrinter
	
	public static void basicCommands() throws IOException{
		
	}//basicCommands
	
	//Metodo para definir Visibilidade do Console
	public static void consoleVisibility(String lan){
		if(linha.contains("#output")){
			output = linha.substring(linha.indexOf(":")+1, linha.lastIndexOf(".")).trim();
			
		}
		
		if(output.contains("console")){
			if(escopeBoolean){ memoryEscope += "the output is in console mode<br>"; initEscope.escopePane.setText(memoryEscope);}
			if(linePlax.contains("call[")){
				if(lan.equals("read")){
					
					if(initConsole.isVisible()){
						
					}else{
						initConsole.setVisible(true);
					}
					
				}else{
					if(!initConsole.isVisible()){
						initConsole.setVisible(true);
					}else{
						initConsole.setVisible(false);
					}
					
				}
			}else{
	
				if(lan.equals("normal")){
					initConsole.setVisible(true);
				}
			}
			
			
		}else{
			if(output.contains("gui")){
				initConsole.setVisible(false);
				if(escopeBoolean){ memoryEscope += "the output is in GUI mode<br>"; initEscope.escopePane.setText(memoryEscope);}
			}
		}
	}//consoleVisibility
	
	//Metodo do parametro #reg e Funcao REG de
	//Construcao de registrador Plax
	public static void positionRegister(){
			if(linha.contains("#reg")){
				reg = linha.substring(linha.indexOf("[")+1, linha.lastIndexOf("]."));
				if(escopeBoolean){memoryEscope += "Creating a registrator with '"+reg+"' addresses <br>"; initEscope.escopePane.setText(memoryEscope);}
				vetor = new String[integers(reg)];
			}

			
			if(!linha.contains(": reg[") && linha.contains("reg[") && !linha.contains("conv[")){
				String position = linha.substring(linha.indexOf("reg[")+4, linha.lastIndexOf("]")).trim();
				String value = linha.substring(linha.indexOf(":")+1, linha.lastIndexOf(".")).trim();
				
				
				if(position.contains("@")){
					
					String positionVar = position;
					
							if(position.contains("@")){
							
								int lenVars = position.length()+1;
								position = memoriaVar.substring(memoriaVar.indexOf(position+"{")+lenVars, memoriaVar.lastIndexOf("}"+position));
							}
							
						
							if(escopeBoolean){memoryEscope += "registering in address '"+position+"' with Dynamic Variable '"+positionVar+"' ";}
						
				}else{
					if(escopeBoolean){memoryEscope += "registering in address '"+position+"' ";}
				}
				
				if(value.contains("@")){
					
					String valueVar = value;
					
								if(value.contains("@")){
									
									int lenVars = value.length()+1;
					
									value = memoriaVar.substring(memoriaVar.indexOf(value+"{")+lenVars, memoriaVar.lastIndexOf("}"+value));
			
								}
								
							
					
						
						
							if(escopeBoolean){memoryEscope += "the value '"+value+"' with Dynamic Variable '"+valueVar+"'<br>";}
						
						
				}else{
					if(escopeBoolean){memoryEscope += "the value '"+value+"'<br>";}
				}
					vetor[integers(position)] = value;
					if(escopeBoolean){initEscope.escopePane.setText(memoryEscope);}
				
			}
			
			if(linha.contains("conv[")){
				String conv = linha.substring(linha.indexOf("conv[")+4, linha.lastIndexOf("].")+1);
				String register = conv.substring(conv.indexOf("[")+1, conv.lastIndexOf("-to-"));
				String type = conv.substring(conv.indexOf("-to-")+4, conv.lastIndexOf("]"));
				
				
				
				String position = register.substring(register.indexOf("reg[")+4, register.lastIndexOf("]"));
				
				if(position.contains("@")){
					if(position.contains("@a0")){position = a0;}
					if(position.contains("@a1")){position = a1;}
					if(position.contains("@a2")){position = a2;}
					if(position.contains("@a3")){position = a3;}
					if(position.contains("@a4")){position = a4;}
					if(position.contains("@a5")){position = a5;}
					if(position.contains("@a6")){position = a6;}
					if(position.contains("@a7")){position = a7;}
					if(position.contains("@a8")){position = a8;}
					if(position.contains("@a9")){position = a9;}
					
					if(position.contains("@b0")){position = b0;}
					if(position.contains("@b1")){position = b1;}
					if(position.contains("@b2")){position = b2;}
					if(position.contains("@b3")){position = b3;}
					if(position.contains("@b4")){position = b4;}
					if(position.contains("@b5")){position = b5;}
					if(position.contains("@b6")){position = b6;}
					if(position.contains("@b7")){position = b7;}
					if(position.contains("@b8")){position = b8;}
					if(position.contains("@b9")){position = b9;}
					
					if(position.contains("@c0")){position = c0;}
					if(position.contains("@c1")){position = c1;}
					if(position.contains("@c2")){position = c2;}
					if(position.contains("@c3")){position = c3;}
					if(position.contains("@c4")){position = c4;}
					if(position.contains("@c5")){position = c5;}
					if(position.contains("@c6")){position = c6;}
					if(position.contains("@c7")){position = c7;}
					if(position.contains("@c8")){position = c8;}
					if(position.contains("@c9")){position = c9;}
					
					if(position.contains("@d0")){position = d0;}
					if(position.contains("@d1")){position = d1;}
					if(position.contains("@d2")){position = d2;}
					if(position.contains("@d3")){position = d3;}
					if(position.contains("@d4")){position = d4;}
					if(position.contains("@d5")){position = d5;}
					if(position.contains("@d6")){position = d6;}
					if(position.contains("@d7")){position = d7;}
					if(position.contains("@d8")){position = d8;}
					if(position.contains("@d9")){position = d9;}
					
					if(position.contains("@e0")){position = e0;}
					if(position.contains("@e1")){position = e1;}
					if(position.contains("@e2")){position = e2;}
					if(position.contains("@e3")){position = e3;}
					if(position.contains("@e4")){position = e4;}
					if(position.contains("@e5")){position = e5;}
					if(position.contains("@e6")){position = e6;}
					if(position.contains("@e7")){position = e7;}
					if(position.contains("@e8")){position = e8;}
					if(position.contains("@e9")){position = e9;}
					
					if(position.contains("@f0")){position = f0;}
					if(position.contains("@f1")){position = f1;}
					if(position.contains("@f2")){position = f2;}
					if(position.contains("@f3")){position = f3;}
					if(position.contains("@f4")){position = f4;}
					if(position.contains("@f5")){position = f5;}
					if(position.contains("@f6")){position = f6;}
					if(position.contains("@f7")){position = f7;}
					if(position.contains("@f8")){position = f8;}
					if(position.contains("@f9")){position = f9;}
					
					if(position.contains("@g0")){position = g0;}
					if(position.contains("@g1")){position = g1;}
					if(position.contains("@g2")){position = g2;}
					if(position.contains("@g3")){position = g3;}
					if(position.contains("@g4")){position = g4;}
					if(position.contains("@g5")){position = g5;}
					if(position.contains("@g6")){position = g6;}
					if(position.contains("@g7")){position = g7;}
					if(position.contains("@g8")){position = g8;}
					if(position.contains("@g9")){position = g9;}
					
					if(position.contains("@h0")){position = h0;}
					if(position.contains("@h1")){position = h1;}
					if(position.contains("@h2")){position = h2;}
					if(position.contains("@h3")){position = h3;}
					if(position.contains("@h4")){position = h4;}
					if(position.contains("@h5")){position = h5;}
					if(position.contains("@h6")){position = h6;}
					if(position.contains("@h7")){position = h7;}
					if(position.contains("@h8")){position = h8;}
					if(position.contains("@h9")){position = h9;}
					
					if(position.contains("@i0")){position = i0;}
					if(position.contains("@i1")){position = i1;}
					if(position.contains("@i2")){position = i2;}
					if(position.contains("@i3")){position = i3;}
					if(position.contains("@i4")){position = i4;}
					if(position.contains("@i5")){position = i5;}
					if(position.contains("@i6")){position = i6;}
					if(position.contains("@i7")){position = i7;}
					if(position.contains("@i8")){position = i8;}
					if(position.contains("@i9")){position = i9;}
					
					if(position.contains("@j0")){position = j0;}
					if(position.contains("@j1")){position = j1;}
					if(position.contains("@j2")){position = j2;}
					if(position.contains("@j3")){position = j3;}
					if(position.contains("@j4")){position = j4;}
					if(position.contains("@j5")){position = j5;}
					if(position.contains("@j6")){position = j6;}
					if(position.contains("@j7")){position = j7;}
					if(position.contains("@j8")){position = j8;}
					if(position.contains("@j9")){position = j9;}
					
					if(position.contains("@k0")){position = k0;}
					if(position.contains("@k1")){position = k1;}
					if(position.contains("@k2")){position = k2;}
					if(position.contains("@k3")){position = k3;}
					if(position.contains("@k4")){position = k4;}
					if(position.contains("@k5")){position = k5;}
					if(position.contains("@k6")){position = k6;}
					if(position.contains("@k7")){position = k7;}
					if(position.contains("@k8")){position = k8;}
					if(position.contains("@k9")){position = k9;}
					
					if(position.contains("@l0")){position = l0;}
					if(position.contains("@l1")){position = l1;}
					if(position.contains("@l2")){position = l2;}
					if(position.contains("@l3")){position = l3;}
					if(position.contains("@l4")){position = l4;}
					if(position.contains("@l5")){position = l5;}
					if(position.contains("@l6")){position = l6;}
					if(position.contains("@l7")){position = l7;}
					if(position.contains("@l8")){position = l8;}
					if(position.contains("@l9")){position = l9;}
					
					if(position.contains("@m0")){position = m0;}
					if(position.contains("@m1")){position = m1;}
					if(position.contains("@m2")){position = m2;}
					if(position.contains("@m3")){position = m3;}
					if(position.contains("@m4")){position = m4;}
					if(position.contains("@m5")){position = m5;}
					if(position.contains("@m6")){position = m6;}
					if(position.contains("@m7")){position = m7;}
					if(position.contains("@m8")){position = m8;}
					if(position.contains("@m9")){position = m9;}
					
					if(position.contains("@n0")){position = n0;}
					if(position.contains("@n1")){position = n1;}
					if(position.contains("@n2")){position = n2;}
					if(position.contains("@n3")){position = n3;}
					if(position.contains("@n4")){position = n4;}
					if(position.contains("@n5")){position = n5;}
					if(position.contains("@n6")){position = n6;}
					if(position.contains("@n7")){position = n7;}
					if(position.contains("@n8")){position = n8;}
					if(position.contains("@n9")){position = n9;}
					
					if(position.contains("@o0")){position = o0;}
					if(position.contains("@o1")){position = o1;}
					if(position.contains("@o2")){position = o2;}
					if(position.contains("@o3")){position = o3;}
					if(position.contains("@o4")){position = o4;}
					if(position.contains("@o5")){position = o5;}
					if(position.contains("@o6")){position = o6;}
					if(position.contains("@o7")){position = o7;}
					if(position.contains("@o8")){position = o8;}
					if(position.contains("@o9")){position = o9;}
					
					if(position.contains("@p0")){position = p0;}
					if(position.contains("@p1")){position = p1;}
					if(position.contains("@p2")){position = p2;}
					if(position.contains("@p3")){position = p3;}
					if(position.contains("@p4")){position = p4;}
					if(position.contains("@p5")){position = p5;}
					if(position.contains("@p6")){position = p6;}
					if(position.contains("@p7")){position = p7;}
					if(position.contains("@p8")){position = p8;}
					if(position.contains("@p9")){position = p9;}
					
					if(position.contains("@q0")){position = q0;}
					if(position.contains("@q1")){position = q1;}
					if(position.contains("@q2")){position = q2;}
					if(position.contains("@q3")){position = q3;}
					if(position.contains("@q4")){position = q4;}
					if(position.contains("@q5")){position = q5;}
					if(position.contains("@q6")){position = q6;}
					if(position.contains("@q7")){position = q7;}
					if(position.contains("@q8")){position = q8;}
					if(position.contains("@q9")){position = q9;}
					
					if(position.contains("@r0")){position = r0;}
					if(position.contains("@r1")){position = r1;}
					if(position.contains("@r2")){position = r2;}
					if(position.contains("@r3")){position = r3;}
					if(position.contains("@r4")){position = r4;}
					if(position.contains("@r5")){position = r5;}
					if(position.contains("@r6")){position = r6;}
					if(position.contains("@r7")){position = r7;}
					if(position.contains("@r8")){position = r8;}
					if(position.contains("@r9")){position = r9;}
					
					if(position.contains("@s0")){position = s0;}
					if(position.contains("@s1")){position = s1;}
					if(position.contains("@s2")){position = s2;}
					if(position.contains("@s3")){position = s3;}
					if(position.contains("@s4")){position = s4;}
					if(position.contains("@s5")){position = s5;}
					if(position.contains("@s6")){position = s6;}
					if(position.contains("@s7")){position = s7;}
					if(position.contains("@s8")){position = s8;}
					if(position.contains("@s9")){position = s9;}
					
					if(position.contains("@t0")){position = t0;}
					if(position.contains("@t1")){position = t1;}
					if(position.contains("@t2")){position = t2;}
					if(position.contains("@t3")){position = t3;}
					if(position.contains("@t4")){position = t4;}
					if(position.contains("@t5")){position = t5;}
					if(position.contains("@t6")){position = t6;}
					if(position.contains("@t7")){position = t7;}
					if(position.contains("@t8")){position = t8;}
					if(position.contains("@t9")){position = t9;}
					
					if(position.contains("@u0")){position = u0;}
					if(position.contains("@u1")){position = u1;}
					if(position.contains("@u2")){position = u2;}
					if(position.contains("@u3")){position = u3;}
					if(position.contains("@u4")){position = u4;}
					if(position.contains("@u5")){position = u5;}
					if(position.contains("@u6")){position = u6;}
					if(position.contains("@u7")){position = u7;}
					if(position.contains("@u8")){position = u8;}
					if(position.contains("@u9")){position = u9;}
					
					if(position.contains("@v0")){position = v0;}
					if(position.contains("@v1")){position = v1;}
					if(position.contains("@v2")){position = v2;}
					if(position.contains("@v3")){position = v3;}
					if(position.contains("@v4")){position = v4;}
					if(position.contains("@v5")){position = v5;}
					if(position.contains("@v6")){position = v6;}
					if(position.contains("@v7")){position = v7;}
					if(position.contains("@v8")){position = v8;}
					if(position.contains("@v9")){position = v9;}
					
					if(position.contains("@w0")){position = w0;}
					if(position.contains("@w1")){position = w1;}
					if(position.contains("@w2")){position = w2;}
					if(position.contains("@w3")){position = w3;}
					if(position.contains("@w4")){position = w4;}
					if(position.contains("@w5")){position = w5;}
					if(position.contains("@w6")){position = w6;}
					if(position.contains("@w7")){position = w7;}
					if(position.contains("@w8")){position = w8;}
					if(position.contains("@w9")){position = w9;}
					
					if(position.contains("@x0")){position = x0;}
					if(position.contains("@x1")){position = x1;}
					if(position.contains("@x2")){position = x2;}
					if(position.contains("@x3")){position = x3;}
					if(position.contains("@x4")){position = x4;}
					if(position.contains("@x5")){position = x5;}
					if(position.contains("@x6")){position = x6;}
					if(position.contains("@x7")){position = x7;}
					if(position.contains("@x8")){position = x8;}
					if(position.contains("@x9")){position = x9;}
					
					if(position.contains("@y0")){position = y0;}
					if(position.contains("@y1")){position = y1;}
					if(position.contains("@y2")){position = y2;}
					if(position.contains("@y3")){position = y3;}
					if(position.contains("@y4")){position = y4;}
					if(position.contains("@y5")){position = y5;}
					if(position.contains("@y6")){position = y6;}
					if(position.contains("@y7")){position = y7;}
					if(position.contains("@y8")){position = y8;}
					if(position.contains("@y9")){position = y9;}
					
					if(position.contains("@z0")){position = z0;}
					if(position.contains("@z1")){position = z1;}
					if(position.contains("@z2")){position = z2;}
					if(position.contains("@z3")){position = z3;}
					if(position.contains("@z4")){position = z4;}
					if(position.contains("@z5")){position = z5;}
					if(position.contains("@z6")){position = z6;}
					if(position.contains("@z7")){position = z7;}
					if(position.contains("@z8")){position = z8;}
					if(position.contains("@z9")){position = z9;}
				}
				
				String getValueR = vetor[integers(position)];
				
				if(type.contains("bit") && conv.contains("-to-")){
					int lenValue = getValueR.length();
					String bits = "";
					for(int i = 0; i < lenValue; i++){
						String character = getValueR.substring(i, i+1);
						
					
						
						
						if(character.equals("a")){bits += "01100001"+" ";}
						if(character.equals("b")){bits += "01100010"+" ";}
						if(character.equals("c")){bits += "01100011"+" ";}
						if(character.equals("d")){bits += "01100100"+" ";}
						if(character.equals("e")){bits += "01100101"+" ";}
						if(character.equals("f")){bits += "01100110"+" ";}
						if(character.equals("g")){bits += "01100111"+" ";}
						if(character.equals("h")){bits += "01101000"+" ";}
						if(character.equals("i")){bits += "01101001"+" ";}
						if(character.equals("j")){bits += "01101010"+" ";}
						if(character.equals("k")){bits += "01101011"+" ";}
						if(character.equals("l")){bits += "01101100"+" ";}
						if(character.equals("m")){bits += "01101101"+" ";}
						if(character.equals("n")){bits += "01101110"+" ";}
						if(character.equals("o")){bits += "01101111"+" ";}
						if(character.equals("p")){bits += "01110000"+" ";}
						if(character.equals("q")){bits += "01110001"+" ";}
						if(character.equals("r")){bits += "01110010"+" ";}
						if(character.equals("s")){bits += "01110011"+" ";}
						if(character.equals("t")){bits += "01110100"+" ";}
						if(character.equals("u")){bits += "01110101"+" ";}
						if(character.equals("v")){bits += "01110110"+" ";}
						if(character.equals("w")){bits += "01110111"+" ";}
						if(character.equals("x")){bits += "01111000"+" ";}
						if(character.equals("y")){bits += "01111001"+" ";}
						if(character.equals("z")){bits += "01111010"+" ";}
						if(character.equals(" ")){bits += "00100000"+" ";}
						if(character.equals("	")){bits += "00001001"+" ";}
						if(character.equals("!")){bits += "00100001"+" ";}
						if(character.equals('"')){bits += "00100010"+" ";}
						if(character.equals("#")){bits += "00100011"+" ";}
						if(character.equals("$")){bits += "00100100"+" ";}
						if(character.equals("%")){bits += "00100101"+" ";}
						if(character.equals("&")){bits += "00100110"+" ";}
						if(character.equals("'")){bits += "00100111"+" ";}
						if(character.equals("(")){bits += "00101000"+" ";}
						if(character.equals(")")){bits += "00101001"+" ";}
						if(character.equals("*")){bits += "00101010"+" ";}
						if(character.equals("+")){bits += "00101011"+" ";}
						if(character.equals("-")){bits += "00101101"+" ";}
						if(character.equals(".")){bits += "00101110"+" ";}
						if(character.equals("/")){bits += "00101111"+" ";}
						if(character.equals("0")){bits += "00110000"+" ";}
						if(character.equals("1")){bits += "00110001"+" ";}
						if(character.equals("2")){bits += "00110010"+" ";}
						if(character.equals("3")){bits += "00110011"+" ";}
						if(character.equals("4")){bits += "00110100"+" ";}
						if(character.equals("5")){bits += "00110101"+" ";}
						if(character.equals("6")){bits += "00110110"+" ";}
						if(character.equals("7")){bits += "00110111"+" ";}
						if(character.equals("8")){bits += "00111000"+" ";}
						if(character.equals("9")){bits += "00111001"+" ";}
						if(character.equals(":")){bits += "00111010"+" ";}
						if(character.equals(";")){bits += "00111011"+" ";}
						if(character.equals("<")){bits += "00111100"+" ";}
						if(character.equals("=")){bits += "00111101"+" ";}
						if(character.equals(">")){bits += "00111110"+" ";}
						if(character.equals("?")){bits += "00111111"+" ";}
						if(character.equals("@")){bits += "01000000"+" ";}
						if(character.equals("A")){bits += "01000001"+" ";}
						if(character.equals("B")){bits += "01000010"+" ";}
						if(character.equals("C")){bits += "01000011"+" ";}
						if(character.equals("D")){bits += "01000100"+" ";}
						if(character.equals("E")){bits += "01000101"+" ";}
						if(character.equals("F")){bits += "01000110"+" ";}
						if(character.equals("G")){bits += "01000111"+" ";}
						if(character.equals("H")){bits += "01001000"+" ";}
						if(character.equals("I")){bits += "01001001"+" ";}
						if(character.equals("J")){bits += "01001010"+" ";}
						if(character.equals("K")){bits += "01001011"+" ";}
						if(character.equals("L")){bits += "01001100"+" ";}
						if(character.equals("M")){bits += "01001101"+" ";}
						if(character.equals("N")){bits += "01001110"+" ";}
						if(character.equals("O")){bits += "01001111"+" ";}
						if(character.equals("P")){bits += "01010000"+" ";}
						if(character.equals("Q")){bits += "01010001"+" ";}
						if(character.equals("R")){bits += "01010010"+" ";}
						if(character.equals("S")){bits += "01010011"+" ";}
						if(character.equals("T")){bits += "01010100"+" ";}
						if(character.equals("U")){bits += "01010101"+" ";}
						if(character.equals("V")){bits += "01010110"+" ";}
						if(character.equals("W")){bits += "01010111"+" ";}
						if(character.equals("X")){bits += "01011000"+" ";}
						if(character.equals("Y")){bits += "01011001"+" ";}
						if(character.equals("Z")){bits += "01011010"+" ";}
						if(character.equals("[")){bits += "01011011"+" ";}
						if(character.equals("\\")){bits += "01011100"+" ";}
						if(character.equals("]")){bits += "01011101"+" ";}
						if(character.equals("^")){bits += "01011110"+" ";}
						if(character.equals("_")){bits += "01011111"+" ";}
						if(character.equals("{")){bits += "01111011"+" ";}
						if(character.equals("|")){bits += "01111100"+" ";}
						if(character.equals("}")){bits += "01111101"+" ";}
						if(character.equals("~")){bits += "01111110"+" ";}
					}
					
					vetor[integers(position)] = bits;
				}
				
				if(type.contains("byte") && conv.contains("-to-")){
				
					int lenValue = getValueR.length();
					String bytes = "";
					int num = 8;
					int ij = 0;
					for(int i = 0; i < lenValue; i++){
						
						String character = "";
						String memoryChar = "";
						int j = ij;
						while(j <= num){
							
							character = getValueR.substring(j, j+1);
							memoryChar += character;
							j = j + 1;
						}
						
					
						
						if(memoryChar.equals("01100001")){bytes += "a";}
						if(memoryChar.equals("01100010")){bytes += "c";}
						if(memoryChar.equals("01100011")){bytes += "c";}
						if(memoryChar.equals("01100100")){bytes += "d";}
						if(memoryChar.equals("01100101")){bytes += "e";}
						if(memoryChar.equals("01100110")){bytes += "f";}
						if(memoryChar.equals("01100111")){bytes += "g";}
						if(memoryChar.equals("01101000")){bytes += "h";}
						if(memoryChar.equals("01101001")){bytes += "i";}
						if(memoryChar.equals("01101010")){bytes += "j";}
						if(memoryChar.equals("01101011")){bytes += "k";}
						if(memoryChar.equals("01101100")){bytes += "l";}
						if(memoryChar.equals("01101101")){bytes += "m";}
						if(memoryChar.equals("01101110")){bytes += "n";}
						if(memoryChar.equals("01101111")){bytes += "o";}
						if(memoryChar.equals("01110000")){bytes += "p";}
						if(memoryChar.equals("01110001")){bytes += "q";}
						if(memoryChar.equals("01110010")){bytes += "r";}
						if(memoryChar.equals("01110011")){bytes += "s";}
						if(memoryChar.equals("01110100")){bytes += "t";}
						if(memoryChar.equals("01110101")){bytes += "u";}
						if(memoryChar.equals("01110110")){bytes += "v";}
						if(memoryChar.equals("01110111")){bytes += "w";}
						if(memoryChar.equals("01111000")){bytes += "x";}
						if(memoryChar.equals("01111001")){bytes += "y";}
						if(memoryChar.equals("01111010")){bytes += "z";}
						if(memoryChar.equals("00100000")){bytes += " ";}
						if(memoryChar.equals("00001001")){bytes += "	";}
						/* if(memoryChar.equals("!")){bytes += "00100001"+" ";}
						if(memoryChar.equals('"')){bytes += "00100010"+" ";}
						if(memoryChar.equals("#")){bytes += "00100011"+" ";}
						if(memoryChar.equals("$")){bytes += "00100100"+" ";}
						if(memoryChar.equals("%")){bytes += "00100101"+" ";}
						if(memoryChar.equals("&")){bytes += "00100110"+" ";}
						if(memoryChar.equals("'")){bytes += "00100111"+" ";}
						if(memoryChar.equals("(")){bytes += "00101000"+" ";}
						if(memoryChar.equals(")")){bytes += "00101001"+" ";}
						if(memoryChar.equals("*")){bytes += "00101010"+" ";}
						if(memoryChar.equals("+")){bytes += "00101011"+" ";}
						if(memoryChar.equals("-")){bytes += "00101101"+" ";}
						if(memoryChar.equals(".")){bytes += "00101110"+" ";}
						if(memoryChar.equals("/")){bytes += "00101111"+" ";}
						if(memoryChar.equals("0")){bytes += "00110000"+" ";}
						if(memoryChar.equals("1")){bytes += "00110001"+" ";}
						if(memoryChar.equals("2")){bytes += "00110010"+" ";}
						if(memoryChar.equals("3")){bytes += "00110011"+" ";}
						if(memoryChar.equals("4")){bytes += "00110100"+" ";}
						if(memoryChar.equals("5")){bytes += "00110101"+" ";}
						if(memoryChar.equals("6")){bytes += "00110110"+" ";}
						if(memoryChar.equals("7")){bytes += "00110111"+" ";}
						if(memoryChar.equals("8")){bytes += "00111000"+" ";}
						if(memoryChar.equals("9")){bytes += "00111001"+" ";}
						if(memoryChar.equals(":")){bytes += "00111010"+" ";}
						if(memoryChar.equals(";")){bytes += "00111011"+" ";}
						if(memoryChar.equals("<")){bytes += "00111100"+" ";}
						if(memoryChar.equals("=")){bytes += "00111101"+" ";}
						if(memoryChar.equals(">")){bytes += "00111110"+" ";}
						if(memoryChar.equals("?")){bytes += "00111111"+" ";}
						if(memoryChar.equals("@")){bytes += "01000000"+" ";}
						if(memoryChar.equals("A")){bytes += "01000001"+" ";}
						if(memoryChar.equals("B")){bytes += "01000010"+" ";}
						if(memoryChar.equals("C")){bytes += "01000011"+" ";}
						if(memoryChar.equals("D")){bytes += "01000100"+" ";}
						if(memoryChar.equals("E")){bytes += "01000101"+" ";}
						if(memoryChar.equals("F")){bytes += "01000110"+" ";}
						if(memoryChar.equals("G")){bytes += "01000111"+" ";}
						if(memoryChar.equals("H")){bytes += "01001000"+" ";}
						if(memoryChar.equals("I")){bytes += "01001001"+" ";}
						if(memoryChar.equals("J")){bytes += "01001010"+" ";}
						if(memoryChar.equals("K")){bytes += "01001011"+" ";}
						if(memoryChar.equals("L")){bytes += "01001100"+" ";}
						if(memoryChar.equals("M")){bytes += "01001101"+" ";}
						if(memoryChar.equals("N")){bytes += "01001110"+" ";}
						if(memoryChar.equals("O")){bytes += "01001111"+" ";}
						if(memoryChar.equals("P")){bytes += "01010000"+" ";}
						if(memoryChar.equals("Q")){bytes += "01010001"+" ";}
						if(memoryChar.equals("R")){bytes += "01010010"+" ";}
						if(memoryChar.equals("S")){bytes += "01010011"+" ";}
						if(memoryChar.equals("T")){bytes += "01010100"+" ";}
						if(memoryChar.equals("U")){bytes += "01010101"+" ";}
						if(memoryChar.equals("V")){bytes += "01010110"+" ";}
						if(memoryChar.equals("W")){bytes += "01010111"+" ";}
						if(memoryChar.equals("X")){bytes += "01011000"+" ";}
						if(memoryChar.equals("Y")){bytes += "01011001"+" ";}
						if(memoryChar.equals("Z")){bytes += "01011010"+" ";}
						if(memoryChar.equals("[")){bytes += "01011011"+" ";}
						if(memoryChar.equals("\\")){bytes += "01011100"+" ";}
						if(memoryChar.equals("]")){bytes += "01011101"+" ";}
						if(memoryChar.equals("^")){bytes += "01011110"+" ";}
						if(memoryChar.equals("_")){bytes += "01011111"+" ";}
						if(memoryChar.equals("{")){bytes += "01111011"+" ";}
						if(memoryChar.equals("|")){bytes += "01111100"+" ";}
						if(memoryChar.equals("}")){bytes += "01111101"+" ";}
						if(memoryChar.equals("~")){bytes += "01111110"+" ";} */
						
						num += 8;
						ij = j;
					}
					
					vetor[integers(position)] = bytes;
				}
				
				
			}
			
			
	}
	
	/*
		Erro de falta de declaracao de variaveis
	*/
	public static void errorDeclarationVariables(){

		memoria = ""; 
		memoriaBase = "";
		//Erro de Falta de declara? das vari?is
		a0 = "<html><font color='red'>a variavel @a0 n?foi declarada!</font></html>";
		a1 = "<html><font color='red'>a variavel @a1 n?foi declarada!</font></html>";
		a2 = "<html><font color='red'>a variavel @a2 n?foi declarada!</font></html>";
		a3 = "<html><font color='red'>a variavel @a3 n?foi declarada!</font></html>";
		a4 = "<html><font color='red'>a variavel @a4 n?foi declarada!</font></html>";
		a5 = "<html><font color='red'>a variavel @a5 n?foi declarada!</font></html>";
		a6 = "<html><font color='red'>a variavel @a6 n?foi declarada!</font></html>";
		a7 = "<html><font color='red'>a variavel @a7 n?foi declarada!</font></html>";
		a8 = "<html><font color='red'>a variavel @a8 n?foi declarada!</font></html>";
		a9 = "<html><font color='red'>a variavel @a9 n?foi declarada!</font></html>";
		b0 = "<html><font color='red'>a variavel @b0 n?foi declarada!</font></html>";
		b1 = "<html><font color='red'>a variavel @b1 n?foi declarada!</font></html>";
		b2 = "<html><font color='red'>a variavel @b2 n?foi declarada!</font></html>";
		b3 = "<html><font color='red'>a variavel @b3 n?foi declarada!</font></html>";
		b4 = "<html><font color='red'>a variavel @b4 n?foi declarada!</font></html>";
		b5 = "<html><font color='red'>a variavel @b5 n?foi declarada!</font></html>";
		b6 = "<html><font color='red'>a variavel @b6 n?foi declarada!</font></html>";
		b7 = "<html><font color='red'>a variavel @b7 n?foi declarada!</font></html>";
		b8 = "<html><font color='red'>a variavel @b8 n?foi declarada!</font></html>";
		b9 = "<html><font color='red'>a variavel @b9 n?foi declarada!</font></html>";
		c0 = "<html><font color='red'>a variavel @c0 n?foi declarada!</font></html>";
		c1 = "<html><font color='red'>a variavel @c1 n?foi declarada!</font></html>";
		c2 = "<html><font color='red'>a variavel @c2 n?foi declarada!</font></html>";
		c3 = "<html><font color='red'>a variavel @c3 n?foi declarada!</font></html>";
		c4 = "<html><font color='red'>a variavel @c4 n?foi declarada!</font></html>";
		c5 = "<html><font color='red'>a variavel @c5 n?foi declarada!</font></html>";
		c6 = "<html><font color='red'>a variavel @c6 n?foi declarada!</font></html>";
		c7 = "<html><font color='red'>a variavel @c7 n?foi declarada!</font></html>";
		c8 = "<html><font color='red'>a variavel @c8 n?foi declarada!</font></html>";
		c9 = "<html><font color='red'>a variavel @c9 n?foi declarada!</font></html>";
		d0 = "<html><font color='red'>a variavel @d0 n?foi declarada!</font></html>";
		d1 = "<html><font color='red'>a variavel @d1 n?foi declarada!</font></html>";
		d2 = "<html><font color='red'>a variavel @d2 n?foi declarada!</font></html>";
		d3 = "<html><font color='red'>a variavel @d3 n?foi declarada!</font></html>";
		d4 = "<html><font color='red'>a variavel @d4 n?foi declarada!</font></html>";
		d5 = "<html><font color='red'>a variavel @d5 n?foi declarada!</font></html>";
		d6 = "<html><font color='red'>a variavel @d6 n?foi declarada!</font></html>";
		d7 = "<html><font color='red'>a variavel @d7 n?foi declarada!</font></html>";
		d8 = "<html><font color='red'>a variavel @d8 n?foi declarada!</font></html>";
		d9 = "<html><font color='red'>a variavel @d9 n?foi declarada!</font></html>";
		e0 = "<html><font color='red'>a variavel @e0 n?foi declarada!</font></html>";
		e1 = "<html><font color='red'>a variavel @e1 n?foi declarada!</font></html>";
		e2 = "<html><font color='red'>a variavel @e2 n?foi declarada!</font></html>";
		e3 = "<html><font color='red'>a variavel @e3 n?foi declarada!</font></html>";
		e4 = "<html><font color='red'>a variavel @e4 n?foi declarada!</font></html>";
		e5 = "<html><font color='red'>a variavel @e5 n?foi declarada!</font></html>";
		e6 = "<html><font color='red'>a variavel @e6 n?foi declarada!</font></html>";
		e7 = "<html><font color='red'>a variavel @e7 n?foi declarada!</font></html>";
		e8 = "<html><font color='red'>a variavel @e8 n?foi declarada!</font></html>";
		e9 = "<html><font color='red'>a variavel @e9 n?foi declarada!</font></html>";
		f0 = "<html><font color='red'>a variavel @f0 n?foi declarada!</font></html>";
		f1 = "<html><font color='red'>a variavel @f1 n?foi declarada!</font></html>";
		f2 = "<html><font color='red'>a variavel @f2 n?foi declarada!</font></html>";
		f3 = "<html><font color='red'>a variavel @f3 n?foi declarada!</font></html>";
		f4 = "<html><font color='red'>a variavel @f4 n?foi declarada!</font></html>";
		f5 = "<html><font color='red'>a variavel @f5 n?foi declarada!</font></html>";
		f6 = "<html><font color='red'>a variavel @f6 n?foi declarada!</font></html>";
		f7 = "<html><font color='red'>a variavel @f7 n?foi declarada!</font></html>";
		f8 = "<html><font color='red'>a variavel @f8 n?foi declarada!</font></html>";
		f9 = "<html><font color='red'>a variavel @f9 n?foi declarada!</font></html>";
		g0 = "<html><font color='red'>a variavel @g0 n?foi declarada!</font></html>";
		g1 = "<html><font color='red'>a variavel @g1 n?foi declarada!</font></html>";
		g2 = "<html><font color='red'>a variavel @g2 n?foi declarada!</font></html>";
		g3 = "<html><font color='red'>a variavel @g3 n?foi declarada!</font></html>";
		g4 = "<html><font color='red'>a variavel @g4 n?foi declarada!</font></html>";
		g5 = "<html><font color='red'>a variavel @g5 n?foi declarada!</font></html>";
		g6 = "<html><font color='red'>a variavel @g6 n?foi declarada!</font></html>";
		g7 = "<html><font color='red'>a variavel @g7 n?foi declarada!</font></html>";
		g8 = "<html><font color='red'>a variavel @g8 n?foi declarada!</font></html>";
		g9 = "<html><font color='red'>a variavel @g9 n?foi declarada!</font></html>";
		h0 = "<html><font color='red'>a variavel @a0 n?foi declarada!</font></html>";
		h1 = "<html><font color='red'>a variavel @h1 n?foi declarada!</font></html>";
		h2 = "<html><font color='red'>a variavel @h2 n?foi declarada!</font></html>";
		h3 = "<html><font color='red'>a variavel @h3 n?foi declarada!</font></html>";
		h4 = "<html><font color='red'>a variavel @h4 n?foi declarada!</font></html>";
		h5 = "<html><font color='red'>a variavel @h5 n?foi declarada!</font></html>";
		h6 = "<html><font color='red'>a variavel @h6 n?foi declarada!</font></html>";
		h7 = "<html><font color='red'>a variavel @h7 n?foi declarada!</font></html>";
		h8 = "<html><font color='red'>a variavel @h8 n?foi declarada!</font></html>";
		h9 = "<html><font color='red'>a variavel @h9 n?foi declarada!</font></html>";
		i0 = "<html><font color='red'>a variavel @i0 n?foi declarada!</font></html>";
		i1 = "<html><font color='red'>a variavel @i1 n?foi declarada!</font></html>";
		i2 = "<html><font color='red'>a variavel @i2 n?foi declarada!</font></html>";
		i3 = "<html><font color='red'>a variavel @i3 n?foi declarada!</font></html>";
		i4 = "<html><font color='red'>a variavel @i4 n?foi declarada!</font></html>";
		i5 = "<html><font color='red'>a variavel @i5 n?foi declarada!</font></html>";
		i6 = "<html><font color='red'>a variavel @i6 n?foi declarada!</font></html>";
		i7 = "<html><font color='red'>a variavel @i7 n?foi declarada!</font></html>";
		i8 = "<html><font color='red'>a variavel @i8 n?foi declarada!</font></html>";
		i9 = "<html><font color='red'>a variavel @i9 n?foi declarada!</font></html>";
		j0 = "<html><font color='red'>a variavel @j0 n?foi declarada!</font></html>";
		j1 = "<html><font color='red'>a variavel @j1 n?foi declarada!</font></html>";
		j2 = "<html><font color='red'>a variavel @j2 n?foi declarada!</font></html>";
		j3 = "<html><font color='red'>a variavel @j3 n?foi declarada!</font></html>";
		j4 = "<html><font color='red'>a variavel @j4 n?foi declarada!</font></html>";
		j5 = "<html><font color='red'>a variavel @j5 n?foi declarada!</font></html>";
		j6 = "<html><font color='red'>a variavel @j6 n?foi declarada!</font></html>";
		j7 = "<html><font color='red'>a variavel @j7 n?foi declarada!</font></html>";
		j8 = "<html><font color='red'>a variavel @j8 n?foi declarada!</font></html>";
		j9 = "<html><font color='red'>a variavel @j9 n?foi declarada!</font></html>";
		k0 = "<html><font color='red'>a variavel @k0 n?foi declarada!</font></html>";
		k1 = "<html><font color='red'>a variavel @k1 n?foi declarada!</font></html>";
		k2 = "<html><font color='red'>a variavel @k2 n?foi declarada!</font></html>";
		k3 = "<html><font color='red'>a variavel @k3 n?foi declarada!</font></html>";
		k4 = "<html><font color='red'>a variavel @k4 n?foi declarada!</font></html>";
		k5 = "<html><font color='red'>a variavel @k5 n?foi declarada!</font></html>";
		k6 = "<html><font color='red'>a variavel @k6 n?foi declarada!</font></html>";
		k7 = "<html><font color='red'>a variavel @k7 n?foi declarada!</font></html>";
		k8 = "<html><font color='red'>a variavel @k8 n?foi declarada!</font></html>";
		k9 = "<html><font color='red'>a variavel @k9 n?foi declarada!</font></html>";
		l0 = "<html><font color='red'>a variavel @l0 n?foi declarada!</font></html>";
		l1 = "<html><font color='red'>a variavel @l1 n?foi declarada!</font></html>";
		l2 = "<html><font color='red'>a variavel @l2 n?foi declarada!</font></html>";
		l3 = "<html><font color='red'>a variavel @l3 n?foi declarada!</font></html>";
		l4 = "<html><font color='red'>a variavel @l4 n?foi declarada!</font></html>";
		l5 = "<html><font color='red'>a variavel @l5 n?foi declarada!</font></html>";
		l6 = "<html><font color='red'>a variavel @l6 n?foi declarada!</font></html>";
		l7 = "<html><font color='red'>a variavel @l7 n?foi declarada!</font></html>";
		l8 = "<html><font color='red'>a variavel @l8 n?foi declarada!</font></html>";
		l9 = "<html><font color='red'>a variavel @l9 n?foi declarada!</font></html>";
		m0 = "<html><font color='red'>a variavel @m0 n?foi declarada!</font></html>";
		m1 = "<html><font color='red'>a variavel @m1 n?foi declarada!</font></html>";
		m2 = "<html><font color='red'>a variavel @m2 n?foi declarada!</font></html>";
		m3 = "<html><font color='red'>a variavel @m3 n?foi declarada!</font></html>";
		m4 = "<html><font color='red'>a variavel @m4 n?foi declarada!</font></html>";
		m5 = "<html><font color='red'>a variavel @m5 n?foi declarada!</font></html>";
		m6 = "<html><font color='red'>a variavel @m6 n?foi declarada!</font></html>";
		m7 = "<html><font color='red'>a variavel @m7 n?foi declarada!</font></html>";
		m8 = "<html><font color='red'>a variavel @m8 n?foi declarada!</font></html>";
		m9 = "<html><font color='red'>a variavel @m9 n?foi declarada!</font></html>";
		n0 = "<html><font color='red'>a variavel @n0 n?foi declarada!</font></html>";
		n1 = "<html><font color='red'>a variavel @n1 n?foi declarada!</font></html>";
		n2 = "<html><font color='red'>a variavel @n2 n?foi declarada!</font></html>";
		n3 = "<html><font color='red'>a variavel @n3 n?foi declarada!</font></html>";
		n4 = "<html><font color='red'>a variavel @n4 n?foi declarada!</font></html>";
		n5 = "<html><font color='red'>a variavel @n5 n?foi declarada!</font></html>";
		n6 = "<html><font color='red'>a variavel @n6 n?foi declarada!</font></html>";
		n7 = "<html><font color='red'>a variavel @n7 n?foi declarada!</font></html>";
		n8 = "<html><font color='red'>a variavel @n8 n?foi declarada!</font></html>";
		n9 = "<html><font color='red'>a variavel @n9 n?foi declarada!</font></html>";
		o0 = "<html><font color='red'>a variavel @o0 n?foi declarada!</font></html>";
		o1 = "<html><font color='red'>a variavel @o1 n?foi declarada!</font></html>";
		o2 = "<html><font color='red'>a variavel @o2 n?foi declarada!</font></html>";
		o3 = "<html><font color='red'>a variavel @o3 n?foi declarada!</font></html>";
		o4 = "<html><font color='red'>a variavel @o4 n?foi declarada!</font></html>";
		o5 = "<html><font color='red'>a variavel @o5 n?foi declarada!</font></html>";
		o6 = "<html><font color='red'>a variavel @o6 n?foi declarada!</font></html>";
		o7 = "<html><font color='red'>a variavel @o7 n?foi declarada!</font></html>";
		o8 = "<html><font color='red'>a variavel @o8 n?foi declarada!</font></html>";
		o9 = "<html><font color='red'>a variavel @o9 n?foi declarada!</font></html>";
		p0 = "<html><font color='red'>a variavel @p0 n?foi declarada!</font></html>";
		p1 = "<html><font color='red'>a variavel @p1 n?foi declarada!</font></html>";
		p2 = "<html><font color='red'>a variavel @p2 n?foi declarada!</font></html>";
		p3 = "<html><font color='red'>a variavel @p3 n?foi declarada!</font></html>";
		p4 = "<html><font color='red'>a variavel @p4 n?foi declarada!</font></html>";
		p5 = "<html><font color='red'>a variavel @p5 n?foi declarada!</font></html>";
		p6 = "<html><font color='red'>a variavel @p6 n?foi declarada!</font></html>";
		p7 = "<html><font color='red'>a variavel @p7 n?foi declarada!</font></html>";
		p8 = "<html><font color='red'>a variavel @p8 n?foi declarada!</font></html>";
		p9 = "<html><font color='red'>a variavel @p9 n?foi declarada!</font></html>";
		q0 = "<html><font color='red'>a variavel @q0 n?foi declarada!</font></html>";
		q1 = "<html><font color='red'>a variavel @q1 n?foi declarada!</font></html>";
		q2 = "<html><font color='red'>a variavel @q2 n?foi declarada!</font></html>";
		q3 = "<html><font color='red'>a variavel @q3 n?foi declarada!</font></html>";
		q4 = "<html><font color='red'>a variavel @q4 n?foi declarada!</font></html>";
		q5 = "<html><font color='red'>a variavel @q5 n?foi declarada!</font></html>";
		q6 = "<html><font color='red'>a variavel @q6 n?foi declarada!</font></html>";
		q7 = "<html><font color='red'>a variavel @q7 n?foi declarada!</font></html>";
		q8 = "<html><font color='red'>a variavel @q8 n?foi declarada!</font></html>";
		q9 = "<html><font color='red'>a variavel @q9 n?foi declarada!</font></html>";
		r0 = "<html><font color='red'>a variavel @r0 n?foi declarada!</font></html>";
		r1 = "<html><font color='red'>a variavel @r1 n?foi declarada!</font></html>";
		r2 = "<html><font color='red'>a variavel @r2 n?foi declarada!</font></html>";
		r3 = "<html><font color='red'>a variavel @r3 n?foi declarada!</font></html>";
		r4 = "<html><font color='red'>a variavel @r4 n?foi declarada!</font></html>";
		r5 = "<html><font color='red'>a variavel @r5 n?foi declarada!</font></html>";
		r6 = "<html><font color='red'>a variavel @r6 n?foi declarada!</font></html>";
		r7 = "<html><font color='red'>a variavel @r7 n?foi declarada!</font></html>";
		r8 = "<html><font color='red'>a variavel @r8 n?foi declarada!</font></html>";
		r9 = "<html><font color='red'>a variavel @s9 n?foi declarada!</font></html>";
		s0 = "<html><font color='red'>a variavel @s0 n?foi declarada!</font></html>";
		s1 = "<html><font color='red'>a variavel @s1 n?foi declarada!</font></html>";
		s2 = "<html><font color='red'>a variavel @s2 n?foi declarada!</font></html>";
		s3 = "<html><font color='red'>a variavel @s3 n?foi declarada!</font></html>";
		s4 = "<html><font color='red'>a variavel @s4 n?foi declarada!</font></html>";
		s5 = "<html><font color='red'>a variavel @s5 n?foi declarada!</font></html>";
		s6 = "<html><font color='red'>a variavel @s6 n?foi declarada!</font></html>";
		s7 = "<html><font color='red'>a variavel @s7 n?foi declarada!</font></html>";
		s8 = "<html><font color='red'>a variavel @s8 n?foi declarada!</font></html>";
		s9 = "<html><font color='red'>a variavel @s9 n?foi declarada!</font></html>";
		t0 = "<html><font color='red'>a variavel @t0 n?foi declarada!</font></html>";
		t1 = "<html><font color='red'>a variavel @t1 n?foi declarada!</font></html>";
		t2 = "<html><font color='red'>a variavel @t2 n?foi declarada!</font></html>";
		t3 = "<html><font color='red'>a variavel @t3 n?foi declarada!</font></html>";
		t4 = "<html><font color='red'>a variavel @t4 n?foi declarada!</font></html>";
		t5 = "<html><font color='red'>a variavel @t5 n?foi declarada!</font></html>";
		t6 = "<html><font color='red'>a variavel @t6 n?foi declarada!</font></html>";
		t7 = "<html><font color='red'>a variavel @t7 n?foi declarada!</font></html>";
		t8 = "<html><font color='red'>a variavel @t8 n?foi declarada!</font></html>";
		t9 = "<html><font color='red'>a variavel @t9 n?foi declarada!</font></html>";
		u0 = "<html><font color='red'>a variavel @u0 n?foi declarada!</font></html>";
		u1 = "<html><font color='red'>a variavel @u1 n?foi declarada!</font></html>";
		u2 = "<html><font color='red'>a variavel @u2 n?foi declarada!</font></html>";
		u3 = "<html><font color='red'>a variavel @u3 n?foi declarada!</font></html>";
		u4 = "<html><font color='red'>a variavel @u4 n?foi declarada!</font></html>";
		u5 = "<html><font color='red'>a variavel @u5 n?foi declarada!</font></html>";
		u6 = "<html><font color='red'>a variavel @u6 n?foi declarada!</font></html>";
		u7 = "<html><font color='red'>a variavel @u7 n?foi declarada!</font></html>";
		u8 = "<html><font color='red'>a variavel @u8 n?foi declarada!</font></html>";
		u9 = "<html><font color='red'>a variavel @u9 n?foi declarada!</font></html>";
		v0 = "<html><font color='red'>a variavel @v0 n?foi declarada!</font></html>";
		v1 = "<html><font color='red'>a variavel @v1 n?foi declarada!</font></html>";
		v2 = "<html><font color='red'>a variavel @v2 n?foi declarada!</font></html>";
		v3 = "<html><font color='red'>a variavel @v3 n?foi declarada!</font></html>";
		v4 = "<html><font color='red'>a variavel @v4 n?foi declarada!</font></html>";
		v5 = "<html><font color='red'>a variavel @v5 n?foi declarada!</font></html>";
		v6 = "<html><font color='red'>a variavel @v6 n?foi declarada!</font></html>";
		v7 = "<html><font color='red'>a variavel @v7 n?foi declarada!</font></html>";
		v8 = "<html><font color='red'>a variavel @v8 n?foi declarada!</font></html>";
		v9 = "<html><font color='red'>a variavel @v9 n?foi declarada!</font></html>";
		w0 = "<html><font color='red'>a variavel @w0 n?foi declarada!</font></html>";
		w1 = "<html><font color='red'>a variavel @w1 n?foi declarada!</font></html>";
		w2 = "<html><font color='red'>a variavel @w2 n?foi declarada!</font></html>";
		w3 = "<html><font color='red'>a variavel @w3 n?foi declarada!</font></html>";
		w4 = "<html><font color='red'>a variavel @w4 n?foi declarada!</font></html>";
		w5 = "<html><font color='red'>a variavel @w5 n?foi declarada!</font></html>";
		w6 = "<html><font color='red'>a variavel @w6 n?foi declarada!</font></html>";
		w7 = "<html><font color='red'>a variavel @w7 n?foi declarada!</font></html>";
		w8 = "<html><font color='red'>a variavel @w8 n?foi declarada!</font></html>";
		w9 = "<html><font color='red'>a variavel @w9 n?foi declarada!</font></html>";
		x0 = "<html><font color='red'>a variavel @x0 n?foi declarada!</font></html>";
		x1 = "<html><font color='red'>a variavel @x1 n?foi declarada!</font></html>";
		x2 = "<html><font color='red'>a variavel @x2 n?foi declarada!</font></html>";
		x3 = "<html><font color='red'>a variavel @x3 n?foi declarada!</font></html>";
		x4 = "<html><font color='red'>a variavel @x4 n?foi declarada!</font></html>";
		x5 = "<html><font color='red'>a variavel @x5 n?foi declarada!</font></html>";
		x6 = "<html><font color='red'>a variavel @x6 n?foi declarada!</font></html>";
		x7 = "<html><font color='red'>a variavel @x7 n?foi declarada!</font></html>";
		x8 = "<html><font color='red'>a variavel @x8 n?foi declarada!</font></html>";
		x9 = "<html><font color='red'>a variavel @x9 n?foi declarada!</font></html>";
		y0 = "<html><font color='red'>a variavel @y0 n?foi declarada!</font></html>";
		y1 = "<html><font color='red'>a variavel @y1 n?foi declarada!</font></html>";
		y2 = "<html><font color='red'>a variavel @y2 n?foi declarada!</font></html>";
		y3 = "<html><font color='red'>a variavel @y3 n?foi declarada!</font></html>";
		y4 = "<html><font color='red'>a variavel @y4 n?foi declarada!</font></html>";
		y5 = "<html><font color='red'>a variavel @y5 n?foi declarada!</font></html>";
		y6 = "<html><font color='red'>a variavel @y6 n?foi declarada!</font></html>";
		y7 = "<html><font color='red'>a variavel @y7 n?foi declarada!</font></html>";
		y8 = "<html><font color='red'>a variavel @y8 n?foi declarada!</font></html>";
		y9 = "<html><font color='red'>a variavel @y9 n?foi declarada!</font></html>";
		z0 = "<html><font color='red'>a variavel @z0 n?foi declarada!</font></html>";
		z1 = "<html><font color='red'>a variavel @z1 n?foi declarada!</font></html>";
		z2 = "<html><font color='red'>a variavel @z2 n?foi declarada!</font></html>";
		z3 = "<html><font color='red'>a variavel @z3 n?foi declarada!</font></html>";
		z4 = "<html><font color='red'>a variavel @z4 n?foi declarada!</font></html>";
		z5 = "<html><font color='red'>a variavel @z5 n?foi declarada!</font></html>";
		z6 = "<html><font color='red'>a variavel @z6 n?foi declarada!</font></html>";
		z7 = "<html><font color='red'>a variavel @z7 n?foi declarada!</font></html>";
		z8 = "<html><font color='red'>a variavel @z8 n?foi declarada!</font></html>";
		z9 = "<html><font color='red'>a variavel @z9 n?foi declarada!</font></html>";
	}//errorDeclarationVariables
}

class Consol extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JEditorPane console;
	public Consol() {
		this.setBounds(400, 200, 700, 500);
		this.setTitle("Output Console");
		this.setMaximumSize(new Dimension(300, 200));
		JPanel painel;
		this.add(painel = new JPanel());
		URL url = this.getClass().getResource("/plax/image/icone_plax.jpg");  
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

class Escope extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JEditorPane escopePane;
	public Escope() {
		this.setBounds(0, 0, 500, 700);
		this.setTitle("Escope output plax");
		this.setMaximumSize(new Dimension(300, 200));
		JPanel escopePanel;
		this.add(escopePanel = new JPanel());
		URL urlEscope = this.getClass().getResource("/plax/image/icone_plax.jpg");  
		Image iconeEscope = Toolkit.getDefaultToolkit().getImage(urlEscope);  
		this.setIconImage(iconeEscope);
	
		
		// Window ambient area
		JLabel escopeLabel = new JLabel();
		escopeLabel.setText("<html><div bgcolor='lightgray' width='500' height='700'></div></html>");
		escopeLabel.setBounds(0, 0, 500, 700);
		
		// Window Color area
		escopePanel.add(escopeLabel);
		escopePanel.setBackground(Color.lightGray);
		
		
	
		// Text editor plax
		escopePane = new JEditorPane();
		escopePane.setCaretColor(Color.lightGray);
		escopePane.setEditable(false);
		escopePane.getAccessibleContext();
		escopePane.setBackground(Color.black);
		escopePane.setForeground(Color.green);
		escopePane.setContentType("text/html");
		escopePane.setFont(new Font("Arial", 1, 20));
		this.add(escopePane);
		
		JScrollPane scrollEscope = new JScrollPane(escopePane);
		scrollEscope.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollEscope.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollEscope.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		scrollEscope.setBounds(5, 30, 870, 440);
		
		this.add(scrollEscope);
	}

}

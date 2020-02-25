package language;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;


public class LangPlax{
	/**
	 * 
	 */
	public static String output = "";
	public static String plaxFile = "";
	public static Consol console;
	public static Consol initConsole;
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
	public static Scanner scan;
	public static FileReader arq = null;
	public static boolean tecEnter = false;
	public static int getX, getY;
	public static BufferedReader lerArq;
	public static String signal = "";
	public static String whil = "";
	public static boolean EndVar = false;
	public static String func = "", saveFunc = "";
	
	public static boolean condWhile = false;
	
	//Método de conversão de String pra inteiros
			public static int integers(String string){
				
				int numbers = 0;
				String firstString = "";
				String midString = "";
				String endString = "";
				
				if(string.length() == 1){
					firstString = string.substring(0, 1);
				}else{
					if(string.length() == 2){
						firstString = string.substring(0, 1);
						midString = string.substring(1, 2);
					}else{
						if(string.length() == 3){
							firstString = string.substring(0, 1);
							midString = string.substring(1, 2);
							endString = string.substring(2, 3);
						}
					}
				}
					if(firstString.equals("0")){numbers *= 10;numbers += 0;}
					if(firstString.equals("1")){numbers *= 10;numbers += 1;}
					if(firstString.equals("2")){numbers *= 10;numbers += 2;}
					if(firstString.equals("3")){numbers *= 10;numbers += 3;}
					if(firstString.equals("4")){numbers *= 10;numbers += 4;}
					if(firstString.equals("5")){numbers *= 10;numbers += 5;}
					if(firstString.equals("6")){numbers *= 10;numbers += 6;}
					if(firstString.equals("7")){numbers *= 10;numbers += 7;}
					if(firstString.equals("8")){numbers *= 10;numbers += 8;}
					if(firstString.equals("9")){numbers *= 10;numbers += 9;}
					if(midString.equals("0")){numbers *= 10;numbers += 0;}
					if(midString.equals("1")){numbers *= 10;numbers += 1;}
					if(midString.equals("2")){numbers *= 10;numbers += 2;}
					if(midString.equals("3")){numbers *= 10;numbers += 3;}
					if(midString.equals("4")){numbers *= 10;numbers += 4;}
					if(midString.equals("5")){numbers *= 10;numbers += 5;}
					if(midString.equals("6")){numbers *= 10;numbers += 6;}
					if(midString.equals("7")){numbers *= 10;numbers += 7;}
					if(midString.equals("8")){numbers *= 10;numbers += 8;}
					if(midString.equals("9")){numbers *= 10;numbers += 9;}
					if(endString.equals("0")){numbers *= 10;numbers += 0;}
					if(endString.equals("1")){numbers *= 10;numbers += 1;}
					if(endString.equals("2")){numbers *= 10;numbers += 2;}
					if(endString.equals("3")){numbers *= 10;numbers += 3;}
					if(endString.equals("4")){numbers *= 10;numbers += 4;}
					if(endString.equals("5")){numbers *= 10;numbers += 5;}
					if(endString.equals("6")){numbers *= 10;numbers += 6;}
					if(endString.equals("7")){numbers *= 10;numbers += 7;}
					if(endString.equals("8")){numbers *= 10;numbers += 8;}
					if(endString.equals("9")){numbers *= 10;numbers += 9;}
					
					
				return numbers;
					
			}
			
			public static void lessOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("<"));
				val2 = valOp.substring(valOp.indexOf("<")+1, valOp.lastIndexOf("]"));
				
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
			
			public static void moreOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf(">"));
				val2 = valOp.substring(valOp.indexOf(">")+1, valOp.lastIndexOf("]"));
				
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
			
			public static void compareOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("=="));
				val2 = valOp.substring(valOp.indexOf("==")+2, valOp.lastIndexOf("]"));
				
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
			
			public static void differentOp(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("!="));
				val2 = valOp.substring(valOp.indexOf("!=")+2, valOp.lastIndexOf("]"));
				
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
			
			public static void booleanVars(String bool){
				if(variable.contains("a0")){a0 = bool;}if(variable.contains("a1")){a1 = bool;}
				if(variable.contains("a2")){a2 = bool;}if(variable.contains("a3")){a3 = bool;}
				if(variable.contains("a4")){a4 = bool;}if(variable.contains("a5")){a5 = bool;}
				if(variable.contains("a6")){a6 = bool;}if(variable.contains("a7")){a7 = bool;}
				if(variable.contains("a8")){a8 = bool;}if(variable.contains("a9")){a9 = bool;}

				if(variable.contains("b0")){b0 = bool;}if(variable.contains("b1")){b1 = bool;}
				if(variable.contains("b2")){b2 = bool;}if(variable.contains("b3")){b3 = bool;}
				if(variable.contains("b4")){b4 = bool;}if(variable.contains("b5")){b5 = bool;}
				if(variable.contains("b6")){b6 = bool;}if(variable.contains("b7")){b7 = bool;}
				if(variable.contains("b8")){b8 = bool;}if(variable.contains("b9")){b9 = bool;}

				if(variable.contains("c0")){c0 = bool;}if(variable.contains("c1")){c1 = bool;}
				if(variable.contains("c2")){c2 = bool;}if(variable.contains("c3")){c3 = bool;}
				if(variable.contains("c4")){c4 = bool;}if(variable.contains("c5")){c5 = bool;}
				if(variable.contains("c6")){c6 = bool;}if(variable.contains("c7")){c7 = bool;}
				if(variable.contains("c8")){c8 = bool;}if(variable.contains("c9")){c9 = bool;}

				if(variable.contains("d0")){d0 = bool;}if(variable.contains("d1")){d1 = bool;}
				if(variable.contains("d2")){d2 = bool;}if(variable.contains("d3")){d3 = bool;}
				if(variable.contains("d4")){d4 = bool;}if(variable.contains("d5")){d5 = bool;}
				if(variable.contains("d6")){d6 = bool;}if(variable.contains("d7")){d7 = bool;}
				if(variable.contains("d8")){d8 = bool;}if(variable.contains("d9")){d9 = bool;}

				if(variable.contains("e0")){e0 = bool;}if(variable.contains("e1")){e1 = bool;}
				if(variable.contains("e2")){e2 = bool;}if(variable.contains("e3")){e3 = bool;}
				if(variable.contains("e4")){e4 = bool;}if(variable.contains("e5")){e5 = bool;}
				if(variable.contains("e6")){e6 = bool;}if(variable.contains("e7")){e7 = bool;}
				if(variable.contains("e8")){e8 = bool;}if(variable.contains("e9")){e9 = bool;}

				if(variable.contains("f0")){f0 = bool;}if(variable.contains("f1")){f1 = bool;}
				if(variable.contains("f2")){f2 = bool;}if(variable.contains("f3")){f3 = bool;}
				if(variable.contains("f4")){f4 = bool;}if(variable.contains("f5")){f5 = bool;}
				if(variable.contains("f6")){f6 = bool;}if(variable.contains("f7")){f7 = bool;}
				if(variable.contains("f8")){f8 = bool;}if(variable.contains("f9")){f9 = bool;}

				if(variable.contains("g0")){g0 = bool;}if(variable.contains("g1")){g1 = bool;}
				if(variable.contains("g2")){g2 = bool;}if(variable.contains("g3")){g3 = bool;}
				if(variable.contains("g4")){g4 = bool;}if(variable.contains("g5")){g5 = bool;}
				if(variable.contains("g6")){g6 = bool;}if(variable.contains("g7")){g7 = bool;}
				if(variable.contains("g8")){g8 = bool;}if(variable.contains("g9")){g9 = bool;}

				if(variable.contains("h0")){h0 = bool;}if(variable.contains("h1")){h1 = bool;}
				if(variable.contains("h2")){h2 = bool;}if(variable.contains("h3")){h3 = bool;}
				if(variable.contains("h4")){h4 = bool;}if(variable.contains("h5")){h5 = bool;}
				if(variable.contains("h6")){h6 = bool;}if(variable.contains("h7")){h7 = bool;}
				if(variable.contains("h8")){h8 = bool;}if(variable.contains("h9")){h9 = bool;}

				if(variable.contains("i0")){i0 = bool;}if(variable.contains("i1")){i1 = bool;}
				if(variable.contains("i2")){i2 = bool;}if(variable.contains("i3")){i3 = bool;}
				if(variable.contains("i4")){i4 = bool;}if(variable.contains("i5")){i5 = bool;}
				if(variable.contains("i6")){i6 = bool;}if(variable.contains("i7")){i7 = bool;}
				if(variable.contains("i8")){i8 = bool;}if(variable.contains("i9")){i9 = bool;}

				if(variable.contains("j0")){j0 = bool;}if(variable.contains("j1")){j1 = bool;}
				if(variable.contains("j2")){j2 = bool;}if(variable.contains("j3")){j3 = bool;}
				if(variable.contains("j4")){j4 = bool;}if(variable.contains("j5")){j5 = bool;}
				if(variable.contains("j6")){j6 = bool;}if(variable.contains("j7")){j7 = bool;}
				if(variable.contains("j8")){j8 = bool;}if(variable.contains("j9")){j9 = bool;}

				if(variable.contains("k0")){k0 = bool;}if(variable.contains("k1")){k1 = bool;}
				if(variable.contains("k2")){k2 = bool;}if(variable.contains("k3")){k3 = bool;}
				if(variable.contains("k4")){k4 = bool;}if(variable.contains("k5")){k5 = bool;}
				if(variable.contains("k6")){k6 = bool;}if(variable.contains("k7")){k7 = bool;}
				if(variable.contains("k8")){k8 = bool;}if(variable.contains("k9")){k9 = bool;}

				if(variable.contains("l0")){l0 = bool;}if(variable.contains("l1")){l1 = bool;}
				if(variable.contains("l2")){l2 = bool;}if(variable.contains("l3")){l3 = bool;}
				if(variable.contains("l4")){l4 = bool;}if(variable.contains("l5")){l5 = bool;}
				if(variable.contains("l6")){l6 = bool;}if(variable.contains("l7")){l7 = bool;}
				if(variable.contains("l8")){l8 = bool;}if(variable.contains("l9")){l9 = bool;}

				if(variable.contains("m0")){m0 = bool;}if(variable.contains("m1")){m1 = bool;}
				if(variable.contains("m2")){m2 = bool;}if(variable.contains("m3")){m3 = bool;}
				if(variable.contains("m4")){m4 = bool;}if(variable.contains("m5")){m5 = bool;}
				if(variable.contains("m6")){m6 = bool;}if(variable.contains("m7")){m7 = bool;}
				if(variable.contains("m8")){m8 = bool;}if(variable.contains("m9")){m9 = bool;}

				if(variable.contains("n0")){n0 = bool;}if(variable.contains("n1")){n1 = bool;}
				if(variable.contains("n2")){n2 = bool;}if(variable.contains("n3")){n3 = bool;}
				if(variable.contains("n4")){n4 = bool;}if(variable.contains("n5")){n5 = bool;}
				if(variable.contains("n6")){n6 = bool;}if(variable.contains("n7")){n7 = bool;}
				if(variable.contains("n8")){n8 = bool;}if(variable.contains("n9")){n9 = bool;}

				if(variable.contains("o0")){o0 = bool;}if(variable.contains("o1")){o1 = bool;}
				if(variable.contains("o2")){o2 = bool;}if(variable.contains("o3")){o3 = bool;}
				if(variable.contains("o4")){o4 = bool;}if(variable.contains("o5")){o5 = bool;}
				if(variable.contains("o6")){o6 = bool;}if(variable.contains("o7")){o7 = bool;}
				if(variable.contains("o8")){o8 = bool;}if(variable.contains("o9")){o9 = bool;}

				if(variable.contains("p0")){p0 = bool;}if(variable.contains("p1")){p1 = bool;}
				if(variable.contains("p2")){p2 = bool;}if(variable.contains("p3")){p3 = bool;}
				if(variable.contains("p4")){p4 = bool;}if(variable.contains("p5")){p5 = bool;}
				if(variable.contains("p6")){p6 = bool;}if(variable.contains("p7")){p7 = bool;}
				if(variable.contains("p8")){p8 = bool;}if(variable.contains("p9")){p9 = bool;}

				if(variable.contains("q0")){q0 = bool;}if(variable.contains("q1")){q1 = bool;}
				if(variable.contains("q2")){q2 = bool;}if(variable.contains("q3")){q3 = bool;}
				if(variable.contains("q4")){q4 = bool;}if(variable.contains("q5")){q5 = bool;}
				if(variable.contains("q6")){q6 = bool;}if(variable.contains("q7")){q7 = bool;}
				if(variable.contains("q8")){q8 = bool;}if(variable.contains("q9")){q9 = bool;}

				if(variable.contains("r0")){r0 = bool;}if(variable.contains("r1")){r1 = bool;}
				if(variable.contains("r2")){r2 = bool;}if(variable.contains("r3")){r3 = bool;}
				if(variable.contains("r4")){r4 = bool;}if(variable.contains("r5")){r5 = bool;}
				if(variable.contains("r6")){r6 = bool;}if(variable.contains("r7")){r7 = bool;}
				if(variable.contains("r8")){r8 = bool;}if(variable.contains("r9")){r9 = bool;}

				if(variable.contains("s0")){s0 = bool;}if(variable.contains("s1")){s1 = bool;}
				if(variable.contains("s2")){s2 = bool;}if(variable.contains("s3")){s3 = bool;}
				if(variable.contains("s4")){s4 = bool;}if(variable.contains("s5")){s5 = bool;}
				if(variable.contains("s6")){s6 = bool;}if(variable.contains("s7")){s7 = bool;}
				if(variable.contains("s8")){s8 = bool;}if(variable.contains("s9")){s9 = bool;}

				if(variable.contains("t0")){t0 = bool;}if(variable.contains("t1")){t1 = bool;}
				if(variable.contains("t2")){t2 = bool;}if(variable.contains("t3")){t3 = bool;}
				if(variable.contains("t4")){t4 = bool;}if(variable.contains("t5")){t5 = bool;}
				if(variable.contains("t6")){t6 = bool;}if(variable.contains("t7")){t7 = bool;}
				if(variable.contains("t8")){t8 = bool;}if(variable.contains("t9")){t9 = bool;}

				if(variable.contains("u0")){u0 = bool;}if(variable.contains("u1")){u1 = bool;}
				if(variable.contains("u2")){u2 = bool;}if(variable.contains("u3")){u3 = bool;}
				if(variable.contains("u4")){u4 = bool;}if(variable.contains("u5")){u5 = bool;}
				if(variable.contains("u6")){u6 = bool;}if(variable.contains("u7")){u7 = bool;}
				if(variable.contains("u8")){u8 = bool;}if(variable.contains("u9")){u9 = bool;}

				if(variable.contains("v0")){v0 = bool;}if(variable.contains("v1")){v1 = bool;}
				if(variable.contains("v2")){v2 = bool;}if(variable.contains("v3")){v3 = bool;}
				if(variable.contains("v4")){v4 = bool;}if(variable.contains("v5")){v5 = bool;}
				if(variable.contains("v6")){v6 = bool;}if(variable.contains("v7")){v7 = bool;}
				if(variable.contains("v8")){v8 = bool;}if(variable.contains("v9")){v9 = bool;}

				if(variable.contains("w0")){w0 = bool;}if(variable.contains("w1")){w1 = bool;}
				if(variable.contains("w2")){w2 = bool;}if(variable.contains("w3")){w3 = bool;}
				if(variable.contains("w4")){w4 = bool;}if(variable.contains("w5")){w5 = bool;}
				if(variable.contains("w6")){w6 = bool;}if(variable.contains("w7")){w7 = bool;}
				if(variable.contains("w8")){w8 = bool;}if(variable.contains("w9")){w9 = bool;}

				if(variable.contains("x0")){x0 = bool;}if(variable.contains("x1")){x1 = bool;}
				if(variable.contains("x2")){x2 = bool;}if(variable.contains("x3")){x3 = bool;}
				if(variable.contains("x4")){x4 = bool;}if(variable.contains("x5")){x5 = bool;}
				if(variable.contains("x6")){x6 = bool;}if(variable.contains("x7")){x7 = bool;}
				if(variable.contains("x8")){x8 = bool;}if(variable.contains("x9")){x9 = bool;}

				if(variable.contains("y0")){y0 = bool;}if(variable.contains("y1")){y1 = bool;}
				if(variable.contains("y2")){y2 = bool;}if(variable.contains("y3")){y3 = bool;}
				if(variable.contains("y4")){y4 = bool;}if(variable.contains("y5")){y5 = bool;}
				if(variable.contains("y6")){y6 = bool;}if(variable.contains("y7")){y7 = bool;}
				if(variable.contains("y8")){y8 = bool;}if(variable.contains("y9")){y9 = bool;}

				if(variable.contains("z0")){z0 = bool;}if(variable.contains("z1")){z1 = bool;}
				if(variable.contains("z2")){z2 = bool;}if(variable.contains("z3")){z3 = bool;}
				if(variable.contains("z4")){z4 = bool;}if(variable.contains("z5")){z5 = bool;}
				if(variable.contains("z6")){z6 = bool;}if(variable.contains("z7")){z7 = bool;}
				if(variable.contains("z8")){z8 = bool;}if(variable.contains("z9")){z9 = bool;}
			}
			
			//Método pra guardar variáveis
			public static void armazenVars(){
				if(val.contains("@a0")){vars = a0;}if(val.contains("@a1")){vars = a1;}
				if(val.contains("@a2")){vars = a2;}if(val.contains("@a3")){vars = a3;}
				if(val.contains("@a4")){vars = a4;}if(val.contains("@a5")){vars = a5;}
				if(val.contains("@a6")){vars = a6;}if(val.contains("@a7")){vars = a7;}
				if(val.contains("@a8")){vars = a8;}if(val.contains("@a9")){vars = a9;}
				
				if(val.contains("@b0")){vars = b0;}if(val.contains("@b1")){vars = b1;}
				if(val.contains("@b2")){vars = b2;}if(val.contains("@b3")){vars = b3;}
				if(val.contains("@b4")){vars = b4;}if(val.contains("@b5")){vars = b5;}
				if(val.contains("@b6")){vars = b6;}if(val.contains("@b7")){vars = b7;}
				if(val.contains("@b8")){vars = b8;}if(val.contains("@b9")){vars = b9;}
				
				if(val.contains("@c0")){vars = c0;}if(val.contains("@c1")){vars = c1;}
				if(val.contains("@c2")){vars = c2;}if(val.contains("@c3")){vars = c3;}
				if(val.contains("@c4")){vars = c4;}if(val.contains("@c5")){vars = c5;}
				if(val.contains("@c6")){vars = c6;}if(val.contains("@c7")){vars = c7;}
				if(val.contains("@c8")){vars = c8;}if(val.contains("@c9")){vars = c9;}
				
				if(val.contains("@d0")){vars = d0;}if(val.contains("@d1")){vars = d1;}
				if(val.contains("@d2")){vars = d2;}if(val.contains("@d3")){vars = d3;}
				if(val.contains("@d4")){vars = d4;}if(val.contains("@d5")){vars = d5;}
				if(val.contains("@d6")){vars = d6;}if(val.contains("@d7")){vars = d7;}
				if(val.contains("@d8")){vars = d8;}if(val.contains("@d9")){vars = d9;}
				
				if(val.contains("@e0")){vars = e0;}if(val.contains("@e1")){vars = e1;}
				if(val.contains("@e2")){vars = e2;}if(val.contains("@e3")){vars = e3;}
				if(val.contains("@e4")){vars = e4;}if(val.contains("@e5")){vars = e5;}
				if(val.contains("@e6")){vars = e6;}if(val.contains("@e7")){vars = e7;}
				if(val.contains("@e8")){vars = e8;}if(val.contains("@e9")){vars = e9;}
				
				if(val.contains("@f0")){vars = f0;}if(val.contains("@f1")){vars = f1;}
				if(val.contains("@f2")){vars = f2;}if(val.contains("@f3")){vars = f3;}
				if(val.contains("@f4")){vars = f4;}if(val.contains("@f5")){vars = f5;}
				if(val.contains("@f6")){vars = f6;}if(val.contains("@f7")){vars = f7;}
				if(val.contains("@f8")){vars = f8;}if(val.contains("@f9")){vars = f9;}
			
				if(val.contains("@g0")){vars = g0;}if(val.contains("@g1")){vars = g1;}
				if(val.contains("@g2")){vars = g2;}if(val.contains("@g3")){vars = g3;}
				if(val.contains("@g4")){vars = g4;}if(val.contains("@g5")){vars = g5;}
				if(val.contains("@g6")){vars = g6;}if(val.contains("@g7")){vars = g7;}
				if(val.contains("@g8")){vars = g8;}if(val.contains("@g9")){vars = g9;}
			
				if(val.contains("@h0")){vars = h0;}if(val.contains("@h1")){vars = h1;}
				if(val.contains("@h2")){vars = h2;}if(val.contains("@h3")){vars = h3;}
				if(val.contains("@h4")){vars = h4;}if(val.contains("@h5")){vars = h5;}
				if(val.contains("@h6")){vars = h6;}if(val.contains("@h7")){vars = h7;}
				if(val.contains("@h8")){vars = h8;}if(val.contains("@h9")){vars = h9;}
				
				if(val.contains("@i0")){vars = i0;}if(val.contains("@i1")){vars = i1;}
				if(val.contains("@i2")){vars = i2;}if(val.contains("@i3")){vars = i3;}
				if(val.contains("@i4")){vars = i4;}if(val.contains("@i5")){vars = i5;}
				if(val.contains("@i6")){vars = i6;}if(val.contains("@i7")){vars = i7;}
				if(val.contains("@i8")){vars = i8;}if(val.contains("@i9")){vars = i9;}
			
				if(val.contains("@j0")){vars = j0;}if(val.contains("@j1")){vars = j1;}
				if(val.contains("@j2")){vars = j2;}if(val.contains("@j3")){vars = j3;}
				if(val.contains("@j4")){vars = j4;}if(val.contains("@j5")){vars = j5;}
				if(val.contains("@j6")){vars = j6;}if(val.contains("@j7")){vars = j7;}
				if(val.contains("@j8")){vars = j8;}if(val.contains("@j9")){vars = j9;}
				
				if(val.contains("@k0")){vars = k0;}if(val.contains("@k1")){vars = k1;}
				if(val.contains("@k2")){vars = k2;}if(val.contains("@k3")){vars = k3;}
				if(val.contains("@k4")){vars = k4;}if(val.contains("@k5")){vars = k5;}
				if(val.contains("@k6")){vars = k6;}if(val.contains("@k7")){vars = k7;}
				if(val.contains("@k8")){vars = k8;}if(val.contains("@k9")){vars = k9;}
			
				if(val.contains("@l0")){vars = l0;}if(val.contains("@l1")){vars = l1;}
				if(val.contains("@l2")){vars = l2;}if(val.contains("@l3")){vars = l3;}
				if(val.contains("@l4")){vars = l4;}if(val.contains("@l5")){vars = l5;}
				if(val.contains("@l6")){vars = l6;}if(val.contains("@l7")){vars = l7;}
				if(val.contains("@l8")){vars = l8;}if(val.contains("@l9")){vars = l9;}
				
				if(val.contains("@m0")){vars = m0;}if(val.contains("@m1")){vars = m1;}
				if(val.contains("@m2")){vars = m2;}if(val.contains("@m3")){vars = m3;}
				if(val.contains("@m4")){vars = m4;}if(val.contains("@m5")){vars = m5;}
				if(val.contains("@m6")){vars = m6;}if(val.contains("@m7")){vars = m7;}
				if(val.contains("@m8")){vars = m8;}if(val.contains("@m9")){vars = m9;}
				
				if(val.contains("@n0")){vars = n0;}if(val.contains("@n1")){vars = n1;}
				if(val.contains("@n2")){vars = n2;}if(val.contains("@n3")){vars = n3;}
				if(val.contains("@n4")){vars = n4;}if(val.contains("@n5")){vars = n5;}
				if(val.contains("@n6")){vars = n6;}if(val.contains("@n7")){vars = n7;}
				if(val.contains("@n8")){vars = n8;}if(val.contains("@n9")){vars = n9;}
				
				if(val.contains("@o0")){vars = o0;}if(val.contains("@o1")){vars = o1;}
				if(val.contains("@o2")){vars = o2;}if(val.contains("@o3")){vars = o3;}
				if(val.contains("@o4")){vars = o4;}if(val.contains("@o5")){vars = o5;}
				if(val.contains("@o6")){vars = o6;}if(val.contains("@o7")){vars = o7;}
				if(val.contains("@o8")){vars = o8;}if(val.contains("@o9")){vars = o9;}
				
				if(val.contains("@p0")){vars = p0;}if(val.contains("@p1")){vars = p1;}
				if(val.contains("@p2")){vars = p2;}if(val.contains("@p3")){vars = p3;}
				if(val.contains("@p4")){vars = p4;}if(val.contains("@p5")){vars = p5;}
				if(val.contains("@p6")){vars = p6;}if(val.contains("@p7")){vars = p7;}
				if(val.contains("@p8")){vars = p8;}if(val.contains("@p9")){vars = p9;}
				
				if(val.contains("@q0")){vars = q0;}if(val.contains("@q1")){vars = q1;}
				if(val.contains("@q2")){vars = q2;}if(val.contains("@q3")){vars = q3;}
				if(val.contains("@q4")){vars = q4;}if(val.contains("@q5")){vars = q5;}
				if(val.contains("@q6")){vars = q6;}if(val.contains("@q7")){vars = q7;}
				if(val.contains("@q8")){vars = q8;}if(val.contains("@q9")){vars = q9;}
			
				if(val.contains("@r0")){vars = r0;}if(val.contains("@r1")){vars = r1;}
				if(val.contains("@r2")){vars = r2;}if(val.contains("@r3")){vars = r3;}
				if(val.contains("@r4")){vars = r4;}if(val.contains("@r5")){vars = r5;}
				if(val.contains("@r6")){vars = r6;}if(val.contains("@r7")){vars = r7;}
				if(val.contains("@r8")){vars = r8;}if(val.contains("@r9")){vars = r9;}
				
				if(val.contains("@s0")){vars = s0;}if(val.contains("@s1")){vars = s1;}
				if(val.contains("@s2")){vars = s2;}if(val.contains("@s3")){vars = s3;}
				if(val.contains("@s4")){vars = s4;}if(val.contains("@s5")){vars = s5;}
				if(val.contains("@s6")){vars = s6;}if(val.contains("@s7")){vars = s7;}
				if(val.contains("@s8")){vars = s8;}if(val.contains("@s9")){vars = s9;}
			
				if(val.contains("@t0")){vars = t0;}if(val.contains("@t1")){vars = t1;}
				if(val.contains("@t2")){vars = t2;}if(val.contains("@t3")){vars = t3;}
				if(val.contains("@t4")){vars = t4;}if(val.contains("@t5")){vars = t5;}
				if(val.contains("@t6")){vars = t6;}if(val.contains("@t7")){vars = t7;}
				if(val.contains("@t8")){vars = t8;}if(val.contains("@t9")){vars = t9;}
			
				if(val.contains("@u0")){vars = u0;}if(val.contains("@u1")){vars = u1;}
				if(val.contains("@u2")){vars = u2;}if(val.contains("@u3")){vars = u3;}
				if(val.contains("@u4")){vars = u4;}if(val.contains("@u5")){vars = u5;}
				if(val.contains("@u6")){vars = u6;}if(val.contains("@u7")){vars = u7;}
				if(val.contains("@u8")){vars = u8;}if(val.contains("@u9")){vars = u9;}
				
				if(val.contains("@v0")){vars = v0;}if(val.contains("@v1")){vars = v1;}
				if(val.contains("@v2")){vars = v2;}if(val.contains("@v3")){vars = v3;}
				if(val.contains("@v4")){vars = v4;}if(val.contains("@v5")){vars = v5;}
				if(val.contains("@v6")){vars = v6;}if(val.contains("@v7")){vars = v7;}
				if(val.contains("@v8")){vars = v8;}if(val.contains("@v9")){vars = v9;}
				
				if(val.contains("@w0")){vars = w0;}if(val.contains("@w1")){vars = w1;}
				if(val.contains("@w2")){vars = w2;}if(val.contains("@w3")){vars = w3;}
				if(val.contains("@w4")){vars = w4;}if(val.contains("@w5")){vars = w5;}
				if(val.contains("@w6")){vars = w6;}if(val.contains("@w7")){vars = w7;}
				if(val.contains("@w8")){vars = w8;}if(val.contains("@w9")){vars = w9;}
				
				if(val.contains("@x0")){vars = x0;}if(val.contains("@x1")){vars = x1;}
				if(val.contains("@x2")){vars = x2;}if(val.contains("@x3")){vars = x3;}
				if(val.contains("@x4")){vars = x4;}if(val.contains("@x5")){vars = x5;}
				if(val.contains("@x6")){vars = x6;}if(val.contains("@x7")){vars = x7;}
				if(val.contains("@x8")){vars = x8;}if(val.contains("@x9")){vars = x9;}
				
				if(val.contains("@y0")){vars = y0;}if(val.contains("@y1")){vars = y1;}
				if(val.contains("@y2")){vars = y2;}if(val.contains("@y3")){vars = y3;}
				if(val.contains("@y4")){vars = y4;}if(val.contains("@y5")){vars = y5;}
				if(val.contains("@y6")){vars = y6;}if(val.contains("@y7")){vars = y7;}
				if(val.contains("@y8")){vars = y8;}if(val.contains("@y9")){vars = y9;}
				
				if(val.contains("@z0")){vars = z0;}if(val.contains("@z1")){vars = z1;}
				if(val.contains("@z2")){vars = z2;}if(val.contains("@z3")){vars = z3;}
				if(val.contains("@z4")){vars = z4;}if(val.contains("@z5")){vars = z5;}
				if(val.contains("@z6")){vars = z6;}if(val.contains("@z7")){vars = z7;}
				if(val.contains("@z8")){vars = z8;}if(val.contains("@z9")){vars = z9;}
			}
			
			//Método que salva todas as variáveis
			public static void valueWithVars(){
				if(variable.contains("a0")){armazenVars();a0 = vars;}if(variable.contains("a1")){armazenVars();a1 = vars;}
				if(variable.contains("a2")){armazenVars();a2 = vars;}if(variable.contains("a3")){armazenVars();a3 = vars;}
				if(variable.contains("a4")){armazenVars();a4 = vars;}if(variable.contains("a5")){armazenVars();a5 = vars;}
				if(variable.contains("a6")){armazenVars();a6 = vars;}if(variable.contains("a7")){armazenVars();a7 = vars;}
				if(variable.contains("a8")){armazenVars();a8 = vars;}if(variable.contains("a9")){armazenVars();a9 = vars;}

				if(variable.contains("b0")){armazenVars();b0 = vars;}if(variable.contains("b1")){armazenVars();b1 = vars;}
				if(variable.contains("b2")){armazenVars();b2 = vars;}if(variable.contains("b3")){armazenVars();b3 = vars;}
				if(variable.contains("b4")){armazenVars();b4 = vars;}if(variable.contains("b5")){armazenVars();b5 = vars;}
				if(variable.contains("b6")){armazenVars();b6 = vars;}if(variable.contains("b7")){armazenVars();b7 = vars;}
				if(variable.contains("b8")){armazenVars();b8 = vars;}if(variable.contains("b9")){armazenVars();b9 = vars;}

				if(variable.contains("c0")){armazenVars();c0 = vars;}if(variable.contains("c1")){armazenVars();c1 = vars;}
				if(variable.contains("c2")){armazenVars();c2 = vars;}if(variable.contains("c3")){armazenVars();c3 = vars;}
				if(variable.contains("c4")){armazenVars();c4 = vars;}if(variable.contains("c5")){armazenVars();c5 = vars;}
				if(variable.contains("c6")){armazenVars();c6 = vars;}if(variable.contains("c7")){armazenVars();c7 = vars;}
				if(variable.contains("c8")){armazenVars();c8 = vars;}if(variable.contains("c9")){armazenVars();c9 = vars;}

				if(variable.contains("d0")){armazenVars();d0 = vars;}if(variable.contains("d1")){armazenVars();d1 = vars;}
				if(variable.contains("d2")){armazenVars();d2 = vars;}if(variable.contains("d3")){armazenVars();d3 = vars;}
				if(variable.contains("d4")){armazenVars();d4 = vars;}if(variable.contains("d5")){armazenVars();d5 = vars;}
				if(variable.contains("d6")){armazenVars();d6 = vars;}if(variable.contains("d7")){armazenVars();d7 = vars;}
				if(variable.contains("d8")){armazenVars();d8 = vars;}if(variable.contains("d9")){armazenVars();d9 = vars;}

				if(variable.contains("e0")){armazenVars();e0 = vars;}if(variable.contains("e1")){armazenVars();e1 = vars;}
				if(variable.contains("e2")){armazenVars();e2 = vars;}if(variable.contains("e3")){armazenVars();e3 = vars;}
				if(variable.contains("e4")){armazenVars();e4 = vars;}if(variable.contains("e5")){armazenVars();e5 = vars;}
				if(variable.contains("e6")){armazenVars();e6 = vars;}if(variable.contains("e7")){armazenVars();e7 = vars;}
				if(variable.contains("e8")){armazenVars();e8 = vars;}if(variable.contains("e9")){armazenVars();e9 = vars;}

				if(variable.contains("f0")){armazenVars();f0 = vars;}if(variable.contains("f1")){armazenVars();f1 = vars;}
				if(variable.contains("f2")){armazenVars();f2 = vars;}if(variable.contains("f3")){armazenVars();f3 = vars;}
				if(variable.contains("f4")){armazenVars();f4 = vars;}if(variable.contains("f5")){armazenVars();f5 = vars;}
				if(variable.contains("f6")){armazenVars();f6 = vars;}if(variable.contains("f7")){armazenVars();f7 = vars;}
				if(variable.contains("f8")){armazenVars();f8 = vars;}if(variable.contains("f9")){armazenVars();f9 = vars;}

				if(variable.contains("g0")){armazenVars();g0 = vars;}if(variable.contains("g1")){armazenVars();g1 = vars;}
				if(variable.contains("g2")){armazenVars();g2 = vars;}if(variable.contains("g3")){armazenVars();g3 = vars;}
				if(variable.contains("g4")){armazenVars();g4 = vars;}if(variable.contains("g5")){armazenVars();g5 = vars;}
				if(variable.contains("g6")){armazenVars();g6 = vars;}if(variable.contains("g7")){armazenVars();g7 = vars;}
				if(variable.contains("g8")){armazenVars();g8 = vars;}if(variable.contains("g9")){armazenVars();g9 = vars;}

				if(variable.contains("h0")){armazenVars();h0 = vars;}if(variable.contains("h1")){armazenVars();h1 = vars;}
				if(variable.contains("h2")){armazenVars();h2 = vars;}if(variable.contains("h3")){armazenVars();h3 = vars;}
				if(variable.contains("h4")){armazenVars();h4 = vars;}if(variable.contains("h5")){armazenVars();h5 = vars;}
				if(variable.contains("h6")){armazenVars();h6 = vars;}if(variable.contains("h7")){armazenVars();h7 = vars;}
				if(variable.contains("h8")){armazenVars();h8 = vars;}if(variable.contains("h9")){armazenVars();h9 = vars;}

				if(variable.contains("i0")){armazenVars();i0 = vars;}if(variable.contains("i1")){armazenVars();i1 = vars;}
				if(variable.contains("i2")){armazenVars();i2 = vars;}if(variable.contains("i3")){armazenVars();i3 = vars;}
				if(variable.contains("i4")){armazenVars();i4 = vars;}if(variable.contains("i5")){armazenVars();i5 = vars;}
				if(variable.contains("i6")){armazenVars();i6 = vars;}if(variable.contains("i7")){armazenVars();i7 = vars;}
				if(variable.contains("i8")){armazenVars();i8 = vars;}if(variable.contains("i9")){armazenVars();i9 = vars;}

				if(variable.contains("j0")){armazenVars();j0 = vars;}if(variable.contains("j1")){armazenVars();j1 = vars;}
				if(variable.contains("j2")){armazenVars();j2 = vars;}if(variable.contains("j3")){armazenVars();j3 = vars;}
				if(variable.contains("j4")){armazenVars();j4 = vars;}if(variable.contains("j5")){armazenVars();j5 = vars;}
				if(variable.contains("j6")){armazenVars();j6 = vars;}if(variable.contains("j7")){armazenVars();j7 = vars;}
				if(variable.contains("j8")){armazenVars();j8 = vars;}if(variable.contains("j9")){armazenVars();j9 = vars;}

				if(variable.contains("k0")){armazenVars();k0 = vars;}if(variable.contains("k1")){armazenVars();k1 = vars;}
				if(variable.contains("k2")){armazenVars();k2 = vars;}if(variable.contains("k3")){armazenVars();k3 = vars;}
				if(variable.contains("k4")){armazenVars();k4 = vars;}if(variable.contains("k5")){armazenVars();k5 = vars;}
				if(variable.contains("k6")){armazenVars();k6 = vars;}if(variable.contains("k7")){armazenVars();k7 = vars;}
				if(variable.contains("k8")){armazenVars();k8 = vars;}if(variable.contains("k9")){armazenVars();k9 = vars;}

				if(variable.contains("l0")){armazenVars();l0 = vars;}if(variable.contains("l1")){armazenVars();l1 = vars;}
				if(variable.contains("l2")){armazenVars();l2 = vars;}if(variable.contains("l3")){armazenVars();l3 = vars;}
				if(variable.contains("l4")){armazenVars();l4 = vars;}if(variable.contains("l5")){armazenVars();l5 = vars;}
				if(variable.contains("l6")){armazenVars();l6 = vars;}if(variable.contains("l7")){armazenVars();l7 = vars;}
				if(variable.contains("l8")){armazenVars();l8 = vars;}if(variable.contains("l9")){armazenVars();l9 = vars;}

				if(variable.contains("m0")){armazenVars();m0 = vars;}if(variable.contains("m1")){armazenVars();m1 = vars;}
				if(variable.contains("m2")){armazenVars();m2 = vars;}if(variable.contains("m3")){armazenVars();m3 = vars;}
				if(variable.contains("m4")){armazenVars();m4 = vars;}if(variable.contains("m5")){armazenVars();m5 = vars;}
				if(variable.contains("m6")){armazenVars();m6 = vars;}if(variable.contains("m7")){armazenVars();m7 = vars;}
				if(variable.contains("m8")){armazenVars();m8 = vars;}if(variable.contains("m9")){armazenVars();m9 = vars;}

				if(variable.contains("n0")){armazenVars();n0 = vars;}if(variable.contains("n1")){armazenVars();n1 = vars;}
				if(variable.contains("n2")){armazenVars();n2 = vars;}if(variable.contains("n3")){armazenVars();n3 = vars;}
				if(variable.contains("n4")){armazenVars();n4 = vars;}if(variable.contains("n5")){armazenVars();n5 = vars;}
				if(variable.contains("n6")){armazenVars();n6 = vars;}if(variable.contains("n7")){armazenVars();n7 = vars;}
				if(variable.contains("n8")){armazenVars();n8 = vars;}if(variable.contains("n9")){armazenVars();n9 = vars;}

				if(variable.contains("o0")){armazenVars();o0 = vars;}if(variable.contains("o1")){armazenVars();o1 = vars;}
				if(variable.contains("o2")){armazenVars();o2 = vars;}if(variable.contains("o3")){armazenVars();o3 = vars;}
				if(variable.contains("o4")){armazenVars();o4 = vars;}if(variable.contains("o5")){armazenVars();o5 = vars;}
				if(variable.contains("o6")){armazenVars();o6 = vars;}if(variable.contains("o7")){armazenVars();o7 = vars;}
				if(variable.contains("o8")){armazenVars();o8 = vars;}if(variable.contains("o9")){armazenVars();o9 = vars;}

				if(variable.contains("p0")){armazenVars();p0 = vars;}if(variable.contains("p1")){armazenVars();p1 = vars;}
				if(variable.contains("p2")){armazenVars();p2 = vars;}if(variable.contains("p3")){armazenVars();p3 = vars;}
				if(variable.contains("p4")){armazenVars();p4 = vars;}if(variable.contains("p5")){armazenVars();p5 = vars;}
				if(variable.contains("p6")){armazenVars();p6 = vars;}if(variable.contains("p7")){armazenVars();p7 = vars;}
				if(variable.contains("p8")){armazenVars();p8 = vars;}if(variable.contains("p9")){armazenVars();p9 = vars;}

				if(variable.contains("q0")){armazenVars();q0 = vars;}if(variable.contains("q1")){armazenVars();q1 = vars;}
				if(variable.contains("q2")){armazenVars();q2 = vars;}if(variable.contains("q3")){armazenVars();q3 = vars;}
				if(variable.contains("q4")){armazenVars();q4 = vars;}if(variable.contains("q5")){armazenVars();q5 = vars;}
				if(variable.contains("q6")){armazenVars();q6 = vars;}if(variable.contains("q7")){armazenVars();q7 = vars;}
				if(variable.contains("q8")){armazenVars();q8 = vars;}if(variable.contains("q9")){armazenVars();q9 = vars;}

				if(variable.contains("r0")){armazenVars();r0 = vars;}if(variable.contains("r1")){armazenVars();r1 = vars;}
				if(variable.contains("r2")){armazenVars();r2 = vars;}if(variable.contains("r3")){armazenVars();r3 = vars;}
				if(variable.contains("r4")){armazenVars();r4 = vars;}if(variable.contains("r5")){armazenVars();r5 = vars;}
				if(variable.contains("r6")){armazenVars();r6 = vars;}if(variable.contains("r7")){armazenVars();r7 = vars;}
				if(variable.contains("r8")){armazenVars();r8 = vars;}if(variable.contains("r9")){armazenVars();r9 = vars;}

				if(variable.contains("s0")){armazenVars();s0 = vars;}if(variable.contains("s1")){armazenVars();s1 = vars;}
				if(variable.contains("s2")){armazenVars();s2 = vars;}if(variable.contains("s3")){armazenVars();s3 = vars;}
				if(variable.contains("s4")){armazenVars();s4 = vars;}if(variable.contains("s5")){armazenVars();s5 = vars;}
				if(variable.contains("s6")){armazenVars();s6 = vars;}if(variable.contains("s7")){armazenVars();s7 = vars;}
				if(variable.contains("s8")){armazenVars();s8 = vars;}if(variable.contains("s9")){armazenVars();s9 = vars;}

				if(variable.contains("t0")){armazenVars();t0 = vars;}if(variable.contains("t1")){armazenVars();t1 = vars;}
				if(variable.contains("t2")){armazenVars();t2 = vars;}if(variable.contains("t3")){armazenVars();t3 = vars;}
				if(variable.contains("t4")){armazenVars();t4 = vars;}if(variable.contains("t5")){armazenVars();t5 = vars;}
				if(variable.contains("t6")){armazenVars();t6 = vars;}if(variable.contains("t7")){armazenVars();t7 = vars;}
				if(variable.contains("t8")){armazenVars();t8 = vars;}if(variable.contains("t9")){armazenVars();t9 = vars;}

				if(variable.contains("u0")){armazenVars();u0 = vars;}if(variable.contains("u1")){armazenVars();u1 = vars;}
				if(variable.contains("u2")){armazenVars();u2 = vars;}if(variable.contains("u3")){armazenVars();u3 = vars;}
				if(variable.contains("u4")){armazenVars();u4 = vars;}if(variable.contains("u5")){armazenVars();u5 = vars;}
				if(variable.contains("u6")){armazenVars();u6 = vars;}if(variable.contains("u7")){armazenVars();u7 = vars;}
				if(variable.contains("u8")){armazenVars();u8 = vars;}if(variable.contains("u9")){armazenVars();u9 = vars;}

				if(variable.contains("v0")){armazenVars();v0 = vars;}if(variable.contains("v1")){armazenVars();v1 = vars;}
				if(variable.contains("v2")){armazenVars();v2 = vars;}if(variable.contains("v3")){armazenVars();v3 = vars;}
				if(variable.contains("v4")){armazenVars();v4 = vars;}if(variable.contains("v5")){armazenVars();v5 = vars;}
				if(variable.contains("v6")){armazenVars();v6 = vars;}if(variable.contains("v7")){armazenVars();v7 = vars;}
				if(variable.contains("v8")){armazenVars();v8 = vars;}if(variable.contains("v9")){armazenVars();v9 = vars;}

				if(variable.contains("w0")){armazenVars();w0 = vars;}if(variable.contains("w1")){armazenVars();w1 = vars;}
				if(variable.contains("w2")){armazenVars();w2 = vars;}if(variable.contains("w3")){armazenVars();w3 = vars;}
				if(variable.contains("w4")){armazenVars();w4 = vars;}if(variable.contains("w5")){armazenVars();w5 = vars;}
				if(variable.contains("w6")){armazenVars();w6 = vars;}if(variable.contains("w7")){armazenVars();w7 = vars;}
				if(variable.contains("w8")){armazenVars();w8 = vars;}if(variable.contains("w9")){armazenVars();w9 = vars;}

				if(variable.contains("x0")){armazenVars();x0 = vars;}if(variable.contains("x1")){armazenVars();x1 = vars;}
				if(variable.contains("x2")){armazenVars();x2 = vars;}if(variable.contains("x3")){armazenVars();x3 = vars;}
				if(variable.contains("x4")){armazenVars();x4 = vars;}if(variable.contains("x5")){armazenVars();x5 = vars;}
				if(variable.contains("x6")){armazenVars();x6 = vars;}if(variable.contains("x7")){armazenVars();x7 = vars;}
				if(variable.contains("x8")){armazenVars();x8 = vars;}if(variable.contains("x9")){armazenVars();x9 = vars;}

				if(variable.contains("y0")){armazenVars();y0 = vars;}if(variable.contains("y1")){armazenVars();y1 = vars;}
				if(variable.contains("y2")){armazenVars();y2 = vars;}if(variable.contains("y3")){armazenVars();y3 = vars;}
				if(variable.contains("y4")){armazenVars();y4 = vars;}if(variable.contains("y5")){armazenVars();y5 = vars;}
				if(variable.contains("y6")){armazenVars();y6 = vars;}if(variable.contains("y7")){armazenVars();y7 = vars;}
				if(variable.contains("y8")){armazenVars();y8 = vars;}if(variable.contains("y9")){armazenVars();y9 = vars;}

				if(variable.contains("z0")){armazenVars();z0 = vars;}if(variable.contains("z1")){armazenVars();z1 = vars;}
				if(variable.contains("z2")){armazenVars();z2 = vars;}if(variable.contains("z3")){armazenVars();z3 = vars;}
				if(variable.contains("z4")){armazenVars();z4 = vars;}if(variable.contains("z5")){armazenVars();z5 = vars;}
				if(variable.contains("z6")){armazenVars();z6 = vars;}if(variable.contains("z7")){armazenVars();z7 = vars;}
				if(variable.contains("z8")){armazenVars();z8 = vars;}if(variable.contains("z9")){armazenVars();z9 = vars;}
			}
			
			//Método de armazenamento de strings
			public static void stringVars(){
				String mem = "";
				//Lexer de formatação de textos
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
				//Final lexer de formatação
				
				if(variable.contains("a0")){a0 = (format)?mem:val;}if(variable.contains("a1")){a1 = (format)?mem:val;}
				if(variable.contains("a2")){a2 = (format)?mem:val;}if(variable.contains("a3")){a3 = (format)?mem:val;}
				if(variable.contains("a4")){a4 = (format)?mem:val;}if(variable.contains("a5")){a5 = (format)?mem:val;}
				if(variable.contains("a6")){a6 = (format)?mem:val;}if(variable.contains("a7")){a7 = (format)?mem:val;}
				if(variable.contains("a8")){a8 = (format)?mem:val;}if(variable.contains("a9")){a9 = (format)?mem:val;}

				if(variable.contains("b0")){b0 = (format)?mem:val;}if(variable.contains("b1")){b1 = (format)?mem:val;}
				if(variable.contains("b2")){b2 = (format)?mem:val;}if(variable.contains("b3")){b3 = (format)?mem:val;}
				if(variable.contains("b4")){b4 = (format)?mem:val;}if(variable.contains("b5")){b5 = (format)?mem:val;}
				if(variable.contains("b6")){b6 = (format)?mem:val;}if(variable.contains("b7")){b7 = (format)?mem:val;}
				if(variable.contains("b8")){b8 = (format)?mem:val;}if(variable.contains("b9")){b9 = (format)?mem:val;}

				if(variable.contains("c0")){c0 = (format)?mem:val;}if(variable.contains("c1")){c1 = (format)?mem:val;}
				if(variable.contains("c2")){c2 = (format)?mem:val;}if(variable.contains("c3")){c3 = (format)?mem:val;}
				if(variable.contains("c4")){c4 = (format)?mem:val;}if(variable.contains("c5")){c5 = (format)?mem:val;}
				if(variable.contains("c6")){c6 = (format)?mem:val;}if(variable.contains("c7")){c7 = (format)?mem:val;}
				if(variable.contains("c8")){c8 = (format)?mem:val;}if(variable.contains("c9")){c9 = (format)?mem:val;}

				if(variable.contains("d0")){d0 = (format)?mem:val;}if(variable.contains("d1")){d1 = (format)?mem:val;}
				if(variable.contains("d2")){d2 = (format)?mem:val;}if(variable.contains("d3")){d3 = (format)?mem:val;}
				if(variable.contains("d4")){d4 = (format)?mem:val;}if(variable.contains("d5")){d5 = (format)?mem:val;}
				if(variable.contains("d6")){d6 = (format)?mem:val;}if(variable.contains("d7")){d7 = (format)?mem:val;}
				if(variable.contains("d8")){d8 = (format)?mem:val;}if(variable.contains("d9")){d9 = (format)?mem:val;}

				if(variable.contains("e0")){e0 = (format)?mem:val;}if(variable.contains("e1")){e1 = (format)?mem:val;}
				if(variable.contains("e2")){e2 = (format)?mem:val;}if(variable.contains("e3")){e3 = (format)?mem:val;}
				if(variable.contains("e4")){e4 = (format)?mem:val;}if(variable.contains("e5")){e5 = (format)?mem:val;}
				if(variable.contains("e6")){e6 = (format)?mem:val;}if(variable.contains("e7")){e7 = (format)?mem:val;}
				if(variable.contains("e8")){e8 = (format)?mem:val;}if(variable.contains("e9")){e9 = (format)?mem:val;}

				if(variable.contains("f0")){f0 = (format)?mem:val;}if(variable.contains("f1")){f1 = (format)?mem:val;}
				if(variable.contains("f2")){f2 = (format)?mem:val;}if(variable.contains("f3")){f3 = (format)?mem:val;}
				if(variable.contains("f4")){f4 = (format)?mem:val;}if(variable.contains("f5")){f5 = (format)?mem:val;}
				if(variable.contains("f6")){f6 = (format)?mem:val;}if(variable.contains("f7")){f7 = (format)?mem:val;}
				if(variable.contains("f8")){f8 = (format)?mem:val;}if(variable.contains("f9")){f9 = (format)?mem:val;}

				if(variable.contains("g0")){g0 = (format)?mem:val;}if(variable.contains("g1")){g1 = (format)?mem:val;}
				if(variable.contains("g2")){g2 = (format)?mem:val;}if(variable.contains("g3")){g3 = (format)?mem:val;}
				if(variable.contains("g4")){g4 = (format)?mem:val;}if(variable.contains("g5")){g5 = (format)?mem:val;}
				if(variable.contains("g6")){g6 = (format)?mem:val;}if(variable.contains("g7")){g7 = (format)?mem:val;}
				if(variable.contains("g8")){g8 = (format)?mem:val;}if(variable.contains("g9")){g9 = (format)?mem:val;}

				if(variable.contains("h0")){h0 = (format)?mem:val;}if(variable.contains("h1")){h1 = (format)?mem:val;}
				if(variable.contains("h2")){h2 = (format)?mem:val;}if(variable.contains("h3")){h3 = (format)?mem:val;}
				if(variable.contains("h4")){h4 = (format)?mem:val;}if(variable.contains("h5")){h5 = (format)?mem:val;}
				if(variable.contains("h6")){h6 = (format)?mem:val;}if(variable.contains("h7")){h7 = (format)?mem:val;}
				if(variable.contains("h8")){h8 = (format)?mem:val;}if(variable.contains("h9")){h9 = (format)?mem:val;}

				if(variable.contains("i0")){i0 = (format)?mem:val;}if(variable.contains("i1")){i1 = (format)?mem:val;}
				if(variable.contains("i2")){i2 = (format)?mem:val;}if(variable.contains("i3")){i3 = (format)?mem:val;}
				if(variable.contains("i4")){i4 = (format)?mem:val;}if(variable.contains("i5")){i5 = (format)?mem:val;}
				if(variable.contains("i6")){i6 = (format)?mem:val;}if(variable.contains("i7")){i7 = (format)?mem:val;}
				if(variable.contains("i8")){i8 = (format)?mem:val;}if(variable.contains("i9")){i9 = (format)?mem:val;}

				if(variable.contains("j0")){j0 = (format)?mem:val;}if(variable.contains("j1")){j1 = (format)?mem:val;}
				if(variable.contains("j2")){j2 = (format)?mem:val;}if(variable.contains("j3")){j3 = (format)?mem:val;}
				if(variable.contains("j4")){j4 = (format)?mem:val;}if(variable.contains("j5")){j5 = (format)?mem:val;}
				if(variable.contains("j6")){j6 = (format)?mem:val;}if(variable.contains("j7")){j7 = (format)?mem:val;}
				if(variable.contains("j8")){j8 = (format)?mem:val;}if(variable.contains("j9")){j9 = (format)?mem:val;}

				if(variable.contains("k0")){k0 = (format)?mem:val;}if(variable.contains("k1")){k1 = (format)?mem:val;}
				if(variable.contains("k2")){k2 = (format)?mem:val;}if(variable.contains("k3")){k3 = (format)?mem:val;}
				if(variable.contains("k4")){k4 = (format)?mem:val;}if(variable.contains("k5")){k5 = (format)?mem:val;}
				if(variable.contains("k6")){k6 = (format)?mem:val;}if(variable.contains("k7")){k7 = (format)?mem:val;}
				if(variable.contains("k8")){k8 = (format)?mem:val;}if(variable.contains("k9")){k9 = (format)?mem:val;}

				if(variable.contains("l0")){l0 = (format)?mem:val;}if(variable.contains("l1")){l1 = (format)?mem:val;}
				if(variable.contains("l2")){l2 = (format)?mem:val;}if(variable.contains("l3")){l3 = (format)?mem:val;}
				if(variable.contains("l4")){l4 = (format)?mem:val;}if(variable.contains("l5")){l5 = (format)?mem:val;}
				if(variable.contains("l6")){l6 = (format)?mem:val;}if(variable.contains("l7")){l7 = (format)?mem:val;}
				if(variable.contains("l8")){l8 = (format)?mem:val;}if(variable.contains("l9")){l9 = (format)?mem:val;}

				if(variable.contains("m0")){m0 = (format)?mem:val;}if(variable.contains("m1")){m1 = (format)?mem:val;}
				if(variable.contains("m2")){m2 = (format)?mem:val;}if(variable.contains("m3")){m3 = (format)?mem:val;}
				if(variable.contains("m4")){m4 = (format)?mem:val;}if(variable.contains("m5")){m5 = (format)?mem:val;}
				if(variable.contains("m6")){m6 = (format)?mem:val;}if(variable.contains("m7")){m7 = (format)?mem:val;}
				if(variable.contains("m8")){m8 = (format)?mem:val;}if(variable.contains("m9")){m9 = (format)?mem:val;}

				if(variable.contains("n0")){n0 = (format)?mem:val;}if(variable.contains("n1")){n1 = (format)?mem:val;}
				if(variable.contains("n2")){n2 = (format)?mem:val;}if(variable.contains("n3")){n3 = (format)?mem:val;}
				if(variable.contains("n4")){n4 = (format)?mem:val;}if(variable.contains("n5")){n5 = (format)?mem:val;}
				if(variable.contains("n6")){n6 = (format)?mem:val;}if(variable.contains("n7")){n7 = (format)?mem:val;}
				if(variable.contains("n8")){n8 = (format)?mem:val;}if(variable.contains("n9")){n9 = (format)?mem:val;}

				if(variable.contains("o0")){o0 = (format)?mem:val;}if(variable.contains("o1")){o1 = (format)?mem:val;}
				if(variable.contains("o2")){o2 = (format)?mem:val;}if(variable.contains("o3")){o3 = (format)?mem:val;}
				if(variable.contains("o4")){o4 = (format)?mem:val;}if(variable.contains("o5")){o5 = (format)?mem:val;}
				if(variable.contains("o6")){o6 = (format)?mem:val;}if(variable.contains("o7")){o7 = (format)?mem:val;}
				if(variable.contains("o8")){o8 = (format)?mem:val;}if(variable.contains("o9")){o9 = (format)?mem:val;}

				if(variable.contains("p0")){p0 = (format)?mem:val;}if(variable.contains("p1")){p1 = (format)?mem:val;}
				if(variable.contains("p2")){p2 = (format)?mem:val;}if(variable.contains("p3")){p3 = (format)?mem:val;}
				if(variable.contains("p4")){p4 = (format)?mem:val;}if(variable.contains("p5")){p5 = (format)?mem:val;}
				if(variable.contains("p6")){p6 = (format)?mem:val;}if(variable.contains("p7")){p7 = (format)?mem:val;}
				if(variable.contains("p8")){p8 = (format)?mem:val;}if(variable.contains("p9")){p9 = (format)?mem:val;}

				if(variable.contains("q0")){q0 = (format)?mem:val;}if(variable.contains("q1")){q1 = (format)?mem:val;}
				if(variable.contains("q2")){q2 = (format)?mem:val;}if(variable.contains("q3")){q3 = (format)?mem:val;}
				if(variable.contains("q4")){q4 = (format)?mem:val;}if(variable.contains("q5")){q5 = (format)?mem:val;}
				if(variable.contains("q6")){q6 = (format)?mem:val;}if(variable.contains("q7")){q7 = (format)?mem:val;}
				if(variable.contains("q8")){q8 = (format)?mem:val;}if(variable.contains("q9")){q9 = (format)?mem:val;}

				if(variable.contains("r0")){r0 = (format)?mem:val;}if(variable.contains("r1")){r1 = (format)?mem:val;}
				if(variable.contains("r2")){r2 = (format)?mem:val;}if(variable.contains("r3")){r3 = (format)?mem:val;}
				if(variable.contains("r4")){r4 = (format)?mem:val;}if(variable.contains("r5")){r5 = (format)?mem:val;}
				if(variable.contains("r6")){r6 = (format)?mem:val;}if(variable.contains("r7")){r7 = (format)?mem:val;}
				if(variable.contains("r8")){r8 = (format)?mem:val;}if(variable.contains("r9")){r9 = (format)?mem:val;}

				if(variable.contains("s0")){s0 = (format)?mem:val;}if(variable.contains("s1")){s1 = (format)?mem:val;}
				if(variable.contains("s2")){s2 = (format)?mem:val;}if(variable.contains("s3")){s3 = (format)?mem:val;}
				if(variable.contains("s4")){s4 = (format)?mem:val;}if(variable.contains("s5")){s5 = (format)?mem:val;}
				if(variable.contains("s6")){s6 = (format)?mem:val;}if(variable.contains("s7")){s7 = (format)?mem:val;}
				if(variable.contains("s8")){s8 = (format)?mem:val;}if(variable.contains("s9")){s9 = (format)?mem:val;}

				if(variable.contains("t0")){t0 = (format)?mem:val;}if(variable.contains("t1")){t1 = (format)?mem:val;}
				if(variable.contains("t2")){t2 = (format)?mem:val;}if(variable.contains("t3")){t3 = (format)?mem:val;}
				if(variable.contains("t4")){t4 = (format)?mem:val;}if(variable.contains("t5")){t5 = (format)?mem:val;}
				if(variable.contains("t6")){t6 = (format)?mem:val;}if(variable.contains("t7")){t7 = (format)?mem:val;}
				if(variable.contains("t8")){t8 = (format)?mem:val;}if(variable.contains("t9")){t9 = (format)?mem:val;}

				if(variable.contains("u0")){u0 = (format)?mem:val;}if(variable.contains("u1")){u1 = (format)?mem:val;}
				if(variable.contains("u2")){u2 = (format)?mem:val;}if(variable.contains("u3")){u3 = (format)?mem:val;}
				if(variable.contains("u4")){u4 = (format)?mem:val;}if(variable.contains("u5")){u5 = (format)?mem:val;}
				if(variable.contains("u6")){u6 = (format)?mem:val;}if(variable.contains("u7")){u7 = (format)?mem:val;}
				if(variable.contains("u8")){u8 = (format)?mem:val;}if(variable.contains("u9")){u9 = (format)?mem:val;}

				if(variable.contains("v0")){v0 = (format)?mem:val;}if(variable.contains("v1")){v1 = (format)?mem:val;}
				if(variable.contains("v2")){v2 = (format)?mem:val;}if(variable.contains("v3")){v3 = (format)?mem:val;}
				if(variable.contains("v4")){v4 = (format)?mem:val;}if(variable.contains("v5")){v5 = (format)?mem:val;}
				if(variable.contains("v6")){v6 = (format)?mem:val;}if(variable.contains("v7")){v7 = (format)?mem:val;}
				if(variable.contains("v8")){v8 = (format)?mem:val;}if(variable.contains("v9")){v9 = (format)?mem:val;}

				if(variable.contains("w0")){w0 = (format)?mem:val;}if(variable.contains("w1")){w1 = (format)?mem:val;}
				if(variable.contains("w2")){w2 = (format)?mem:val;}if(variable.contains("w3")){w3 = (format)?mem:val;}
				if(variable.contains("w4")){w4 = (format)?mem:val;}if(variable.contains("w5")){w5 = (format)?mem:val;}
				if(variable.contains("w6")){w6 = (format)?mem:val;}if(variable.contains("w7")){w7 = (format)?mem:val;}
				if(variable.contains("w8")){w8 = (format)?mem:val;}if(variable.contains("w9")){w9 = (format)?mem:val;}

				if(variable.contains("x0")){x0 = (format)?mem:val;}if(variable.contains("x1")){x1 = (format)?mem:val;}
				if(variable.contains("x2")){x2 = (format)?mem:val;}if(variable.contains("x3")){x3 = (format)?mem:val;}
				if(variable.contains("x4")){x4 = (format)?mem:val;}if(variable.contains("x5")){x5 = (format)?mem:val;}
				if(variable.contains("x6")){x6 = (format)?mem:val;}if(variable.contains("x7")){x7 = (format)?mem:val;}
				if(variable.contains("x8")){x8 = (format)?mem:val;}if(variable.contains("x9")){x9 = (format)?mem:val;}

				if(variable.contains("y0")){y0 = (format)?mem:val;}if(variable.contains("y1")){y1 = (format)?mem:val;}
				if(variable.contains("y2")){y2 = (format)?mem:val;}if(variable.contains("y3")){y3 = (format)?mem:val;}
				if(variable.contains("y4")){y4 = (format)?mem:val;}if(variable.contains("y5")){y5 = (format)?mem:val;}
				if(variable.contains("y6")){y6 = (format)?mem:val;}if(variable.contains("y7")){y7 = (format)?mem:val;}
				if(variable.contains("y8")){y8 = (format)?mem:val;}if(variable.contains("y9")){y9 = (format)?mem:val;}

				if(variable.contains("z0")){z0 = (format)?mem:val;}if(variable.contains("z1")){z1 = (format)?mem:val;}
				if(variable.contains("z2")){z2 = (format)?mem:val;}if(variable.contains("z3")){z3 = (format)?mem:val;}
				if(variable.contains("z4")){z4 = (format)?mem:val;}if(variable.contains("z5")){z5 = (format)?mem:val;}
				if(variable.contains("z6")){z6 = (format)?mem:val;}if(variable.contains("z7")){z7 = (format)?mem:val;}
				if(variable.contains("z8")){z8 = (format)?mem:val;}if(variable.contains("z9")){z9 = (format)?mem:val;}
				
				
			}
			//Método de armazenamento de inteiros
			public static void integersVars(){
				if(variable.contains("a0")){Ia0 = integers(val);a0 = val;}if(variable.contains("a1")){Ia1 = integers(val);a1 = val;}
				if(variable.contains("a2")){Ia2 = integers(val);a2 = val;}if(variable.contains("a3")){Ia3 = integers(val);a3 = val;}
				if(variable.contains("a4")){Ia4 = integers(val);a4 = val;}if(variable.contains("a5")){Ia5 = integers(val);a5 = val;}
				if(variable.contains("a6")){Ia6 = integers(val);a6 = val;}if(variable.contains("a7")){Ia7 = integers(val);a7 = val;}
				if(variable.contains("a8")){Ia8 = integers(val);a8 = val;}if(variable.contains("a9")){Ia9 = integers(val);a9 = val;}

				if(variable.contains("b0")){Ib0 = integers(val);b0 = val;}if(variable.contains("b1")){Ib1 = integers(val);b1 = val;}
				if(variable.contains("b2")){Ib2 = integers(val);b2 = val;}if(variable.contains("b3")){Ib3 = integers(val);b3 = val;}
				if(variable.contains("b4")){Ib4 = integers(val);b4 = val;}if(variable.contains("b5")){Ib5 = integers(val);b5 = val;}
				if(variable.contains("b6")){Ib6 = integers(val);b6 = val;}if(variable.contains("b7")){Ib7 = integers(val);b7 = val;}
				if(variable.contains("b8")){Ib8 = integers(val);b8 = val;}if(variable.contains("b9")){Ib9 = integers(val);b9 = val;}

				if(variable.contains("c0")){Ic0 = integers(val);c0 = val;}if(variable.contains("c1")){Ic1 = integers(val);c1 = val;}
				if(variable.contains("c2")){Ic2 = integers(val);c2 = val;}if(variable.contains("c3")){Ic3 = integers(val);c3 = val;}
				if(variable.contains("c4")){Ic4 = integers(val);c4 = val;}if(variable.contains("c5")){Ic5 = integers(val);c5 = val;}
				if(variable.contains("c6")){Ic6 = integers(val);c6 = val;}if(variable.contains("c7")){Ic7 = integers(val);c7 = val;}
				if(variable.contains("c8")){Ic8 = integers(val);c8 = val;}if(variable.contains("c9")){Ic9 = integers(val);c9 = val;}

				if(variable.contains("d0")){Id0 = integers(val);d0 = val;}if(variable.contains("d1")){Id1 = integers(val);d1 = val;}
				if(variable.contains("d2")){Id2 = integers(val);d2 = val;}if(variable.contains("d3")){Id3 = integers(val);d3 = val;}
				if(variable.contains("d4")){Id4 = integers(val);d4 = val;}if(variable.contains("d5")){Id5 = integers(val);d5 = val;}
				if(variable.contains("d6")){Id6 = integers(val);d6 = val;}if(variable.contains("d7")){Id7 = integers(val);d7 = val;}
				if(variable.contains("d8")){Id8 = integers(val);d8 = val;}if(variable.contains("d9")){Id9 = integers(val);d9 = val;}

				if(variable.contains("e0")){Ie0 = integers(val);e0 = val;}if(variable.contains("e1")){Ie1 = integers(val);e1 = val;}
				if(variable.contains("e2")){Ie2 = integers(val);e2 = val;}if(variable.contains("e3")){Ie3 = integers(val);e3 = val;}
				if(variable.contains("e4")){Ie4 = integers(val);e4 = val;}if(variable.contains("e5")){Ie5 = integers(val);e5 = val;}
				if(variable.contains("e6")){Ie6 = integers(val);e6 = val;}if(variable.contains("e7")){Ie7 = integers(val);e7 = val;}
				if(variable.contains("e8")){Ie8 = integers(val);e8 = val;}if(variable.contains("e9")){Ie9 = integers(val);e9 = val;}

				if(variable.contains("f0")){If0 = integers(val);f0 = val;}if(variable.contains("f1")){If1 = integers(val);f1 = val;}
				if(variable.contains("f2")){If2 = integers(val);f2 = val;}if(variable.contains("f3")){If3 = integers(val);f3 = val;}
				if(variable.contains("f4")){If4 = integers(val);f4 = val;}if(variable.contains("f5")){If5 = integers(val);f5 = val;}
				if(variable.contains("f6")){If6 = integers(val);f6 = val;}if(variable.contains("f7")){If7 = integers(val);f7 = val;}
				if(variable.contains("f8")){If8 = integers(val);f8 = val;}if(variable.contains("f9")){If9 = integers(val);f9 = val;}

				if(variable.contains("g0")){Ig0 = integers(val);g0 = val;}if(variable.contains("g1")){Ig1 = integers(val);g1 = val;}
				if(variable.contains("g2")){Ig2 = integers(val);g2 = val;}if(variable.contains("g3")){Ig3 = integers(val);g3 = val;}
				if(variable.contains("g4")){Ig4 = integers(val);g4 = val;}if(variable.contains("g5")){Ig5 = integers(val);g5 = val;}
				if(variable.contains("g6")){Ig6 = integers(val);g6 = val;}if(variable.contains("g7")){Ig7 = integers(val);g7 = val;}
				if(variable.contains("g8")){Ig8 = integers(val);g8 = val;}if(variable.contains("g9")){Ig9 = integers(val);g9 = val;}

				if(variable.contains("h0")){Ih0 = integers(val);h0 = val;}if(variable.contains("h1")){Ih1 = integers(val);h1 = val;}
				if(variable.contains("h2")){Ih2 = integers(val);h2 = val;}if(variable.contains("h3")){Ih3 = integers(val);h3 = val;}
				if(variable.contains("h4")){Ih4 = integers(val);h4 = val;}if(variable.contains("h5")){Ih5 = integers(val);h5 = val;}
				if(variable.contains("h6")){Ih6 = integers(val);h6 = val;}if(variable.contains("h7")){Ih7 = integers(val);h7 = val;}
				if(variable.contains("h8")){Ih8 = integers(val);h8 = val;}if(variable.contains("h9")){Ih9 = integers(val);h9 = val;}

				if(variable.contains("i0")){Ii0 = integers(val);i0 = val;}if(variable.contains("i1")){Ii1 = integers(val);i1 = val;}
				if(variable.contains("i2")){Ii2 = integers(val);i2 = val;}if(variable.contains("i3")){Ii3 = integers(val);i3 = val;}
				if(variable.contains("i4")){Ii4 = integers(val);i4 = val;}if(variable.contains("i5")){Ii5 = integers(val);i5 = val;}
				if(variable.contains("i6")){Ii6 = integers(val);i6 = val;}if(variable.contains("i7")){Ii7 = integers(val);i7 = val;}
				if(variable.contains("i8")){Ii8 = integers(val);i8 = val;}if(variable.contains("i9")){Ii9 = integers(val);i9 = val;}

				if(variable.contains("j0")){Ij0 = integers(val);j0 = val;}if(variable.contains("j1")){Ij1 = integers(val);j1 = val;}
				if(variable.contains("j2")){Ij2 = integers(val);j2 = val;}if(variable.contains("j3")){Ij3 = integers(val);j3 = val;}
				if(variable.contains("j4")){Ij4 = integers(val);j4 = val;}if(variable.contains("j5")){Ij5 = integers(val);j5 = val;}
				if(variable.contains("j6")){Ij6 = integers(val);j6 = val;}if(variable.contains("j7")){Ij7 = integers(val);j7 = val;}
				if(variable.contains("j8")){Ij8 = integers(val);j8 = val;}if(variable.contains("j9")){Ij9 = integers(val);j9 = val;}

				if(variable.contains("k0")){Ik0 = integers(val);k0 = val;}if(variable.contains("k1")){Ik1 = integers(val);k1 = val;}
				if(variable.contains("k2")){Ik2 = integers(val);k2 = val;}if(variable.contains("k3")){Ik3 = integers(val);k3 = val;}
				if(variable.contains("k4")){Ik4 = integers(val);k4 = val;}if(variable.contains("k5")){Ik5 = integers(val);k5 = val;}
				if(variable.contains("k6")){Ik6 = integers(val);k6 = val;}if(variable.contains("k7")){Ik7 = integers(val);k7 = val;}
				if(variable.contains("k8")){Ik8 = integers(val);k8 = val;}if(variable.contains("k9")){Ik9 = integers(val);k9 = val;}

				if(variable.contains("l0")){Il0 = integers(val);l0 = val;}if(variable.contains("l1")){Il1 = integers(val);l1 = val;}
				if(variable.contains("l2")){Il2 = integers(val);l2 = val;}if(variable.contains("l3")){Il3 = integers(val);l3 = val;}
				if(variable.contains("l4")){Il4 = integers(val);l4 = val;}if(variable.contains("l5")){Il5 = integers(val);l5 = val;}
				if(variable.contains("l6")){Il6 = integers(val);l6 = val;}if(variable.contains("l7")){Il7 = integers(val);l7 = val;}
				if(variable.contains("l8")){Il8 = integers(val);l8 = val;}if(variable.contains("l9")){Il9 = integers(val);l9 = val;}

				if(variable.contains("m0")){Im0 = integers(val);m0 = val;}if(variable.contains("m1")){Im1 = integers(val);m1 = val;}
				if(variable.contains("m2")){Im2 = integers(val);m2 = val;}if(variable.contains("m3")){Im3 = integers(val);m3 = val;}
				if(variable.contains("m4")){Im4 = integers(val);m4 = val;}if(variable.contains("m5")){Im5 = integers(val);m5 = val;}
				if(variable.contains("m6")){Im6 = integers(val);m6 = val;}if(variable.contains("m7")){Im7 = integers(val);m7 = val;}
				if(variable.contains("m8")){Im8 = integers(val);m8 = val;}if(variable.contains("m9")){Im9 = integers(val);m9 = val;}

				if(variable.contains("n0")){In0 = integers(val);n0 = val;}if(variable.contains("n1")){In1 = integers(val);n1 = val;}
				if(variable.contains("n2")){In2 = integers(val);n2 = val;}if(variable.contains("n3")){In3 = integers(val);n3 = val;}
				if(variable.contains("n4")){In4 = integers(val);n4 = val;}if(variable.contains("n5")){In5 = integers(val);n5 = val;}
				if(variable.contains("n6")){In6 = integers(val);n6 = val;}if(variable.contains("n7")){In7 = integers(val);n7 = val;}
				if(variable.contains("n8")){In8 = integers(val);n8 = val;}if(variable.contains("n9")){In9 = integers(val);n9 = val;}

				if(variable.contains("o0")){Io0 = integers(val);o0 = val;}if(variable.contains("o1")){Io1 = integers(val);o1 = val;}
				if(variable.contains("o2")){Io2 = integers(val);o2 = val;}if(variable.contains("o3")){Io3 = integers(val);o3 = val;}
				if(variable.contains("o4")){Io4 = integers(val);o4 = val;}if(variable.contains("o5")){Io5 = integers(val);o5 = val;}
				if(variable.contains("o6")){Io6 = integers(val);o6 = val;}if(variable.contains("o7")){Io7 = integers(val);o7 = val;}
				if(variable.contains("o8")){Io8 = integers(val);o8 = val;}if(variable.contains("o9")){Io9 = integers(val);o9 = val;}

				if(variable.contains("p0")){Ip0 = integers(val);p0 = val;}if(variable.contains("p1")){Ip1 = integers(val);p1 = val;}
				if(variable.contains("p2")){Ip2 = integers(val);p2 = val;}if(variable.contains("p3")){Ip3 = integers(val);p3 = val;}
				if(variable.contains("p4")){Ip4 = integers(val);p4 = val;}if(variable.contains("p5")){Ip5 = integers(val);p5 = val;}
				if(variable.contains("p6")){Ip6 = integers(val);p6 = val;}if(variable.contains("p7")){Ip7 = integers(val);p7 = val;}
				if(variable.contains("p8")){Ip8 = integers(val);p8 = val;}if(variable.contains("p9")){Ip9 = integers(val);p9 = val;}

				if(variable.contains("q0")){Iq0 = integers(val);q0 = val;}if(variable.contains("q1")){Iq1 = integers(val);q1 = val;}
				if(variable.contains("q2")){Iq2 = integers(val);q2 = val;}if(variable.contains("q3")){Iq3 = integers(val);q3 = val;}
				if(variable.contains("q4")){Iq4 = integers(val);q4 = val;}if(variable.contains("q5")){Iq5 = integers(val);q5 = val;}
				if(variable.contains("q6")){Iq6 = integers(val);q6 = val;}if(variable.contains("q7")){Iq7 = integers(val);q7 = val;}
				if(variable.contains("q8")){Iq8 = integers(val);q8 = val;}if(variable.contains("q9")){Iq9 = integers(val);q9 = val;}

				if(variable.contains("r0")){Ir0 = integers(val);r0 = val;}if(variable.contains("r1")){Ir1 = integers(val);r1 = val;}
				if(variable.contains("r2")){Ir2 = integers(val);r2 = val;}if(variable.contains("r3")){Ir3 = integers(val);r3 = val;}
				if(variable.contains("r4")){Ir4 = integers(val);r4 = val;}if(variable.contains("r5")){Ir5 = integers(val);r5 = val;}
				if(variable.contains("r6")){Ir6 = integers(val);r6 = val;}if(variable.contains("r7")){Ir7 = integers(val);r7 = val;}
				if(variable.contains("r8")){Ir8 = integers(val);r8 = val;}if(variable.contains("r9")){Ir9 = integers(val);r9 = val;}

				if(variable.contains("s0")){Is0 = integers(val);s0 = val;}if(variable.contains("s1")){Is1 = integers(val);s1 = val;}
				if(variable.contains("s2")){Is2 = integers(val);s2 = val;}if(variable.contains("s3")){Is3 = integers(val);s3 = val;}
				if(variable.contains("s4")){Is4 = integers(val);s4 = val;}if(variable.contains("s5")){Is5 = integers(val);s5 = val;}
				if(variable.contains("s6")){Is6 = integers(val);s6 = val;}if(variable.contains("s7")){Is7 = integers(val);s7 = val;}
				if(variable.contains("s8")){Is8 = integers(val);s8 = val;}if(variable.contains("s9")){Is9 = integers(val);s9 = val;}

				if(variable.contains("t0")){It0 = integers(val);t0 = val;}if(variable.contains("t1")){It1 = integers(val);t1 = val;}
				if(variable.contains("t2")){It2 = integers(val);t2 = val;}if(variable.contains("t3")){It3 = integers(val);t3 = val;}
				if(variable.contains("t4")){It4 = integers(val);t4 = val;}if(variable.contains("t5")){It5 = integers(val);t5 = val;}
				if(variable.contains("t6")){It6 = integers(val);t6 = val;}if(variable.contains("t7")){It7 = integers(val);t7 = val;}
				if(variable.contains("t8")){It8 = integers(val);t8 = val;}if(variable.contains("t9")){It9 = integers(val);t9 = val;}

				if(variable.contains("u0")){Iu0 = integers(val);u0 = val;}if(variable.contains("u1")){Iu1 = integers(val);u1 = val;}
				if(variable.contains("u2")){Iu2 = integers(val);u2 = val;}if(variable.contains("u3")){Iu3 = integers(val);u3 = val;}
				if(variable.contains("u4")){Iu4 = integers(val);u4 = val;}if(variable.contains("u5")){Iu5 = integers(val);u5 = val;}
				if(variable.contains("u6")){Iu6 = integers(val);u6 = val;}if(variable.contains("u7")){Iu7 = integers(val);u7 = val;}
				if(variable.contains("u8")){Iu8 = integers(val);u8 = val;}if(variable.contains("u9")){Iu9 = integers(val);u9 = val;}

				if(variable.contains("v0")){Iv0 = integers(val);v0 = val;}if(variable.contains("v1")){Iv1 = integers(val);v1 = val;}
				if(variable.contains("v2")){Iv2 = integers(val);v2 = val;}if(variable.contains("v3")){Iv3 = integers(val);v3 = val;}
				if(variable.contains("v4")){Iv4 = integers(val);v4 = val;}if(variable.contains("v5")){Iv5 = integers(val);v5 = val;}
				if(variable.contains("v6")){Iv6 = integers(val);v6 = val;}if(variable.contains("v7")){Iv7 = integers(val);v7 = val;}
				if(variable.contains("v8")){Iv8 = integers(val);v8 = val;}if(variable.contains("v9")){Iv9 = integers(val);v9 = val;}

				if(variable.contains("w0")){Iw0 = integers(val);w0 = val;}if(variable.contains("w1")){Iw1 = integers(val);w1 = val;}
				if(variable.contains("w2")){Iw2 = integers(val);w2 = val;}if(variable.contains("w3")){Iw3 = integers(val);w3 = val;}
				if(variable.contains("w4")){Iw4 = integers(val);w4 = val;}if(variable.contains("w5")){Iw5 = integers(val);w5 = val;}
				if(variable.contains("w6")){Iw6 = integers(val);w6 = val;}if(variable.contains("w7")){Iw7 = integers(val);w7 = val;}
				if(variable.contains("w8")){Iw8 = integers(val);w8 = val;}if(variable.contains("w9")){Iw9 = integers(val);w9 = val;}

				if(variable.contains("x0")){Ix0 = integers(val);x0 = val;}if(variable.contains("x1")){Ix1 = integers(val);x1 = val;}
				if(variable.contains("x2")){Ix2 = integers(val);x2 = val;}if(variable.contains("x3")){Ix3 = integers(val);x3 = val;}
				if(variable.contains("x4")){Ix4 = integers(val);x4 = val;}if(variable.contains("x5")){Ix5 = integers(val);x5 = val;}
				if(variable.contains("x6")){Ix6 = integers(val);x6 = val;}if(variable.contains("x7")){Ix7 = integers(val);x7 = val;}
				if(variable.contains("x8")){Ix8 = integers(val);x8 = val;}if(variable.contains("x9")){Ix9 = integers(val);x9 = val;}

				if(variable.contains("y0")){Iy0 = integers(val);y0 = val;}if(variable.contains("y1")){Iy1 = integers(val);y1 = val;}
				if(variable.contains("y2")){Iy2 = integers(val);y2 = val;}if(variable.contains("y3")){Iy3 = integers(val);y3 = val;}
				if(variable.contains("y4")){Iy4 = integers(val);y4 = val;}if(variable.contains("y5")){Iy5 = integers(val);y5 = val;}
				if(variable.contains("y6")){Iy6 = integers(val);y6 = val;}if(variable.contains("y7")){Iy7 = integers(val);y7 = val;}
				if(variable.contains("y8")){Iy8 = integers(val);y8 = val;}if(variable.contains("y9")){Iy9 = integers(val);y9 = val;}

				if(variable.contains("z0")){Iz0 = integers(val);z0 = val;}if(variable.contains("z1")){Iz1 = integers(val);z1 = val;}
				if(variable.contains("z2")){Iz2 = integers(val);z2 = val;}if(variable.contains("z3")){Iz3 = integers(val);z3 = val;}
				if(variable.contains("z4")){Iz4 = integers(val);z4 = val;}if(variable.contains("z5")){Iz5 = integers(val);z5 = val;}
				if(variable.contains("z6")){Iz6 = integers(val);z6 = val;}if(variable.contains("z7")){Iz7 = integers(val);z7 = val;}
				if(variable.contains("z8")){Iz8 = integers(val);z8 = val;}if(variable.contains("z9")){Iz9 = integers(val);z9 = val;}
			}
			
			//Método de verificar primeiro variável na operação
			public static void firstValueVar(){
				//val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("+"));
				
				if(val1.contains("@a0")){val1 = a0;}if(val1.contains("@a1")){val1 = a1;}
				if(val1.contains("@a2")){val1 = a2;}if(val1.contains("@a3")){val1 = a3;}
				if(val1.contains("@a4")){val1 = a4;}if(val1.contains("@a5")){val1 = a5;}
				if(val1.contains("@a6")){val1 = a6;}if(val1.contains("@a7")){val1 = a7;}
				if(val1.contains("@a8")){val1 = a8;}if(val1.contains("@a9")){val1 = a9;}
				
				if(val1.contains("@b0")){val1 = b0;}if(val1.contains("@b1")){val1 = b1;}
				if(val1.contains("@b2")){val1 = b2;}if(val1.contains("@b3")){val1 = b3;}
				if(val1.contains("@b4")){val1 = b4;}if(val1.contains("@b5")){val1 = b5;}
				if(val1.contains("@b6")){val1 = b6;}if(val1.contains("@b7")){val1 = b7;}
				if(val1.contains("@b8")){val1 = b8;}if(val1.contains("@b9")){val1 = b9;}
				
				if(val1.contains("@c0")){val1 = c0;}if(val1.contains("@c1")){val1 = c1;}
				if(val1.contains("@c2")){val1 = c2;}if(val1.contains("@c3")){val1 = c3;}
				if(val1.contains("@c4")){val1 = c4;}if(val1.contains("@c5")){val1 = c5;}
				if(val1.contains("@c6")){val1 = c6;}if(val1.contains("@c7")){val1 = c7;}
				if(val1.contains("@c8")){val1 = c8;}if(val1.contains("@c9")){val1 = c9;}
				
				if(val1.contains("@d0")){val1 = d0;}if(val1.contains("@d1")){val1 = d1;}
				if(val1.contains("@d2")){val1 = d2;}if(val1.contains("@d3")){val1 = d3;}
				if(val1.contains("@d4")){val1 = d4;}if(val1.contains("@d5")){val1 = d5;}
				if(val1.contains("@d6")){val1 = d6;}if(val1.contains("@d7")){val1 = d7;}
				if(val1.contains("@d8")){val1 = d8;}if(val1.contains("@d9")){val1 = d9;}
			
				if(val1.contains("@e0")){val1 = e0;}if(val1.contains("@e1")){val1 = e1;}
				if(val1.contains("@e2")){val1 = e2;}if(val1.contains("@e3")){val1 = e3;}
				if(val1.contains("@e4")){val1 = e4;}if(val1.contains("@e5")){val1 = e5;}
				if(val1.contains("@e6")){val1 = e6;}if(val1.contains("@e7")){val1 = e7;}
				if(val1.contains("@e8")){val1 = e8;}if(val1.contains("@e9")){val1 = e9;}
			
				if(val1.contains("@f0")){val1 = f0;}if(val1.contains("@f1")){val1 = f1;}
				if(val1.contains("@f2")){val1 = f2;}if(val1.contains("@f3")){val1 = f3;}
				if(val1.contains("@f4")){val1 = f4;}if(val1.contains("@f5")){val1 = f5;}
				if(val1.contains("@f6")){val1 = f6;}if(val1.contains("@f7")){val1 = f7;}
				if(val1.contains("@f8")){val1 = f8;}if(val1.contains("@f9")){val1 = f9;}
			
				if(val1.contains("@g0")){val1 = g0;}if(val1.contains("@g1")){val1 = g1;}
				if(val1.contains("@g2")){val1 = g2;}if(val1.contains("@g3")){val1 = g3;}
				if(val1.contains("@g4")){val1 = g4;}if(val1.contains("@g5")){val1 = g5;}
				if(val1.contains("@g6")){val1 = g6;}if(val1.contains("@g7")){val1 = g7;}
				if(val1.contains("@g8")){val1 = g8;}if(val1.contains("@g9")){val1 = g9;}
				
				if(val1.contains("@h0")){val1 = h0;}if(val1.contains("@h1")){val1 = h1;}
				if(val1.contains("@h2")){val1 = h2;}if(val1.contains("@h3")){val1 = h3;}
				if(val1.contains("@h4")){val1 = h4;}if(val1.contains("@h5")){val1 = h5;}
				if(val1.contains("@h6")){val1 = h6;}if(val1.contains("@h7")){val1 = h7;}
				if(val1.contains("@h8")){val1 = h8;}if(val1.contains("@h9")){val1 = h9;}
			
				if(val1.contains("@i0")){val1 = i0;}if(val1.contains("@i1")){val1 = i1;}
				if(val1.contains("@i2")){val1 = i2;}if(val1.contains("@i3")){val1 = i3;}
				if(val1.contains("@i4")){val1 = i4;}if(val1.contains("@i5")){val1 = i5;}
				if(val1.contains("@i6")){val1 = i6;}if(val1.contains("@i7")){val1 = i7;}
				if(val1.contains("@i8")){val1 = i8;}if(val1.contains("@i9")){val1 = i9;}
				
				if(val1.contains("@j0")){val1 = j0;}if(val1.contains("@j1")){val1 = j1;}
				if(val1.contains("@j2")){val1 = j2;}if(val1.contains("@j3")){val1 = j3;}
				if(val1.contains("@j4")){val1 = j4;}if(val1.contains("@j5")){val1 = j5;}
				if(val1.contains("@j6")){val1 = j6;}if(val1.contains("@j7")){val1 = j7;}
				if(val1.contains("@j8")){val1 = j8;}if(val1.contains("@j9")){val1 = j9;}
				
				if(val1.contains("@k0")){val1 = k0;}if(val1.contains("@k1")){val1 = k1;}
				if(val1.contains("@k2")){val1 = k2;}if(val1.contains("@k3")){val1 = k3;}
				if(val1.contains("@k4")){val1 = k4;}if(val1.contains("@k5")){val1 = k5;}
				if(val1.contains("@k6")){val1 = k6;}if(val1.contains("@k7")){val1 = k7;}
				if(val1.contains("@k8")){val1 = k8;}if(val1.contains("@k9")){val1 = k9;}
				
				if(val1.contains("@l0")){val1 = l0;}if(val1.contains("@l1")){val1 = l1;}
				if(val1.contains("@l2")){val1 = l2;}if(val1.contains("@l3")){val1 = l3;}
				if(val1.contains("@l4")){val1 = l4;}if(val1.contains("@l5")){val1 = l5;}
				if(val1.contains("@l6")){val1 = l6;}if(val1.contains("@l7")){val1 = l7;}
				if(val1.contains("@l8")){val1 = l8;}if(val1.contains("@l9")){val1 = l9;}
				
				if(val1.contains("@m0")){val1 = m0;}if(val1.contains("@m1")){val1 = m1;}
				if(val1.contains("@m2")){val1 = m2;}if(val1.contains("@m3")){val1 = m3;}
				if(val1.contains("@m4")){val1 = m4;}if(val1.contains("@m5")){val1 = m5;}
				if(val1.contains("@m6")){val1 = m6;}if(val1.contains("@m7")){val1 = m7;}
				if(val1.contains("@m8")){val1 = m8;}if(val1.contains("@m9")){val1 = m9;}
				
				if(val1.contains("@n0")){val1 = n0;}if(val1.contains("@n1")){val1 = n1;}
				if(val1.contains("@n2")){val1 = n2;}if(val1.contains("@n3")){val1 = n3;}
				if(val1.contains("@n4")){val1 = n4;}if(val1.contains("@n5")){val1 = n5;}
				if(val1.contains("@n6")){val1 = n6;}if(val1.contains("@n7")){val1 = n7;}
				if(val1.contains("@n8")){val1 = n8;}if(val1.contains("@n9")){val1 = n9;}
			
				if(val1.contains("@o0")){val1 = o0;}if(val1.contains("@o1")){val1 = o1;}
				if(val1.contains("@o2")){val1 = o2;}if(val1.contains("@o3")){val1 = o3;}
				if(val1.contains("@o4")){val1 = o4;}if(val1.contains("@o5")){val1 = o5;}
				if(val1.contains("@o6")){val1 = o6;}if(val1.contains("@o7")){val1 = o7;}
				if(val1.contains("@o8")){val1 = o8;}if(val1.contains("@o9")){val1 = o9;}
				
				if(val1.contains("@p0")){val1 = p0;}if(val1.contains("@p1")){val1 = p1;}
				if(val1.contains("@p2")){val1 = p2;}if(val1.contains("@p3")){val1 = p3;}
				if(val1.contains("@p4")){val1 = p4;}if(val1.contains("@p5")){val1 = p5;}
				if(val1.contains("@p6")){val1 = p6;}if(val1.contains("@p7")){val1 = p7;}
				if(val1.contains("@p8")){val1 = p8;}if(val1.contains("@p9")){val1 = p9;}
				
				if(val1.contains("@q0")){val1 = q0;}if(val1.contains("@q1")){val1 = q1;}
				if(val1.contains("@q2")){val1 = q2;}if(val1.contains("@q3")){val1 = q3;}
				if(val1.contains("@q4")){val1 = q4;}if(val1.contains("@q5")){val1 = q5;}
				if(val1.contains("@q6")){val1 = q6;}if(val1.contains("@q7")){val1 = q7;}
				if(val1.contains("@q8")){val1 = q8;}if(val1.contains("@q9")){val1 = q9;}
				
				if(val1.contains("@r0")){val1 = r0;}if(val1.contains("@r1")){val1 = r1;}
				if(val1.contains("@r2")){val1 = r2;}if(val1.contains("@r3")){val1 = r3;}
				if(val1.contains("@r4")){val1 = r4;}if(val1.contains("@r5")){val1 = r5;}
				if(val1.contains("@r6")){val1 = r6;}if(val1.contains("@r7")){val1 = r7;}
				if(val1.contains("@r8")){val1 = r8;}if(val1.contains("@r9")){val1 = r9;}
				
				if(val1.contains("@s0")){val1 = s0;}if(val1.contains("@s1")){val1 = s1;}
				if(val1.contains("@s2")){val1 = s2;}if(val1.contains("@s3")){val1 = s3;}
				if(val1.contains("@s4")){val1 = s4;}if(val1.contains("@s5")){val1 = s5;}
				if(val1.contains("@s6")){val1 = s6;}if(val1.contains("@s7")){val1 = s7;}
				if(val1.contains("@s8")){val1 = s8;}if(val1.contains("@s9")){val1 = s9;}
				
				if(val1.contains("@t0")){val1 = t0;}if(val1.contains("@t1")){val1 = t1;}
				if(val1.contains("@t2")){val1 = t2;}if(val1.contains("@t3")){val1 = t3;}
				if(val1.contains("@t4")){val1 = t4;}if(val1.contains("@t5")){val1 = t5;}
				if(val1.contains("@t6")){val1 = t6;}if(val1.contains("@t7")){val1 = t7;}
				if(val1.contains("@t8")){val1 = t8;}if(val1.contains("@t9")){val1 = t9;}
				
				if(val1.contains("@u0")){val1 = u0;}if(val1.contains("@u1")){val1 = u1;}
				if(val1.contains("@u2")){val1 = u2;}if(val1.contains("@u3")){val1 = u3;}
				if(val1.contains("@u4")){val1 = u4;}if(val1.contains("@u5")){val1 = u5;}
				if(val1.contains("@u6")){val1 = u6;}if(val1.contains("@u7")){val1 = u7;}
				if(val1.contains("@u8")){val1 = u8;}if(val1.contains("@u9")){val1 = u9;}
				
				if(val1.contains("@v0")){val1 = v0;}if(val1.contains("@v1")){val1 = v1;}
				if(val1.contains("@v2")){val1 = v2;}if(val1.contains("@v3")){val1 = v3;}
				if(val1.contains("@v4")){val1 = v4;}if(val1.contains("@v5")){val1 = v5;}
				if(val1.contains("@v6")){val1 = v6;}if(val1.contains("@v7")){val1 = v7;}
				if(val1.contains("@v8")){val1 = v8;}if(val1.contains("@v9")){val1 = v9;}
				
				if(val1.contains("@w0")){val1 = w0;}if(val1.contains("@w1")){val1 = w1;}
				if(val1.contains("@w2")){val1 = w2;}if(val1.contains("@w3")){val1 = w3;}
				if(val1.contains("@w4")){val1 = w4;}if(val1.contains("@w5")){val1 = w5;}
				if(val1.contains("@w6")){val1 = w6;}if(val1.contains("@w7")){val1 = w7;}
				if(val1.contains("@w8")){val1 = w8;}if(val1.contains("@w9")){val1 = w9;}
			
				if(val1.contains("@x0")){val1 = x0;}if(val1.contains("@x1")){val1 = x1;}
				if(val1.contains("@x2")){val1 = x2;}if(val1.contains("@x3")){val1 = x3;}
				if(val1.contains("@x4")){val1 = x4;}if(val1.contains("@x5")){val1 = x5;}
				if(val1.contains("@x6")){val1 = x6;}if(val1.contains("@x7")){val1 = x7;}
				if(val1.contains("@x8")){val1 = x8;}if(val1.contains("@x9")){val1 = x9;}
				
				if(val1.contains("@y0")){val1 = y0;}if(val1.contains("@y1")){val1 = y1;}
				if(val1.contains("@y2")){val1 = y2;}if(val1.contains("@y3")){val1 = y3;}
				if(val1.contains("@y4")){val1 = y4;}if(val1.contains("@y5")){val1 = y5;}
				if(val1.contains("@y6")){val1 = y6;}if(val1.contains("@y7")){val1 = y7;}
				if(val1.contains("@y8")){val1 = y8;}if(val1.contains("@y9")){val1 = y9;}
				
				if(val1.contains("@z0")){val1 = z0;}if(val1.contains("@z1")){val1 = z1;}
				if(val1.contains("@z2")){val1 = z2;}if(val1.contains("@z3")){val1 = z3;}
				if(val1.contains("@z4")){val1 = z4;}if(val1.contains("@z5")){val1 = z5;}
				if(val1.contains("@z6")){val1 = z6;}if(val1.contains("@z7")){val1 = z7;}
				if(val1.contains("@z8")){val1 = z8;}if(val1.contains("@z9")){val1 = z9;}
			}
			//Método de verificar a segunda variável na operação
			public static void secondValueVar(){
				//val2 = valOp.substring(valOp.indexOf("+")+1, valOp.lastIndexOf("]"));

				if(val2.contains("@a0")){val2 = a0;}if(val2.contains("@a1")){val2 = a1;}
				if(val2.contains("@a2")){val2 = a2;}if(val2.contains("@a3")){val2 = a3;}
				if(val2.contains("@a4")){val2 = a4;}if(val2.contains("@a5")){val2 = a5;}
				if(val2.contains("@a6")){val2 = a6;}if(val2.contains("@a7")){val2 = a7;}
				if(val2.contains("@a8")){val2 = a8;}if(val2.contains("@a9")){val2 = a9;}
			
				if(val2.contains("@b0")){val2 = b0;}if(val2.contains("@b1")){val2 = b1;}
				if(val2.contains("@b2")){val2 = b2;}if(val2.contains("@b3")){val2 = b3;}
				if(val2.contains("@b4")){val2 = b4;}if(val2.contains("@b5")){val2 = b5;}
				if(val2.contains("@b6")){val2 = b6;}if(val2.contains("@b7")){val2 = b7;}
				if(val2.contains("@b8")){val2 = b8;}if(val2.contains("@b9")){val2 = b9;}
				
				if(val2.contains("@c0")){val2 = c0;}if(val2.contains("@c1")){val2 = c1;}
				if(val2.contains("@c2")){val2 = c2;}if(val2.contains("@c3")){val2 = c3;}
				if(val2.contains("@c4")){val2 = c4;}if(val2.contains("@c5")){val2 = c5;}
				if(val2.contains("@c6")){val2 = c6;}if(val2.contains("@c7")){val2 = c7;}
				if(val2.contains("@c8")){val2 = c8;}if(val2.contains("@c9")){val2 = c9;}
				
				if(val2.contains("@d0")){val1 = d0;}if(val2.contains("@d1")){val2 = d1;}
				if(val2.contains("@d2")){val2 = d2;}if(val2.contains("@d3")){val2 = d3;}
				if(val2.contains("@d4")){val2 = d4;}if(val2.contains("@d5")){val2 = d5;}
				if(val2.contains("@d6")){val2 = d6;}if(val2.contains("@d7")){val2 = d7;}
				if(val2.contains("@d8")){val2 = d8;}if(val2.contains("@d9")){val2 = d9;}
			
				if(val2.contains("@e0")){val2 = e0;}if(val2.contains("@e1")){val2 = e1;}
				if(val2.contains("@e2")){val2 = e2;}if(val2.contains("@e3")){val2 = e3;}
				if(val2.contains("@e4")){val2 = e4;}if(val2.contains("@e5")){val2 = e5;}
				if(val2.contains("@e6")){val2 = e6;}if(val2.contains("@e7")){val2 = e7;}
				if(val2.contains("@e8")){val2 = e8;}if(val2.contains("@e9")){val2 = e9;}
			
				if(val2.contains("@f0")){val2 = f0;}if(val2.contains("@f1")){val2 = f1;}
				if(val2.contains("@f2")){val2 = f2;}if(val2.contains("@f3")){val2 = f3;}
				if(val2.contains("@f4")){val2 = f4;}if(val2.contains("@f5")){val2 = f5;}
				if(val2.contains("@f6")){val2 = f6;}if(val2.contains("@f7")){val2 = f7;}
				if(val2.contains("@f8")){val2 = f8;}if(val2.contains("@f9")){val2 = f9;}
		
				if(val2.contains("@g0")){val2 = g0;}if(val2.contains("@g1")){val2 = g1;}
				if(val2.contains("@g2")){val2 = g2;}if(val2.contains("@g3")){val2 = g3;}
				if(val2.contains("@g4")){val2 = g4;}if(val2.contains("@g5")){val2 = g5;}
				if(val2.contains("@g6")){val2 = g6;}if(val2.contains("@g7")){val2 = g7;}
				if(val2.contains("@g8")){val2 = g8;}if(val2.contains("@g9")){val2 = g9;}
				
				if(val2.contains("@h0")){val2 = h0;}if(val2.contains("@h1")){val2 = h1;}
				if(val2.contains("@h2")){val2 = h2;}if(val2.contains("@h3")){val2 = h3;}
				if(val2.contains("@h4")){val2 = h4;}if(val2.contains("@h5")){val2 = h5;}
				if(val2.contains("@h6")){val2 = h6;}if(val2.contains("@h7")){val2 = h7;}
				if(val2.contains("@h8")){val2 = h8;}if(val2.contains("@h9")){val2 = h9;}
			
				if(val2.contains("@i0")){val2 = i0;}if(val2.contains("@i1")){val2 = i1;}
				if(val2.contains("@i2")){val2 = i2;}if(val2.contains("@i3")){val2 = i3;}
				if(val2.contains("@i4")){val2 = i4;}if(val2.contains("@i5")){val2 = i5;}
				if(val2.contains("@i6")){val2 = i6;}if(val2.contains("@i7")){val2 = i7;}
				if(val2.contains("@i8")){val2 = i8;}if(val2.contains("@i9")){val2 = i9;}
				
				if(val2.contains("@j0")){val2 = j0;}if(val2.contains("@j1")){val2 = j1;}
				if(val2.contains("@j2")){val2 = j2;}if(val2.contains("@j3")){val2 = j3;}
				if(val2.contains("@j4")){val2 = j4;}if(val2.contains("@j5")){val2 = j5;}
				if(val2.contains("@j6")){val2 = j6;}if(val2.contains("@j7")){val2 = j7;}
				if(val2.contains("@j8")){val2 = j8;}if(val2.contains("@j9")){val2 = j9;}
				
				if(val2.contains("@k0")){val2 = k0;}if(val2.contains("@k1")){val2 = k1;}
				if(val2.contains("@k2")){val2 = k2;}if(val2.contains("@k3")){val2 = k3;}
				if(val2.contains("@k4")){val2 = k4;}if(val2.contains("@k5")){val2 = k5;}
				if(val2.contains("@k6")){val2 = k6;}if(val2.contains("@k7")){val2 = k7;}
				if(val2.contains("@k8")){val2 = k8;}if(val2.contains("@k9")){val2 = k9;}
				
				if(val2.contains("@l0")){val2 = l0;}if(val2.contains("@l1")){val2 = l1;}
				if(val2.contains("@l2")){val2 = l2;}if(val2.contains("@l3")){val2 = l3;}
				if(val2.contains("@l4")){val2 = l4;}if(val2.contains("@l5")){val2 = l5;}
				if(val2.contains("@l6")){val2 = l6;}if(val2.contains("@l7")){val2 = l7;}
				if(val2.contains("@l8")){val2 = l8;}if(val2.contains("@l9")){val2 = l9;}
				
				if(val2.contains("@m0")){val2 = m0;}if(val2.contains("@m1")){val2 = m1;}
				if(val2.contains("@m2")){val2 = m2;}if(val2.contains("@m3")){val2 = m3;}
				if(val2.contains("@m4")){val2 = m4;}if(val2.contains("@m5")){val2 = m5;}
				if(val2.contains("@m6")){val2 = m6;}if(val2.contains("@m7")){val2 = m7;}
				if(val2.contains("@m8")){val2 = m8;}if(val2.contains("@m9")){val2 = m9;}
				
				if(val2.contains("@n0")){val2 = n0;}if(val2.contains("@n1")){val2 = n1;}
				if(val2.contains("@n2")){val2 = n2;}if(val2.contains("@n3")){val2 = n3;}
				if(val2.contains("@n4")){val2 = n4;}if(val2.contains("@n5")){val2 = n5;}
				if(val2.contains("@n6")){val2 = n6;}if(val2.contains("@n7")){val2 = n7;}
				if(val2.contains("@n8")){val2 = n8;}if(val2.contains("@n9")){val2 = n9;}
		
				if(val2.contains("@o0")){val2 = o0;}if(val2.contains("@o1")){val2 = o1;}
				if(val2.contains("@o2")){val2 = o2;}if(val2.contains("@o3")){val2 = o3;}
				if(val2.contains("@o4")){val2 = o4;}if(val2.contains("@o5")){val2 = o5;}
				if(val2.contains("@o6")){val2 = o6;}if(val2.contains("@o7")){val2 = o7;}
				if(val2.contains("@o8")){val2 = o8;}if(val2.contains("@o9")){val2 = o9;}
			
				if(val2.contains("@p0")){val2 = p0;}if(val2.contains("@p1")){val2 = p1;}
				if(val2.contains("@p2")){val2 = p2;}if(val2.contains("@p3")){val2 = p3;}
				if(val2.contains("@p4")){val2 = p4;}if(val2.contains("@p5")){val2 = p5;}
				if(val2.contains("@p6")){val2 = p6;}if(val2.contains("@p7")){val2 = p7;}
				if(val2.contains("@p8")){val2 = p8;}if(val2.contains("@p9")){val2 = p9;}
				
				if(val2.contains("@q0")){val2 = q0;}if(val2.contains("@q1")){val2 = q1;}
				if(val2.contains("@q2")){val2 = q2;}if(val2.contains("@q3")){val2 = q3;}
				if(val2.contains("@q4")){val2 = q4;}if(val2.contains("@q5")){val2 = q5;}
				if(val2.contains("@q6")){val2 = q6;}if(val2.contains("@q7")){val2 = q7;}
				if(val2.contains("@q8")){val2 = q8;}if(val2.contains("@q9")){val2 = q9;}
				
				if(val2.contains("@r0")){val2 = r0;}if(val2.contains("@r1")){val2 = r1;}
				if(val2.contains("@r2")){val2 = r2;}if(val2.contains("@r3")){val2 = r3;}
				if(val2.contains("@r4")){val2 = r4;}if(val2.contains("@r5")){val2 = r5;}
				if(val2.contains("@r6")){val2 = r6;}if(val2.contains("@r7")){val2 = r7;}
				if(val2.contains("@r8")){val2 = r8;}if(val2.contains("@r9")){val2 = r9;}
				
				if(val2.contains("@s0")){val2 = s0;}if(val2.contains("@s1")){val2 = s1;}
				if(val2.contains("@s2")){val2 = s2;}if(val2.contains("@s3")){val2 = s3;}
				if(val2.contains("@s4")){val2 = s4;}if(val2.contains("@s5")){val2 = s5;}
				if(val2.contains("@s6")){val2 = s6;}if(val2.contains("@s7")){val2 = s7;}
				if(val2.contains("@s8")){val2 = s8;}if(val2.contains("@s9")){val2 = s9;}
				
				if(val2.contains("@t0")){val2 = t0;}if(val2.contains("@t1")){val2 = t1;}
				if(val2.contains("@t2")){val2 = t2;}if(val2.contains("@t3")){val2 = t3;}
				if(val2.contains("@t4")){val2 = t4;}if(val2.contains("@t5")){val2 = t5;}
				if(val2.contains("@t6")){val2 = t6;}if(val2.contains("@t7")){val2 = t7;}
				if(val2.contains("@t8")){val2 = t8;}if(val2.contains("@t9")){val2 = t9;}
			
				if(val2.contains("@u0")){val2 = u0;}if(val2.contains("@u1")){val2 = u1;}
				if(val2.contains("@u2")){val2 = u2;}if(val2.contains("@u3")){val2 = u3;}
				if(val2.contains("@u4")){val2 = u4;}if(val2.contains("@u5")){val2 = u5;}
				if(val2.contains("@u6")){val2 = u6;}if(val2.contains("@u7")){val2 = u7;}
				if(val2.contains("@u8")){val2 = u8;}if(val2.contains("@u9")){val2 = u9;}
				
				if(val2.contains("@v0")){val2 = v0;}if(val2.contains("@v1")){val2 = v1;}
				if(val2.contains("@v2")){val2 = v2;}if(val2.contains("@v3")){val2 = v3;}
				if(val2.contains("@v4")){val2 = v4;}if(val2.contains("@v5")){val2 = v5;}
				if(val2.contains("@v6")){val2 = v6;}if(val2.contains("@v7")){val2 = v7;}
				if(val2.contains("@v8")){val2 = v8;}if(val2.contains("@v9")){val2 = v9;}
				
				if(val2.contains("@w0")){val2 = w0;}if(val2.contains("@w1")){val2 = w1;}
				if(val2.contains("@w2")){val2 = w2;}if(val2.contains("@w3")){val2 = w3;}
				if(val2.contains("@w4")){val2 = w4;}if(val2.contains("@w5")){val2 = w5;}
				if(val2.contains("@w6")){val2 = w6;}if(val2.contains("@w7")){val2 = w7;}
				if(val2.contains("@w8")){val2 = w8;}if(val2.contains("@w9")){val2 = w9;}
		
				if(val2.contains("@x0")){val2 = x0;}if(val2.contains("@x1")){val2 = x1;}
				if(val2.contains("@x2")){val2 = x2;}if(val2.contains("@x3")){val2 = x3;}
				if(val2.contains("@x4")){val2 = x4;}if(val2.contains("@x5")){val2 = x5;}
				if(val2.contains("@x6")){val2 = x6;}if(val2.contains("@x7")){val2 = x7;}
				if(val2.contains("@x8")){val2 = x8;}if(val2.contains("@x9")){val2 = x9;}
				
				if(val2.contains("@y0")){val2 = y0;}if(val2.contains("@y1")){val2 = y1;}
				if(val2.contains("@y2")){val2 = y2;}if(val2.contains("@y3")){val2 = y3;}
				if(val2.contains("@y4")){val2 = y4;}if(val2.contains("@y5")){val2 = y5;}
				if(val2.contains("@y6")){val2 = y6;}if(val2.contains("@y7")){val2 = y7;}
				if(val2.contains("@y8")){val2 = y8;}if(val2.contains("@y9")){val2 = y9;}
				
				if(val2.contains("@z0")){val2 = z0;}if(val2.contains("@z1")){val2 = z1;}
				if(val2.contains("@z2")){val2 = z2;}if(val2.contains("@z3")){val2 = z3;}
				if(val2.contains("@z4")){val2 = z4;}if(val2.contains("@z5")){val2 = z5;}
				if(val2.contains("@z6")){val2 = z6;}if(val2.contains("@z7")){val2 = z7;}
				if(val2.contains("@z8")){val2 = z8;}if(val2.contains("@z9")){val2 = z9;}
				
			}
			//Método de adição de inteiros em variáveis
			public static void addictionVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("+"));
				val2 = valOp.substring(valOp.indexOf("+")+1, valOp.lastIndexOf("]"));
				
				firstValueVar();
				secondValueVar();
				
				if(variable.contains("a0")){Ia0 = integers(val1)+integers(val2);a0 = ""+Ia0;}if(variable.contains("a1")){Ia1 = integers(val1)+integers(val2);a1 = ""+Ia1;}
				if(variable.contains("a2")){Ia2 = integers(val1)+integers(val2);a2 = ""+Ia2;}if(variable.contains("a3")){Ia3 = integers(val1)+integers(val2);a3 = ""+Ia3;}
				if(variable.contains("a4")){Ia4 = integers(val1)+integers(val2);a4 = ""+Ia4;}if(variable.contains("a5")){Ia5 = integers(val1)+integers(val2);a5 = ""+Ia5;}
				if(variable.contains("a6")){Ia6 = integers(val1)+integers(val2);a6 = ""+Ia6;}if(variable.contains("a7")){Ia7 = integers(val1)+integers(val2);a7 = ""+Ia7;}
				if(variable.contains("a8")){Ia8 = integers(val1)+integers(val2);a8 = ""+Ia8;}if(variable.contains("a9")){Ia9 = integers(val1)+integers(val2);a9 = ""+Ia9;}
				
				if(variable.contains("b0")){Ib0 = integers(val1)+integers(val2);b0 = ""+Ib0;}if(variable.contains("b1")){Ib1 = integers(val1)+integers(val2);b1 = ""+Ib1;}
				if(variable.contains("b2")){Ib2 = integers(val1)+integers(val2);b2 = ""+Ib2;}if(variable.contains("b3")){Ib3 = integers(val1)+integers(val2);b3 = ""+Ib3;}
				if(variable.contains("b4")){Ib4 = integers(val1)+integers(val2);b4 = ""+Ib4;}if(variable.contains("b5")){Ib5 = integers(val1)+integers(val2);b5 = ""+Ib5;}
				if(variable.contains("b6")){Ib6 = integers(val1)+integers(val2);b6 = ""+Ib6;}if(variable.contains("b7")){Ib7 = integers(val1)+integers(val2);b7 = ""+Ib7;}
				if(variable.contains("b8")){Ib8 = integers(val1)+integers(val2);b8 = ""+Ib8;}if(variable.contains("b9")){Ib9 = integers(val1)+integers(val2);b9 = ""+Ib9;}
				
				if(variable.contains("c0")){Ic0 = integers(val1)+integers(val2);c0 = ""+Ic0;}if(variable.contains("c1")){Ic1 = integers(val1)+integers(val2);c1 = ""+Ic1;}
				if(variable.contains("c2")){Ic2 = integers(val1)+integers(val2);c2 = ""+Ic2;}if(variable.contains("c3")){Ic3 = integers(val1)+integers(val2);c3 = ""+Ic3;}
				if(variable.contains("c4")){Ic4 = integers(val1)+integers(val2);c4 = ""+Ic4;}if(variable.contains("c5")){Ic5 = integers(val1)+integers(val2);c5 = ""+Ic5;}
				if(variable.contains("c6")){Ic6 = integers(val1)+integers(val2);c6 = ""+Ic6;}if(variable.contains("c7")){Ic7 = integers(val1)+integers(val2);c7 = ""+Ic7;}
				if(variable.contains("c8")){Ic8 = integers(val1)+integers(val2);c8 = ""+Ic8;}if(variable.contains("c9")){Ic9 = integers(val1)+integers(val2);c9 = ""+Ic9;}
				
				if(variable.contains("d0")){Id0 = integers(val1)+integers(val2);d0 = ""+Id0;}if(variable.contains("d1")){Id1 = integers(val1)+integers(val2);d1 = ""+Id1;}
				if(variable.contains("d2")){Id2 = integers(val1)+integers(val2);d2 = ""+Id2;}if(variable.contains("d3")){Id3 = integers(val1)+integers(val2);d3 = ""+Id3;}
				if(variable.contains("d4")){Id4 = integers(val1)+integers(val2);d4 = ""+Id4;}if(variable.contains("d5")){Id5 = integers(val1)+integers(val2);d5 = ""+Id5;}
				if(variable.contains("d6")){Id6 = integers(val1)+integers(val2);d6 = ""+Id6;}if(variable.contains("d7")){Id7 = integers(val1)+integers(val2);d7 = ""+Id7;}
				if(variable.contains("d8")){Id8 = integers(val1)+integers(val2);d8 = ""+Id8;}if(variable.contains("d9")){Id9 = integers(val1)+integers(val2);d9 = ""+Id9;}
				
				if(variable.contains("e0")){Ie0 = integers(val1)+integers(val2);a0 = ""+Ie0;}if(variable.contains("e1")){Ie1 = integers(val1)+integers(val2);e1 = ""+Ie1;}
				if(variable.contains("e2")){Ie2 = integers(val1)+integers(val2);e2 = ""+Ie2;}if(variable.contains("e3")){Ie3 = integers(val1)+integers(val2);e3 = ""+Ie3;}
				if(variable.contains("e4")){Ie4 = integers(val1)+integers(val2);e4 = ""+Ie4;}if(variable.contains("e5")){Ie5 = integers(val1)+integers(val2);e5 = ""+Ie5;}
				if(variable.contains("e6")){Ie6 = integers(val1)+integers(val2);e6 = ""+Ie6;}if(variable.contains("e7")){Ie7 = integers(val1)+integers(val2);e7 = ""+Ie7;}
				if(variable.contains("e8")){Ie8 = integers(val1)+integers(val2);e8 = ""+Ie8;}if(variable.contains("e9")){Ie9 = integers(val1)+integers(val2);e9 = ""+Ie9;}
			
				if(variable.contains("f0")){If0 = integers(val1)+integers(val2);a0 = ""+If0;}if(variable.contains("f1")){If1 = integers(val1)+integers(val2);f1 = ""+If1;}
				if(variable.contains("f2")){If2 = integers(val1)+integers(val2);f2 = ""+If2;}if(variable.contains("f3")){If3 = integers(val1)+integers(val2);f3 = ""+If3;}
				if(variable.contains("f4")){If4 = integers(val1)+integers(val2);f4 = ""+If4;}if(variable.contains("f5")){If5 = integers(val1)+integers(val2);f5 = ""+If5;}
				if(variable.contains("f6")){If6 = integers(val1)+integers(val2);f6 = ""+If6;}if(variable.contains("f7")){If7 = integers(val1)+integers(val2);f7 = ""+If7;}
				if(variable.contains("f8")){If8 = integers(val1)+integers(val2);f8 = ""+If8;}if(variable.contains("f9")){If9 = integers(val1)+integers(val2);f9 = ""+If9;}
			
				if(variable.contains("g0")){Ig0 = integers(val1)+integers(val2);g0 = ""+Ig0;}if(variable.contains("g1")){Ig1 = integers(val1)+integers(val2);g1 = ""+Ig1;}
				if(variable.contains("g2")){Ig2 = integers(val1)+integers(val2);g2 = ""+Ig2;}if(variable.contains("g3")){Ig3 = integers(val1)+integers(val2);g3 = ""+Ig3;}
				if(variable.contains("g4")){Ig4 = integers(val1)+integers(val2);g4 = ""+Ig4;}if(variable.contains("g5")){Ig5 = integers(val1)+integers(val2);g5 = ""+Ig5;}
				if(variable.contains("g6")){Ig6 = integers(val1)+integers(val2);g6 = ""+Ig6;}if(variable.contains("g7")){Ig7 = integers(val1)+integers(val2);g7 = ""+Ig7;}
				if(variable.contains("g8")){Ig8 = integers(val1)+integers(val2);g8 = ""+Ig8;}if(variable.contains("g9")){Ig9 = integers(val1)+integers(val2);g9 = ""+Ig9;}
			
				if(variable.contains("h0")){Ih0 = integers(val1)+integers(val2);h0 = ""+Ih0;}if(variable.contains("h1")){Ih1 = integers(val1)+integers(val2);h1 = ""+Ih1;}
				if(variable.contains("h2")){Ih2 = integers(val1)+integers(val2);h2 = ""+Ih2;}if(variable.contains("h3")){Ih3 = integers(val1)+integers(val2);h3 = ""+Ih3;}
				if(variable.contains("h4")){Ih4 = integers(val1)+integers(val2);h4 = ""+Ih4;}if(variable.contains("h5")){Ih5 = integers(val1)+integers(val2);h5 = ""+Ih5;}
				if(variable.contains("h6")){Ih6 = integers(val1)+integers(val2);h6 = ""+Ih6;}if(variable.contains("h7")){Ih7 = integers(val1)+integers(val2);h7 = ""+Ih7;}
				if(variable.contains("h8")){Ih8 = integers(val1)+integers(val2);h8 = ""+Ih8;}if(variable.contains("h9")){Ih9 = integers(val1)+integers(val2);h9 = ""+Ih9;}
				
				if(variable.contains("i0")){Ii0 = integers(val1)+integers(val2);i0 = ""+Ii0;}if(variable.contains("i1")){Ii1 = integers(val1)+integers(val2);i1 = ""+Ii1;}
				if(variable.contains("i2")){Ii2 = integers(val1)+integers(val2);i2 = ""+Ii2;}if(variable.contains("i3")){Ii3 = integers(val1)+integers(val2);i3 = ""+Ii3;}
				if(variable.contains("i4")){Ii4 = integers(val1)+integers(val2);i4 = ""+Ii4;}if(variable.contains("i5")){Ii5 = integers(val1)+integers(val2);i5 = ""+Ii5;}
				if(variable.contains("i6")){Ii6 = integers(val1)+integers(val2);i6 = ""+Ii6;}if(variable.contains("i7")){Ii7 = integers(val1)+integers(val2);i7 = ""+Ii7;}
				if(variable.contains("i8")){Ii8 = integers(val1)+integers(val2);i8 = ""+Ii8;}if(variable.contains("i9")){Ii9 = integers(val1)+integers(val2);i9 = ""+Ii9;}
				
				if(variable.contains("j0")){Ij0 = integers(val1)+integers(val2);j0 = ""+Ij0;}if(variable.contains("j1")){Ij1 = integers(val1)+integers(val2);j1 = ""+Ij1;}
				if(variable.contains("j2")){Ij2 = integers(val1)+integers(val2);j2 = ""+Ij2;}if(variable.contains("j3")){Ij3 = integers(val1)+integers(val2);j3 = ""+Ij3;}
				if(variable.contains("j4")){Ij4 = integers(val1)+integers(val2);j4 = ""+Ij4;}if(variable.contains("j5")){Ij5 = integers(val1)+integers(val2);j5 = ""+Ij5;}
				if(variable.contains("j6")){Ij6 = integers(val1)+integers(val2);j6 = ""+Ij6;}if(variable.contains("j7")){Ij7 = integers(val1)+integers(val2);j7 = ""+Ij7;}
				if(variable.contains("j8")){Ij8 = integers(val1)+integers(val2);j8 = ""+Ij8;}if(variable.contains("j9")){Ij9 = integers(val1)+integers(val2);j9 = ""+Ij9;}
				
				if(variable.contains("k0")){Ik0 = integers(val1)+integers(val2);k0 = ""+Ik0;}if(variable.contains("k1")){Ik1 = integers(val1)+integers(val2);k1 = ""+Ik1;}
				if(variable.contains("k2")){Ik2 = integers(val1)+integers(val2);k2 = ""+Ik2;}if(variable.contains("k3")){Ik3 = integers(val1)+integers(val2);k3 = ""+Ik3;}
				if(variable.contains("k4")){Ik4 = integers(val1)+integers(val2);k4 = ""+Ik4;}if(variable.contains("k5")){Ik5 = integers(val1)+integers(val2);k5 = ""+Ik5;}
				if(variable.contains("k6")){Ik6 = integers(val1)+integers(val2);k6 = ""+Ik6;}if(variable.contains("k7")){Ik7 = integers(val1)+integers(val2);k7 = ""+Ik7;}
				if(variable.contains("k8")){Ik8 = integers(val1)+integers(val2);k8 = ""+Ik8;}if(variable.contains("k9")){Ik9 = integers(val1)+integers(val2);k9 = ""+Ik9;}
			
				if(variable.contains("l0")){Il0 = integers(val1)+integers(val2);l0 = ""+Il0;}if(variable.contains("l1")){Il1 = integers(val1)+integers(val2);l1 = ""+Il1;}
				if(variable.contains("l2")){Il2 = integers(val1)+integers(val2);l2 = ""+Il2;}if(variable.contains("l3")){Il3 = integers(val1)+integers(val2);l3 = ""+Il3;}
				if(variable.contains("l4")){Il4 = integers(val1)+integers(val2);l4 = ""+Il4;}if(variable.contains("l5")){Il5 = integers(val1)+integers(val2);l5 = ""+Il5;}
				if(variable.contains("l6")){Il6 = integers(val1)+integers(val2);l6 = ""+Il6;}if(variable.contains("l7")){Il7 = integers(val1)+integers(val2);l7 = ""+Il7;}
				if(variable.contains("l8")){Il8 = integers(val1)+integers(val2);l8 = ""+Il8;}if(variable.contains("l9")){Il9 = integers(val1)+integers(val2);l9 = ""+Il9;}
				
				if(variable.contains("m0")){Im0 = integers(val1)+integers(val2);m0 = ""+Im0;}if(variable.contains("m1")){Im1 = integers(val1)+integers(val2);m1 = ""+Im1;}
				if(variable.contains("m2")){Im2 = integers(val1)+integers(val2);m2 = ""+Im2;}if(variable.contains("m3")){Im3 = integers(val1)+integers(val2);m3 = ""+Im3;}
				if(variable.contains("m4")){Im4 = integers(val1)+integers(val2);m4 = ""+Im4;}if(variable.contains("m5")){Im5 = integers(val1)+integers(val2);m5 = ""+Im5;}
				if(variable.contains("m6")){Im6 = integers(val1)+integers(val2);m6 = ""+Im6;}if(variable.contains("m7")){Im7 = integers(val1)+integers(val2);m7 = ""+Im7;}
				if(variable.contains("m8")){Im8 = integers(val1)+integers(val2);m8 = ""+Im8;}if(variable.contains("m9")){Im9 = integers(val1)+integers(val2);m9 = ""+Im9;}
				
				if(variable.contains("n0")){In0 = integers(val1)+integers(val2);n0 = ""+In0;}if(variable.contains("n1")){In1 = integers(val1)+integers(val2);n1 = ""+In1;}
				if(variable.contains("n2")){In2 = integers(val1)+integers(val2);n2 = ""+In2;}if(variable.contains("n3")){In3 = integers(val1)+integers(val2);n3 = ""+In3;}
				if(variable.contains("n4")){In4 = integers(val1)+integers(val2);n4 = ""+In4;}if(variable.contains("n5")){In5 = integers(val1)+integers(val2);n5 = ""+In5;}
				if(variable.contains("n6")){In6 = integers(val1)+integers(val2);n6 = ""+In6;}if(variable.contains("n7")){In7 = integers(val1)+integers(val2);n7 = ""+In7;}
				if(variable.contains("n8")){In8 = integers(val1)+integers(val2);n8 = ""+In8;}if(variable.contains("n9")){In9 = integers(val1)+integers(val2);n9 = ""+In9;}
				
				if(variable.contains("o0")){Io0 = integers(val1)+integers(val2);o0 = ""+Io0;}if(variable.contains("o1")){Io1 = integers(val1)+integers(val2);o1 = ""+Io1;}
				if(variable.contains("o2")){Io2 = integers(val1)+integers(val2);o2 = ""+Io2;}if(variable.contains("o3")){Io3 = integers(val1)+integers(val2);o3 = ""+Io3;}
				if(variable.contains("o4")){Io4 = integers(val1)+integers(val2);o4 = ""+Io4;}if(variable.contains("o5")){Io5 = integers(val1)+integers(val2);o5 = ""+Io5;}
				if(variable.contains("o6")){Io6 = integers(val1)+integers(val2);o6 = ""+Io6;}if(variable.contains("o7")){Io7 = integers(val1)+integers(val2);o7 = ""+Io7;}
				if(variable.contains("o8")){Io8 = integers(val1)+integers(val2);o8 = ""+Io8;}if(variable.contains("o9")){Io9 = integers(val1)+integers(val2);o9 = ""+Io9;}
				
				if(variable.contains("p0")){Ip0 = integers(val1)+integers(val2);p0 = ""+Ip0;}if(variable.contains("p1")){Ip1 = integers(val1)+integers(val2);p1 = ""+Ip1;}
				if(variable.contains("p2")){Ip2 = integers(val1)+integers(val2);p2 = ""+Ip2;}if(variable.contains("p3")){Ip3 = integers(val1)+integers(val2);p3 = ""+Ip3;}
				if(variable.contains("p4")){Ip4 = integers(val1)+integers(val2);p4 = ""+Ip4;}if(variable.contains("p5")){Ip5 = integers(val1)+integers(val2);p5 = ""+Ip5;}
				if(variable.contains("p6")){Ip6 = integers(val1)+integers(val2);p6 = ""+Ip6;}if(variable.contains("p7")){Ip7 = integers(val1)+integers(val2);p7 = ""+Ip7;}
				if(variable.contains("p8")){Ip8 = integers(val1)+integers(val2);p8 = ""+Ip8;}if(variable.contains("p9")){Ip9 = integers(val1)+integers(val2);p9 = ""+Ip9;}
				
				if(variable.contains("q0")){Iq0 = integers(val1)+integers(val2);q0 = ""+Iq0;}if(variable.contains("q1")){Iq1 = integers(val1)+integers(val2);q1 = ""+Iq1;}
				if(variable.contains("q2")){Iq2 = integers(val1)+integers(val2);q2 = ""+Iq2;}if(variable.contains("q3")){Iq3 = integers(val1)+integers(val2);q3 = ""+Iq3;}
				if(variable.contains("q4")){Iq4 = integers(val1)+integers(val2);q4 = ""+Iq4;}if(variable.contains("q5")){Iq5 = integers(val1)+integers(val2);q5 = ""+Iq5;}
				if(variable.contains("q6")){Iq6 = integers(val1)+integers(val2);q6 = ""+Iq6;}if(variable.contains("q7")){Iq7 = integers(val1)+integers(val2);q7 = ""+Iq7;}
				if(variable.contains("q8")){Iq8 = integers(val1)+integers(val2);q8 = ""+Iq8;}if(variable.contains("q9")){Iq9 = integers(val1)+integers(val2);q9 = ""+Iq9;}
				
				if(variable.contains("r0")){Ir0 = integers(val1)+integers(val2);r0 = ""+Ir0;}if(variable.contains("r1")){Ir1 = integers(val1)+integers(val2);r1 = ""+Ir1;}
				if(variable.contains("r2")){Ir2 = integers(val1)+integers(val2);r2 = ""+Ir2;}if(variable.contains("r3")){Ir3 = integers(val1)+integers(val2);r3 = ""+Ir3;}
				if(variable.contains("r4")){Ir4 = integers(val1)+integers(val2);r4 = ""+Ir4;}if(variable.contains("r5")){Ir5 = integers(val1)+integers(val2);r5 = ""+Ir5;}
				if(variable.contains("r6")){Ir6 = integers(val1)+integers(val2);r6 = ""+Ir6;}if(variable.contains("r7")){Ir7 = integers(val1)+integers(val2);r7 = ""+Ir7;}
				if(variable.contains("r8")){Ir8 = integers(val1)+integers(val2);r8 = ""+Ir8;}if(variable.contains("r9")){Ir9 = integers(val1)+integers(val2);r9 = ""+Ir9;}
				
				if(variable.contains("s0")){Is0 = integers(val1)+integers(val2);s0 = ""+Is0;}if(variable.contains("s1")){Is1 = integers(val1)+integers(val2);s1 = ""+Is1;}
				if(variable.contains("s2")){Is2 = integers(val1)+integers(val2);s2 = ""+Is2;}if(variable.contains("s3")){Is3 = integers(val1)+integers(val2);s3 = ""+Is3;}
				if(variable.contains("s4")){Is4 = integers(val1)+integers(val2);s4 = ""+Is4;}if(variable.contains("s5")){Is5 = integers(val1)+integers(val2);s5 = ""+Is5;}
				if(variable.contains("s6")){Is6 = integers(val1)+integers(val2);s6 = ""+Is6;}if(variable.contains("s7")){Is7 = integers(val1)+integers(val2);s7 = ""+Is7;}
				if(variable.contains("s8")){Is8 = integers(val1)+integers(val2);s8 = ""+Is8;}if(variable.contains("s9")){Is9 = integers(val1)+integers(val2);s9 = ""+Is9;}
			
				if(variable.contains("t0")){It0 = integers(val1)+integers(val2);t0 = ""+It0;}if(variable.contains("t1")){It1 = integers(val1)+integers(val2);t1 = ""+It1;}
				if(variable.contains("t2")){It2 = integers(val1)+integers(val2);t2 = ""+It2;}if(variable.contains("t3")){It3 = integers(val1)+integers(val2);t3 = ""+It3;}
				if(variable.contains("t4")){It4 = integers(val1)+integers(val2);t4 = ""+It4;}if(variable.contains("t5")){It5 = integers(val1)+integers(val2);t5 = ""+It5;}
				if(variable.contains("t6")){It6 = integers(val1)+integers(val2);t6 = ""+It6;}if(variable.contains("t7")){It7 = integers(val1)+integers(val2);t7 = ""+It7;}
				if(variable.contains("t8")){It8 = integers(val1)+integers(val2);t8 = ""+It8;}if(variable.contains("t9")){It9 = integers(val1)+integers(val2);t9 = ""+It9;}
			
				if(variable.contains("u0")){Iu0 = integers(val1)+integers(val2);u0 = ""+Iu0;}if(variable.contains("u1")){Iu1 = integers(val1)+integers(val2);u1 = ""+Iu1;}
				if(variable.contains("u2")){Iu2 = integers(val1)+integers(val2);u2 = ""+Iu2;}if(variable.contains("u3")){Iu3 = integers(val1)+integers(val2);u3 = ""+Iu3;}
				if(variable.contains("u4")){Iu4 = integers(val1)+integers(val2);u4 = ""+Iu4;}if(variable.contains("u5")){Iu5 = integers(val1)+integers(val2);u5 = ""+Iu5;}
				if(variable.contains("u6")){Iu6 = integers(val1)+integers(val2);u6 = ""+Iu6;}if(variable.contains("u7")){Iu7 = integers(val1)+integers(val2);u7 = ""+Iu7;}
				if(variable.contains("u8")){Iu8 = integers(val1)+integers(val2);u8 = ""+Iu8;}if(variable.contains("u9")){Iu9 = integers(val1)+integers(val2);u9 = ""+Iu9;}
				
				if(variable.contains("v0")){Iv0 = integers(val1)+integers(val2);v0 = ""+Iv0;}if(variable.contains("v1")){Iv1 = integers(val1)+integers(val2);v1 = ""+Iv1;}
				if(variable.contains("v2")){Iv2 = integers(val1)+integers(val2);v2 = ""+Iv2;}if(variable.contains("v3")){Iv3 = integers(val1)+integers(val2);v3 = ""+Iv3;}
				if(variable.contains("v4")){Iv4 = integers(val1)+integers(val2);v4 = ""+Iv4;}if(variable.contains("v5")){Iv5 = integers(val1)+integers(val2);v5 = ""+Iv5;}
				if(variable.contains("v6")){Iv6 = integers(val1)+integers(val2);v6 = ""+Iv6;}if(variable.contains("v7")){Iv7 = integers(val1)+integers(val2);v7 = ""+Iv7;}
				if(variable.contains("v8")){Iv8 = integers(val1)+integers(val2);v8 = ""+Iv8;}if(variable.contains("v9")){Iv9 = integers(val1)+integers(val2);v9 = ""+Iv9;}
				
				if(variable.contains("w0")){Iw0 = integers(val1)+integers(val2);w0 = ""+Iw0;}if(variable.contains("w1")){Iw1 = integers(val1)+integers(val2);w1 = ""+Iw1;}
				if(variable.contains("w2")){Iw2 = integers(val1)+integers(val2);w2 = ""+Iw2;}if(variable.contains("w3")){Iw3 = integers(val1)+integers(val2);w3 = ""+Iw3;}
				if(variable.contains("w4")){Iw4 = integers(val1)+integers(val2);w4 = ""+Iw4;}if(variable.contains("w5")){Iw5 = integers(val1)+integers(val2);w5 = ""+Iw5;}
				if(variable.contains("w6")){Iw6 = integers(val1)+integers(val2);w6 = ""+Iw6;}if(variable.contains("w7")){Iw7 = integers(val1)+integers(val2);w7 = ""+Iw7;}
				if(variable.contains("w8")){Iw8 = integers(val1)+integers(val2);w8 = ""+Iw8;}if(variable.contains("w9")){Iw9 = integers(val1)+integers(val2);w9 = ""+Iw9;}
			
				if(variable.contains("x0")){Ix0 = integers(val1)+integers(val2);x0 = ""+Ix0;}if(variable.contains("x1")){Ix1 = integers(val1)+integers(val2);x1 = ""+Ix1;}
				if(variable.contains("x2")){Ix2 = integers(val1)+integers(val2);x2 = ""+Ix2;}if(variable.contains("x3")){Ix3 = integers(val1)+integers(val2);x3 = ""+Ix3;}
				if(variable.contains("x4")){Ix4 = integers(val1)+integers(val2);x4 = ""+Ix4;}if(variable.contains("x5")){Ix5 = integers(val1)+integers(val2);x5 = ""+Ix5;}
				if(variable.contains("x6")){Ix6 = integers(val1)+integers(val2);x6 = ""+Ix6;}if(variable.contains("x7")){Ix7 = integers(val1)+integers(val2);x7 = ""+Ix7;}
				if(variable.contains("x8")){Ix8 = integers(val1)+integers(val2);x8 = ""+Ix8;}if(variable.contains("x9")){Ix9 = integers(val1)+integers(val2);x9 = ""+Ix9;}
			
				if(variable.contains("y0")){Iy0 = integers(val1)+integers(val2);y0 = ""+Iy0;}if(variable.contains("y1")){Iy1 = integers(val1)+integers(val2);y1 = ""+Iy1;}
				if(variable.contains("y2")){Iy2 = integers(val1)+integers(val2);y2 = ""+Iy2;}if(variable.contains("y3")){Iy3 = integers(val1)+integers(val2);y3 = ""+Iy3;}
				if(variable.contains("y4")){Iy4 = integers(val1)+integers(val2);y4 = ""+Iy4;}if(variable.contains("y5")){Iy5 = integers(val1)+integers(val2);y5 = ""+Iy5;}
				if(variable.contains("y6")){Iy6 = integers(val1)+integers(val2);y6 = ""+Iy6;}if(variable.contains("y7")){Iy7 = integers(val1)+integers(val2);y7 = ""+Iy7;}
				if(variable.contains("y8")){Iy8 = integers(val1)+integers(val2);y8 = ""+Iy8;}if(variable.contains("y9")){Iy9 = integers(val1)+integers(val2);y9 = ""+Iy9;}
				
				if(variable.contains("z0")){Iz0 = integers(val1)+integers(val2);z0 = ""+Iz0;}if(variable.contains("z1")){Iz1 = integers(val1)+integers(val2);z1 = ""+Iz1;}
				if(variable.contains("z2")){Iz2 = integers(val1)+integers(val2);z2 = ""+Iz2;}if(variable.contains("z3")){Iz3 = integers(val1)+integers(val2);z3 = ""+Iz3;}
				if(variable.contains("z4")){Iz4 = integers(val1)+integers(val2);z4 = ""+Iz4;}if(variable.contains("z5")){Iz5 = integers(val1)+integers(val2);z5 = ""+Iz5;}
				if(variable.contains("z6")){Iz6 = integers(val1)+integers(val2);z6 = ""+Iz6;}if(variable.contains("z7")){Iz7 = integers(val1)+integers(val2);z7 = ""+Iz7;}
				if(variable.contains("z8")){Iz8 = integers(val1)+integers(val2);z8 = ""+Iz8;}if(variable.contains("z9")){Iz9 = integers(val1)+integers(val2);z9 = ""+Iz9;}
				
			}
			
			//Metodo de subtração de inteiros em variáveis
			public static void subtractionVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("-"));
				val2 = valOp.substring(valOp.indexOf("-")+1, valOp.lastIndexOf("]"));
				
				firstValueVar();
				secondValueVar();
				
				if(variable.contains("a0")){Ia0 = integers(val1)-integers(val2);a0 = ""+Ia0;}if(variable.contains("a1")){Ia1 = integers(val1)-integers(val2);a1 = ""+Ia1;}
				if(variable.contains("a2")){Ia2 = integers(val1)-integers(val2);a2 = ""+Ia2;}if(variable.contains("a3")){Ia3 = integers(val1)-integers(val2);a3 = ""+Ia3;}
				if(variable.contains("a4")){Ia4 = integers(val1)-integers(val2);a4 = ""+Ia4;}if(variable.contains("a5")){Ia5 = integers(val1)-integers(val2);a5 = ""+Ia5;}
				if(variable.contains("a6")){Ia6 = integers(val1)-integers(val2);a6 = ""+Ia6;}if(variable.contains("a7")){Ia7 = integers(val1)-integers(val2);a7 = ""+Ia7;}
				if(variable.contains("a8")){Ia8 = integers(val1)-integers(val2);a8 = ""+Ia8;}if(variable.contains("a9")){Ia9 = integers(val1)-integers(val2);a9 = ""+Ia9;}
			
				if(variable.contains("b0")){Ib0 = integers(val1)-integers(val2);b0 = ""+Ib0;}if(variable.contains("b1")){Ib1 = integers(val1)-integers(val2);b1 = ""+Ib1;}
				if(variable.contains("b2")){Ib2 = integers(val1)-integers(val2);b2 = ""+Ib2;}if(variable.contains("b3")){Ib3 = integers(val1)-integers(val2);b3 = ""+Ib3;}
				if(variable.contains("b4")){Ib4 = integers(val1)-integers(val2);b4 = ""+Ib4;}if(variable.contains("b5")){Ib5 = integers(val1)-integers(val2);b5 = ""+Ib5;}
				if(variable.contains("b6")){Ib6 = integers(val1)-integers(val2);b6 = ""+Ib6;}if(variable.contains("b7")){Ib7 = integers(val1)-integers(val2);b7 = ""+Ib7;}
				if(variable.contains("b8")){Ib8 = integers(val1)-integers(val2);b8 = ""+Ib8;}if(variable.contains("b9")){Ib9 = integers(val1)-integers(val2);b9 = ""+Ib9;}
			
				if(variable.contains("c0")){Ic0 = integers(val1)-integers(val2);c0 = ""+Ic0;}if(variable.contains("c1")){Ic1 = integers(val1)-integers(val2);c1 = ""+Ic1;}
				if(variable.contains("c2")){Ic2 = integers(val1)-integers(val2);c2 = ""+Ic2;}if(variable.contains("c3")){Ic3 = integers(val1)-integers(val2);c3 = ""+Ic3;}
				if(variable.contains("c4")){Ic4 = integers(val1)-integers(val2);c4 = ""+Ic4;}if(variable.contains("c5")){Ic5 = integers(val1)-integers(val2);c5 = ""+Ic5;}
				if(variable.contains("c6")){Ic6 = integers(val1)-integers(val2);c6 = ""+Ic6;}if(variable.contains("c7")){Ic7 = integers(val1)-integers(val2);c7 = ""+Ic7;}
				if(variable.contains("c8")){Ic8 = integers(val1)-integers(val2);c8 = ""+Ic8;}if(variable.contains("c9")){Ic9 = integers(val1)-integers(val2);c9 = ""+Ic9;}
				
				if(variable.contains("d0")){Id0 = integers(val1)-integers(val2);d0 = ""+Id0;}if(variable.contains("d1")){Id1 = integers(val1)-integers(val2);d1 = ""+Id1;}
				if(variable.contains("d2")){Id2 = integers(val1)-integers(val2);d2 = ""+Id2;}if(variable.contains("d3")){Id3 = integers(val1)-integers(val2);d3 = ""+Id3;}
				if(variable.contains("d4")){Id4 = integers(val1)-integers(val2);d4 = ""+Id4;}if(variable.contains("d5")){Id5 = integers(val1)-integers(val2);d5 = ""+Id5;}
				if(variable.contains("d6")){Id6 = integers(val1)-integers(val2);d6 = ""+Id6;}if(variable.contains("d7")){Id7 = integers(val1)-integers(val2);d7 = ""+Id7;}
				if(variable.contains("d8")){Id8 = integers(val1)-integers(val2);d8 = ""+Id8;}if(variable.contains("d9")){Id9 = integers(val1)-integers(val2);d9 = ""+Id9;}
				
				if(variable.contains("e0")){Ie0 = integers(val1)-integers(val2);a0 = ""+Ie0;}if(variable.contains("e1")){Ie1 = integers(val1)-integers(val2);e1 = ""+Ie1;}
				if(variable.contains("e2")){Ie2 = integers(val1)-integers(val2);e2 = ""+Ie2;}if(variable.contains("e3")){Ie3 = integers(val1)-integers(val2);e3 = ""+Ie3;}
				if(variable.contains("e4")){Ie4 = integers(val1)-integers(val2);e4 = ""+Ie4;}if(variable.contains("e5")){Ie5 = integers(val1)-integers(val2);e5 = ""+Ie5;}
				if(variable.contains("e6")){Ie6 = integers(val1)-integers(val2);e6 = ""+Ie6;}if(variable.contains("e7")){Ie7 = integers(val1)-integers(val2);e7 = ""+Ie7;}
				if(variable.contains("e8")){Ie8 = integers(val1)-integers(val2);e8 = ""+Ie8;}if(variable.contains("e9")){Ie9 = integers(val1)-integers(val2);e9 = ""+Ie9;}
			
				if(variable.contains("f0")){If0 = integers(val1)-integers(val2);a0 = ""+If0;}if(variable.contains("f1")){If1 = integers(val1)-integers(val2);f1 = ""+If1;}
				if(variable.contains("f2")){If2 = integers(val1)-integers(val2);f2 = ""+If2;}if(variable.contains("f3")){If3 = integers(val1)-integers(val2);f3 = ""+If3;}
				if(variable.contains("f4")){If4 = integers(val1)-integers(val2);f4 = ""+If4;}if(variable.contains("f5")){If5 = integers(val1)-integers(val2);f5 = ""+If5;}
				if(variable.contains("f6")){If6 = integers(val1)-integers(val2);f6 = ""+If6;}if(variable.contains("f7")){If7 = integers(val1)-integers(val2);f7 = ""+If7;}
				if(variable.contains("f8")){If8 = integers(val1)-integers(val2);f8 = ""+If8;}if(variable.contains("f9")){If9 = integers(val1)-integers(val2);f9 = ""+If9;}
			
				if(variable.contains("g0")){Ig0 = integers(val1)-integers(val2);g0 = ""+Ig0;}if(variable.contains("g1")){Ig1 = integers(val1)-integers(val2);g1 = ""+Ig1;}
				if(variable.contains("g2")){Ig2 = integers(val1)-integers(val2);g2 = ""+Ig2;}if(variable.contains("g3")){Ig3 = integers(val1)-integers(val2);g3 = ""+Ig3;}
				if(variable.contains("g4")){Ig4 = integers(val1)-integers(val2);g4 = ""+Ig4;}if(variable.contains("g5")){Ig5 = integers(val1)-integers(val2);g5 = ""+Ig5;}
				if(variable.contains("g6")){Ig6 = integers(val1)-integers(val2);g6 = ""+Ig6;}if(variable.contains("g7")){Ig7 = integers(val1)-integers(val2);g7 = ""+Ig7;}
				if(variable.contains("g8")){Ig8 = integers(val1)-integers(val2);g8 = ""+Ig8;}if(variable.contains("g9")){Ig9 = integers(val1)-integers(val2);g9 = ""+Ig9;}
			
				if(variable.contains("h0")){Ih0 = integers(val1)-integers(val2);h0 = ""+Ih0;}if(variable.contains("h1")){Ih1 = integers(val1)-integers(val2);h1 = ""+Ih1;}
				if(variable.contains("h2")){Ih2 = integers(val1)-integers(val2);h2 = ""+Ih2;}if(variable.contains("h3")){Ih3 = integers(val1)-integers(val2);h3 = ""+Ih3;}
				if(variable.contains("h4")){Ih4 = integers(val1)-integers(val2);h4 = ""+Ih4;}if(variable.contains("h5")){Ih5 = integers(val1)-integers(val2);h5 = ""+Ih5;}
				if(variable.contains("h6")){Ih6 = integers(val1)-integers(val2);h6 = ""+Ih6;}if(variable.contains("h7")){Ih7 = integers(val1)-integers(val2);h7 = ""+Ih7;}
				if(variable.contains("h8")){Ih8 = integers(val1)-integers(val2);h8 = ""+Ih8;}if(variable.contains("h9")){Ih9 = integers(val1)-integers(val2);h9 = ""+Ih9;}
				
				if(variable.contains("i0")){Ii0 = integers(val1)-integers(val2);i0 = ""+Ii0;}if(variable.contains("i1")){Ii1 = integers(val1)-integers(val2);i1 = ""+Ii1;}
				if(variable.contains("i2")){Ii2 = integers(val1)-integers(val2);i2 = ""+Ii2;}if(variable.contains("i3")){Ii3 = integers(val1)-integers(val2);i3 = ""+Ii3;}
				if(variable.contains("i4")){Ii4 = integers(val1)-integers(val2);i4 = ""+Ii4;}if(variable.contains("i5")){Ii5 = integers(val1)-integers(val2);i5 = ""+Ii5;}
				if(variable.contains("i6")){Ii6 = integers(val1)-integers(val2);i6 = ""+Ii6;}if(variable.contains("i7")){Ii7 = integers(val1)-integers(val2);i7 = ""+Ii7;}
				if(variable.contains("i8")){Ii8 = integers(val1)-integers(val2);i8 = ""+Ii8;}if(variable.contains("i9")){Ii9 = integers(val1)-integers(val2);i9 = ""+Ii9;}
				
				if(variable.contains("j0")){Ij0 = integers(val1)-integers(val2);j0 = ""+Ij0;}if(variable.contains("j1")){Ij1 = integers(val1)-integers(val2);j1 = ""+Ij1;}
				if(variable.contains("j2")){Ij2 = integers(val1)-integers(val2);j2 = ""+Ij2;}if(variable.contains("j3")){Ij3 = integers(val1)-integers(val2);j3 = ""+Ij3;}
				if(variable.contains("j4")){Ij4 = integers(val1)-integers(val2);j4 = ""+Ij4;}if(variable.contains("j5")){Ij5 = integers(val1)-integers(val2);j5 = ""+Ij5;}
				if(variable.contains("j6")){Ij6 = integers(val1)-integers(val2);j6 = ""+Ij6;}if(variable.contains("j7")){Ij7 = integers(val1)-integers(val2);j7 = ""+Ij7;}
				if(variable.contains("j8")){Ij8 = integers(val1)-integers(val2);j8 = ""+Ij8;}if(variable.contains("j9")){Ij9 = integers(val1)-integers(val2);j9 = ""+Ij9;}
				
				if(variable.contains("k0")){Ik0 = integers(val1)-integers(val2);k0 = ""+Ik0;}if(variable.contains("k1")){Ik1 = integers(val1)-integers(val2);k1 = ""+Ik1;}
				if(variable.contains("k2")){Ik2 = integers(val1)-integers(val2);k2 = ""+Ik2;}if(variable.contains("k3")){Ik3 = integers(val1)-integers(val2);k3 = ""+Ik3;}
				if(variable.contains("k4")){Ik4 = integers(val1)-integers(val2);k4 = ""+Ik4;}if(variable.contains("k5")){Ik5 = integers(val1)-integers(val2);k5 = ""+Ik5;}
				if(variable.contains("k6")){Ik6 = integers(val1)-integers(val2);k6 = ""+Ik6;}if(variable.contains("k7")){Ik7 = integers(val1)-integers(val2);k7 = ""+Ik7;}
				if(variable.contains("k8")){Ik8 = integers(val1)-integers(val2);k8 = ""+Ik8;}if(variable.contains("k9")){Ik9 = integers(val1)-integers(val2);k9 = ""+Ik9;}
		
				if(variable.contains("l0")){Il0 = integers(val1)-integers(val2);l0 = ""+Il0;}if(variable.contains("l1")){Il1 = integers(val1)-integers(val2);l1 = ""+Il1;}
				if(variable.contains("l2")){Il2 = integers(val1)-integers(val2);l2 = ""+Il2;}if(variable.contains("l3")){Il3 = integers(val1)-integers(val2);l3 = ""+Il3;}
				if(variable.contains("l4")){Il4 = integers(val1)-integers(val2);l4 = ""+Il4;}if(variable.contains("l5")){Il5 = integers(val1)-integers(val2);l5 = ""+Il5;}
				if(variable.contains("l6")){Il6 = integers(val1)-integers(val2);l6 = ""+Il6;}if(variable.contains("l7")){Il7 = integers(val1)-integers(val2);l7 = ""+Il7;}
				if(variable.contains("l8")){Il8 = integers(val1)-integers(val2);l8 = ""+Il8;}if(variable.contains("l9")){Il9 = integers(val1)-integers(val2);l9 = ""+Il9;}
				
				if(variable.contains("m0")){Im0 = integers(val1)-integers(val2);m0 = ""+Im0;}if(variable.contains("m1")){Im1 = integers(val1)-integers(val2);m1 = ""+Im1;}
				if(variable.contains("m2")){Im2 = integers(val1)-integers(val2);m2 = ""+Im2;}if(variable.contains("m3")){Im3 = integers(val1)-integers(val2);m3 = ""+Im3;}
				if(variable.contains("m4")){Im4 = integers(val1)-integers(val2);m4 = ""+Im4;}if(variable.contains("m5")){Im5 = integers(val1)-integers(val2);m5 = ""+Im5;}
				if(variable.contains("m6")){Im6 = integers(val1)-integers(val2);m6 = ""+Im6;}if(variable.contains("m7")){Im7 = integers(val1)-integers(val2);m7 = ""+Im7;}
				if(variable.contains("m8")){Im8 = integers(val1)-integers(val2);m8 = ""+Im8;}if(variable.contains("m9")){Im9 = integers(val1)-integers(val2);m9 = ""+Im9;}
			
				if(variable.contains("n0")){In0 = integers(val1)-integers(val2);n0 = ""+In0;}if(variable.contains("n1")){In1 = integers(val1)-integers(val2);n1 = ""+In1;}
				if(variable.contains("n2")){In2 = integers(val1)-integers(val2);n2 = ""+In2;}if(variable.contains("n3")){In3 = integers(val1)-integers(val2);n3 = ""+In3;}
				if(variable.contains("n4")){In4 = integers(val1)-integers(val2);n4 = ""+In4;}if(variable.contains("n5")){In5 = integers(val1)-integers(val2);n5 = ""+In5;}
				if(variable.contains("n6")){In6 = integers(val1)-integers(val2);n6 = ""+In6;}if(variable.contains("n7")){In7 = integers(val1)-integers(val2);n7 = ""+In7;}
				if(variable.contains("n8")){In8 = integers(val1)-integers(val2);n8 = ""+In8;}if(variable.contains("n9")){In9 = integers(val1)-integers(val2);n9 = ""+In9;}
				
				if(variable.contains("o0")){Io0 = integers(val1)-integers(val2);o0 = ""+Io0;}if(variable.contains("o1")){Io1 = integers(val1)-integers(val2);o1 = ""+Io1;}
				if(variable.contains("o2")){Io2 = integers(val1)-integers(val2);o2 = ""+Io2;}if(variable.contains("o3")){Io3 = integers(val1)-integers(val2);o3 = ""+Io3;}
				if(variable.contains("o4")){Io4 = integers(val1)-integers(val2);o4 = ""+Io4;}if(variable.contains("o5")){Io5 = integers(val1)-integers(val2);o5 = ""+Io5;}
				if(variable.contains("o6")){Io6 = integers(val1)-integers(val2);o6 = ""+Io6;}if(variable.contains("o7")){Io7 = integers(val1)-integers(val2);o7 = ""+Io7;}
				if(variable.contains("o8")){Io8 = integers(val1)-integers(val2);o8 = ""+Io8;}if(variable.contains("o9")){Io9 = integers(val1)-integers(val2);o9 = ""+Io9;}
				
				if(variable.contains("p0")){Ip0 = integers(val1)-integers(val2);p0 = ""+Ip0;}if(variable.contains("p1")){Ip1 = integers(val1)-integers(val2);p1 = ""+Ip1;}
				if(variable.contains("p2")){Ip2 = integers(val1)-integers(val2);p2 = ""+Ip2;}if(variable.contains("p3")){Ip3 = integers(val1)-integers(val2);p3 = ""+Ip3;}
				if(variable.contains("p4")){Ip4 = integers(val1)-integers(val2);p4 = ""+Ip4;}if(variable.contains("p5")){Ip5 = integers(val1)-integers(val2);p5 = ""+Ip5;}
				if(variable.contains("p6")){Ip6 = integers(val1)-integers(val2);p6 = ""+Ip6;}if(variable.contains("p7")){Ip7 = integers(val1)-integers(val2);p7 = ""+Ip7;}
				if(variable.contains("p8")){Ip8 = integers(val1)-integers(val2);p8 = ""+Ip8;}if(variable.contains("p9")){Ip9 = integers(val1)-integers(val2);p9 = ""+Ip9;}
				
				if(variable.contains("q0")){Iq0 = integers(val1)-integers(val2);q0 = ""+Iq0;}if(variable.contains("q1")){Iq1 = integers(val1)-integers(val2);q1 = ""+Iq1;}
				if(variable.contains("q2")){Iq2 = integers(val1)-integers(val2);q2 = ""+Iq2;}if(variable.contains("q3")){Iq3 = integers(val1)-integers(val2);q3 = ""+Iq3;}
				if(variable.contains("q4")){Iq4 = integers(val1)-integers(val2);q4 = ""+Iq4;}if(variable.contains("q5")){Iq5 = integers(val1)-integers(val2);q5 = ""+Iq5;}
				if(variable.contains("q6")){Iq6 = integers(val1)-integers(val2);q6 = ""+Iq6;}if(variable.contains("q7")){Iq7 = integers(val1)-integers(val2);q7 = ""+Iq7;}
				if(variable.contains("q8")){Iq8 = integers(val1)-integers(val2);q8 = ""+Iq8;}if(variable.contains("q9")){Iq9 = integers(val1)-integers(val2);q9 = ""+Iq9;}
				
				if(variable.contains("r0")){Ir0 = integers(val1)-integers(val2);r0 = ""+Ir0;}if(variable.contains("r1")){Ir1 = integers(val1)-integers(val2);r1 = ""+Ir1;}
				if(variable.contains("r2")){Ir2 = integers(val1)-integers(val2);r2 = ""+Ir2;}if(variable.contains("r3")){Ir3 = integers(val1)-integers(val2);r3 = ""+Ir3;}
				if(variable.contains("r4")){Ir4 = integers(val1)-integers(val2);r4 = ""+Ir4;}if(variable.contains("r5")){Ir5 = integers(val1)-integers(val2);r5 = ""+Ir5;}
				if(variable.contains("r6")){Ir6 = integers(val1)-integers(val2);r6 = ""+Ir6;}if(variable.contains("r7")){Ir7 = integers(val1)-integers(val2);r7 = ""+Ir7;}
				if(variable.contains("r8")){Ir8 = integers(val1)-integers(val2);r8 = ""+Ir8;}if(variable.contains("r9")){Ir9 = integers(val1)-integers(val2);r9 = ""+Ir9;}
				
				if(variable.contains("s0")){Is0 = integers(val1)-integers(val2);s0 = ""+Is0;}if(variable.contains("s1")){Is1 = integers(val1)-integers(val2);s1 = ""+Is1;}
				if(variable.contains("s2")){Is2 = integers(val1)-integers(val2);s2 = ""+Is2;}if(variable.contains("s3")){Is3 = integers(val1)-integers(val2);s3 = ""+Is3;}
				if(variable.contains("s4")){Is4 = integers(val1)-integers(val2);s4 = ""+Is4;}if(variable.contains("s5")){Is5 = integers(val1)-integers(val2);s5 = ""+Is5;}
				if(variable.contains("s6")){Is6 = integers(val1)-integers(val2);s6 = ""+Is6;}if(variable.contains("s7")){Is7 = integers(val1)-integers(val2);s7 = ""+Is7;}
				if(variable.contains("s8")){Is8 = integers(val1)-integers(val2);s8 = ""+Is8;}if(variable.contains("s9")){Is9 = integers(val1)-integers(val2);s9 = ""+Is9;}
			
				if(variable.contains("t0")){It0 = integers(val1)-integers(val2);t0 = ""+It0;}if(variable.contains("t1")){It1 = integers(val1)-integers(val2);t1 = ""+It1;}
				if(variable.contains("t2")){It2 = integers(val1)-integers(val2);t2 = ""+It2;}if(variable.contains("t3")){It3 = integers(val1)-integers(val2);t3 = ""+It3;}
				if(variable.contains("t4")){It4 = integers(val1)-integers(val2);t4 = ""+It4;}if(variable.contains("t5")){It5 = integers(val1)-integers(val2);t5 = ""+It5;}
				if(variable.contains("t6")){It6 = integers(val1)-integers(val2);t6 = ""+It6;}if(variable.contains("t7")){It7 = integers(val1)-integers(val2);t7 = ""+It7;}
				if(variable.contains("t8")){It8 = integers(val1)-integers(val2);t8 = ""+It8;}if(variable.contains("t9")){It9 = integers(val1)-integers(val2);t9 = ""+It9;}
			
				if(variable.contains("u0")){Iu0 = integers(val1)-integers(val2);u0 = ""+Iu0;}if(variable.contains("u1")){Iu1 = integers(val1)-integers(val2);u1 = ""+Iu1;}
				if(variable.contains("u2")){Iu2 = integers(val1)-integers(val2);u2 = ""+Iu2;}if(variable.contains("u3")){Iu3 = integers(val1)-integers(val2);u3 = ""+Iu3;}
				if(variable.contains("u4")){Iu4 = integers(val1)-integers(val2);u4 = ""+Iu4;}if(variable.contains("u5")){Iu5 = integers(val1)-integers(val2);u5 = ""+Iu5;}
				if(variable.contains("u6")){Iu6 = integers(val1)-integers(val2);u6 = ""+Iu6;}if(variable.contains("u7")){Iu7 = integers(val1)-integers(val2);u7 = ""+Iu7;}
				if(variable.contains("u8")){Iu8 = integers(val1)-integers(val2);u8 = ""+Iu8;}if(variable.contains("u9")){Iu9 = integers(val1)-integers(val2);u9 = ""+Iu9;}
				
				if(variable.contains("v0")){Iv0 = integers(val1)-integers(val2);v0 = ""+Iv0;}if(variable.contains("v1")){Iv1 = integers(val1)-integers(val2);v1 = ""+Iv1;}
				if(variable.contains("v2")){Iv2 = integers(val1)-integers(val2);v2 = ""+Iv2;}if(variable.contains("v3")){Iv3 = integers(val1)-integers(val2);v3 = ""+Iv3;}
				if(variable.contains("v4")){Iv4 = integers(val1)-integers(val2);v4 = ""+Iv4;}if(variable.contains("v5")){Iv5 = integers(val1)-integers(val2);v5 = ""+Iv5;}
				if(variable.contains("v6")){Iv6 = integers(val1)-integers(val2);v6 = ""+Iv6;}if(variable.contains("v7")){Iv7 = integers(val1)-integers(val2);v7 = ""+Iv7;}
				if(variable.contains("v8")){Iv8 = integers(val1)-integers(val2);v8 = ""+Iv8;}if(variable.contains("v9")){Iv9 = integers(val1)-integers(val2);v9 = ""+Iv9;}
				
				if(variable.contains("w0")){Iw0 = integers(val1)-integers(val2);w0 = ""+Iw0;}if(variable.contains("w1")){Iw1 = integers(val1)-integers(val2);w1 = ""+Iw1;}
				if(variable.contains("w2")){Iw2 = integers(val1)-integers(val2);w2 = ""+Iw2;}if(variable.contains("w3")){Iw3 = integers(val1)-integers(val2);w3 = ""+Iw3;}
				if(variable.contains("w4")){Iw4 = integers(val1)-integers(val2);w4 = ""+Iw4;}if(variable.contains("w5")){Iw5 = integers(val1)-integers(val2);w5 = ""+Iw5;}
				if(variable.contains("w6")){Iw6 = integers(val1)-integers(val2);w6 = ""+Iw6;}if(variable.contains("w7")){Iw7 = integers(val1)-integers(val2);w7 = ""+Iw7;}
				if(variable.contains("w8")){Iw8 = integers(val1)-integers(val2);w8 = ""+Iw8;}if(variable.contains("w9")){Iw9 = integers(val1)-integers(val2);w9 = ""+Iw9;}
			
				if(variable.contains("x0")){Ix0 = integers(val1)-integers(val2);x0 = ""+Ix0;}if(variable.contains("x1")){Ix1 = integers(val1)-integers(val2);x1 = ""+Ix1;}
				if(variable.contains("x2")){Ix2 = integers(val1)-integers(val2);x2 = ""+Ix2;}if(variable.contains("x3")){Ix3 = integers(val1)-integers(val2);x3 = ""+Ix3;}
				if(variable.contains("x4")){Ix4 = integers(val1)-integers(val2);x4 = ""+Ix4;}if(variable.contains("x5")){Ix5 = integers(val1)-integers(val2);x5 = ""+Ix5;}
				if(variable.contains("x6")){Ix6 = integers(val1)-integers(val2);x6 = ""+Ix6;}if(variable.contains("x7")){Ix7 = integers(val1)-integers(val2);x7 = ""+Ix7;}
				if(variable.contains("x8")){Ix8 = integers(val1)-integers(val2);x8 = ""+Ix8;}if(variable.contains("x9")){Ix9 = integers(val1)-integers(val2);x9 = ""+Ix9;}
			
				if(variable.contains("y0")){Iy0 = integers(val1)-integers(val2);y0 = ""+Iy0;}if(variable.contains("y1")){Iy1 = integers(val1)-integers(val2);y1 = ""+Iy1;}
				if(variable.contains("y2")){Iy2 = integers(val1)-integers(val2);y2 = ""+Iy2;}if(variable.contains("y3")){Iy3 = integers(val1)-integers(val2);y3 = ""+Iy3;}
				if(variable.contains("y4")){Iy4 = integers(val1)-integers(val2);y4 = ""+Iy4;}if(variable.contains("y5")){Iy5 = integers(val1)-integers(val2);y5 = ""+Iy5;}
				if(variable.contains("y6")){Iy6 = integers(val1)-integers(val2);y6 = ""+Iy6;}if(variable.contains("y7")){Iy7 = integers(val1)-integers(val2);y7 = ""+Iy7;}
				if(variable.contains("y8")){Iy8 = integers(val1)-integers(val2);y8 = ""+Iy8;}if(variable.contains("y9")){Iy9 = integers(val1)-integers(val2);y9 = ""+Iy9;}
				
				if(variable.contains("z0")){Iz0 = integers(val1)-integers(val2);z0 = ""+Iz0;}if(variable.contains("z1")){Iz1 = integers(val1)-integers(val2);z1 = ""+Iz1;}
				if(variable.contains("z2")){Iz2 = integers(val1)-integers(val2);z2 = ""+Iz2;}if(variable.contains("z3")){Iz3 = integers(val1)-integers(val2);z3 = ""+Iz3;}
				if(variable.contains("z4")){Iz4 = integers(val1)-integers(val2);z4 = ""+Iz4;}if(variable.contains("z5")){Iz5 = integers(val1)-integers(val2);z5 = ""+Iz5;}
				if(variable.contains("z6")){Iz6 = integers(val1)-integers(val2);z6 = ""+Iz6;}if(variable.contains("z7")){Iz7 = integers(val1)-integers(val2);z7 = ""+Iz7;}
				if(variable.contains("z8")){Iz8 = integers(val1)-integers(val2);z8 = ""+Iz8;}if(variable.contains("z9")){Iz9 = integers(val1)-integers(val2);z9 = ""+Iz9;}
			}
			
			//Metodo de multiplicação de inteiros em variáveis
			public static void multiVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("*"));
				val2 = valOp.substring(valOp.indexOf("*")+1, valOp.lastIndexOf("]"));
				
				firstValueVar();
				secondValueVar();
				
				if(variable.contains("a0")){Ia0 = integers(val1)*integers(val2);a0 = ""+Ia0;}if(variable.contains("a1")){Ia1 = integers(val1)*integers(val2);a1 = ""+Ia1;}
				if(variable.contains("a2")){Ia2 = integers(val1)*integers(val2);a2 = ""+Ia2;}if(variable.contains("a3")){Ia3 = integers(val1)*integers(val2);a3 = ""+Ia3;}
				if(variable.contains("a4")){Ia4 = integers(val1)*integers(val2);a4 = ""+Ia4;}if(variable.contains("a5")){Ia5 = integers(val1)*integers(val2);a5 = ""+Ia5;}
				if(variable.contains("a6")){Ia6 = integers(val1)*integers(val2);a6 = ""+Ia6;}if(variable.contains("a7")){Ia7 = integers(val1)*integers(val2);a7 = ""+Ia7;}
				if(variable.contains("a8")){Ia8 = integers(val1)*integers(val2);a8 = ""+Ia8;}if(variable.contains("a9")){Ia9 = integers(val1)*integers(val2);a9 = ""+Ia9;}
			
				if(variable.contains("b0")){Ib0 = integers(val1)*integers(val2);b0 = ""+Ib0;}if(variable.contains("b1")){Ib1 = integers(val1)*integers(val2);b1 = ""+Ib1;}
				if(variable.contains("b2")){Ib2 = integers(val1)*integers(val2);b2 = ""+Ib2;}if(variable.contains("b3")){Ib3 = integers(val1)*integers(val2);b3 = ""+Ib3;}
				if(variable.contains("b4")){Ib4 = integers(val1)*integers(val2);b4 = ""+Ib4;}if(variable.contains("b5")){Ib5 = integers(val1)*integers(val2);b5 = ""+Ib5;}
				if(variable.contains("b6")){Ib6 = integers(val1)*integers(val2);b6 = ""+Ib6;}if(variable.contains("b7")){Ib7 = integers(val1)*integers(val2);b7 = ""+Ib7;}
				if(variable.contains("b8")){Ib8 = integers(val1)*integers(val2);b8 = ""+Ib8;}if(variable.contains("b9")){Ib9 = integers(val1)*integers(val2);b9 = ""+Ib9;}
			
				if(variable.contains("c0")){Ic0 = integers(val1)*integers(val2);c0 = ""+Ic0;}if(variable.contains("c1")){Ic1 = integers(val1)*integers(val2);c1 = ""+Ic1;}
				if(variable.contains("c2")){Ic2 = integers(val1)*integers(val2);c2 = ""+Ic2;}if(variable.contains("c3")){Ic3 = integers(val1)*integers(val2);c3 = ""+Ic3;}
				if(variable.contains("c4")){Ic4 = integers(val1)*integers(val2);c4 = ""+Ic4;}if(variable.contains("c5")){Ic5 = integers(val1)*integers(val2);c5 = ""+Ic5;}
				if(variable.contains("c6")){Ic6 = integers(val1)*integers(val2);c6 = ""+Ic6;}if(variable.contains("c7")){Ic7 = integers(val1)*integers(val2);c7 = ""+Ic7;}
				if(variable.contains("c8")){Ic8 = integers(val1)*integers(val2);c8 = ""+Ic8;}if(variable.contains("c9")){Ic9 = integers(val1)*integers(val2);c9 = ""+Ic9;}
				
				if(variable.contains("d0")){Id0 = integers(val1)*integers(val2);d0 = ""+Id0;}if(variable.contains("d1")){Id1 = integers(val1)*integers(val2);d1 = ""+Id1;}
				if(variable.contains("d2")){Id2 = integers(val1)*integers(val2);d2 = ""+Id2;}if(variable.contains("d3")){Id3 = integers(val1)*integers(val2);d3 = ""+Id3;}
				if(variable.contains("d4")){Id4 = integers(val1)*integers(val2);d4 = ""+Id4;}if(variable.contains("d5")){Id5 = integers(val1)*integers(val2);d5 = ""+Id5;}
				if(variable.contains("d6")){Id6 = integers(val1)*integers(val2);d6 = ""+Id6;}if(variable.contains("d7")){Id7 = integers(val1)*integers(val2);d7 = ""+Id7;}
				if(variable.contains("d8")){Id8 = integers(val1)*integers(val2);d8 = ""+Id8;}if(variable.contains("d9")){Id9 = integers(val1)*integers(val2);d9 = ""+Id9;}
				
				if(variable.contains("e0")){Ie0 = integers(val1)*integers(val2);a0 = ""+Ie0;}if(variable.contains("e1")){Ie1 = integers(val1)*integers(val2);e1 = ""+Ie1;}
				if(variable.contains("e2")){Ie2 = integers(val1)*integers(val2);e2 = ""+Ie2;}if(variable.contains("e3")){Ie3 = integers(val1)*integers(val2);e3 = ""+Ie3;}
				if(variable.contains("e4")){Ie4 = integers(val1)*integers(val2);e4 = ""+Ie4;}if(variable.contains("e5")){Ie5 = integers(val1)*integers(val2);e5 = ""+Ie5;}
				if(variable.contains("e6")){Ie6 = integers(val1)*integers(val2);e6 = ""+Ie6;}if(variable.contains("e7")){Ie7 = integers(val1)*integers(val2);e7 = ""+Ie7;}
				if(variable.contains("e8")){Ie8 = integers(val1)*integers(val2);e8 = ""+Ie8;}if(variable.contains("e9")){Ie9 = integers(val1)*integers(val2);e9 = ""+Ie9;}
			
				if(variable.contains("f0")){If0 = integers(val1)*integers(val2);a0 = ""+If0;}if(variable.contains("f1")){If1 = integers(val1)*integers(val2);f1 = ""+If1;}
				if(variable.contains("f2")){If2 = integers(val1)*integers(val2);f2 = ""+If2;}if(variable.contains("f3")){If3 = integers(val1)*integers(val2);f3 = ""+If3;}
				if(variable.contains("f4")){If4 = integers(val1)*integers(val2);f4 = ""+If4;}if(variable.contains("f5")){If5 = integers(val1)*integers(val2);f5 = ""+If5;}
				if(variable.contains("f6")){If6 = integers(val1)*integers(val2);f6 = ""+If6;}if(variable.contains("f7")){If7 = integers(val1)*integers(val2);f7 = ""+If7;}
				if(variable.contains("f8")){If8 = integers(val1)*integers(val2);f8 = ""+If8;}if(variable.contains("f9")){If9 = integers(val1)*integers(val2);f9 = ""+If9;}
			
				if(variable.contains("g0")){Ig0 = integers(val1)*integers(val2);g0 = ""+Ig0;}if(variable.contains("g1")){Ig1 = integers(val1)*integers(val2);g1 = ""+Ig1;}
				if(variable.contains("g2")){Ig2 = integers(val1)*integers(val2);g2 = ""+Ig2;}if(variable.contains("g3")){Ig3 = integers(val1)*integers(val2);g3 = ""+Ig3;}
				if(variable.contains("g4")){Ig4 = integers(val1)*integers(val2);g4 = ""+Ig4;}if(variable.contains("g5")){Ig5 = integers(val1)*integers(val2);g5 = ""+Ig5;}
				if(variable.contains("g6")){Ig6 = integers(val1)*integers(val2);g6 = ""+Ig6;}if(variable.contains("g7")){Ig7 = integers(val1)*integers(val2);g7 = ""+Ig7;}
				if(variable.contains("g8")){Ig8 = integers(val1)*integers(val2);g8 = ""+Ig8;}if(variable.contains("g9")){Ig9 = integers(val1)*integers(val2);g9 = ""+Ig9;}
		
				if(variable.contains("h0")){Ih0 = integers(val1)*integers(val2);h0 = ""+Ih0;}if(variable.contains("h1")){Ih1 = integers(val1)*integers(val2);h1 = ""+Ih1;}
				if(variable.contains("h2")){Ih2 = integers(val1)*integers(val2);h2 = ""+Ih2;}if(variable.contains("h3")){Ih3 = integers(val1)*integers(val2);h3 = ""+Ih3;}
				if(variable.contains("h4")){Ih4 = integers(val1)*integers(val2);h4 = ""+Ih4;}if(variable.contains("h5")){Ih5 = integers(val1)*integers(val2);h5 = ""+Ih5;}
				if(variable.contains("h6")){Ih6 = integers(val1)*integers(val2);h6 = ""+Ih6;}if(variable.contains("h7")){Ih7 = integers(val1)*integers(val2);h7 = ""+Ih7;}
				if(variable.contains("h8")){Ih8 = integers(val1)*integers(val2);h8 = ""+Ih8;}if(variable.contains("h9")){Ih9 = integers(val1)*integers(val2);h9 = ""+Ih9;}
				
				if(variable.contains("i0")){Ii0 = integers(val1)*integers(val2);i0 = ""+Ii0;}if(variable.contains("i1")){Ii1 = integers(val1)*integers(val2);i1 = ""+Ii1;}
				if(variable.contains("i2")){Ii2 = integers(val1)*integers(val2);i2 = ""+Ii2;}if(variable.contains("i3")){Ii3 = integers(val1)*integers(val2);i3 = ""+Ii3;}
				if(variable.contains("i4")){Ii4 = integers(val1)*integers(val2);i4 = ""+Ii4;}if(variable.contains("i5")){Ii5 = integers(val1)*integers(val2);i5 = ""+Ii5;}
				if(variable.contains("i6")){Ii6 = integers(val1)*integers(val2);i6 = ""+Ii6;}if(variable.contains("i7")){Ii7 = integers(val1)*integers(val2);i7 = ""+Ii7;}
				if(variable.contains("i8")){Ii8 = integers(val1)*integers(val2);i8 = ""+Ii8;}if(variable.contains("i9")){Ii9 = integers(val1)*integers(val2);i9 = ""+Ii9;}
				
				if(variable.contains("j0")){Ij0 = integers(val1)*integers(val2);j0 = ""+Ij0;}if(variable.contains("j1")){Ij1 = integers(val1)*integers(val2);j1 = ""+Ij1;}
				if(variable.contains("j2")){Ij2 = integers(val1)*integers(val2);j2 = ""+Ij2;}if(variable.contains("j3")){Ij3 = integers(val1)*integers(val2);j3 = ""+Ij3;}
				if(variable.contains("j4")){Ij4 = integers(val1)*integers(val2);j4 = ""+Ij4;}if(variable.contains("j5")){Ij5 = integers(val1)*integers(val2);j5 = ""+Ij5;}
				if(variable.contains("j6")){Ij6 = integers(val1)*integers(val2);j6 = ""+Ij6;}if(variable.contains("j7")){Ij7 = integers(val1)*integers(val2);j7 = ""+Ij7;}
				if(variable.contains("j8")){Ij8 = integers(val1)*integers(val2);j8 = ""+Ij8;}if(variable.contains("j9")){Ij9 = integers(val1)*integers(val2);j9 = ""+Ij9;}
				
				if(variable.contains("k0")){Ik0 = integers(val1)*integers(val2);k0 = ""+Ik0;}if(variable.contains("k1")){Ik1 = integers(val1)*integers(val2);k1 = ""+Ik1;}
				if(variable.contains("k2")){Ik2 = integers(val1)*integers(val2);k2 = ""+Ik2;}if(variable.contains("k3")){Ik3 = integers(val1)*integers(val2);k3 = ""+Ik3;}
				if(variable.contains("k4")){Ik4 = integers(val1)*integers(val2);k4 = ""+Ik4;}if(variable.contains("k5")){Ik5 = integers(val1)*integers(val2);k5 = ""+Ik5;}
				if(variable.contains("k6")){Ik6 = integers(val1)*integers(val2);k6 = ""+Ik6;}if(variable.contains("k7")){Ik7 = integers(val1)*integers(val2);k7 = ""+Ik7;}
				if(variable.contains("k8")){Ik8 = integers(val1)*integers(val2);k8 = ""+Ik8;}if(variable.contains("k9")){Ik9 = integers(val1)*integers(val2);k9 = ""+Ik9;}
		
				if(variable.contains("l0")){Il0 = integers(val1)*integers(val2);l0 = ""+Il0;}if(variable.contains("l1")){Il1 = integers(val1)*integers(val2);l1 = ""+Il1;}
				if(variable.contains("l2")){Il2 = integers(val1)*integers(val2);l2 = ""+Il2;}if(variable.contains("l3")){Il3 = integers(val1)*integers(val2);l3 = ""+Il3;}
				if(variable.contains("l4")){Il4 = integers(val1)*integers(val2);l4 = ""+Il4;}if(variable.contains("l5")){Il5 = integers(val1)*integers(val2);l5 = ""+Il5;}
				if(variable.contains("l6")){Il6 = integers(val1)*integers(val2);l6 = ""+Il6;}if(variable.contains("l7")){Il7 = integers(val1)*integers(val2);l7 = ""+Il7;}
				if(variable.contains("l8")){Il8 = integers(val1)*integers(val2);l8 = ""+Il8;}if(variable.contains("l9")){Il9 = integers(val1)*integers(val2);l9 = ""+Il9;}
			
				if(variable.contains("m0")){Im0 = integers(val1)*integers(val2);m0 = ""+Im0;}if(variable.contains("m1")){Im1 = integers(val1)*integers(val2);m1 = ""+Im1;}
				if(variable.contains("m2")){Im2 = integers(val1)*integers(val2);m2 = ""+Im2;}if(variable.contains("m3")){Im3 = integers(val1)*integers(val2);m3 = ""+Im3;}
				if(variable.contains("m4")){Im4 = integers(val1)*integers(val2);m4 = ""+Im4;}if(variable.contains("m5")){Im5 = integers(val1)*integers(val2);m5 = ""+Im5;}
				if(variable.contains("m6")){Im6 = integers(val1)*integers(val2);m6 = ""+Im6;}if(variable.contains("m7")){Im7 = integers(val1)*integers(val2);m7 = ""+Im7;}
				if(variable.contains("m8")){Im8 = integers(val1)*integers(val2);m8 = ""+Im8;}if(variable.contains("m9")){Im9 = integers(val1)*integers(val2);m9 = ""+Im9;}
			
				if(variable.contains("n0")){In0 = integers(val1)*integers(val2);n0 = ""+In0;}if(variable.contains("n1")){In1 = integers(val1)*integers(val2);n1 = ""+In1;}
				if(variable.contains("n2")){In2 = integers(val1)*integers(val2);n2 = ""+In2;}if(variable.contains("n3")){In3 = integers(val1)*integers(val2);n3 = ""+In3;}
				if(variable.contains("n4")){In4 = integers(val1)*integers(val2);n4 = ""+In4;}if(variable.contains("n5")){In5 = integers(val1)*integers(val2);n5 = ""+In5;}
				if(variable.contains("n6")){In6 = integers(val1)*integers(val2);n6 = ""+In6;}if(variable.contains("n7")){In7 = integers(val1)*integers(val2);n7 = ""+In7;}
				if(variable.contains("n8")){In8 = integers(val1)*integers(val2);n8 = ""+In8;}if(variable.contains("n9")){In9 = integers(val1)*integers(val2);n9 = ""+In9;}
				
				if(variable.contains("o0")){Io0 = integers(val1)*integers(val2);o0 = ""+Io0;}if(variable.contains("o1")){Io1 = integers(val1)*integers(val2);o1 = ""+Io1;}
				if(variable.contains("o2")){Io2 = integers(val1)*integers(val2);o2 = ""+Io2;}if(variable.contains("o3")){Io3 = integers(val1)*integers(val2);o3 = ""+Io3;}
				if(variable.contains("o4")){Io4 = integers(val1)*integers(val2);o4 = ""+Io4;}if(variable.contains("o5")){Io5 = integers(val1)*integers(val2);o5 = ""+Io5;}
				if(variable.contains("o6")){Io6 = integers(val1)*integers(val2);o6 = ""+Io6;}if(variable.contains("o7")){Io7 = integers(val1)*integers(val2);o7 = ""+Io7;}
				if(variable.contains("o8")){Io8 = integers(val1)*integers(val2);o8 = ""+Io8;}if(variable.contains("o9")){Io9 = integers(val1)*integers(val2);o9 = ""+Io9;}
				
				if(variable.contains("p0")){Ip0 = integers(val1)*integers(val2);p0 = ""+Ip0;}if(variable.contains("p1")){Ip1 = integers(val1)*integers(val2);p1 = ""+Ip1;}
				if(variable.contains("p2")){Ip2 = integers(val1)*integers(val2);p2 = ""+Ip2;}if(variable.contains("p3")){Ip3 = integers(val1)*integers(val2);p3 = ""+Ip3;}
				if(variable.contains("p4")){Ip4 = integers(val1)*integers(val2);p4 = ""+Ip4;}if(variable.contains("p5")){Ip5 = integers(val1)*integers(val2);p5 = ""+Ip5;}
				if(variable.contains("p6")){Ip6 = integers(val1)*integers(val2);p6 = ""+Ip6;}if(variable.contains("p7")){Ip7 = integers(val1)*integers(val2);p7 = ""+Ip7;}
				if(variable.contains("p8")){Ip8 = integers(val1)*integers(val2);p8 = ""+Ip8;}if(variable.contains("p9")){Ip9 = integers(val1)*integers(val2);p9 = ""+Ip9;}
				
				if(variable.contains("q0")){Iq0 = integers(val1)*integers(val2);q0 = ""+Iq0;}if(variable.contains("q1")){Iq1 = integers(val1)*integers(val2);q1 = ""+Iq1;}
				if(variable.contains("q2")){Iq2 = integers(val1)*integers(val2);q2 = ""+Iq2;}if(variable.contains("q3")){Iq3 = integers(val1)*integers(val2);q3 = ""+Iq3;}
				if(variable.contains("q4")){Iq4 = integers(val1)*integers(val2);q4 = ""+Iq4;}if(variable.contains("q5")){Iq5 = integers(val1)*integers(val2);q5 = ""+Iq5;}
				if(variable.contains("q6")){Iq6 = integers(val1)*integers(val2);q6 = ""+Iq6;}if(variable.contains("q7")){Iq7 = integers(val1)*integers(val2);q7 = ""+Iq7;}
				if(variable.contains("q8")){Iq8 = integers(val1)*integers(val2);q8 = ""+Iq8;}if(variable.contains("q9")){Iq9 = integers(val1)*integers(val2);q9 = ""+Iq9;}
				
				if(variable.contains("r0")){Ir0 = integers(val1)*integers(val2);r0 = ""+Ir0;}if(variable.contains("r1")){Ir1 = integers(val1)*integers(val2);r1 = ""+Ir1;}
				if(variable.contains("r2")){Ir2 = integers(val1)*integers(val2);r2 = ""+Ir2;}if(variable.contains("r3")){Ir3 = integers(val1)*integers(val2);r3 = ""+Ir3;}
				if(variable.contains("r4")){Ir4 = integers(val1)*integers(val2);r4 = ""+Ir4;}if(variable.contains("r5")){Ir5 = integers(val1)*integers(val2);r5 = ""+Ir5;}
				if(variable.contains("r6")){Ir6 = integers(val1)*integers(val2);r6 = ""+Ir6;}if(variable.contains("r7")){Ir7 = integers(val1)*integers(val2);r7 = ""+Ir7;}
				if(variable.contains("r8")){Ir8 = integers(val1)*integers(val2);r8 = ""+Ir8;}if(variable.contains("r9")){Ir9 = integers(val1)*integers(val2);r9 = ""+Ir9;}
				
				if(variable.contains("s0")){Is0 = integers(val1)*integers(val2);s0 = ""+Is0;}if(variable.contains("s1")){Is1 = integers(val1)*integers(val2);s1 = ""+Is1;}
				if(variable.contains("s2")){Is2 = integers(val1)*integers(val2);s2 = ""+Is2;}if(variable.contains("s3")){Is3 = integers(val1)*integers(val2);s3 = ""+Is3;}
				if(variable.contains("s4")){Is4 = integers(val1)*integers(val2);s4 = ""+Is4;}if(variable.contains("s5")){Is5 = integers(val1)*integers(val2);s5 = ""+Is5;}
				if(variable.contains("s6")){Is6 = integers(val1)*integers(val2);s6 = ""+Is6;}if(variable.contains("s7")){Is7 = integers(val1)*integers(val2);s7 = ""+Is7;}
				if(variable.contains("s8")){Is8 = integers(val1)*integers(val2);s8 = ""+Is8;}if(variable.contains("s9")){Is9 = integers(val1)*integers(val2);s9 = ""+Is9;}
			
				if(variable.contains("t0")){It0 = integers(val1)*integers(val2);t0 = ""+It0;}if(variable.contains("t1")){It1 = integers(val1)*integers(val2);t1 = ""+It1;}
				if(variable.contains("t2")){It2 = integers(val1)*integers(val2);t2 = ""+It2;}if(variable.contains("t3")){It3 = integers(val1)*integers(val2);t3 = ""+It3;}
				if(variable.contains("t4")){It4 = integers(val1)*integers(val2);t4 = ""+It4;}if(variable.contains("t5")){It5 = integers(val1)*integers(val2);t5 = ""+It5;}
				if(variable.contains("t6")){It6 = integers(val1)*integers(val2);t6 = ""+It6;}if(variable.contains("t7")){It7 = integers(val1)*integers(val2);t7 = ""+It7;}
				if(variable.contains("t8")){It8 = integers(val1)*integers(val2);t8 = ""+It8;}if(variable.contains("t9")){It9 = integers(val1)*integers(val2);t9 = ""+It9;}
			
				if(variable.contains("u0")){Iu0 = integers(val1)*integers(val2);u0 = ""+Iu0;}if(variable.contains("u1")){Iu1 = integers(val1)*integers(val2);u1 = ""+Iu1;}
				if(variable.contains("u2")){Iu2 = integers(val1)*integers(val2);u2 = ""+Iu2;}if(variable.contains("u3")){Iu3 = integers(val1)*integers(val2);u3 = ""+Iu3;}
				if(variable.contains("u4")){Iu4 = integers(val1)*integers(val2);u4 = ""+Iu4;}if(variable.contains("u5")){Iu5 = integers(val1)*integers(val2);u5 = ""+Iu5;}
				if(variable.contains("u6")){Iu6 = integers(val1)*integers(val2);u6 = ""+Iu6;}if(variable.contains("u7")){Iu7 = integers(val1)*integers(val2);u7 = ""+Iu7;}
				if(variable.contains("u8")){Iu8 = integers(val1)*integers(val2);u8 = ""+Iu8;}if(variable.contains("u9")){Iu9 = integers(val1)*integers(val2);u9 = ""+Iu9;}
				
				if(variable.contains("v0")){Iv0 = integers(val1)*integers(val2);v0 = ""+Iv0;}if(variable.contains("v1")){Iv1 = integers(val1)*integers(val2);v1 = ""+Iv1;}
				if(variable.contains("v2")){Iv2 = integers(val1)*integers(val2);v2 = ""+Iv2;}if(variable.contains("v3")){Iv3 = integers(val1)*integers(val2);v3 = ""+Iv3;}
				if(variable.contains("v4")){Iv4 = integers(val1)*integers(val2);v4 = ""+Iv4;}if(variable.contains("v5")){Iv5 = integers(val1)*integers(val2);v5 = ""+Iv5;}
				if(variable.contains("v6")){Iv6 = integers(val1)*integers(val2);v6 = ""+Iv6;}if(variable.contains("v7")){Iv7 = integers(val1)*integers(val2);v7 = ""+Iv7;}
				if(variable.contains("v8")){Iv8 = integers(val1)*integers(val2);v8 = ""+Iv8;}if(variable.contains("v9")){Iv9 = integers(val1)*integers(val2);v9 = ""+Iv9;}
				
				if(variable.contains("w0")){Iw0 = integers(val1)*integers(val2);w0 = ""+Iw0;}if(variable.contains("w1")){Iw1 = integers(val1)*integers(val2);w1 = ""+Iw1;}
				if(variable.contains("w2")){Iw2 = integers(val1)*integers(val2);w2 = ""+Iw2;}if(variable.contains("w3")){Iw3 = integers(val1)*integers(val2);w3 = ""+Iw3;}
				if(variable.contains("w4")){Iw4 = integers(val1)*integers(val2);w4 = ""+Iw4;}if(variable.contains("w5")){Iw5 = integers(val1)*integers(val2);w5 = ""+Iw5;}
				if(variable.contains("w6")){Iw6 = integers(val1)*integers(val2);w6 = ""+Iw6;}if(variable.contains("w7")){Iw7 = integers(val1)*integers(val2);w7 = ""+Iw7;}
				if(variable.contains("w8")){Iw8 = integers(val1)*integers(val2);w8 = ""+Iw8;}if(variable.contains("w9")){Iw9 = integers(val1)*integers(val2);w9 = ""+Iw9;}
			
				if(variable.contains("x0")){Ix0 = integers(val1)*integers(val2);x0 = ""+Ix0;}if(variable.contains("x1")){Ix1 = integers(val1)*integers(val2);x1 = ""+Ix1;}
				if(variable.contains("x2")){Ix2 = integers(val1)*integers(val2);x2 = ""+Ix2;}if(variable.contains("x3")){Ix3 = integers(val1)*integers(val2);x3 = ""+Ix3;}
				if(variable.contains("x4")){Ix4 = integers(val1)*integers(val2);x4 = ""+Ix4;}if(variable.contains("x5")){Ix5 = integers(val1)*integers(val2);x5 = ""+Ix5;}
				if(variable.contains("x6")){Ix6 = integers(val1)*integers(val2);x6 = ""+Ix6;}if(variable.contains("x7")){Ix7 = integers(val1)*integers(val2);x7 = ""+Ix7;}
				if(variable.contains("x8")){Ix8 = integers(val1)*integers(val2);x8 = ""+Ix8;}if(variable.contains("x9")){Ix9 = integers(val1)*integers(val2);x9 = ""+Ix9;}
			
				if(variable.contains("y0")){Iy0 = integers(val1)*integers(val2);y0 = ""+Iy0;}if(variable.contains("y1")){Iy1 = integers(val1)*integers(val2);y1 = ""+Iy1;}
				if(variable.contains("y2")){Iy2 = integers(val1)*integers(val2);y2 = ""+Iy2;}if(variable.contains("y3")){Iy3 = integers(val1)*integers(val2);y3 = ""+Iy3;}
				if(variable.contains("y4")){Iy4 = integers(val1)*integers(val2);y4 = ""+Iy4;}if(variable.contains("y5")){Iy5 = integers(val1)*integers(val2);y5 = ""+Iy5;}
				if(variable.contains("y6")){Iy6 = integers(val1)*integers(val2);y6 = ""+Iy6;}if(variable.contains("y7")){Iy7 = integers(val1)*integers(val2);y7 = ""+Iy7;}
				if(variable.contains("y8")){Iy8 = integers(val1)*integers(val2);y8 = ""+Iy8;}if(variable.contains("y9")){Iy9 = integers(val1)*integers(val2);y9 = ""+Iy9;}
				
				if(variable.contains("z0")){Iz0 = integers(val1)*integers(val2);z0 = ""+Iz0;}if(variable.contains("z1")){Iz1 = integers(val1)*integers(val2);z1 = ""+Iz1;}
				if(variable.contains("z2")){Iz2 = integers(val1)*integers(val2);z2 = ""+Iz2;}if(variable.contains("z3")){Iz3 = integers(val1)*integers(val2);z3 = ""+Iz3;}
				if(variable.contains("z4")){Iz4 = integers(val1)*integers(val2);z4 = ""+Iz4;}if(variable.contains("z5")){Iz5 = integers(val1)*integers(val2);z5 = ""+Iz5;}
				if(variable.contains("z6")){Iz6 = integers(val1)*integers(val2);z6 = ""+Iz6;}if(variable.contains("z7")){Iz7 = integers(val1)*integers(val2);z7 = ""+Iz7;}
				if(variable.contains("z8")){Iz8 = integers(val1)*integers(val2);z8 = ""+Iz8;}if(variable.contains("z9")){Iz9 = integers(val1)*integers(val2);z9 = ""+Iz9;}
			}
			
			//Método de divisão de inteiros em variáveis
			public static void divisionVars(){
				val1 = valOp.substring(valOp.indexOf("[")+1, valOp.lastIndexOf("/"));
				val2 = valOp.substring(valOp.indexOf("/")+1, valOp.lastIndexOf("]"));
				
				firstValueVar();
				secondValueVar();
				
				if(variable.contains("a0")){Ia0 = integers(val1)/integers(val2);a0 = ""+Ia0;}if(variable.contains("a1")){Ia1 = integers(val1)/integers(val2);a1 = ""+Ia1;}
				if(variable.contains("a2")){Ia2 = integers(val1)/integers(val2);a2 = ""+Ia2;}if(variable.contains("a3")){Ia3 = integers(val1)/integers(val2);a3 = ""+Ia3;}
				if(variable.contains("a4")){Ia4 = integers(val1)/integers(val2);a4 = ""+Ia4;}if(variable.contains("a5")){Ia5 = integers(val1)/integers(val2);a5 = ""+Ia5;}
				if(variable.contains("a6")){Ia6 = integers(val1)/integers(val2);a6 = ""+Ia6;}if(variable.contains("a7")){Ia7 = integers(val1)/integers(val2);a7 = ""+Ia7;}
				if(variable.contains("a8")){Ia8 = integers(val1)/integers(val2);a8 = ""+Ia8;}if(variable.contains("a9")){Ia9 = integers(val1)/integers(val2);a9 = ""+Ia9;}
		
				if(variable.contains("b0")){Ib0 = integers(val1)/integers(val2);b0 = ""+Ib0;}if(variable.contains("b1")){Ib1 = integers(val1)/integers(val2);b1 = ""+Ib1;}
				if(variable.contains("b2")){Ib2 = integers(val1)/integers(val2);b2 = ""+Ib2;}if(variable.contains("b3")){Ib3 = integers(val1)/integers(val2);b3 = ""+Ib3;}
				if(variable.contains("b4")){Ib4 = integers(val1)/integers(val2);b4 = ""+Ib4;}if(variable.contains("b5")){Ib5 = integers(val1)/integers(val2);b5 = ""+Ib5;}
				if(variable.contains("b6")){Ib6 = integers(val1)/integers(val2);b6 = ""+Ib6;}if(variable.contains("b7")){Ib7 = integers(val1)/integers(val2);b7 = ""+Ib7;}
				if(variable.contains("b8")){Ib8 = integers(val1)/integers(val2);b8 = ""+Ib8;}if(variable.contains("b9")){Ib9 = integers(val1)/integers(val2);b9 = ""+Ib9;}
			
				if(variable.contains("c0")){Ic0 = integers(val1)/integers(val2);c0 = ""+Ic0;}if(variable.contains("c1")){Ic1 = integers(val1)/integers(val2);c1 = ""+Ic1;}
				if(variable.contains("c2")){Ic2 = integers(val1)/integers(val2);c2 = ""+Ic2;}if(variable.contains("c3")){Ic3 = integers(val1)/integers(val2);c3 = ""+Ic3;}
				if(variable.contains("c4")){Ic4 = integers(val1)/integers(val2);c4 = ""+Ic4;}if(variable.contains("c5")){Ic5 = integers(val1)/integers(val2);c5 = ""+Ic5;}
				if(variable.contains("c6")){Ic6 = integers(val1)/integers(val2);c6 = ""+Ic6;}if(variable.contains("c7")){Ic7 = integers(val1)/integers(val2);c7 = ""+Ic7;}
				if(variable.contains("c8")){Ic8 = integers(val1)/integers(val2);c8 = ""+Ic8;}if(variable.contains("c9")){Ic9 = integers(val1)/integers(val2);c9 = ""+Ic9;}
				
				if(variable.contains("d0")){Id0 = integers(val1)/integers(val2);d0 = ""+Id0;}if(variable.contains("d1")){Id1 = integers(val1)/integers(val2);d1 = ""+Id1;}
				if(variable.contains("d2")){Id2 = integers(val1)/integers(val2);d2 = ""+Id2;}if(variable.contains("d3")){Id3 = integers(val1)/integers(val2);d3 = ""+Id3;}
				if(variable.contains("d4")){Id4 = integers(val1)/integers(val2);d4 = ""+Id4;}if(variable.contains("d5")){Id5 = integers(val1)/integers(val2);d5 = ""+Id5;}
				if(variable.contains("d6")){Id6 = integers(val1)/integers(val2);d6 = ""+Id6;}if(variable.contains("d7")){Id7 = integers(val1)/integers(val2);d7 = ""+Id7;}
				if(variable.contains("d8")){Id8 = integers(val1)/integers(val2);d8 = ""+Id8;}if(variable.contains("d9")){Id9 = integers(val1)/integers(val2);d9 = ""+Id9;}
				
				if(variable.contains("e0")){Ie0 = integers(val1)/integers(val2);a0 = ""+Ie0;}if(variable.contains("e1")){Ie1 = integers(val1)/integers(val2);e1 = ""+Ie1;}
				if(variable.contains("e2")){Ie2 = integers(val1)/integers(val2);e2 = ""+Ie2;}if(variable.contains("e3")){Ie3 = integers(val1)/integers(val2);e3 = ""+Ie3;}
				if(variable.contains("e4")){Ie4 = integers(val1)/integers(val2);e4 = ""+Ie4;}if(variable.contains("e5")){Ie5 = integers(val1)/integers(val2);e5 = ""+Ie5;}
				if(variable.contains("e6")){Ie6 = integers(val1)/integers(val2);e6 = ""+Ie6;}if(variable.contains("e7")){Ie7 = integers(val1)/integers(val2);e7 = ""+Ie7;}
				if(variable.contains("e8")){Ie8 = integers(val1)/integers(val2);e8 = ""+Ie8;}if(variable.contains("e9")){Ie9 = integers(val1)/integers(val2);e9 = ""+Ie9;}
			
				if(variable.contains("f0")){If0 = integers(val1)/integers(val2);a0 = ""+If0;}if(variable.contains("f1")){If1 = integers(val1)/integers(val2);f1 = ""+If1;}
				if(variable.contains("f2")){If2 = integers(val1)/integers(val2);f2 = ""+If2;}if(variable.contains("f3")){If3 = integers(val1)/integers(val2);f3 = ""+If3;}
				if(variable.contains("f4")){If4 = integers(val1)/integers(val2);f4 = ""+If4;}if(variable.contains("f5")){If5 = integers(val1)/integers(val2);f5 = ""+If5;}
				if(variable.contains("f6")){If6 = integers(val1)/integers(val2);f6 = ""+If6;}if(variable.contains("f7")){If7 = integers(val1)/integers(val2);f7 = ""+If7;}
				if(variable.contains("f8")){If8 = integers(val1)/integers(val2);f8 = ""+If8;}if(variable.contains("f9")){If9 = integers(val1)/integers(val2);f9 = ""+If9;}
			
				if(variable.contains("g0")){Ig0 = integers(val1)/integers(val2);g0 = ""+Ig0;}if(variable.contains("g1")){Ig1 = integers(val1)/integers(val2);g1 = ""+Ig1;}
				if(variable.contains("g2")){Ig2 = integers(val1)/integers(val2);g2 = ""+Ig2;}if(variable.contains("g3")){Ig3 = integers(val1)/integers(val2);g3 = ""+Ig3;}
				if(variable.contains("g4")){Ig4 = integers(val1)/integers(val2);g4 = ""+Ig4;}if(variable.contains("g5")){Ig5 = integers(val1)/integers(val2);g5 = ""+Ig5;}
				if(variable.contains("g6")){Ig6 = integers(val1)/integers(val2);g6 = ""+Ig6;}if(variable.contains("g7")){Ig7 = integers(val1)/integers(val2);g7 = ""+Ig7;}
				if(variable.contains("g8")){Ig8 = integers(val1)/integers(val2);g8 = ""+Ig8;}if(variable.contains("g9")){Ig9 = integers(val1)/integers(val2);g9 = ""+Ig9;}
			
				if(variable.contains("h0")){Ih0 = integers(val1)/integers(val2);h0 = ""+Ih0;}if(variable.contains("h1")){Ih1 = integers(val1)/integers(val2);h1 = ""+Ih1;}
				if(variable.contains("h2")){Ih2 = integers(val1)/integers(val2);h2 = ""+Ih2;}if(variable.contains("h3")){Ih3 = integers(val1)/integers(val2);h3 = ""+Ih3;}
				if(variable.contains("h4")){Ih4 = integers(val1)/integers(val2);h4 = ""+Ih4;}if(variable.contains("h5")){Ih5 = integers(val1)/integers(val2);h5 = ""+Ih5;}
				if(variable.contains("h6")){Ih6 = integers(val1)/integers(val2);h6 = ""+Ih6;}if(variable.contains("h7")){Ih7 = integers(val1)/integers(val2);h7 = ""+Ih7;}
				if(variable.contains("h8")){Ih8 = integers(val1)/integers(val2);h8 = ""+Ih8;}if(variable.contains("h9")){Ih9 = integers(val1)/integers(val2);h9 = ""+Ih9;}
				
				if(variable.contains("i0")){Ii0 = integers(val1)/integers(val2);i0 = ""+Ii0;}if(variable.contains("i1")){Ii1 = integers(val1)/integers(val2);i1 = ""+Ii1;}
				if(variable.contains("i2")){Ii2 = integers(val1)/integers(val2);i2 = ""+Ii2;}if(variable.contains("i3")){Ii3 = integers(val1)/integers(val2);i3 = ""+Ii3;}
				if(variable.contains("i4")){Ii4 = integers(val1)/integers(val2);i4 = ""+Ii4;}if(variable.contains("i5")){Ii5 = integers(val1)/integers(val2);i5 = ""+Ii5;}
				if(variable.contains("i6")){Ii6 = integers(val1)/integers(val2);i6 = ""+Ii6;}if(variable.contains("i7")){Ii7 = integers(val1)/integers(val2);i7 = ""+Ii7;}
				if(variable.contains("i8")){Ii8 = integers(val1)/integers(val2);i8 = ""+Ii8;}if(variable.contains("i9")){Ii9 = integers(val1)/integers(val2);i9 = ""+Ii9;}
				
				if(variable.contains("j0")){Ij0 = integers(val1)/integers(val2);j0 = ""+Ij0;}if(variable.contains("j1")){Ij1 = integers(val1)/integers(val2);j1 = ""+Ij1;}
				if(variable.contains("j2")){Ij2 = integers(val1)/integers(val2);j2 = ""+Ij2;}if(variable.contains("j3")){Ij3 = integers(val1)/integers(val2);j3 = ""+Ij3;}
				if(variable.contains("j4")){Ij4 = integers(val1)/integers(val2);j4 = ""+Ij4;}if(variable.contains("j5")){Ij5 = integers(val1)/integers(val2);j5 = ""+Ij5;}
				if(variable.contains("j6")){Ij6 = integers(val1)/integers(val2);j6 = ""+Ij6;}if(variable.contains("j7")){Ij7 = integers(val1)/integers(val2);j7 = ""+Ij7;}
				if(variable.contains("j8")){Ij8 = integers(val1)/integers(val2);j8 = ""+Ij8;}if(variable.contains("j9")){Ij9 = integers(val1)/integers(val2);j9 = ""+Ij9;}
				
				if(variable.contains("k0")){Ik0 = integers(val1)/integers(val2);k0 = ""+Ik0;}if(variable.contains("k1")){Ik1 = integers(val1)/integers(val2);k1 = ""+Ik1;}
				if(variable.contains("k2")){Ik2 = integers(val1)/integers(val2);k2 = ""+Ik2;}if(variable.contains("k3")){Ik3 = integers(val1)/integers(val2);k3 = ""+Ik3;}
				if(variable.contains("k4")){Ik4 = integers(val1)/integers(val2);k4 = ""+Ik4;}if(variable.contains("k5")){Ik5 = integers(val1)/integers(val2);k5 = ""+Ik5;}
				if(variable.contains("k6")){Ik6 = integers(val1)/integers(val2);k6 = ""+Ik6;}if(variable.contains("k7")){Ik7 = integers(val1)/integers(val2);k7 = ""+Ik7;}
				if(variable.contains("k8")){Ik8 = integers(val1)/integers(val2);k8 = ""+Ik8;}if(variable.contains("k9")){Ik9 = integers(val1)/integers(val2);k9 = ""+Ik9;}
		
				if(variable.contains("l0")){Il0 = integers(val1)/integers(val2);l0 = ""+Il0;}if(variable.contains("l1")){Il1 = integers(val1)/integers(val2);l1 = ""+Il1;}
				if(variable.contains("l2")){Il2 = integers(val1)/integers(val2);l2 = ""+Il2;}if(variable.contains("l3")){Il3 = integers(val1)/integers(val2);l3 = ""+Il3;}
				if(variable.contains("l4")){Il4 = integers(val1)/integers(val2);l4 = ""+Il4;}if(variable.contains("l5")){Il5 = integers(val1)/integers(val2);l5 = ""+Il5;}
				if(variable.contains("l6")){Il6 = integers(val1)/integers(val2);l6 = ""+Il6;}if(variable.contains("l7")){Il7 = integers(val1)/integers(val2);l7 = ""+Il7;}
				if(variable.contains("l8")){Il8 = integers(val1)/integers(val2);l8 = ""+Il8;}if(variable.contains("l9")){Il9 = integers(val1)/integers(val2);l9 = ""+Il9;}
				
				if(variable.contains("m0")){Im0 = integers(val1)/integers(val2);m0 = ""+Im0;}if(variable.contains("m1")){Im1 = integers(val1)/integers(val2);m1 = ""+Im1;}
				if(variable.contains("m2")){Im2 = integers(val1)/integers(val2);m2 = ""+Im2;}if(variable.contains("m3")){Im3 = integers(val1)/integers(val2);m3 = ""+Im3;}
				if(variable.contains("m4")){Im4 = integers(val1)/integers(val2);m4 = ""+Im4;}if(variable.contains("m5")){Im5 = integers(val1)/integers(val2);m5 = ""+Im5;}
				if(variable.contains("m6")){Im6 = integers(val1)/integers(val2);m6 = ""+Im6;}if(variable.contains("m7")){Im7 = integers(val1)/integers(val2);m7 = ""+Im7;}
				if(variable.contains("m8")){Im8 = integers(val1)/integers(val2);m8 = ""+Im8;}if(variable.contains("m9")){Im9 = integers(val1)/integers(val2);m9 = ""+Im9;}
			
				if(variable.contains("n0")){In0 = integers(val1)/integers(val2);n0 = ""+In0;}if(variable.contains("n1")){In1 = integers(val1)/integers(val2);n1 = ""+In1;}
				if(variable.contains("n2")){In2 = integers(val1)/integers(val2);n2 = ""+In2;}if(variable.contains("n3")){In3 = integers(val1)/integers(val2);n3 = ""+In3;}
				if(variable.contains("n4")){In4 = integers(val1)/integers(val2);n4 = ""+In4;}if(variable.contains("n5")){In5 = integers(val1)/integers(val2);n5 = ""+In5;}
				if(variable.contains("n6")){In6 = integers(val1)/integers(val2);n6 = ""+In6;}if(variable.contains("n7")){In7 = integers(val1)/integers(val2);n7 = ""+In7;}
				if(variable.contains("n8")){In8 = integers(val1)/integers(val2);n8 = ""+In8;}if(variable.contains("n9")){In9 = integers(val1)/integers(val2);n9 = ""+In9;}
				
				if(variable.contains("o0")){Io0 = integers(val1)/integers(val2);o0 = ""+Io0;}if(variable.contains("o1")){Io1 = integers(val1)/integers(val2);o1 = ""+Io1;}
				if(variable.contains("o2")){Io2 = integers(val1)/integers(val2);o2 = ""+Io2;}if(variable.contains("o3")){Io3 = integers(val1)/integers(val2);o3 = ""+Io3;}
				if(variable.contains("o4")){Io4 = integers(val1)/integers(val2);o4 = ""+Io4;}if(variable.contains("o5")){Io5 = integers(val1)/integers(val2);o5 = ""+Io5;}
				if(variable.contains("o6")){Io6 = integers(val1)/integers(val2);o6 = ""+Io6;}if(variable.contains("o7")){Io7 = integers(val1)/integers(val2);o7 = ""+Io7;}
				if(variable.contains("o8")){Io8 = integers(val1)/integers(val2);o8 = ""+Io8;}if(variable.contains("o9")){Io9 = integers(val1)/integers(val2);o9 = ""+Io9;}
				
				if(variable.contains("p0")){Ip0 = integers(val1)/integers(val2);p0 = ""+Ip0;}if(variable.contains("p1")){Ip1 = integers(val1)/integers(val2);p1 = ""+Ip1;}
				if(variable.contains("p2")){Ip2 = integers(val1)/integers(val2);p2 = ""+Ip2;}if(variable.contains("p3")){Ip3 = integers(val1)/integers(val2);p3 = ""+Ip3;}
				if(variable.contains("p4")){Ip4 = integers(val1)/integers(val2);p4 = ""+Ip4;}if(variable.contains("p5")){Ip5 = integers(val1)/integers(val2);p5 = ""+Ip5;}
				if(variable.contains("p6")){Ip6 = integers(val1)/integers(val2);p6 = ""+Ip6;}if(variable.contains("p7")){Ip7 = integers(val1)/integers(val2);p7 = ""+Ip7;}
				if(variable.contains("p8")){Ip8 = integers(val1)/integers(val2);p8 = ""+Ip8;}if(variable.contains("p9")){Ip9 = integers(val1)/integers(val2);p9 = ""+Ip9;}
				
				if(variable.contains("q0")){Iq0 = integers(val1)/integers(val2);q0 = ""+Iq0;}if(variable.contains("q1")){Iq1 = integers(val1)/integers(val2);q1 = ""+Iq1;}
				if(variable.contains("q2")){Iq2 = integers(val1)/integers(val2);q2 = ""+Iq2;}if(variable.contains("q3")){Iq3 = integers(val1)/integers(val2);q3 = ""+Iq3;}
				if(variable.contains("q4")){Iq4 = integers(val1)/integers(val2);q4 = ""+Iq4;}if(variable.contains("q5")){Iq5 = integers(val1)/integers(val2);q5 = ""+Iq5;}
				if(variable.contains("q6")){Iq6 = integers(val1)/integers(val2);q6 = ""+Iq6;}if(variable.contains("q7")){Iq7 = integers(val1)/integers(val2);q7 = ""+Iq7;}
				if(variable.contains("q8")){Iq8 = integers(val1)/integers(val2);q8 = ""+Iq8;}if(variable.contains("q9")){Iq9 = integers(val1)/integers(val2);q9 = ""+Iq9;}
				
				if(variable.contains("r0")){Ir0 = integers(val1)/integers(val2);r0 = ""+Ir0;}if(variable.contains("r1")){Ir1 = integers(val1)/integers(val2);r1 = ""+Ir1;}
				if(variable.contains("r2")){Ir2 = integers(val1)/integers(val2);r2 = ""+Ir2;}if(variable.contains("r3")){Ir3 = integers(val1)/integers(val2);r3 = ""+Ir3;}
				if(variable.contains("r4")){Ir4 = integers(val1)/integers(val2);r4 = ""+Ir4;}if(variable.contains("r5")){Ir5 = integers(val1)/integers(val2);r5 = ""+Ir5;}
				if(variable.contains("r6")){Ir6 = integers(val1)/integers(val2);r6 = ""+Ir6;}if(variable.contains("r7")){Ir7 = integers(val1)/integers(val2);r7 = ""+Ir7;}
				if(variable.contains("r8")){Ir8 = integers(val1)/integers(val2);r8 = ""+Ir8;}if(variable.contains("r9")){Ir9 = integers(val1)/integers(val2);r9 = ""+Ir9;}
				
				if(variable.contains("s0")){Is0 = integers(val1)/integers(val2);s0 = ""+Is0;}if(variable.contains("s1")){Is1 = integers(val1)/integers(val2);s1 = ""+Is1;}
				if(variable.contains("s2")){Is2 = integers(val1)/integers(val2);s2 = ""+Is2;}if(variable.contains("s3")){Is3 = integers(val1)/integers(val2);s3 = ""+Is3;}
				if(variable.contains("s4")){Is4 = integers(val1)/integers(val2);s4 = ""+Is4;}if(variable.contains("s5")){Is5 = integers(val1)/integers(val2);s5 = ""+Is5;}
				if(variable.contains("s6")){Is6 = integers(val1)/integers(val2);s6 = ""+Is6;}if(variable.contains("s7")){Is7 = integers(val1)/integers(val2);s7 = ""+Is7;}
				if(variable.contains("s8")){Is8 = integers(val1)/integers(val2);s8 = ""+Is8;}if(variable.contains("s9")){Is9 = integers(val1)/integers(val2);s9 = ""+Is9;}
			
				if(variable.contains("t0")){It0 = integers(val1)/integers(val2);t0 = ""+It0;}if(variable.contains("t1")){It1 = integers(val1)/integers(val2);t1 = ""+It1;}
				if(variable.contains("t2")){It2 = integers(val1)/integers(val2);t2 = ""+It2;}if(variable.contains("t3")){It3 = integers(val1)/integers(val2);t3 = ""+It3;}
				if(variable.contains("t4")){It4 = integers(val1)/integers(val2);t4 = ""+It4;}if(variable.contains("t5")){It5 = integers(val1)/integers(val2);t5 = ""+It5;}
				if(variable.contains("t6")){It6 = integers(val1)/integers(val2);t6 = ""+It6;}if(variable.contains("t7")){It7 = integers(val1)/integers(val2);t7 = ""+It7;}
				if(variable.contains("t8")){It8 = integers(val1)/integers(val2);t8 = ""+It8;}if(variable.contains("t9")){It9 = integers(val1)/integers(val2);t9 = ""+It9;}
			
				if(variable.contains("u0")){Iu0 = integers(val1)/integers(val2);u0 = ""+Iu0;}if(variable.contains("u1")){Iu1 = integers(val1)/integers(val2);u1 = ""+Iu1;}
				if(variable.contains("u2")){Iu2 = integers(val1)/integers(val2);u2 = ""+Iu2;}if(variable.contains("u3")){Iu3 = integers(val1)/integers(val2);u3 = ""+Iu3;}
				if(variable.contains("u4")){Iu4 = integers(val1)/integers(val2);u4 = ""+Iu4;}if(variable.contains("u5")){Iu5 = integers(val1)/integers(val2);u5 = ""+Iu5;}
				if(variable.contains("u6")){Iu6 = integers(val1)/integers(val2);u6 = ""+Iu6;}if(variable.contains("u7")){Iu7 = integers(val1)/integers(val2);u7 = ""+Iu7;}
				if(variable.contains("u8")){Iu8 = integers(val1)/integers(val2);u8 = ""+Iu8;}if(variable.contains("u9")){Iu9 = integers(val1)/integers(val2);u9 = ""+Iu9;}
			
				if(variable.contains("v0")){Iv0 = integers(val1)/integers(val2);v0 = ""+Iv0;}if(variable.contains("v1")){Iv1 = integers(val1)/integers(val2);v1 = ""+Iv1;}
				if(variable.contains("v2")){Iv2 = integers(val1)/integers(val2);v2 = ""+Iv2;}if(variable.contains("v3")){Iv3 = integers(val1)/integers(val2);v3 = ""+Iv3;}
				if(variable.contains("v4")){Iv4 = integers(val1)/integers(val2);v4 = ""+Iv4;}if(variable.contains("v5")){Iv5 = integers(val1)/integers(val2);v5 = ""+Iv5;}
				if(variable.contains("v6")){Iv6 = integers(val1)/integers(val2);v6 = ""+Iv6;}if(variable.contains("v7")){Iv7 = integers(val1)/integers(val2);v7 = ""+Iv7;}
				if(variable.contains("v8")){Iv8 = integers(val1)/integers(val2);v8 = ""+Iv8;}if(variable.contains("v9")){Iv9 = integers(val1)/integers(val2);v9 = ""+Iv9;}
				
				if(variable.contains("w0")){Iw0 = integers(val1)/integers(val2);w0 = ""+Iw0;}if(variable.contains("w1")){Iw1 = integers(val1)/integers(val2);w1 = ""+Iw1;}
				if(variable.contains("w2")){Iw2 = integers(val1)/integers(val2);w2 = ""+Iw2;}if(variable.contains("w3")){Iw3 = integers(val1)/integers(val2);w3 = ""+Iw3;}
				if(variable.contains("w4")){Iw4 = integers(val1)/integers(val2);w4 = ""+Iw4;}if(variable.contains("w5")){Iw5 = integers(val1)/integers(val2);w5 = ""+Iw5;}
				if(variable.contains("w6")){Iw6 = integers(val1)/integers(val2);w6 = ""+Iw6;}if(variable.contains("w7")){Iw7 = integers(val1)/integers(val2);w7 = ""+Iw7;}
				if(variable.contains("w8")){Iw8 = integers(val1)/integers(val2);w8 = ""+Iw8;}if(variable.contains("w9")){Iw9 = integers(val1)/integers(val2);w9 = ""+Iw9;}
			
				if(variable.contains("x0")){Ix0 = integers(val1)/integers(val2);x0 = ""+Ix0;}if(variable.contains("x1")){Ix1 = integers(val1)/integers(val2);x1 = ""+Ix1;}
				if(variable.contains("x2")){Ix2 = integers(val1)/integers(val2);x2 = ""+Ix2;}if(variable.contains("x3")){Ix3 = integers(val1)/integers(val2);x3 = ""+Ix3;}
				if(variable.contains("x4")){Ix4 = integers(val1)/integers(val2);x4 = ""+Ix4;}if(variable.contains("x5")){Ix5 = integers(val1)/integers(val2);x5 = ""+Ix5;}
				if(variable.contains("x6")){Ix6 = integers(val1)/integers(val2);x6 = ""+Ix6;}if(variable.contains("x7")){Ix7 = integers(val1)/integers(val2);x7 = ""+Ix7;}
				if(variable.contains("x8")){Ix8 = integers(val1)/integers(val2);x8 = ""+Ix8;}if(variable.contains("x9")){Ix9 = integers(val1)/integers(val2);x9 = ""+Ix9;}
			
				if(variable.contains("y0")){Iy0 = integers(val1)/integers(val2);y0 = ""+Iy0;}if(variable.contains("y1")){Iy1 = integers(val1)/integers(val2);y1 = ""+Iy1;}
				if(variable.contains("y2")){Iy2 = integers(val1)/integers(val2);y2 = ""+Iy2;}if(variable.contains("y3")){Iy3 = integers(val1)/integers(val2);y3 = ""+Iy3;}
				if(variable.contains("y4")){Iy4 = integers(val1)/integers(val2);y4 = ""+Iy4;}if(variable.contains("y5")){Iy5 = integers(val1)/integers(val2);y5 = ""+Iy5;}
				if(variable.contains("y6")){Iy6 = integers(val1)/integers(val2);y6 = ""+Iy6;}if(variable.contains("y7")){Iy7 = integers(val1)/integers(val2);y7 = ""+Iy7;}
				if(variable.contains("y8")){Iy8 = integers(val1)/integers(val2);y8 = ""+Iy8;}if(variable.contains("y9")){Iy9 = integers(val1)/integers(val2);y9 = ""+Iy9;}
				
				if(variable.contains("z0")){Iz0 = integers(val1)/integers(val2);z0 = ""+Iz0;}if(variable.contains("z1")){Iz1 = integers(val1)/integers(val2);z1 = ""+Iz1;}
				if(variable.contains("z2")){Iz2 = integers(val1)/integers(val2);z2 = ""+Iz2;}if(variable.contains("z3")){Iz3 = integers(val1)/integers(val2);z3 = ""+Iz3;}
				if(variable.contains("z4")){Iz4 = integers(val1)/integers(val2);z4 = ""+Iz4;}if(variable.contains("z5")){Iz5 = integers(val1)/integers(val2);z5 = ""+Iz5;}
				if(variable.contains("z6")){Iz6 = integers(val1)/integers(val2);z6 = ""+Iz6;}if(variable.contains("z7")){Iz7 = integers(val1)/integers(val2);z7 = ""+Iz7;}
				if(variable.contains("z8")){Iz8 = integers(val1)/integers(val2);z8 = ""+Iz8;}if(variable.contains("z9")){Iz9 = integers(val1)/integers(val2);z9 = ""+Iz9;}
			}
			
			public static void sisVariables(){
				//Variaveis @a0 - @a9
				if(linha.contains("a0")){memoria += a0;}
				if(linha.contains("a1")){memoria += a1;}
				if(linha.contains("a2")){memoria += a2;}
				if(linha.contains("a3")){memoria += a3;}
				if(linha.contains("a4")){memoria += a4;}
				if(linha.contains("a5")){memoria += a5;}
				if(linha.contains("a6")){memoria += a6;}
				if(linha.contains("a7")){memoria += a7;}
				if(linha.contains("a8")){memoria += a8;}
				if(linha.contains("a9")){memoria += a9;}
				
				//variaveis @b0 - @b9
				if(linha.contains("b0")){memoria += b0;}
				if(linha.contains("b1")){memoria += b1;}
				if(linha.contains("b2")){memoria += b2;}
				if(linha.contains("b3")){memoria += b3;}
				if(linha.contains("b4")){memoria += b4;}
				if(linha.contains("b5")){memoria += b5;}
				if(linha.contains("b6")){memoria += b6;}
				if(linha.contains("b7")){memoria += b7;}
				if(linha.contains("b8")){memoria += b8;}
				if(linha.contains("b9")){memoria += b9;}
				
				//variaveis @c0 - @c9
				if(linha.contains("c0")){memoria += c0;}
				if(linha.contains("c1")){memoria += c1;}
				if(linha.contains("c2")){memoria += c2;}
				if(linha.contains("c3")){memoria += c3;}
				if(linha.contains("c4")){memoria += c4;}
				if(linha.contains("c5")){memoria += c5;}
				if(linha.contains("c6")){memoria += c6;}
				if(linha.contains("c7")){memoria += c7;}
				if(linha.contains("c8")){memoria += c8;}
				if(linha.contains("c9")){memoria += c9;}
				
				//variaveis @d0 - @d9
				if(linha.contains("d0")){memoria += d0;}
				if(linha.contains("d1")){memoria += d1;}
				if(linha.contains("d2")){memoria += d2;}
				if(linha.contains("d3")){memoria += d3;}
				if(linha.contains("d4")){memoria += d4;}
				if(linha.contains("d5")){memoria += d5;}
				if(linha.contains("d6")){memoria += d6;}
				if(linha.contains("d7")){memoria += d7;}
				if(linha.contains("d8")){memoria += d8;}
				if(linha.contains("d9")){memoria += d9;}
				
				//variaveis @e0 - @e9
				if(linha.contains("e0")){memoria += e0;}
				if(linha.contains("e1")){memoria += e1;}
				if(linha.contains("e2")){memoria += e2;}
				if(linha.contains("e3")){memoria += e3;}
				if(linha.contains("e4")){memoria += e4;}
				if(linha.contains("e5")){memoria += e5;}
				if(linha.contains("e6")){memoria += e6;}
				if(linha.contains("e7")){memoria += e7;}
				if(linha.contains("e8")){memoria += e8;}
				if(linha.contains("e9")){memoria += e9;}
				
				//variaveis @f0 - @f9
				if(linha.contains("f0")){memoria += f0;}
				if(linha.contains("f1")){memoria += f1;}
				if(linha.contains("f2")){memoria += f2;}
				if(linha.contains("f3")){memoria += f3;}
				if(linha.contains("f4")){memoria += f4;}
				if(linha.contains("f5")){memoria += f5;}
				if(linha.contains("f6")){memoria += f6;}
				if(linha.contains("f7")){memoria += f7;}
				if(linha.contains("f8")){memoria += f8;}
				if(linha.contains("f9")){memoria += f9;}
				
				//variaveis @g0 - @g9
				if(linha.contains("g0")){memoria += g0;}
				if(linha.contains("g1")){memoria += g1;}
				if(linha.contains("g2")){memoria += g2;}
				if(linha.contains("g3")){memoria += g3;}
				if(linha.contains("g4")){memoria += g4;}
				if(linha.contains("g5")){memoria += g5;}
				if(linha.contains("g6")){memoria += g6;}
				if(linha.contains("g7")){memoria += g7;}
				if(linha.contains("g8")){memoria += g8;}
				if(linha.contains("g9")){memoria += g9;}
				
				//variaveis @h0 - @h9
				if(linha.contains("h0")){memoria += h0;}
				if(linha.contains("h1")){memoria += h1;}
				if(linha.contains("h2")){memoria += h2;}
				if(linha.contains("h3")){memoria += h3;}
				if(linha.contains("h4")){memoria += h4;}
				if(linha.contains("h5")){memoria += h5;}
				if(linha.contains("h6")){memoria += h6;}
				if(linha.contains("h7")){memoria += h7;}
				if(linha.contains("h8")){memoria += h8;}
				if(linha.contains("h9")){memoria += h9;}
				
				//variaveis @i0 - @i9
				if(linha.contains("i0")){memoria += i0;}
				if(linha.contains("i1")){memoria += i1;}
				if(linha.contains("i2")){memoria += i2;}
				if(linha.contains("i3")){memoria += i3;}
				if(linha.contains("i4")){memoria += i4;}
				if(linha.contains("i5")){memoria += i5;}
				if(linha.contains("i6")){memoria += i6;}
				if(linha.contains("i7")){memoria += i7;}
				if(linha.contains("i8")){memoria += i8;}
				if(linha.contains("i9")){memoria += i9;}
				
				//variaveis @j0 - @j9
				if(linha.contains("j0")){memoria += j0;}
				if(linha.contains("j1")){memoria += j1;}
				if(linha.contains("j2")){memoria += j2;}
				if(linha.contains("j3")){memoria += j3;}
				if(linha.contains("j4")){memoria += j4;}
				if(linha.contains("j5")){memoria += j5;}
				if(linha.contains("j6")){memoria += j6;}
				if(linha.contains("j7")){memoria += j7;}
				if(linha.contains("j8")){memoria += j8;}
				if(linha.contains("j9")){memoria += j9;}
				
				//variaveis @k0 - @k9
				if(linha.contains("k0")){memoria += k0;}
				if(linha.contains("k1")){memoria += k1;}
				if(linha.contains("k2")){memoria += k2;}
				if(linha.contains("k3")){memoria += k3;}
				if(linha.contains("k4")){memoria += k4;}
				if(linha.contains("k5")){memoria += k5;}
				if(linha.contains("k6")){memoria += k6;}
				if(linha.contains("k7")){memoria += k7;}
				if(linha.contains("k8")){memoria += k8;}
				if(linha.contains("k9")){memoria += k9;}
			
				//variaveis @jl - @l9
				if(linha.contains("l0")){memoria += l0;}
				if(linha.contains("l1")){memoria += l1;}
				if(linha.contains("l2")){memoria += l2;}
				if(linha.contains("l3")){memoria += l3;}
				if(linha.contains("l4")){memoria += l4;}
				if(linha.contains("l5")){memoria += l5;}
				if(linha.contains("l6")){memoria += l6;}
				if(linha.contains("l7")){memoria += l7;}
				if(linha.contains("l8")){memoria += l8;}
				if(linha.contains("l9")){memoria += l9;}
				
				//variaveis @m0 - @m9
				if(linha.contains("m0")){memoria += m0;}
				if(linha.contains("m1")){memoria += m1;}
				if(linha.contains("m2")){memoria += m2;}
				if(linha.contains("m3")){memoria += m3;}
				if(linha.contains("m4")){memoria += m4;}
				if(linha.contains("m5")){memoria += m5;}
				if(linha.contains("m6")){memoria += m6;}
				if(linha.contains("m7")){memoria += m7;}
				if(linha.contains("m8")){memoria += m8;}
				if(linha.contains("m9")){memoria += m9;}
				
				//variaveis @n0 - @n9
				if(linha.contains("n0")){memoria += n0;}
				if(linha.contains("n1")){memoria += n1;}
				if(linha.contains("n2")){memoria += n2;}
				if(linha.contains("n3")){memoria += n3;}
				if(linha.contains("n4")){memoria += n4;}
				if(linha.contains("n5")){memoria += n5;}
				if(linha.contains("n6")){memoria += n6;}
				if(linha.contains("n7")){memoria += n7;}
				if(linha.contains("n8")){memoria += n8;}
				if(linha.contains("n9")){memoria += n9;}
				
				//variaveis @o0 - @o9
				if(linha.contains("o0")){memoria += o0;}
				if(linha.contains("o1")){memoria += o1;}
				if(linha.contains("o2")){memoria += o2;}
				if(linha.contains("o3")){memoria += o3;}
				if(linha.contains("o4")){memoria += o4;}
				if(linha.contains("o5")){memoria += o5;}
				if(linha.contains("o6")){memoria += o6;}
				if(linha.contains("o7")){memoria += o7;}
				if(linha.contains("o8")){memoria += o8;}
				if(linha.contains("o9")){memoria += o9;}
				
				//variaveis @p0 - @p9
				if(linha.contains("p0")){memoria += p0;}
				if(linha.contains("p1")){memoria += p1;}
				if(linha.contains("p2")){memoria += p2;}
				if(linha.contains("p3")){memoria += p3;}
				if(linha.contains("p4")){memoria += p4;}
				if(linha.contains("p5")){memoria += p5;}
				if(linha.contains("p6")){memoria += p6;}
				if(linha.contains("p7")){memoria += p7;}
				if(linha.contains("p8")){memoria += p8;}
				if(linha.contains("p9")){memoria += p9;}
				
				//variaveis @q0 - @q9
				if(linha.contains("q0")){memoria += q0;}
				if(linha.contains("q1")){memoria += q1;}
				if(linha.contains("q2")){memoria += q2;}
				if(linha.contains("q3")){memoria += q3;}
				if(linha.contains("q4")){memoria += q4;}
				if(linha.contains("q5")){memoria += q5;}
				if(linha.contains("q6")){memoria += q6;}
				if(linha.contains("q7")){memoria += q7;}
				if(linha.contains("q8")){memoria += q8;}
				if(linha.contains("q9")){memoria += q9;}
				
				//variaveis @r0 - @r9
				if(linha.contains("r0")){memoria += r0;}
				if(linha.contains("r1")){memoria += r1;}
				if(linha.contains("r2")){memoria += r2;}
				if(linha.contains("r3")){memoria += r3;}
				if(linha.contains("r4")){memoria += r4;}
				if(linha.contains("r5")){memoria += r5;}
				if(linha.contains("r6")){memoria += r6;}
				if(linha.contains("r7")){memoria += r7;}
				if(linha.contains("r8")){memoria += r8;}
				if(linha.contains("r9")){memoria += r9;}
				
				//variaveis @s0 - @s9
				if(linha.contains("s0")){memoria += s0;}
				if(linha.contains("s1")){memoria += s1;}
				if(linha.contains("s2")){memoria += s2;}
				if(linha.contains("s3")){memoria += s3;}
				if(linha.contains("s4")){memoria += s4;}
				if(linha.contains("s5")){memoria += s5;}
				if(linha.contains("s6")){memoria += s6;}
				if(linha.contains("s7")){memoria += s7;}
				if(linha.contains("s8")){memoria += s8;}
				if(linha.contains("s9")){memoria += s9;}
				
				//variaveis @t0 - @t9
				if(linha.contains("t0")){memoria += t0;}
				if(linha.contains("t1")){memoria += t1;}
				if(linha.contains("t2")){memoria += t2;}
				if(linha.contains("t3")){memoria += t3;}
				if(linha.contains("t4")){memoria += t4;}
				if(linha.contains("t5")){memoria += t5;}
				if(linha.contains("t6")){memoria += t6;}
				if(linha.contains("t7")){memoria += t7;}
				if(linha.contains("t8")){memoria += t8;}
				if(linha.contains("t9")){memoria += t9;}
				
				//variaveis @u0 - @u9
				if(linha.contains("u0")){memoria += u0;}
				if(linha.contains("u1")){memoria += u1;}
				if(linha.contains("u2")){memoria += u2;}
				if(linha.contains("u3")){memoria += u3;}
				if(linha.contains("u4")){memoria += u4;}
				if(linha.contains("u5")){memoria += u5;}
				if(linha.contains("u6")){memoria += u6;}
				if(linha.contains("u7")){memoria += u7;}
				if(linha.contains("u8")){memoria += u8;}
				if(linha.contains("u9")){memoria += u9;}
				
				//variaveis @v0 - @v9
				if(linha.contains("v0")){memoria += v0;}
				if(linha.contains("v1")){memoria += v1;}
				if(linha.contains("v2")){memoria += v2;}
				if(linha.contains("v3")){memoria += v3;}
				if(linha.contains("v4")){memoria += v4;}
				if(linha.contains("v5")){memoria += v5;}
				if(linha.contains("v6")){memoria += v6;}
				if(linha.contains("v7")){memoria += v7;}
				if(linha.contains("v8")){memoria += v8;}
				if(linha.contains("v9")){memoria += v9;}
				
				//variaveis @w0 - @w9
				if(linha.contains("w0")){memoria += w0;}
				if(linha.contains("w1")){memoria += w1;}
				if(linha.contains("w2")){memoria += w2;}
				if(linha.contains("w3")){memoria += w3;}
				if(linha.contains("w4")){memoria += w4;}
				if(linha.contains("w5")){memoria += w5;}
				if(linha.contains("w6")){memoria += w6;}
				if(linha.contains("w7")){memoria += w7;}
				if(linha.contains("w8")){memoria += w8;}
				if(linha.contains("w9")){memoria += w9;}
				
				//variaveis @x0 - @x9
				if(linha.contains("x0")){memoria += x0;}
				if(linha.contains("x1")){memoria += x1;}
				if(linha.contains("x2")){memoria += x2;}
				if(linha.contains("x3")){memoria += x3;}
				if(linha.contains("x4")){memoria += x4;}
				if(linha.contains("x5")){memoria += x5;}
				if(linha.contains("x6")){memoria += x6;}
				if(linha.contains("x7")){memoria += x7;}
				if(linha.contains("x8")){memoria += x8;}
				if(linha.contains("x9")){memoria += x9;}
			
				//variaveis @y0 - @y9
				if(linha.contains("y0")){memoria += y0;}
				if(linha.contains("y1")){memoria += y1;}
				if(linha.contains("y2")){memoria += y2;}
				if(linha.contains("y3")){memoria += y3;}
				if(linha.contains("y4")){memoria += y4;}
				if(linha.contains("y5")){memoria += y5;}
				if(linha.contains("y6")){memoria += y6;}
				if(linha.contains("y7")){memoria += y7;}
				if(linha.contains("y8")){memoria += y8;}
				if(linha.contains("y9")){memoria += y9;}
				
				//variaveis @z0 - @z9
				if(linha.contains("z0")){memoria += z0;}
				if(linha.contains("z1")){memoria += z1;}
				if(linha.contains("z2")){memoria += z2;}
				if(linha.contains("z3")){memoria += z3;}
				if(linha.contains("z4")){memoria += z4;}
				if(linha.contains("z5")){memoria += z5;}
				if(linha.contains("z6")){memoria += z6;}
				if(linha.contains("z7")){memoria += z7;}
				if(linha.contains("z8")){memoria += z8;}
				if(linha.contains("z9")){memoria += z9;}
			}
			
			public static void inputVar(){
				//Variaveis @a0 - @a9
				if(input.contains("a0")){a0 = textField.getText();}
				if(input.contains("a1")){a1 = textField.getText();}
				if(input.contains("a2")){a2 = textField.getText();}
				if(input.contains("a3")){a3 = textField.getText();}
				if(input.contains("a4")){a4 = textField.getText();}
				if(input.contains("a5")){a5 = textField.getText();}
				if(input.contains("a6")){a6 = textField.getText();}
				if(input.contains("a7")){a7 = textField.getText();}
				if(input.contains("a8")){a8 = textField.getText();}
				if(input.contains("a9")){a9 = textField.getText();}
				
				//variaveis @b0 - @b9
				if(input.contains("b0")){b0 = textField.getText();}
				if(input.contains("b1")){b1 = textField.getText();}
				if(input.contains("b2")){b2 = textField.getText();}
				if(input.contains("b3")){b3 = textField.getText();}
				if(input.contains("b4")){b4 = textField.getText();}
				if(input.contains("b5")){b5 = textField.getText();}
				if(input.contains("b6")){b6 = textField.getText();}
				if(input.contains("b7")){b7 = textField.getText();}
				if(input.contains("b8")){b8 = textField.getText();}
				if(input.contains("b9")){b9 = textField.getText();}
				
				//variaveis @c0 - @c9
				if(input.contains("c0")){c0 = textField.getText();}
				if(input.contains("c1")){c1 = textField.getText();}
				if(input.contains("c2")){c2 = textField.getText();}
				if(input.contains("c3")){c3 = textField.getText();}
				if(input.contains("c4")){c4 = textField.getText();}
				if(input.contains("c5")){c5 = textField.getText();}
				if(input.contains("c6")){c6 = textField.getText();}
				if(input.contains("c7")){c7 = textField.getText();}
				if(input.contains("c8")){c8 = textField.getText();}
				if(input.contains("c9")){c9 = textField.getText();}
				
				//variaveis @d0 - @d9
				if(input.contains("d0")){d0 = textField.getText();}
				if(input.contains("d1")){d1 = textField.getText();}
				if(input.contains("d2")){d2 = textField.getText();}
				if(input.contains("d3")){d3 = textField.getText();}
				if(input.contains("d4")){d4 = textField.getText();}
				if(input.contains("d5")){d5 = textField.getText();}
				if(input.contains("d6")){d6 = textField.getText();}
				if(input.contains("d7")){d7 = textField.getText();}
				if(input.contains("d8")){d8 = textField.getText();}
				if(input.contains("d9")){d9 = textField.getText();}
				
				//variaveis @e0 - @e9
				if(input.contains("e0")){e0 = textField.getText();}
				if(input.contains("e1")){e1 = textField.getText();}
				if(input.contains("e2")){e2 = textField.getText();}
				if(input.contains("e3")){e3 = textField.getText();}
				if(input.contains("e4")){e4 = textField.getText();}
				if(input.contains("e5")){e5 = textField.getText();}
				if(input.contains("e6")){e6 = textField.getText();}
				if(input.contains("e7")){e7 = textField.getText();}
				if(input.contains("e8")){e8 = textField.getText();}
				if(input.contains("e9")){e9 = textField.getText();}
				
				//variaveis @f0 - @f9
				if(input.contains("f0")){f0 = textField.getText();}
				if(input.contains("f1")){f1 = textField.getText();}
				if(input.contains("f2")){f2 = textField.getText();}
				if(input.contains("f3")){f3 = textField.getText();}
				if(input.contains("f4")){f4 = textField.getText();}
				if(input.contains("f5")){f5 = textField.getText();}
				if(input.contains("f6")){f6 = textField.getText();}
				if(input.contains("f7")){f7 = textField.getText();}
				if(input.contains("f8")){f8 = textField.getText();}
				if(input.contains("f9")){f9 = textField.getText();}
				
				//variaveis @g0 - @g9
				if(input.contains("g0")){g0 = textField.getText();}
				if(input.contains("g1")){g1 = textField.getText();}
				if(input.contains("g2")){g2 = textField.getText();}
				if(input.contains("g3")){g3 = textField.getText();}
				if(input.contains("g4")){g4 = textField.getText();}
				if(input.contains("g5")){g5 = textField.getText();}
				if(input.contains("g6")){g6 = textField.getText();}
				if(input.contains("g7")){g7 = textField.getText();}
				if(input.contains("g8")){g8 = textField.getText();}
				if(input.contains("g9")){g9 = textField.getText();}
				
				//variaveis @h0 - @h9
				if(input.contains("h0")){h0 = textField.getText();}
				if(input.contains("h1")){h1 = textField.getText();}
				if(input.contains("h2")){h2 = textField.getText();}
				if(input.contains("h3")){h3 = textField.getText();}
				if(input.contains("h4")){h4 = textField.getText();}
				if(input.contains("h5")){h5 = textField.getText();}
				if(input.contains("h6")){h6 = textField.getText();}
				if(input.contains("h7")){h7 = textField.getText();}
				if(input.contains("h8")){h8 = textField.getText();}
				if(input.contains("h9")){h9 = textField.getText();}
						
				//variaveis @i0 - @ = textField.getText()i9
				if(input.contains("i0")){i0 = textField.getText();}
				if(input.contains("i1")){i1 = textField.getText();}
				if(input.contains("i2")){i2 = textField.getText();}
				if(input.contains("i3")){i3 = textField.getText();}
				if(input.contains("i4")){i4 = textField.getText();}
				if(input.contains("i5")){i5 = textField.getText();}
				if(input.contains("i6")){i6 = textField.getText();}
				if(input.contains("i7")){i7 = textField.getText();}
				if(input.contains("i8")){i8 = textField.getText();}
				if(input.contains("i9")){i9 = textField.getText();}
				
				//variaveis @j0 - @j9
				if(input.contains("j0")){j0 = textField.getText();}
				if(input.contains("j1")){j1 = textField.getText();}
				if(input.contains("j2")){j2 = textField.getText();}
				if(input.contains("j3")){j3 = textField.getText();}
				if(input.contains("j4")){j4 = textField.getText();}
				if(input.contains("j5")){j5 = textField.getText();}
				if(input.contains("j6")){j6 = textField.getText();}
				if(input.contains("j7")){j7 = textField.getText();}
				if(input.contains("j8")){j8 = textField.getText();}
				if(input.contains("j9")){j9 = textField.getText();}
				
				//variaveis @k0 - @k9
				if(input.contains("k0")){k0 = textField.getText();}
				if(input.contains("k1")){k1 = textField.getText();}
				if(input.contains("k2")){k2 = textField.getText();}
				if(input.contains("k3")){k3 = textField.getText();}
				if(input.contains("k4")){k4 = textField.getText();}
				if(input.contains("k5")){k5 = textField.getText();}
				if(input.contains("k6")){k6 = textField.getText();}
				if(input.contains("k7")){k7 = textField.getText();}
				if(input.contains("k8")){k8 = textField.getText();}
				if(input.contains("k9")){k9 = textField.getText();}
			
				//variaveis @jl - @l9
				if(input.contains("l0")){l0 = textField.getText();}
				if(input.contains("l1")){l1 = textField.getText();}
				if(input.contains("l2")){l2 = textField.getText();}
				if(input.contains("l3")){l3 = textField.getText();}
				if(input.contains("l4")){l4 = textField.getText();}
				if(input.contains("l5")){l5 = textField.getText();}
				if(input.contains("l6")){l6 = textField.getText();}
				if(input.contains("l7")){l7 = textField.getText();}
				if(input.contains("l8")){l8 = textField.getText();}
				if(input.contains("l9")){l9 = textField.getText();}
				
				//variaveis @m0 - @m9
				if(input.contains("m0")){m0 = textField.getText();}
				if(input.contains("m1")){m1 = textField.getText();}
				if(input.contains("m2")){m2 = textField.getText();}
				if(input.contains("m3")){m3 = textField.getText();}
				if(input.contains("m4")){m4 = textField.getText();}
				if(input.contains("m5")){m5 = textField.getText();}
				if(input.contains("m6")){m6 = textField.getText();}
				if(input.contains("m7")){m7 = textField.getText();}
				if(input.contains("m8")){m8 = textField.getText();}
				if(input.contains("m9")){m9 = textField.getText();}
				
				//variaveis @n0 - @n9
				if(input.contains("n0")){n0 = textField.getText();}
				if(input.contains("n1")){n1 = textField.getText();}
				if(input.contains("n2")){n2 = textField.getText();}
				if(input.contains("n3")){n3 = textField.getText();}
				if(input.contains("n4")){n4 = textField.getText();}
				if(input.contains("n5")){n5 = textField.getText();}
				if(input.contains("n6")){n6 = textField.getText();}
				if(input.contains("n7")){n7 = textField.getText();}
				if(input.contains("n8")){n8 = textField.getText();}
				if(input.contains("n9")){n9 = textField.getText();}
				
				//variaveis @o0 - @o9
				if(input.contains("o0")){o0 = textField.getText();}
				if(input.contains("o1")){o1 = textField.getText();}
				if(input.contains("o2")){o2 = textField.getText();}
				if(input.contains("o3")){o3 = textField.getText();}
				if(input.contains("o4")){o4 = textField.getText();}
				if(input.contains("o5")){o5 = textField.getText();}
				if(input.contains("o6")){o6 = textField.getText();}
				if(input.contains("o7")){o7 = textField.getText();}
				if(input.contains("o8")){o8 = textField.getText();}
				if(input.contains("o9")){o9 = textField.getText();}
				
				//variaveis @p0 - @p9
				if(input.contains("p0")){p0 = textField.getText();}
				if(input.contains("p1")){p1 = textField.getText();}
				if(input.contains("p2")){p2 = textField.getText();}
				if(input.contains("p3")){p3 = textField.getText();}
				if(input.contains("p4")){p4 = textField.getText();}
				if(input.contains("p5")){p5 = textField.getText();}
				if(input.contains("p6")){p6 = textField.getText();}
				if(input.contains("p7")){p7 = textField.getText();}
				if(input.contains("p8")){p8 = textField.getText();}
				if(input.contains("p9")){p9 = textField.getText();}
				
				//variaveis @q0 - @q9
				if(input.contains("q0")){q0 = textField.getText();}
				if(input.contains("q1")){q1 = textField.getText();}
				if(input.contains("q2")){q2 = textField.getText();}
				if(input.contains("q3")){q3 = textField.getText();}
				if(input.contains("q4")){q4 = textField.getText();}
				if(input.contains("q5")){q5 = textField.getText();}
				if(input.contains("q6")){q6 = textField.getText();}
				if(input.contains("q7")){q7 = textField.getText();}
				if(input.contains("q8")){q8 = textField.getText();}
				if(input.contains("q9")){q9 = textField.getText();}
				
				//variaveis @r0 - @r9
				if(input.contains("r0")){r0 = textField.getText();}
				if(input.contains("r1")){r1 = textField.getText();}
				if(input.contains("r2")){r2 = textField.getText();}
				if(input.contains("r3")){r3 = textField.getText();}
				if(input.contains("r4")){r4 = textField.getText();}
				if(input.contains("r5")){r5 = textField.getText();}
				if(input.contains("r6")){r6 = textField.getText();}
				if(input.contains("r7")){r7 = textField.getText();}
				if(input.contains("r8")){r8 = textField.getText();}
				if(input.contains("r9")){r9 = textField.getText();}
				
				//variaveis @s0 - @s9
				if(input.contains("s0")){s0 = textField.getText();}
				if(input.contains("s1")){s1 = textField.getText();}
				if(input.contains("s2")){s2 = textField.getText();}
				if(input.contains("s3")){s3 = textField.getText();}
				if(input.contains("s4")){s4 = textField.getText();}
				if(input.contains("s5")){s5 = textField.getText();}
				if(input.contains("s6")){s6 = textField.getText();}
				if(input.contains("s7")){s7 = textField.getText();}
				if(input.contains("s8")){s8 = textField.getText();}
				if(input.contains("s9")){s9 = textField.getText();}
				
				//variaveis @t0 - @t9
				if(input.contains("t0")){t0 = textField.getText();}
				if(input.contains("t1")){t1 = textField.getText();}
				if(input.contains("t2")){t2 = textField.getText();}
				if(input.contains("t3")){t3 = textField.getText();}
				if(input.contains("t4")){t4 = textField.getText();}
				if(input.contains("t5")){t5 = textField.getText();}
				if(input.contains("t6")){t6 = textField.getText();}
				if(input.contains("t7")){t7 = textField.getText();}
				if(input.contains("t8")){t8 = textField.getText();}
				if(input.contains("t9")){t9 = textField.getText();}
				
				//variaveis @u0 - @u9
				if(input.contains("u0")){u0 = textField.getText();}
				if(input.contains("u1")){u1 = textField.getText();}
				if(input.contains("u2")){u2 = textField.getText();}
				if(input.contains("u3")){u3 = textField.getText();}
				if(input.contains("u4")){u4 = textField.getText();}
				if(input.contains("u5")){u5 = textField.getText();}
				if(input.contains("u6")){u6 = textField.getText();}
				if(input.contains("u7")){u7 = textField.getText();}
				if(input.contains("u8")){u8 = textField.getText();}
				if(input.contains("u9")){u9 = textField.getText();}
				
				//variaveis @v0 - @v9
				if(input.contains("v0")){v0 = textField.getText();}
				if(input.contains("v1")){v1 = textField.getText();}
				if(input.contains("v2")){v2 = textField.getText();}
				if(input.contains("v3")){v3 = textField.getText();}
				if(input.contains("v4")){v4 = textField.getText();}
				if(input.contains("v5")){v5 = textField.getText();}
				if(input.contains("v6")){v6 = textField.getText();}
				if(input.contains("v7")){v7 = textField.getText();}
				if(input.contains("v8")){v8 = textField.getText();}
				if(input.contains("v9")){v9 = textField.getText();}
				
				//variaveis @w0 - @w9
				if(input.contains("w0")){w0 = textField.getText();}
				if(input.contains("w1")){w1 = textField.getText();}
				if(input.contains("w2")){w2 = textField.getText();}
				if(input.contains("w3")){w3 = textField.getText();}
				if(input.contains("w4")){w4 = textField.getText();}
				if(input.contains("w5")){w5 = textField.getText();}
				if(input.contains("w6")){w6 = textField.getText();}
				if(input.contains("w7")){w7 = textField.getText();}
				if(input.contains("w8")){w8 = textField.getText();}
				if(input.contains("w9")){w9 = textField.getText();}
				
				//variaveis @x0 - @x9
				if(input.contains("x0")){x0 = textField.getText();}
				if(input.contains("x1")){x1 = textField.getText();}
				if(input.contains("x2")){x2 = textField.getText();}
				if(input.contains("x3")){x3 = textField.getText();}
				if(input.contains("x4")){x4 = textField.getText();}
				if(input.contains("x5")){x5 = textField.getText();}
				if(input.contains("x6")){x6 = textField.getText();}
				if(input.contains("x7")){x7 = textField.getText();}
				if(input.contains("x8")){x8 = textField.getText();}
				if(input.contains("x9")){x9 = textField.getText();}
			
				//variaveis @y0 - @y9
				if(input.contains("y0")){y0 = textField.getText();}
				if(input.contains("y1")){y1 = textField.getText();}
				if(input.contains("y2")){y2 = textField.getText();}
				if(input.contains("y3")){y3 = textField.getText();}
				if(input.contains("y4")){y4 = textField.getText();}
				if(input.contains("y5")){y5 = textField.getText();}
				if(input.contains("y6")){y6 = textField.getText();}
				if(input.contains("y7")){y7 = textField.getText();}
				if(input.contains("y8")){y8 = textField.getText();}
				if(input.contains("y9")){y9 = textField.getText();}
				
				//variaveis @z0 - @z9
				if(input.contains("z0")){z0 = textField.getText();}
				if(input.contains("z1")){z1 = textField.getText();}
				if(input.contains("z2")){z2 = textField.getText();}
				if(input.contains("z3")){z3 = textField.getText();}
				if(input.contains("z4")){z4 = textField.getText();}
				if(input.contains("z5")){z5 = textField.getText();}
				if(input.contains("z6")){z6 = textField.getText();}
				if(input.contains("z7")){z7 = textField.getText();}
				if(input.contains("z8")){z8 = textField.getText();}
				if(input.contains("z9")){z9 = textField.getText();}
			}
			
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
						memoria += textSis1;
						sisVariables();
					}
					if(!textSis2.equals("") & textSis1.equals("")){
						sisVariables();
						memoria += textSis2;
					}
					if(!textSis1.equals("") & !textSis2.equals("")){
						memoria += textSis1;
						sisVariables();
						memoria += textSis2;
					}
					if(textSis1.equals("") & textSis2.equals("")){
						sisVariables();
					}
				}
				
				
				if(operation.equals("+")){
					if(!textSis1.equals("") & textSis2.equals("")){
						
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
					}
					
					if(!textSis1.equals("") & !textSis2.equals("")){
						memoria += textSis1;
						
						integerOperation = integers(val1)+integers(val2);
						memoria += integerOperation;
						integerOperation = 0;
						
						memoria += textSis2;
						
					}
					
					if(textSis1.equals("") & textSis2.equals("")){
					
						integerOperation = integers(val1)+integers(val2);
						memoria += integerOperation;
						integerOperation = 0;
						
					}
				}else
					if(operation.equals("-")){
						if(!textSis1.equals("") & textSis2.equals("")){
							
							memoria += textSis1;
							
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
						}
						
						if(!textSis2.equals("") & textSis1.equals("")){
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
							memoria += textSis2;
						}
						
						if(!textSis1.equals("") & !textSis2.equals("")){
							memoria += textSis1;
							
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
							memoria += textSis2;
							
						}
						
						if(textSis1.equals("") & textSis2.equals("")){
							
							integerOperation = integers(val1)-integers(val2);
							memoria += integerOperation;
							integerOperation = 0;
							
						}
					}else
						if(operation.equals("*")){
							if(!textSis1.equals("") & textSis2.equals("")){
								
								memoria += textSis1;
								
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
							}
							
							if(!textSis2.equals("") & textSis1.equals("")){
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
								memoria += textSis2;
							}
							
							if(!textSis1.equals("") & !textSis2.equals("")){
								memoria += textSis1;
								
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
								memoria += textSis2;
								
							}
							
							if(textSis1.equals("") & textSis2.equals("")){
								
								integerOperation = integers(val1)*integers(val2);
								memoria += integerOperation;
								integerOperation = 0;
								
							}
						}else
							if(operation.equals("/")){
								if(!textSis1.equals("") & textSis2.equals("")){
									
									memoria += textSis1;
									
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
								}
								
								if(!textSis2.equals("") & textSis1.equals("")){
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
									memoria += textSis2;
								}
								
								if(!textSis1.equals("") & !textSis2.equals("")){
									memoria += textSis1;
									
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
									memoria += textSis2;
									
								}
								
								if(textSis1.equals("") & textSis2.equals("")){
									
									integerOperation = integers(val1)/integers(val2);
									memoria += integerOperation;
									integerOperation = 0;
									
								}
							}else
								if(operation.equals("<")){
									
									if(!textSis1.equals("") & textSis2.equals("")){
										
										memoria += textSis1;
										
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
									}
									
									if(!textSis2.equals("") & textSis1.equals("")){
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
										memoria += textSis2;
									}
									
									if(!textSis1.equals("") & !textSis2.equals("")){
										memoria += textSis1;
										
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
										memoria += textSis2;
										
									}
									
									if(textSis1.equals("") & textSis2.equals("")){
										
										if(integers(val1) < integers(val2)){comparation = true;}else{comparation = false;}
										if(comparation){memoria += true;}else{memoria += false;}
										
									}
									
									
									
								}else
									if(operation.equals(">")){
										if(!textSis1.equals("") & textSis2.equals("")){
											
											memoria += textSis1;
											
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
										}
										
										if(!textSis2.equals("") & textSis1.equals("")){
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
											memoria += textSis2;
										}
										
										if(!textSis1.equals("") & !textSis2.equals("")){
											memoria += textSis1;
											
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
											memoria += textSis2;
											
										}
										
										if(textSis1.equals("") & textSis2.equals("")){
											
											if(integers(val1) > integers(val2)){comparation = true;}else{comparation = false;}
											if(comparation){memoria += true;}else{memoria += false;}
											
										}
									}else
										if(operation.equals("==")){
											if(!textSis1.equals("") & textSis2.equals("")){
												
												memoria += textSis1;
												
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
											}
											
											if(!textSis2.equals("") & textSis1.equals("")){
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
												memoria += textSis2;
											}
											
											if(!textSis1.equals("") & !textSis2.equals("")){
												memoria += textSis1;
												
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
												memoria += textSis2;
												
											}
											
											if(textSis1.equals("") & textSis2.equals("")){
												
												if(integers(val1) == integers(val2)){comparation = true;}else{comparation = false;}
												if(comparation){memoria += true;}else{memoria += false;}
												
											}
										}else
											if(operation.equals("!=")){
												if(!textSis1.equals("") & textSis2.equals("")){
													
													memoria += textSis1;
													
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
												}
												
												if(!textSis2.equals("") & textSis1.equals("")){
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
													memoria += textSis2;
												}
												
												if(!textSis1.equals("") & !textSis2.equals("")){
													memoria += textSis1;
													
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
													memoria += textSis2;
													
												}
												
												if(textSis1.equals("") & textSis2.equals("")){
													
													if(integers(val1) != integers(val2)){comparation = true;}else{comparation = false;}
													if(comparation){memoria += true;}else{memoria += false;}
													
												}
											}
				
			}
			
			//Método que analisa a primeira variavel na condição
			public static void firstIfVar(){
				
				
				if(if1.contains("@a0")){if1 = a0;}if(if1.contains("@a1")){if1 = a1;}
				if(if1.contains("@a2")){if1 = a2;}if(if1.contains("@a3")){if1 = a3;}
				if(if1.contains("@a4")){if1 = a4;}if(if1.contains("@a5")){if1 = a5;}
				if(if1.contains("@a6")){if1 = a6;}if(if1.contains("@a7")){if1 = a7;}
				if(if1.contains("@a8")){if1 = a8;}if(if1.contains("@a9")){if1 = a9;}
				
				if(if1.contains("@b0")){if1 = b0;}if(if1.contains("@b1")){if1 = b1;}
				if(if1.contains("@b2")){if1 = b2;}if(if1.contains("@b3")){if1 = b3;}
				if(if1.contains("@b4")){if1 = b4;}if(if1.contains("@b5")){if1 = b5;}
				if(if1.contains("@b6")){if1 = b6;}if(if1.contains("@b7")){if1 = b7;}
				if(if1.contains("@b8")){if1 = b8;}if(if1.contains("@b9")){if1 = b9;}
				
				if(if1.contains("@c0")){if1 = c0;}if(if1.contains("@c1")){if1 = c1;}
				if(if1.contains("@c2")){if1 = c2;}if(if1.contains("@c3")){if1 = c3;}
				if(if1.contains("@c4")){if1 = c4;}if(if1.contains("@c5")){if1 = c5;}
				if(if1.contains("@c6")){if1 = c6;}if(if1.contains("@c7")){if1 = c7;}
				if(if1.contains("@c8")){if1 = c8;}if(if1.contains("@c9")){if1 = c9;}
				
				if(if1.contains("@d0")){if1 = d0;}if(if1.contains("@d1")){if1 = d1;}
				if(if1.contains("@d2")){if1 = d2;}if(if1.contains("@d3")){if1 = d3;}
				if(if1.contains("@d4")){if1 = d4;}if(if1.contains("@d5")){if1 = d5;}
				if(if1.contains("@d6")){if1 = d6;}if(if1.contains("@d7")){if1 = d7;}
				if(if1.contains("@d8")){if1 = d8;}if(if1.contains("@d9")){if1 = d9;}
			
				if(if1.contains("@e0")){if1 = e0;}if(if1.contains("@e1")){if1 = e1;}
				if(if1.contains("@e2")){if1 = e2;}if(if1.contains("@e3")){if1 = e3;}
				if(if1.contains("@e4")){if1 = e4;}if(if1.contains("@e5")){if1 = e5;}
				if(if1.contains("@e6")){if1 = e6;}if(if1.contains("@e7")){if1 = e7;}
				if(if1.contains("@e8")){if1 = e8;}if(if1.contains("@e9")){if1 = e9;}
			
				if(if1.contains("@f0")){if1 = f0;}if(if1.contains("@f1")){if1 = f1;}
				if(if1.contains("@f2")){if1 = f2;}if(if1.contains("@f3")){if1 = f3;}
				if(if1.contains("@f4")){if1 = f4;}if(if1.contains("@f5")){if1 = f5;}
				if(if1.contains("@f6")){if1 = f6;}if(if1.contains("@f7")){if1 = f7;}
				if(if1.contains("@f8")){if1 = f8;}if(if1.contains("@f9")){if1 = f9;}
			
				if(if1.contains("@g0")){if1 = g0;}if(if1.contains("@g1")){if1 = g1;}
				if(if1.contains("@g2")){if1 = g2;}if(if1.contains("@g3")){if1 = g3;}
				if(if1.contains("@g4")){if1 = g4;}if(if1.contains("@g5")){if1 = g5;}
				if(if1.contains("@g6")){if1 = g6;}if(if1.contains("@g7")){if1 = g7;}
				if(if1.contains("@g8")){if1 = g8;}if(if1.contains("@g9")){if1 = g9;}
				
				if(if1.contains("@h0")){if1 = h0;}if(if1.contains("@h1")){if1 = h1;}
				if(if1.contains("@h2")){if1 = h2;}if(if1.contains("@h3")){if1 = h3;}
				if(if1.contains("@h4")){if1 = h4;}if(if1.contains("@h5")){if1 = h5;}
				if(if1.contains("@h6")){if1 = h6;}if(if1.contains("@h7")){if1 = h7;}
				if(if1.contains("@h8")){if1 = h8;}if(if1.contains("@h9")){if1 = h9;}
			
				if(if1.contains("@i0")){if1 = i0;}if(if1.contains("@i1")){if1 = i1;}
				if(if1.contains("@i2")){if1 = i2;}if(if1.contains("@i3")){if1 = i3;}
				if(if1.contains("@i4")){if1 = i4;}if(if1.contains("@i5")){if1 = i5;}
				if(if1.contains("@i6")){if1 = i6;}if(if1.contains("@i7")){if1 = i7;}
				if(if1.contains("@i8")){if1 = i8;}if(if1.contains("@i9")){if1 = i9;}
				
				if(if1.contains("@j0")){if1 = j0;}if(if1.contains("@j1")){if1 = j1;}
				if(if1.contains("@j2")){if1 = j2;}if(if1.contains("@j3")){if1 = j3;}
				if(if1.contains("@j4")){if1 = j4;}if(if1.contains("@j5")){if1 = j5;}
				if(if1.contains("@j6")){if1 = j6;}if(if1.contains("@j7")){if1 = j7;}
				if(if1.contains("@j8")){if1 = j8;}if(if1.contains("@j9")){if1 = j9;}
				
				if(if1.contains("@k0")){if1 = k0;}if(if1.contains("@k1")){if1 = k1;}
				if(if1.contains("@k2")){if1 = k2;}if(if1.contains("@k3")){if1 = k3;}
				if(if1.contains("@k4")){if1 = k4;}if(if1.contains("@k5")){if1 = k5;}
				if(if1.contains("@k6")){if1 = k6;}if(if1.contains("@k7")){if1 = k7;}
				if(if1.contains("@k8")){if1 = k8;}if(if1.contains("@k9")){if1 = k9;}
				
				if(if1.contains("@l0")){if1 = l0;}if(if1.contains("@l1")){if1 = l1;}
				if(if1.contains("@l2")){if1 = l2;}if(if1.contains("@l3")){if1 = l3;}
				if(if1.contains("@l4")){if1 = l4;}if(if1.contains("@l5")){if1 = l5;}
				if(if1.contains("@l6")){if1 = l6;}if(if1.contains("@l7")){if1 = l7;}
				if(if1.contains("@l8")){if1 = l8;}if(if1.contains("@l9")){if1 = l9;}
				
				if(if1.contains("@m0")){if1 = m0;}if(if1.contains("@m1")){if1 = m1;}
				if(if1.contains("@m2")){if1 = m2;}if(if1.contains("@m3")){if1 = m3;}
				if(if1.contains("@m4")){if1 = m4;}if(if1.contains("@m5")){if1 = m5;}
				if(if1.contains("@m6")){if1 = m6;}if(if1.contains("@m7")){if1 = m7;}
				if(if1.contains("@m8")){if1 = m8;}if(if1.contains("@m9")){if1 = m9;}
				
				if(if1.contains("@n0")){if1 = n0;}if(if1.contains("@n1")){if1 = n1;}
				if(if1.contains("@n2")){if1 = n2;}if(if1.contains("@n3")){if1 = n3;}
				if(if1.contains("@n4")){if1 = n4;}if(if1.contains("@n5")){if1 = n5;}
				if(if1.contains("@n6")){if1 = n6;}if(if1.contains("@n7")){if1 = n7;}
				if(if1.contains("@n8")){if1 = n8;}if(if1.contains("@n9")){if1 = n9;}
			
				if(if1.contains("@o0")){if1 = o0;}if(if1.contains("@o1")){if1 = o1;}
				if(if1.contains("@o2")){if1 = o2;}if(if1.contains("@o3")){if1 = o3;}
				if(if1.contains("@o4")){if1 = o4;}if(if1.contains("@o5")){if1 = o5;}
				if(if1.contains("@o6")){if1 = o6;}if(if1.contains("@o7")){if1 = o7;}
				if(if1.contains("@o8")){if1 = o8;}if(if1.contains("@o9")){if1 = o9;}
				
				if(if1.contains("@p0")){if1 = p0;}if(if1.contains("@p1")){if1 = p1;}
				if(if1.contains("@p2")){if1 = p2;}if(if1.contains("@p3")){if1 = p3;}
				if(if1.contains("@p4")){if1 = p4;}if(if1.contains("@p5")){if1 = p5;}
				if(if1.contains("@p6")){if1 = p6;}if(if1.contains("@p7")){if1 = p7;}
				if(if1.contains("@p8")){if1 = p8;}if(if1.contains("@p9")){if1 = p9;}
				
				if(if1.contains("@q0")){if1 = q0;}if(if1.contains("@q1")){if1 = q1;}
				if(if1.contains("@q2")){if1 = q2;}if(if1.contains("@q3")){if1 = q3;}
				if(if1.contains("@q4")){if1 = q4;}if(if1.contains("@q5")){if1 = q5;}
				if(if1.contains("@q6")){if1 = q6;}if(if1.contains("@q7")){if1 = q7;}
				if(if1.contains("@q8")){if1 = q8;}if(if1.contains("@q9")){if1 = q9;}
				
				if(if1.contains("@r0")){if1 = r0;}if(if1.contains("@r1")){if1 = r1;}
				if(if1.contains("@r2")){if1 = r2;}if(if1.contains("@r3")){if1 = r3;}
				if(if1.contains("@r4")){if1 = r4;}if(if1.contains("@r5")){if1 = r5;}
				if(if1.contains("@r6")){if1 = r6;}if(if1.contains("@r7")){if1 = r7;}
				if(if1.contains("@r8")){if1 = r8;}if(if1.contains("@r9")){if1 = r9;}
				
				if(if1.contains("@s0")){if1 = s0;}if(if1.contains("@s1")){if1 = s1;}
				if(if1.contains("@s2")){if1 = s2;}if(if1.contains("@s3")){if1 = s3;}
				if(if1.contains("@s4")){if1 = s4;}if(if1.contains("@s5")){if1 = s5;}
				if(if1.contains("@s6")){if1 = s6;}if(if1.contains("@s7")){if1 = s7;}
				if(if1.contains("@s8")){if1 = s8;}if(if1.contains("@s9")){if1 = s9;}
				
				if(if1.contains("@t0")){if1 = t0;}if(if1.contains("@t1")){if1 = t1;}
				if(if1.contains("@t2")){if1 = t2;}if(if1.contains("@t3")){if1 = t3;}
				if(if1.contains("@t4")){if1 = t4;}if(if1.contains("@t5")){if1 = t5;}
				if(if1.contains("@t6")){if1 = t6;}if(if1.contains("@t7")){if1 = t7;}
				if(if1.contains("@t8")){if1 = t8;}if(if1.contains("@t9")){if1 = t9;}
				
				if(if1.contains("@u0")){if1 = u0;}if(if1.contains("@u1")){if1 = u1;}
				if(if1.contains("@u2")){if1 = u2;}if(if1.contains("@u3")){if1 = u3;}
				if(if1.contains("@u4")){if1 = u4;}if(if1.contains("@u5")){if1 = u5;}
				if(if1.contains("@u6")){if1 = u6;}if(if1.contains("@u7")){if1 = u7;}
				if(if1.contains("@u8")){if1 = u8;}if(if1.contains("@u9")){if1 = u9;}
				
				if(if1.contains("@v0")){if1 = v0;}if(if1.contains("@v1")){if1 = v1;}
				if(if1.contains("@v2")){if1 = v2;}if(if1.contains("@v3")){if1 = v3;}
				if(if1.contains("@v4")){if1 = v4;}if(if1.contains("@v5")){if1 = v5;}
				if(if1.contains("@v6")){if1 = v6;}if(if1.contains("@v7")){if1 = v7;}
				if(if1.contains("@v8")){if1 = v8;}if(if1.contains("@v9")){if1 = v9;}
				
				if(if1.contains("@w0")){if1 = w0;}if(if1.contains("@w1")){if1 = w1;}
				if(if1.contains("@w2")){if1 = w2;}if(if1.contains("@w3")){if1 = w3;}
				if(if1.contains("@w4")){if1 = w4;}if(if1.contains("@w5")){if1 = w5;}
				if(if1.contains("@w6")){if1 = w6;}if(if1.contains("@w7")){if1 = w7;}
				if(if1.contains("@w8")){if1 = w8;}if(if1.contains("@w9")){if1 = w9;}
			
				if(if1.contains("@x0")){if1 = x0;}if(if1.contains("@x1")){if1 = x1;}
				if(if1.contains("@x2")){if1 = x2;}if(if1.contains("@x3")){if1 = x3;}
				if(if1.contains("@x4")){if1 = x4;}if(if1.contains("@x5")){if1 = x5;}
				if(if1.contains("@x6")){if1 = x6;}if(if1.contains("@x7")){if1 = x7;}
				if(if1.contains("@x8")){if1 = x8;}if(if1.contains("@x9")){if1 = x9;}
				
				if(if1.contains("@y0")){if1 = y0;}if(if1.contains("@y1")){if1 = y1;}
				if(if1.contains("@y2")){if1 = y2;}if(if1.contains("@y3")){if1 = y3;}
				if(if1.contains("@y4")){if1 = y4;}if(if1.contains("@y5")){if1 = y5;}
				if(if1.contains("@y6")){if1 = y6;}if(if1.contains("@y7")){if1 = y7;}
				if(if1.contains("@y8")){if1 = y8;}if(if1.contains("@y9")){if1 = y9;}
				
				if(if1.contains("@z0")){if1 = z0;}if(if1.contains("@z1")){if1 = z1;}
				if(if1.contains("@z2")){if1 = z2;}if(if1.contains("@z3")){if1 = z3;}
				if(if1.contains("@z4")){if1 = z4;}if(if1.contains("@z5")){if1 = z5;}
				if(if1.contains("@z6")){if1 = z6;}if(if1.contains("@z7")){if1 = z7;}
				if(if1.contains("@z8")){if1 = z8;}if(if1.contains("@z9")){if1 = z9;}
			}
			
			//Método que analisa a primeira variavel na condição
			public static void secondIfVar(){
				
				
				if(if2.contains("@a0")){if2 = a0;}if(if2.contains("@a1")){if2 = a1;}
				if(if2.contains("@a2")){if2 = a2;}if(if2.contains("@a3")){if2 = a3;}
				if(if2.contains("@a4")){if2 = a4;}if(if2.contains("@a5")){if2 = a5;}
				if(if2.contains("@a6")){if2 = a6;}if(if2.contains("@a7")){if2 = a7;}
				if(if2.contains("@a8")){if2 = a8;}if(if2.contains("@a9")){if2 = a9;}
			
				if(if2.contains("@b0")){if2 = b0;}if(if2.contains("@b1")){if2 = b1;}
				if(if2.contains("@b2")){if2 = b2;}if(if2.contains("@b3")){if2 = b3;}
				if(if2.contains("@b4")){if2 = b4;}if(if2.contains("@b5")){if2 = b5;}
				if(if2.contains("@b6")){if2 = b6;}if(if2.contains("@b7")){if2 = b7;}
				if(if2.contains("@b8")){if2 = b8;}if(if2.contains("@b9")){if2 = b9;}
				
				if(if2.contains("@c0")){if2 = c0;}if(if2.contains("@c1")){if2 = c1;}
				if(if2.contains("@c2")){if2 = c2;}if(if2.contains("@c3")){if2 = c3;}
				if(if2.contains("@c4")){if2 = c4;}if(if2.contains("@c5")){if2 = c5;}
				if(if2.contains("@c6")){if2 = c6;}if(if2.contains("@c7")){if2 = c7;}
				if(if2.contains("@c8")){if2 = c8;}if(if2.contains("@c9")){if2 = c9;}
				
				if(if2.contains("@d0")){if2 = d0;}if(if2.contains("@d1")){if2 = d1;}
				if(if2.contains("@d2")){if2 = d2;}if(if2.contains("@d3")){if2 = d3;}
				if(if2.contains("@d4")){if2 = d4;}if(if2.contains("@d5")){if2 = d5;}
				if(if2.contains("@d6")){if2 = d6;}if(if2.contains("@d7")){if2 = d7;}
				if(if2.contains("@d8")){if2 = d8;}if(if2.contains("@d9")){if2 = d9;}
			
				if(if2.contains("@e0")){if2 = e0;}if(if2.contains("@e1")){if2 = e1;}
				if(if2.contains("@e2")){if2 = e2;}if(if2.contains("@e3")){if2 = e3;}
				if(if2.contains("@e4")){if2 = e4;}if(if2.contains("@e5")){if2 = e5;}
				if(if2.contains("@e6")){if2 = e6;}if(if2.contains("@e7")){if2 = e7;}
				if(if2.contains("@e8")){if2 = e8;}if(if2.contains("@e9")){if2 = e9;}
			
				if(if2.contains("@f0")){if2 = f0;}if(if2.contains("@f1")){if2 = f1;}
				if(if2.contains("@f2")){if2 = f2;}if(if2.contains("@f3")){if2 = f3;}
				if(if2.contains("@f4")){if2 = f4;}if(if2.contains("@f5")){if2 = f5;}
				if(if2.contains("@f6")){if2 = f6;}if(if2.contains("@f7")){if2 = f7;}
				if(if2.contains("@f8")){if2 = f8;}if(if2.contains("@f9")){if2 = f9;}
			
				if(if2.contains("@g0")){if2 = g0;}if(if2.contains("@g1")){if2 = g1;}
				if(if2.contains("@g2")){if2 = g2;}if(if2.contains("@g3")){if2 = g3;}
				if(if2.contains("@g4")){if2 = g4;}if(if2.contains("@g5")){if2 = g5;}
				if(if2.contains("@g6")){if2 = g6;}if(if2.contains("@g7")){if2 = g7;}
				if(if2.contains("@g8")){if2 = g8;}if(if2.contains("@g9")){if2 = g9;}
				
				if(if2.contains("@h0")){if2 = h0;}if(if2.contains("@h1")){if2 = h1;}
				if(if2.contains("@h2")){if2 = h2;}if(if2.contains("@h3")){if2 = h3;}
				if(if2.contains("@h4")){if2 = h4;}if(if2.contains("@h5")){if2 = h5;}
				if(if2.contains("@h6")){if2 = h6;}if(if2.contains("@h7")){if2 = h7;}
				if(if2.contains("@h8")){if2 = h8;}if(if2.contains("@h9")){if2 = h9;}
			
				if(if2.contains("@i0")){if2 = i0;}if(if2.contains("@i1")){if2 = i1;}
				if(if2.contains("@i2")){if2 = i2;}if(if2.contains("@i3")){if2 = i3;}
				if(if2.contains("@i4")){if2 = i4;}if(if2.contains("@i5")){if2 = i5;}
				if(if2.contains("@i6")){if2 = i6;}if(if2.contains("@i7")){if2 = i7;}
				if(if2.contains("@i8")){if2 = i8;}if(if2.contains("@i9")){if2 = i9;}
				
				if(if2.contains("@j0")){if2 = j0;}if(if2.contains("@j1")){if2 = j1;}
				if(if2.contains("@j2")){if2 = j2;}if(if2.contains("@j3")){if2 = j3;}
				if(if2.contains("@j4")){if2 = j4;}if(if2.contains("@j5")){if2 = j5;}
				if(if2.contains("@j6")){if2 = j6;}if(if2.contains("@j7")){if2 = j7;}
				if(if2.contains("@j8")){if2 = j8;}if(if2.contains("@j9")){if2 = j9;}
				
				if(if2.contains("@k0")){if2 = k0;}if(if2.contains("@k1")){if2 = k1;}
				if(if2.contains("@k2")){if2 = k2;}if(if2.contains("@k3")){if2 = k3;}
				if(if2.contains("@k4")){if2 = k4;}if(if2.contains("@k5")){if2 = k5;}
				if(if2.contains("@k6")){if2 = k6;}if(if2.contains("@k7")){if2 = k7;}
				if(if2.contains("@k8")){if2 = k8;}if(if2.contains("@k9")){if2 = k9;}
				
				if(if2.contains("@l0")){if2 = l0;}if(if2.contains("@l1")){if2 = l1;}
				if(if2.contains("@l2")){if2 = l2;}if(if2.contains("@l3")){if2 = l3;}
				if(if2.contains("@l4")){if2 = l4;}if(if2.contains("@l5")){if2 = l5;}
				if(if2.contains("@l6")){if2 = l6;}if(if2.contains("@l7")){if2 = l7;}
				if(if2.contains("@l8")){if2 = l8;}if(if2.contains("@l9")){if2 = l9;}
				
				if(if2.contains("@m0")){if2 = m0;}if(if2.contains("@m1")){if2 = m1;}
				if(if2.contains("@m2")){if2 = m2;}if(if2.contains("@m3")){if2 = m3;}
				if(if2.contains("@m4")){if2 = m4;}if(if2.contains("@m5")){if2 = m5;}
				if(if2.contains("@m6")){if2 = m6;}if(if2.contains("@m7")){if2 = m7;}
				if(if2.contains("@m8")){if2 = m8;}if(if2.contains("@m9")){if2 = m9;}
			
				if(if2.contains("@n0")){if2 = n0;}if(if2.contains("@n1")){if2 = n1;}
				if(if2.contains("@n2")){if2 = n2;}if(if2.contains("@n3")){if2 = n3;}
				if(if2.contains("@n4")){if2 = n4;}if(if2.contains("@n5")){if2 = n5;}
				if(if2.contains("@n6")){if2 = n6;}if(if2.contains("@n7")){if2 = n7;}
				if(if2.contains("@n8")){if2 = n8;}if(if2.contains("@n9")){if2= n9;}
			
				if(if2.contains("@o0")){if2 = o0;}if(if2.contains("@o1")){if2 = o1;}
				if(if2.contains("@o2")){if2 = o2;}if(if2.contains("@o3")){if2 = o3;}
				if(if2.contains("@o4")){if2 = o4;}if(if2.contains("@o5")){if2 = o5;}
				if(if2.contains("@o6")){if2 = o6;}if(if2.contains("@o7")){if2 = o7;}
				if(if2.contains("@o8")){if2 = o8;}if(if2.contains("@o9")){if2 = o9;}
				
				if(if2.contains("@p0")){if2 = p0;}if(if2.contains("@p1")){if2 = p1;}
				if(if2.contains("@p2")){if2 = p2;}if(if2.contains("@p3")){if2 = p3;}
				if(if2.contains("@p4")){if2 = p4;}if(if2.contains("@p5")){if2 = p5;}
				if(if2.contains("@p6")){if2 = p6;}if(if2.contains("@p7")){if2 = p7;}
				if(if2.contains("@p8")){if2 = p8;}if(if2.contains("@p9")){if2 = p9;}
				
				if(if2.contains("@q0")){if2 = q0;}if(if2.contains("@q1")){if2 = q1;}
				if(if2.contains("@q2")){if2 = q2;}if(if2.contains("@q3")){if2 = q3;}
				if(if2.contains("@q4")){if2 = q4;}if(if2.contains("@q5")){if2 = q5;}
				if(if2.contains("@q6")){if2 = q6;}if(if2.contains("@q7")){if2 = q7;}
				if(if2.contains("@q8")){if2 = q8;}if(if2.contains("@q9")){if2 = q9;}
				
				if(if2.contains("@r0")){if2 = r0;}if(if2.contains("@r1")){if2 = r1;}
				if(if2.contains("@r2")){if2 = r2;}if(if2.contains("@r3")){if2 = r3;}
				if(if2.contains("@r4")){if2 = r4;}if(if2.contains("@r5")){if2 = r5;}
				if(if2.contains("@r6")){if2 = r6;}if(if2.contains("@r7")){if2 = r7;}
				if(if2.contains("@r8")){if2 = r8;}if(if2.contains("@r9")){if2 = r9;}
				
				if(if2.contains("@s0")){if2 = s0;}if(if2.contains("@s1")){if2 = s1;}
				if(if2.contains("@s2")){if2 = s2;}if(if2.contains("@s3")){if2 = s3;}
				if(if2.contains("@s4")){if2 = s4;}if(if2.contains("@s5")){if2 = s5;}
				if(if2.contains("@s6")){if2 = s6;}if(if2.contains("@s7")){if2 = s7;}
				if(if2.contains("@s8")){if2 = s8;}if(if2.contains("@s9")){if2 = s9;}
			
				if(if2.contains("@t0")){if2 = t0;}if(if2.contains("@t1")){if2 = t1;}
				if(if2.contains("@t2")){if2 = t2;}if(if2.contains("@t3")){if2 = t3;}
				if(if2.contains("@t4")){if2 = t4;}if(if2.contains("@t5")){if2 = t5;}
				if(if2.contains("@t6")){if2 = t6;}if(if2.contains("@t7")){if2 = t7;}
				if(if2.contains("@t8")){if2 = t8;}if(if2.contains("@t9")){if2 = t9;}
				
				if(if2.contains("@u0")){if2 = u0;}if(if2.contains("@u1")){if2 = u1;}
				if(if2.contains("@u2")){if2 = u2;}if(if2.contains("@u3")){if2 = u3;}
				if(if2.contains("@u4")){if2 = u4;}if(if2.contains("@u5")){if2 = u5;}
				if(if2.contains("@u6")){if2 = u6;}if(if2.contains("@u7")){if2 = u7;}
				if(if2.contains("@u8")){if2 = u8;}if(if2.contains("@u9")){if2 = u9;}
				
				if(if2.contains("@v0")){if2 = v0;}if(if2.contains("@v1")){if2 = v1;}
				if(if2.contains("@v2")){if2 = v2;}if(if2.contains("@v3")){if2 = v3;}
				if(if2.contains("@v4")){if2 = v4;}if(if2.contains("@v5")){if2 = v5;}
				if(if2.contains("@v6")){if2 = v6;}if(if2.contains("@v7")){if2 = v7;}
				if(if2.contains("@v8")){if2 = v8;}if(if2.contains("@v9")){if2 = v9;}
				
				if(if2.contains("@w0")){if2 = w0;}if(if2.contains("@w1")){if2 = w1;}
				if(if2.contains("@w2")){if2 = w2;}if(if2.contains("@w3")){if2 = w3;}
				if(if2.contains("@w4")){if2 = w4;}if(if2.contains("@w5")){if2 = w5;}
				if(if2.contains("@w6")){if2 = w6;}if(if2.contains("@w7")){if2 = w7;}
				if(if2.contains("@w8")){if2 = w8;}if(if2.contains("@w9")){if2 = w9;}
			
				if(if2.contains("@x0")){if2 = x0;}if(if2.contains("@x1")){if2 = x1;}
				if(if2.contains("@x2")){if2 = x2;}if(if2.contains("@x3")){if2 = x3;}
				if(if2.contains("@x4")){if2 = x4;}if(if2.contains("@x5")){if2 = x5;}
				if(if2.contains("@x6")){if2 = x6;}if(if2.contains("@x7")){if2 = x7;}
				if(if2.contains("@x8")){if2 = x8;}if(if2.contains("@x9")){if2 = x9;}
				
				if(if2.contains("@y0")){if2 = y0;}if(if2.contains("@y1")){if2 = y1;}
				if(if2.contains("@y2")){if2 = y2;}if(if2.contains("@y3")){if2 = y3;}
				if(if2.contains("@y4")){if2 = y4;}if(if2.contains("@y5")){if2 = y5;}
				if(if2.contains("@y6")){if2 = y6;}if(if2.contains("@y7")){if2 = y7;}
				if(if2.contains("@y8")){if2 = y8;}if(if2.contains("@y9")){if2 = y9;}
				
				if(if2.contains("@z0")){if2 = z0;}if(if2.contains("@z1")){if2 = z1;}
				if(if2.contains("@z2")){if2 = z2;}if(if2.contains("@z3")){if2 = z3;}
				if(if2.contains("@z4")){if2 = z4;}if(if2.contains("@z5")){if2 = z5;}
				if(if2.contains("@z6")){if2 = z6;}if(if2.contains("@z7")){if2 = z7;}
				if(if2.contains("@z8")){if2 = z8;}if(if2.contains("@z9")){if2 = z9;}
			
			}
			
			//Método que analisa a primeira variavel na condição
			public static void thirtyIfVar(){
				
				
				if(if3.contains("@a0")){if3 = a0;}if(if3.contains("@a1")){if3 = a1;}
				if(if3.contains("@a2")){if3 = a2;}if(if3.contains("@a3")){if3 = a3;}
				if(if3.contains("@a4")){if3 = a4;}if(if3.contains("@a5")){if3 = a5;}
				if(if3.contains("@a6")){if3 = a6;}if(if3.contains("@a7")){if3 = a7;}
				if(if3.contains("@a8")){if3 = a8;}if(if3.contains("@a9")){if3 = a9;}
			
				if(if3.contains("@b0")){if3 = b0;}if(if3.contains("@b1")){if3 = b1;}
				if(if3.contains("@b2")){if3 = b2;}if(if3.contains("@b3")){if3 = b3;}
				if(if3.contains("@b4")){if3 = b4;}if(if3.contains("@b5")){if3 = b5;}
				if(if3.contains("@b6")){if3 = b6;}if(if3.contains("@b7")){if3 = b7;}
				if(if3.contains("@b8")){if3 = b8;}if(if3.contains("@b9")){if3 = b9;}
				
				if(if3.contains("@c0")){if3 = c0;}if(if3.contains("@c1")){if3 = c1;}
				if(if3.contains("@c2")){if3 = c2;}if(if3.contains("@c3")){if3 = c3;}
				if(if3.contains("@c4")){if3 = c4;}if(if3.contains("@c5")){if3 = c5;}
				if(if3.contains("@c6")){if3 = c6;}if(if3.contains("@c7")){if3 = c7;}
				if(if3.contains("@c8")){if3 = c8;}if(if3.contains("@c9")){if3 = c9;}
				
				if(if3.contains("@d0")){if3 = d0;}if(if3.contains("@d1")){if3 = d1;}
				if(if3.contains("@d2")){if3 = d2;}if(if3.contains("@d3")){if3 = d3;}
				if(if3.contains("@d4")){if3 = d4;}if(if3.contains("@d5")){if3 = d5;}
				if(if3.contains("@d6")){if3 = d6;}if(if3.contains("@d7")){if3 = d7;}
				if(if3.contains("@d8")){if3 = d8;}if(if3.contains("@d9")){if3 = d9;}
			
				if(if3.contains("@e0")){if3 = e0;}if(if3.contains("@e1")){if3 = e1;}
				if(if3.contains("@e2")){if3 = e2;}if(if3.contains("@e3")){if3 = e3;}
				if(if3.contains("@e4")){if3 = e4;}if(if3.contains("@e5")){if3 = e5;}
				if(if3.contains("@e6")){if3 = e6;}if(if3.contains("@e7")){if3 = e7;}
				if(if3.contains("@e8")){if3 = e8;}if(if3.contains("@e9")){if3 = e9;}
			
				if(if3.contains("@f0")){if3 = f0;}if(if3.contains("@f1")){if3 = f1;}
				if(if3.contains("@f2")){if3 = f2;}if(if3.contains("@f3")){if3 = f3;}
				if(if3.contains("@f4")){if3 = f4;}if(if3.contains("@f5")){if3 = f5;}
				if(if3.contains("@f6")){if3 = f6;}if(if3.contains("@f7")){if3 = f7;}
				if(if3.contains("@f8")){if3 = f8;}if(if3.contains("@f9")){if3 = f9;}
			
				if(if3.contains("@g0")){if3 = g0;}if(if3.contains("@g1")){if3 = g1;}
				if(if3.contains("@g2")){if3 = g2;}if(if3.contains("@g3")){if3 = g3;}
				if(if3.contains("@g4")){if3 = g4;}if(if3.contains("@g5")){if3 = g5;}
				if(if3.contains("@g6")){if3 = g6;}if(if3.contains("@g7")){if3 = g7;}
				if(if3.contains("@g8")){if3 = g8;}if(if3.contains("@g9")){if3 = g9;}
				
				if(if3.contains("@h0")){if3 = h0;}if(if3.contains("@h1")){if3 = h1;}
				if(if3.contains("@h2")){if3 = h2;}if(if3.contains("@h3")){if3 = h3;}
				if(if3.contains("@h4")){if3 = h4;}if(if3.contains("@h5")){if3 = h5;}
				if(if3.contains("@h6")){if3 = h6;}if(if3.contains("@h7")){if3 = h7;}
				if(if3.contains("@h8")){if3 = h8;}if(if3.contains("@h9")){if3 = h9;}
			
				if(if3.contains("@i0")){if3 = i0;}if(if3.contains("@i1")){if3 = i1;}
				if(if3.contains("@i2")){if3 = i2;}if(if3.contains("@i3")){if3 = i3;}
				if(if3.contains("@i4")){if3 = i4;}if(if3.contains("@i5")){if3 = i5;}
				if(if3.contains("@i6")){if3 = i6;}if(if3.contains("@i7")){if3 = i7;}
				if(if3.contains("@i8")){if3 = i8;}if(if3.contains("@i9")){if3 = i9;}
				
				if(if3.contains("@j0")){if3 = j0;}if(if3.contains("@j1")){if3 = j1;}
				if(if3.contains("@j2")){if3 = j2;}if(if3.contains("@j3")){if3 = j3;}
				if(if3.contains("@j4")){if3 = j4;}if(if3.contains("@j5")){if3 = j5;}
				if(if3.contains("@j6")){if3 = j6;}if(if3.contains("@j7")){if3 = j7;}
				if(if3.contains("@j8")){if3 = j8;}if(if3.contains("@j9")){if3 = j9;}
				
				if(if3.contains("@k0")){if3 = k0;}if(if3.contains("@k1")){if3 = k1;}
				if(if3.contains("@k2")){if3 = k2;}if(if3.contains("@k3")){if3 = k3;}
				if(if3.contains("@k4")){if3 = k4;}if(if3.contains("@k5")){if3 = k5;}
				if(if3.contains("@k6")){if3 = k6;}if(if3.contains("@k7")){if3 = k7;}
				if(if3.contains("@k8")){if3 = k8;}if(if3.contains("@k9")){if3 = k9;}
				
				if(if3.contains("@l0")){if3 = l0;}if(if3.contains("@l1")){if3 = l1;}
				if(if3.contains("@l2")){if3 = l2;}if(if3.contains("@l3")){if3 = l3;}
				if(if3.contains("@l4")){if3 = l4;}if(if3.contains("@l5")){if3 = l5;}
				if(if3.contains("@l6")){if3 = l6;}if(if3.contains("@l7")){if3 = l7;}
				if(if3.contains("@l8")){if3 = l8;}if(if3.contains("@l9")){if3 = l9;}
				
				if(if3.contains("@m0")){if3 = m0;}if(if3.contains("@m1")){if3 = m1;}
				if(if3.contains("@m2")){if3 = m2;}if(if3.contains("@m3")){if3 = m3;}
				if(if3.contains("@m4")){if3 = m4;}if(if3.contains("@m5")){if3 = m5;}
				if(if3.contains("@m6")){if3 = m6;}if(if3.contains("@m7")){if3 = m7;}
				if(if3.contains("@m8")){if3 = m8;}if(if3.contains("@m9")){if3 = m9;}
			
				if(if3.contains("@n0")){if3 = n0;}if(if3.contains("@n1")){if3 = n1;}
				if(if3.contains("@n2")){if3 = n2;}if(if3.contains("@n3")){if3 = n3;}
				if(if3.contains("@n4")){if3 = n4;}if(if3.contains("@n5")){if3 = n5;}
				if(if3.contains("@n6")){if3 = n6;}if(if3.contains("@n7")){if3 = n7;}
				if(if3.contains("@n8")){if3 = n8;}if(if3.contains("@n9")){if3 = n9;}
			
				if(if3.contains("@o0")){if3 = o0;}if(if3.contains("@o1")){if3 = o1;}
				if(if3.contains("@o2")){if3 = o2;}if(if3.contains("@o3")){if3 = o3;}
				if(if3.contains("@o4")){if3 = o4;}if(if3.contains("@o5")){if3 = o5;}
				if(if3.contains("@o6")){if3 = o6;}if(if3.contains("@o7")){if3 = o7;}
				if(if3.contains("@o8")){if3 = o8;}if(if3.contains("@o9")){if3 = o9;}
				
				if(if3.contains("@p0")){if3 = p0;}if(if3.contains("@p1")){if3 = p1;}
				if(if3.contains("@p2")){if3 = p2;}if(if3.contains("@p3")){if3 = p3;}
				if(if3.contains("@p4")){if3 = p4;}if(if3.contains("@p5")){if3 = p5;}
				if(if3.contains("@p6")){if3 = p6;}if(if3.contains("@p7")){if3 = p7;}
				if(if3.contains("@p8")){if3 = p8;}if(if3.contains("@p9")){if3 = p9;}
				
				if(if3.contains("@q0")){if3 = q0;}if(if3.contains("@q1")){if3 = q1;}
				if(if3.contains("@q2")){if3 = q2;}if(if3.contains("@q3")){if3 = q3;}
				if(if3.contains("@q4")){if3 = q4;}if(if3.contains("@q5")){if3 = q5;}
				if(if3.contains("@q6")){if3 = q6;}if(if3.contains("@q7")){if3 = q7;}
				if(if3.contains("@q8")){if3 = q8;}if(if3.contains("@q9")){if3 = q9;}
				
				if(if3.contains("@r0")){if3 = r0;}if(if3.contains("@r1")){if3 = r1;}
				if(if3.contains("@r2")){if3 = r2;}if(if3.contains("@r3")){if3 = r3;}
				if(if3.contains("@r4")){if3 = r4;}if(if3.contains("@r5")){if3 = r5;}
				if(if3.contains("@r6")){if3 = r6;}if(if3.contains("@r7")){if3 = r7;}
				if(if3.contains("@r8")){if3 = r8;}if(if3.contains("@r9")){if3 = r9;}
				
				if(if3.contains("@s0")){if3 = s0;}if(if3.contains("@s1")){if3 = s1;}
				if(if3.contains("@s2")){if3 = s2;}if(if3.contains("@s3")){if3 = s3;}
				if(if3.contains("@s4")){if3 = s4;}if(if3.contains("@s5")){if3 = s5;}
				if(if3.contains("@s6")){if3 = s6;}if(if3.contains("@s7")){if3 = s7;}
				if(if3.contains("@s8")){if3 = s8;}if(if3.contains("@s9")){if3 = s9;}
			
				if(if3.contains("@t0")){if3 = t0;}if(if3.contains("@t1")){if3 = t1;}
				if(if3.contains("@t2")){if3 = t2;}if(if3.contains("@t3")){if3 = t3;}
				if(if3.contains("@t4")){if3 = t4;}if(if3.contains("@t5")){if3 = t5;}
				if(if3.contains("@t6")){if3 = t6;}if(if3.contains("@t7")){if3 = t7;}
				if(if3.contains("@t8")){if3 = t8;}if(if3.contains("@t9")){if3 = t9;}
				
				if(if3.contains("@u0")){if3 = u0;}if(if3.contains("@u1")){if3 = u1;}
				if(if3.contains("@u2")){if3 = u2;}if(if3.contains("@u3")){if3 = u3;}
				if(if3.contains("@u4")){if3 = u4;}if(if3.contains("@u5")){if3 = u5;}
				if(if3.contains("@u6")){if3 = u6;}if(if3.contains("@u7")){if3 = u7;}
				if(if3.contains("@u8")){if3 = u8;}if(if3.contains("@u9")){if3 = u9;}
			
				if(if3.contains("@v0")){if3 = v0;}if(if3.contains("@v1")){if3 = v1;}
				if(if3.contains("@v2")){if3 = v2;}if(if3.contains("@v3")){if3 = v3;}
				if(if3.contains("@v4")){if3 = v4;}if(if3.contains("@v5")){if3 = v5;}
				if(if3.contains("@v6")){if3 = v6;}if(if3.contains("@v7")){if3 = v7;}
				if(if3.contains("@v8")){if3 = v8;}if(if3.contains("@v9")){if3 = v9;}
				
				if(if3.contains("@w0")){if3 = w0;}if(if3.contains("@w1")){if3 = w1;}
				if(if3.contains("@w2")){if3 = w2;}if(if3.contains("@w3")){if3 = w3;}
				if(if3.contains("@w4")){if3 = w4;}if(if3.contains("@w5")){if3 = w5;}
				if(if3.contains("@w6")){if3 = w6;}if(if3.contains("@w7")){if3 = w7;}
				if(if3.contains("@w8")){if3 = w8;}if(if3.contains("@w9")){if3 = w9;}
			
				if(if3.contains("@x0")){if3 = x0;}if(if3.contains("@x1")){if3 = x1;}
				if(if3.contains("@x2")){if3 = x2;}if(if3.contains("@x3")){if3 = x3;}
				if(if3.contains("@x4")){if3 = x4;}if(if3.contains("@x5")){if3 = x5;}
				if(if3.contains("@x6")){if3 = x6;}if(if3.contains("@x7")){if3 = x7;}
				if(if3.contains("@x8")){if3 = x8;}if(if3.contains("@x9")){if3 = x9;}
				
				if(if3.contains("@y0")){if3 = y0;}if(if3.contains("@y1")){if3 = y1;}
				if(if3.contains("@y2")){if3 = y2;}if(if3.contains("@y3")){if3 = y3;}
				if(if3.contains("@y4")){if3 = y4;}if(if3.contains("@y5")){if3 = y5;}
				if(if3.contains("@y6")){if3 = y6;}if(if3.contains("@y7")){if3 = y7;}
				if(if3.contains("@y8")){if3 = y8;}if(if3.contains("@y9")){if3 = y9;}
				
				if(if3.contains("@z0")){if3 = z0;}if(if3.contains("@z1")){if3 = z1;}
				if(if3.contains("@z2")){if3 = z2;}if(if3.contains("@z3")){if3 = z3;}
				if(if3.contains("@z4")){if3 = z4;}if(if3.contains("@z5")){if3 = z5;}
				if(if3.contains("@z6")){if3 = z6;}if(if3.contains("@z7")){if3 = z7;}
				if(if3.contains("@z8")){if3 = z8;}if(if3.contains("@z9")){if3 = z9;}
			
			}
			
			//Método que analisa a primeira variavel na condição
			public static void fourtyIfVar(){
				
				
				if(if4.contains("@a0")){if4 = a0;}if(if4.contains("@a1")){if3 = a1;}
				if(if4.contains("@a2")){if4 = a2;}if(if4.contains("@a3")){if3 = a3;}
				if(if4.contains("@a4")){if4 = a4;}if(if4.contains("@a5")){if3 = a5;}
				if(if4.contains("@a6")){if4 = a6;}if(if4.contains("@a7")){if3 = a7;}
				if(if4.contains("@a8")){if4 = a8;}if(if4.contains("@a9")){if3 = a9;}
			
				if(if4.contains("@b0")){if4 = b0;}if(if4.contains("@b1")){if3 = b1;}
				if(if4.contains("@b2")){if4 = b2;}if(if4.contains("@b3")){if3 = b3;}
				if(if4.contains("@b4")){if4 = b4;}if(if4.contains("@b5")){if3 = b5;}
				if(if4.contains("@b6")){if4 = b6;}if(if4.contains("@b7")){if3 = b7;}
				if(if4.contains("@b8")){if4 = b8;}if(if4.contains("@b9")){if3 = b9;}
				
				if(if4.contains("@c0")){if4 = c0;}if(if4.contains("@c1")){if3 = c1;}
				if(if4.contains("@c2")){if4 = c2;}if(if4.contains("@c3")){if3 = c3;}
				if(if4.contains("@c4")){if4 = c4;}if(if4.contains("@c5")){if3 = c5;}
				if(if4.contains("@c6")){if4 = c6;}if(if4.contains("@c7")){if3 = c7;}
				if(if4.contains("@c8")){if4 = c8;}if(if4.contains("@c9")){if3 = c9;}
				
				if(if4.contains("@d0")){if4 = d0;}if(if4.contains("@d1")){if3 = d1;}
				if(if4.contains("@d2")){if4 = d2;}if(if4.contains("@d3")){if3 = d3;}
				if(if4.contains("@d4")){if4 = d4;}if(if4.contains("@d5")){if3 = d5;}
				if(if4.contains("@d6")){if4 = d6;}if(if4.contains("@d7")){if3 = d7;}
				if(if4.contains("@d8")){if4 = d8;}if(if4.contains("@d9")){if3 = d9;}
			
				if(if4.contains("@e0")){if4 = e0;}if(if4.contains("@e1")){if3 = e1;}
				if(if4.contains("@e2")){if4 = e2;}if(if4.contains("@e3")){if3 = e3;}
				if(if4.contains("@e4")){if4 = e4;}if(if4.contains("@e5")){if3 = e5;}
				if(if4.contains("@e6")){if4 = e6;}if(if4.contains("@e7")){if3 = e7;}
				if(if4.contains("@e8")){if4 = e8;}if(if4.contains("@e9")){if3 = e9;}
			
				if(if4.contains("@f0")){if4 = f0;}if(if4.contains("@f1")){if3 = f1;}
				if(if4.contains("@f2")){if4 = f2;}if(if4.contains("@f3")){if3 = f3;}
				if(if4.contains("@f4")){if4 = f4;}if(if4.contains("@f5")){if3 = f5;}
				if(if4.contains("@f6")){if4 = f6;}if(if4.contains("@f7")){if3 = f7;}
				if(if4.contains("@f8")){if4 = f8;}if(if4.contains("@f9")){if3 = f9;}
			
				if(if4.contains("@g0")){if4 = g0;}if(if4.contains("@g1")){if3 = g1;}
				if(if4.contains("@g2")){if4 = g2;}if(if4.contains("@g3")){if3 = g3;}
				if(if4.contains("@g4")){if4 = g4;}if(if4.contains("@g5")){if3 = g5;}
				if(if4.contains("@g6")){if4 = g6;}if(if4.contains("@g7")){if3 = g7;}
				if(if4.contains("@g8")){if4 = g8;}if(if4.contains("@g9")){if3 = g9;}
				
				if(if4.contains("@h0")){if4 = h0;}if(if4.contains("@h1")){if3 = h1;}
				if(if4.contains("@h2")){if4 = h2;}if(if4.contains("@h3")){if3 = h3;}
				if(if4.contains("@h4")){if4 = h4;}if(if4.contains("@h5")){if3 = h5;}
				if(if4.contains("@h6")){if4 = h6;}if(if4.contains("@h7")){if3 = h7;}
				if(if4.contains("@h8")){if4 = h8;}if(if4.contains("@h9")){if3 = h9;}
			
				if(if4.contains("@i0")){if4 = i0;}if(if4.contains("@i1")){if3 = i1;}
				if(if4.contains("@i2")){if4 = i2;}if(if4.contains("@i3")){if3 = i3;}
				if(if4.contains("@i4")){if4 = i4;}if(if4.contains("@i5")){if3 = i5;}
				if(if4.contains("@i6")){if4 = i6;}if(if4.contains("@i7")){if3 = i7;}
				if(if4.contains("@i8")){if4 = i8;}if(if4.contains("@i9")){if3 = i9;}
				
				if(if4.contains("@j0")){if4 = j0;}if(if4.contains("@j1")){if3 = j1;}
				if(if4.contains("@j2")){if4 = j2;}if(if4.contains("@j3")){if3 = j3;}
				if(if4.contains("@j4")){if4 = j4;}if(if4.contains("@j5")){if3 = j5;}
				if(if4.contains("@j6")){if4 = j6;}if(if4.contains("@j7")){if3 = j7;}
				if(if4.contains("@j8")){if4 = j8;}if(if4.contains("@j9")){if3 = j9;}
				
				if(if4.contains("@k0")){if4 = k0;}if(if4.contains("@k1")){if3 = k1;}
				if(if4.contains("@k2")){if4 = k2;}if(if4.contains("@k3")){if3 = k3;}
				if(if4.contains("@k4")){if4 = k4;}if(if4.contains("@k5")){if3 = k5;}
				if(if4.contains("@k6")){if4 = k6;}if(if4.contains("@k7")){if3 = k7;}
				if(if4.contains("@k8")){if4 = k8;}if(if4.contains("@k9")){if3 = k9;}
				
				if(if4.contains("@l0")){if4 = l0;}if(if4.contains("@l1")){if3 = l1;}
				if(if4.contains("@l2")){if4 = l2;}if(if4.contains("@l3")){if3 = l3;}
				if(if4.contains("@l4")){if4 = l4;}if(if4.contains("@l5")){if3 = l5;}
				if(if4.contains("@l6")){if4 = l6;}if(if4.contains("@l7")){if3 = l7;}
				if(if4.contains("@l8")){if4 = l8;}if(if4.contains("@l9")){if3 = l9;}
				
				if(if4.contains("@m0")){if4 = m0;}if(if4.contains("@m1")){if3 = m1;}
				if(if4.contains("@m2")){if4 = m2;}if(if4.contains("@m3")){if3 = m3;}
				if(if4.contains("@m4")){if4 = m4;}if(if4.contains("@m5")){if3 = m5;}
				if(if4.contains("@m6")){if4 = m6;}if(if4.contains("@m7")){if3 = m7;}
				if(if4.contains("@m8")){if4 = m8;}if(if4.contains("@m9")){if3 = m9;}
			
				if(if4.contains("@n0")){if4 = n0;}if(if4.contains("@n1")){if3 = n1;}
				if(if4.contains("@n2")){if4 = n2;}if(if4.contains("@n3")){if3 = n3;}
				if(if4.contains("@n4")){if4 = n4;}if(if4.contains("@n5")){if3 = n5;}
				if(if4.contains("@n6")){if4 = n6;}if(if4.contains("@n7")){if3 = n7;}
				if(if4.contains("@n8")){if4 = n8;}if(if4.contains("@n9")){if3 = n9;}
			
				if(if4.contains("@o0")){if4 = o0;}if(if4.contains("@o1")){if3 = o1;}
				if(if4.contains("@o2")){if4 = o2;}if(if4.contains("@o3")){if3 = o3;}
				if(if4.contains("@o4")){if4 = o4;}if(if4.contains("@o5")){if3 = o5;}
				if(if4.contains("@o6")){if4 = o6;}if(if4.contains("@o7")){if3 = o7;}
				if(if4.contains("@o8")){if4 = o8;}if(if4.contains("@o9")){if3 = o9;}
				
				if(if4.contains("@p0")){if4 = p0;}if(if4.contains("@p1")){if3 = p1;}
				if(if4.contains("@p2")){if4 = p2;}if(if4.contains("@p3")){if3 = p3;}
				if(if4.contains("@p4")){if4 = p4;}if(if4.contains("@p5")){if3 = p5;}
				if(if4.contains("@p6")){if4 = p6;}if(if4.contains("@p7")){if3 = p7;}
				if(if4.contains("@p8")){if4 = p8;}if(if4.contains("@p9")){if3 = p9;}
				
				if(if4.contains("@q0")){if4 = q0;}if(if4.contains("@q1")){if3 = q1;}
				if(if4.contains("@q2")){if4 = q2;}if(if4.contains("@q3")){if3 = q3;}
				if(if4.contains("@q4")){if4 = q4;}if(if4.contains("@q5")){if3 = q5;}
				if(if4.contains("@q6")){if4 = q6;}if(if4.contains("@q7")){if3 = q7;}
				if(if4.contains("@q8")){if4 = q8;}if(if4.contains("@q9")){if3 = q9;}
				
				if(if4.contains("@r0")){if4 = r0;}if(if4.contains("@r1")){if3 = r1;}
				if(if4.contains("@r2")){if4 = r2;}if(if4.contains("@r3")){if3 = r3;}
				if(if4.contains("@r4")){if4 = r4;}if(if4.contains("@r5")){if3 = r5;}
				if(if4.contains("@r6")){if4 = r6;}if(if4.contains("@r7")){if3 = r7;}
				if(if4.contains("@r8")){if4 = r8;}if(if4.contains("@r9")){if3 = r9;}
			
				if(if4.contains("@s0")){if4 = s0;}if(if4.contains("@s1")){if3 = s1;}
				if(if4.contains("@s2")){if4 = s2;}if(if4.contains("@s3")){if3 = s3;}
				if(if4.contains("@s4")){if4 = s4;}if(if4.contains("@s5")){if3 = s5;}
				if(if4.contains("@s6")){if4 = s6;}if(if4.contains("@s7")){if3 = s7;}
				if(if4.contains("@s8")){if4 = s8;}if(if4.contains("@s9")){if3 = s9;}
		
				if(if4.contains("@t0")){if4 = t0;}if(if4.contains("@t1")){if3 = t1;}
				if(if4.contains("@t2")){if4 = t2;}if(if4.contains("@t3")){if3 = t3;}
				if(if4.contains("@t4")){if4 = t4;}if(if4.contains("@t5")){if3 = t5;}
				if(if4.contains("@t6")){if4 = t6;}if(if4.contains("@t7")){if3 = t7;}
				if(if4.contains("@t8")){if4 = t8;}if(if4.contains("@t9")){if3 = t9;}
			
				if(if4.contains("@u0")){if4 = u0;}if(if4.contains("@u1")){if3 = u1;}
				if(if4.contains("@u2")){if4 = u2;}if(if4.contains("@u3")){if3 = u3;}
				if(if4.contains("@u4")){if4 = u4;}if(if4.contains("@u5")){if3 = u5;}
				if(if4.contains("@u6")){if4 = u6;}if(if4.contains("@u7")){if3 = u7;}
				if(if4.contains("@u8")){if4 = u8;}if(if4.contains("@u9")){if3 = u9;}
			
				if(if4.contains("@v0")){if4 = v0;}if(if4.contains("@v1")){if3 = v1;}
				if(if4.contains("@v2")){if4 = v2;}if(if4.contains("@v3")){if3 = v3;}
				if(if4.contains("@v4")){if4 = v4;}if(if4.contains("@v5")){if3 = v5;}
				if(if4.contains("@v6")){if4 = v6;}if(if4.contains("@v7")){if3 = v7;}
				if(if4.contains("@v8")){if4 = v8;}if(if4.contains("@v9")){if3 = v9;}
				
				if(if4.contains("@w0")){if4 = w0;}if(if4.contains("@w1")){if3 = w1;}
				if(if4.contains("@w2")){if4 = w2;}if(if4.contains("@w3")){if3 = w3;}
				if(if4.contains("@w4")){if4 = w4;}if(if4.contains("@w5")){if3 = w5;}
				if(if4.contains("@w6")){if4 = w6;}if(if4.contains("@w7")){if3 = w7;}
				if(if4.contains("@w8")){if4 = w8;}if(if4.contains("@w9")){if3 = w9;}
			
				if(if4.contains("@x0")){if4 = x0;}if(if4.contains("@x1")){if3 = x1;}
				if(if4.contains("@x2")){if4 = x2;}if(if4.contains("@x3")){if3 = x3;}
				if(if4.contains("@x4")){if4 = x4;}if(if4.contains("@x5")){if3 = x5;}
				if(if4.contains("@x6")){if4 = x6;}if(if4.contains("@x7")){if3 = x7;}
				if(if4.contains("@x8")){if4 = x8;}if(if4.contains("@x9")){if3 = x9;}
				
				if(if4.contains("@y0")){if4 = y0;}if(if4.contains("@y1")){if3 = y1;}
				if(if4.contains("@y2")){if4 = y2;}if(if4.contains("@y3")){if3 = y3;}
				if(if4.contains("@y4")){if4 = y4;}if(if4.contains("@y5")){if3 = y5;}
				if(if4.contains("@y6")){if4 = y6;}if(if4.contains("@y7")){if3 = y7;}
				if(if4.contains("@y8")){if4 = y8;}if(if4.contains("@y9")){if3 = y9;}
				
				if(if4.contains("@z0")){if4 = z0;}if(if4.contains("@z1")){if3 = z1;}
				if(if4.contains("@z2")){if4 = z2;}if(if4.contains("@z3")){if3 = z3;}
				if(if4.contains("@z4")){if4 = z4;}if(if4.contains("@z5")){if3 = z5;}
				if(if4.contains("@z6")){if4 = z6;}if(if4.contains("@z7")){if3 = z7;}
				if(if4.contains("@z8")){if4 = z8;}if(if4.contains("@z9")){if3 = z9;}
		
			}
			
	public LangPlax() throws IOException{}
	
	public static void langPlax(String lang) throws IOException{
	
		frame = new JFrame();
		
		try {
			
			scanFilePlax(paths);
			    
		if (linha.contains("#output") & memoriaBase.contains("#output") & memoriaBase.contains("*Var") & memoriaBase.contains("$EndVar") & memoriaBase.contains("Start") & memoriaBase.contains("Final") & memoriaBase.contains("%")){//verifica se começa pela Palavra e não
			
			consoleVisibility(lang);
		
			while (linha != null) {
				
				
				
				functionInput();
				if(lang.equals("read")){
					
					
					while(!linha.contains("exec[call["+call+"]].")){
						
						linha = lerArq.readLine();
						
						
					}
					
					lang = "normal";
					if(linha.contains("exec[call["+call+"]].")){
						linha = lerArq.readLine();


					
					}
				}
				functionWhile();
				functionIfElse();
				debugLines();
				functionGUIS();
				
				paramConsole();
				if(linha.contains("exec[")){
					String getCaminho = new File("").getAbsolutePath();
					String exec = linha.substring(linha.indexOf("exec[")+5, linha.lastIndexOf("]."));
					if(exec.contains("call[")){
						call  = exec.substring(exec.indexOf("call[")+5, exec.lastIndexOf("]"));
						try {
							
							langPlax1(getCaminho+"\\Plax\\"+call);
						} catch (IOException e) {}
						
					}
					
					if(exec.contains("prompt[")){
						String prompt = exec.substring(exec.indexOf("prompt[")+7, exec.lastIndexOf("]"));
						Runtime.getRuntime().exec("CMD /c "+prompt);
						
					}
				}
				defineVariables();
				//infoProgram();
				if(linha.trim().equals("Final")){
					memoria += "<font size='5'><b>"
							+ "<br><br>*********************************</b></font>";
					
				}
				functionPrinter();
					
				if(linha.contains("func") && linha.contains("_")){
					func = linha.substring(linha.indexOf("func")+4, linha.lastIndexOf("]")+1);
					System.out.println(func);
					saveFunc += func + ".";
					@SuppressWarnings("unused")
					String argFunc = func.substring(func.indexOf("[")+1, func.lastIndexOf("]"));
				
					while(!linha.contains("endFunc")){
						System.out.println(linha);
						linha = lerArq.readLine();
						
					}
					
				}
				if(linha.contains("$EndVar")){
					EndVar = true;
				}
				if(EndVar){
					if(saveFunc.trim().contains(linha.trim()) && linha.contains("[") && linha.contains("].") && linha.contains("_")){
						String function = linha.trim();
			
						scan = new Scanner(new File(paths));
						linha = scan.nextLine();
						while(!linha.contains("func "+function)){
							linha = scan.nextLine();
						}
						
						while(!linha.contains("endFunc")){
							linha = scan.nextLine();
							LineAnalysis();
							
						}
						
					}
					
					
				}
				
				
				
				if(linha.contains("bl")){memoria += "<br>";}
				if(linha.contains("stop")){initConsole.console.setText("<font size='5'>"+memoria+"<br><br>Execução finalizada.<br>*********************************</font>");condWhile = false;break;}
				
				
				if(linha.contains("Final")){initConsole.console.setText("<font size='5'>"+memoria+"</font>");break;}
				
				
				if(linha.contains("%")){EndVar = false;}
				
				
				linha = lerArq.readLine();
				codeLine = codeLine + 1;
			
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
			
			
			
			//Definição do arquivo para 1ª leitura
			FileReader file = new FileReader(caminho);
		    BufferedReader read = new BufferedReader(file);
		    String text = read.readLine();
		      
		    //Definição do arquivo para 2ª leitura
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
		if (linha.contains("#output") & memoriaBase1.contains("#output") & memoriaBase1.contains("*Var") & memoriaBase1.contains("$EndVar") & memoriaBase1.contains("Start") & memoriaBase1.contains("Final") & memoriaBase1.contains("%")){//verifica se começa pela Palavra e não
			
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
					System.out.println("a linha é: "+if0);
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
						if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-not-"));
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
							if2 = ol1.substring(ol1.indexOf("-has-")+4, ol1.lastIndexOf("]"));
							
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
							if2 = ol1.substring(ol1.indexOf("-has-")+4, ol1.lastIndexOf("]"));
							
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
									
									
								} //else alfabético
								
							}else{
								
								stringVars();
								
								
							} //else númerico
							
						}else{
							valueWithVars();
						}    //else @
						
					}   //else []
					
					
					
				}
				
				//Final lexer do armazenamento de variaveis	
				
				
				
				/*String subPath = path.getText().substring(path.getText().indexOf("Plax")+5, path.getText().indexOf(".plax")+5);
				//Lexer de informações do programa
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
			
			
			
			
			
			//Final lexer de informações do programa
			
				//Lexer da exibição de variaveis
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
				//Final lexer de exibição das variaveis
				
				//Lexer de exibição de strings
				if(linha.contains("sis[") & !linha.contains("@")){
					sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
					
					//Lexer de formatação de textos
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
					//Final lexer de formatação
					
					initConsole.console.setText(memoria);
				}
				//Final lexer de exibição de strings
				
				
				//Lexer de simples comandos
				if(linha.contains("bl")){memoria += "<br>";}
				if(linha.contains("stop")){initConsole.console.setText("<font size='5'>"+memoria+"<br><br>Execução finalizada.<br>*********************************</font>");break;}
				//Final de lexer de simples comandos
			
				
				if(linha.contains("Final")){initConsole.console.setText("<font size='5'>"+memoria+"</font>");}
				
				if(linha.contains("Final")){
					langPlax("read");
					
				}
				
				
				linha = lerArq.readLine();
			}
			
			memoria = ""; 
			memoriaBase = "";
			//Erro de Falta de declaração das variáveis
			a0 = "<html><font color='red'>a variavel @a0 não foi declarada!</font></html>";
			a1 = "<html><font color='red'>a variavel @a1 não foi declarada!</font></html>";
			a2 = "<html><font color='red'>a variavel @a2 não foi declarada!</font></html>";
			a3 = "<html><font color='red'>a variavel @a3 não foi declarada!</font></html>";
			a4 = "<html><font color='red'>a variavel @a4 não foi declarada!</font></html>";
			a5 = "<html><font color='red'>a variavel @a5 não foi declarada!</font></html>";
			a6 = "<html><font color='red'>a variavel @a6 não foi declarada!</font></html>";
			a7 = "<html><font color='red'>a variavel @a7 não foi declarada!</font></html>";
			a8 = "<html><font color='red'>a variavel @a8 não foi declarada!</font></html>";
			a9 = "<html><font color='red'>a variavel @a9 não foi declarada!</font></html>";
			b0 = "<html><font color='red'>a variavel @b0 não foi declarada!</font></html>";
			b1 = "<html><font color='red'>a variavel @b1 não foi declarada!</font></html>";
			b2 = "<html><font color='red'>a variavel @b2 não foi declarada!</font></html>";
			b3 = "<html><font color='red'>a variavel @b3 não foi declarada!</font></html>";
			b4 = "<html><font color='red'>a variavel @b4 não foi declarada!</font></html>";
			b5 = "<html><font color='red'>a variavel @b5 não foi declarada!</font></html>";
			b6 = "<html><font color='red'>a variavel @b6 não foi declarada!</font></html>";
			b7 = "<html><font color='red'>a variavel @b7 não foi declarada!</font></html>";
			b8 = "<html><font color='red'>a variavel @b8 não foi declarada!</font></html>";
			b9 = "<html><font color='red'>a variavel @b9 não foi declarada!</font></html>";
			c0 = "<html><font color='red'>a variavel @c0 não foi declarada!</font></html>";
			c1 = "<html><font color='red'>a variavel @c1 não foi declarada!</font></html>";
			c2 = "<html><font color='red'>a variavel @c2 não foi declarada!</font></html>";
			c3 = "<html><font color='red'>a variavel @c3 não foi declarada!</font></html>";
			c4 = "<html><font color='red'>a variavel @c4 não foi declarada!</font></html>";
			c5 = "<html><font color='red'>a variavel @c5 não foi declarada!</font></html>";
			c6 = "<html><font color='red'>a variavel @c6 não foi declarada!</font></html>";
			c7 = "<html><font color='red'>a variavel @c7 não foi declarada!</font></html>";
			c8 = "<html><font color='red'>a variavel @c8 não foi declarada!</font></html>";
			c9 = "<html><font color='red'>a variavel @c9 não foi declarada!</font></html>";
			d0 = "<html><font color='red'>a variavel @d0 não foi declarada!</font></html>";
			d1 = "<html><font color='red'>a variavel @d1 não foi declarada!</font></html>";
			d2 = "<html><font color='red'>a variavel @d2 não foi declarada!</font></html>";
			d3 = "<html><font color='red'>a variavel @d3 não foi declarada!</font></html>";
			d4 = "<html><font color='red'>a variavel @d4 não foi declarada!</font></html>";
			d5 = "<html><font color='red'>a variavel @d5 não foi declarada!</font></html>";
			d6 = "<html><font color='red'>a variavel @d6 não foi declarada!</font></html>";
			d7 = "<html><font color='red'>a variavel @d7 não foi declarada!</font></html>";
			d8 = "<html><font color='red'>a variavel @d8 não foi declarada!</font></html>";
			d9 = "<html><font color='red'>a variavel @d9 não foi declarada!</font></html>";
			e0 = "<html><font color='red'>a variavel @e0 não foi declarada!</font></html>";
			e1 = "<html><font color='red'>a variavel @e1 não foi declarada!</font></html>";
			e2 = "<html><font color='red'>a variavel @e2 não foi declarada!</font></html>";
			e3 = "<html><font color='red'>a variavel @e3 não foi declarada!</font></html>";
			e4 = "<html><font color='red'>a variavel @e4 não foi declarada!</font></html>";
			e5 = "<html><font color='red'>a variavel @e5 não foi declarada!</font></html>";
			e6 = "<html><font color='red'>a variavel @e6 não foi declarada!</font></html>";
			e7 = "<html><font color='red'>a variavel @e7 não foi declarada!</font></html>";
			e8 = "<html><font color='red'>a variavel @e8 não foi declarada!</font></html>";
			e9 = "<html><font color='red'>a variavel @e9 não foi declarada!</font></html>";
			f0 = "<html><font color='red'>a variavel @f0 não foi declarada!</font></html>";
			f1 = "<html><font color='red'>a variavel @f1 não foi declarada!</font></html>";
			f2 = "<html><font color='red'>a variavel @f2 não foi declarada!</font></html>";
			f3 = "<html><font color='red'>a variavel @f3 não foi declarada!</font></html>";
			f4 = "<html><font color='red'>a variavel @f4 não foi declarada!</font></html>";
			f5 = "<html><font color='red'>a variavel @f5 não foi declarada!</font></html>";
			f6 = "<html><font color='red'>a variavel @f6 não foi declarada!</font></html>";
			f7 = "<html><font color='red'>a variavel @f7 não foi declarada!</font></html>";
			f8 = "<html><font color='red'>a variavel @f8 não foi declarada!</font></html>";
			f9 = "<html><font color='red'>a variavel @f9 não foi declarada!</font></html>";
			g0 = "<html><font color='red'>a variavel @g0 não foi declarada!</font></html>";
			g1 = "<html><font color='red'>a variavel @g1 não foi declarada!</font></html>";
			g2 = "<html><font color='red'>a variavel @g2 não foi declarada!</font></html>";
			g3 = "<html><font color='red'>a variavel @g3 não foi declarada!</font></html>";
			g4 = "<html><font color='red'>a variavel @g4 não foi declarada!</font></html>";
			g5 = "<html><font color='red'>a variavel @g5 não foi declarada!</font></html>";
			g6 = "<html><font color='red'>a variavel @g6 não foi declarada!</font></html>";
			g7 = "<html><font color='red'>a variavel @g7 não foi declarada!</font></html>";
			g8 = "<html><font color='red'>a variavel @g8 não foi declarada!</font></html>";
			g9 = "<html><font color='red'>a variavel @g9 não foi declarada!</font></html>";
			h0 = "<html><font color='red'>a variavel @a0 não foi declarada!</font></html>";
			h1 = "<html><font color='red'>a variavel @h1 não foi declarada!</font></html>";
			h2 = "<html><font color='red'>a variavel @h2 não foi declarada!</font></html>";
			h3 = "<html><font color='red'>a variavel @h3 não foi declarada!</font></html>";
			h4 = "<html><font color='red'>a variavel @h4 não foi declarada!</font></html>";
			h5 = "<html><font color='red'>a variavel @h5 não foi declarada!</font></html>";
			h6 = "<html><font color='red'>a variavel @h6 não foi declarada!</font></html>";
			h7 = "<html><font color='red'>a variavel @h7 não foi declarada!</font></html>";
			h8 = "<html><font color='red'>a variavel @h8 não foi declarada!</font></html>";
			h9 = "<html><font color='red'>a variavel @h9 não foi declarada!</font></html>";
			i0 = "<html><font color='red'>a variavel @i0 não foi declarada!</font></html>";
			i1 = "<html><font color='red'>a variavel @i1 não foi declarada!</font></html>";
			i2 = "<html><font color='red'>a variavel @i2 não foi declarada!</font></html>";
			i3 = "<html><font color='red'>a variavel @i3 não foi declarada!</font></html>";
			i4 = "<html><font color='red'>a variavel @i4 não foi declarada!</font></html>";
			i5 = "<html><font color='red'>a variavel @i5 não foi declarada!</font></html>";
			i6 = "<html><font color='red'>a variavel @i6 não foi declarada!</font></html>";
			i7 = "<html><font color='red'>a variavel @i7 não foi declarada!</font></html>";
			i8 = "<html><font color='red'>a variavel @i8 não foi declarada!</font></html>";
			i9 = "<html><font color='red'>a variavel @i9 não foi declarada!</font></html>";
			j0 = "<html><font color='red'>a variavel @j0 não foi declarada!</font></html>";
			j1 = "<html><font color='red'>a variavel @j1 não foi declarada!</font></html>";
			j2 = "<html><font color='red'>a variavel @j2 não foi declarada!</font></html>";
			j3 = "<html><font color='red'>a variavel @j3 não foi declarada!</font></html>";
			j4 = "<html><font color='red'>a variavel @j4 não foi declarada!</font></html>";
			j5 = "<html><font color='red'>a variavel @j5 não foi declarada!</font></html>";
			j6 = "<html><font color='red'>a variavel @j6 não foi declarada!</font></html>";
			j7 = "<html><font color='red'>a variavel @j7 não foi declarada!</font></html>";
			j8 = "<html><font color='red'>a variavel @j8 não foi declarada!</font></html>";
			j9 = "<html><font color='red'>a variavel @j9 não foi declarada!</font></html>";
			k0 = "<html><font color='red'>a variavel @k0 não foi declarada!</font></html>";
			k1 = "<html><font color='red'>a variavel @k1 não foi declarada!</font></html>";
			k2 = "<html><font color='red'>a variavel @k2 não foi declarada!</font></html>";
			k3 = "<html><font color='red'>a variavel @k3 não foi declarada!</font></html>";
			k4 = "<html><font color='red'>a variavel @k4 não foi declarada!</font></html>";
			k5 = "<html><font color='red'>a variavel @k5 não foi declarada!</font></html>";
			k6 = "<html><font color='red'>a variavel @k6 não foi declarada!</font></html>";
			k7 = "<html><font color='red'>a variavel @k7 não foi declarada!</font></html>";
			k8 = "<html><font color='red'>a variavel @k8 não foi declarada!</font></html>";
			k9 = "<html><font color='red'>a variavel @k9 não foi declarada!</font></html>";
			l0 = "<html><font color='red'>a variavel @l0 não foi declarada!</font></html>";
			l1 = "<html><font color='red'>a variavel @l1 não foi declarada!</font></html>";
			l2 = "<html><font color='red'>a variavel @l2 não foi declarada!</font></html>";
			l3 = "<html><font color='red'>a variavel @l3 não foi declarada!</font></html>";
			l4 = "<html><font color='red'>a variavel @l4 não foi declarada!</font></html>";
			l5 = "<html><font color='red'>a variavel @l5 não foi declarada!</font></html>";
			l6 = "<html><font color='red'>a variavel @l6 não foi declarada!</font></html>";
			l7 = "<html><font color='red'>a variavel @l7 não foi declarada!</font></html>";
			l8 = "<html><font color='red'>a variavel @l8 não foi declarada!</font></html>";
			l9 = "<html><font color='red'>a variavel @l9 não foi declarada!</font></html>";
			m0 = "<html><font color='red'>a variavel @m0 não foi declarada!</font></html>";
			m1 = "<html><font color='red'>a variavel @m1 não foi declarada!</font></html>";
			m2 = "<html><font color='red'>a variavel @m2 não foi declarada!</font></html>";
			m3 = "<html><font color='red'>a variavel @m3 não foi declarada!</font></html>";
			m4 = "<html><font color='red'>a variavel @m4 não foi declarada!</font></html>";
			m5 = "<html><font color='red'>a variavel @m5 não foi declarada!</font></html>";
			m6 = "<html><font color='red'>a variavel @m6 não foi declarada!</font></html>";
			m7 = "<html><font color='red'>a variavel @m7 não foi declarada!</font></html>";
			m8 = "<html><font color='red'>a variavel @m8 não foi declarada!</font></html>";
			m9 = "<html><font color='red'>a variavel @m9 não foi declarada!</font></html>";
			n0 = "<html><font color='red'>a variavel @n0 não foi declarada!</font></html>";
			n1 = "<html><font color='red'>a variavel @n1 não foi declarada!</font></html>";
			n2 = "<html><font color='red'>a variavel @n2 não foi declarada!</font></html>";
			n3 = "<html><font color='red'>a variavel @n3 não foi declarada!</font></html>";
			n4 = "<html><font color='red'>a variavel @n4 não foi declarada!</font></html>";
			n5 = "<html><font color='red'>a variavel @n5 não foi declarada!</font></html>";
			n6 = "<html><font color='red'>a variavel @n6 não foi declarada!</font></html>";
			n7 = "<html><font color='red'>a variavel @n7 não foi declarada!</font></html>";
			n8 = "<html><font color='red'>a variavel @n8 não foi declarada!</font></html>";
			n9 = "<html><font color='red'>a variavel @n9 não foi declarada!</font></html>";
			o0 = "<html><font color='red'>a variavel @o0 não foi declarada!</font></html>";
			o1 = "<html><font color='red'>a variavel @o1 não foi declarada!</font></html>";
			o2 = "<html><font color='red'>a variavel @o2 não foi declarada!</font></html>";
			o3 = "<html><font color='red'>a variavel @o3 não foi declarada!</font></html>";
			o4 = "<html><font color='red'>a variavel @o4 não foi declarada!</font></html>";
			o5 = "<html><font color='red'>a variavel @o5 não foi declarada!</font></html>";
			o6 = "<html><font color='red'>a variavel @o6 não foi declarada!</font></html>";
			o7 = "<html><font color='red'>a variavel @o7 não foi declarada!</font></html>";
			o8 = "<html><font color='red'>a variavel @o8 não foi declarada!</font></html>";
			o9 = "<html><font color='red'>a variavel @o9 não foi declarada!</font></html>";
			p0 = "<html><font color='red'>a variavel @p0 não foi declarada!</font></html>";
			p1 = "<html><font color='red'>a variavel @p1 não foi declarada!</font></html>";
			p2 = "<html><font color='red'>a variavel @p2 não foi declarada!</font></html>";
			p3 = "<html><font color='red'>a variavel @p3 não foi declarada!</font></html>";
			p4 = "<html><font color='red'>a variavel @p4 não foi declarada!</font></html>";
			p5 = "<html><font color='red'>a variavel @p5 não foi declarada!</font></html>";
			p6 = "<html><font color='red'>a variavel @p6 não foi declarada!</font></html>";
			p7 = "<html><font color='red'>a variavel @p7 não foi declarada!</font></html>";
			p8 = "<html><font color='red'>a variavel @p8 não foi declarada!</font></html>";
			p9 = "<html><font color='red'>a variavel @p9 não foi declarada!</font></html>";
			q0 = "<html><font color='red'>a variavel @q0 não foi declarada!</font></html>";
			q1 = "<html><font color='red'>a variavel @q1 não foi declarada!</font></html>";
			q2 = "<html><font color='red'>a variavel @q2 não foi declarada!</font></html>";
			q3 = "<html><font color='red'>a variavel @q3 não foi declarada!</font></html>";
			q4 = "<html><font color='red'>a variavel @q4 não foi declarada!</font></html>";
			q5 = "<html><font color='red'>a variavel @q5 não foi declarada!</font></html>";
			q6 = "<html><font color='red'>a variavel @q6 não foi declarada!</font></html>";
			q7 = "<html><font color='red'>a variavel @q7 não foi declarada!</font></html>";
			q8 = "<html><font color='red'>a variavel @q8 não foi declarada!</font></html>";
			q9 = "<html><font color='red'>a variavel @q9 não foi declarada!</font></html>";
			r0 = "<html><font color='red'>a variavel @r0 não foi declarada!</font></html>";
			r1 = "<html><font color='red'>a variavel @r1 não foi declarada!</font></html>";
			r2 = "<html><font color='red'>a variavel @r2 não foi declarada!</font></html>";
			r3 = "<html><font color='red'>a variavel @r3 não foi declarada!</font></html>";
			r4 = "<html><font color='red'>a variavel @r4 não foi declarada!</font></html>";
			r5 = "<html><font color='red'>a variavel @r5 não foi declarada!</font></html>";
			r6 = "<html><font color='red'>a variavel @r6 não foi declarada!</font></html>";
			r7 = "<html><font color='red'>a variavel @r7 não foi declarada!</font></html>";
			r8 = "<html><font color='red'>a variavel @r8 não foi declarada!</font></html>";
			r9 = "<html><font color='red'>a variavel @s9 não foi declarada!</font></html>";
			s0 = "<html><font color='red'>a variavel @s0 não foi declarada!</font></html>";
			s1 = "<html><font color='red'>a variavel @s1 não foi declarada!</font></html>";
			s2 = "<html><font color='red'>a variavel @s2 não foi declarada!</font></html>";
			s3 = "<html><font color='red'>a variavel @s3 não foi declarada!</font></html>";
			s4 = "<html><font color='red'>a variavel @s4 não foi declarada!</font></html>";
			s5 = "<html><font color='red'>a variavel @s5 não foi declarada!</font></html>";
			s6 = "<html><font color='red'>a variavel @s6 não foi declarada!</font></html>";
			s7 = "<html><font color='red'>a variavel @s7 não foi declarada!</font></html>";
			s8 = "<html><font color='red'>a variavel @s8 não foi declarada!</font></html>";
			s9 = "<html><font color='red'>a variavel @s9 não foi declarada!</font></html>";
			t0 = "<html><font color='red'>a variavel @t0 não foi declarada!</font></html>";
			t1 = "<html><font color='red'>a variavel @t1 não foi declarada!</font></html>";
			t2 = "<html><font color='red'>a variavel @t2 não foi declarada!</font></html>";
			t3 = "<html><font color='red'>a variavel @t3 não foi declarada!</font></html>";
			t4 = "<html><font color='red'>a variavel @t4 não foi declarada!</font></html>";
			t5 = "<html><font color='red'>a variavel @t5 não foi declarada!</font></html>";
			t6 = "<html><font color='red'>a variavel @t6 não foi declarada!</font></html>";
			t7 = "<html><font color='red'>a variavel @t7 não foi declarada!</font></html>";
			t8 = "<html><font color='red'>a variavel @t8 não foi declarada!</font></html>";
			t9 = "<html><font color='red'>a variavel @t9 não foi declarada!</font></html>";
			u0 = "<html><font color='red'>a variavel @u0 não foi declarada!</font></html>";
			u1 = "<html><font color='red'>a variavel @u1 não foi declarada!</font></html>";
			u2 = "<html><font color='red'>a variavel @u2 não foi declarada!</font></html>";
			u3 = "<html><font color='red'>a variavel @u3 não foi declarada!</font></html>";
			u4 = "<html><font color='red'>a variavel @u4 não foi declarada!</font></html>";
			u5 = "<html><font color='red'>a variavel @u5 não foi declarada!</font></html>";
			u6 = "<html><font color='red'>a variavel @u6 não foi declarada!</font></html>";
			u7 = "<html><font color='red'>a variavel @u7 não foi declarada!</font></html>";
			u8 = "<html><font color='red'>a variavel @u8 não foi declarada!</font></html>";
			u9 = "<html><font color='red'>a variavel @u9 não foi declarada!</font></html>";
			v0 = "<html><font color='red'>a variavel @v0 não foi declarada!</font></html>";
			v1 = "<html><font color='red'>a variavel @v1 não foi declarada!</font></html>";
			v2 = "<html><font color='red'>a variavel @v2 não foi declarada!</font></html>";
			v3 = "<html><font color='red'>a variavel @v3 não foi declarada!</font></html>";
			v4 = "<html><font color='red'>a variavel @v4 não foi declarada!</font></html>";
			v5 = "<html><font color='red'>a variavel @v5 não foi declarada!</font></html>";
			v6 = "<html><font color='red'>a variavel @v6 não foi declarada!</font></html>";
			v7 = "<html><font color='red'>a variavel @v7 não foi declarada!</font></html>";
			v8 = "<html><font color='red'>a variavel @v8 não foi declarada!</font></html>";
			v9 = "<html><font color='red'>a variavel @v9 não foi declarada!</font></html>";
			w0 = "<html><font color='red'>a variavel @w0 não foi declarada!</font></html>";
			w1 = "<html><font color='red'>a variavel @w1 não foi declarada!</font></html>";
			w2 = "<html><font color='red'>a variavel @w2 não foi declarada!</font></html>";
			w3 = "<html><font color='red'>a variavel @w3 não foi declarada!</font></html>";
			w4 = "<html><font color='red'>a variavel @w4 não foi declarada!</font></html>";
			w5 = "<html><font color='red'>a variavel @w5 não foi declarada!</font></html>";
			w6 = "<html><font color='red'>a variavel @w6 não foi declarada!</font></html>";
			w7 = "<html><font color='red'>a variavel @w7 não foi declarada!</font></html>";
			w8 = "<html><font color='red'>a variavel @w8 não foi declarada!</font></html>";
			w9 = "<html><font color='red'>a variavel @w9 não foi declarada!</font></html>";
			x0 = "<html><font color='red'>a variavel @x0 não foi declarada!</font></html>";
			x1 = "<html><font color='red'>a variavel @x1 não foi declarada!</font></html>";
			x2 = "<html><font color='red'>a variavel @x2 não foi declarada!</font></html>";
			x3 = "<html><font color='red'>a variavel @x3 não foi declarada!</font></html>";
			x4 = "<html><font color='red'>a variavel @x4 não foi declarada!</font></html>";
			x5 = "<html><font color='red'>a variavel @x5 não foi declarada!</font></html>";
			x6 = "<html><font color='red'>a variavel @x6 não foi declarada!</font></html>";
			x7 = "<html><font color='red'>a variavel @x7 não foi declarada!</font></html>";
			x8 = "<html><font color='red'>a variavel @x8 não foi declarada!</font></html>";
			x9 = "<html><font color='red'>a variavel @x9 não foi declarada!</font></html>";
			y0 = "<html><font color='red'>a variavel @y0 não foi declarada!</font></html>";
			y1 = "<html><font color='red'>a variavel @y1 não foi declarada!</font></html>";
			y2 = "<html><font color='red'>a variavel @y2 não foi declarada!</font></html>";
			y3 = "<html><font color='red'>a variavel @y3 não foi declarada!</font></html>";
			y4 = "<html><font color='red'>a variavel @y4 não foi declarada!</font></html>";
			y5 = "<html><font color='red'>a variavel @y5 não foi declarada!</font></html>";
			y6 = "<html><font color='red'>a variavel @y6 não foi declarada!</font></html>";
			y7 = "<html><font color='red'>a variavel @y7 não foi declarada!</font></html>";
			y8 = "<html><font color='red'>a variavel @y8 não foi declarada!</font></html>";
			y9 = "<html><font color='red'>a variavel @y9 não foi declarada!</font></html>";
			z0 = "<html><font color='red'>a variavel @z0 não foi declarada!</font></html>";
			z1 = "<html><font color='red'>a variavel @z1 não foi declarada!</font></html>";
			z2 = "<html><font color='red'>a variavel @z2 não foi declarada!</font></html>";
			z3 = "<html><font color='red'>a variavel @z3 não foi declarada!</font></html>";
			z4 = "<html><font color='red'>a variavel @z4 não foi declarada!</font></html>";
			z5 = "<html><font color='red'>a variavel @z5 não foi declarada!</font></html>";
			z6 = "<html><font color='red'>a variavel @z6 não foi declarada!</font></html>";
			z7 = "<html><font color='red'>a variavel @z7 não foi declarada!</font></html>";
			z8 = "<html><font color='red'>a variavel @z8 não foi declarada!</font></html>";
			z9 = "<html><font color='red'>a variavel @z9 não foi declarada!</font></html>";
			//Final do erro de declaração
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
			paths = "C:\\Users\\Casa-Pc\\Desktop\\Plax\\Sys0100001.plax";
			initConsole = new Consol();
			langPlax("normal");
		}catch(ArrayIndexOutOfBoundsException ai1){
			String getP = new File("").getAbsolutePath();
			Runtime.getRuntime().exec("CMD /c start "+getP+"\\info.bat");
		}
			
	}
	//Editor vazio
	public static void emptyEditor(){
		
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro! O editor está vazio! :(</font></html>", "Error message plax", JOptionPane.ERROR_MESSAGE);
		
	}
	
	//Sintaxe incorreta
	public static void incorretSintax(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro! A sintaxe do código está incorreto! :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
		
	}
	
	//Sem extensão
	public static void noExtension(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Por favor! não coloque o tipo de extensão :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
			
	}
	
	//Não existe arquivo
	public static void noExistFile(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Desculpe! o arquivo '"+paths+"' não existe! :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	//Não existe diretório
	public static void noExistDir(){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Desculpe! o diretório '"+paths+"' não existe! :(</font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	//erro de código
	public static void errorCode(int codeline){
		JOptionPane.showMessageDialog(frame, "<html><font color='red'>Erro de código na linha '"+codeline+"'; </font></html>", "Error message plax",  JOptionPane.ERROR_MESSAGE);
	}
	
	public static void LineAnalysis() throws IOException{
		//c
		
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
		

		
		/*if(lang.equals("read")){
			
			
			while(!linha.contains("exec[call["+call+"]].")){
				
				linha = lerArq.readLine();
				
				
			}
			
			lang = "normal";
			if(linha.contains("exec[call["+call+"]].")){
				linha = lerArq.readLine();
				
			
			}
		
	}*/
		
		if(linha.contains("while[")){
			
			whil = linha.substring(linha.indexOf("while[")+5, linha.lastIndexOf("]")+1);
			
			if(whil.contains("<")){
				signal = "<";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<"));
				if2 = whil.substring(whil.indexOf("<")+1, whil.lastIndexOf("]"));
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
					
					if(condWhile==true){
					
					linha = scan.nextLine();
					
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
	
		
		if(linha.contains("if[")){
			if0 = linha.substring(linha.indexOf("if")+2, linha.indexOf("].")+1);
			System.out.println("a linha é: "+if0);
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
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-not-"));
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
					if2 = ol1.substring(ol1.indexOf("-has-")+4, ol1.lastIndexOf("]"));
					
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
					if2 = ol1.substring(ol1.indexOf("-has-")+4, ol1.lastIndexOf("]"));
					
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
		
		if(output.contains("gui")){
				
			if(linha.contains("create[")){
				String create = linha.substring(linha.indexOf("create[")+7, linha.lastIndexOf("]."));
				String object = create.substring(create.indexOf("obj{")+4, create.lastIndexOf("}obj,"));
				
				JFrame window = null;
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
		
		if(linha.contains("exec[")){
			String getCaminho = new File("").getAbsolutePath();
			String exec = linha.substring(linha.indexOf("exec[")+5, linha.lastIndexOf("]."));
			if(exec.contains("call[")){
				call  = exec.substring(exec.indexOf("call[")+5, exec.lastIndexOf("]"));
				try {
					
					langPlax1(getCaminho+"\\Plax\\"+call);
				} catch (IOException e) {}
				
			}
			
			if(exec.contains("prompt[")){
				String prompt = exec.substring(exec.indexOf("prompt[")+7, exec.lastIndexOf("]"));
				Runtime.getRuntime().exec("CMD /c "+prompt);
				
			}
		}
		
		
		//Lexer do armazenamento de variaveis
		if(linha.contains("@") & linha.contains(":")){
			variable = linha.substring(linha.indexOf("@"), linha.indexOf(":")-1);
			val = linha.substring(linha.indexOf(":")+2, linha.indexOf("."));
			memoriaVar += variable+" : "+val+"."+"\n";
			
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
							
							
						} //else alfabético
						
					}else{
						
						stringVars();
						
						
					} //else númerico
					
				}else{
					valueWithVars();
				}    //else @
				
			}   //else []
			
			
			
		}
		
		//Final lexer do armazenamento de variaveis	
		
		
		
		/*String subPath = paths.substring(paths.indexOf("Plax\\")+5, paths.lastIndexOf(".plax")+5);
		//Lexer de informações do programa
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
	
	
	
	
	//Final lexer de informações do programa
	
		//Lexer da exibição de variaveis
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
		//Final lexer de exibição das variaveis
		
		//Lexer de exibição de strings
		if(linha.contains("sis[") & !linha.contains("@")){
			sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
			
			//Lexer de formatação de textos
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
			//Final lexer de formatação
			
			initConsole.console.setText("<font size='5'>"+memoria+"</font>");
		}
		//Final lexer de exibição de strings
		
		
		//Lexer de simples comandos
		if(linha.contains("bl")){memoria += "<br>";}
		if(linha.contains("stop")){initConsole.console.setText("<font size='5'>"+memoria+"<br><br>Execução finalizada.<br>*********************************</font>");}
		//Final de lexer de simples comandos
	
		
		if(linha.contains("Final")){initConsole.console.setText("<font size='5'>"+memoria+"</font>");}
	}
	
	public static void scanFilePlax(String p) throws IOException{

		FileReader file = new FileReader(p);
	    BufferedReader read = new BufferedReader(file);
	    String text = read.readLine();
	      
	      while(text != null){
	    		 memoriaBase += text += "\n";
	    		 text = read.readLine();
	    		
	      }
	      file.close();
	    
	 
	     if(memoriaBase.contains("exec[call[")){
	    	 linePlax = "exec[call[";
	     }else{
	    	 linePlax = "";
	     }
	  
	   arq = new FileReader(p);
	   lerArq = new BufferedReader(arq);
	   linha = lerArq.readLine();
	}
	
	public static void functionIfElse() throws IOException{
		if(linha.contains("if[")){
			if0 = linha.substring(linha.indexOf("if")+2, linha.indexOf("].")+1);
			System.out.println("a linha é: "+if0);
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
				if1 = if0.substring(if0.indexOf("[")+1, if0.lastIndexOf("-not-"));
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
					if2 = ol1.substring(ol1.indexOf("-has-")+4, ol1.lastIndexOf("]"));
					
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
					if2 = ol1.substring(ol1.indexOf("-has-")+4, ol1.lastIndexOf("]"));
					
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
	}//function if e else
	
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
	
	public static void functionWhile() throws IOException{
		if(linha.contains("while[")){
			
			whil = linha.substring(linha.indexOf("while[")+5, linha.lastIndexOf("]")+1);
			
			if(whil.contains("<")){
				signal = "<";
				if1 = whil.substring(whil.indexOf("[")+1, whil.lastIndexOf("<"));
				if2 = whil.substring(whil.indexOf("<")+1, whil.lastIndexOf("]"));
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
	
	public static void functionGUIS(){
		if(output.contains("gui")){
			
			if(linha.contains("create[")){
				String create = linha.substring(linha.indexOf("create[")+7, linha.lastIndexOf("]."));
				String object = create.substring(create.indexOf("obj{")+4, create.lastIndexOf("}obj,"));
				
				JFrame window = null;
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
	
	public static void infoProgram(){
		String subPath = paths.substring(paths.indexOf("Plax\\")+5, paths.lastIndexOf(".plax")+5);
		//Lexer de informações do programa
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
	
	public static void defineVariables() throws IOException{
		if(linha.contains("*Var")){linha = lerArq.readLine();}
		//Lexer do armazenamento de variaveis
		if(linha.contains("@") & linha.contains(":")){
			variable = linha.substring(linha.indexOf("@"), linha.indexOf(":")-1);
			val = linha.substring(linha.indexOf(":")+2, linha.indexOf("."));
			memoriaVar += variable+" : "+val+"."+"\n";
			
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
							
							
						} //else alfabético
						
					}else{
						
						stringVars();
						
						
					} //else númerico
					
				}else{
					valueWithVars();
				}    //else @
				
			}   //else []
			
			
			
		}
		
		//Final lexer do armazenamento de variaveis	
	}//defineVariables
	
	public static void manipulateFiles(String lan) throws IOException{
		
	}//manipulateFiles
	
	public static void functionPrinter(){
		//Lexer da exibição de variaveis
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
				initConsole.console.setText("<font size='5'>"+memoria+"</font>");
		}
		//Final lexer de exibição das variaveis
		
		//Lexer de exibição de strings
		if(linha.contains("sis[") & !linha.contains("@")){
			sis = linha.substring(linha.indexOf("sis[")+4, linha.indexOf("]."));
			
			//Lexer de formatação de textos
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
			//Final lexer de formatação
			
			initConsole.console.setText("<font size='5'>"+memoria+"</font>");
		}
	}//functionPrinter
	
	public static void basicCommands() throws IOException{
		
	}//basicCommands
	
	public static void consoleVisibility(String lan){
		if(linha.contains("#output")){
			output = linha.substring(linha.indexOf(":")+1, linha.lastIndexOf("."));
		}
		
		if(output.contains("console")){
			
			if(linePlax.contains("exec[call[")){
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
			}
		}
	}//consoleVisibility
	
	public static void errorDeclarationVariables(){

		memoria = ""; 
		memoriaBase = "";
		//Erro de Falta de declaração das variáveis
		a0 = "<html><font color='red'>a variavel @a0 não foi declarada!</font></html>";
		a1 = "<html><font color='red'>a variavel @a1 não foi declarada!</font></html>";
		a2 = "<html><font color='red'>a variavel @a2 não foi declarada!</font></html>";
		a3 = "<html><font color='red'>a variavel @a3 não foi declarada!</font></html>";
		a4 = "<html><font color='red'>a variavel @a4 não foi declarada!</font></html>";
		a5 = "<html><font color='red'>a variavel @a5 não foi declarada!</font></html>";
		a6 = "<html><font color='red'>a variavel @a6 não foi declarada!</font></html>";
		a7 = "<html><font color='red'>a variavel @a7 não foi declarada!</font></html>";
		a8 = "<html><font color='red'>a variavel @a8 não foi declarada!</font></html>";
		a9 = "<html><font color='red'>a variavel @a9 não foi declarada!</font></html>";
		b0 = "<html><font color='red'>a variavel @b0 não foi declarada!</font></html>";
		b1 = "<html><font color='red'>a variavel @b1 não foi declarada!</font></html>";
		b2 = "<html><font color='red'>a variavel @b2 não foi declarada!</font></html>";
		b3 = "<html><font color='red'>a variavel @b3 não foi declarada!</font></html>";
		b4 = "<html><font color='red'>a variavel @b4 não foi declarada!</font></html>";
		b5 = "<html><font color='red'>a variavel @b5 não foi declarada!</font></html>";
		b6 = "<html><font color='red'>a variavel @b6 não foi declarada!</font></html>";
		b7 = "<html><font color='red'>a variavel @b7 não foi declarada!</font></html>";
		b8 = "<html><font color='red'>a variavel @b8 não foi declarada!</font></html>";
		b9 = "<html><font color='red'>a variavel @b9 não foi declarada!</font></html>";
		c0 = "<html><font color='red'>a variavel @c0 não foi declarada!</font></html>";
		c1 = "<html><font color='red'>a variavel @c1 não foi declarada!</font></html>";
		c2 = "<html><font color='red'>a variavel @c2 não foi declarada!</font></html>";
		c3 = "<html><font color='red'>a variavel @c3 não foi declarada!</font></html>";
		c4 = "<html><font color='red'>a variavel @c4 não foi declarada!</font></html>";
		c5 = "<html><font color='red'>a variavel @c5 não foi declarada!</font></html>";
		c6 = "<html><font color='red'>a variavel @c6 não foi declarada!</font></html>";
		c7 = "<html><font color='red'>a variavel @c7 não foi declarada!</font></html>";
		c8 = "<html><font color='red'>a variavel @c8 não foi declarada!</font></html>";
		c9 = "<html><font color='red'>a variavel @c9 não foi declarada!</font></html>";
		d0 = "<html><font color='red'>a variavel @d0 não foi declarada!</font></html>";
		d1 = "<html><font color='red'>a variavel @d1 não foi declarada!</font></html>";
		d2 = "<html><font color='red'>a variavel @d2 não foi declarada!</font></html>";
		d3 = "<html><font color='red'>a variavel @d3 não foi declarada!</font></html>";
		d4 = "<html><font color='red'>a variavel @d4 não foi declarada!</font></html>";
		d5 = "<html><font color='red'>a variavel @d5 não foi declarada!</font></html>";
		d6 = "<html><font color='red'>a variavel @d6 não foi declarada!</font></html>";
		d7 = "<html><font color='red'>a variavel @d7 não foi declarada!</font></html>";
		d8 = "<html><font color='red'>a variavel @d8 não foi declarada!</font></html>";
		d9 = "<html><font color='red'>a variavel @d9 não foi declarada!</font></html>";
		e0 = "<html><font color='red'>a variavel @e0 não foi declarada!</font></html>";
		e1 = "<html><font color='red'>a variavel @e1 não foi declarada!</font></html>";
		e2 = "<html><font color='red'>a variavel @e2 não foi declarada!</font></html>";
		e3 = "<html><font color='red'>a variavel @e3 não foi declarada!</font></html>";
		e4 = "<html><font color='red'>a variavel @e4 não foi declarada!</font></html>";
		e5 = "<html><font color='red'>a variavel @e5 não foi declarada!</font></html>";
		e6 = "<html><font color='red'>a variavel @e6 não foi declarada!</font></html>";
		e7 = "<html><font color='red'>a variavel @e7 não foi declarada!</font></html>";
		e8 = "<html><font color='red'>a variavel @e8 não foi declarada!</font></html>";
		e9 = "<html><font color='red'>a variavel @e9 não foi declarada!</font></html>";
		f0 = "<html><font color='red'>a variavel @f0 não foi declarada!</font></html>";
		f1 = "<html><font color='red'>a variavel @f1 não foi declarada!</font></html>";
		f2 = "<html><font color='red'>a variavel @f2 não foi declarada!</font></html>";
		f3 = "<html><font color='red'>a variavel @f3 não foi declarada!</font></html>";
		f4 = "<html><font color='red'>a variavel @f4 não foi declarada!</font></html>";
		f5 = "<html><font color='red'>a variavel @f5 não foi declarada!</font></html>";
		f6 = "<html><font color='red'>a variavel @f6 não foi declarada!</font></html>";
		f7 = "<html><font color='red'>a variavel @f7 não foi declarada!</font></html>";
		f8 = "<html><font color='red'>a variavel @f8 não foi declarada!</font></html>";
		f9 = "<html><font color='red'>a variavel @f9 não foi declarada!</font></html>";
		g0 = "<html><font color='red'>a variavel @g0 não foi declarada!</font></html>";
		g1 = "<html><font color='red'>a variavel @g1 não foi declarada!</font></html>";
		g2 = "<html><font color='red'>a variavel @g2 não foi declarada!</font></html>";
		g3 = "<html><font color='red'>a variavel @g3 não foi declarada!</font></html>";
		g4 = "<html><font color='red'>a variavel @g4 não foi declarada!</font></html>";
		g5 = "<html><font color='red'>a variavel @g5 não foi declarada!</font></html>";
		g6 = "<html><font color='red'>a variavel @g6 não foi declarada!</font></html>";
		g7 = "<html><font color='red'>a variavel @g7 não foi declarada!</font></html>";
		g8 = "<html><font color='red'>a variavel @g8 não foi declarada!</font></html>";
		g9 = "<html><font color='red'>a variavel @g9 não foi declarada!</font></html>";
		h0 = "<html><font color='red'>a variavel @a0 não foi declarada!</font></html>";
		h1 = "<html><font color='red'>a variavel @h1 não foi declarada!</font></html>";
		h2 = "<html><font color='red'>a variavel @h2 não foi declarada!</font></html>";
		h3 = "<html><font color='red'>a variavel @h3 não foi declarada!</font></html>";
		h4 = "<html><font color='red'>a variavel @h4 não foi declarada!</font></html>";
		h5 = "<html><font color='red'>a variavel @h5 não foi declarada!</font></html>";
		h6 = "<html><font color='red'>a variavel @h6 não foi declarada!</font></html>";
		h7 = "<html><font color='red'>a variavel @h7 não foi declarada!</font></html>";
		h8 = "<html><font color='red'>a variavel @h8 não foi declarada!</font></html>";
		h9 = "<html><font color='red'>a variavel @h9 não foi declarada!</font></html>";
		i0 = "<html><font color='red'>a variavel @i0 não foi declarada!</font></html>";
		i1 = "<html><font color='red'>a variavel @i1 não foi declarada!</font></html>";
		i2 = "<html><font color='red'>a variavel @i2 não foi declarada!</font></html>";
		i3 = "<html><font color='red'>a variavel @i3 não foi declarada!</font></html>";
		i4 = "<html><font color='red'>a variavel @i4 não foi declarada!</font></html>";
		i5 = "<html><font color='red'>a variavel @i5 não foi declarada!</font></html>";
		i6 = "<html><font color='red'>a variavel @i6 não foi declarada!</font></html>";
		i7 = "<html><font color='red'>a variavel @i7 não foi declarada!</font></html>";
		i8 = "<html><font color='red'>a variavel @i8 não foi declarada!</font></html>";
		i9 = "<html><font color='red'>a variavel @i9 não foi declarada!</font></html>";
		j0 = "<html><font color='red'>a variavel @j0 não foi declarada!</font></html>";
		j1 = "<html><font color='red'>a variavel @j1 não foi declarada!</font></html>";
		j2 = "<html><font color='red'>a variavel @j2 não foi declarada!</font></html>";
		j3 = "<html><font color='red'>a variavel @j3 não foi declarada!</font></html>";
		j4 = "<html><font color='red'>a variavel @j4 não foi declarada!</font></html>";
		j5 = "<html><font color='red'>a variavel @j5 não foi declarada!</font></html>";
		j6 = "<html><font color='red'>a variavel @j6 não foi declarada!</font></html>";
		j7 = "<html><font color='red'>a variavel @j7 não foi declarada!</font></html>";
		j8 = "<html><font color='red'>a variavel @j8 não foi declarada!</font></html>";
		j9 = "<html><font color='red'>a variavel @j9 não foi declarada!</font></html>";
		k0 = "<html><font color='red'>a variavel @k0 não foi declarada!</font></html>";
		k1 = "<html><font color='red'>a variavel @k1 não foi declarada!</font></html>";
		k2 = "<html><font color='red'>a variavel @k2 não foi declarada!</font></html>";
		k3 = "<html><font color='red'>a variavel @k3 não foi declarada!</font></html>";
		k4 = "<html><font color='red'>a variavel @k4 não foi declarada!</font></html>";
		k5 = "<html><font color='red'>a variavel @k5 não foi declarada!</font></html>";
		k6 = "<html><font color='red'>a variavel @k6 não foi declarada!</font></html>";
		k7 = "<html><font color='red'>a variavel @k7 não foi declarada!</font></html>";
		k8 = "<html><font color='red'>a variavel @k8 não foi declarada!</font></html>";
		k9 = "<html><font color='red'>a variavel @k9 não foi declarada!</font></html>";
		l0 = "<html><font color='red'>a variavel @l0 não foi declarada!</font></html>";
		l1 = "<html><font color='red'>a variavel @l1 não foi declarada!</font></html>";
		l2 = "<html><font color='red'>a variavel @l2 não foi declarada!</font></html>";
		l3 = "<html><font color='red'>a variavel @l3 não foi declarada!</font></html>";
		l4 = "<html><font color='red'>a variavel @l4 não foi declarada!</font></html>";
		l5 = "<html><font color='red'>a variavel @l5 não foi declarada!</font></html>";
		l6 = "<html><font color='red'>a variavel @l6 não foi declarada!</font></html>";
		l7 = "<html><font color='red'>a variavel @l7 não foi declarada!</font></html>";
		l8 = "<html><font color='red'>a variavel @l8 não foi declarada!</font></html>";
		l9 = "<html><font color='red'>a variavel @l9 não foi declarada!</font></html>";
		m0 = "<html><font color='red'>a variavel @m0 não foi declarada!</font></html>";
		m1 = "<html><font color='red'>a variavel @m1 não foi declarada!</font></html>";
		m2 = "<html><font color='red'>a variavel @m2 não foi declarada!</font></html>";
		m3 = "<html><font color='red'>a variavel @m3 não foi declarada!</font></html>";
		m4 = "<html><font color='red'>a variavel @m4 não foi declarada!</font></html>";
		m5 = "<html><font color='red'>a variavel @m5 não foi declarada!</font></html>";
		m6 = "<html><font color='red'>a variavel @m6 não foi declarada!</font></html>";
		m7 = "<html><font color='red'>a variavel @m7 não foi declarada!</font></html>";
		m8 = "<html><font color='red'>a variavel @m8 não foi declarada!</font></html>";
		m9 = "<html><font color='red'>a variavel @m9 não foi declarada!</font></html>";
		n0 = "<html><font color='red'>a variavel @n0 não foi declarada!</font></html>";
		n1 = "<html><font color='red'>a variavel @n1 não foi declarada!</font></html>";
		n2 = "<html><font color='red'>a variavel @n2 não foi declarada!</font></html>";
		n3 = "<html><font color='red'>a variavel @n3 não foi declarada!</font></html>";
		n4 = "<html><font color='red'>a variavel @n4 não foi declarada!</font></html>";
		n5 = "<html><font color='red'>a variavel @n5 não foi declarada!</font></html>";
		n6 = "<html><font color='red'>a variavel @n6 não foi declarada!</font></html>";
		n7 = "<html><font color='red'>a variavel @n7 não foi declarada!</font></html>";
		n8 = "<html><font color='red'>a variavel @n8 não foi declarada!</font></html>";
		n9 = "<html><font color='red'>a variavel @n9 não foi declarada!</font></html>";
		o0 = "<html><font color='red'>a variavel @o0 não foi declarada!</font></html>";
		o1 = "<html><font color='red'>a variavel @o1 não foi declarada!</font></html>";
		o2 = "<html><font color='red'>a variavel @o2 não foi declarada!</font></html>";
		o3 = "<html><font color='red'>a variavel @o3 não foi declarada!</font></html>";
		o4 = "<html><font color='red'>a variavel @o4 não foi declarada!</font></html>";
		o5 = "<html><font color='red'>a variavel @o5 não foi declarada!</font></html>";
		o6 = "<html><font color='red'>a variavel @o6 não foi declarada!</font></html>";
		o7 = "<html><font color='red'>a variavel @o7 não foi declarada!</font></html>";
		o8 = "<html><font color='red'>a variavel @o8 não foi declarada!</font></html>";
		o9 = "<html><font color='red'>a variavel @o9 não foi declarada!</font></html>";
		p0 = "<html><font color='red'>a variavel @p0 não foi declarada!</font></html>";
		p1 = "<html><font color='red'>a variavel @p1 não foi declarada!</font></html>";
		p2 = "<html><font color='red'>a variavel @p2 não foi declarada!</font></html>";
		p3 = "<html><font color='red'>a variavel @p3 não foi declarada!</font></html>";
		p4 = "<html><font color='red'>a variavel @p4 não foi declarada!</font></html>";
		p5 = "<html><font color='red'>a variavel @p5 não foi declarada!</font></html>";
		p6 = "<html><font color='red'>a variavel @p6 não foi declarada!</font></html>";
		p7 = "<html><font color='red'>a variavel @p7 não foi declarada!</font></html>";
		p8 = "<html><font color='red'>a variavel @p8 não foi declarada!</font></html>";
		p9 = "<html><font color='red'>a variavel @p9 não foi declarada!</font></html>";
		q0 = "<html><font color='red'>a variavel @q0 não foi declarada!</font></html>";
		q1 = "<html><font color='red'>a variavel @q1 não foi declarada!</font></html>";
		q2 = "<html><font color='red'>a variavel @q2 não foi declarada!</font></html>";
		q3 = "<html><font color='red'>a variavel @q3 não foi declarada!</font></html>";
		q4 = "<html><font color='red'>a variavel @q4 não foi declarada!</font></html>";
		q5 = "<html><font color='red'>a variavel @q5 não foi declarada!</font></html>";
		q6 = "<html><font color='red'>a variavel @q6 não foi declarada!</font></html>";
		q7 = "<html><font color='red'>a variavel @q7 não foi declarada!</font></html>";
		q8 = "<html><font color='red'>a variavel @q8 não foi declarada!</font></html>";
		q9 = "<html><font color='red'>a variavel @q9 não foi declarada!</font></html>";
		r0 = "<html><font color='red'>a variavel @r0 não foi declarada!</font></html>";
		r1 = "<html><font color='red'>a variavel @r1 não foi declarada!</font></html>";
		r2 = "<html><font color='red'>a variavel @r2 não foi declarada!</font></html>";
		r3 = "<html><font color='red'>a variavel @r3 não foi declarada!</font></html>";
		r4 = "<html><font color='red'>a variavel @r4 não foi declarada!</font></html>";
		r5 = "<html><font color='red'>a variavel @r5 não foi declarada!</font></html>";
		r6 = "<html><font color='red'>a variavel @r6 não foi declarada!</font></html>";
		r7 = "<html><font color='red'>a variavel @r7 não foi declarada!</font></html>";
		r8 = "<html><font color='red'>a variavel @r8 não foi declarada!</font></html>";
		r9 = "<html><font color='red'>a variavel @s9 não foi declarada!</font></html>";
		s0 = "<html><font color='red'>a variavel @s0 não foi declarada!</font></html>";
		s1 = "<html><font color='red'>a variavel @s1 não foi declarada!</font></html>";
		s2 = "<html><font color='red'>a variavel @s2 não foi declarada!</font></html>";
		s3 = "<html><font color='red'>a variavel @s3 não foi declarada!</font></html>";
		s4 = "<html><font color='red'>a variavel @s4 não foi declarada!</font></html>";
		s5 = "<html><font color='red'>a variavel @s5 não foi declarada!</font></html>";
		s6 = "<html><font color='red'>a variavel @s6 não foi declarada!</font></html>";
		s7 = "<html><font color='red'>a variavel @s7 não foi declarada!</font></html>";
		s8 = "<html><font color='red'>a variavel @s8 não foi declarada!</font></html>";
		s9 = "<html><font color='red'>a variavel @s9 não foi declarada!</font></html>";
		t0 = "<html><font color='red'>a variavel @t0 não foi declarada!</font></html>";
		t1 = "<html><font color='red'>a variavel @t1 não foi declarada!</font></html>";
		t2 = "<html><font color='red'>a variavel @t2 não foi declarada!</font></html>";
		t3 = "<html><font color='red'>a variavel @t3 não foi declarada!</font></html>";
		t4 = "<html><font color='red'>a variavel @t4 não foi declarada!</font></html>";
		t5 = "<html><font color='red'>a variavel @t5 não foi declarada!</font></html>";
		t6 = "<html><font color='red'>a variavel @t6 não foi declarada!</font></html>";
		t7 = "<html><font color='red'>a variavel @t7 não foi declarada!</font></html>";
		t8 = "<html><font color='red'>a variavel @t8 não foi declarada!</font></html>";
		t9 = "<html><font color='red'>a variavel @t9 não foi declarada!</font></html>";
		u0 = "<html><font color='red'>a variavel @u0 não foi declarada!</font></html>";
		u1 = "<html><font color='red'>a variavel @u1 não foi declarada!</font></html>";
		u2 = "<html><font color='red'>a variavel @u2 não foi declarada!</font></html>";
		u3 = "<html><font color='red'>a variavel @u3 não foi declarada!</font></html>";
		u4 = "<html><font color='red'>a variavel @u4 não foi declarada!</font></html>";
		u5 = "<html><font color='red'>a variavel @u5 não foi declarada!</font></html>";
		u6 = "<html><font color='red'>a variavel @u6 não foi declarada!</font></html>";
		u7 = "<html><font color='red'>a variavel @u7 não foi declarada!</font></html>";
		u8 = "<html><font color='red'>a variavel @u8 não foi declarada!</font></html>";
		u9 = "<html><font color='red'>a variavel @u9 não foi declarada!</font></html>";
		v0 = "<html><font color='red'>a variavel @v0 não foi declarada!</font></html>";
		v1 = "<html><font color='red'>a variavel @v1 não foi declarada!</font></html>";
		v2 = "<html><font color='red'>a variavel @v2 não foi declarada!</font></html>";
		v3 = "<html><font color='red'>a variavel @v3 não foi declarada!</font></html>";
		v4 = "<html><font color='red'>a variavel @v4 não foi declarada!</font></html>";
		v5 = "<html><font color='red'>a variavel @v5 não foi declarada!</font></html>";
		v6 = "<html><font color='red'>a variavel @v6 não foi declarada!</font></html>";
		v7 = "<html><font color='red'>a variavel @v7 não foi declarada!</font></html>";
		v8 = "<html><font color='red'>a variavel @v8 não foi declarada!</font></html>";
		v9 = "<html><font color='red'>a variavel @v9 não foi declarada!</font></html>";
		w0 = "<html><font color='red'>a variavel @w0 não foi declarada!</font></html>";
		w1 = "<html><font color='red'>a variavel @w1 não foi declarada!</font></html>";
		w2 = "<html><font color='red'>a variavel @w2 não foi declarada!</font></html>";
		w3 = "<html><font color='red'>a variavel @w3 não foi declarada!</font></html>";
		w4 = "<html><font color='red'>a variavel @w4 não foi declarada!</font></html>";
		w5 = "<html><font color='red'>a variavel @w5 não foi declarada!</font></html>";
		w6 = "<html><font color='red'>a variavel @w6 não foi declarada!</font></html>";
		w7 = "<html><font color='red'>a variavel @w7 não foi declarada!</font></html>";
		w8 = "<html><font color='red'>a variavel @w8 não foi declarada!</font></html>";
		w9 = "<html><font color='red'>a variavel @w9 não foi declarada!</font></html>";
		x0 = "<html><font color='red'>a variavel @x0 não foi declarada!</font></html>";
		x1 = "<html><font color='red'>a variavel @x1 não foi declarada!</font></html>";
		x2 = "<html><font color='red'>a variavel @x2 não foi declarada!</font></html>";
		x3 = "<html><font color='red'>a variavel @x3 não foi declarada!</font></html>";
		x4 = "<html><font color='red'>a variavel @x4 não foi declarada!</font></html>";
		x5 = "<html><font color='red'>a variavel @x5 não foi declarada!</font></html>";
		x6 = "<html><font color='red'>a variavel @x6 não foi declarada!</font></html>";
		x7 = "<html><font color='red'>a variavel @x7 não foi declarada!</font></html>";
		x8 = "<html><font color='red'>a variavel @x8 não foi declarada!</font></html>";
		x9 = "<html><font color='red'>a variavel @x9 não foi declarada!</font></html>";
		y0 = "<html><font color='red'>a variavel @y0 não foi declarada!</font></html>";
		y1 = "<html><font color='red'>a variavel @y1 não foi declarada!</font></html>";
		y2 = "<html><font color='red'>a variavel @y2 não foi declarada!</font></html>";
		y3 = "<html><font color='red'>a variavel @y3 não foi declarada!</font></html>";
		y4 = "<html><font color='red'>a variavel @y4 não foi declarada!</font></html>";
		y5 = "<html><font color='red'>a variavel @y5 não foi declarada!</font></html>";
		y6 = "<html><font color='red'>a variavel @y6 não foi declarada!</font></html>";
		y7 = "<html><font color='red'>a variavel @y7 não foi declarada!</font></html>";
		y8 = "<html><font color='red'>a variavel @y8 não foi declarada!</font></html>";
		y9 = "<html><font color='red'>a variavel @y9 não foi declarada!</font></html>";
		z0 = "<html><font color='red'>a variavel @z0 não foi declarada!</font></html>";
		z1 = "<html><font color='red'>a variavel @z1 não foi declarada!</font></html>";
		z2 = "<html><font color='red'>a variavel @z2 não foi declarada!</font></html>";
		z3 = "<html><font color='red'>a variavel @z3 não foi declarada!</font></html>";
		z4 = "<html><font color='red'>a variavel @z4 não foi declarada!</font></html>";
		z5 = "<html><font color='red'>a variavel @z5 não foi declarada!</font></html>";
		z6 = "<html><font color='red'>a variavel @z6 não foi declarada!</font></html>";
		z7 = "<html><font color='red'>a variavel @z7 não foi declarada!</font></html>";
		z8 = "<html><font color='red'>a variavel @z8 não foi declarada!</font></html>";
		z9 = "<html><font color='red'>a variavel @z9 não foi declarada!</font></html>";
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

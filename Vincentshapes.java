package vincentshapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
public class Vincentshapes  extends JFrame{
			int pos,heigth,width,radius,point1,point2,point3;
			public void paint(Graphics g) {
				g.setColor(Color.DARK_GRAY);
				//the if statement gives the condition that user must input values less than 400.
				if(width<400&&heigth<400) {
			
				g.drawRect(50, 50, width, heigth);
				
				}
				else {
					System.out.println(" !!!!!!!be logical, select a lower dimenision  less than 400");
				}
				if(radius<250) {
				
				g.drawOval(50, 50, radius, radius);
				
				}
				else {
					System.out.println(" !!!!!!!be logical, select a lower dimenision less than 400");
				}
				//drawing the triangle the if statement allow only the user inputs less than 400
				if(point1<400&&point2<400&&point3<400) {
					g.drawLine(point1, (point2*2), (point2*4+20), (point2*2));
					g.drawLine(point1, (point2*2), (point1+80), point2);
					g.drawLine((point1+80), point2, (point2*4+20), (point2*2));
					}
				else {
					System.out.println(" !!!!!!!be logical, select a lower dimenision less than 400");
				}
				
				
			}
			public Vincentshapes() {
				Scanner scan=new Scanner(System.in);
				System.out.println("Make selection of the shape to be drawn for you\n   1: Rectangle\n   2: Circle\n   3: Triangle");
				pos=scan.nextInt();
				switch(pos) {
				case 1:
					System.out.println("width should be between 50-200");
					System.out.println("Enter the width ");
					width=scan.nextInt();
					System.out.println("height should be between 100-350");
					System.out.println("Enter the heigth ");
					heigth=scan.nextInt();
					break;
				case 2:
					System.out.println("radius should be between 50-200");
					System.out.println("Enter the radius ");
					radius=scan.nextInt();
					break;
				case 3:
					System.out.println("Enter the three points ranging from 50-200");
					System.out.println("Enter point1");
					point1=scan.nextInt();
					System.out.println("Enter point2");
					point2=scan.nextInt();
					System.out.println("Enter point3");
					point3=scan.nextInt();
					break;
					//ensures only indicate choices are taken..
					default:
						System.out.println("Invalid choie");
						break;
				}
				//this is the Plane on which the shapes are drawn on
				setSize(800,800);
				setTitle("Vincentshapes");
				setVisible(true);
			    setDefaultCloseOperation(EXIT_ON_CLOSE);
			}

			public static void main(String[] args) {
		
			new Vincentshapes();	
			}

		}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;
import java.util.*;

/**
 *
 * @author Tamim
 */
public class JavaApplication {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
			int opt0,opt1;
			int p1 = 1;
			int p2 = 2;
			int flag = 0;
			int cs = 0;
			Queue<Integer> q = new LinkedList<>();
			do
			{
				System.out.println("Smart Farming Monitoring System");
				System.out.println("1. Request the critical section");
				System.out.println("2. Release the critical section");
				System.out.println("3. Exit");
				opt0 = sc.nextInt();
				switch(opt0)
                                {
					case 1:
                                        {
						System.out.println("Select the process");
						System.out.println("1. P1; Send Data to the valve unit");
						System.out.println("2. P2: Turn on/off water");
						//System.out println("3.);
						opt1 = sc.nextInt();
						switch(opt1)
                                                {
							case 1:
                                                        {
								if(flag==0)
                                                                {
									cs = 1;
									flag = 1;
                                                                }
								else
                                                                {
									System.out.println("Process P "+cs+" is already in critical section.");
									q.add(p1);
                                                                }
								
								System.out.println("System Status");
								System.out.println("Critical section is occupied by: "+cs);
								System.out.println("Process waiting is: "+q);
								break;
                                                }
							case 2:
                                                        {
								if(flag==0)
                                                                {
									cs = 2;
									flag = 1;
                                                                }
								else
                                                                {
									System.out.println("Process P"+cs+" is already in critical section.");
									q.add(p2);
                                                                }
								
								System.out.println("System Status");
								System.out.println("Critical section is occupied by: "+cs);
								System.out.println("Process waiting is: "+q);
								break;
                                                       }
                                                }
                                                break;
                                        }
					case 2:
                                        {
						System.out.println("The process P "+cs+" is removed from section. Token is passed to next process.");
						if(!q.isEmpty())
                                                {
							cs = q.peek();
							q.remove();
							System.out.println("System Status");
							System.out.println("Critical section is occupied by: "+cs);
                                                }
						else
                                                {
							System.out.println("No process is waiting in the queue.");
							flag = 0;
                                                }
                                        }
					case 3:
                                        {
						break;
                                        }
                                    }
                                }
			while(3!=opt0);
    }
}

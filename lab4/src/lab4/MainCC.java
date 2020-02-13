package lab4;
import java.util.*;
import java.io.*;

public class MainCC {

	public static void main(String[] args) {
		//System.out.println(Objects.hash("123"));
		        int cntlines = 2;
		        
		        try {
		            Date date;
		            Scanner scr = new Scanner(System.in);
		            Boolean isAdmin = false;
		            FileReader fin = new FileReader("admin.txt");
		            FileWriter fout = new FileWriter("admin.txt", true);
		            FileWriter fout2 = new FileWriter("admin.txt", true);
		            FileWriter fout3 = new FileWriter("admin.txt", true);
		            FileWriter fout4 = new FileWriter("admin.txt", true);

		            System.out.println("If you are admin, please press 1, if you are user, press any other number to enter");
		            int a = scr.nextInt();
		            if (a == 1) {

		                while (true) {

		                    System.out.println("Please, enter admin password");
		                    String enteredPassword = scr.next();
		                    int hashedPassword = Objects.hash(enteredPassword);

		                    if (hashedPassword == 48721) {//123
		                        String s = " ";
		                        isAdmin = true;
		                        System.out.println("Welcome!!! You entered as Admin!");


		                        date = new Date();
		                        String ss = "\n"+ date + " admin logged in to the system \n";
		                        BufferedWriter bw = new BufferedWriter(fout);
		                        bw.write(ss);
		                        bw.close();
		                        break;
		                    } else {
		                        System.out.println("Sorry, but password is incorrect, try again!");
		                    }
		                }

		            } else {
		                System.out.println("Welcome!!! You entered as User");
		                isAdmin = false;
		                BufferedReader bfr = new BufferedReader(fin);
		                String sss = bfr.readLine();

		                while (sss != null){
		                    String[] strings = sss.split(" ");
		                    for(int i = 0; i < strings.length; i++){
		                        if(strings[i].equals("course")){
		                            System.out.println("Course : " + strings[i+1]);
		                            break;
		                        }else if(strings[i].equals("textbook")){
		                            System.out.println("Textbook : " + strings[i+1]);
		                            break;
		                        }else if(strings[i].equals("instructor")){
		                            System.out.println("Instructor : " + strings[i+1] + " " + strings[i + 2]);
		                            break;
		                        }
		                    }
		                    sss = bfr.readLine();
		                }
		                bfr.close();
		            }

		            if (isAdmin) {
		                Vector<TextBook> textbooks = new Vector<>();
		                Vector<Instructor> instructors = new Vector<>();
		                Vector<Course> courses = new Vector<>();
		                
		                String s = " ";

		                boolean admin = true;
		                while (admin){
		                    s = " ";
		                    System.out.println("You privileged to add new\n1.Textbooks(press 1 to create)\n2.Courses(press 2 to create)\n3.Instructors(press 3 to create)\n4.Press 0 to exit");
		                    int pressedKey = scr.nextInt();
		                    date = new Date();

		                    switch (pressedKey){
		                        case 1:
		                            System.out.println("Please, type isbn, title, author in following order");
		                            String isbn = scr.next();
		                            String title= scr.next();
		                            String author = scr.next();
		                            textbooks.add(new TextBook(isbn, title, author));
		                            System.out.println("you added a new textbook");

		                            
		                            BufferedWriter bwr = new BufferedWriter(fout2);
		                            bwr.write(date + " admin added a new textbook " + title + "\n");
		                            bwr.close();
		                            cntlines++;
		                            break;
		                            
		                        case 2:
		                            System.out.println("Please, type course title");
		                            String courseTitle = scr.next();
		                            courses.add(new Course(courseTitle));
		                            System.out.println("you added a new course");

		                            BufferedWriter bwr2 = new BufferedWriter(fout3);
		                            bwr2.write(date + " admin added a new course " + courseTitle + "\n");
		                            bwr2.close();
		                            cntlines++;
		                            break;
		                            
		                        case 3:
		                            System.out.println("Please, type first name, last name, department, email in following order");
		                            String firstName = scr.next();
		                            String lastName= scr.next();
		                            String department = scr.next();
		                            String email = scr.next();
		                            instructors.add(new Instructor(firstName, lastName, department, email));
		                            System.out.println("you added a new instructor");

		                            
		                            BufferedWriter bwr3 = new BufferedWriter(fout4);
		                            bwr3.write(date + " admin added a new instructor " + firstName + " "  + lastName + "\n");
		                            bwr3.close();
		                            cntlines++;
		                            break;
		                            
		                        case 0:
		                            System.out.println("Exiting...");
		                            admin = false;
		                            break;
		                    }
		                }
		            } else {
                        System.out.println("Thank you for visiting! Have a great day:)");
		            }
		            
		        } catch (FileNotFoundException exception) {
		            System.out.println("Error: " + exception.getMessage());
		        	exception.printStackTrace();
		        } catch (IOException exception) {
		            System.out.println("Error: " + exception.getMessage());
		        	exception.printStackTrace();
		        }
		    }
		}
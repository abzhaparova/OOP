package lab4;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		        Map<String, String> map = new HashMap<String, String>();
		        int best = 100;

		        try {
		            FileReader fin = new FileReader("scores.txt");
		            FileWriter fout = new FileWriter("grades.txt");

		            BufferedReader br = new BufferedReader(fin);
		            BufferedWriter bw = new BufferedWriter(fout);

		            String line = " ";
		            
		            for(int i = 0; i < 3; i++){
		                line = br.readLine();
		                String[] strings = line.split(" ");
		                map.put((strings[0] + " " + strings[1]), strings[2]);
		            }
		            br.close();

		            Set< Map.Entry< String,String> > set = map.entrySet();
		            for (Map.Entry< String,String> iter:set){
		                String res = " ";
		                res+= iter.getKey();
		                if(Integer.parseInt(iter.getValue()) >= best - 10){
		                    res += "- 'A'";
		                }else if(Integer.parseInt(iter.getValue()) >= best - 20){
		                    res += "- 'B'";
		                }else if(Integer.parseInt(iter.getValue()) >= best - 30){
		                    res += "- 'C'";
		                }else if(Integer.parseInt(iter.getValue()) >= best - 40){
		                    res += "- 'D'";
		                }else{
		                    res += "- 'E'";
		                }
		                bw.write(res + "\n");
		            }
		            bw.close();

		        }catch (FileNotFoundException exception) {
		            System.out.println("Error: " + exception.getMessage());
		        	exception.printStackTrace();
		        }catch (IOException exception) {
		            System.out.println("Error: " + exception.getMessage());
		        	exception.printStackTrace();
		        }
		    }
		}
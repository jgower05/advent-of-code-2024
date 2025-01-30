import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile 
{
    private String fileName;  
    private ArrayList<int[]> data;  

    public ReadFile(String fileName){
        this.fileName = fileName;
        this.data = new ArrayList<int[]>();
        try 
        {
            this.readFile();   
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }

    public void readFile() throws FileNotFoundException
    {
        File file = new File(this.fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            String[] values = line.split("   ");
            char[] temp1 = values[0].toCharArray();
            char[] temp2 = values[1].toCharArray();
            int[] value1 = new int[temp1.length];
            int[] value2 = new int[temp2.length];
            for(int i = 0; i < temp1.length; i++)
            {
                value1[i] = Integer.parseInt(String.valueOf(temp1[i]));
                value2[i] = Integer.parseInt(String.valueOf(temp2[i]));
            }
            Arrays.sort(value1);
            Arrays.sort(value2);
            
            String t1 = "";
            String t2 = "";

            for(int i = 0 ; i < value1.length; i++)
            {
                t1 += String.valueOf(value1[i]);
                t2 += String.valueOf(value2[i]);
            }


            this.data.add(new int[] {Integer.parseInt(t1), Integer.parseInt(t2)});
        }
        sc.close();
    }

    public ArrayList<int[]> getData()
    {
        return this.data;
    }
}

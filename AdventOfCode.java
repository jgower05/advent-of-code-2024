import java.util.ArrayList;

public class AdventOfCode{
    public static void main(String[] args)
    {
        ReadFile readFile = new ReadFile("locationid.txt");
        ArrayList<int[]> data = readFile.getData();
        int total = 0;
        int lineTotal = 0;
        for(int i = 0; i < data.size(); i++)
        {
            lineTotal = 0;
            int[] temp = data.get(i);
            int value1 = temp[0];
            int value2 = temp[1];

            lineTotal += Math.abs(value1 - value2);
            System.out.printf("Line %s Total: %S. %n", i, lineTotal);
            total += lineTotal;
        }
        System.out.println(total);
    }
}
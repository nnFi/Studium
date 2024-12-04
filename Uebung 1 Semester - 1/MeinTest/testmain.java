package MeinTest;

import edu.princeton.cs.introcs.StdIn;

public class testmain
{
    public static void main(String[] args)
    {
        System.out.print("Zeilen: ");
        int zeilen = StdIn.readInt();
        zeichne(zeilen);

        int[] arr = {7,4,6,3,5,2,1};
        System.out.println(getmin(arr));
    }

    public static void zeichne(int zeilen)
    {
        int zeichen = zeilen*2-1;

        for(int i = zeilen-1; i >= 0; i--)
        {
            //Führende leerzeichen
            for(int x = 0; x < i; x++)
            {
                System.out.print(" ");
            }

            int sternchen = zeichen-(2*i);
            for(int y = 0; y < sternchen; y++)
            {
                if(i == 0)
                {
                    System.out.print("*");
                }
                else
                {
                    if(y == 0 || y == sternchen-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static int getmin(int[] arr)
    {
        int returnval = arr[0];

        for(int i = 1; i < arr.length;i++)
        {
            if(returnval > arr[i]) returnval = arr[i];
        }

        return returnval;
    }
}
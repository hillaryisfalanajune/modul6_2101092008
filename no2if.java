package hillaryisfalanajune_2101092008_modul6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class no2if
{
    public static void main(String[] args)
    {
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
        String angka="";
        String huruf="";
        System.out.print("Input Angka : ");
        try{angka=dataIn.readLine();
        }catch(IOException e)
        {System.out.println("Error!");
        }if(1==Integer.parseInt(angka))
        {System.out.println("SATU");
        }else if(2==Integer.parseInt(angka))
        {System.out.println("DUA");
        }else if(3==Integer.parseInt(angka))
        {System.out.println("TIGA");
        }else if(4==Integer.parseInt(angka))
        {System.out.println("EMPAT");
        }else if(5==Integer.parseInt(angka))
        {System.out.println("LIMA");
        }else if(6==Integer.parseInt(angka))
        {System.out.println("ENAM");
        }else if(7==Integer.parseInt(angka))
        {System.out.println("TUJUH");
        }else if(8==Integer.parseInt(angka))
        {System.out.println("DELAPAN");
        }else if(9==Integer.parseInt(angka))
        {System.out.println("SEMBILAN");
        }else if(10==Integer.parseInt(angka))
        {System.out.println("SEPULUH");
        }
        else{System.out.println("Invalid number");}
    }
}

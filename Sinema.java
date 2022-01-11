import java.util.Scanner;

public class Sinema extends AnaSınıf {

    Scanner scanner=new Scanner(System.in);
    public String filmAdi;
    public int yas;

    public boolean yasControl(int yas)
    {
        this.yas=yas;

        if(yas<18)
        {
            System.out.println("Yaşınız yetersiz.");
            return false;
        }
        return true;
    }




}

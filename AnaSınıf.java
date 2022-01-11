import java.util.Scanner;

public class AnaSınıf {

    Scanner scanner = new Scanner(System.in);

    public int koltuk(String[] koltukNo) {
        int biletSayisi = 0;

        // String [] koltukNo1 = new String[29];
        boolean a = true;
        boolean HepsiDolu = true;
        while (a) {
            for (int i = 0; i < 29; i++) {
                if (koltukNo[i] != "Dolu") {
                    HepsiDolu = false;
                }
            }
            if (HepsiDolu == true) {
                System.out.println("Hepsi dolu");
                break;
            }
            System.out.println("Lütfen almak istediğiniz koltukları tek tek seçiniz :");
            System.out.println("Koltuk seçiminden çıkmak için 404 yazınız.");
            int no = scanner.nextInt();
            if (no == 404) {

                Odeme odeme = new Odeme();
                odeme.tutar(biletSayisi);

                System.out.println("Tc kimlik numaranızı giriniz.");
                String tcKimlikNo = scanner.next();
                odeme.setTcKimlikNo(tcKimlikNo);
                boolean gecerli = false;
                char[] rakamlar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

                while(true){ // tcKimlikNo nun gecerli olup olmadigini kontrol eden while dongusu
                    for(int i = 0; i<tcKimlikNo.length();i++){
                        gecerli = false;
                        for(int j = 0;j<10;j++){
                            if(tcKimlikNo.charAt(i) == rakamlar[j]){
                                gecerli = true;
                            }
                        }
                        if(gecerli==false){
                            break;
                        }
                    }
                    if(gecerli==true && tcKimlikNo.length()==11){
                        break; // tc kimlik gecerliyse break atip while dan cik
                    }
                    System.out.println("Gecerli Tc kimlik numaranızı giriniz.");
                    tcKimlikNo = scanner.next();
                }

                System.out.println("HES kodunuzu giriniz.");
                String hesKodu = scanner.next();
                odeme.setHesKodu(hesKodu);


                gecerli = false;
                //char[] rakamlar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                char[] alfabe = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','-'};
                while(true){ // hesKodu nun gecerli olup olmadigini kontrol eden while dongusu
                    for(int i = 0; i<hesKodu.length();i++){
                        gecerli = false;
                        for(int j = 0;j<10;j++){
                            if(hesKodu.charAt(i) == rakamlar[j]){
                                gecerli = true;
                            }
                        }
                        for(int k = 0;k<27;k++){
                            if(hesKodu.charAt(i) == alfabe[k]){
                                gecerli = true;
                            }
                        }

                        if(gecerli==false){
                            break;
                        }
                    }
                    if(gecerli==true && hesKodu.length()==12 && hesKodu.charAt(4)=='-' && hesKodu.charAt(9)=='-'){
                        break; // hesKodu gecerliyse break atip while dan cik
                    }
                    System.out.println("Gecerli hesKodu numaranızı giriniz.");
                    hesKodu = scanner.next();
                }




                System.out.println(odeme.getHesKodu() + " no lu HES kodunuz onaylandı");

                odeme.totalHesap();

                break;
            }

            if (koltukNo[no] == "Dolu") {
                System.out.println("Seçtiğiniz koltuk doludur.");
            }
            System.out.println();
            if (koltukNo[no] != "Dolu") {
                koltukNo[no] = "Dolu";
                biletSayisi = biletSayisi + 1;
            }

        }
        return biletSayisi;
    }

}
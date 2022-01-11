import java.util.Scanner;

public class Odeme {
    Scanner scanner = new Scanner(System.in);
    AnaSınıf anaSınıf = new AnaSınıf();

    public int biletSayisi;

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getHesKodu() {
        return hesKodu;
    }

    public void setHesKodu(String hesKodu) {
        this.hesKodu = hesKodu;
    }

    private String hesKodu;
    private String tcKimlikNo;

    public void tutar(int biletSayisi) {
        this.biletSayisi = biletSayisi;
        System.out.println("Bilet sayisi:" + biletSayisi);
    }

    public void totalHesap() {
        String krediKartNO;
        int hesap = biletSayisi * 20;
        int ö = 1;
        System.out.println("Ödeme şeklinin seçiniz.");
        System.out.println("1-Nakit");
        System.out.println("2-Kredi Kartı");

        int odemeSekliSecim = scanner.nextInt();
        for (ö = 1; ö > 0; ö++) {
            switch (odemeSekliSecim) {
                case 1:

                    System.out.println("Ödemenin gereken tutar " + hesap + " Tl dir.");
                    System.out.println("Lütfen kaç para yatırdığınızı sisteme girin:");
                    int yatirilanNakit = scanner.nextInt();
                    if (yatirilanNakit >= hesap) {
                        System.out.println("Para üstünüz:" + (yatirilanNakit - hesap));
                        System.out.println("Ödeme işleminiz gerçekleşmiştir.İyi seyirler.");
                        ö = -1;

                    } else {
                        System.out.println("Yatırdığınız para yetersizdir.");
                    }
                    break;

                case 2:
                    System.out.println("Hesabınız " + hesap + " Tl dir");

                    System.out.println("Lütfen 16 haneli kredi kartı numaranızı girini:");
                    krediKartNO = scanner.next();
                    boolean gecerli = false;
                    char[] rakamlar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

                    while(true){ // krediKartNO nun gecerli olup olmadigini kontrol eden while dongusu
                        for(int i = 0; i<krediKartNO.length();i++){
                            gecerli = false;
                            for(int j = 0;j<10;j++){
                                if(krediKartNO.charAt(i) == rakamlar[j]){
                                    gecerli = true;
                                }
                            }
                            if(gecerli==false){
                                break;
                            }
                        }
                        if(gecerli==true && krediKartNO.length()==16){
                            break; // tc kimlik gecerliyse break atip while dan cik
                        }
                        System.out.println("Gecerli Kredi Kartı numaranızı giriniz.");
                        krediKartNO = scanner.next();
                    }

                    System.out.println("Ödeme işleminiz gerçekleşmiştir.İyi seyirler.");
                    ö=-1;

                    break;

                default:
                    System.out.println("Lütfen geçerli bir işlem numarası giriniz.");
                    break;
            }
        }
    }
}
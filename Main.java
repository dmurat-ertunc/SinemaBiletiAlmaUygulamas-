import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[][] koltukNo1 = new String[3][29];
        String[][] koltukNo2 = new String[3][29];
        String[][] koltukNo3 = new String[3][29];
        String[][] koltukNo4 = new String[3][29];
        String[][] koltukNo5 = new String[3][29];


        Sinema salon1 = new Sinema();
        Sinema salon2 = new Sinema();
        Sinema salon3 = new Sinema();
        Sinema salon4 = new Sinema();
        Sinema salon5 = new Sinema();


        salon1.filmAdi = "Hızlı Ve Öfkeli";
        salon2.filmAdi = "Zamana Karşı";
        salon3.filmAdi = "Dabbe4";
        salon4.filmAdi = "Spiderman";
        salon5.filmAdi = "Esaretin Bedeli";

        int yas;



        for (int i = 1; i > 0; i++) {



            System.out.println("\n.\n.\n.\n.\nMUMA Tiyatro Salonumuza Hoşgeldiniz \n");
            System.out.println("Lütfen Seçmek İstediğiniz Filmin Numarasını Giriniz :\n");
            System.out.println("1-Hızlı Ve Öfkeli 7");
            System.out.println("2-Zamana Karşı");
            System.out.println("3-Dabbe4");
            System.out.println("4-Spiderman");
            System.out.println("5-Esaretin Bedeli\n");

            int filmSecim = scanner.nextInt();

            if (filmSecim!=1 && filmSecim!=2 && filmSecim!=3 && filmSecim!=4 && filmSecim!=5)
            {
                System.out.println("LÜtfen gecerli bir film numarası girin.");
                continue;
            }

            System.out.println("Lütfen seansı seçiniz:\n");
            System.out.println("1-10:30");
            System.out.println("2-15:30");
            System.out.println("3-20:30");

            int seansSecim = scanner.nextInt();

            if (seansSecim!=1 && seansSecim!=2 && seansSecim!=3)
            {
                System.out.println("Lütfen geçerli bir seans numarası seçin.");
                continue;
            }

            if (seansSecim == 1) {
                switch (filmSecim) {
                    case 1:
                        salon1.koltuk(koltukNo1[0]);
                        break;
                    case 2:
                        salon2.koltuk(koltukNo2[0]);
                        break;
                    case 3:
                        System.out.println("Lütfen yaşınızı girin.");
                        yas=scanner.nextInt();
                        if (!salon3.yasControl(yas))
                        {
                            continue;
                        }
                        salon3.koltuk(koltukNo3[0]);
                        break;
                    case 4:
                        salon4.koltuk(koltukNo4[0]);
                        break;
                    case 5:
                        salon5.koltuk(koltukNo5[0]);
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir film numarası giriniz!!!");
                        break;
                }
            } else if (seansSecim == 2) {
                switch (filmSecim) {
                    case 1:
                        salon1.koltuk(koltukNo1[1]);
                        break;
                    case 2:
                        salon2.koltuk(koltukNo2[1]);
                        break;
                    case 3:
                        System.out.println("Lütfen yaşınızı girin.");
                        yas=scanner.nextInt();
                        if (!salon3.yasControl(yas))
                        {
                            continue;
                        }
                        salon3.koltuk(koltukNo3[1]);

                        break;
                    case 4:
                        salon4.koltuk(koltukNo4[1]);
                        break;
                    case 5:
                        salon5.koltuk(koltukNo5[1]);
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir film numarası giriniz!!!");
                        break;
                }
            } else if (seansSecim == 3) {
                switch (filmSecim) {
                    case 1:
                        salon1.koltuk(koltukNo1[2]);
                        break;
                    case 2:
                        salon2.koltuk(koltukNo2[2]);
                        break;
                    case 3:
                        System.out.println("Lütfen yaşınızı girin.");
                        yas=scanner.nextInt();
                        if (!salon3.yasControl(yas))
                        {
                            continue;
                        }
                        salon3.koltuk(koltukNo3[2]);
                        break;
                    case 4:
                        salon4.koltuk(koltukNo4[2]);
                        break;
                    case 5:
                        salon5.koltuk(koltukNo5[2]);
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir film numarası giriniz!!!");
                        break;
                }

            } else {
                System.out.println("Lütfen geçerli bir seans numarası giriniz!!!");
            }

        }
    }
}

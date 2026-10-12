
public class SplitBill {

    public static void main(String[] args) {
        
        int jumlah_orang = 5;
        int total_pesanan = 345000;
        int uang_tip = 20000;
        double biaya_layanan = 0.05;

        double jumlah_biaya_layanan = total_pesanan * biaya_layanan;
        double total_tagihan = ((total_pesanan + jumlah_biaya_layanan) + uang_tip);

        System.out.println("==============Split Bill==============");
        System.out.println("Total Pesanan       : Rp." + total_pesanan);
        System.out.println("Service Charge      : Rp." + (int)jumlah_biaya_layanan);
        System.out.println("Uang Tip            : Rp." + uang_tip);
        System.out.println("Total Tagihan       : Rp." + (int)total_tagihan);
        System.out.println("Jumlah Orang        : " + jumlah_orang + " Orang");
        System.out.println("Tagihan Per-Orang   : " + "Rp." + (int)(total_tagihan/jumlah_orang) + "/Orang");
    }

}

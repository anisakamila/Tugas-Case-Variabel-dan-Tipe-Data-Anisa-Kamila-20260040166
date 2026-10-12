
public class KasirKedaiKopiOutput {

    public static void main(String [] args){

        String kasir = "Andi";
        String pelanggan = "Budi";
        String menu_kopi = "Kopi Susu Gula Aren";
        String menu_makanan = "Donat";
        int jml_kopi = 4;
        int harga_kopi = 18500;
        int jml_donat = 2;
        int harga_donat = 5000;
        int diskon = 2000;

        int total_kopi = jml_kopi * harga_kopi;
        int total_donat = jml_donat * harga_donat;
        int subtotal = total_kopi + total_donat;

        double pajak = subtotal * 0.11;
        double total = subtotal + pajak - diskon;

        System.out.println("==========Kedai Kopi==========");
        System.out.println("Kasir       : " + kasir);
        System.out.println("Pelanggan   : " + pelanggan);
        System.out.println("------------------------------");
        System.out.println("Rincian Pesanan");
        System.out.println("------------------------------");
        System.out.println(menu_kopi + "\nRp.18500 x " + jml_kopi + " = Rp." + total_kopi);
        System.out.println(menu_makanan + "\nRp.5000 x " + jml_donat + " = Rp." + total_donat);
        System.out.println("------------------------------");
        System.out.println("Subtotal    : Rp." + subtotal);
        System.out.println("Pajak (11%) : Rp." + (int)pajak);
        System.out.println("Diskon      : Rp." + diskon);
        System.out.println("Total       : Rp." + (int)total);
    }

}

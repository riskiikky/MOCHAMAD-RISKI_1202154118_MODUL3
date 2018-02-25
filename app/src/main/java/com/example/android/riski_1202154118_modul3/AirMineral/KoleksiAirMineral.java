package com.example.android.riski_1202154118_modul3.AirMineral;

import com.example.android.riski_1202154118_modul3.R;

import java.util.ArrayList;

/**
 * Created by RISKI on 25/02/2018.
 */

public class KoleksiAirMineral {
    public static ArrayList<AirMineral> getAirMineral() {
        ArrayList<AirMineral> airMineral = new ArrayList<>();
        AirMineral airMineral1 = null;

        airMineral1 = new AirMineral();
        airMineral1.setNama("Aqua");
        airMineral1.setDeskripsi("Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.\n" +
                "\n" +
                "Saat ini, terdapat 14 pabrik yang memproduksi Aqua dengan kepemilikan berbeda-beda (3 pabrik dimiliki oleh PT Tirta Investama, 10 pabrik dimiliki oleh PT Aqua Golden Mississippi, dan pabrik di Berastagi, Sumatera Utara dimiliki oleh PT Tirta Sibayakindo).");
        airMineral1.setImage(R.drawable.aqua);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Prestine");
        airMineral1.setDeskripsi("PRISTINE bukan Air Mineral biasa karena PRISTINE bukan hanya sekedar menghilangkan dahaga, tapi juga bermanfaat bagi kesehatan. Dengan proses Ionisasi, suatu prosess dimana memisahkan air dan mineral menjadi ion molekul yang lebih kecil");
        airMineral1.setImage(R.drawable.pristine);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Le Minerale");
        airMineral1.setDeskripsi("Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale.");
        airMineral1.setImage(R.drawable.leminerale);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Cleo");
        airMineral1.setDeskripsi("Cleo atau Cleo Oxygenated Water merupakan salah satu produk air minum dalam kemasan yang menjanjikan keunggulan dengan kandungan oksigen yang tinggi yang sangat bermanfaat bagi tubuh manusia. Cleo memiliki kandungan oksigen yang lebih tinggi yaitu sebanyak 100 ppm atau 20 kali air minum  biasa. Cleo diproses melalui teknologi dari USA yaitu Oxygen Enanced Combustion Technology yang modern dan higeni. Teknologi ini mampu mengikat oksigen dalam air sehingga tidak lagi berbentuk gas melainkan menjadi properti fisik dari air.");
        airMineral1.setImage(R.drawable.cleo);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Club");
        airMineral1.setDeskripsi("Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.");
        airMineral1.setImage(R.drawable.club);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Amidis");
        airMineral1.setDeskripsi("AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida");
        airMineral1.setImage(R.drawable.amidis);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Equil");
        airMineral1.setDeskripsi("Air mineral dengan penampilan kemasan yang elegan ini merupakan asli Indonesia yang di prosuksi oleh PT. Equilindo Lestari.");
        airMineral1.setImage(R.drawable.equil);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Nestle");
        airMineral1.setDeskripsi("Nestlé adalah sebuah perusahaan multinternasional di Vevey, Swiss yang bergerak dalam bidang makanan minuman. Didirikan pada tahun 1868 oleh Hendry Nestlé. Perusahaan ini menghasilkan makanan nutrisi dan minuman nutrisi seperti makanan bayi, susu, kopi, cokelat, dan lain-lain. Perusahaan ini masuk dalam bursa saham SWX Swiss Exchange.");
        airMineral1.setImage(R.drawable.nestle);
        airMineral.add(airMineral1);

        return airMineral;
    }
}

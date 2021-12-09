package com.uts.uts_aboutworld;

import android.content.Context;

import com.uts.uts_aboutworld.news.Energi;
import com.uts.uts_aboutworld.news.HotNew;
import com.uts.uts_aboutworld.news.Keajaiban;
import com.uts.uts_aboutworld.news.Pemimpin;
import com.uts.uts_aboutworld.news.Tokoh;

import java.util.ArrayList;
import java.util.List;

public class BeritaSaatIni {
    private static List<HotNew> hotNews = new ArrayList<>();

    private static List<Energi> initDataEnergi(Context ctx) {
        List<Energi> alternatif = new ArrayList<>();
        alternatif.add(new Energi("Biomassa", "Tumbuhan dan organisme yang baru hidup",
                "Bioenergi adalah jenis energi terbarukan yang berasal dari biomassa. Biomassa adalah bahan organik yang berasal dari tumbuhan dan organisme yang baru hidup. Menggunakan kayu di perapian Anda adalah contoh biomassa yang kebanyakan orang kenal. ", R.drawable.eb_biomassa));
        alternatif.add(new Energi("Hidroelektrik", "Air yang mengalir melalui turbin bendungan",
                "Bendungan adalah apa yang paling banyak diasosiasikan orang dalam hal tenaga air. Air mengalir melalui turbin bendungan untuk menghasilkan listrik, yang dikenal sebagai tenaga air penyimpanan-pompa. Tenaga air aliran sungai menggunakan saluran untuk mengalirkan air daripada mengalirkannya melalui bendungan.", R.drawable.eb_hidroelektrik));
        alternatif.add(new Energi("Hidrogen", "Gas hidrogen",
                "Hidrogen perlu digabungkan dengan elemen lain, seperti oksigen untuk membuat air karena tidak terjadi secara alami sebagai gas dengan sendirinya. Ketika hidrogen dipisahkan dari elemen lain, hidrogen dapat digunakan untuk bahan bakar dan listrik.", R.drawable.eb_hidrogen));
        alternatif.add(new Energi("Tenaga Surya", "Matahari",
                "Jenis energi terbarukan ini diperoleh dengan menangkap energi radiasi dari sinar matahari dan mengubahnya menjadi panas, listrik, atau air panas. Sistem fotovoltaik (PV) dapat mengubah sinar matahari langsung menjadi listrik melalui penggunaan sel surya.", R.drawable.eb_matahari));
        alternatif.add(new Energi("Panas Bumi", "Gas bumi",
                "Panas bumi adalah panas yang terperangkap di bawah kerak bumi dari pembentukan bumi 4,5 miliar tahun yang lalu dan dari peluruhan radioaktif. Terkadang sejumlah besar panas ini keluar secara alami, tetapi sekaligus, menghasilkan kejadian yang sudah dikenal, seperti letusan gunung berapi dan geyser. ", R.drawable.eb_panasbumi));
        alternatif.add(new Energi("Turbin / Baling-Baling", "Angin",
                "Ladang angin menangkap energi aliran angin dengan menggunakan turbin dan mengubahnya menjadi listrik. Sistem pembangkit tenaga angin kelas komersial dapat memberi daya pada banyak organisasi yang berbeda, sementara turbin angin tunggal digunakan untuk membantu melengkapi organisasi energi yang sudah ada sebelumnya.", R.drawable.eb_wind));
        return alternatif;
    }

    private static List<Keajaiban> initDataKeajaiban(Context ctx) {
        List<Keajaiban> dunia = new ArrayList<>();
        dunia.add(new Keajaiban("Candi Borobudur", "Indonesia",
                "Melansir laman Borobudur Park, Candi Borobudur adalah bangunan bersejarah peninggalan Dinasti Syailendra pada tahun 780-840 masehi. Candi yang merupakan Situs Warisan Budaya UNESCO ini juga merupakan peninggalan Budha yang terbesar di dunia.", R.drawable.kd_candi));
        dunia.add(new Keajaiban("Colosseum", "Italia",
                " Colosseum dulunya digunakan sebagai tempat pertunjukan gladiator, manusia yang berduel dengan hewan buas. Colosseum juga menjadi tempat menonton balapan kereta dan duel lainnya di masa Kekaisaran Romawi. Pertunjukan tersebu merupakan hiburan bagi Kasiar Vespasianus.", R.drawable.kd_coloseum));
        dunia.add(new Keajaiban("Ka'Bah", "Mekah, Saudi Arabia",
                "Ka'bah ada di tengah-tengah Masjidil Haram dan merupakan arah dimana umat Muslim menghadap ketika shalat. Ka'bah dalam bahasa Arab memiliki arti kubus. Bangunan suci ini memang berbentuk kotak dan terbungkus dengan sutra dan lapisan katun. Umat Muslim meyakini bahwa Ka'bah dibangun oleh Nabi Ibrahim dan putranya Nabi Ismail.", R.drawable.kd_mekah));
        dunia.add(new Keajaiban("Menara Pissa", "Italia",
                "Melihat gambar di atas tentu kamu terhibur sendiri ya karena bentuk bangunannya yang miring? Menara Pisa memang memiliki keunikan karena bentuknya yang sejak awal dibangun memang tak pernah tegak lurus berdiri.", R.drawable.kd_pissa));
        dunia.add(new Keajaiban("Taj Mahal", "India",
                "Taj Mahal merupakan monumen di Agra, India, yang sebelumnya memiliki nama seorang wanita yaitu Arjumand Banu Begum. Wanita ini dijuluki sebagai Mumtaz Mahal, yang pada akhirnya menjadi cikal bakal pemberian nama Taj Mahal.", R.drawable.kd_tajmahal));
        dunia.add(new Keajaiban("Tembok Besar Cina", "Tiongkok",
                "Tembok Besar China merupakan tembok terpanjang yang pernah ada di dunia dengan arsitektur kuno. Tembok ini telah hadir sejak 2.300 tahun yang lalu dan dibangun ditempat yang berbeda untuk melindungi garis teritorial.\n" +
                        "Empat Dinasti China telah berjasa dalam berdirinya tembok raksasa yang juga berfungsi untuk pencegahan penyerangan musuh dan jalur perdagangan sutra pada jaman dahulu.", R.drawable.kd_tembokcina));
        return dunia;
    }

    private static List<Pemimpin> initDataPemimpin(Context ctx) {
        List<Pemimpin> negara = new ArrayList<>();
        negara.add(new Pemimpin("Joko Widodo", "Indonesia",
                "Ir. H. Joko Widodo DK ( lahir 21 Juni 1961), atau yang lebih akrab disapa Jokowi, adalah Presiden Indonesia yang mulai menjabat sejak 20 Oktober 2014. Terpilih dalam Pemilu Presiden 2014, Jokowi menjadi Presiden Indonesia pertama sepanjang sejarah yang bukan berasal dari latar belakang elite politik atau militer Indonesia. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dan kembali terpilih bersama Wakil Presiden Ma'ruf Amin dalam Pemilu Presiden 2019.", R.drawable.ng_indonesia));
        negara.add(new Pemimpin("Kim Jong-un", "Korea Utara",
                "Kim Jong-un (lahir 8 Januari 1983) adalah Pemimpin Tertinggi Republik Demokratik Rakyat Korea, atau yang lebih dikenal dengan Korea Utara. Dia adalah putra Kim Jong-il dan cucu dari Kim Il-sung . Sebelum menjadi pemimpin Korea Utara, ia pernah menjabat sebagai Sekretaris Pertama Partai Buruh Korea, Ketua Pertama Komisi Militer Sentral, Panglima Tertinggi Tentara Rakyat Korea, dan Politbiro Partai Buruh Korea.", R.drawable.ng_korut));
        negara.add(new Pemimpin("Raja Salman", "Saudi Arabia",
                "Salman bin Abdulaziz al-Saud (lahir 31 Desember 1935) adalah Raja Arab Saudi ketujuh, Penjaga Dua Kota Suci, dan pemimpin Wangsa Saud saat ini. Ia menjabat sebagai Wakil Gubernur dan kemudian menjadi Gubernur Riyadh selama 48 tahun dari tahun 1963 sampai 2011. Salman diangkat sebagai Raja Arab Saudi pada 23 Januari 2015 setelah kematian saudara tirinya, Raja Abdullah.", R.drawable.ng_saudi));
        negara.add(new Pemimpin("Vladimir Putin", "Rusia",
                "Vladímir Vladímirovich Pútin, (lahir 7 Oktober 1952) adalah seorang politikus Rusia, dan merupakan Presiden Rusia saat ini. Ia merupakan presiden dengan masa jabatan terlama kedua di Eropa setelah Alexander Lukashenko yang merupakan Presiden Belarus. Putin telah menjadi Presiden Rusia sejak 7 Mei 2012.", R.drawable.ng_rusia));
        negara.add(new Pemimpin("Recep Tayyip Erdoğan", "Turki",
                "Recep Tayyip Erdoğan (lahir 26 Februari 1954) adalah seorang politikus Turki yang menjabat sebagai Presiden Turki sejak 2014. Sebelumnya, ia menjabat Perdana Menteri Turki sejak 14 Maret 2003 sampai 28 Agustus 2014. Ia juga seorang pimpinan Adalet ve Kalkınma Partisi (AKP, atau Partai Keadilan dan Pembangunan). Pada tahun 2010, Erdoğan terpilih sebagai tokoh muslim ke-2 paling berpengaruh di dunia.", R.drawable.ng_turkey));
        negara.add(new Pemimpin("Joe Biden", "Amerika Serikat",
                "Joseph Robinette Biden Jr. (lahir 20 November 1942) adalah seorang politikus Amerika yang menjabat sebagai Presiden Amerika Serikat ke-46. Setelah mengalahkan Donald Trump yang merupakan pesaingnya saat pemilihan umum Presiden Amerika Serikat 2020, dia dilantik sebagai Presiden AS ke-46 pada 20 Januari 2021. Ia adalah anggota Partai Demokrat dan pernah menjabat sebagai Wakil Presiden Amerika Serikat ke-47 dari 2009 hingga 2017 serta Senator senior dari Delaware dari 1973 hingga 2009.", R.drawable.ng_usa));
        return negara;
    }

    private static List<Tokoh> initDataTokoh(Context ctx) {
        List<Tokoh> teknologi = new ArrayList<>();
        teknologi.add(new Tokoh("Elon Musk", "Amerika Serikat",
                "Elon Reeve Musk FRS (lahir 28 Juni 1971) adalah tokoh bisnis, penemu, dan industrialis dari Amerika Serikat. Ia merupakan pendiri, CTO, dan CEO SpaceX, CEO dan arsitek produksi Tesla, pendiri The Boring Company, dan pendiri Neuralink. ", R.drawable.tkh_elonmusk));
        teknologi.add(new Tokoh("Jack Ma", "Tiongkok",
                "Jack Ma (lahir 10 September 1964) merupakan seorang pebisnis berkebangsaan Tiongkok. Dia merupakan pendiri sekaligus Chairman Eksekutif dari Alibaba Group, perusahaan e-commerce terbesar di Tiongkok. Dia merupakan warga Tiongkok Daratan pertama yang pernah muncul di majalah Forbes dan terdaftar sebagai biliuner dunia. Pada 2015, ia masuk dalam daftar orang paling berpengaruh di dunia pada urutan ke-22. Jack Ma secara resmi mengundurkan diri dari dewan direksi Alibaba pada 30 September 2019.", R.drawable.tkh_jackma));
        teknologi.add(new Tokoh("Jeff Bezos", "Amerika Serikat",
                "Jeffrey Preston Bezos (lahir 12 Januari 1964) adalah pengusaha terkaya di dunia sepanjang sejarah modern. Ia adalah pendiri, ketua, CEO, presiden dan pemilik saham mayoritas perusahaan teknologi terbesar di dunia Amazon.com. Lulusan Universitas Princeton, Bezos pernah menjadi anggota Phi Beta Kappa, bekerja sebagai analis keuangan untuk D. E. Shaw & Co. sebelum mendirikan Amazon pada tahun 1994. Ia pernah dipilih sebagai Person of the Year oleh majalah TIME.", R.drawable.tkh_jeffbezos));
        teknologi.add(new Tokoh("Mark Zuckerberg", "Amerika Serikat",
                "Mark Elliot Zuckerberg (lahir 14 Mei 1984) adalah seorang pemrogram komputer dan pengusaha Internet. Ia dikenal karena menciptakan situs jejaring sosial Facebook. Facebook didirikan sebagai perusahaan swasta pada tahun 2004 oleh Zuckerberg dan teman sekelasnya Dustin Moskovitz, Eduardo Saverin, dan Chris Hughes ketika menjadi mahasiswa di Universitas Harvard. ", R.drawable.tkh_markzuckerberg));
        teknologi.add(new Tokoh("Sundar Pichai", "India",
                "Pichai Sundarajan, lebih dikenal dengan Sundar Pichai (lahir 12 Juli 1972), adalah Chief Executive Officer (CEO) Alphabet Inc. dan subsidiarinya, Google. Pichai bergabung dengan Google pada 2004, ia menjabat sebagai pimpinan manajemen produk dan inovasi perangkat lunak klien Google, termasuk Google Chrome, Chrome OS, dan Google Drive. Ia juga bertanggungjawab atas pengembangan aplikasi seperti Gmail dan Google Maps. ", R.drawable.tkh_sundarpichai));
        teknologi.add(new Tokoh("Tim Cook", "Amerika Serikat",
                "Timothy Donald Cook (lahir 1 November 1960) adalah chief executive officer (CEO) di perusahaan multimedia Apple Inc. Ia sudah bekerja di Apple sejak 1998. Tugas utamanya adalah mengelola operasi harian di perusahaan tersebut. Ia menjadi CEO setelah Steve Jobs mundur dari jabatan itu pada 24 Agustus 2011.", R.drawable.tkh_timcook));
        return teknologi;
    }

    private static void initAllHotNews(Context ctx) {
        hotNews.addAll(initDataEnergi(ctx));
        hotNews.addAll(initDataKeajaiban(ctx));
        hotNews.addAll(initDataPemimpin(ctx));
        hotNews.addAll(initDataTokoh(ctx));
    }

    public static List<HotNew> getAllHotNews(Context ctx) {
        if (hotNews.size() == 0) {
            initAllHotNews(ctx);
        }
        return  hotNews;
    }

    public static List<HotNew> getHotNewsByTipe(Context ctx, String berita) {
        List<HotNew> hotNewsByType = new ArrayList<>();
        if (hotNews.size() == 0) {
            initAllHotNews(ctx);
        }
        for (HotNew h : hotNews) {
            if (h.getBerita().equals(berita)) {
                hotNewsByType.add(h);
            }
        }
        return hotNewsByType;
    }
}

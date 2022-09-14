package com.zahirar.tugasch4tpc1viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeritaViewModel : ViewModel() {

    var listDataBerita = arrayListOf(
        ListDataBerita("Bjorka Spill Data Pribadi Bikin Mahfud Md hingga Anies Buka Suara", "Rabu, 14 Sep 2022", "Jurnalis : Widodo", "Jakarta - Sejumlah pejabat bersuara usai data pribadi 'di-spill' oleh hacker Bjorka. Ada yang menanggapi santai dan ada juga yang menyebut data yang disebar Bjorka itu salah.\n" +
                "Dihimpun detikcom, Rabu (14/9/2022), kemunculan Bjorka memang menjadi perhatian publik dalam beberapa hari terakhir. Pemerintah menanggapi serius adanya dugaan kebocoran data ini. Bahkan Presiden Joko Widodo (Jokowi) menggelar rapat terbatas di Istana untuk merespons isu yang berkembang di publik.\n" +
                "\n" +
                "Menteri Komunikasi dan Informatika (Menkominfo) Johnny G Plate yang hadir dalam rapat tersebut lantas menyampaikan pernyataan sikap pemerintah. Johnny mengakui ada data pemerintah yang beredar seperti diungkap hacker Bjorka, tetapi data itu merupakan data umum.\n" +
                "\n" + "Di rapat dibicarakan bahwa memang ada data-data yang beredar, oleh ya salah satunya oleh Bjorka. Tetapi data-data itu setelah ditelaah sementara adalah data-data umum, bukan data-data spesifik dan bukan data-data yang ter-update sekarang. Sebagian data-data yang lama. Hanya tim lintas kementerian/lembaga, BSSN Kominfo Polri, dan BIN juga berkoordinasi untuk menelaah secara dalam,\" kata Johnny kepada wartawan di Kompleks Istana Kepresidenan, Jakarta Pusat, Senin (12/9).", R.drawable.berita_satu),
        ListDataBerita("Anies Baswedan Terima Penghargaan dari Pemerintah Singapura", "Rabu, 14 Sep 2022", "Jurnalis : Antara", "TEMPO.CO, Jakarta -  Gubernur DKI Jakarta Anies Baswedan menerima penghargaan dari Pemerintah Singapura karena dinilai berkontribusi bagi pembangunan negara dan hubungan bilateral kedua negara.\n" +
                "\n" +
                "\"Atas nama Indonesia dan Jakarta, terima kasih atas kehormatan ini,\" kata Anies melalui akun Instagram pribadinya @aniesbaswedan Rabu, 14 September 2022.\n" +
                "\n" +
                "Anies membagikan momen dirinya menerima tanda penghargaan yang bertuliskan bahwa Anies sebagai penerima ke-72 untuk program Lee Kuan Yew Exchange Fellow di akun media sosialnya.\n" +
                "\n" +
                "\"Fellowship ini menjadi sebuah tanggung jawab besar, kami berharap bisa terus berkolaborasi memperkuat hubungan antar kedua negara dan dengan Jakarta khususnya,\" ujar Anies.", R.drawable.berita_dua),
        ListDataBerita("Semarak Mural di Kampung Gembira Gembrong, Segera Diresmikan Anies Baswedan", "Rabu, 14 Sep 2022", "Jurnalis : Antara", "TEMPO.CO, Jakarta - Pemerintah Kota Jakarta Timur (Pemkot Jaktim) memperindah revitalisasi Kampung Gembira Gembrong dengan lukisan mural. Pengerjaan mural tersebut melibatkan petugas penanganan prasarana dan sarana umum (PPSU).\n" +
                "\n" +
                "Asisten Perekonomian dan Pembangunan Kota Jakarta Timur, Kusmanto mengatakan setiap hari ada 80 orang PPSU yang dikerahkan. \"Ada yang membantu pembersihan lahan dan pembuatan mural,\" katanya seperti dikutip dari Antara, Selasa, 13 September 2022.\n" +
                "\n" +
                "Kusmanto menambahkan, pembangunan Kampung Gembira Gembrong bagi warga korban kebakaran Pasar Gembrong itu telah mencapai 90 persen. Saat ini pengerjaan pembangunan tengah difokuskan pada penyelesaian pembangunan saluran air dan sejumlah infrastruktur.", R.drawable.berita_tiga),
        ListDataBerita("Pembunuhan Brigadir J, Komnas HAM Duga Ferdy Sambo Punya Masalah Kejiwaan", "Rabu, 14 Sep 2022", "Jurnalis : Hamdan", "TEMPO.CO, Jakarta - Ketua Komisi Hak Asasi Manusia, Ahmad Taufan Damanik mengungkapkan bahwa pihaknya menduga bahwa Ferdy Sambo mempunyai masalah kejiwaan hingga melakukan pembunuhan kepada Nofriyansyah Yosua Hutabarat alias Brigadir J. Masalah kejiwaan yang dimaksud adalah adanya sifat superpower yang dimiliki Ferdy Sambo karena mempunyai jabatan sebagai Kadiv Propam Polri dan juga Ketua Satgasus Merah Putih.\n" +
                "\n" +
                "“Bisa jadi psikopat, tapi ini bisa karena superpower itu. Dia bisa ngeyakinin dirinya, siapa yang bisa bongkar kejahatan saya, saya bisa suruh-suruh ini semua,” kata Taufan saat diwawancara langsung di Gedung Komnas HAM, Jakarta Pusat, Selasa 13 September 2022.\n" +
                "\n" +
                "Adanya sifat superpower dari Ferdy Sambo ini membuatnya jumawa hingga bisa melakukan sesuatu yang melanggar hukum. Masalah kejiwaannya ini membuat Ferdy Sambo ingin membunuh langsung sang korban. “Bisa jadi ada kebencian kalau tidak dihabisi langsung. Karena dia merasa superpower,” ujarnya.\n" +
                "\n" +
                "Dugaan Taufan ini merujuk kedudukan Ferdy Sambo yang semestinya dengan mudah bisa membunuh orang. Dengan jabatan yang dimilikinya, Ferdy tentu bisa mengutus anak buahnya membunuh Yosua tanpa mengotori tangannya. Namun pada kejadian ini, Sambo justru diduga ingin membunuh Yosua secara langsung.\n" +
                "\n" +
                "“Sambo ini semestinya bisa dengan mudah menculik Yosua lalu dibawa ke Depok terus dibunuh ditabrakin truk gitu kan bisa. Ngapain dia sampai susah-susah bunuh Yosua sendiri apalagi di rumah dinasnya sendiri lagi. Ini yang aneh menurut saya,” kata Taufan.\n" +
                "\n" +
                "Dugaan Taufan semakin kuat ditambah dengan kesaksiannya yang melihat Ferdy Sambo cukup tenang menghadapi pembunuhan ini. “Maka kita bilang extra judicial killing. Maka kita bilang dengan kekuasaannya dia itu dia bisa membunuh orang dengan semena-mena karena dia yakin tidak ada orang yang bisa bongkar itu. Gak ada yang berani bongkar itu. Tenang loh dia, tanggal 8 kejadian, 11 sore baru diumumkan diatur semua sama dia,” ujarnya.\n" +
                "\n" +
                "Dugaan munculnya penyakit kejiwaan ini juga berdasar pada Ferdy Sambo yang terlihat bisa menjadi garang namun suatu waktu bisa menangis. “Waktu ngobrol sama saya itu dia nangis-nangis gitu. Tapi coba kamu lihat pada saat rekonstruksi kejadian itu, dia terlihat bengis,” kata Taufan.\n" +
                "\n" +
                "Secara psikologi, menurut Taufan Sambo itu merasa kalau melakukan pelanggaran hukum itu dia bakal gak bisa kena. Karena dia superpower bahkan superpower dari Kapolri.\n" +
                "\n" +
                "“Logikanya untuk membunuh kan pasti punya cara untuk menghilangkan jejak. Dia kan seharusnya bisa nyuruh orang untuk membunuh Yosua, tapi ini nggak ini orang ingin melihat langsung pembunuhan itu. Ini terbuktikan sudah berhari-hari susah sekali untuk menjerat dia?” ujarnya.", R.drawable.berita_empat),
        ListDataBerita("Diminta Zulkifli Hasan Bangun Pabrik di Lampung, Bos Nike: Masih Banyak Tantangan", "Rabu, 14 Sep 2022", "Jurnalis : Riani", "TEMPO.CO, Jakarta - Managing Director Nike Indonesia, Joseph Warren menanggapi permintaan Menteri Perdagangan Zulkifli Hasan untuk membangun pabrik di Lampung.\n" +
                "\n" +
                "\"Itu sudah dipertimbangkan. Tapi masih terdapat beberapa tantangan untuk mengatasi suatu kawasan, khususnya infrastruktur seperti fasilitas pelabuhan,\" ucap Warren di pabrik PT Pratama Abadi Industri, Serpong Tangerang Selatan pada Selasa, 13 September 2022. \n" +
                "\n" +
                "Ia mengatakan jika pabrik Nike akan dibangun di Lampung, maka perlu dikaji lagi soal ketersediaan tenaga kerja dan besaran upahnya. Selain itu juga soal ketersediaan bahan baku dan akses transportasinya. \n" +
                "\n" +
                "Meski begitu, Warren memastikan Nike sangat berkomitmen untuk membangun Indonesia. Terlebih saat ini, 30 persen dari produksi Nike berada di Indonesia. \"Dan Indonesia adalah negara dengan pertumbuhan tercepat di jaringan Nike.\" \n" +
                "\n" +
                "Tahun lalu saja, kata dia, Nike Indonesia telah meningkatkan total produksi sebesar 60 juta pasang dalam satu tahun. Pada tahun lalu, Nike juga berhasil membawa 250 juta pasang sepatu per tahun. Angka tersebut tercatat sebagai pencapaian tertinggi dalam 34 tahun sejarah Nike Indonesia. \n" +
                "\n" +
                "Adapun ia menyatakan pembangunan pabrik di daerah lainnya di Indonesia masih menjadi pilihan baginya. Warren berujar jika nantinya akan membangun pabrik baru, ia tak akan membatasi opsi wilayah di Indonesia. \n" +
                "\n" +
                "\"Saya pikir Sumatera atau sebuah pulau lain di Indonesia, bukan hanya Lampung. Jadi saya tidak akan memfokuskan komentar itu hanya pada Lampung,\" kata Warren. ", R.drawable.berita_lima)
    )

    val beritaList : MutableLiveData<List<ListDataBerita>> = MutableLiveData()

    fun getBerita(){
        var berita = listDataBerita
        beritaList.value = berita
    }
}
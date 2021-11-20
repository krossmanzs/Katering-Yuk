package com.krossmanzs.kateringyuk.data

import com.krossmanzs.kateringyuk.R

object FoodsData {
    private val foodNames = arrayOf(
        "Rendang",
        "Sate Ayam Madura",
        "Gudeg",
        "Capcai",
        "Pecel",
        "Soto Betawi",
        "Pindang Patin",
        "Cah Kangkung",
        "Udang Asam Manis",
        "Rawon"
    )

    private val foodDetails = arrayOf(
        "Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.\n" +
                "\n" +
                "Rendang dapat dijumpai di Rumah Makan Padang di seluruh dunia. Masakan ini populer di Indonesia dan negara-negara Asia Tenggara lainnya, seperti Malaysia, Singapura, Brunei, Filipina dan Thailand. Di daerah asalnya, Minangkabau, rendang disajikan di berbagai upacara adat dan perhelatan istimewa. Meskipun rendang merupakan masakan tradisional Minangkabau, teknik memasak serta pilihan dan penggunaan bumbu rendang berbeda-beda menurut daerah.",
        "Sate Ayam Madura ini bila dilihat hampir sama dengan sate ayam di Indonesia pada umumnya, namun yang menjadi keistimewaan dari Sate Ayam Madura ini adalah rasa bumbu kacangnya yang sangat khas. Selain itu daging satenya juga terasa sangat empuk dan memiliki aroma yang sedap dan menggugah selera.\n" +
                "\n" +
                "Pengolahan Sate Ayam Madura ini hampir sama dengan sate pada umumnya, pertama daging ayam dipotong kecil sesuai dengan ukuran dan ditusuk dengan tusuk sate. Sedangkan untuk bumbu kacang pada Sate Ayam Madura ini terbuat dari kacang goreng yang ditumbuk hingga halus dan diolah dengan bumbu khusus.[kemlu.go.id]\n",
        "Gudeg adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat hidangan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.\n" +
                "\n" +
                "Gudeg sangat populer di Jawa, hidangan ini merupakan hidangan populer baik sebagai masakan rumahan maupun hidangan jalanan. Gudeg juga diproduksi secara industri sebagai makanan kaleng. Gudeg juga bisa ditemui di luar Indonesia, khususnya di negara tetangga seperti Malaysia dan Singapura. [wikipedia]",
        "Capcai atau capcay adalah nama hidangan khas Tionghoa-Indonesia berupa banyak macam sayuran yang dimasak dengan cara direbus (kuah) atau digoreng tumis. Capcai asal mulanya merupakan variasi dari hidangan khas Fujian. Nama capcai diambil dari dialek Hokkian yang secara harfiah berarti \"aneka ragam sayur\".\n" +
                "\n" +
                "Jumlah sayuran dalam capcai tidak tentu, tetapi banyak yang salah kaprah mengira bahwa capcai harus mengandung 10 macam sayuran karena secara harfiah adalah berarti \"sepuluh sayur\". Cap di dalam dialek Hokkian juga dapat dieja \"sepuluh\", dan cai berarti sayur.[wikipedia]",
        "Pecel atau pecal merupakan makanan berasal dari pulau Jawa, makanan ini biasanya dihidangkan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur.\n" +
                "\n" +
                "Secara etimologi, dalam bahasa Jawa, bahwa pecel dapat diartikan sebagai 'tumbuk' atau 'dihancurkan dengan cara ditumbuk'.\n" +
                "\n" +
                "Ada angapan Pecel itu berasal dari Ponorogo, Jawa Timur, karena sambal kacang yang digunakan dalam campuran pecel juga digunakan dalam bumbu sate Ponorogo. Makanan ini juga mirip dengan gado-gado yang membedakannya adalah campuran bahan dan tekstur bumbunya. Nama Pecel Madiun merupakan pecel yang paling terkenal di Indonesia.\n" +
                "\n" +
                "Pecel juga dapat ditemukan di Malaysia, Filipina, Thailand, dan Suriname dengan cita rasa yang sedikit berbeda dari pecel di Indonesia karena perbedaan jenis kacang yang digunakan.[wikipedia]",
        "Soto Betawi merupakan salah satu jenis soto khas Nusantara yang paling digemari. Berkuah putih dan cukup kental, soto Betawi ada yang terbuat dari santan kelapa atau susu. Tak ayal, menu ini identik dengan rasa gurih.\n" +
                "\n" +
                "Berisikan daging sapi dan organ dalam (jeroan), soto Betawi bisa jadi masakan terjamin kenikmatannya. Makanan berkuah ini kaya akan rempah seperti cengkih, pala, kayu manis, dan merica sehingga terasa hangat di badan. Tidak seperti yang dibayangkan, ternyata menu ini bisa kita masak sendiri di rumah. Sama nikmatnya seperti soto Betawi ala restoran, berikut racikan resepnya. [bango.co.id]",
        "Pindang ikan  patin merupakan olahan makanan khas palembang. Dagingnya yang lembut memang paling enak dibuat pindang. Kuah hangat yang gurih dengan semburat asam pedas dijamin bikin Anda kangen kampung halaman.\n" +
                "\n" +
                "Kuliner khas Palembang memang asyik-asyik, seperti pempek, pindang ikan patin, tempoyak, mie celor hingga es kacang merah. Perut sepertinya harus siap menerima lonjakan kapasitas.\n" +
                "\n" +
                "Ikan Patin menjadi salah satu ikan yang banyak diolah menjadi beragam masakan di Sumatera. Ikan patin merupakan jenis ikan catfish dan merupakan salah satu komoditas perikanan yang mempunyai nilai ekonomis tinggi.[blog.dparagon.com]",
        "Kangkung tumis atau kadang disebut tumis kangkung atau cah kangkung adalah hidangan sayur tumis yang lazim ditemukan dalam hidangan Asia. Kangkung (Ipomoea aquatica) digoreng tumis dengan campuran berbagai sayuran, bumbu, dan terkadang daging. Hidangan ini lazim ditemukan di Asia Tenggara, Asia Timur, dan Asia Selatan; dari masakan Indonesia, Malaysia, Singapura, hingga masakan Filipina, dan Vietnam di Asia Tenggara; Sichuan dan Kanton di Cina, serta masakan Sri Lanka dan masakan Bengali di Asia Selatan. Akibatnya, ia dikenal dengan banyak nama.\n" +
                "\n" +
                "Salah satu hidangan kangkung tumis yang secara khusus menggunakan terasi atau belacan disebut kangkung belacan. Di Jawa Barat, versi Masakan Tionghoa Indonesia menggunakan tauco.[wikipedia]",
        "Bumbu asam manis adalah perpaduan dari saus tomat, saus sambal, dan saus tiram. Ketiga saus tersebut bisa digunakan untuk masak beragam protein hewani salah satunya udang. \n" +
                "\n" +
                "Udang asam manis biasanya dijual di warung seafood pinggir jalan atau restoran chinese food. Namun, kamu bisa membuat udang asam manis sendiri di rumah. [kompas.com]",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur (daerah Arekan), dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta).\n" +
                "\n" +
                "Daging untuk rawon umumnya adalah daging sapi yang dipotong kecil-kecil, utamanya adalah bagian sandung lamur. Bumbu supnya sangat khas Indonesia, yaitu campuran bawang merah, bawang putih, lengkuas (laos), ketumbar, kemiri, serai, kunir, cabai, kluwek, garam, serta minyak nabati. Semua bahan ini dihaluskan, lalu ditumis sampai harum. Campuran bumbu ini kemudian dimasukkan dalam kaldu rebusan daging bersama-sama dengan daging. Warna gelap khas rawon berasal dari kluwek. Di luar negeri, rawon disebut sebagai black soup. [wikipedia]"
    )

    private val foodPrices = arrayOf(
        "Rp. 75.000",
        "Rp. 20.000",
        "Rp. 10.000",
        "Rp. 10.000",
        "Rp. 8.000",
        "Rp. 21.000",
        "Rp. 27.000",
        "Rp. 6.000",
        "Rp. 32.000",
        "Rp. 20.000"
    )

    private val foodImages = arrayOf(
        R.drawable.rendang,
        R.drawable.sate_ayam_madura,
        R.drawable.gudeg,
        R.drawable.capcai,
        R.drawable.pecel,
        R.drawable.soto_betawi,
        R.drawable.pindang_patin,
        R.drawable.cah_kangkung,
        R.drawable.udang_asam_manis,
        R.drawable.rawon
    )

    private val foodRatings = arrayOf(
        R.drawable.five_star,
        R.drawable.four_star,
        R.drawable.five_star,
        R.drawable.five_star,
        R.drawable.four_star,
        R.drawable.five_star,
        R.drawable.five_star,
        R.drawable.three_star,
        R.drawable.four_star,
        R.drawable.five_star,
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for(position in foodNames.indices) {
                list.add(
                    Food(
                        foodNames[position],
                        foodDetails[position],
                        foodPrices[position],
                        foodImages[position],
                        foodRatings[position]
                    )
                )
            }
            return list
        }

}
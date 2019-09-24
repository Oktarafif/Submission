package com.example.submission;

import java.util.ArrayList;

public class FoodsData {
    private static String[] foodNames = {
            "Soto lamongan",
            "rujak cingur",
            "Gado-gado",
            "Tahu tek",
            "Tahu petis",
            "Nasi krawu",
            "Sate madura",
            "Bakso Malang",
            "Tahu campur",
            "Pecel madiun"
    };

    private static String[] foodDetais = {
            "Soto Lamongan menjadi salah satu makanan khas Jawa Timur yang saat sangat mudah ditemukan di berbagai daerah lainnya. Namun, terdapat perbedaan antara soto Lamongan dengan soto lainnya, yakni koya, tahukah Anda apa itu koya? Koya merupakan sejenis bubuk gurih dengan bahan dasar pembuatannya berasal dari kerupuk udang dan bawang putih.",
            "Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama daerah asalnya Surabaya. Dalam bahasa Jawa kata cingur berarti mulut, hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan beberapa jenis buah seperti timun, kerahi (krai, yaitu sejenis timun khas Jawa Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang. Semua bahan tadi dicampur dengan saus atau bumbu yang terbuat dari olahan petis udang, air matang untuk sedikit mengencerkan, gula/gula merah, cabai, kacang tanah yang digoreng, bawang goreng, garam, dan irisan tipis pisang biji hijau yang masih muda (pisang klutuk). Semua saus/bumbu dicampur dengan cara diulek, itu sebabnya rujak cingur juga sering disebut rujak ulek.",
            "Gado-gado adalah salah satu makanan yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk saus gado gado kentang rebus dimasak bersamaan dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng. Sedikit emping goreng atau kerupuk (ada juga yang memakai kerupuk udang) juga ditambahkan.",
            "Tahu tek adalah salah satu masakan khas kota Surabaya. Tahu tek terdiri atas tahu goreng setengah matang dan lontong yang dipotong kecil-kecil dengan alat gunting dan garpu untuk memegang tahu atau lontong, kentang goreng, sedikit taoge, dan irisan ketimun dipotong kecil-panjang (seperti acar), lalu setelah disiram dengan bumbu di atasnya, ditaburkan kerupuk udang yang bentuknya kecil dengan diameter sekitar 3 cm.",
            "Tahu petis adalah jajanan khas kota Semarang berupa tahu goreng yang dimakan dengan petis (saus berwarna hitam kental yang biasanya terbuat dari udang) yang dioleskan/disisipkan di tengah-tengah tahu. Seperti tahu pong tetapi rasanya tidak asin, yaitu berasal dari tahu putih yang digoreng sampai kecokelatan tanpa dibumbui atau dibumbui dengan larutan garam dan bawang putih saja. Sedangkan petisnya berasa manis agak sedikit asin. Agar menggugah selera tahu petis biasanya dimakan dengan cabai rawit.",
            "Nasi krawu merupakan makanan khas dari daerah Gresik, Jawa Timur. Cirinya adalah nasinya yang pulen dan disajikan dengan daun pisang. Lauknya dapat berupa sayatan daging sapi, semur daging, jeroan sapi, sambal terasi dan serundeng. Sambal terasi yang disajikan bersama dengan nasi krawu memiliki rasa pedas yang khas. Bagi pecinta masakan pedas, wajib mencoba nasi krawu saat berkunjung ke Gresik.",
            "Sate Madura adalah sate yang meiliki bumbu khas Madura. Sate Madura biasanya terbuat dari ayam. Madura selain terkenal sebagai pulau garam, juga terkenal dengan satenya. Sate madura sudah terkenal di seluruh Nusantara, Sate Madura dapat ditemukan hampir di semua daerah khususnya di kota besar seperti Medan, Jakarta, Bandung, dan Surabaya. Konon di Madura sendiri sate susah dicari.",
            "Bakso Malang disebut dengan nama Bakwan Malang. Berbeda dengan bakso pada umumnya yang biasanya berisi campuran bakso halus atau bakso urat dan mi kuning atau mi putih, Bakwan Malang memiliki pilihan isian seperti bakso halus, bakso urat, bakso goreng, bakwan rebus, pangsit goreng, dan tahu rebus. Sementara kuahnya merupakan kaldu hasil rebusan tulang-tulang dan sum-sum sapi yang membuat rasanya menjadi lebih gurih, segar, dan menambah kelezatan. Tidak ketinggalan, taburan bawang goreng dan daun bawang ikut menebar aroma harum yang menggugah selera.",
            "Tahu campur adalah salah satu makanan khas Jawa Timur, tepatnya dari kota Lamongan.[1] Tahu campur terdiri dari sop daging sapi kenyal, tahu goreng, perkedel singkong, taoge segar, selada air segar, mi kuning, dan kerupuk udang. Semua ini kemudian dicampurkan ke bumbu petis, bawang goreng, dan sambal. Masakan ini banyak dijual di warung kaki lima dengan label Tahu Campur Lamongan.",
            "Pecel atau pecal merupakan makanan yang dikombinasikan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran.Pecel Madiun merupakan pecel yang paling terkenal di Indonesia."
    };

    private static int[] foodsImages = {
            R.drawable.soto_lamongan,
            R.drawable.rujak_cingur,
            R.drawable.gado_gado,
            R.drawable.tahu_tek,
            R.drawable.tahu_petis,
            R.drawable.nasi_krawu,
            R.drawable.sate_madura,
            R.drawable.bakso_malang,
            R.drawable.tahu_campur,
            R.drawable.pecel_madiun
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetais[position]);
            food.setPhoto(foodsImages[position]);
            list.add(food);
        }
        return list;
    }
}

//public class FoodsData {
//    private static String[] foodNames = {
//            "Soto lamongan",
//            "Rujak cingur",
//            "Gago-gado",
//            "Tahu tek",
//            "Tahu petis",
//            "Nasi krawu",
//            "Sate madura",
//            "Bakso malang",
//            "Tahu campur",
//            "Pecel madiun"
//    };
//
//    private static String[] foodDetails = {
//            "Soto Lamongan menjadi salah satu makanan khas Jawa Timur yang saat sangat mudah ditemukan di berbagai daerah lainnya. Namun, terdapat perbedaan antara soto Lamongan dengan soto lainnya, yakni koya, tahukah Anda apa itu koya? Koya merupakan sejenis bubuk gurih dengan bahan dasar pembuatannya berasal dari kerupuk udang dan bawang putih.",
//            "Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama daerah asalnya Surabaya. Dalam bahasa Jawa kata cingur berarti mulut, hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan beberapa jenis buah seperti timun, kerahi (krai, yaitu sejenis timun khas Jawa Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang. Semua bahan tadi dicampur dengan saus atau bumbu yang terbuat dari olahan petis udang, air matang untuk sedikit mengencerkan, gula/gula merah, cabai, kacang tanah yang digoreng, bawang goreng, garam, dan irisan tipis pisang biji hijau yang masih muda (pisang klutuk). Semua saus/bumbu dicampur dengan cara diulek, itu sebabnya rujak cingur juga sering disebut rujak ulek.",
//            "Gado-gado adalah salah satu makanan yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk saus gado gado kentang rebus dimasak bersamaan dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng. Sedikit emping goreng atau kerupuk (ada juga yang memakai kerupuk udang) juga ditambahkan.",
//            "Tahu tek adalah salah satu masakan khas kota Surabaya. Tahu tek terdiri atas tahu goreng setengah matang dan lontong yang dipotong kecil-kecil dengan alat gunting dan garpu untuk memegang tahu atau lontong, kentang goreng, sedikit taoge, dan irisan ketimun dipotong kecil-panjang (seperti acar), lalu setelah disiram dengan bumbu di atasnya, ditaburkan kerupuk udang yang bentuknya kecil dengan diameter sekitar 3 cm.",
//            "Tahu petis adalah jajanan khas kota Semarang berupa tahu goreng yang dimakan dengan petis (saus berwarna hitam kental yang biasanya terbuat dari udang) yang dioleskan/disisipkan di tengah-tengah tahu. Seperti tahu pong tetapi rasanya tidak asin, yaitu berasal dari tahu putih yang digoreng sampai kecokelatan tanpa dibumbui atau dibumbui dengan larutan garam dan bawang putih saja. Sedangkan petisnya berasa manis agak sedikit asin. Agar menggugah selera tahu petis biasanya dimakan dengan cabai rawit.",
//            "Nasi krawu merupakan makanan khas dari daerah Gresik, Jawa Timur. Cirinya adalah nasinya yang pulen dan disajikan dengan daun pisang. Lauknya dapat berupa sayatan daging sapi, semur daging, jeroan sapi, sambal terasi dan serundeng. Sambal terasi yang disajikan bersama dengan nasi krawu memiliki rasa pedas yang khas. Bagi pecinta masakan pedas, wajib mencoba nasi krawu saat berkunjung ke Gresik.",
//            "Sate Madura (Madura: Satè Mâdhurâ) adalah sate yang meiliki bumbu khas Madura. Sate Madura biasanya terbuat dari ayam. Madura selain terkenal sebagai pulau garam, juga terkenal dengan satenya. Sate madura sudah terkenal di seluruh Nusantara, Sate Madura dapat ditemukan hampir di semua daerah khususnya di kota besar seperti Medan, Jakarta, Bandung, dan Surabaya. Konon di Madura sendiri sate susah dicari.",
//            "Bakso Malang disebut dengan nama Bakwan Malang. Berbeda dengan bakso pada umumnya yang biasanya berisi campuran bakso halus atau bakso urat dan mi kuning atau mi putih, Bakwan Malang memiliki pilihan isian seperti bakso halus, bakso urat, bakso goreng, bakwan rebus, pangsit goreng, dan tahu rebus. Sementara kuahnya merupakan kaldu hasil rebusan tulang-tulang dan sum-sum sapi yang membuat rasanya menjadi lebih gurih, segar, dan menambah kelezatan. Tidak ketinggalan, taburan bawang goreng dan daun bawang ikut menebar aroma harum yang menggugah selera.",
//            "Tahu campur adalah salah satu makanan khas Jawa Timur, tepatnya dari kota Lamongan.[1] Tahu campur terdiri dari sop daging sapi kenyal, tahu goreng, perkedel singkong, taoge segar, selada air segar, mi kuning, dan kerupuk udang. Semua ini kemudian dicampurkan ke bumbu petis, bawang goreng, dan sambal. Masakan ini banyak dijual di warung kaki lima dengan label Tahu Campur Lamongan.",
//            "Pecel atau pecal (Hanacaraka: ꦥꦼꦕꦼꦭ꧀) merupakan makanan yang dikombinasikan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran.Pecel Madiun merupakan pecel yang paling terkenal di Indonesia."
//    };
//
//    private static int[] foodsImages = {
//            R.drawable.Soto_lamongan
//            R.drawable
//
//
//
//    };





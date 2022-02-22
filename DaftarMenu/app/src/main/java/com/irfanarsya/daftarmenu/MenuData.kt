package com.irfanarsya.daftarmenu

object MenuData {
    private val menuNames = arrayOf(
        "Bir",
        "Burger",
        "Ayam",
        "Biskuit",
        "Kue Mini",
        "Donat",
        "Kentang Goreng",
        "Hot Dog",
        "Es Krim",
        "Mie",
        "Pizza",
        "Berondong Jagung",
        "Taco"
    )

    private val menuPrices = arrayOf(
        "Rp. 50.000,-",
        "Rp. 15.000,-",
        "Rp. 12.000,-",
        "Rp. 5.000,-",
        "Rp. 4.000,-",
        "Rp. 4.000,-",
        "Rp. 8.000,-",
        "Rp. 10.000,-",
        "Rp. 5.000,-",
        "Rp. 7.000,-",
        "Rp. 15.000,-",
        "Rp. 8.000,-",
        "Rp. 10.000,-"
    )

    private val menuDetails = arrayOf(
        "Bir adalah segala minuman beralkohol yang diproduksi melalui proses fermentasi bahan berpati tanpa melalui proses penyulingan setelah fermentasi.",
        "Hamburger adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.",
        "Ayam goreng Nusantara adalah hidangan Asia Tenggara yang merupakan ayam yang digoreng dalam minyak goreng. Dalam dunia internasional, istilah ayam goreng merujuk kepada ayam goreng gaya Nusantara.",
        "Kukis adalah makanan yang dipanggang atau dimasak yang biasanya kecil, datar, dan manis. Kukis biasanya terdiri dari tepung, gula, dan beberapa jenis minyak atau lemak. Kukis juga dapat dicampur dengan bahan-bahan lain seperti kismis, gandum, keping cokelat, kacang-kacangan, dll.",
        "Cupcake adalah kue kecil yang dirancang untuk melayani satu orang, yang dapat dipanggang dalam kertas tipis atau cangkir aluminium. Seperti halnya kue yang lebih besar, hiasan frosting dan kue lainnya seperti buah dan permen dapat diaplikasikan.",
        "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula pasir, kuning telur, ragi roti, dan mentega. Donat yang paling umum adalah donat dengan bentuk seperti cincin dan ada lubang di tengahnya, biasanya ditaburi dengan mesis atau gula halus.",
        "Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas disebut French fries.",
        "Hot dog adalah suatu jenis sosis yang dimasak atau diasapi dan memiliki tekstur yang lebih halus serta rasa yang lebih lembut dan basah daripada kebanyakan sosis.",
        "Es krim adalah sebuah makanan beku dibuat dari produk susu seperti krim, digabungkan dengan perasa dan pemanis buatan ataupun alami. Campuran ini didinginkan dengan mengaduk sambil mengurangi suhunya untuk mencegah pembentukan kristal es besar.",
        "Mi adalah adonan tipis dan panjang yang telah digulung, dikeringkan, dan dimasak dalam air mendidih. Istilah ini juga merujuk kepada mi kering yang harus dimasak kembali dengan dicelupkan dalam air.",
        "Piza adalah hidangan gurih dari Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih. Keju yang dipakai biasanya mozzarella, bisa juga keju parmesan dan beberapa keju lainnya.",
        "Berondong atau bertih jagung adalah jenis penganan dari bijian serealia yang dipanaskan hingga meletup. Berondong yang paling umum dibuat dari bijian jagung, tetapi juga dapat dibuat dari beberapa serealias lain, seperti padi dan bayam biji.",
        "Taco adalah makanan khas Meksiko yang terdiri atas gulungan atau lipatan tortilla yang diisi dengan berbagai macam masakan di dalamnya. Salah satu versi Taco terdapat di makanan khas Tex-Mex, yakni Breakfast Taco yang terdiri atas telur dadar dan kombinasi kentang, sosis dan/atau daging babi asap."
    )

    private val menuImages = intArrayOf(
        R.drawable.beer,
        R.drawable.burger,
        R.drawable.chickenleg,
        R.drawable.cookies,
        R.drawable.cupcake,
        R.drawable.donut,
        R.drawable.frenchfries,
        R.drawable.hotdog,
        R.drawable.icecream,
        R.drawable.noodles,
        R.drawable.pizza,
        R.drawable.popcorn,
        R.drawable.tacos
    )

    private val menuUrlImages = arrayOf(
        "d/d7/Lager_beer_in_glass.jpg",
        "b/b7/Burger_King_double_cheeseburger.jpg",
        "thumb/1/1b/Ayam_goreng_in_Jakarta.JPG/1280px-Ayam_goreng_in_Jakarta.JPG",
        "thumb/f/f1/2ChocolateChipCookies.jpg/1024px-2ChocolateChipCookies.jpg",
        "f/fb/Chocolate_Cupcakes.jpg",
        "a/a5/Glazed-Donut.jpg",
        "3/3b/Pommes-1.jpg",
        "thumb/f/fb/Hotdog_-_Evan_Swigart.jpg/250px-Hotdog_-_Evan_Swigart.jpg",
        "3/31/Ice_Cream_dessert_02.jpg",
        "f/f0/Mi_Goreng_GM.jpg",
        "d/d1/Pepperoni_pizza.jpg",
        "d/d2/Popcorn_up_close_salted_and_air_popped.jpg",
        "a/a8/Mexico.Tacos.01.jpg"
    )

    val listData: ArrayList<Menu>
        get() {
            val list = arrayListOf<Menu>()
            for (position in menuNames.indices) {
                val menu = Menu()
                menu.name = menuNames[position]
                menu.price = menuPrices[position]
                menu.detail = menuDetails[position]
                menu.photo = menuImages[position]
                menu.url = menuUrlImages[position]
                list.add(menu)
            }
            return list
        }
}
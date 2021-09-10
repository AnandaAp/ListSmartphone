fun main() {
    val realme = Realme()
    val samsung = Samsung()
    val smartPhone = arrayListOf<SmartPhone>()
    smartPhone.add(realme)
    smartPhone.add(samsung)
    while (true){
        println("List of Smartphone")
        var index = 1
        smartPhone.forEach { 
            println("$index. ${it.brand}")
            index++
        }
        println("$index. Keluar")
        print("Pilih untuk melihat informasi Smartphone: ")
        val pilihan = readLine()?.toInt()
        if(pilihan == index){
            break
        }
        else{
            if (pilihan != null) {
                println()
                println()
                println()
                menuBehavior(pilihan,smartPhone)
            }
        }
    }
}

//fun menu(_smartPhone[pilihan]: ArrayList<SmartPhone>){
//    var index = 1
//    println()
//    _smartPhone[pilihan].forEach {
//        println("$index. ${it.brand}")
//        index++
//    }
//    println("$index. Keluar")
//    print("Pilih untuk melihat informasi Smartphone: ")
//    val pilihan = readLine()?.toInt()
//    if (pilihan == 7){
//        return
//    }
//    else if (pilihan != null) {
//        if(pilihan < 7){
//            menuBehavior(pilihan,_smartPhone[pilihan])
//        }
//    }
//}

fun menuBehavior(pilihan : Int,_smartPhone: ArrayList<SmartPhone>) {
    println(_smartPhone[pilihan-1].brand)
    println("1. Tamplkan Semua data")
    println("2. Tampilkan slogan")
    println("3. Tampilkan Flagship Phone")
    println("4. Tampilkan Mid Range Phone")
    println("5. Tampilkan Early Range Phone")
    print("Pilihanmu : ")
    when (readLine()?.toInt()) {
        1 -> println(_smartPhone[pilihan-1].showAllProducts())
        2 -> println(_smartPhone[pilihan-1].slogan)
        3 -> println(_smartPhone[pilihan-1].flaghshipPhone)
        4 -> println(_smartPhone[pilihan-1].midRangePhone)
        5 -> println(_smartPhone[pilihan-1].earlyRangePhone)
    }
    println()
}

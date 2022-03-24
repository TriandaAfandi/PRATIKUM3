//kode program kelas Person diatas maka kita dapat menggabungkan proses deklarasi dan menginisialisasi
// sebuah variabel pada blok inisialisasi kedalam satu statement

class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val budi = PersonB("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}

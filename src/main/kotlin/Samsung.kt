class Samsung : SmartPhone() {
    override var brand: String = String()
    override var slogan: String = String()
    override var flaghshipPhone: String = String()
    override var midRangePhone: String = String()
    override var earlyRangePhone: String = String()

    init {
        brand = "Samsung"
        slogan = "Samsung, Do What You Can't"
        flaghshipPhone = "$brand Galaxy Z Fold 2"
        midRangePhone = "$brand Galaxy A51"
        earlyRangePhone = "$brand Galaxy A01"
    }

    override fun showAllProducts(): String {
        return super.showAllProducts()
    }
}
open class SmartPhone {
    open var brand = String()
    open var slogan = String()
    open var flaghshipPhone = String()
    open var midRangePhone = String()
    open var earlyRangePhone = String()

    open fun showAllProducts(): String {
        return "Info" + "\n" + "Brand = $brand" +
                "\n" + "Slogan = $slogan" +
                "\n" + "Flagship = $flaghshipPhone" +
                "\n" + "Mid Range Phone = $midRangePhone" +
                "\n" + "Early Range Phone = $earlyRangePhone"
    }
}
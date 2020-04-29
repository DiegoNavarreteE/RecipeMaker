class DataEntry {
    private var response:String? = null
    private var option:Int = 0
    constructor(response:String?) {
        this.response = response
    }
    public fun getOption(): Int {
        option = response?.toInt() ?: 0
        return option
    }
}
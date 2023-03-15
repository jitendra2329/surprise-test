// TODO : capitalize a particular charcter in a string and aslo display the count of that charcter

object SupriseTestGroupB extends App {

    val result = capitalizeCharcter("jitendra", 'j')
    println(result)

    def capitalizeCharcter(string: String, charcter: Char, count: Int = 0): (String, Int) = {

        if(string.take(string.length - (string.length-1)) == charcter.toString && string.take(string.length - (string.length-1)) == string.take(string.length - (string.length-1)).toLowerCase()){
          (string.take(string.length - (string.length-1)).toUpperCase() + string.drop(string.length - string.length+1), count +1)
        } else capitalizeCharcter(string.take(string.length - (string.length-1)), charcter)
    }
}
/*

      captalizeCharcter("jitendra", 'j')
                        "j"
 */

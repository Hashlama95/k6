fun main(args: Array<String>) {
    var items = 5

    while(items>0) {
        println(items)
        items--
    }

    do {
        println("Items: $items")
    } while(items == 5)


}
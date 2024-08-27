def list =  [1, 3, 4, 5, 1, 5, 4]

println countInt(list)

static def countInt(list) {
    def result = [:]

    list.each { el ->
        result[el] = result.get(el, 0) + 1
    }

    result
}

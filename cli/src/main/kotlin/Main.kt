fun main(argv: Array<String>) {
    val name = if(argv.isNotEmpty())
        argv[0]
    else
        "World"
    foo(name)
}
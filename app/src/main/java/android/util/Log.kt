package android.util

object Log {
    fun d(tag: String, msg: String): Int {
        println("$tag: $msg")
        return 0
    }
}
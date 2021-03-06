package backjoon_11727

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()

    val dp = IntArray(1001)
    dp[1] = 1
    dp[2] = 3

    for(i in 3..N) {
        dp[i] = (dp[i-1] + 2 * dp[i - 2]) % 10007
    }

    println(dp[N])
}
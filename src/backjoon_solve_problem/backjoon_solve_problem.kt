/*
import java.io.*
import java.util.*

fun main(){
        /* 2557번 */
        print("Hello World!")


        /* 10718번 */
        println("강한친구 대한육군")
        print("강한친구 대한육군")


        /* 10171번 */
        println(
                """\    /\
                 )  ( ')
                (  /  )
                 \(__)|""")


        /* 10172번 */
        println(
                """|\_/|
                |q p|   /}
                ( 0 )${"\"\"\""}\
                |"^"`    |
                ||_/=\\__|
                """)


        /* 1000번 */
        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        print(A+B)


        /* 1001번 */

        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        print(A-B)


        /* 10998번 */

        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        print(A*B)


        /* 1008번 */

        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toDouble()}

        print(A/B)


        /* 10869번 */
        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        println(A+B)
        println(A-B)
        println(A*B)
        println(A/B)
        println(A%B)


        /* 10430번 */
        val br = System.`in`.bufferedReader()
        val (A, B, C) = br.readLine().split(' ').map{ it.toInt()}

        println((A+B)%C)
        println(((A%C) + (B%C))%C)
        println((A*B)%C)
        print(((A%C)*(B%C))%C)


        /* 2588번 */
        val br = System.`in`.bufferedReader()
        val A = br.readLine().toInt()
        val B = br.readLine().toInt()

        println(A*(B%10))
        println(A*((B%100)/10))
        println(A*(B/100))
        println(A*B)


        /* 1330번 */
        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        if (A > B) {
                print(">")
        }
        else if (A < B) {
                print("<")
        }
        else if (A == B) {
                print("==")
        }


        /* 9498번 */
        val br = System.`in`.bufferedReader()
        val A = br.readLine().toInt()

        //if,else if 방식
        if (A >= 90 && A <= 100) {
            print("A")
        }
        else if (A >= 80 && A <= 89) {
            print("B")
        }
        else if (A >= 70 && A <= 79) {
            print("C")
        }
        else if (A >= 60 && A <= 69) {
            print("D")
        }
        else if (A <= 59) {
            print("F")
        }


        //when과 range방식
        when (A) {
                in 90..100 -> { println("A") }
                in 80..89 -> { println("B") }
                in 70..79 -> { println("C") }
                in 60..69 -> { println("D") }
                else -> { println("F") }
        }


        /* 2753번 */
        val br = System.`in`.bufferedReader()
        val A = br.readLine().toInt()

        if ((A%4 == 0 && A%100 !=0) || A%400 == 0) {
                print("1")
        } else{
                print("0")
        }


        /* 14681번 */
        val br = System.`in`.bufferedReader()

        val A = br.readLine().toInt()
        val B = br.readLine().toInt()

        if (A > 0 && B > 0) {
                print("1")
        }
        else if (A > 0 && B < 0) {
                print("4")
        }
        else if (A < 0 && B > 0) {
                print("2")
        }
        else if (A < 0 && B < 0) {
                print("3")
        }


        /* 2884번 */
        val br = System.`in`.bufferedReader()
        var (A, B) = br.readLine()!!.split(' ').map{ it.toInt()}

        if ((B - 45) < 0) {
                if((A - 1) < 0){
                        A = 23
                        B = 60 + (B-45)
                } else {
                        A = A - 1
                        B = 60 + (B-45)
                }
        } else{
                B = B - 45
        }

        print("${A} ${B}")


        /* 2739번 */
        val br = System.`in`.bufferedReader()
        val (A) = br.readLine().split(' ').map{ it.toInt()}

        for (i in 1..9) {
                println("${A} * ${i} = ${A*i}")
        }


        /* 10950번 */
        val br = System.`in`.bufferedReader()
        // val (A, B) = br.readLine()!!.split('\n').map{ it.toInt()}

        val A = br.readLine().toInt()
        for (i in 1..A) {
                val (B, C) = br.readLine()!!.split(' ').map{ it.toInt()}
                println(B+C)
        }


        /* 8393번 */
        val br = System.`in`.bufferedReader()
        val n = br.readLine().toInt()
        var sum : Int = 0

        for (i in 1..n){
            sum = sum+i
        }

        print(sum)


        /* 15552번 */
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        repeat(br.readLine().toInt()) {
                val token = StringTokenizer(br.readLine())
                val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
                bw.write(sum + "\n")
        }
        bw.flush()
        bw.close()


        /* */
        val br = System.`in`.bufferedReader()
        val n = br.readLine().toInt()

        for (i in 1..n) {
            println(i)
        }

    /* 2741번 */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    for (i in 1..n) {
        bw.write(i.toString() + "\n")
    }
    bw.flush()
    bw.close()


    /* 2742번 */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    for (i in 0..n-1) {
        bw.write((n-i).toString() + "\n")
    }
    bw.flush()
    bw.close()


    /* 11021번 */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 1..n) {
        val token = StringTokenizer(br.readLine())
        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
        bw.write("Case #${i}: " + sum + "\n")
    }
    bw.flush()
    bw.close()


    /* 11022번 */
    //val br = BufferedReader(InputStreamReader(System.`in`))
    //val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine().toInt()

    for (i in 1..n) {
        val token = StringTokenizer(br.readLine())
        val A = token.nextToken().toInt()
        val B = token.nextToken().toInt()
        val sum = (A + B).toString()
        bw.write("Case #${i}: " + "${A} +" + " ${B} = " + sum + "\n")
    }
    bw.flush()
    bw.close()


    /* 2438번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val n = br.readLine().toInt()

    for (i in 1..n) {
        for(j in 1..i){
            print("*")
        }
        print("\n")
    }


    /* 2439번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val n = br.readLine().toInt()

    for (i in 1..n) {
        for (j in n downTo 1) {
            if (i >= j) {
                print("*")
            } else {
                print(" ")
            }
        }
        print("\n")
    }


    /* 10871번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var token = StringTokenizer(br.readLine())
    val N = token.nextToken().toInt()
    val X = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())

    for (i in 1..N) {
        val num: Int = token.nextToken().toInt()
        if (num < X) {
            bw.write("${num} ")
        }
    }

    bw.flush()
    bw.close()


    /* 10952번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    while(true) {
        val token = StringTokenizer(br.readLine())
        val A = token.nextToken().toInt()
        val B = token.nextToken().toInt()
        val sum = (A + B).toString()

        if (A ==0 && B == 0) {
            break
        } else{
            bw.write(sum + "\n")
        }
    }
    bw.flush()
    bw.close()


    /* 10951번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    var line: String?

    while (br.readLine().apply{ line = this} != null) {
        val token = StringTokenizer(line)
        val A = token.nextToken().toInt()
        val B = token.nextToken().toInt()

        val sum = (A + B).toString()
        bw.write(sum + "\n")
    }

    bw.flush()
    bw.close()


    /* 1110번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    var count = 0
    var sum = 0
    var N = br.readLine().toInt()
    var N2 = N
    var NewN : String

    while (true) {
        sum = (N2/10) + (N2%10)
        NewN = "${N2%10}"+"${sum%10}"
        count++
        N2 = NewN.toInt()
        if (N2 == N) {
            break
        }
    }
    print(count)


    /* 10818번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N = br.readLine().toInt()

    val A = br.readLine().split(' ').map{it.toInt()}.toTypedArray().toList()
    print("${A.minOrNull()} ${A.maxOrNull()}")


    /* 10818번(2) */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N = br.readLine().toInt()

    val list = ArrayList<Int>(N)

    br.readLine().split(' ').map{list.add(it.toInt())}

    print("${list.minOrNull()} ${list.maxOrNull()}")


    /* 2562번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val list = ArrayList<Int>(9)

    for (i in 0 until 9) {
        val A = br.readLine().toInt()
        list.add(A)
    }
    println("${list.maxOrNull()}")
    println("${list.indexOf(list.maxOrNull())+1}")


    /* 2577번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val A = br.readLine().toInt()
    val B = br.readLine().toInt()
    val C = br.readLine().toInt()
    val Num = (A*B*C).toString()
    val list = mutableListOf<Int>(0,0,0,0,0,0,0,0,0,0)

    for (i in Num) {
        //print(i)
        list[i.digitToInt()] = list[i.digitToInt()] + 1
    }

    list.forEach {
        println(it)
    }


    /* 1065번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val s = br.readLine()!!.toInt()
    var answer = 0
    for (i in s downTo 1) {
        val t = i.toString()
        var isAnswer = true
        if (t.length == 1) {
            answer++
        } else {
            val tmp = t[0].toInt() - t[1].toInt()
            for (j in 0 until t.lastIndex) {
                if (tmp!=t[j].toString().toInt() - t[j+1].toString().toInt()) {
                    isAnswer= false
                }
            }
            if (isAnswer) {
                answer++
            }
        }
    }
    println(answer)


    /* 4344번 */
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val arr = IntArray(1_001)
    var N = br.readLine().toInt()

    var sum: Double
    var avg: Double
    var count: Double
    var result: Double

    for (i in 0 until N) {
        sum = 0.0
        avg = 0.0
        count = 0.0
        val stringToken = StringTokenizer(br.readLine())

        var i:Int = 0
        while(stringToken.hasMoreTokens()) {
            arr[i] = stringToken.nextToken().toInt()
            i++
        }

        for (j in 1..arr[0]){
            sum += arr[j]
            avg = sum / arr[0]
        }

        for (j in 1..arr[0]) {
            if (arr[j] > avg) {
                count++
            }
        }
        result = count / arr[0] * 100
        println("${String.format("%.3f", result)}%")
    }
}
*/
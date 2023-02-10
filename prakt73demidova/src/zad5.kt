import kotlin.math.PI

fun main()
{
    try
    {
        println("Введите радиус цилиндра")
        val r: Double
        r = readLine()!!.toDouble()

        println("Введите высоту цилиндра")
        val h: Double
        h = readLine()!!.toDouble()

        if(r < 0 || h < 0)
        {
            println("значения не могут быть отрицательными")
        }

        else
        {
            var V: Double
            V = PI * Math.pow(r, 2.0) * h;
            println("Объём равен:")
            println(String.format("%.2f", V))
        }
    }

    catch (ex:Exception)
    {
        println(ex.message)
    }
}




fun main()
{
    try
    {
        println("Введите четырехзначное число")
        val num:Int
        num= readLine()!!.toInt()

        if((num > 999 && num < 10000) || (num < -999 && num > -100000) )
        {
            var ed:Int
            var des:Int
            var sot:Int
            var tys:Int

            ed=num%10
            des=(num/10)%10
            sot=(num/100)%10
            tys=num/1000

            var proiz:Int
            proiz=ed*des*sot*tys
            println("Произведение цифр данного числа $num: $proiz")
        }

        else println("Неправильное значение")
    }

    catch (ex:Exception)
    {
        println(ex.message)
    }
}
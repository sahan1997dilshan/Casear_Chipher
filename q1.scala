//19000367
object q1
{  
  import scala.io.StdIn._
  def main(args: Array[String]) = {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"
          //Encrypt
        val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
         //Decrypt
        val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

        val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
         print("Enter a Word you want to Encrypt: ")
        var word = readLine()


        println("Encrypt result: ");
        val ct=cipher(E,word,5,alphabet)
        println(ct);
        println("Decrypt result: ");
        val pt=cipher(D,ct,5,alphabet)
        println(pt);
         



        
    }
    
}
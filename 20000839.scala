object Scala {
  def main(args: Array[String]): Unit = {
    var (k, i, j,m,n,f,g,c) = (2,2,2,5,5,12.0f,4.0f,"X");
    println("Question 1 2 3");
    print("a)k+12*m=");
    println(k+12*m);
    print("b)m/j=");
    println(m/j);
    print("c)n%j=");
    println(n%j);
    print("d)m/j*j=");
    println(m/j*j);
    print("e)f+10*5+g=");
    println(f+10*5+g);
    print("f)++i*n=");
    println((i+1)*n);

    child();
    def child() : Unit = {
        var (a,b,c,d,k)=(2,3,4,5,4.3f); 
        print("\n\n--b*a+c*d-- = ");
        println((b-1)*a+c*d);
        print("a++ = ");
        a+=1
        println(a)
        print("-2*(g-k)+c = ");
        println(-2*(g-k)+c);
        print("c=c++ = ");
        println(c+1);
        c+=1;
        print("c=++c*a++ = ");
        println((c+1)*(a))
        c+=1;
   
    }
    println("Question 4 (a)");
    def XYZ(Normal:Int,Ot:Int) : Int = 
    {
        return ((Normal*250+Ot*85)-(Normal*250+Ot*85)*12/100);
    }
    print("Rs.");
    println(XYZ(40,30));
  }
}
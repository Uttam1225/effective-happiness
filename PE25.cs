using System.Numerics;

namespace EulerProject
{
    public class PE25
    {
        public static void Solve()
        {
            BigInteger f1=1,f2=1,c,sum,flag=3;
            while(true)
            {
                sum = f1 + f2;
                f1=f2;
                f2=sum;
                c=0;
                while(sum!=0)
                {
                    sum/=10;
                    c++;
                }
                if(1000==c)
                {
                    break;
                }
                flag++;
            }
            Console.Write("result = "+ flag);
        }
    }
}
// o/p: result = 4782
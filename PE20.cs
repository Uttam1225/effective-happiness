using System.Numerics;
namespace EulerProject
{
    public class PE20
    {
        public static void Solve()
        {
            BigInteger num = 1, result=0;
            for(int i=2;i<=100;++i)
            {
                num*=i;
            }
            while(num!=0)
            {
                result+=num%10;
                num/=10;
            }
            Console.Write("result = "+ result);
        }
    }
}

// o/p : result = 648 
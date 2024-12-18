using System.Numerics;
namespace EulerProject
{
    public class LatticePaths
    {
        //PE: Problem 15
        public static void Solve()
        {
            BigInteger fact = 1;
            BigInteger Denomfact = 1;

            for(int i=2;i<=40;++i)
            {
                fact*=i;
                if(i==20)
                {
                    Denomfact = fact;
                }
            }
            Denomfact*=Denomfact;

            Console.WriteLine("result = " + fact/Denomfact);
        }
    }
}

// o/p : result = 137846528820

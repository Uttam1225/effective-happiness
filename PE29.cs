namespace EulerProject
{
    public class PE29
    {
        public static void Solve()
        {
            List<string> arr = new();
            for(int i=2;i<=100;i++)
            {
                for(int j=2;j<=100;j++)
                {
                    if(!arr.Contains(Math.Pow(i,j).ToString()))
                    {
                        arr.Add(Math.Pow(i,j).ToString());
                    }
                }
            }
            Console.Write("result = "+ arr.Count);
        }
    }
}
// o/p: result = 9183
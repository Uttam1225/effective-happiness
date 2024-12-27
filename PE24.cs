namespace EulerProject
{
    public class PE24
    {
        public static void Solve()
        {
            int position = 1000000;
            int bigInteger, temp;
            int[] arr = {0,1,2,3,4,5,6,7,8,9};
            Console.Write("result = ");
            for(int i=9;i>=0;i--)
            {
                bigInteger = 1;
                for(int j=i;j>1;j--)
                {
                    bigInteger*=j;
                }
                temp = (position-1)/bigInteger;
                position -= temp * bigInteger;
                Console.Write(arr[temp]);
                arr = arr.Where(x => x != arr[temp]).ToArray();
            }
        }
    }
}
// o/p: result = 2783915460
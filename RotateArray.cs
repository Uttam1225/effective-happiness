namespace EulerProject
{
    public class Test
    {
        public static void Solve()
        {
            //Program to rotate right shift the array n number of times without spilitng the array
            int rotationNumber;
            Console.Write("Enter the number of rotation: ");
            string str =  Console.ReadLine();
            rotationNumber = int.Parse(str); 

            int[] arr = {1,2,3,4,5,6,7};
            int len = arr.Length;
            if(rotationNumber<len)
            {
                int pos = len-rotationNumber;
                for(int i=0;i<rotationNumber;i++)
                {
                    (arr[i], arr[pos]) = (arr[pos], arr[i]);
                    pos++;
                }
                int temp = arr[rotationNumber];
                int p = 1;
                for(int i=rotationNumber;i<len-1;i++)
                {
                    arr[i] = arr[rotationNumber+p];
                    p++;
                }
                arr[len-1]=temp;
                Console.Write("result = ");
                for(int i=0;i<len;i++)
                {
                    Console.Write(arr[i]+" ");
                }
            }
        }
    }
}

//o/p: result = 5 6 7 1 2 3 4

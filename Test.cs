namespace EulerProject
{
    public class Test
    {
        public static void Solve()
        {
            // Reverse words in string at there location
            string str = "Test Automation";
            string[] arr = str.Split(" ");
            Console.Write("result = ");
            for(int i=0;i<arr.Length;i++)
            {
                string temp = arr[i];
                char[] tempArray = temp.ToCharArray();
                int k = temp.Length-1, j=0;
                while(true)
                {
                    if(j>=k)
                    {
                        break;    
                    }
                    else{
                        char c = tempArray[j];
                        tempArray[j] = temp[k];
                        tempArray[k] = c;
                        j++;k--;
                    }
                }
                for(int p=0;p<tempArray.Length;p++)
                {
                    Console.Write(tempArray[p]);
                }
                Console.Write(" ");
            }
        }
    }
}
// o/p: result = tseT noitamotuA
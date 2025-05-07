import java.util.*;
public class similarelemarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[4][];
        arr2[0]=new int[4];
        arr2[1]=new int[5];
        arr2[2]=new int[3];
        arr2[3]=new int[2];
        System.out.println("enter tha array1:");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("given array1:");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
               System.out.print(arr1[i][j]+ " ");

                
            }
            System.out.println();
        }
        System.out.println("enter the array2 elements:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("given array2:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");

            }
            System.out.println();
        }
       
        ArrayList<Integer> commonElements = new ArrayList<Integer>();
      for (int i = 0; i < arr1.length; i++) {
         for (int j = 0; j < arr1[i].length; j++) {
             int currentelement=arr1[i][j];
            for (int k = 0; k < arr2.length; k++) {
         for (int l = 0; l < arr2[k].length; l++) {
            if(arr1[i][j]==arr2[k][l])
            {
                commonElements.add(currentelement);
            }

          
         }
      }
          
         }
      }
      System.out.println("Common Elements: " + commonElements);
    }
}
/*import java.util.*;

public class similarelemarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[4][];
        arr2[0] = new int[4];
        arr2[1] = new int[5];
        arr2[2] = new int[3];
        arr2[3] = new int[2];

        System.out.println("Enter the array1:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given array1:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the array2 elements:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given array2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

      Set<Integer> commonElementsSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int currentElement = arr1[i][j];
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {
                        if (currentElement == arr2[k][l]) {
                            commonElementsSet.add(currentElement);
                        }
                    }
                }
            }
        }


        System.out.println("Common Elements: " + commonElementsSet);
    }
}*/


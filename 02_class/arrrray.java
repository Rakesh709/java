
class Student{
   int rollno;
   String name;
   int marks;
}



public class arrrray {

     public static void main(String[] args){
      // 1D Array
      //   int nums[] = {1,2,3,4};
      //   System.out.println(nums[0]);

      //2D Array
         // int nums [] [] = new int [3][4];
         
         // for(int i=0; i<3;i++){
         //    for(int j=0;j<4;j++){
         //       nums[i][j] = (int )(Math.random()*100);
         //    }
            
         // }

         // for(int i=0; i<3;i++){
         //    for(int j=0;j<4;j++){
         //       System.out.print(nums[i][j]+" ");
         //    }
         //    System.out.println();
         // }

         // for(int n[]:nums){
         //    for(int m:n){
         //       System.out.print(m+" ");
         //    }
         //    System.out.println();
         // }

         //jagged array
         // int nums[][] = new int [3][];

         // nums[0] = new int[3];
         // nums[1] = new int[4];
         // nums[2] = new int[2];

         // for(int i=0; i<nums.length; i++){
         //    for(int j=0; j<nums[i].length; j++){
         //       nums[i][j] = (int)(Math.random()*100);
         //    }
         // }

         // for(int i=0; i<nums.length;i++){
         //    for(int j=0;j<nums[i].length;j++){
         //       System.out.print(nums[i][j]+" ");
         //    }
         //    System.out.println();
         // }


         // array pf objects 
         // Student s1 = new Student();
         // s1.rollno=1;
         // s1.name="rakesh";
         // s1.marks=88;

         // Student s2 = new Student();
         // s2.rollno=1;
         // s2.name="rakesh2";
         // s2.marks=88;

         // Student s3 = new Student();
         // s3.rollno=1;
         // s3.name="rakesh3";
         // s3.marks=88;

         // Student s4 = new Student();
         // s4.rollno=1;
         // s4.name="rakesh4";
         // s4.marks=88;


         // Student students[] = new Student[4];
         // students[0]= s1;
         // students[1]= s2;
         // students[2]= s3;
         // students[3]= s4;


         // for(int i=0; i<students.length; i++){
         //    System.out.println(students[i].name + ": "+students[i].marks);
         // }

         //enhanced loop

         int nums [] = new int[4];
         nums[0]=1;
         nums[1]=2;
         nums[2]=3;
         nums[3]=4;

         for(int n: nums){
            System.out.println(n);
         }


     }
}

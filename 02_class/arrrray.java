public class arrrray {

     public static void main(String[] args){
      // 1D Array
      //   int nums[] = {1,2,3,4};
      //   System.out.println(nums[0]);

      //2D Array
         int nums [] [] = new int [3][4];
         
         for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
               nums[i][j] = (int )(Math.random()*100);
            }
            
         }

         for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
               System.out.print(nums[i][j]+" ");
            }
            System.out.println();
         }

     }
}


//Time Complexity = O(N)
//Space Complexity = O(1)
public class ArrayBalance {

        public static int arrayBalance(int[] values){

                int n = values.length;

                if(n==0){
                        return -1;
                }

                if(n==1){
                        return 0;
                }

                int start=0, end =n-1, lsum=0, rsum=0 ;

                for(int i=0;i<n;i++){

                        if(start == end && lsum == rsum) {
                                return start;
                        }

                        if(lsum == rsum && start>end){

                                return end+1;

                        }else if(lsum == rsum && start<end){

                                lsum = lsum + values[start];
                                rsum = rsum + values[end];
                                start++;
                                end--;

                        }else  if(lsum > rsum){

                                rsum = rsum + values[end];
                                end--;

                        } else if(lsum < rsum){

                                lsum = lsum + values[start];
                                start++;

                        }

                }

                return -1;
        }

        public static void main(String[] args) {

                int[] test1 = {1,17,9,7,11};
                System.out.println(arrayBalance(test1));

                int[] test2 = {1,1,9,7,11};
                System.out.println(arrayBalance(test2));

                int[] test3 = {0,0,0,0,0};
                System.out.println(arrayBalance(test3));

                int[] test4 = {11,7,9,1,1};
                System.out.println(arrayBalance(test4));

                int[] test5 = {0,1,0,0,0};
                System.out.println(arrayBalance(test5));

                int[] test6 = {0,0,1,0,0,0,0};
                System.out.println(arrayBalance(test6));

                int[] test7 = {1};
                System.out.println(arrayBalance(test7));

                int[] test8 = {1,15};
                System.out.println(arrayBalance(test8));
        }


}

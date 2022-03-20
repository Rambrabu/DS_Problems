
//Time Complexity = O(N)
//Space Complexity = O(1)

public class OptimumPath {

    public static String getOptimumPath(String path){
        int vertical=0, horizontal=0;
        for(Character step : path.toCharArray()){
            switch(step){
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
                case 'L':
                    horizontal--;
                    break;
                case 'R':
                    horizontal++;
                    break;
            }

        }

        String result = "";

        if(vertical<0){
            result = result + concatResultString(Math.abs(vertical), "D");
        }else{
            result = result + concatResultString(Math.abs(vertical), "D");
        }

        if(horizontal<0){
            result = result + concatResultString(Math.abs(horizontal), "L");
        }else{
            result = result + concatResultString(Math.abs(horizontal), "R");
        }

        return result.toString();
    }

    private static String concatResultString(int count, String step){
        String result = "";
            for(int i=0;i<count;i++)
                result = result+step;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Test 1 "+getOptimumPath("UDUDD"));

        System.out.println("Test 2 "+getOptimumPath("DRURDD"));

        System.out.println("Test 3 "+getOptimumPath("RUDRL"));

        System.out.println("Test 4 "+getOptimumPath("URDRL"));

        System.out.println("Test 5 "+getOptimumPath("RRR"));
    }


}

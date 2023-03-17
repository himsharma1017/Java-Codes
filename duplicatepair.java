public class duplicatepair {
    public static void main(String[] args) {
        int[] sampleArr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] emptyArr = new int[9];

        for(int j=0; j<sampleArr.length; j++){
            for(int k=j+1; k<sampleArr.length; k++){
                if(sampleArr[j]==sampleArr[k]){
                    for(int i=0; i<emptyArr.length; i++)
                    emptyArr[i] = sampleArr[j];
                }
            }
        }
            System.out.println("Count of singular elements are : " + sampleArr.length);
    }
}

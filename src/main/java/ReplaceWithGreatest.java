public class ReplaceWithGreatest {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int max =arr[i+1];
            for(int j=i+2;j<len;j++){
                max=max<arr[j]?arr[j]:max;
            }
            arr[i]=max;
        }
        arr[len-1]=-1;
        return arr;
    }
}

class _2_TOH{
    public static void towerOfHanoi(int disks, String source,String helper, String dist){
        if(disks==0){
            return;
        }
        towerOfHanoi(disks-1,source,dist,helper);
        System.out.print("\nTransfer disk " + disks + " from " + source + " to " + dist);
        towerOfHanoi(disks-1,helper,source,dist);
    }
    public static void main(String[] args){
        towerOfHanoi(3,"a","b","c");
    }
}
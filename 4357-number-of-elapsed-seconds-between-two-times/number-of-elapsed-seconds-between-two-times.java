class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr=startTime.split(":");
        String[] arr2=endTime.split(":");
        int start= Integer.parseInt(arr[0])*3600+Integer.parseInt(arr[1])*60+Integer.parseInt(arr[2]);
        int end=Integer.parseInt(arr2[0])*3600+Integer.parseInt(arr2[1])*60+Integer.parseInt(arr2[2]);
        return end-start;
    }
}
package leetcode;

public class ceilingProblem {
    static void main(String[] args) {
        int[] arr={1, 2,3,6,8,10};
        /*
        Ceiling : Ceiling of a given number is minimum > or =that number
        if tar=3 celing of number also 3
        if tar=4 celing of number is 6, because the number grater then 4 in the target is 6, 7,10 but the minimum greater is 6
        if tar=7 ceiling of number is 8
        */
        int target=4;
        int index=ceiling(arr,target);
        System.out.println(arr[index]);
    }

    private static int ceiling(int[] arr, int target) {
        /*
        * We can simply implement it by using same binary logic but if number not found return the 'Start'
        * {1,2,3,6,7} t=4
        * s=0,end=4
        *
        * */
        int start=0,end=arr.length-1;
        while(start<=end)//1->0<4,2->3<4 3->3<2//false
        {
            int mid=start+(end-start)/2;//1->2, 2-> 3
            if (arr[mid]==target)
                return mid;
            if(arr[mid]<target)//1->3<4 true
                start=mid+1;//1-> start=mid+1=3
            else if(arr[mid]>target)//2-> 6>4 true
                end=mid-1;//2->end=2.....{s->6,7}->new remainig array//so we need to return the start index right
        }
        return end;
    }
}

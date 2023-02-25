package chapter_array_linkedlist;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class array {
    /* 返回数组的一个随机元素*/
    static  int randomAccess(int[] nums){
        int randomIndex = ThreadLocalRandom.current().nextInt(0,nums.length);
        int randomNum = nums[randomIndex];
        return randomNum;
    }

    /*拓展数组*/
    static int[] extend(int[] nums,int enlarge){
        int[] res = new int[nums.length + enlarge];
        for(int i = 0; i < nums.length;i++){
            res[i] = nums[i];
        }
        return res;
    }
    /*在索引index处插入元素num*/
    static void insert(int[] nums,int index,int num){
        for(int i = nums.length-1;i>index;i--){
            nums[i] = nums[i-1];
        }

        nums[index] = num;
    }

    //删除索引index处的元素
    static  void remove(int[] nums,int index){
        for(int i = index;i< nums.length-1;i++){
            nums[i] = nums[i+1];
        }
    }
    //遍历数组
    static void traverse(int[] nums){
        int count = 0;
        for(int num :nums)
            count++;
    }

    static int find(int[] nums, int target){
        for(int i = 0; i <nums.length;i++){
            if(nums[i] == target)
                return i;
        }
        return  -1;
    }

    public static void main(String [] args){
        int[] arr = new int[5];
        System.out.println("数组arr:" + Arrays.toString(arr));

        int[] nums = {1,3,4,2,5};
        System.out.println("数组num:" + Arrays.toString(nums));

        int randomNum = randomAccess(nums);
        System.out.println("在nums中随机取元素"+randomNum);

        nums = extend(nums,4);
        System.out.println("拓展后的数组nums:"+Arrays.toString(nums));

        

    }


}

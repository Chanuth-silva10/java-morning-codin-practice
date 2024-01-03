package DSA.DataStrcture.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack nums = new Stack();
        //System.out.println("Empty : " +nums.isEmpty());
        nums.push(15);
        nums.show();
        nums.push(8);
        nums.show();
        //System.out.println(nums.peek());

        nums.push(10);
        nums.show();


//        System.out.println("Stack size : " + nums.size());
//        System.out.println("Empty : " +nums.isEmpty());
//
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());

    }
}
public class TwoStacks {
    int size;
    int top1;
    int top2;
    int[] arr;
    TwoStacks(int n) {
        size = n;
        top1 = -1;
        top2 = n;
        arr = new int[n];
    }
    void push1(int x){
        if(top1 < top2 -1) {
            top1++;
            arr[top1] = x;
        }
        else {
            System.out.println("Stack overflow");
        }
    }
    void push2(int x) {
        if(top1 < top2-1) {
            top2--;
            arr[top2] = x;
        }
        else {
            System.out.println("Stack overflow");
        }
    }
    int pop1() {
        if(top1 > 0) {
            int n = arr[top1];
            top1--;
            return n;
        }
        else {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2() {
        if(top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        }
        else {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(5);
        twoStacks.push1(3);
        twoStacks.push1(4);
        twoStacks.push2(13);
        twoStacks.push2(14);
        twoStacks.push1(5);
        System.out.println("pop1:"+twoStacks.pop1());
        System.out.println("pop2:"+twoStacks.pop2());
    }
}

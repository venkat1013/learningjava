import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<Character>();
        String toBeReversed = "hahaha";
        for(int i=0; i<toBeReversed.length(); i++) {
            characterStack.push(toBeReversed.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!characterStack.isEmpty()) {
            stringBuilder.append(characterStack.pop());
        }
        System.out.println("Reversed string:"+stringBuilder);
    }
}

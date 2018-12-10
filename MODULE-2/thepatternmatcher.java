import java.util.HashMap;
import java.util.Stack;

class Geeks {

    static void follPatt(String s) {

        // Your code here
        //     HashMap<Character, Integer> map = new HashMap<>();
        //     for (int i = 0; i < s.length(); i++) {
        //         char ch = s.charAt(i);
        //         if (map.containsKey(ch)) {
        //             map.put(ch, map.get(ch) + 1);
        //         } else {
        //             map.put(ch, 1);
        //         }
        //     }
        //     int ans = 0;
        //     if (map.get('x') == map.get('y')) {
        //         ans = 1;
        //     }
        //     System.out.println(ans);

        //     System.out.println();
        // }
        Stack<Character> stack = new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='x'){
        //         stack.push(1);

        //     }
        //     if(ch=='y'){
        //         stack.pop();
        //     }
        // }
        // if(stack.isEmpty()){
        //     System.out.println(1);
        // }
        // else{
        //     System.out.println(0);
        // }
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'x') {
                stack.push('x');

            }
            if (ch == 'y') {
                if (stack.isEmpty() == false) {
                    stack.pop();
                } else {
                    System.out.println(0);
                    break;
                }
            }

        }
        if (stack.isEmpty()) {
            System.out.println(1);
        }
    }
}
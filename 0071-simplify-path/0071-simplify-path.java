class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for(String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0,"/" + stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sp = new Solution();
        System.out.println(sp.simplifyPath("/home/"));                   
        System.out.println(sp.simplifyPath("/home//foo/"));              
        System.out.println(sp.simplifyPath("/home/user/Documents/../Pictures")); 
        System.out.println(sp.simplifyPath("/../"));                     
        System.out.println(sp.simplifyPath("/.../a/../b/c/../d/./"));    
    }
}

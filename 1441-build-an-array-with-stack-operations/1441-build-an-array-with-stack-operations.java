class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();

        int index = 0;

        for (int i = 1; i <= n; i++) {

            stack.add(i);
            ans.add("Push");

            if (index < target.length && i == target[index]) {
                index++;
            } else {
                stack.remove(stack.size() - 1);
                ans.add("Pop");
            }

            if (stack.equals(toList(target)))
                break;
        }

        return ans;
    }

    private List<Integer> toList(int[] target) {
        List<Integer> list = new ArrayList<>();
        for (int x : target)
            list.add(x);
        return list;
    }
}
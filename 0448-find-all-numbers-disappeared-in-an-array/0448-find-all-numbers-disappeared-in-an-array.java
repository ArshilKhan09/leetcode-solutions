class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        int expected = 1;

        for (int num : nums) {
            if (num == expected) {
                expected++;
            } else if (num > expected) {
                while (expected < num) {
                    result.add(expected);
                    expected++;
                }
                expected++;
            }
        }

        while (expected <= nums.length) {
            result.add(expected++);
        }

        return result;
    }
}
class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maximaq = new LinkedList<>();
        Deque<Integer> minimaq = new LinkedList<>();

         int count = 1;

          int start = 0;

for (int i = 0; i < nums.length; ++i) {

	while (!maximaq.isEmpty() && maximaq.peekLast() < nums[i]) {
		maximaq.removeLast();
	}
	maximaq.addLast(nums[i]);

	while (!minimaq.isEmpty() && minimaq.peekLast() > nums[i]) {
		minimaq.removeLast();
	}
	minimaq.addLast(nums[i]);

	while (maximaq.peekFirst() - minimaq.peekFirst() > limit) {
		if (maximaq.peekFirst() == nums[start]) maximaq.pollFirst();
		if (minimaq.peekFirst() == nums[start]) minimaq.pollFirst();
		++start;
	}

	count = Math.max(count, i - start + 1);
}

return count;
      
    }
}
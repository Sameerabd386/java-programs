class !Darray {
public int[] runningsum(int[] nums) {
int [] results = new int[nums.length];
results[0] = nums[0];

for (int i=1; i<nums.length; i+++ {
results[i] = nums[i] + nums[i - 1];
}
return results;
}
}

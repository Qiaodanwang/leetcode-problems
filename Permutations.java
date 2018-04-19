/**
 *list of list添加list时，一定要new一个，不要用原来的指针。
 *
*/
class Solution{
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		helper(res,nums,arr);
		return res;
	}
	
	public void helper(List<List<Integer>> res, int[] nums,ArrayList<Integer> temp){
		if(temp.size()==nums.length){
			res.add(new ArrayList<Integer>(temp));
			return;
		}
		for(int i=0;i<nums.length;i++){
			if(temp.contains(nums[i])) continue;
			temp.add(nums[i]);
			helper(res,nums,temp);
			temp.remove(temp.size()-1);	
		}
	}
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        a.add(new ArrayList<>());
        for(int n:nums){
            int s=a.size();
            for(int i=0;i<s;i++){
                List<Integer> b=new ArrayList<>(a.get(i));
                b.add(n);
                a.add(b);
            }
        }return a;
    }
}
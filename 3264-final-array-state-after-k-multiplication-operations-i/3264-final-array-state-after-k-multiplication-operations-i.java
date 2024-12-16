class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for(int i=0;i<k;i++)
        {
         int min=Collections.min(list);
         list.set((list.indexOf(min)),min*multiplier);
        }
        return  list.stream()
                          .mapToInt(Integer::intValue) // Correct method reference
                          .toArray();
    }
}
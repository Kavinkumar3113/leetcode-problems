class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((e,f)->f-e);
        for(int i:nums)
        {
            pq.offer(i);
        }
        long score=0;
        while(k-->0)
        {
            
            score+=pq.peek();
            pq.add((int)(Math.ceil(pq.poll()/3.0)));
        }
        return score;
    }
}
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        res.add(folder[0]);
        for(int i=1;i<folder.length;i++)
        {
            String check=res.get(res.size()-1)+"/";
            if(!folder[i].startsWith(check))
                res.add(folder[i]);
        }
        return res;
    }
}
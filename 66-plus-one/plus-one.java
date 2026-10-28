class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ans=new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] + carry <=9){
                ans.add(digits[i]+carry);
                carry=0;
            }
            else{
                ans.add(0);
                carry=1;
            }
        }
            if(carry==1){
                ans.add(1);
            }

        
        Collections.reverse(ans);
        int [] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
         result[i]=ans.get(i);
        }
        return result;

    }
   
}
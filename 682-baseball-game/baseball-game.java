
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < operations.length; i++) {

            if(operations[i].equals("+")) {
                int n = list.size();
                list.add(list.get(n-1) + list.get(n-2));
            }

            else if(operations[i].equals("D")) {
                int n = list.size();
                list.add(list.get(n-1) * 2);
            }

            else if(operations[i].equals("C")) {
                list.remove(list.size()-1);
            }

            else {
                list.add(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        for(int num : list) {
            sum += num;
        }

        return sum;
    }
}

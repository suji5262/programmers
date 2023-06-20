class Solution {
    public int[] solution(int denum1, int numer1, int denum2, int numer2) {
        int[] answer = new int[2];

        int numer = (numer1 * numer2); //분모
        int denum = (denum1 * numer2) + (denum2 * numer1); //분자
        int max = 1;

        for(int i=1; i <= numer && i <= denum; i++){     //최대 공약수
            if(numer % i==0 && denum % i==0){
                max = i;
            }
        }
        answer[0] = denum/max; //분자
        answer[1] = numer/max; //분모

        return answer;
    }
}

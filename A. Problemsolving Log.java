/* Monocarp is participating in a programming contest, which features 26 problems, named from 'A' to 'Z'. The problems are sorted by difficulty. Moreover, it's known that Monocarp can solve problem 'A' in 1
 minute, problem 'B' in 2 minutes, ..., problem 'Z' in 26 minutes.
After the contest, you discovered his contest log — a string, consisting of uppercase Latin letters, such that the i-th letter tells which problem Monocarp was solving during the i-th minute of the contest. If Monocarp had spent enough time in total on a problem to solve it, he solved it. Note that Monocarp could have been thinking about a problem after solving it.
Given Monocarp's contest log, calculate the number of problems he solved during the contest.
Input
The first line contains a single integer t(1≤t≤100) — the number of testcases.
The first line of each testcase contains a single integer n (1≤n≤500) — the duration of the contest, in minutes.
The second line contains a string of length exactly n, consisting only of uppercase Latin letters, — Monocarp's contest log.
Output
For each testcase, print a single integer — the number of problems Monocarp solved during the contest.
Example
input
3
6
ACBCBC
7
AAAAFPC
22
FEADBBDFFEDFFFDHHHADCC
output
3
1
4 */

import java.util.ArrayList;
import java.util.Scanner;
public class Problem{
    public static int value(char ch){
        return ch-'A'+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int cnt=0;
            int n=sc.nextInt();
            String s=sc.next();
            ArrayList<Character> l = new ArrayList<>();
            for(int j=0;j<n;j++){
                char c=s.charAt(j);
                if(s.chars().filter(ch->ch == c).count() >= value(c) && !l.contains(c)){
                    l.add(c);
                    cnt ++;
                }
            }
            System.out.println(cnt);
        }
    }
}

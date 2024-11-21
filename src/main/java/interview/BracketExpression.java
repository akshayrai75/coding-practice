package interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketExpression {
    public static int[] getBracketExpressionDetails(String expression){
        int nodeCount = 0;
        int nodeLvl = 0;
        int maxNodeAtLvl = 0;
        int nodesWithMaxNodes = 0;
        int expLen = expression.length();

        Stack<Character> stack = new Stack<>();
        Map<Integer, Integer> lvlCounts = new HashMap<>();

        if(expLen != 0){
//            int popCount =0;
            int lvl = 0;
            for (int i = 0; i < expLen; i++) {
                if(expression.charAt(i) == '['){
//                    popCount = 0;
                    stack.push(expression.charAt(i));
                    nodeCount++;
                    nodeLvl = stack.size() > nodeLvl ? stack.size() : nodeLvl;
                    lvl++;
                }else if(expression.charAt(i) == ']'){
                    stack.pop();
                    lvlCounts.put(lvl, lvlCounts.get(lvl) != null ? lvlCounts.get(lvl) + 1 : 1);
                    lvl--;
                }
            }

            maxNodeAtLvl = Collections.max(lvlCounts.values());

            for (Map.Entry<Integer, Integer> entry :
                    lvlCounts.entrySet()) {
                if (entry.getValue() == maxNodeAtLvl) {
                    nodesWithMaxNodes++;
                }
            }
        }

        return new int[]{nodeCount, nodeLvl, maxNodeAtLvl, nodesWithMaxNodes};
    }
}

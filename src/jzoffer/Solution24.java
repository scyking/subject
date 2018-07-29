package jzoffer;

import structure.RandomListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution24 {

    public RandomListNode clone(RandomListNode pHead) {
        RandomListNode result = null;
        if (pHead != null) {
            List<RandomListNode> tmp = new ArrayList<RandomListNode>();
            result = nextClone(pHead, tmp);
            randomClone(pHead, result, tmp);
        }
        return result;
    }

    private RandomListNode nextClone(RandomListNode pHead,
                                     List<RandomListNode> tmp) {
        RandomListNode result = new RandomListNode(pHead.label);
        RandomListNode tmpListNode = result;
        tmpListNode.random = pHead.random;
        tmp.add(pHead.random);
        pHead.random = tmpListNode;
        pHead = pHead.next;
        while (pHead != null) {
            RandomListNode node = new RandomListNode(pHead.label);
            node.random = pHead.random;
            tmp.add(pHead.random);
            pHead.random = node;
            tmpListNode.next = node;
            tmpListNode = node;
            pHead = pHead.next;
        }
        return result;
    }

    private void randomClone(RandomListNode pHead, RandomListNode result,
                             List<RandomListNode> tmp) {
        while (result != null) {
            if (result.random != null) {
                result.random = result.random.random;
            }
            result = result.next;
        }
        int index = 0;
        int size = tmp.size();
        while (index < size) {
            pHead.random = tmp.get(index);
            pHead = pHead.next;
            index++;
        }
    }
}

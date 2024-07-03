/*
package com.katas.depthFirstSearch;

import com.katas.binaryTree.Node;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DepthFirstSearch {

    public void traverseInOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.getLeft());
            log.atInfo().log(" " + node.getValue());
            traverseInOrder(node.getRight());
        }
    }

    public void traversePreOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.getLeft());
            traverseInOrder(node.getRight());
            log.atInfo().log(" " + node.getValue());
        }
    }

    public void traversePostOrder(Node node) {
        if(node != null) {
            log.atInfo().log(" " + node.getValue());
            traverseInOrder(node.getLeft());
            traverseInOrder(node.getRight());
        }
    }

    private String traversePreOrder(BinaryTreeModel root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        traverseNodes(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    private void traverseNodes(StringBuilder sb, String padding, String pointer, BinaryTreeModel node,
                               boolean hasRightSibling) {

        if (node != null) {

            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);

        }

    }

}
*/

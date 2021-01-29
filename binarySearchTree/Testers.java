package binarySearchTree;

public class Testers {

    public static void checkIsEmpty(Tree t) throws Exception{
        // If the tree t is an instance of EmptyBST --> t. isEmpty --> true
        // if the tree t is an instance of NonEmptyBST --> t.isEmpty -> false
        if ( t instanceof EmptyBST){
            if (!t.isEmpty()){
                throw new Exception("All is not good, the tree is an EmptyST and it is non- empty.");

            }else if(t instanceof NonEmptyBST){
                if (t.isEmpty()){
                   throw new Exception ("All is good, the tree is a Non-Empty BST and it is non-empty.");
                }
            }
        }
    }
    public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
        int nT = (t.add(x)).cardinality();
        //Either something was added --> and the cardinality increased by oe,
        if(nT == (t.cardinality()+1)){
            if (t.member(x)){
                throw new Exception("The cardinality increased by 1, but the thing"+ " that was added was already a memeber of the tree");

            }
        }

        //Or the thing that was already threr and therefore not really added
        else if ( nT == t.cardinality()){
            if (!t.member(x)){
                throw new Exception("The cardinality didn't increased by 1, but we added a new thing.");
            }
        }
    }
}

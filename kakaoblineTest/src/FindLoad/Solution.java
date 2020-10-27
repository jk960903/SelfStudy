package FindLoad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Solution {
	public static void main(String[] args) {
		int[][] nodeinfo= {{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};
		int[][] result=solution(nodeinfo);
		
	}
	 public static int[][] solution(int[][] nodeinfo) {
	        int[][] answer = new int[2][nodeinfo.length];;
	        Tree[] TreeSet=new Tree[nodeinfo.length];
	        for(int i=0; i<nodeinfo.length; i++) {
	        	TreeSet[i]=new Tree(nodeinfo[i][0],nodeinfo[i][1],i+1);
	        }
	        Arrays.sort(TreeSet,new Comparator<Tree>(){
	        	public int compare(Tree t1,Tree t2) {
	        		return t1.y==t2.y ?t1.x-t2.x:t2.y-t1.y;
	        	}
	        });
	        Tree root=TreeSet[0];
	        for(int i=1; i<TreeSet.length; i++) {
	        	SearchAndInsert(root,TreeSet[i]);
	        }
	        ArrayList<Integer> list=new ArrayList<>();
	        inorder(root,list);
	        for(int i=0; i<list.size(); i++) {
	        	answer[0][i]=list.get(i);
	        }
	        list=new ArrayList<>();
	        preorder(root,list);
	        for(int i=0; i<list.size(); i++) {
	        	answer[1][i]=list.get(i);
	        }
	        return answer;
	    }
	 public static void SearchAndInsert(Tree root,Tree insertNode) {
		 if(root.x>insertNode.x) {
			 if(root.left!=null) SearchAndInsert(root.left,insertNode);
			 else root.left=insertNode;
		 }else {
			 if(root.right!=null)SearchAndInsert(root.right,insertNode);
			 else root.right=insertNode;
		 }
	 }
	 public static void inorder(Tree root,List<Integer> list) {
		 list.add(root.num);
		 if(root.left!=null) {
			 inorder(root.left,list);
		 }
		 if(root.right!=null) {
			 inorder(root.right,list);
		 }
	 }
	 public static void preorder(Tree root,List<Integer> list) {
		 if(root.left!=null) {
			 preorder(root.left,list);
		 }
		 if(root.right!=null) {
			 preorder(root.right,list);
		 }
		 list.add(root.num);
	 }
	 protected static class Tree{
		 int x;
		 int y;
		 int num;
		 Tree left;
		 Tree right;
		 
		 protected Tree(int x,int y,int num) {
			 this.x=x;
			 this.y=y;
			 this.num=num;
		 }
	 }
}

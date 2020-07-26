package algo;

import java.util.Scanner;
public class Main{
  public static boolean[] visit;
  public static char[] result;
  public static char[] array;
    public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int r=scan.nextInt();
      array=new char[n];
      visit=new boolean[n];
      result=new char[n];
      for(int i=0; i<0; i++) {
    	  System.out.println(1);
      }
      int a=(int)'a';
      for(int i=0; i<n; i++){
        array[i]=(char)('a'+i);
      }
      DFS(0,0,r,n);
    }
  public static void DFS(int start,int depth,int r,int n){
    if(depth==r){
      for(int i=0; i<depth; i++){
        System.out.print(result[i]);
      }
      System.out.println();
      return ;
    }
    else{
      for(int i=0; i<n; i++){
        if(!visit[i]){
          visit[i]=true;
          result[depth]=array[i];
          DFS(i+1,depth+1,r,n);
          visit[i]=false;
        }
      }
    }
  }
  public static void SWAP(int depth,int i){
    char temp=array[depth];
    array[depth]=array[i];
    array[i]=temp;
  }
}
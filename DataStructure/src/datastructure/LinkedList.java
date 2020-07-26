package datastructure;
public class LinkedList implements List {
	int number;
	int index;
	LinkedList next;
	
	LinkedList(int number,LinkedList next){
		this.number=number;
		this.next=next;
	}
	LinkedList(int number,int index,LinkedList next){
		this.number=number;
		this.index=index;
		this.next=next;
	}
	@Override
	public void setSize(LinkedList header) {
		LinkedList temp=header;
		int i=0;
		while(temp!=null) {
			temp.index=i;
			i++;
		}
	}
	@Override
	public void AddFirst(LinkedList header,int num) {
		LinkedList temp=header;
		LinkedList newList=new LinkedList(num,1,null);
		newList.next=temp.next;
		temp.next=newList;
	}
	@Override
	public void AddLast(LinkedList header,int num) {
		LinkedList temp=header;
		LinkedList newList=new LinkedList(num,-1,null);
		
		
	}
	@Override
	public void AddMiddle() {
		
		
	}
	@Override
	public void Print() {
		
		
	}
	@Override
	public void DeleteFirst() {
		
		
	}
	@Override
	public void DeleteLast() {
		
	}
	@Override
	public void DeleteData() {
		
	}
	
}

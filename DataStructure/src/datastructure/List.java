package datastructure;

public interface List {
	void AddFirst(LinkedList header,int num);
	void AddLast(LinkedList header,int num);
	void AddMiddle(LinkedList header,int num,int index);
	void Print(LinkedList header);
	void DeleteFirst(LinkedList header);
	void DeleteLast(LinkedList header);
	void DeleteData(LinkedList header,int data);
	void DeleteIndex(LinkedList header,int index);
	void setSize(LinkedList header);
	int getSize(LinkedList header);
}

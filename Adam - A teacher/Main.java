import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private String name;
	private int id;
	private float mark;

	public Student(String name, int id, float mark) {
		this.name = name;
		this.id = id;
		this.mark = mark;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getMark() {
		return mark;
	}


	public void setMark(float mark) {
		this.mark = mark;
	}


	public int compareTo(Student s) {
		return this.id - s.id;
	}
}

public class Main {
	public static void main(String[] args){
	  
	  List<Student> list = new ArrayList<>();;
   Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    if(n<=0) {System.out.println("Invalid Input");System.exit(0);}
      for(int i=0;i<n;i++){
    	  input.nextLine();
    String name = input.nextLine();
    int id = input.nextInt();
    float mark = input.nextFloat();
      list.add(new Student(name,id,mark));
    }
    Collections.sort(list);
    System.out.println("Sort by id:");
    for(Student s:list) {
    	System.out.println(s.getName()+" "+s.getId()+" "+s.getMark());
    }
  }
}
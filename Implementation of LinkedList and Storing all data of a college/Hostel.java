import java.util.Iterator;

public class Hostel implements Entity_{

	String name;
	LinkedList<Student_> list = new LinkedList<Student_>();
	public Hostel(String name, LinkedList<Student_> list)
	{
		this.name = name;
		this.list = list;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Iterator<Student_> studentList() {
		// TODO Auto-generated method stub
		return new newI<Student_>(list.head);
	}

}

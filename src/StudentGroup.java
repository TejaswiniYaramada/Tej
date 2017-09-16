import java.util.Comparator;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		return  this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here\
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		for(int j=students.length;j>0;j--)
		{
			this.students[j]=this.students[j-1];
		}
		this.students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		this.students[(students.length)]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		for(int i=students.length;i>index;i++)
		{
			this.students[i]=this.students[i-1];
		}
		this.students[index]=student;
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		this.students[index]=null;
		for(int k=index;k<(students.length)-1;k++)
		{
			this.students[k]=this.students[k+1];
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int len=this.students.length;
		int index=0;
             for(int j=0;j<len;j++)
            	 if(this.students[j].equals(student))
            	 {
            		 index=j;
            		 break;
                }
		for(int j=index;j<len;j++)
		this.students[j]=this.students[j+1];
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
		this.students[index+1]=null;
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
		int index=0;
             for(int j=0;j<students.length;j++)
            	 if((this.students[j]).equals(student))
            	 {
            		 index=j;
            		 break;
            	 }
	
		this.students[index]=null;
		
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		
		int j=this.students.length;
		for(int i=0; i<= j-index;i++)
		this.students[i]=this.students[i+index+1];
		this.students[j+1]=null;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int i=this.students.length;
		int index=0;
             for(int j=0;j<i;j++)
		if((this.students[j]).equals(student))
		{index=j;
		break;
                }
		int j=this.students.length;
		for(i=0;i<=j-index;i++)
		this.students[i]=this.students[i+index+1];
		this.students[i+1]=null;
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=this.students.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if((this.students[j].compareTo(this.students[j+1]) >= 0))
				{
                                   Student student= new Student(j, null, null, j);
				    student=this.students[i];
				    this.students[i]=this.students[j];
		    		    this.students[j]=student;	
                                 }

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}
	
	

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
	    int i=this.students.length;
		int index1=0;
             for(int j=0;j<i;j++)
		if((this.students[j]).equals(student))
		{index1=j;
		break;
                }
        	return this.students[index1+1];
	}
}

package student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Kim", 100, 90, 95, 89);
		Student stu2 = new Student("Lee", 60, 70, 99, 98);
		Student stu3 = new Student("Park", 68, 86, 60, 40);
	
		System.out.println(stu1.name+" 평균: "+stu1.getAvg()+" 학점: "+stu1.getGrade());
		System.out.println(stu2.name+" 평균: "+stu2.getAvg()+" 학점: "+stu2.getGrade());
		System.out.println(stu3.name+" 평균: "+stu3.getAvg()+" 학점: "+stu3.getGrade());
	}

}

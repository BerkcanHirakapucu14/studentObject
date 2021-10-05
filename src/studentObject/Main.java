package studentObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student1=new Student();
        student1.setName("Emrah");
        student1.setSurname("Bayram");
        student1.setGender(true);
	    student1.setAge(39);
	    student1.setClassRoom("10AMP");
	    student1.setStage(10);
	    student1.setNationalIdentity("543521432");
	    student1.setLength(1.73);
	    student1.setSchoollNumber("324");
	    System.out.println("Öðrenci :"
	    +student1.getName()+" "+student1.getSurname());
	
        Student student2=new Student("Berkcan","Hýrakapucu","164",11,1.65,14,"10amp",true,"466486468");
	    System.out.println(student2.getNationalIdentity());
	    Schooll okul=new Schooll("ÝBMTAL","Tabaklar","0374512544");
	    System.out.println(okul.getName());
	}

}


public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student std=new student();
std.show("chetan",100);
	}
}
class student
{
	public String name;
	public int age;
void show(String name,int age)
{
	this.name=name;
     this.age=age;

	System.out.println(name);

System.out.println(age);
}
}
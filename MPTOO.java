
import java.util.*;
class Person{
int age;
String name;
	public void read(){
	Scanner s=new Scanner (System.in);
	System.out.println("Enter name and Age");
	name=s.nextLine();age=s.nextInt();}
	public void disp(){
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);}}
class Teacher extends Person{
String subj;
	public void read(){
	super.read();
	Scanner s=new Scanner (System.in);
	System.out.println("Enter subject");
	subj=s.nextLine();}
public void disp(){
	super.disp();
	System.out.println("Subject :"+subj);}}
class MPTOO{
	public static void main(String args[]){
	Teacher t= new Teacher ();
	t.read();
	t.disp();}}
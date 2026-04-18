import java.util.Scanner;
class Person
{
  int pId;
  String pName;
  
}
class Student extends Person
{
  double phy,chem,mat;
  Student(int pId, String pName, double phy, double chem, double mat)
  {
    this.pId = pId;
    this.pName = pName;
    this.phy = phy;
    this.chem = chem;
    this.mat = mat;
  }
  void compute()
  {
    double avg = (phy+chem+mat)/3.0;
  }
}
public class PersonSim
{
  public static void main(String args[])
  {
    int lar;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students");
    int n = sc.nextInt();
    Student[] s = new Student[n];
    lar =0;
    for(int i=0;i<n;i++)
    {
      s[i].compute();
      if(lar<avg)
      {
        lar = i;
      }
    }
    System.out.println("Name: " + s[lar].pName + "\tId: " + s[lar].pId);
  }
}
import java.util.ArrayList;
import java.util.Iterator;


public class EMpWageBuilderMultiCompanyArrayList{
	String Company;
	public static void main(String args[]){
 	Company c1=new Company("Demart",30,5,20);
	Company c2=new Company("Reliance",10,4,16);
	Company c3=new Company("Super Market",20,3,15);

ArrayList< Compamy > al=new ArrayList < Company >();
al.add(c1);
al.add(c2);
al.add(c3);

Iterator itr=al.iterator();

while (itr.hasNext()){
		Company cp=(Company)itr.next();
		System.out.println(cp.name+""+cp.emprateperhrs+""+cp.numofworkingdays+""+maxhourspermonth);
}
}
}

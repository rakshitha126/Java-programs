
public class NestedSwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String branch="CS";
		String subject="JAVA";
		switch(branch) {
		case "CS":
			switch(subject)
			{
			case "JAVA":System.out.println("introduction to java,features of java,datatypes");
			break;
			case "ST":System.out.println("path testing,data flow testing,levels of testing");
			break;
			case "SE":System.out.println("software processing,requirement engineering,system models");
			break;
			}
			break;
		case "EC":
			switch(subject)
			{
			case "DC":System.out.println("baseband transmissin,digital modulation scheme,error control coding");
			break;
			case "CN":System.out.println("fundamentals and link layer,media access and internetworking");
			break;
			case "CA":System.out.println("computer organization,arithematic,the processor");
			break;
			}
			break;
		case "MECH":
			switch(subject)
			{
			case "AM":System.out.println("introduction to additive manufacturing,system drives and devices");
			break;
			case "CN":System.out.println("introduction to finet element analysis,beams and shafts,heat transfer");
			break;
			}
			break;
			}
		}
		

	}



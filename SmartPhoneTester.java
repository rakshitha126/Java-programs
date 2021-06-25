class SmartPhoneTester{
public static void main(String a[])
{
SmartPhone smart=new SmartPhone();
smart.name="Samsung";
smart.price=55000;
smart.androidOrNot=true;
smart.space=125;
System.out.println(smart.name+" "+smart.price+" "+smart.androidOrNot+" "+smart.space);
SmartPhone smartphone=new SmartPhone();
smartphone.name="Vivo";
smartphone.price=25000;
smartphone.androidOrNot=true;
smartphone.space=64;
System.out.println(smartphone.name+" "+smartphone.price+" "+smartphone.androidOrNot+" "+smartphone.space);
SmartPhone sp=new SmartPhone();
sp.name="mi";
sp.price=15000;
sp.androidOrNot=true;
sp.space=64;
System.out.println(sp.name+" "+sp.price+" "+sp.androidOrNot+" "+sp.space);
smart.fetchInformation();
smart.Price();
}
}
package aggregation;

public class AggregationPgm2 {
	String rank;
	int rollnumber;
	AggregationPgm1 add; //aggregation
	
	public AggregationPgm2(String rank, int rollnumber, AggregationPgm1 add)
	{
		this.rank=rank;
		this.rollnumber=rollnumber;
		this.add=add;
	}
	
	public void display()
	{
		System.out.println(rank+" "+rollnumber);
		System.out.println(add.name+" "+add.pincode+" "+add.city);//reference value.parent class variable
	}

	public static void main(String[] args) {
		AggregationPgm1 obj= new AggregationPgm1("anu",65848,"tvm");
		AggregationPgm2 obje=new AggregationPgm2("second",55,obj);// for invoking reference value pass previous class obj
		obje.display();
		

	}

}

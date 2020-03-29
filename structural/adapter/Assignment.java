package structural.adapter;

public class Assignment {
	Pen p;
	
	public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}
	
	AdapterPen ap= new AdapterPen();
	public void doAssignment(String s)
	{
		ap.write(s);
	}
	
}

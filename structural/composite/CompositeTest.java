package structural.composite;

public class CompositeTest {
	public static void main(String args[])
	{
		Component hd= new Leaf(2000,"Hard Disk");
		Component mouse= new Leaf(200,"Mouse");
		Component keyboard= new Leaf(500,"Key Board");
		Component ram= new Leaf(4000,"Ram");
		Component cpu= new Leaf(4000,"CPU");
		
		Composite md= new Composite("MB");
		Composite cabinet= new Composite("Cabinet");
		Composite ph= new Composite("Peri");
		Composite computer= new Composite("Computer");
		
		md.addComponent(ram);
		md.addComponent(cpu);
		
		ph.addComponent(mouse);
		ph.addComponent(keyboard);
		
		cabinet.addComponent(md);
		cabinet.addComponent(hd);
		
		computer.addComponent(cabinet);
		computer.addComponent(ph);
		computer.showPrice();
	}
}

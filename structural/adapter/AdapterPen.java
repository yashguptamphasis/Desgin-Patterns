package structural.adapter;

public class AdapterPen implements Pen{

	BallPen bp= new BallPen();
	@Override
	public void write(String s) {
		// TODO Auto-generated method stub
		bp.write1(s);
	}

}

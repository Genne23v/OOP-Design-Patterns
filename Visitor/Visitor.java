package Visitor;

public interface Visitor {

	public double visit(Liquor liquorItem);
	public double visit(Tabacco tobaccoItem);
	public double visit(Necessity necessityItem);
}

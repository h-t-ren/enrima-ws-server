package at.ac.iiasa.ime.enrima.domain.enums;

public enum SetStateEnum {

	COMMITED('C'),TESTED('T'),EDITED('E');
	
	private final char symbol;
	SetStateEnum(char symbol)
	{
		this.symbol = symbol;
	}
	public char getSymbol(){ return this.symbol;}
}

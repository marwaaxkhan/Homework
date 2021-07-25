package hw6Q4Abstraction01;
/*c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub.*/

public interface College {
	public abstract void commonRoom();

	public void laboratory();

	public void languageClub();
// 'public College(){}' We Cannot Create Constructor InSide Interface Because
// Interface Cannot Be Instantiated ( Cannot Create Object )

}
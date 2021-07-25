package hw6Q4Abstraction01;
/*b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. */

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public abstract void cafeteria();
// 'public Hospital(){}' We Cannot Create Constructor InSide Interface Because
// Interface Cannot Be Instantiated ( Cannot Create Object )

}
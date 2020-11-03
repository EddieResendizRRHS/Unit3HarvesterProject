import kareltherobot.*; 

public class Runner
{
  public static void main(String[] args)
  {
    World.setDelay(50);
    World.readWorld("fieldOfBeepers.kwld");
    World.setVisible(true); 
  }
}

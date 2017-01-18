public class Ship{
  
  private int x1; 
  private int y1;
  private int x2;
  private int y2;
  
  public Ship(){
    
  }
  
  
   public Ship(int newx1, int newx2, int newy1, int newy2){

    x1 = newx1;
    x2 = newx2;
    y1 = newy1;
    y2 = newy2;
  }
     
   public int getx1(){
    return x1;
  }
  
  public void setx2(int newx1){
    x1 = newx1;
  }
  
  public int getx2(){
    return x2;
  }
  
  public void setx2(int newx2){
    x2 = newx2;
  }
  
    public int gety1(){
    return y1;
  }
  
  public void sety1(int newy1){
    x2 = newx2;
  }
  
    public int gety2(){
    return x2;
  }
  
  public void sety2(int newy2){
    y2 = newy2;
  }
  
  
 
  

  public int toint(){
    return x1 + x2 + y1 + y2;
  }
  
  }
  

  
}
  
class Board
{
String colour;
String size;
void writing()
{
System.out.println("Board is used for writing");
}
}
public class Object
{
public static void main(String args[])
{
Board B1;
B1= new Board();
System.out.println(B1.colour);
System.out.println(B1.size);
B1.writing();
}
}


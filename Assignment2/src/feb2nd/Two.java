package feb2nd;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
	}

}
interface Shape
{
    void input();
    void area();
}
class Circle implements Shape
{
    int radius = 0;
    double pie = 3.14, area = 0;
    @Override
    public void input()
    {
        radius = 5;
    }
    @Override
    public void area()
    {
        area = pie * radius * radius;
        System.out.println("Area of circle:"+area);
    }
}
class Rectangle extends Circle
{
    int l = 0, b = 0;
    double area;
    public void input()
    {
        super.input();
        l = 6;
        b = 4;
    }
    public void area()
    {
        super.area();
        area = l * b;
        System.out.println("Area of rectangle:"+area);
    }
}

import java.util.Arrays;


public class Triangle {
	
	private int m_a;
	private int m_b;
	private int m_c;
	
	public int getMaxSide() {
        return m_c;
    }
 
    public int getMidSide() {
        return m_b;
    }
 
    public int getMinSide() {
        return m_a;
    }
    public boolean IsIsosceles() {
        return m_a == m_b || m_b == m_c || m_a == m_c ;
    }
    public boolean IsEquilateral() {
        return m_a ==m_b && m_b ==m_c;
    }
    public boolean IsVersatile() {
        return !IsIsosceles();
    }
    public int getPerimeter() throws Exception
    {
        long res =  (long)m_a + m_b + m_c;
        if(res > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Perimeter is out of Integer type");
        }
        return (int)res;
    }
    public float getSquare() throws Exception {
        double res = 0.0;
        double p = ((float)m_a + m_b + m_c)/2 ;
        res = Math.sqrt(p*(p-m_a)*(p-m_b)*(p-m_c));
        if(res > Float.MAX_VALUE){
            throw new IllegalArgumentException("Square is out of Double type");
        }
        return (float)res;
    }
    public Triangle(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("Sides should be positive");
        }
        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        if (arr[2] >= arr[1] + arr[0])
            throw new IllegalArgumentException("Such a triangle does not exist");
        m_a = arr[0];
        m_b = arr[1];
        m_c = arr[2];
    }
    
    @Override
    public String toString() {
        String type;
        if (IsEquilateral()){
            type = "Equilateral";
        }else if (IsIsosceles()){
            type = "Isosceles";
        }else{
            type = "Versatile";
        }
        try {
            return "Triangle{" +
                    "\nsides= " + m_a +" "+m_b+" "+m_c +
                    "\nsquare= " + getSquare() +
                    "\ntype= " + type +
                    "\nperimeter= " + getPerimeter() +
                    "\n}";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}

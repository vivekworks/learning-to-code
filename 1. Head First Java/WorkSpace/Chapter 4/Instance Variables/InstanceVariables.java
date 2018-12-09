class InstanceVariables{
	byte a;
    short b;
    int c;
    long d;
    char e;
    boolean f;
    float g;
    double h;
    String i;
    InstanceVariables j;
    public byte getA(){
    	return a;
    }
    public short getB(){
    	return b;
    }
    public int getC(){
    	return c;
    }
    public long getD(){
    	return d;
    }
    public char getE(){
    	return e;
    }
    public boolean getF(){
    	return f;
    }
    public float getG(){
    	return g;
    }
    public double getH(){
    	return h;
    }
    public String getI(){
    	return i;
    }
    public InstanceVariables getJ(){
    	return j;
    }
    public static void main(String[] args){
    	InstanceVariables iv = new InstanceVariables();
    	System.out.println(" Default byte value "+iv.getA());
    	System.out.println(" Default short value "+iv.getB());
    	System.out.println(" Default int value "+iv.getC());
    	System.out.println(" Default long value "+iv.getD());
    	System.out.println(" Default char value "+iv.getE());
    	System.out.println(" Default boolean value "+iv.getF());
    	System.out.println(" Default float value "+iv.getG());
    	System.out.println(" Default double value "+iv.getH());
    	System.out.println(" Default String value "+iv.getI());
    	System.out.println(" Default reference value "+iv.getJ());
    }
}

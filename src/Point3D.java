public class Point3D {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3D(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord= z;
    }
    public Point3D() {
        this(0, 0, 0);
    }
    public double getX () { return xCoord; }
    public double getY () { return yCoord; }
    public double getZ () { return zCoord; }
    public void setX ( double val) { xCoord = val; }
    public void setY ( double val) { yCoord = val; }
    public void setZ ( double val) { zCoord = val; }
    public boolean equalsDots(Point3D object){
        return xCoord==object.xCoord && yCoord==object.yCoord && zCoord==object.zCoord; }
    public boolean equalsDotX(Point3D object){
        return xCoord==object.xCoord; }
    public boolean equalsDotY(Point3D object){
        return yCoord==object.yCoord; }
    public boolean equalsDotZ(Point3D object){
        return zCoord==object.zCoord; }
    public double distanceTo(Point3D object){
        return Math.sqrt(Math.pow(object.xCoord-xCoord,2)+
                Math.pow(object.yCoord-yCoord,2)+Math.pow(object.zCoord-zCoord,2)); }
    public static double computeArea(Point3D a,Point3D b,Point3D c){
        if (a.equalsDots(b) || b.equalsDots(c) || c.equalsDots(a)){
            System.out.println("Ошибка. Точки имеют идентичные координаты");
            System.exit(0);
        }
        double variable=(a.distanceTo(b)+b.distanceTo(c)+c.distanceTo(a))*0.5;
        return Math.sqrt(variable*(variable-a.distanceTo(b))*(variable-b.distanceTo(c))*(variable-c.distanceTo(a)));
    }
}
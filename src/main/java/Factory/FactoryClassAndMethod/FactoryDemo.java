package Factory.FactoryClassAndMethod;

class FactoryDemo {
    public static void main(String[] args) {
        //Normal scenarios
        Point point = new Point(2, 3, CoordinateSystem.CARTESIAN);
        //Singleton
        Point origin = Point.ORIGIN;

        //Factory Method
        Point point1 = Point.newCartesianPoint(1, 2);
        Point point2 = Point.newPolarPoint(1, 5);

        //Factory Class and then Factory Method
        Point pointF = Point.Factory.newCartesianPoint(1, 2);

    }
}

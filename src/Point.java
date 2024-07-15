import java.util.Objects;
 public class Point {
        private int pointX;
        private int pointY;

        /** khoi tao. */
        public Point(int pointX, int pointY) {
            this.pointX = pointX;
            this.pointY = pointY;
        }

        public void setPointX(int pointX) {
            this.pointX = pointX;
        }

        public void setPointY(int pointY) {
            this.pointY = pointY;
        }

        public int getPointX() {
            return pointX;
        }

        public int getPointY() {
            return pointY;
        }

        /** distance. */
        public double distance(Point newPoint) {
            double a = Math.pow(this.pointX - newPoint.pointX, 2)
                    + Math.pow(this.pointY - newPoint.pointY, 2);
            return Math.sqrt(a);
        }

        /** equals. */
        @Override
        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point tmp = (Point) o;
                if (tmp.pointX == this.pointX && tmp.pointY == this.pointY) {
                    return true;
                }
            }
            return false;
        }

        /** hashCode. */
        @Override
        public int hashCode() {
            return Objects.hash(pointX, pointY);
        }



 }



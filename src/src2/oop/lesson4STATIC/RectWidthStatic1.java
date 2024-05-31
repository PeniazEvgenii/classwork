package oop.lesson4STATIC;

public class RectWidthStatic1 {
        static int id = 0;
        static int x1 = 10;
        static int x2 = 15;
        int y1 = 20;
        int y2 = 39;

        private RectWidthStatic1() {
        }

        public static RectWidthStatic1 getWidth() {
            RectWidthStatic1 rect = null;
            if(id == 0) {
                rect = new RectWidthStatic1();
                id++;
            }
            return rect;
        }

        public static int rectWidth(RectWidthStatic1 rec){
            return Math.abs(x1-x2);
        }
    }

    class Test1 {
        public static void main(String[] args) {
            RectWidthStatic1 rect =   RectWidthStatic1.getWidth();
            System.out.println(rect.y1);
            System.out.println(rect.x1);
            RectWidthStatic1 rect2 =   RectWidthStatic1.getWidth();
            // System.out.println(rect2.y1);




        }
    }

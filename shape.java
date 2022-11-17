class Shape {
    void Draw()
    {
        System.out.println("shape is drawing");
    }
    void erase()
    {
        System.out.println("shape is erasing");
    }
    class Circle extends Shape
    {
        void Draw()
        {
            System.out.println("Circle is drawing");
        }
        void erase()
        {
            System.out.println("Circle is erasing");
        }
        class Triangle extends Shape
        {
            void Draw()
            {
                System.out.println("Triangle is drawing");
            }
            void erase()
            {
                System.out.println("Triangle is erasing");
            }
        }
        class Square extends Shape
        {
            void Draw()
            {
                System.out.println("Square is drawing");
            }
            void erase()
            {
                System.out.println("Square is erasing");
            }public Class Q3; {
            //public static void main (String[] args){
            Shape a =new Circle ();
            Shape b =new Triangle();
            Shape c =new Square ();
            a.Draw();
            a.erase();
            b.Draw();
            b.erase();
            c.Draw();
            c.erase();
        }
        }
    }
}
### Your job is to take code snippets from the pool and place them into the blank  lines in the code. You may use the same snippet more than once, and you  won’t need to use all the snippets. Your goal is to make a class that will  compile and run and produce the output listed.
![img.png](../../../resources/img_pp_3_1.png)
![img.png](../../../resources/img_pp_3_2.png)

### `solution`

```java
class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }
}
```
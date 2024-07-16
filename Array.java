public class Array {
    static void a() {
        int ages[] = new int[5];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[3] = 40;
        ages[4] = 50;

        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }


    static void b() {
        int[] marks = {9, 8, 66, 4, 3};
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                continue;
            System.out.println(marks[i]);
        }
        System.out.println("Length of array=" + marks.length);
    }


    static void c() {
        String name[] = {"Raj", "Abhishek", "Prabhaker"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
    }


    static void d() {
        int[][] marks = {{34, 35},
                         {75, 53},
                          {84, 42}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(marks[i][j]);
            }
        }
    }

    static void e() {
        int sum = 0;
        int[] marks = {30, 40, 20, 10};
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }

    static void f()
    {
        int ans=0;
        int [] marks={38,57,67,96,99};
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>ans)
                ans=marks[i];
        }
        System.out.println("Maximum Marks="+ans);
    }

    public static void main(String[] args) {
        f();
    }
}















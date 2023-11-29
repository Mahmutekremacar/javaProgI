public class simple {


        public static String Employee_name;
        public static float Employee_salary;

        static void set(String n, float p) {
            Employee_name = n;
            Employee_salary = p;
        }

        static void get() {
            System.out.println("Employee name is: " +Employee_name );
            System.out.println("Employee CTC is: " + Employee_salary);
        }
        static void add(int a, int b )
        {
            System.out.println(a+b);
        }

        public static void main(String args[]) {
            simple.set("Rathod Avinash", 10000.0f);
            simple.set("Mahmut Ekrem Acar", 1234.98360f);
            simple.get();

        }



}

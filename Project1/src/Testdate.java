public class Testdate {
    public static void main(String[] args){
        //crate odject d1 call methon in Class Date
        Date d1 = new Date(2025,8,2);
        System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("Year is " + d1.getYear());
        System.out.println("Month is " + d1.getMonth());
        System.out.println("Day is " + d1.getDay());

        d1.setDate(2024, 3, 25);
        System.out.println(d1);
    }
}
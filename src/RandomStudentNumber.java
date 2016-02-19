public class RandomStudentNumber
{
    public static void main(String[] args)
    {
        int number =  ((int)(Math.random() * 100) % 40 + 1);
        System.out.println("Student Number: " + number);
    }
}
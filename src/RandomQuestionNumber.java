public class RandomQuestionNumber
{
    public static void main(String[] args)
    {
        int number =  ((int)(Math.random() * 100) % 15 + 1);
        System.out.println("Student Number: " + number);
    }
}
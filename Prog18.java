
class Prog18 {
    public static void evenWords(String s)
    {
        System.out.println("The even words are:");
        for (String w : s.split(" ")){

            if (w.length() % 2 == 0)

                System.out.println(w+"-"+w.length());
        }
    }
    public static void oddWords(String s){
        System.out.println("The odd words are:");
        for (String w : s.split(" ")){

            if (w.length() % 2 != 0)

                System.out.println(w+"-"+w.length());
        }
    }


    public static void main(String[] args)
    {
        String s = "we belongs to ECE Department";
        evenWords(s);
        oddWords(s);
    }
}
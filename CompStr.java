class CompStr {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abcc";
        int l1, l2,flag=0;
        l1 = str1.length();
        l2 = str2.length();
        if (l1 == l2) {
            for (int ctr1 = 0,ctr2=0; ctr1 < l1; ) {
                     if (str1.charAt(ctr1) == str2.charAt(ctr2)) {
                         flag = 1;
                     }
                     else {
                         flag = 0;
                         break;
                     }
                     ctr1=ctr1+1;
                     ctr2=ctr2+1;
            }
            if (flag==1)
                System.out.println("string are equal");
            else
                System.out.println("String are unequal");

        }
        else {
            System.out.println("String lengths are not matching.");
        }
    }
}
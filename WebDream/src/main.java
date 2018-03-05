public class main {
    public static void main(String[] args) {
       int a[] = {2,5,6,15,1337,28};
        for (int i = 0; i <a.length; i++) {
            if(a[i]%2==0&&a[i]%3==0) System.out.println(a[i]);
        }

        }
}

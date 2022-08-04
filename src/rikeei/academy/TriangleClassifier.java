package rikeei.academy;

public class TriangleClassifier{
    public static String checkTriangle(int a, int b, int c) {
        String show = "";
        if (a <= 0 || b <= 0 || c <= 0) {
            show = "Không phải tam giác";
        }else if (a+b<=c||b+c<=a||a+c<=b){
            show = "Không phải tam giác";
        } else if(a==b&&b==c){
            show = "Tam giác đều";
        }else if(a==b||b==c||a==c){
            show = "Tam giác cân";
        }else {
            show = "Tam giác thường";
        }
    return show; }
}

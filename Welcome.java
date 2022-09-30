
public class Welcome {
    
    public static void main(String args []) {
        
        int triangle_len = 10;
        int fact_triangle[][] = new int[triangle_len][triangle_len+1];

        for(int i=0;i<triangle_len;i++){
            for(int j=0;j<=i;j++){
                if(j == 0){
                    fact_triangle[i][j] = 1;
                }
                else if(j==i){
                    fact_triangle[i][j] = 1;
                }
                else{
                   fact_triangle[i][j] = fact_triangle[i-1][j]+fact_triangle[i-1][j-1];
                }
            }
        }
        for(int i=0;i<triangle_len;i++){
            for(int j=0;j<=i;j++){
               System.out.print(fact_triangle[i][j] + " ");
               
            }
            System.out.println();
        }
    }
}

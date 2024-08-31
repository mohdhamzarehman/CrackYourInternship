class Solution {
    public void gameOfLife(int[][] t) {
        int a=t.length,b=t[0].length, m[][]=new int[a][b];
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++)
                m[i][j]=t[i][j];
        }
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                int c=0;
                if(i!=0 ){
                if(m[i-1][j]==1)
                c++;
                if(j!=0 && m[i-1][j-1]==1)
                c++;
                if(j!=b-1 && m[i-1][j+1]==1)
                c++;
                }
                if(i!=a-1 ){
                if( m[i+1][j]==1)
                c++;
                if(j!=0 && m[i+1][j-1]==1)
                c++;
                if(j!=b-1 && m[i+1][j+1]==1)
                c++;
                }
                if(j!=0 && m[i][j-1]==1)
                c++;
                if(j!=b-1 && m[i][j+1]==1)
                c++;
                if(m[i][j]==0 &&c==3)
                t[i][j]=1;
                if(m[i][j]==1 &&( c<2||c>3))
                t[i][j]=0;
            }
        }
        
    }
}

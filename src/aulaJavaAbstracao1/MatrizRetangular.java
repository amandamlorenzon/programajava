package aulaJavaAbstracao1;

public class MatrizRetangular implements Matriz {
    private final int linha, coluna;
    double m[][];
   
    // Construtora da classe
    public MatrizRetangular( int l, int c ){
        linha = l;
        coluna = c;

        m = new double[linha][coluna];
    }
   
    // Método que retorna a matriz transposta
    public MatrizRetangular transposta(){
        MatrizRetangular res = new MatrizRetangular(coluna, linha);
   
        for( int i=0; i<linha; i++ ){
            for( int j=0; j<coluna; j++ ){
                res.setElemento(j, i, m[i][j] );
            }
        }
        return res;
    }
   
    // Método que verifica se a matriz é quadrada ou não
    public boolean quadrada(){
        return (linha == coluna) ? true : false;
    }
   
    // Atribui o valor a um elemento
    public void setElemento( int i, int j, double valor ){
        m[i][j] = valor;
    }
   
    // Retorna o valor de um elemento
    public double getElemento( int i, int j ){
        return m[i][j];
    }
   
    // Mostrar a matriz
    public void mostrar_matriz(){
        for( int i=0; i<linha; i++ ){
            for( int j=0; j<coluna; j++ ){
            System.out.print( "\t" + m[i][j] );
        }
        System.out.print( "\n" );
        }
    }
}
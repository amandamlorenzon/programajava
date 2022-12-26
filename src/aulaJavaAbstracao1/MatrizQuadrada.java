package aulaJavaAbstracao1;

public class MatrizQuadrada implements Matriz {
    private final int tam;
    double m[][];

    //Construtora da classe
    public MatrizQuadrada(int t){
        tam = t;
        m = new double[tam][tam];
    }

    //Método para determinar o traço da matriz
    public double traco(){
        double res = 0;
        for(int i = 0; i < tam; i++) res += m[i][i];
        return res;
    }

    //Método que retorna a matriz transporta
    public MatrizQuadrada transposta(){
        MatrizQuadrada res = new MatrizQuadrada(tam);
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                res.setElemento(j, i, m[i][j]);
            }
        }
        return res;
    }

    //Método que verifica se a matriz é quadrada ou não
    public boolean quadrada(){
        return true;
    }

    //Atribui o valor a um elemento
    public void setElemento(int i, int j, double valor){
        m[i][j] = valor;
    }

    //Retorna o valor de um elemento
    public double getElemento(int i, int j){
        return m[i][j];
    }

    //Mostar a matriz
    public void mostrar_matriz(){
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                System.out.println("\t" + m[i][j]);
            }
            System.out.println("\n");
        }
    } 
}

package aulaJavaAbstracao1;


public interface Matriz {
    // Método que retorna a matriz transposta
    public Matriz transposta();
   
    // Método que verifica se a matriz é quadrada ou não
    public boolean quadrada();
   
    // Atribui o valor a um elemento
    public void setElemento(int i, int j, double valor);
   
    // Retorna o valor de um elemento
    public double getElemento( int i, int j);
   
    // Mostra a matriz
    public void mostrar_matriz();
   }
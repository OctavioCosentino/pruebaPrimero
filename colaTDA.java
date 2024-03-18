class ColaTDA(){
    void Acolar(int x);
    void Desacolar();
    int Primero();
    boolean ColaVacia();
}

public void PasarCola(ColaTDA Origen, ColaTDA Destino){
    while(!Origen.ColaVacia()){
        Destino.Acolar(Origen.Primero());
        Origen.Desacolar();
    }
}
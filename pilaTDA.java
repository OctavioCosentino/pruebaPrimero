class PilaTDA(){
    void InicializarPila();
    void Apilar(int x);
    void Desapilar();
    boolean PilaVacia();
    int Tope();
}

public void PasarPilas(PilaTDA Origen, PilaTDA Destino){
    while (!Origen.PilaVacia()){
        Destino.Apilar(Origen.Tope());
        Origen.Desapilar;
    }
}

public void CopiarPila(PilaTDA Origen, PilaTDA Copia){
    PasarPilas(Origen, PilaTDA Aux);
    PasarPilas(Aux, Copia);
}

public void InvertirPila(PilaTDA Origen){
    PasarPilas(Origen, PilaTDA Aux);
    PasarPilas(Aux, Origen);
}

public int CantidadElementos(PilaTDA Origen){
    int contador;
    PilaTDA aux = new PilaTDA();
    while (!Origen.PilaVacia){
        aux.Apilar(Origen.Tope());
        contador++;
    }
    return contador;
}

public int SumaElementos(PilaTDA Origen){
    PilaTDA aux = new PilaTDA();
    int suma;
    while (!Origen.PilaVacia()){
        aux.Apilar(Origen.Tope());
        suma = suma + Origen.Tope();
        Origen.Desapilar;
    }
    return suma;
}

public int PromedioElementos(PilaTDA Origen){
    int promedio = SumaElementos(Origen)/CantidadElementos(Origen);
    return promedio
}
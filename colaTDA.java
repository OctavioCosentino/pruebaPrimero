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

public int AuxiliarFinales(ColaTDA Origen){
    PilaTDA aux = new PilaTDA()
    while(!Origen.ColaVacia()){
        aux.Apilar(Origen.Primero());
        Origen.Desacolar();
    }
    return aux.Tope();
}

public boolean FialesIguales(ColaTDA C1, ColaTDA C2){
    boolean flag = false;
    int FinalC1 = AuxiliarFinales(C1);
    int FinalC2 = AuxiliarFinales(C2);
    if (FinalC1 == FinalC2){
        flag = true
    }
    return flag
}

public boolean ColasInversas(ColaTDA C1, ColaTDA C2){
    PilaTDA aux = new PilaTDA()
    boolean flag = false;
    int cont;
    int cont2;
    while(!Origen.ColaVacia()){
        aux.Apilar(Origen.Primero());
        cont2++;
        Origen.Desacolar();
    }
    while(!aux.PilaVacia()){
        if(aux.Tope() == C2.Primero()){
            cont++;
        }
        aux.Desapilar();
        C2.Desacolar();
        if (cont == cont2){
            flag = true;
        }
        return flag
    }
}

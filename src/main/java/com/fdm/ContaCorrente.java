package com.fdm;

enum Categoria {Silver, Gold, Platinum}

public class ContaCorrente{
  public String getNumeroConta(){
    return "";
  }

  public String getNomeCorrentista(){
    return "";
  }

  public double getSaldo(){
    return 0.0;
  }

  public Categoria getCategoria(){
    return null;
  }

  public boolean deposito(double valor){
    return false;
  }

  public boolean retirada(double valor){
    return false;
  }

}


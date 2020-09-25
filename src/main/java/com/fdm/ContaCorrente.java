package com.fdm;

public class ContaCorrente{
  private double saldo;
  private String numeroConta;
  private String nomeCorrentista;
  private String Silver = "Silver";
  private String Gold = "Gold";
  private String Platinum = "Platinum";
  private String categoria;


  public ContaCorrente(String numeroConta, String nomeCorrentista, double saldoInicial){
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    if(saldoInicial <= 0.0){
      this.saldo = 0.0;
      this.categoria = Silver;
    }
    else if(saldoInicial < 50000.0){
      this.saldo = saldoInicial;
      this.categoria = Silver;
    }
    else if(saldoInicial >= 50000.0 && saldoInicial < 200000.0){
      this.saldo = saldoInicial;
      this.categoria = Gold;
    }
    else{
      this.saldo = saldoInicial;
      this.categoria = Platinum;
    }
  }

  public String getNumeroConta(){
    return this.numeroConta;
  }

  public String getNomeCorrentista(){
    return this.nomeCorrentista;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public String getCategoria(){
    return this.categoria;
  }

  public boolean deposito(double valor){
    if(valor <= 0){
      return false;
    }
    else{
      if(categoria.toUpperCase().equals(Silver.toUpperCase())){
        this.saldo = this.saldo+valor;
        if(this.saldo >= 50000.0){
          this.categoria = Gold;
        }
        return true;
      }
      else if(categoria.toUpperCase().equals(Gold.toUpperCase())){
        this.saldo = this.saldo+(valor*0.01+valor);
        if(this.saldo >= 200000.0){
          this.categoria = Platinum;
        }
        return true;
      }
      else{
        this.saldo = this.saldo+(valor*0.025+valor);
        return true;
      }
    }
  }

  public boolean retirada(double valor){
    return false;
  }

}


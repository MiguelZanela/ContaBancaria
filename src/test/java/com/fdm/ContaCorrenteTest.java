package com.fdm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ContaCorrenteTest{
    
    @ParameterizedTest
    @CsvSource({
        "0.0,5000.0,Silver,5000.0",
        "20000.0,6000.0,Silver,26000.0",
        "200000.0,1000.0,Platinum,201025.0"
    })
    public void testaDeposito(double saldoInicial, double deposito, String estadoEsperado, double saldoEsperado){
        // Monta cenário
        ContaCorrente ct = new ContaCorrente("00","joao de oliveira",saldoInicial);
        // Executa o teste
        ct.deposito(deposito);
        double saldoObservado = ct.getSaldo();
        String estadoObservado = ct.getCategoria();
        // Verifica resultados esperados
        assertEquals(saldoEsperado,saldoObservado,0.001);
        assertEquals(estadoEsperado,estadoObservado);
    } 
    
    /*
    @ParameterizedTest
    @CsvSource({
        "0.0,5000.0,Silver,5000.0",
        "20000.0,6000.0,Gold,26000.0"
    })
    public void testaRetirada(double saldoInicial, double retirada, String estadoEsperado, double saldoEsperado){
        // Monta cenário
        ContaCorrente ct = new ContaCorrente("00","joao de oliveira",saldoInicial);
        // Executa o teste
        ct.deposito(retirada);
        double saldoObservado = ct.getSaldo();
        String estadoObservado = ct.getCategoria();
        // Verifica resultados esperados
        assertEquals(saldoEsperado,saldoObservado,0.001);
        assertEquals(estadoEsperado,estadoObservado);
    } 
    */
  }

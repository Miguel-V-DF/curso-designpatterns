package br.com.ada.designpattern.strategy.solucao;

import br.com.ada.designpattern.strategy.Funcionario;
import br.com.ada.designpattern.strategy.problema.ReajusteAnualSalario;
import br.com.ada.designpattern.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class TesteAjusteSalarioComStrategy {

    public static void main(String[] args) {
        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Podolski");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Osvaldo");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));

        // calcular nossos reajustes aqui

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}

package org.introducao.tadNumero_01;

public class TadNumero {

    private static final String MENOR_QUE_ZERO = "Valor menor que zero -> corrigido para zero";
    private static final String CORRIGIDO_PARA_40 = "Valor no intervalo não suportado -> corrigido para 40";
    private static final String CORRIGIDO_PARA_60 = "Valor no intervalo não suportado -> corrigido para 60";
    private static final String CORRIGIDO_PARA_100 = "Valor maior que 100 -> corrigido para 100";
    private static final String NOVO_VALOR = "Novo valor atribuido -> ";

    private int valor;

    public TadNumero() {
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {

        if (valor < 0) {
            valor = 0;
            msg(MENOR_QUE_ZERO);
        } else if (valor > 40 && valor < 60) {
            if (valor < 50) {
                valor = 40;
                msg(CORRIGIDO_PARA_40);
            } else {
                valor = 60;
                msg(CORRIGIDO_PARA_60);
            }
        } else if (valor > 100){
            valor = 100;
            msg(CORRIGIDO_PARA_100);
        }
        this.valor = valor;
        msg(NOVO_VALOR + this.valor);
    }

    private void msg(String s) {
        System.out.println("!!! ATENÇÃO: ".concat(s).concat(" !!!"));
    }
}

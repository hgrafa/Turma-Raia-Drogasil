package model;

import model.enums.Cor;

public class FiguraPlana {
    protected int qntdDeLados;
    protected Cor cor;

    public FiguraPlana( Cor cor) {
        this.cor = cor;
    }

    public FiguraPlana(){
        this.cor = Cor.NENHUMA;
    }

    public int getQntdDeLados() {
        return qntdDeLados;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}

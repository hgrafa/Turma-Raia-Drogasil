package model;

import model.enums.Cor;
import model.interfaces.FiguraPlana;

public abstract class FiguraPlanaAbstrata implements FiguraPlana {
    protected int qntdDeLados;
    protected Cor cor;

    public FiguraPlanaAbstrata(Cor cor) {
        this.cor = cor;
    }

    public FiguraPlanaAbstrata(){
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

    @Override
    public String toString() {
        return "FiguraPlanaAbstrata{" +
                "qntdDeLados=" + qntdDeLados +
                ", cor=" + cor +
                '}';
    }
}

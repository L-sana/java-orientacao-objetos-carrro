public enum TiposCarro {
    ONIBUS("Onibus",15),
    VAN("Van", 10),
    PASSEIO("Passeio", 5);

    int qtdePessoasTipo;
    String descricaoTipo;

    TiposCarro(String descricaoTipo, int qtdePessoasTipo) {
        this.descricaoTipo = descricaoTipo;
        this.qtdePessoasTipo = qtdePessoasTipo;

    }

    public int getQtdePessoasTipo() {
        return qtdePessoasTipo;
    }

    public String getDescricaoTipo() {
        return descricaoTipo;
    }
}

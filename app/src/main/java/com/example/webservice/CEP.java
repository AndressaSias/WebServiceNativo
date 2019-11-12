package com.example.webservice;

class CEP {

    private String codibge;
    private String codestado;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;


    CEP(String codibge, String codestado, String cep, String logradouro, String complemento, String bairro, String cidade, String estado) {
        this.codibge = codibge;
        this.codestado = codestado;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }


    public String getCodibge() {
        return codibge;
    }

    public void setCodibge(String codibge) {
        this.codibge = codibge;
    }

    public String getCodestado() {
        return codestado;
    }

    public void setCodestado(String codestado) {
        this.codestado = codestado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        return "CEP: "+getCep()
        + "\nLogradouro: " +getLogradouro()
        + "\nComplemento: " +getComplemento()
                + "\nBairro: " +getBairro()
                + "\nCidade: " +getCidade()
                + "\nEstado: " +getEstado();
    }
}

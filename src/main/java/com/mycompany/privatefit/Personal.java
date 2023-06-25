package com.mycompany.privatefit;

public class Personal extends Usuario {
    
    private String cref;
    private String telefone;

    public Personal(String cref, String nome, String email, String senha, String telefone) {
        super(nome, email, senha);
        this.cref = cref;
        this.telefone = telefone;
    }
    
    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}

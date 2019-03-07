
package Modelo;



public class Compra {
 
     private String id;
     private String formapagamento;
     private String tipopagamento;
     private String tipoenvio;
     private String endereco;
     private String idcd;

    public String getIdcd() {
        return idcd;
    }

    public void setIdcd(String idcd) {
        this.idcd = idcd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public String getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(String tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

    public String getTipoenvio() {
        return tipoenvio;
    }

    public void setTipoenvio(String tipoenvio) {
        this.tipoenvio = tipoenvio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}

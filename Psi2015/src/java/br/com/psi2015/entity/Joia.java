package br.com.psi2015.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="joia")
public class Joia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue
    @Column(name="id_Joia", nullable = false)
    private Integer idJoia;
    @Column(name = "nu_Item")
    private int nuItem;
    @Column(name = "nu_Lote")
    private int nuLote;
    @Column(name = "nu_Peso")
    private int nuPeso;
    @Column(name = "nu_Valor")
    private int nuValor;
    @Column(name="ds_Descricao", nullable = false)
    private String dsDescricao;
    @Column(name="ds_Observacao", nullable = false)
    private String dsObservacao;
    
    @Column(name = "id_TipoObjeto", nullable = false)
    private Integer nuTipoObjeto;
    
//    @ManyToOne(optional = false)
//    @ForeignKey(name = "FK_Joia_TipoObjeto")
//    @JoinColumn(name = "id_Joia", referencedColumnName="id_Joia")
//    private Joia joia;

    
    
    
    public Joia(){
    }
    
    
//    
//    public Joia getJoia() {
//        return joia;
//    }
//
//    public void setJoia(Joia joia) {
//        this.joia = joia;
//    }
//    
//    
//    

    public Integer getNuTipoObjeto() {
        return nuTipoObjeto;
    }

    public void setNuTipoObjeto(Integer nuTipoObjeto) {
        this.nuTipoObjeto = nuTipoObjeto;
    }
    
    
    
    
    public Integer getIdJoia() {
        return idJoia;
    }

    public void setIdJoia(Integer idJoia) {
        this.idJoia = idJoia;
    }

    public Integer getNuLote() {
        return nuLote;
    }

    public void setNuLote(Integer nuLote) {
        this.nuLote = nuLote;
    }

    public Integer getNuItem() {
        return nuItem;
    }

    public void setNuItem(Integer nuItem) {
        this.nuItem = nuItem;
    }

    public Integer getNuPeso() {
        return nuPeso;
    }

    public void setNuPeso(Integer nuPeso) {
        this.nuPeso = nuPeso;
    }

    public Integer getNuValor() {
        return nuValor;
    }

    public void setNuValor(Integer nuValor) {
        this.nuValor = nuValor;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idJoia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joia other = (Joia) obj;
        if (!Objects.equals(this.idJoia, other.idJoia)) {
            return false;
        }
        return true;
    }


    
}
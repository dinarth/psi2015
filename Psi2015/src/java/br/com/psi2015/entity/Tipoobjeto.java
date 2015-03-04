/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.psi2015.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dinarth
 */
@Entity
@Table(name = "tipoobjeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoobjeto.findAll", query = "SELECT t FROM Tipoobjeto t"),
    @NamedQuery(name = "Tipoobjeto.findByIdTipoObjeto", query = "SELECT t FROM Tipoobjeto t WHERE t.idTipoObjeto = :idTipoObjeto"),
    @NamedQuery(name = "Tipoobjeto.findByDsTipo", query = "SELECT t FROM Tipoobjeto t WHERE t.dsTipo = :dsTipo")})
public class Tipoobjeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_TipoObjeto")
    private Integer idTipoObjeto;
    @Size(max = 255)
    @Column(name = "ds_Tipo")
    private String dsTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoObjeto")
    private Collection<Joia> joiaCollection;

    public Tipoobjeto() {
    }

    public Tipoobjeto(Integer idTipoObjeto) {
        this.idTipoObjeto = idTipoObjeto;
    }

    public Integer getIdTipoObjeto() {
        return idTipoObjeto;
    }

    public void setIdTipoObjeto(Integer idTipoObjeto) {
        this.idTipoObjeto = idTipoObjeto;
    }

    public String getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
    }

    @XmlTransient
    public Collection<Joia> getJoiaCollection() {
        return joiaCollection;
    }

    public void setJoiaCollection(Collection<Joia> joiaCollection) {
        this.joiaCollection = joiaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoObjeto != null ? idTipoObjeto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoobjeto)) {
            return false;
        }
        Tipoobjeto other = (Tipoobjeto) object;
        if ((this.idTipoObjeto == null && other.idTipoObjeto != null) || (this.idTipoObjeto != null && !this.idTipoObjeto.equals(other.idTipoObjeto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cadastro.entity.Tipoobjeto[ idTipoObjeto=" + idTipoObjeto + " ]";
    }
    
}

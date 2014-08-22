/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ESTACION 5
 */
@Entity
@Table(name = "PERSONITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personita.findAll", query = "SELECT p FROM Personita p"),
    @NamedQuery(name = "Personita.findById", query = "SELECT p FROM Personita p WHERE p.id = :id"),
    @NamedQuery(name = "Personita.findByNombre", query = "SELECT p FROM Personita p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personita.findByTelefono", query = "SELECT p FROM Personita p WHERE p.telefono = :telefono")})
@Entity
@Table(name = "PERSONITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personita.findAll", query = "SELECT p FROM Personita p"),
    @NamedQuery(name = "Personita.findById", query = "SELECT p FROM Personita p WHERE p.id = :id"),
    @NamedQuery(name = "Personita.findByNombre", query = "SELECT p FROM Personita p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personita.findByTelefono", query = "SELECT p FROM Personita p WHERE p.telefono = :telefono")})
public class Personita implements Serializable, Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TELEFONO")
    private Integer telefono;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TELEFONO")
    private Integer telefono;

    public Personita() {
    }

    public Personita(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personita)) {
            return false;
        }
        Personita other = (Personita) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Personita[ id=" + id + " ]";
    }

    public Personita(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personita)) {
            return false;
        }
        Personita other = (Personita) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Personita[ id=" + id + " ]";
    }
    
}

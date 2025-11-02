/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlunadm;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author kibal
 */
@Entity
@Table(name = "alumnos", catalog = "registroskinderrosita", schema = "")
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a"),
    @NamedQuery(name = "Alumnos.findByIdalumnos", query = "SELECT a FROM Alumnos a WHERE a.idalumnos = :idalumnos"),
    @NamedQuery(name = "Alumnos.findByNombre", query = "SELECT a FROM Alumnos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumnos.findByEdad", query = "SELECT a FROM Alumnos a WHERE a.edad = :edad"),
    @NamedQuery(name = "Alumnos.findByPapa", query = "SELECT a FROM Alumnos a WHERE a.papa = :papa"),
    @NamedQuery(name = "Alumnos.findByMama", query = "SELECT a FROM Alumnos a WHERE a.mama = :mama"),
    @NamedQuery(name = "Alumnos.findByTelefono", query = "SELECT a FROM Alumnos a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Alumnos.findByGrado", query = "SELECT a FROM Alumnos a WHERE a.grado = :grado"),
    @NamedQuery(name = "Alumnos.findByGrupo", query = "SELECT a FROM Alumnos a WHERE a.grupo = :grupo")})
public class Alumnos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idalumnos")
    private Integer idalumnos;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @Column(name = "papa")
    private String papa;
    @Basic(optional = false)
    @Column(name = "mama")
    private String mama;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @Column(name = "grado")
    private int grado;
    @Basic(optional = false)
    @Column(name = "grupo")
    private String grupo;

    public Alumnos() {
    }

    public Alumnos(Integer idalumnos) {
        this.idalumnos = idalumnos;
    }

    public Alumnos(Integer idalumnos, String nombre, int edad, String papa, String mama, int telefono, int grado, String grupo) {
        this.idalumnos = idalumnos;
        this.nombre = nombre;
        this.edad = edad;
        this.papa = papa;
        this.mama = mama;
        this.telefono = telefono;
        this.grado = grado;
        this.grupo = grupo;
    }

    public Integer getIdalumnos() {
        return idalumnos;
    }

    public void setIdalumnos(Integer idalumnos) {
        Integer oldIdalumnos = this.idalumnos;
        this.idalumnos = idalumnos;
        changeSupport.firePropertyChange("idalumnos", oldIdalumnos, idalumnos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        int oldEdad = this.edad;
        this.edad = edad;
        changeSupport.firePropertyChange("edad", oldEdad, edad);
    }

    public String getPapa() {
        return papa;
    }

    public void setPapa(String papa) {
        String oldPapa = this.papa;
        this.papa = papa;
        changeSupport.firePropertyChange("papa", oldPapa, papa);
    }

    public String getMama() {
        return mama;
    }

    public void setMama(String mama) {
        String oldMama = this.mama;
        this.mama = mama;
        changeSupport.firePropertyChange("mama", oldMama, mama);
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        int oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        int oldGrado = this.grado;
        this.grado = grado;
        changeSupport.firePropertyChange("grado", oldGrado, grado);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        String oldGrupo = this.grupo;
        this.grupo = grupo;
        changeSupport.firePropertyChange("grupo", oldGrupo, grupo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalumnos != null ? idalumnos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.idalumnos == null && other.idalumnos != null) || (this.idalumnos != null && !this.idalumnos.equals(other.idalumnos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sqlunadm.Alumnos[ idalumnos=" + idalumnos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

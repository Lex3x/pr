package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Tatsiana on 11.06.17.
 */
@Entity
@Table(name = "ROLE")
public class Role implements Serializable {

    @Id
    @Column(name = "ID_ROLE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @NotNull
    @Column(name = "NAME_ROLE", length = 24, nullable = false)
    private String name;

    public Role() {
    }

    public Role(int idRole, String name) {
        this.idRole = idRole;
        this.name = name;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (idRole != role.idRole) return false;
        return name.equals(role.name);
    }

    @Override
    public int hashCode() {
        int result = idRole;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", name='" + name + '\'' +
                '}';
    }
}

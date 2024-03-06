<<<<<<< HEAD
package com.csys.template.config.jpa.audit;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

@Entity(name = "revision")
@RevisionEntity(AuditListener.class)
@SuppressWarnings({"IdDefinedInHierarchy", "ConsistentAccessType"})
public class Revision implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @RevisionNumber
    private int id;
    @RevisionTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "user_create", nullable = false)
    private String userCreate;

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Transient
    public Date getRevisionDate() {
        return timestamp;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Revision other = (Revision) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.timestamp != other.timestamp) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = id;
        //result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "DefaultRevisionEntity(id = " + id
                + ", revisionDate = " + DateFormat.getDateTimeInstance().format(getRevisionDate()) + ")";
    }

}
=======
package com.csys.template.config.jpa.audit;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

@Entity(name = "revision")
@RevisionEntity(AuditListener.class)
@SuppressWarnings({"IdDefinedInHierarchy", "ConsistentAccessType"})
public class Revision implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @RevisionNumber
    private int id;
    @RevisionTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "user_create", nullable = false)
    private String userCreate;

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Transient
    public Date getRevisionDate() {
        return timestamp;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Revision other = (Revision) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.timestamp != other.timestamp) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = id;
        //result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "DefaultRevisionEntity(id = " + id
                + ", revisionDate = " + DateFormat.getDateTimeInstance().format(getRevisionDate()) + ")";
    }

}
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

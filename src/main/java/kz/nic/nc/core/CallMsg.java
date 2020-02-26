package kz.nic.nc.core;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Entity
@Data
@Table(name = "call_msg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CallMsg.findAll", query = "SELECT c FROM CallMsg c"),
    @NamedQuery(name = "CallMsg.findById", query = "SELECT c FROM CallMsg c WHERE c.id = :id"),
    @NamedQuery(name = "CallMsg.findByType", query = "SELECT c FROM CallMsg c WHERE c.type = :type"),
    @NamedQuery(name = "CallMsg.findByCallerId", query = "SELECT c FROM CallMsg c WHERE c.callerId = :callerId"),
    @NamedQuery(name = "CallMsg.findByCallerIdName", query = "SELECT c FROM CallMsg c WHERE c.callerIdName = :callerIdName"),
    @NamedQuery(name = "CallMsg.findByConnectedLineName", query = "SELECT c FROM CallMsg c WHERE c.connectedLineName = :connectedLineName"),
    @NamedQuery(name = "CallMsg.findByConnectedLineNum", query = "SELECT c FROM CallMsg c WHERE c.connectedLineNum = :connectedLineNum"),
    @NamedQuery(name = "CallMsg.findByDone", query = "SELECT c FROM CallMsg c WHERE c.done = :done"),
    @NamedQuery(name = "CallMsg.findByCreated", query = "SELECT c FROM CallMsg c WHERE c.created = :created")})
public class CallMsg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "caller_id")
    private String callerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "caller_id_name")
    private String callerIdName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "connected_line_name")
    private String connectedLineName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "connected_line_num")
    private String connectedLineNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "done")
    private short done;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

   

}

package ma.emsi.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30 )
    private String nom ;
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    private boolean malade ;
    private int score ;
    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;

}

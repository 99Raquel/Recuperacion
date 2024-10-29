package upeu.entity;




import org.springframework.web.bind.annotation.CrossOrigin;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "plan_carrera")
@CrossOrigin(origins ="http://localhost:4200")
public class PlanCarrera {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "estado", length = 100)
	    private String estado;

	    @ManyToOne
	    @JoinColumn(name = "id_carrera", nullable = false)
	    private Carrera carrera;

	    @ManyToOne
	    @JoinColumn(name = "id_plan", nullable = false)
	    private Plan plan;
	}



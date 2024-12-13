package br.com.yuri.exemploidsw.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Estado {
  
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  @NotEmpty
  private String nome;
  
  @NotNull
  @NotEmpty
  @Column( unique = true )
  private String sigla;
}

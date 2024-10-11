package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Colum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneretedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "categorias")
public class Categoria{
    @Id
    @GeneratedValue(strategy = GenerationType)
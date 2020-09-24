package jp.ac.entities;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String team;
    private String position;
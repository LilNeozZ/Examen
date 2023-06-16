package Exo1;

public class Employee {
    private String prenom;
    private String nom;
    private int anneesExperience;
    private String niveau;

    /**
     * Constructeur de la classe Employee.
     * @param prenom Le prénom de l'employé.
     * @param nom Le nom de l'employé.
     * @param anneesExperience Le nombre d'années d'expérience de l'employé.
     * @param niveau Le niveau de l'employé.
     */
    public Employee(String prenom, String nom, int anneesExperience, String niveau) {
        this.prenom = prenom;
        this.nom = nom;
        this.anneesExperience = anneesExperience;
        this.niveau = niveau;
    }

    /**
     * Retourne le prénom de l'employé.
     * @return Le prénom de l'employé.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prénom de l'employé.
     * @param prenom Le nouveau prénom de l'employé.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne le nom de l'employé.
     * @return Le nom de l'employé.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'employé.
     * @param nom Le nouveau nom de l'employé.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nombre d'années d'expérience de l'employé.
     * @return Le nombre d'années d'expérience de l'employé.
     */
    public int getAnneesExperience() {
        return anneesExperience;
    }

    /**
     * Modifie le nombre d'années d'expérience de l'employé.
     * @param anneesExperience Le nouveau nombre d'années d'expérience de l'employé.
     */
    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    /**
     * Retourne le niveau de l'employé.
     * @return Le niveau de l'employé.
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Modifie le niveau de l'employé.
     * @param niveau Le nouveau niveau de l'employé.
     */
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}

package Exo1;

public class EmployeeManager {
    /**
     * Calcule le salaire d'un employé en fonction de son niveau et de son ancienneté.
     * @param employee L'employé pour lequel on souhaite calculer le salaire.
     * @return Le salaire calculé.
     * @throws IllegalArgumentException si le niveau de l'employé est invalide.
     */
    public int calculateSalary(Employee employee) {
        int salaireBase;
        switch (employee.getNiveau()) {
            case "Junior":
                salaireBase = 20000;
                break;
            case "Intermédiaire":
                salaireBase = 40000;
                break;
            case "Senior":
                salaireBase = 60000;
                break;
            default:
                throw new IllegalArgumentException("Niveau d'employé invalide : " + employee.getNiveau());
        }

        double coefficientAnciennete = calculateExperienceMultiplier(employee.getAnneesExperience());
        return (int) (salaireBase * coefficientAnciennete);
    }

    /**
     * Calcule le coefficient d'ancienneté en fonction des années d'expérience.
     * Le coefficient d'ancienneté augmente de 5% par année d'expérience.
     * @param anneesExperience Le nombre d'années d'expérience de l'employé.
     * @return Le coefficient d'ancienneté calculé.
     */
    private double calculateExperienceMultiplier(int anneesExperience) {
        return 1 + (0.05 * anneesExperience);
    }
}

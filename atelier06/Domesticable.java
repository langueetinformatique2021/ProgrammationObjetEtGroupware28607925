/** Gestion de l'état de domestication d'un animal */
public interface Domesticable {

    /** Domestiquer un animal et lui donner un nom
     * @param nom nom de l'animal */
    void domestiquer(String nom);

    /** Rend le nom de l'animal
     * @return nom de l'animal */
    String nom();
}







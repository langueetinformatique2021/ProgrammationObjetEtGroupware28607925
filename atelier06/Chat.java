package atelier06;

public class Chat extends Felin implements Domesticable {
    private String nomChat;

    /** Le constructeur de Chat fait appel au constructeur de la sur-classe Felin */
    public Chat(String nom) {
        super("Chat");
        this.nomChat = nom;
    }

    /** Présentation des caractéristiques du chat */
    @Override
    public void domestiquer(String nom) {
        this.nomChat = nom;
        System.out.println("Le chat a été domestiqué et s'appelle " + nom);
    }

    /** Retourne le nom du chat */
    @Override
    public String nom() {
        return this.nomChat;
    }

    /** Cri du chat */
    @Override
    public void crie() {
        System.out.println("Miaou");
    }
}


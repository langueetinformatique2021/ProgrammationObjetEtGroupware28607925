package atelier06;

public class TestChat {
    public static void main(String[] args) {
        // Créer une instance de Chat
        Chat monChat = new Chat("Whiskers");

        // Domestiquer le chat et lui donner un nom
        monChat.domestiquer("Rider");

        // Afficher le nom du chat
        System.out.println("Le nom du chat est : " + monChat.nom());

        // Appeler la méthode crie() pour tester le cri du chat
        monChat.crie();  // Cela devrait afficher "Miaou"
    }
}

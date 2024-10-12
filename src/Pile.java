import java.util.Arrays;



public class Pile {
    private final static int taille = 10;
    private Object[] table;
    private int pos;


    public Pile() {
        this.table = new Object[taille];
        this.pos = 0;
    }


    public Pile(Object[] table) throws PileException {
        if (table.length > taille) {
            throw new PileException("Le tableau dépasse la taille maximale de la pile.");
        }
        this.table = new Object[taille];
        System.arraycopy(table, 0, this.table, 0, table.length);
        this.pos = table.length;
    }


    public void push(Object item) throws PileException {
        if (this.pos == taille) {
            throw new PileException("Pile est pleine");
        } else {
            this.table[pos++] = item;
        }
    }


    public Object pop() throws PileException { // Modifié pour retourner l'élément
        if (this.pos == 0) {
            throw new PileException("Pile vide");
        } else {
            return this.table[--pos]; // Retourne l'élément dépilé
        }
    }


    @Override
    public String toString() {
        return "pos: " + this.pos + "\nTable: " + Arrays.toString(Arrays.copyOf(this.table, this.pos));
    }

    public static void main(String[] args) {

        try {
            Pile P = new Pile();
            P.push(6);
            P.push(7);
            System.out.println(P);
            System.out.println("Élément dépilé : " + P.pop()); // Affiche l'élément dépilé
            System.out.println(P);
        } catch (PileException e) {
            System.err.println(e.getMessage());
        }

    }
}

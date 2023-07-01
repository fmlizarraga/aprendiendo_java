package zoologico;

public class Reptil extends Animal {

    private boolean escamas;
    private boolean carnivoro;

    public Reptil(boolean escamas, boolean carnivoro) {
        super();
        this.escamas = escamas;
        this.carnivoro = carnivoro;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Reptil{" + "escamas=" + escamas + ", carnivoro=" + carnivoro + '}';
    }
    
}

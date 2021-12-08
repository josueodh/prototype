public class Nps implements Cloneable{

    private int nps;

    public Nps(int nps){
        super();
        this.nps = nps;
    }

    public int getNps() {
        return nps;
    }

    public void setNps(int nps) {
        this.nps = nps;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Nps: " + nps;
    }
}

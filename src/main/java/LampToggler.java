public class LampToggler {
    private String name;
    private boolean ts = false;


    public LampToggler(String name, boolean ts){
        this.name = name;
        this.ts = ts;
    }


    public boolean isTs(){
        return ts;
    }

    public boolean switchTs(){
        ts = !ts;
        return ts;
    }

    public String getName(){
        return name;
    }

    public String translate(boolean ts) {
        return ts ? "Tændt" : "Slukket";
    }


    public String toString() {
        return name + " "+ translate(ts);
    }
}

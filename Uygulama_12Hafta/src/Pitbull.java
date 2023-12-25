public class Pitbull extends Dog implements Voice, Movement{
    public Pitbull(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println(name + " ran.");
    }

    @Override
    public void makeVoice() {
        System.out.println(name + " made sound.");
    }
}

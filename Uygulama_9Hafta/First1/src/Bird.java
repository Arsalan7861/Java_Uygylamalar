//Bird sinifi.
public class Bird extends Animal{
    private String featherColor;

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    @Override
    public void makesound() {
        System.out.println("cirik cirik.");
    }
}

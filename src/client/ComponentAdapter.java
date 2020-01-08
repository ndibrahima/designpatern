package client;

public class ComponentAdapter implements Component {

    private NoNativeComponent component;

    public ComponentAdapter(NoNativeComponent component) {
        this.component = component;
    }

    @Override
    public void goodMethod() {
        System.out.println("Adapte to bad Component...");
        this.component.badMethod();
    }

}

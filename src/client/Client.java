package client;

import adapter.*;


public class Client {

    public static void main(String[] args) {
        // Without (need) Adapter.
        Component component = new NativeComponent();
        component.goodMethod();

        // With Adapter.
        NoNativeComponent noCompatible = new NoNativeComponent();
        component = new ComponentAdapter(noCompatible);
        component.goodMethod();
    }

}

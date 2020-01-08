package phone;

public  class IphoneCharger implements ChargerLightningConnector {

	public void load(AdapterAndroid adapterAndroid) {
		
		System.out.println("Charge depuis un chargeur d'iphone");

	}

	@Override
	public void load(IphonePhone iphone) {
		// TODO Auto-generated method stub
		
	}
}

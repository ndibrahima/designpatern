package phone;

public class AdapterDemo {

	public static void main(String[] args) {

        //iphone system
		
		XsIphonePhone iphone = new XsIphonePhone();
		IphoneCharger chargerIphone = new IphoneCharger();
		chargerIphone.load(iphone);
		
		//android system
		
		SamsungAndroidPhone android = new SamsungAndroidPhone();
		AndroidCharger chargerAndroid = new  AndroidCharger();
		chargerAndroid.load(android);
		
		//cross test
		
		AdapterAndroid adapterAndroid =  new AdapterAndroid(android);
		chargerIphone.load(adapterAndroid);
		
		AdapterIphone adapterIphone = new AdapterIphone(iphone);
		chargerAndroid.load(adapterIphone);
		
		xiaomoAndroidPhone xiaomi = new xiaomoAndroidPhone();
		chargerAndroid.load(xiaomi);
		
		AdapterAndroid adapterAndroidXiaomi =  new AdapterAndroid(xiaomi);
		chargerIphone.load(adapterAndroidXiaomi);
		
	}

}

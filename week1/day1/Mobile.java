package week1.day1;

public class Mobile {
	public void sentsms() {
		System.out.println("HAPPY DAY");	
		}
		protected void AllowVoiceCall() {
			System.out.println("hello");
			}
		private void takeVideo() {
			System.out.println("take video");
		}
		public static void main(String[] args) {
			Mobile objmob=new Mobile();
			objmob.sentsms();
			objmob.takeVideo();
			objmob.AllowVoiceCall();
		}
}

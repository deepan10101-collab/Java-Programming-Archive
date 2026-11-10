package unit3;
	public class car2{
		private double speed;
		private String make , model;
		
		public car2() {
			speed = 0; 
			make = "";
			model = "";
		}
		public car2(String make , String model , double speed) {
			this.make = make;
			this.speed = speed;
			this.model = model;
			
		}
		
		public String getmake() {
			return make;
		}
		public String getmodel() {
			return model;
		}
		public double getspeed() {
			return speed;
		}
		public void setmake(String make) {
			this.make = make;
		}
		public void setmodel(String model) {
			this.model = model;
		}
		public void setspeed(double speed) {
			this.speed = speed;
		}
		public void accelerate() {
			speed += 5;
			System.out.println(speed);
		}
		public void brake() {
			speed -= 5;
			System.out.println(speed);
		}
		
		public static void main(String[] args) {
			car2 one = new car2("fhjfc" , "ehfbrf" , 56.00);
			one.getmake();
			one.getmodel();
			one.getspeed();
			one.setmake("hjdbw");
			one.setmodel("jedbkcfb");
			one.setspeed(65.00);
			one.accelerate();
			one.brake();
		}
		
	}




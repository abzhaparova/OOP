package lab2;

public class Time {
	public int hour;
	public int minute;
	public int second;
	
	public Time(int hour, int minute, int second) {
		
		this.hour = hour%24;
		this.minute = minute % 60;
		this.second = second % 60;
	}	
	
	public String toUniversal() {
		return (this.hour + ":" + this.minute + ":" + this.second);
	}
	
	public String toStandard() {
		String hour2;
		String s;
		
		if(this.hour==0) {
			hour2 = "12";
			s= "PM";
		}else if
			(this.hour>=1 && this.hour<=12) {
			hour2 = this.hour+"";
			s="AM";
		}else{
			hour2=this.hour %12+"";
			s="PM";
			}
		return hour2+":"+this.minute+":"+this.second+" "+s;
	}

	public void add(Time t2){
		int res = this.hour *3600 + this.minute * 60 + this.second + t2.hour *3600 + t2.minute * 60 + t2.second ;
		res = res % 86400;
		this.hour = res / 3600;
		this.minute = (res % 3600)/60;
		this.second = res % 60;
	}
	
	public static void main(String args[]) {
		Time t = new Time(23,05,06);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		Time t2 = new Time(4,58,33);
		t.add(t2);
		System.out.println(t.toStandard());
        System.out.println(t.toUniversal());
}
	
}
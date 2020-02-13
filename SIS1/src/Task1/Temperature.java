package Task1;
public class Temperature {
	
		private double temperatureValue;
		private char temperatureScale;
	
		
		public Temperature(double temperatureValue,char temperatureScale) {
			this.temperatureValue = temperatureValue;
			this.temperatureScale = temperatureScale;
		}
		
		public Temperature(double temperatureValue) {
			this.temperatureValue = temperatureValue;
		}
		
		public Temperature(char temperatureScale) {
			this.temperatureScale = temperatureScale;
		}
		
	    public Temperature( ) {
		}
	    
	    public String toCelcius(){	
	    	if (this.temperatureScale == 'F' || this.temperatureScale == ' ') {
		    	double degreesC = (5*(temperatureValue-32)/9);
		    	return degreesC + "C";
	    	}
	    	return this.temperatureValue + "C";
	    }
	    
	    public String toFahrenheit(){
	    	if (this.temperatureScale == 'C' || this.temperatureScale == ' ') {
	    	double degreesF = (9*(temperatureValue/5)+32);
	    	return degreesF + "F";
	    	}
	    	return this.temperatureValue + "F";
	    }
	    
	   public double getTemperatureValue() {
	    	return this.temperatureValue;
	    }
	    
	    public char getTemperatureScale() {
	    	return this.temperatureScale;
	    }
	    
	    public void setTemperatureValue(double newValue) {
	    	this.temperatureValue = newValue;
	    }
	    
	    public void setTemperatureScale(char newScale) {
	    	this.temperatureScale = newScale;
	    }
	    
	    public void setTemperatureValueScale(double newValue, char newScale) {
	    	this.temperatureValue = newValue;
	    	this.temperatureScale = newScale;
	    }
	    
	    public char temperatureScale(){
	    	return temperatureScale;
	    } 
	     
	}


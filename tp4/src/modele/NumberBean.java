package modele;

public class NumberBean {
	  public NumberBean(int min, int max, int randomNum) {
		super();
		this.min = min;
		this.max = max;
		this.randomNum = randomNum;
	}
	  public NumberBean() {
			
		}

	private int min;
	    private int max;
	    private int randomNum;

	    public int getMin() {
			return min;
		}

		public int getMax() {
			return max;
		}

		public void setMin(int min) {
	        this.min = min;
	    }

	    public void setMax(int max) {
	        this.max = max;
	    }

	    public int getRandomNum() {
	        randomNum = (int) (Math.random() * (max - min + 1)) + min;
	        return randomNum;
	    }
	}
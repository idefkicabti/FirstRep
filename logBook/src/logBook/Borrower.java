package logBook;

public class Borrower {
	private String date;
	private String time;
	private String item;
	private String  quantity;
	private String gradeLevel;
	private String section;
	private String name;

	public Borrower(String date, String time, String item, String quantity, String gradeLevel, String section, String name) {
		this.date = date;
		this.time = time;
		this.item = item;
		this.quantity = quantity;
		this.gradeLevel = gradeLevel;
		this.section = section;
		this.name = name;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Borrower [date: " + date + ", time: " + time + ", item: " + item + ", quantity: " + quantity
		                  + ", gradeLevel: " + gradeLevel + ", section: " + section + ", name: " + name + "]";
	}
}

package elementos;

public class Inproceedings extends Entry {
	private String author, title, booktitle, year, editor, volume, number, series, pages, address, month, organization, publisher, note, key;

	public Inproceedings() {
		super();
	}
	
	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
			aRetornar = true;
			break;
		case "booktitle":
			setBooktitle(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
			aRetornar = true;
			break;
		case "editor":
			setEditor(value);
			aRetornar = true;
			break;
		case "volume":
			setVolume(value);
			aRetornar = true;
			break;
		case "number":
			setNumber(value);
			aRetornar = true;
			break;
		case "series":
			setSeries(value);
			aRetornar = true;
			break;
		case "pages":
			setPages(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "organization":
			setOrganization(value);
			aRetornar = true;
			break;
		case "publisher":
			setPublisher(value);
			aRetornar = true;
			break;
		case "note":
			setNote(value);
			aRetornar = true;
			break;
		case "key":
			setKey(value);
			aRetornar = true;
			break;
		default: break;
		}
		return aRetornar;
	}
	

	public void setAuthor(String author) {
		this.author = author;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public void setSeries(String series) {
		this.series = series;
	}


	public void setPages(String pages) {
		this.pages = pages;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public void setKey(String key) {
		this.key = key;
	}

	public String isValid() {
		String aRetornar = "";
		if (author == null) aRetornar+= "author-";
		if (title == null) aRetornar+= "title-";
		if (booktitle == null) aRetornar+= "booktitle-";
		if (year == null) aRetornar+= "year-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	public String toString(){
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nBooktitle: " + booktitle;
		result += "\nYear: " + year;
		if (editor != null) result += "Editor: " + editor;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number;
		if (series != null) result += "\nSeries: " + series;
		if (pages != null) result += "\nPages: " + pages;
		if (address != null) result += "\nAddress: " + address;
		if (month != null) result += "\nMonth: " + month;
		if (organization != null) result += "\nOrganization: " + organization;
		if (publisher != null) result += "\nPublisher: " + publisher;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

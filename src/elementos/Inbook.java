package elementos;

public class Inbook extends Entry {
	private String author;
	private String editor;
	private String title;
	private String chapter;
	private String pages;
	private String publisher;
	private String year;
	private String volume;
	private String number;
	private String series;
	private String type;
	private String address;
	private String edition;
	private String month;
	private String note;
	private String key;
	
	public Inbook(){
		super();
	}
	
	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "editor":
			setEditor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
			aRetornar = true;
			break;
		case "chapter":
			setChapter(value);
			aRetornar = true;
			break;
		case "pages":
			setPages(value);
			aRetornar = true;
			break;
		case "publisher":
			setPublisher(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
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
		case "type":
			setType(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "edition":
			setEdition(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
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


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setChapter(String chapter) {
		this.chapter = chapter;
	}


	public void setPages(String pages) {
		this.pages = pages;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public void setYear(String year) {
		this.year = year;
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


	public void setType(String type) {
		this.type = type;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public void setKey(String key) {
		this.key = key;
	}
	
	public String isValid() {
		String aRetornar = "";
		if (author == null && editor == null) aRetornar = "author-";
		if (title == null) aRetornar = "title-";
		if (chapter == null && pages == null) aRetornar = "chapter|pages-";
		if (publisher == null) aRetornar = "publisher-";
		if (year == null) aRetornar = "year-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}


	public String toString(){
		String result = "";
		
		if (author != null) result += "Author: " + author;
		if (editor != null) result += "Editor: " + editor; //ou só else
		result += "\nTitle: " + title;
		if (chapter != null) result += "\nChapter: " + chapter;
		if (pages != null) result += "\nPages: " + pages; //ou só else
		result += "\nPublisher: " + publisher;
		result += "\nYear: " + year;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number; //ou só else
		if (series != null) result += "\nSeries: " + series;
		if (type != null) result += "\nType: " + type;
		if (address != null) result += "\nAddress: " + address;
		if (edition != null) result += "\nEdition: " + edition;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
	
	
	
}

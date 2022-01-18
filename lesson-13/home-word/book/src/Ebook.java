import model.Book;

public class Ebook extends Book {
    private int publishingYear;
    private double size;
    private String img;
    private int download;

    public Ebook(int id, String title, String[] category, String company, int publishingYear, double size, String img, int download) {
        super(id, title, category, company);
        this.publishingYear = publishingYear;
        this.size = size;
        this.img = img;
        this.download = download;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + publishingYear + " - " + size + " - " + img + " - " + download;
    }
}

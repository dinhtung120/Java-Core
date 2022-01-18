import java.util.ArrayList;

public class EbookService {
    public ArrayList<Ebook> getEbook(){
        ArrayList<Ebook> ebooks = new ArrayList<>();

        ebooks.add(new Ebook(3,"Ebook", new String[]{"Kỳ ảo", "Tình cảm"},
                "Kim Đồng", 2010, 200,"Ảnh", 2000));

        return ebooks;
    }
}

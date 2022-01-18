package service;

import model.Schoolbook;

import java.util.ArrayList;

public class SchoolbookService {
    public ArrayList<Schoolbook> getSchoolBook(){
        ArrayList<Schoolbook> schoolbooks = new ArrayList<>();

        schoolbooks.add(new Schoolbook(1,"Sách giáo khoa",
                new String[]{"Tình cảm", "Kinh dị"},"Kim Đồng",
                1994,100,200,"Kim Đồng"));

        return schoolbooks;
    }
}

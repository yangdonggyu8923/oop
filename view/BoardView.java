package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main(String[] args) {
        List<BoardDto> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();
        BoardDto article = new BoardBuilder()
                .title(util.createdRandomTitle())
                .content(util.createdRandomContent())
                .writer(util.createdRandomName())
                .build();

        for(int i=0;i<5;i++) {
            articles.add(new BoardBuilder()
                    .title(util.createdRandomTitle())
                    .content(util.createdRandomContent())
                    .writer(util.createdRandomName())
                    .build());
        }


        for(BoardDto i : articles){
            System.out.println(i.toString());
        }

        articles.forEach(i->{
            System.out.println(i.toString());
        });

    }
}
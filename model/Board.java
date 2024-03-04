package model;

import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
    private int id;
    private String title;
    private String content;
    private String writer;

    @Builder(builderMethodName = "builder")
    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}

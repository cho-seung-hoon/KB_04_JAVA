package ch15.sec02.exam01;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private String subject;
    private String content;
    private String writer;
}

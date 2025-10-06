package org.ngl.com;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    public String messageContent;
    public LocalDateTime creationDateTime;
    public Boolean isConfidential;
    public User author;
}

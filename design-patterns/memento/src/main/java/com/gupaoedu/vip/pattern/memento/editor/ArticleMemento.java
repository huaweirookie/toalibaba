package com.gupaoedu.vip.pattern.memento.editor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Tom.
 */
@Data
@AllArgsConstructor
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;
}
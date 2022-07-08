package cn.tangue.templateenginee.model;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private Integer id;
    private String author;
    private String content;
    private String title;
    private Date createTime;
}

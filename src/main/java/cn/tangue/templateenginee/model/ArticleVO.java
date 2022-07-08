package cn.tangue.templateenginee.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class ArticleVO {
    private Long id;
    private String author;
    private String title;
    @NotEmpty(message = "文章内容不能为空的") //rg.hibernate.validator.constraints.NotEmpty
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}

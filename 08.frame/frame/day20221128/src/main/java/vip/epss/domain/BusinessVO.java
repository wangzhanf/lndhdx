package vip.epss.domain;

//Business的查询实体类

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BusinessVO extends Business{
    private String con;

}

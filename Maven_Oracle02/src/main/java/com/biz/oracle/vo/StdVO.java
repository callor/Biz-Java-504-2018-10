package com.biz.oracle.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//st_num CHAR(5) PRIMARY KEY,
//st_name nVARCHAR2(20) NOT NULL,
//st_grade CHAR(2),
//st_tel nVARCHAR2(20)

@Data 		// 전체
//@Getter 	// getter만
//@Setter 	// setter만
//@ToString 	// toString만

// 맴버변수 초기화 생성자를 만들고
// 기본생성자는 감춰버린다.
// @Builder 
@AllArgsConstructor // 맴버변수 생성자
@NoArgsConstructor	// 기본 super 생성자

public class StdVO {

    private String st_num;
    private String st_name;
    private String st_grade;
    private String st_tel;
    
}

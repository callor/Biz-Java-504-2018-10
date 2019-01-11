package com.biz.oracle.vo;

import com.sun.tracing.dtrace.ArgsAttributes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreSumVO {
	
	private String st_num;
	private int ss_kor;
	private int ss_eng;
	private int ss_math;
	private int ss_sci;
	private int ss_music;

}

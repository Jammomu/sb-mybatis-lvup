package kr.co.cofile.hdcdmybatis.domain;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Board implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	@NonNull
	private String title;
	
	@NonNull
	private String content;
	
	@NonNull
	private String writer;
	
	private LocalDateTime createTime;

}

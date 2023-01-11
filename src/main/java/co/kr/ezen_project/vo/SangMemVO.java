package co.kr.ezen_project.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class SangMemVO {
	@NonNull
	private int orderNum;
	@NonNull
	private String memId;
	@NonNull
	private int payNum;
	@NonNull
	private int sangSize;
	@NonNull
	private int sangColor;
	@NonNull
	private String sangCode;
	@NonNull
	private int sangCnt;
	private String ordDate;
	private int ordStat;
}

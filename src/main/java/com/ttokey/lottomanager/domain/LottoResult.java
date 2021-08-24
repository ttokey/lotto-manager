package com.ttokey.lottomanager.domain;

import com.ttokey.lottomanager.dto.LottoResultDto;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@Builder
public class LottoResult {
    @Id
    private String id;
    private int drawRound;
    private String drawDate;

    private long totalSellAmount;
    private long totalFirstWinningsAmount;
    private long firstWinnerCount;
    private long firstWinningsAmount;

    private int drawNumber1;
    private int drawNumber2;
    private int drawNumber3;
    private int drawNumber4;
    private int drawNumber5;
    private int drawNumber6;
    private int bonusNumber;

    public LottoResultDto toLottoResultDto() {
        return LottoResultDto.builder()
                .id(this.id)
                .drawRound(this.drawRound)
                .drawDate(this.drawDate)
                .totalSellAmount(this.totalSellAmount)
                .firstWinningsAmount(this.firstWinningsAmount)
                .totalFirstWinningsAmount(this.totalFirstWinningsAmount)
                .firstWinnerCount(this.firstWinnerCount)
                .drawNumber1(this.drawNumber1)
                .drawNumber2(this.drawNumber2)
                .drawNumber3(this.drawNumber3)
                .drawNumber4(this.drawNumber4)
                .drawNumber5(this.drawNumber5)
                .drawNumber6(this.drawNumber6)
                .bonusNumber(this.bonusNumber)
                .build();
    }
}

package com.ttokey.lottomanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ttokey.lottomanager.domain.LottoResult;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@Builder
public class LottoResultDto {
    @Id
    private String id;
    @JsonProperty("drwNo")
    private int drawRound;
    @JsonProperty("drwNoDate")
    private String drawDate;

    @JsonProperty("totSellamnt")
    private long totalSellAmount;
    @JsonProperty("firstAccumamnt")
    private long totalFirstWinningsAmount;
    @JsonProperty("firstPrzwnerCo")
    private long firstWinnerCount;
    @JsonProperty("firstWinamnt")
    private long firstWinningsAmount;

    @JsonProperty("drwtNo1")
    private int drawNumber1;
    @JsonProperty("drwtNo2")
    private int drawNumber2;
    @JsonProperty("drwtNo3")
    private int drawNumber3;
    @JsonProperty("drwtNo4")
    private int drawNumber4;
    @JsonProperty("drwtNo5")
    private int drawNumber5;
    @JsonProperty("drwtNo6")
    private int drawNumber6;
    @JsonProperty("bnusNo")
    private int bonusNumber;

    public LottoResult toLottoResult() {
        return LottoResult.builder()
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

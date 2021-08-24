package com.ttokey.lottomanager.service;

import com.ttokey.lottomanager.dto.LottoResultDto;
import com.ttokey.lottomanager.repository.LottoResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LottoResultService {
    private final LottoResultRepository lottoResultRepository;

    public LottoResultDto readByRound(int round) {
        return lottoResultRepository
                .findByDrawRound(round)
                .toLottoResultDto();
    }

    public LottoResultDto create(LottoResultDto lottoResultDto) {
        return lottoResultRepository
                .save(lottoResultDto.toLottoResult())
                .toLottoResultDto();
    }

    public LottoResultDto read(String id) {
        return lottoResultRepository
                .findById(id)
                .get()
                .toLottoResultDto();
    }

    public LottoResultDto update(String id, LottoResultDto lottoResultDto) {
        //TODO:: update 메소드 추가
        return lottoResultRepository
                .save(lottoResultDto.toLottoResult())
                .toLottoResultDto();
    }

    public void delete(String id) {
        lottoResultRepository.deleteById(id);
    }

}

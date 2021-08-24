package com.ttokey.lottomanager.controller;

import com.ttokey.lottomanager.dto.LottoResultDto;
import com.ttokey.lottomanager.service.LottoResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/lottoResult")
public class LottoResultController {
    private final LottoResultService lottoResultService;

    @GetMapping("round/{round}")
    public LottoResultDto getByRound(@PathVariable int round) {
        return lottoResultService.readByRound(round);
    }

    @GetMapping("{id}")
    public LottoResultDto get(@PathVariable String id) {
        return lottoResultService.read(id);
    }

    @PostMapping()
    public LottoResultDto create(@RequestBody LottoResultDto lottoResultDto) {
        return lottoResultService.create(lottoResultDto);
    }

    @PutMapping("{id}")
    public LottoResultDto update(@PathVariable String id, @RequestBody LottoResultDto lottoResultDto) {
        return lottoResultService.update(id, lottoResultDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id, @RequestBody LottoResultDto lottoResultDto) {
        lottoResultService.delete(id);
    }
}

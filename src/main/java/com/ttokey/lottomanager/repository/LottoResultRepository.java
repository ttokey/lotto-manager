package com.ttokey.lottomanager.repository;

import com.ttokey.lottomanager.domain.LottoResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LottoResultRepository extends MongoRepository<LottoResult, String> {
    public LottoResult findByDrawRound(int round);

    public void deleteById(String id);
}

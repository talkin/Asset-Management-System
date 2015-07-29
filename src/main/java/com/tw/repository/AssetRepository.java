package com.tw.repository;

import com.tw.domain.Asset;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AssetRepository extends Repository<Asset, Long>
{
    List<Asset> findAll();
}

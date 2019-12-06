package com.toshiba.springmvc.dao;

import com.toshiba.springmvc.model.Asset;

import java.util.List;
import java.util.Optional;

public interface AssetDAO {

    Asset saveAsset(Asset asset);

    void updateAsset(long assetId, Asset asset);

    void deleteAsset(long assetId);

    List<Asset> listAll();

    Asset findByAssetId(long assetId);
}
package com.toshiba.springmvc.service;

import com.toshiba.springmvc.model.Asset;

import java.util.List;

public interface AssetService {

    Asset saveAsset(Asset asset);

    void updateAsset(long assetId, Asset asset);

    void deleteAsset(long assetId);

    List<Asset> listAll();

    Asset findByAssetId(long assetId);
}
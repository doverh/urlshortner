package com.shortenurl.ShortenUrl.service;

public interface IUrlStoreService {
    String findUrlById(String id);

    void storeUrl(String id, String url);
}
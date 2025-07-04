/*
 * Copyright 2025 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.isaacandrade.urlshortenerservice.urlshort.infra.DB;

import com.isaacandrade.common.url.model.UrlMapping;
import com.isaacandrade.common.url.repository.UrlRepository;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

/** * DbCacheSaver is responsible for saving URL mappings to the database and updating the cache.
 * It uses a UrlRepository to persist the mappings and a CacheManager to manage the cache.
 *
 * @author Isaac Andrade
 */
@Component
public class DbCacheSaver {
    private final UrlRepository urlRepository;
    private final CacheManager cacheManager;

    public DbCacheSaver(UrlRepository urlRepository, CacheManager cacheManager) {
        this.urlRepository = urlRepository;
        this.cacheManager = cacheManager;
    }

    public void saveUrlMapping(UrlMapping urlMapping) {
        urlRepository.save(urlMapping);
        cacheManager.getCache("keys").put(urlMapping.getShortKey(), urlMapping);
    }
}

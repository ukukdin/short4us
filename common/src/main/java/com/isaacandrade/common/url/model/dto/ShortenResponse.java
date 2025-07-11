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
package com.isaacandrade.common.url.model.dto;

import java.io.Serializable;

/**
 * Represents a response containing a shortened URL.
 * This record encapsulates the short URL generated from a long URL.
 *
 * @param shortUrl The shortened URL as a string.
 * @author Isaac Andrade
 */
public record ShortenResponse(String shortUrl) implements Serializable {
}

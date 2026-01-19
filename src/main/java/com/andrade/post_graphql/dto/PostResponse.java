package com.andrade.post_graphql.dto;

import java.time.LocalDateTime;
import java.util.List;

public record PostResponse (String title, String content, LocalDateTime createdAt, List Coment) {

}

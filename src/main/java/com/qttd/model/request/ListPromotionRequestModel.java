package com.qttd.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListPromotionRequestModel {
    private List<PromotionRequestModel> data;
}
